/**
 *
 */
package de.hybris.platform.cuppytrail;

import de.hybris.platform.cuppytrail.model.StadiumModel;

import java.util.List;


/**
 * @author admin
 *
 */
public interface StadiumService
{
	List<StadiumModel> getStadiums();

	StadiumModel getStadiumsByCode(String code);
}
