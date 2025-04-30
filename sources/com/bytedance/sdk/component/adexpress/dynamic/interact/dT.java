package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class dT {
    public static ku zp(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.KS.QR qr, com.bytedance.sdk.component.adexpress.dynamic.KS.dT dTVar, com.bytedance.sdk.component.adexpress.lMd.tG tGVar) {
        if (context == null || dynamicBaseWidget == null || qr == null) {
            return null;
        }
        String Iv = qr.Iv();
        String ot = tGVar.ot();
        Iv.getClass();
        char c9 = 65535;
        switch (Iv.hashCode()) {
            case 48:
                if (Iv.equals("0")) {
                    c9 = 0;
                    break;
                }
                break;
            case 49:
                if (Iv.equals("1")) {
                    c9 = 1;
                    break;
                }
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                if (Iv.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    c9 = 2;
                    break;
                }
                break;
            case 53:
                if (Iv.equals(CampaignEx.CLICKMODE_ON)) {
                    c9 = 3;
                    break;
                }
                break;
            case 54:
                if (Iv.equals("6")) {
                    c9 = 4;
                    break;
                }
                break;
            case 55:
                if (Iv.equals("7")) {
                    c9 = 5;
                    break;
                }
                break;
            case 56:
                if (Iv.equals("8")) {
                    c9 = 6;
                    break;
                }
                break;
            case 57:
                if (Iv.equals("9")) {
                    c9 = 7;
                    break;
                }
                break;
            case 1567:
                if (Iv.equals("10")) {
                    c9 = '\b';
                    break;
                }
                break;
            case 1568:
                if (Iv.equals("11")) {
                    c9 = '\t';
                    break;
                }
                break;
            case 1569:
                if (Iv.equals("12")) {
                    c9 = '\n';
                    break;
                }
                break;
            case 1570:
                if (Iv.equals("13")) {
                    c9 = 11;
                    break;
                }
                break;
            case 1571:
                if (Iv.equals("14")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 1573:
                if (Iv.equals("16")) {
                    c9 = '\r';
                    break;
                }
                break;
            case 1574:
                if (Iv.equals("17")) {
                    c9 = 14;
                    break;
                }
                break;
            case 1575:
                if (Iv.equals("18")) {
                    c9 = 15;
                    break;
                }
                break;
            case 1598:
                if (Iv.equals("20")) {
                    c9 = 16;
                    break;
                }
                break;
            case 1600:
                if (Iv.equals("22")) {
                    c9 = 17;
                    break;
                }
                break;
            case 1601:
                if (Iv.equals("23")) {
                    c9 = 18;
                    break;
                }
                break;
            case 1602:
                if (Iv.equals("24")) {
                    c9 = 19;
                    break;
                }
                break;
            case 1603:
                if (Iv.equals("25")) {
                    c9 = 20;
                    break;
                }
                break;
            case 1607:
                if (Iv.equals("29")) {
                    c9 = 21;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return new HWF(context, dynamicBaseWidget, qr);
            case 1:
                break;
            case 2:
                return new KS(context, dynamicBaseWidget, qr);
            case 3:
                if (qr.Rg() == 1) {
                    return new vwr(context, dynamicBaseWidget, qr, qr.GP());
                }
                return new KVG(context, dynamicBaseWidget, qr);
            case 4:
            case '\t':
                return new rV(context, dynamicBaseWidget, qr);
            case 5:
            case '\f':
                return new vDp(context, dynamicBaseWidget, qr);
            case 6:
                return new tG(context, dynamicBaseWidget, qr);
            case 7:
            case '\r':
                return new dQp(context, dynamicBaseWidget, qr, Iv, dTVar.zp(), dTVar.lMd(), dTVar.jU());
            case '\b':
                return new COT(context, dynamicBaseWidget, qr);
            case '\n':
                return new KVG(context, dynamicBaseWidget, qr);
            case 11:
                return new vwr(context, dynamicBaseWidget, qr);
            case 14:
            case 15:
                return new cz(context, dynamicBaseWidget, qr, Iv, dTVar);
            case 16:
                return new lMd(context, dynamicBaseWidget, qr);
            case 17:
                if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    return new woN(context, dynamicBaseWidget, qr);
                }
                return new pvr(context, dynamicBaseWidget, qr);
            case 18:
                if (!com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    return null;
                }
                return new Bj(context, dynamicBaseWidget, qr, o.j(ot, "static/lotties/202327swiper-up-star/click.json"));
            case 19:
                if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    return new zp(context, dynamicBaseWidget, qr);
                }
                return new woN(context, dynamicBaseWidget, qr);
            case 20:
                if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                    new Bj(context, dynamicBaseWidget, qr, o.j(ot, "static/lotties/gesture-slide.json"));
                    break;
                }
                break;
            case 21:
                return new QR(context, dynamicBaseWidget, qr, dTVar.zp(), dTVar.lMd(), dTVar.jU());
            default:
                return null;
        }
        return new jU(context, dynamicBaseWidget, qr);
    }
}
