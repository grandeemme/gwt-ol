package ol;

import ol.BaseTestCase;

/**
 * 
 * @author Tino Desjardins
 *
 */
public class GraticuleTest extends BaseTestCase {

    public void testGraticule() {
        
        Graticule graticule = Graticule.newInstance();
        
        assertNotNull(graticule);
        
    }

}
