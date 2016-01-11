package com.amigo.ecom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudhanshu.gupta on 11/01/16.
 */
public class GenerateCards {
    private static List<Card> cards;

    public static List<Card> getCards() {
        cards = new ArrayList<>();
        cards.add(new Card("Browse Mobile Offer", R.drawable.electronics, "http://www.flipkart.com/mobiles/pr?sid=tyy,4io&otracker=ch_vn_mobile_filter_Top%20Brands_All"));
        cards.add(new Card("Browse Men's Fashion Offer", R.drawable.men_fashion ,"http://www.flipkart.com/mens-clothing/pr?p[]=facets.discount_range%5B%5D=30%25+-+40%25&p[]=facets.discount_range%5B%5D=40%25+-+50%25&p[]=facets.discount_range%5B%5D=More+than+50%25&sid=2oq,s9b&filterNone=true&otracker=clp_mens-clothing_PromoWidget2_0-3_banners_0"));
        cards.add(new Card("Browse Women's Fashion Offer", R.drawable.women_fashion , "http://www.flipkart.com/womens-clothing/~womens-clothing-minimum-30-percent-off/pr?sid=2oq,c1r&otracker=clp_womens-clothing_PromoWidget2_0-3_banners_0"));
        cards.add(new Card("Browse Kid's Fashion Offer", R.drawable.kid_fashion, "http://www.flipkart.com/kids-clothing/~bbd-min-50-off/pr?sid=2oq,mpf&otracker=clp_kids-clothing_PromoWidget2_1-3_banners_0"));

        return cards;
    }
}
