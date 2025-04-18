package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import eb.j;

/* loaded from: classes.dex */
public class nc {
    public static DSW YFl(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw, com.bytedance.sdk.component.adexpress.dynamic.AlY.nc ncVar, com.bytedance.sdk.component.adexpress.Sg.GA ga2) {
        String str = null;
        if (context == null || wNVar == null || dsw == null) {
            return null;
        }
        String BPI = dsw.BPI();
        String bZ = ga2.bZ();
        BPI.getClass();
        BPI.hashCode();
        char c10 = 65535;
        switch (BPI.hashCode()) {
            case 48:
                if (BPI.equals("0")) {
                    c10 = 0;
                    break;
                }
                break;
            case 49:
                if (BPI.equals("1")) {
                    c10 = 1;
                    break;
                }
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                if (BPI.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    c10 = 2;
                    break;
                }
                break;
            case 53:
                if (BPI.equals(CampaignEx.CLICKMODE_ON)) {
                    c10 = 3;
                    break;
                }
                break;
            case 54:
                if (BPI.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
            case 55:
                if (BPI.equals("7")) {
                    c10 = 5;
                    break;
                }
                break;
            case 56:
                if (BPI.equals("8")) {
                    c10 = 6;
                    break;
                }
                break;
            case 57:
                if (BPI.equals("9")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1567:
                if (BPI.equals("10")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1568:
                if (BPI.equals("11")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1569:
                if (BPI.equals("12")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1570:
                if (BPI.equals("13")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1571:
                if (BPI.equals("14")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1573:
                if (BPI.equals("16")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1574:
                if (BPI.equals("17")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1575:
                if (BPI.equals("18")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1598:
                if (BPI.equals("20")) {
                    c10 = 16;
                    break;
                }
                break;
            case 1600:
                if (BPI.equals("22")) {
                    c10 = 17;
                    break;
                }
                break;
            case 1601:
                if (BPI.equals("23")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1602:
                if (BPI.equals("24")) {
                    c10 = 19;
                    break;
                }
                break;
            case 1603:
                if (BPI.equals("25")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1607:
                if (BPI.equals("29")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new wN(context, wNVar, dsw);
            case 1:
                return new tN(context, wNVar, dsw);
            case 2:
                return new Sg(context, wNVar, dsw);
            case 3:
                if (dsw.ko() == 1) {
                    return new lG(context, wNVar, dsw, dsw.Hjb());
                }
                return new rkt(context, wNVar, dsw);
            case 4:
            case '\t':
                return new pDU(context, wNVar, dsw);
            case 5:
            case '\f':
                return new YoT(context, wNVar, dsw);
            case 6:
                return new GA(context, wNVar, dsw);
            case 7:
            case '\r':
                return new EH(context, wNVar, dsw, BPI, ncVar.YFl(), ncVar.Sg(), ncVar.AlY(), ncVar.DSW());
            case '\b':
                return new AlY(context, wNVar, dsw);
            case '\n':
                return new rkt(context, wNVar, dsw);
            case 11:
                return new lG(context, wNVar, dsw);
            case 14:
            case 15:
                return new qO(context, wNVar, dsw, BPI, ncVar);
            case 16:
                if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    return new eT(context, wNVar, dsw, j.k(bZ, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                if (!TextUtils.isEmpty(bZ)) {
                    str = j.k(bZ, "brush_mask.json");
                }
                return new eT(context, wNVar, dsw, str, "20");
            case 17:
                if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    return new eT(context, wNVar, dsw, j.k(bZ, "static/lotties/202327swiper-up-star/index.json"), "22");
                }
                return new Wwa(context, wNVar, dsw);
            case 18:
                if (!com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    return null;
                }
                return new eT(context, wNVar, dsw, j.k(bZ, "static/lotties/202327swiper-up-star/click.json"), "23");
            case 19:
                if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    return new YFl(context, wNVar, dsw);
                }
                if (!TextUtils.isEmpty(bZ)) {
                    str = j.k(bZ, "swiper_up_star.json");
                }
                return new eT(context, wNVar, dsw, str, "24");
            case 20:
                if (!com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                    return null;
                }
                return new eT(context, wNVar, dsw, j.k(bZ, "static/lotties/gesture-slide.json"), "25");
            case 21:
                return new vc(context, wNVar, dsw, ncVar.YFl(), ncVar.Sg(), ncVar.AlY(), ncVar.DSW());
            default:
                return null;
        }
    }
}
