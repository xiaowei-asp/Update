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

package org.mxupdate.update.datamodel;

import org.mxupdate.typedef.TypeDef_mxJPO;

/**
 * The class is used to evaluate information from string attributes within MX
 * used to export, delete and update a string attribute.
 *
 * @author The MxUpdate Team
 */
public class AttributeString_mxJPO
    extends AbstractAttribute_mxJPO<AttributeString_mxJPO>
{
    /**
     * Constructor used to initialize the string attribute instance with
     * related type definition and attribute name.
     *
     * @param _typeDef  defines the related type definition
     * @param _mxName   MX name of the string attribute object
     */
    public AttributeString_mxJPO(final TypeDef_mxJPO _typeDef,
                                 final String _mxName)
    {
        super(_typeDef, _mxName, Kind.String);
    }
}
