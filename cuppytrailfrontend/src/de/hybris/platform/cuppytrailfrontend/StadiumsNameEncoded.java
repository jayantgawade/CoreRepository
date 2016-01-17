/**
 *
 */
package de.hybris.platform.cuppytrailfrontend;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;


/**
 * @author admin
 *
 */
public class StadiumsNameEncoded
{
	private static final Logger LOG = Logger.getLogger(StadiumsNameEncoded.class);

	public static String getNameEncoded(final String name)
	{
		try
		{
			//URLEncoder :Translates a string into application/x-www-form-urlencoded format using a specific encoding scheme. This method uses the supplied encoding scheme to obtain the bytes for unsafe characters.
			return URLEncoder.encode(name, "UTF-8");

		}
		catch (final UnsupportedEncodingException e)
		{
			LOG.error("Problem while Encodeing" + e);
			return "";
		}

	}
}
