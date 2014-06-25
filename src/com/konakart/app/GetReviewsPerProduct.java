package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetReviewsPerProduct - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetReviewsPerProduct
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetReviewsPerProduct(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public ReviewsIf getReviewsPerProduct(DataDescriptorIf dataDesc, int productId) throws KKException
     {
         return kkEng.getReviewsPerProduct(dataDesc, productId);
     }
}