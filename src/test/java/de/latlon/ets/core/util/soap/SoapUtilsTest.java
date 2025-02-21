package de.latlon.ets.core.util.soap;

import static de.latlon.ets.core.util.soap.SoapUtils.convertToSoapPart;
import static de.latlon.ets.core.util.soap.SoapUtils.readPayloadFromFile;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.xml.transform.Source;

import org.junit.Test;

import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPPart;

/**
 * Tests for {@link SoapUtils}.
 * 
 * @author <a href="mailto:stenger@lat-lon.de">Dirk Stenger</a>
 */
public class SoapUtilsTest {

    @Test
    public void testReadPayloadFromFile()
                    throws Exception {
        Source payload = readPayloadFromFile( this.getClass().getResourceAsStream( "GetCapabilitiesRequest_example.xml" ) );

        assertNotNull( payload);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadPayloadFromFileWithNullShouldThrowException()
                    throws Exception {
        readPayloadFromFile( null );
    }

    @Test
    public void testConvertToSoapPartWithReadPayloadFromFile()
                    throws Exception {
        Source payload = readPayloadFromFile( this.getClass().getResourceAsStream( "GetCapabilitiesRequest_example.xml" ) );
        SOAPPart soapPart = convertToSoapPart( payload );

        assertNotNull( soapPart);
        assertTrue( soapPart.getElementsByTagNameNS( "*", "GetCapabilities" ).getLength() > 0 );
    }

    @Test(expected = SOAPException.class)
    public void testConvertToSoapPartWithNullShouldThrowException()
                    throws Exception {
        convertToSoapPart( null );
    }

}