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

package org.mxupdate.test.test.update.datamodel;

import matrix.util.MatrixException;

import org.mxupdate.test.AbstractTest;
import org.mxupdate.test.data.datamodel.AttributeIntegerData;
import org.mxupdate.test.test.update.AbstractDeltaCalculationTest;
import org.mxupdate.update.datamodel.AttributeInteger_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests the {@link AttributeInteger_mxJPO integer attribute CI} delta
 * calculation.
 *
 * @author The MxUpdate Team
 */
@Test()
public class AttributeIntegerCI_2DeltaCalculationTest
    extends AbstractDeltaCalculationTest<AttributeInteger_mxJPO,AttributeIntegerData>
{
    @Override()
    @DataProvider(name = "data")
    public Object[][] getData()
    {
        return new Object[][] {
            {"1a) symbolic name",
                    new AttributeIntegerData(this, "Test"),
                    new AttributeIntegerData(this, "Test").setValue("symbolicname", "attribute_123")},
            {"1b) two symbolic name",
                    new AttributeIntegerData(this, "Test"),
                    new AttributeIntegerData(this, "Test").setValue("symbolicname", "attribute_123").setValue("symbolicname", "attribute_345")},
       };
    }

    @Override
    @BeforeMethod()
    @AfterClass(groups = "close" )
    public void cleanup()
        throws MatrixException
    {
        this.cleanup(AbstractTest.CI.DM_ATTRIBUTE_INTEGER);
    }

    @Override()
    protected AttributeInteger_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                                   final String _name)
    {
        return new AttributeInteger_mxJPO(_paramCache.getMapping().getTypeDef(CI.DM_ATTRIBUTE_INTEGER.updateType), _name);
    }
}
