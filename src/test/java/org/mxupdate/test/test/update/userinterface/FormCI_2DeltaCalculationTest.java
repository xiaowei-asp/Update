/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.test.test.update.userinterface;

import matrix.util.MatrixException;

import org.mxupdate.test.AbstractTest;
import org.mxupdate.test.data.userinterface.FormData;
import org.mxupdate.test.test.update.AbstractDeltaCalculationTest;
import org.mxupdate.update.userinterface.Form_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests the {@link Form_mxJPO form CI} delta calculator.
 *
 * @author The MxUpdate Team
 */
@Test()
public class FormCI_2DeltaCalculationTest
    extends AbstractDeltaCalculationTest<Form_mxJPO,FormData>
{
    @Override()
    @DataProvider(name = "data")
    public Object[][] getData()
    {
        return new Object[][] {
            {"1a) symbolic name",
                new FormData(this, "Test"),
                new FormData(this, "Test").setValue("symbolicname", "expression_123")},

            {"1b) two symbolic name",
                new FormData(this, "Test"),
                new FormData(this, "Test").setValue("symbolicname", "expression_123").setValue("symbolicname", "expression_345")},

            {"2) field add",
                new FormData(this, "Form1"),
                new FormData(this, "Form1")
                        .setValue("description", "\"\\\\ hello")
                        .newField("field")
                            .setValue("label", "an \"label\"")
                        .getFormTable() },

            {"3) two field add",
                new FormData(this, "Form1"),
                new FormData(this, "Form1")
                    .setValue("description", "\"\\\\ hello")
                        .newField("field")
                            .setValue("label", "an \"label\"")
                        .getFormTable()
                        .newField("field2")
                            .setValue("label", "an \"label\"")
                        .getFormTable() },

            {"4) field remove",
                new FormData(this, "Form1")
                    .setValue("description", "description")
                        .newField("field")
                            .setValue("label", "an \"label\"")
                        .getFormTable()
                        .newField("field2")
                            .setValue("label", "an \"label\"")
                        .getFormTable(),
                new FormData(this, "Form1")
                    .setValue("description", "description")},

            {"5) field insert",
               new FormData(this, "Form1")
                    .setValue("description", "description")
                        .newField("field")
                            .setValue("label", "an \"label\"")
                        .getFormTable()
                        .newField("field2")
                            .setValue("label", "an \"label\"")
                        .getFormTable(),
                new FormData(this, "Form1")
                    .setValue("description", "description")
                    .newField("field2")
                        .setValue("label", "an \"label\"")
                        .getFormTable() },

            {"6) field modify",
                new FormData(this, "Form1")
                        .setValue("description", "description")
                            .newField("field")
                                .setValue("label", "an \"label\"")
                            .getFormTable()
                            .newField("field2")
                                .setValue("label", "an \"label\"")
                            .getFormTable(),
                new FormData(this, "Form1")
                        .setValue("description", "description")
                        .newField("field")
                            .setValue("label", "an \"label\"")
                            .getFormTable()
                        .newField("field2")
                            .setValue("label", "an \"label\"")
                            .getFormTable()
                        .newField("field3")
                            .setValue("label", "an \"label\"")
                            .getFormTable() },
            };
    }

    @Override
    @BeforeMethod()
    @AfterClass(groups = "close" )
    public void cleanup()
        throws MatrixException
    {
        this.cleanup(AbstractTest.CI.UI_FORM);
    }

    @Override()
    protected Form_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                       final String _name)
    {
        return new Form_mxJPO(_paramCache.getMapping().getTypeDef(CI.UI_FORM.updateType), _name);
    }
}