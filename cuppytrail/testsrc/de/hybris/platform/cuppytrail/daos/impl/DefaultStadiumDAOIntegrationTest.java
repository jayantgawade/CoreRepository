/**
 *
 */
package de.hybris.platform.cuppytrail.daos.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.hybris.platform.cuppytrail.daos.StadiumDAO;
import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;


/**
 * @author admin
 *
 */
public class DefaultStadiumDAOIntegrationTest extends ServicelayerTransactionalTest
{
	@Resource
	private StadiumDAO stadiumDAO;
	@Resource
	private ModelService modelService;

	private static Integer STADIUM_CAPACITY = Integer.valueOf(9000);
	private static final String STADIUM_NAME = "testStadium";


	@Test
	public void StadiumDAOTest()
	{
		List<StadiumModel> stadiumsByCode = stadiumDAO.findStadiumsByCode(STADIUM_NAME);

		assertTrue("No Stadium Should Be Return", stadiumsByCode.isEmpty());

		List<StadiumModel> allStadiums = stadiumDAO.findStadiums();

		final int size = allStadiums.size();

		final StadiumModel stadiumModel = new StadiumModel();

		stadiumModel.setCode(STADIUM_NAME);
		stadiumModel.setCapacity(STADIUM_CAPACITY);

		modelService.save(stadiumModel);

		allStadiums = stadiumDAO.findStadiums();

		assertEquals(size + 1, allStadiums.size());
		assertEquals("Unexpected stadium found", stadiumModel, allStadiums.get(allStadiums.size() - 1));

		stadiumsByCode = stadiumDAO.findStadiumsByCode(STADIUM_NAME);

		assertEquals("Did not find the Stadium we just saved", 1, stadiumsByCode.size());
		assertEquals("Retrieved Stadium's name attribute incorrect", STADIUM_NAME, stadiumsByCode.get(0).getCode());
		assertEquals("Retrieved Stadium's capacity attribute incorrect", STADIUM_CAPACITY, stadiumsByCode.get(0).getCapacity());





	}
}
