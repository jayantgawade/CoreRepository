/**
 *
 */
package de.hybris.platform.cuppytrail.hmc;

import de.hybris.platform.hmc.AbstractEditorMenuChip;
import de.hybris.platform.hmc.AbstractExplorerMenuTreeNodeChip;
import de.hybris.platform.hmc.EditorTabChip;
import de.hybris.platform.hmc.extension.HMCExtension;
import de.hybris.platform.hmc.extension.MenuEntrySlotEntry;
import de.hybris.platform.hmc.generic.ClipChip;
import de.hybris.platform.hmc.generic.ToolbarActionChip;
import de.hybris.platform.hmc.webchips.Chip;
import de.hybris.platform.hmc.webchips.DisplayState;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;


/**
 * @author admin
 *
 */


//this class is necessary since hmc module in extension.xml of this extension refering this class
public class CuppytrailHMCExtension extends HMCExtension
{

	public static final Logger LOG = Logger.getLogger(CuppytrailHMCExtension.class.getName());

	/** Path to the resource bundles. */

	public final static String RESOURCE_PATH = "de.hybris.platform.cuppytrail1.hmc.locales";

	/*
	 * This RESOURCE_PATH is used for hmc localization this is path where localize files are present ex.
	 * locales_de.properties
	 */

	@Override
	public List<EditorTabChip> getEditorTabChips(final DisplayState arg0, final AbstractEditorMenuChip arg1)
	{
		// YTODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public ResourceBundle getLocalizeResourceBundle(final Locale arg0) throws MissingResourceException
	{
		// YTODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuEntrySlotEntry> getMenuEntrySlotEntries(final DisplayState arg0, final Chip arg1)
	{
		// YTODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public String getResourcePath()
	{
		// YTODO Auto-generated method stub
		return RESOURCE_PATH;
	}

	@Override
	public List<ClipChip> getSectionChips(final DisplayState arg0, final ClipChip arg1)
	{
		// YTODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public List<ToolbarActionChip> getToolbarActionChips(final DisplayState arg0, final Chip arg1)
	{
		// YTODO Auto-generated method stub
		return Collections.EMPTY_LIST;
	}

	@Override
	public List<AbstractExplorerMenuTreeNodeChip> getTreeNodeChips(final DisplayState arg0, final Chip arg1)
	{
		// YTODO Auto-generated method stub

		return Collections.EMPTY_LIST;
	}

}
