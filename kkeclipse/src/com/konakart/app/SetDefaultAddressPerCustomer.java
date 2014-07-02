package com.konakart.app;

/**
 *  The KonaKart Custom Engine - SetDefaultAddressPerCustomer - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class SetDefaultAddressPerCustomer
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public SetDefaultAddressPerCustomer(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public void setDefaultAddressPerCustomer(String sessionId, int addressId) throws KKException
     {
         kkEng.setDefaultAddressPerCustomer(sessionId, addressId);
     }
}