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

package org.mxupdate.test.data.user;

import org.mxupdate.test.AbstractTest;

/**
 * The class is used to define all administration person (which have no related
 * person business object) objects used to create / update and to export.
 *
 * @author The MxUpdate Team
 */
public class PersonAdminData
    extends AbstractPersonAdminData<PersonAdminData>
{
    /**
     * Constructor to initialize this administration person.
     *
     * @param _test     related test implementation (where this administration
     *                  person is defined)
     * @param _name     name of the administration person
     */
    public PersonAdminData(final AbstractTest _test,
                           final String _name)
    {
        super(_test, AbstractTest.CI.USR_PERSONADMIN, _name);
    }
}
