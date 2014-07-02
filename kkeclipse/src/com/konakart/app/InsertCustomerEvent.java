package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - InsertCustomerEvent - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class InsertCustomerEvent
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public InsertCustomerEvent(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public void insertCustomerEvent(CustomerEventIf event) throws KKException
     {
         kkEng.insertCustomerEvent(event);
     }
}