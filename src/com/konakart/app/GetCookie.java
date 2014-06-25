package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetCookie - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetCookie
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetCookie(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public KKCookieIf getCookie(String customerUuid, String attrId) throws KKException
     {
         return kkEng.getCookie(customerUuid, attrId);
     }
}
