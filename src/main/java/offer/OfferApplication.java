package offer;

import offer.easy.*;

/**
 * @author EDZ
 * @description
 * @date 2020/9/3 14:19
 */
public class OfferApplication {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IOffer offer = new Offer42();
        offer.solve();
        System.out.println("耗时" + (System.currentTimeMillis() - start) + "ms");
    }
}
