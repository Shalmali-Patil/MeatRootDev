package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetZonesPerCountry - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetZonesPerCountry
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetZonesPerCountry(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public ZoneIf[] getZonesPerCountry(int countryId) throws KKException
     {
         return kkEng.getZonesPerCountry(countryId);
     }
}