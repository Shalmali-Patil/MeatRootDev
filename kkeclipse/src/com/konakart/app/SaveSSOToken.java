package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - SaveSSOToken - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class SaveSSOToken
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public SaveSSOToken(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public String saveSSOToken(SSOTokenIf token) throws KKException
     {
         return kkEng.saveSSOToken(token);
     }
}