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

package org.mxupdate.test.test.update.datamodel.ruleci;

import org.mxupdate.test.AbstractTest;
import org.mxupdate.test.data.datamodel.RuleData;
import org.mxupdate.test.test.update.AbstractDeltaCalculationTest;
import org.mxupdate.update.datamodel.Rule_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import matrix.util.MatrixException;

/**
 * Tests the {@link Rule_mxJPO rule CI} delta calculation.
 *
 * @author The MxUpdate Team
 */
@Test()
public class RuleCI_2DeltaCalculationTest
    extends AbstractDeltaCalculationTest<Rule_mxJPO,RuleData>
{
    @Override()
    @DataProvider(name = "data")
    public Object[][] getData()
    {
        return new Object[][] {
            {"1a) symbolic name",
                    new RuleData(this, "Test"),
                    new RuleData(this, "Test").setValue("symbolicname", "rule_123")},
            {"1b) two symbolic name",
                    new RuleData(this, "Test"),
                    new RuleData(this, "Test").setValue("symbolicname", "rule_123").setValue("symbolicname", "rule_345")},
            {"2) description",
                    new RuleData(this, "Test"),
                    new RuleData(this, "Test").setValue("description", "abc def")},
       };
    }

    @Override()
    @BeforeMethod()
    @AfterClass(groups = "close" )
    public void cleanup()
        throws MatrixException
    {
        this.cleanup(AbstractTest.CI.DM_RULE);
    }

    @Override
    protected Rule_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                       final String _name)
    {
        return new Rule_mxJPO(_name);
    }
}
