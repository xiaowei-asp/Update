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

package org.mxupdate.plugin;

import java.io.Writer;
import java.util.Map;

import matrix.db.Context;
import matrix.db.MatrixWriter;

import org.mxupdate.update.util.MqlUtil_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;

/**
 * The JPO class returns the plug-in properties stored in MX.
 * The JPO returns the in MX stored plug-in properties as string. The plug-in
 * properties was prepared from
 * {@link org.mxupdate.install.InstallDataModel_mxJPO#makePluginProperty(org.mxupdate.update.util.ParameterCache_mxJPO,File)}
 * while the data model was installed.<br/>
 * The key of the properties are defined in this format:
 * <table border="1">
 * <tr><th>property key</th><th>description</th></tr>
 * <tr><td><code>[TypeDefName].FilePrefix</code></td><td>file prefix</td></tr>
 * <tr><td><code>[TypeDefName].FileSuffix</code></td><td>file suffix</td></tr>
 * <tr><td><code>[TypeDefName].Icon</code></td><td>Mime64 encoded Gif image
 *     </td></tr>
 * </table>
 * [TypeDefName] is the name of the type definition specified in the
 * mapping properties.
 *
 * @author The MxUpdate Team
 */
public class GetProperties_mxJPO
    extends AbstractPlugin_mxJPO
{
    /**
     * MQL statement to print the content of the
     * <code>org.mxupdate.plugin.plugin.properties</code> program with the
     * plug-in properties.
     */
    private static final String MQL_CMD = "print prog 'org.mxupdate.plugin.plugin.properties' select code dump";

    /**
     * Returns the prepared content for the plug-in properties. To fetch the
     * information, a {@link #MQL_CMD MQL statement} is executed.
     *
     * @param _paramCache   parameter cache with the MX context
     * @param _arguments    arguments from the Eclipse Plug-In (not used)
     * @return prepared return only with the properties content as string
     * @throws Exception if the evaluate of the properties failed
     * @see #MQL_CMD
     */
    String execute(final ParameterCache_mxJPO _paramCache,
                   final Map<String,Object> _arguments)
        throws Exception
    {
        return MqlUtil_mxJPO.execMql(_paramCache, GetProperties_mxJPO.MQL_CMD);
    }

    /**
     * This is the main method called from MQL. It writes the plugin properties
     * to the matrix writer (so that it could get via the Java MQL console).
     *
     * @param _context  MX context for this request
     * @param _args     arguments from MQL console (not used)
     * @throws Exception if the evaluate of the properties failed
     */
    @Deprecated()
    public void mxMain(final Context _context,
                       final String... _args)
            throws Exception
    {
        final String prop = MqlUtil_mxJPO.execMql(_context, GetProperties_mxJPO.MQL_CMD, true);

        final Writer writer = new MatrixWriter(_context);
        writer.append(prop);
        writer.flush();
        writer.close();
    }
}
