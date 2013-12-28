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

import matrix.util.MatrixException;

import org.mxupdate.test.AbstractTest;
import org.mxupdate.test.ExportParser;

/**
 * The class is used to define all role objects used to create / update and
 * to export.
 *
 * @author The MxUpdate Team
 */
public class RoleData
    extends AbstractCollectionUserData<RoleData>
{
    /** Enumeration for the different role types. */
    public enum RoleType
    {
        /** Standard role. */
        ROLE,
        /** Project role. */
        PROJECT,
        /** Organizational role. */
        ORGANIZATION;
    }

    /** Type of the role. */
    private RoleType roleType;

    /**
     * Constructor to initialize this role.
     *
     * @param _test     related test implementation (where this role is
     *                  defined)
     * @param _name     name of the role
     */
    public RoleData(final AbstractTest _test,
                    final String _name)
    {
        super(_test, AbstractTest.CI.USR_ROLE, _name);
    }

    /**
     * Defines the new {@link #roleType role type}.
     *
     * @param _roleType     role type
     * @return this role data instance
     */
    public RoleData setRoleType(final RoleType _roleType)
    {
        this.roleType = _roleType;
        return this;
    }

    /**
     * {@inheritDoc}
     * Appends the {@link #roleType role type} to the CI file content.
     */
    @Override()
    protected void append4CIFileValues(final StringBuilder _cmd)
    {
        super.append4CIFileValues(_cmd);
        switch ((this.roleType == null) ? RoleData.RoleType.ROLE : this.roleType)  {
            case PROJECT:
                _cmd.append(" asaproject");
                break;
            case ORGANIZATION:
                _cmd.append(" asanorg");
                break;
            case ROLE:
            default:
                _cmd.append(" asarole");
                break;
        }
    }

    /**
     * {@inheritDoc}
     * Appends the {@link #roleType role type} to the create statement.
     *
     * @see #roleType
     */
    @Override()
    protected void append4Create(final StringBuilder _cmd)
        throws MatrixException
    {
        super.append4Create(_cmd);
        switch ((this.roleType == null) ? RoleData.RoleType.ROLE : this.roleType)  {
            case PROJECT:
                _cmd.append(" asaproject");
                break;
            case ORGANIZATION:
                _cmd.append(" asanorg");
                break;
            case ROLE:
            default:
                _cmd.append(" asarole");
                break;
        }
    }

    /**
     * {@inheritDoc}
     * Checks that the {@link #roleType role type} is correct defined.
     */
    @Override()
    public void checkExport(final ExportParser _exportParser)
        throws MatrixException
    {
        super.checkExport(_exportParser);

        switch ((this.roleType == null) ? RoleData.RoleType.ROLE : this.roleType)  {
            case PROJECT:
                this.checkValueExists(_exportParser, "role", "asarole", false);
                this.checkValueExists(_exportParser, "project", "asaproject", true);
                this.checkValueExists(_exportParser, "organization", "asanorg", false);
                break;
            case ORGANIZATION:
                this.checkValueExists(_exportParser, "role", "asarole", false);
                this.checkValueExists(_exportParser, "project", "asaproject", false);
                this.checkValueExists(_exportParser, "organization", "asanorg", true);
                break;
            default:
                this.checkValueExists(_exportParser, "role", "asarole", true);
                this.checkValueExists(_exportParser, "project", "asaproject", false);
                this.checkValueExists(_exportParser, "organization", "asanorg", false);
                break;
        }
    }
}
