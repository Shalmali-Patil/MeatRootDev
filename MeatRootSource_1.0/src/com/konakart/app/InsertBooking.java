package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - InsertBooking - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class InsertBooking
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public InsertBooking(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public int insertBooking(String sessionId, BookingIf booking, BookableProductOptionsIf options) throws KKException
     {
         return kkEng.insertBooking(sessionId, booking, options);
     }
}
