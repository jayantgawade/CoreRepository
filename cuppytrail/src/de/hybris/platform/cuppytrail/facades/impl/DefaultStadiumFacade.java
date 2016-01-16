/**
 *
 */
package de.hybris.platform.cuppytrail.facades.impl;

import de.hybris.platform.cuppytrail.StadiumService;
import de.hybris.platform.cuppytrail.data.StadiumData;
import de.hybris.platform.cuppytrail.facades.StadiumFacade;
import de.hybris.platform.cuppytrail.model.StadiumModel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;


/**
 * @author admin
 *
 */
public class DefaultStadiumFacade implements StadiumFacade
{
	private StadiumService stadiumService;

	/**
	 * @param stadiumService
	 *           the stadiumService to set
	 */
	@Required
	public void setStadiumService(final StadiumService stadiumService)
	{
		this.stadiumService = stadiumService;
	}

	@Override
	public StadiumData getStadium(final String name)
	{
		return null;
	}

	@Override
	public List<StadiumData> getStadiums()
	{
		final List<StadiumModel> stadiums = stadiumService.getStadiums();
		final List<StadiumData> stadiumFacadeData = new ArrayList<StadiumData>();

		for (final StadiumModel model : stadiums)
		{
			final StadiumData data = new StadiumData();
			data.setName(model.getCode());
			data.setCapacity(model.getCapacity().toString());
			stadiumFacadeData.add(data);
		}
		return stadiumFacadeData;
	}
}
