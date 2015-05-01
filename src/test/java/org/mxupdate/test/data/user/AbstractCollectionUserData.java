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
import org.mxupdate.test.data.util.DataList;
import org.testng.Assert;

/**
 * The class is used to define all collection user objects used to create /
 * update and to export.
 *
 * @author The MxUpdate Team
 * @param <DATA> class derived from abstract collection user
 */
public class AbstractCollectionUserData<DATA extends AbstractCollectionUserData<?>>
    extends AbstractUserData<DATA>
{
    /** Parent collection users to which this collection user is assigned. */
    private final DataList<DATA> parents = new DataList<DATA>("parent ", "parent ", false);


    /**
     * Constructor to initialize this collection user.
     *
     * @param _test         related test implementation (where this collection
     *                      user is defined)
     * @param _ci           related configuration type
     * @param _name         name of the collection user
     */
    public AbstractCollectionUserData(final AbstractTest _test,
                                      final AbstractTest.CI _ci,
                                      final String _name)
    {
        super(_test, _ci, _name);
    }

    /**
     * Assigns <code>_parent</code> to the list of
     * {@link #parents parent collection users}.
     *
     * @param _parent   parent collection user to assign
     * @return this collection user data instance
     * @see #parents
     */
    @SuppressWarnings("unchecked")
    public DATA assignParents(final DATA _parent)
    {
        this.parents.add(_parent);
        return (DATA) this;
    }

    @Override()
    public String ciFile()
    {
        final StringBuilder strg = new StringBuilder();
        this.append4CIFileHeader(strg);
        strg.append("mxUpdate ").append(this.getCI().getMxType()).append(" \"${NAME}\" {\n");

        this.getFlags()     .appendUpdate("    ", strg);
        this.getValues()    .appendUpdate("    ", strg);
        this.getSingles()   .appendUpdate("    ", strg);
        this.getProperties().appendUpdate("    ", strg);
        this.parents        .appendUpdate("    ", strg);

        strg.append("}");

        return strg.toString();
   }

    @Override()
    protected void append4Create(final StringBuilder _cmd)
            throws MatrixException
    {
        super.append4Create(_cmd);

        this.parents.append4Create(_cmd);
    }

    @Override()
    @SuppressWarnings("unchecked")
    public DATA createDependings()
        throws MatrixException
    {
        super.createDependings();

        this.parents.createDependings();

        return (DATA) this;
    }

    @Override()
    public void checkExport(final ExportParser _exportParser)
        throws MatrixException
    {
        // check symbolic name
        Assert.assertEquals(
                _exportParser.getSymbolicName(),
                this.getSymbolicName(),
                "check symbolic name");

        this.getFlags()     .checkExport(_exportParser, "");
        this.getValues()    .checkExport(_exportParser, "");
        this.getSingles()   .checkExport(_exportParser, "");
        this.parents        .checkExport(_exportParser, "");
        this.getProperties().checkExport(_exportParser.getLines("/" + this.getCI().getUrlTag() + "/property/@value"));
    }
}
