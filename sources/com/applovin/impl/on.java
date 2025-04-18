package com.applovin.impl;

import okhttp3.internal.http.StatusLine;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;

/* loaded from: classes2.dex */
public abstract class on {
    public static String a(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            return "SFBX CMP";
        }
        if (intValue == 3) {
            return "Liveramp CMP";
        }
        if (intValue == 5) {
            return "UserCentrics CMP";
        }
        if (intValue == 6) {
            return "Sourcepoint Dialogue CMP";
        }
        if (intValue == 7) {
            return "Didomi CMP";
        }
        if (intValue == 27) {
            return "Associated Newspapers Ltd CMP";
        }
        if (intValue == 28) {
            return "Onetrust / Cookiepro CMP";
        }
        if (intValue == 104) {
            return "AdOcean CMP";
        }
        if (intValue == 105) {
            return "Dailymotion CMP";
        }
        if (intValue == 302) {
            return "Gravito CMP";
        }
        if (intValue == 303) {
            return "Impala CMP";
        }
        if (intValue == 414) {
            return "MBEX LTD CMP";
        }
        if (intValue == 415) {
            return "Match Group LLC CMP";
        }
        switch (intValue) {
            case 10:
                return "InMobi Choice CMP";
            case 14:
                return "Yahoo EMEA CMP";
            case 21:
                return "Traffective CMP";
            case 31:
                return "Consentmanager CMP";
            case 35:
                return "BurdaForward GmbH CMP";
            case Opcodes.V15 /* 59 */:
                return "Deezer CMP";
            case TypeReference.NEW /* 68 */:
                return "Uniconsent CMP";
            case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                return "Wirtualna Polska Media S.A. CMP";
            case 76:
                return "Sibbo CMP";
            case Opcodes.IASTORE /* 79 */:
                return "SFR CMP";
            case Opcodes.BASTORE /* 84 */:
                return "Alma CMP";
            case 90:
                return "Commanders Act CMP";
            case Opcodes.LSHR /* 123 */:
                return "Iubenda CMP";
            case Opcodes.LUSHR /* 125 */:
                return "Ebay CMP";
            case Opcodes.I2F /* 134 */:
                return "Cookiebot CMP";
            case Opcodes.GOTO /* 167 */:
                return "1&1 Mail & Media GmbH CMP";
            case Opcodes.LOOKUPSWITCH /* 171 */:
                return "Viber Media CMP";
            case Opcodes.IFNULL /* 198 */:
                return "Microsoft Corporation CMP";
            case 212:
                return "Singlespot";
            case 231:
                return "Interia CMP";
            case 237:
                return "ALPRED SL CMP";
            case 246:
                return "Overwolf Ltd. CMP";
            case 258:
                return "Automattic, Inc. CMP";
            case 260:
                return "Axeptio";
            case 273:
                return "One Consent CMP";
            case 280:
                return "Ringier Axel Springer Polska";
            case 300:
                return "Google LLC CMP";
            case 306:
                return "mobile.de CMP";
            case 309:
                return "eBay Kleinanzeigen GmbH CMP";
            case 318:
                return "Seven.One Entertainment Group GmbH CMP";
            case 327:
                return "FunCorp CMP";
            case 329:
                return "wetter.com GmbH CMP";
            case 340:
                return "Ketch CMP";
            case 345:
                return "Axel Springer Deutschland GmbH CMP";
            case 348:
                return "Outfit7 CMP";
            case 355:
                return "Onesecondbefore B.V. CMP";
            case 371:
                return "Société Éditrice du Monde";
            case 385:
                return "freenet.de GmbH CMP";
            case 387:
                return "Learnings CMP";
            case 397:
                return "Autoscout24 CMP";
            case 399:
                return "Transcend CMP";
            case 409:
                return "adjoe GmbH CMP";
            case StatusLine.HTTP_MISDIRECTED_REQUEST /* 421 */:
                return "Moonee Publishing LTD CMP";
            case 432:
                return "Appodeal Inc CMP";
            case 436:
                return "X-FLOW LTD CMP";
            default:
                switch (intValue) {
                    case 350:
                        return "Easybrain CMP";
                    case 351:
                        return "TVP S.A. CMP";
                    case 352:
                        return "Pubtech CMP";
                    default:
                        return null;
                }
        }
    }
}
