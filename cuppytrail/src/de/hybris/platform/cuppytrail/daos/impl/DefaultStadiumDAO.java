/**
 *
 */
package de.hybris.platform.cuppytrail.daos.impl;

import de.hybris.platform.cuppytrail.daos.StadiumDAO;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 * @author admin
 *
 */
@Component(value = "stadiumDAO")
public class DefaultStadiumDAO implements StadiumDAO
{
	@Resource
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<StadiumModel> findStadiums()
	{
		final String queryString = "SELECT { p:" + StadiumModel.PK + "} FROM {" + StadiumModel._TYPECODE + " AS p}";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		final SearchResult<StadiumModel> x = flexibleSearchService.search(query);
		final List<StadiumModel> y = x.getResult();

		return y;


	}


	@Override
	public List<StadiumModel> findStadiumsByCode(final String code)
	{
		final String queryString = "SELECT { p:" + StadiumModel.PK + "} FROM {" + StadiumModel._TYPECODE + " AS p} WHERE {p:"
				+ StadiumModel.CODE + "}= ?code";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<StadiumModel> search(query).getResult();

	}
}
