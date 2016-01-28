/**
 *
 */
package de.hybris.platform.cuppytrail.interceptors;

import static org.fest.assertions.Assertions.assertThat;

import de.hybris.platform.cuppytrail.model.StadiumModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author admin
 *
 */
public class StadiumCapacityIntegrationTest extends ServicelayerTest
{

	@Resource
	private ModelService modelService;

	@Before
	public void setUp() throws Exception
	{
		createCoreData();
		createDefaultCatalog();
	}


	@Test
	public void testValidationInterceptor()
	{
		//given
		final StadiumModel stadium = modelService.create(StadiumModel.class);
		stadium.setCode("invalid");
		stadium.setCapacity(Integer.valueOf(200000));

		//when
		try
		{
			modelService.save(stadium);
			Assert.fail();
		}
		//then
		catch (final ModelSavingException e)
		{
			assertThat(e.getCause().getClass()).isEqualTo(InterceptorException.class);
			assertThat(e.getMessage()).contains("Capacity is too high");
		}
	}
}
