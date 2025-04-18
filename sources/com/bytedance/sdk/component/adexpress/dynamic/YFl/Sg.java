package com.bytedance.sdk.component.adexpress.dynamic.YFl;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.AlY;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cfr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DSW;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.EH;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ne;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NjR;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.UZM;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VOe;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Wwa;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.YI;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.YoT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aIu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bZ;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dXO;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hQ;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lG;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pDU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rkt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tN;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wXo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zB;

/* loaded from: classes.dex */
public class Sg {
    public static wN YFl(Context context, DynamicRootView dynamicRootView, qsH qsh) {
        GA renderRequest;
        if (context == null || dynamicRootView == null || qsh == null || qsh.nc() == null) {
            return null;
        }
        switch (qsh.nc().YFl()) {
            case -1:
                return new pq(context, dynamicRootView, qsh);
            case 0:
                return new UZM(context, dynamicRootView, qsh);
            case 1:
                return new eT(context, dynamicRootView, qsh);
            case 2:
                return new DSW(context, dynamicRootView, qsh);
            case 3:
                return new NjR(context, dynamicRootView, qsh);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GA(context, dynamicRootView, qsh);
            case 5:
                return new pDU(context, dynamicRootView, qsh);
            case 6:
            case 9:
            case 17:
                return new vc(context, dynamicRootView, qsh);
            case 7:
                return new zB(context, dynamicRootView, qsh);
            case 8:
                return new Wwa(context, dynamicRootView, qsh);
            case 10:
                return new rkt(context, dynamicRootView, qsh);
            case 11:
                return new bZ(context, dynamicRootView, qsh);
            case 12:
                return new nc(context, dynamicRootView, qsh);
            case 13:
                return new YI(context, dynamicRootView, qsh);
            case 14:
                return new dXO(context, dynamicRootView, qsh);
            case 15:
                if (AlY.Sg()) {
                    return new Cfr(context, dynamicRootView, qsh);
                }
                return new hQ(context, dynamicRootView, qsh);
            case 16:
                return new eT(context, dynamicRootView, qsh);
            case 18:
                return new VOe(context, dynamicRootView, qsh);
            case 19:
                return new Ne(context, dynamicRootView, qsh);
            case 20:
                return new aIu(context, dynamicRootView, qsh);
            case 21:
                return new wXo(context, dynamicRootView, qsh);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qsH(context, dynamicRootView, qsh);
            case 23:
                return new lG(context, dynamicRootView, qsh);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AlY(context, dynamicRootView, qsh);
            case 25:
                return new YoT(context, dynamicRootView, qsh);
            case 26:
                if ("vertical".equals(qsh.nc().wN().SVa())) {
                    return new mn(context, dynamicRootView, qsh);
                }
                return new tN(context, dynamicRootView, qsh);
            case 27:
                return new hQ(context, dynamicRootView, qsh);
            case 28:
                if (!AlY.Sg() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new EH(context, dynamicRootView, qsh, renderRequest.bZ());
            default:
                return null;
        }
    }
}
