/**
 *
 */
package de.hybris.platform.cuppytrail.facades;

import de.hybris.platform.cuppytrail.data.StadiumData;

import java.util.List;


/**
 * @author admin
 *
 */
public interface StadiumFacade
{
	StadiumData getStadium(String name);

	List<StadiumData> getStadiums();

}
