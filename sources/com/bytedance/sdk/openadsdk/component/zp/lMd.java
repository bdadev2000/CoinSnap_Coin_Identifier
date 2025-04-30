package com.bytedance.sdk.openadsdk.component.zp;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.HWF;
import com.bytedance.sdk.openadsdk.core.nativeexpress.QR;
import com.com.bytedance.overseas.sdk.zp.jU;
import java.util.HashMap;

/* loaded from: classes.dex */
public class lMd {
    public static HWF lMd(woN won, Activity activity, final com.bytedance.sdk.openadsdk.component.ku.zp zpVar, PAGAppOpenAdExpressView pAGAppOpenAdExpressView) {
        HWF hwf = new HWF(activity.getApplicationContext(), won, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.zp.lMd.2
            @Override // com.bytedance.sdk.openadsdk.core.lMd.zp, com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
            public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(zpVar.lMd()));
                zp(hashMap);
                super.zp(view, f9, f10, f11, f12, sparseArray, z8);
            }
        };
        hwf.zp((View) pAGAppOpenAdExpressView);
        zp(activity.getApplicationContext(), won, hwf);
        zp(hwf, won);
        return hwf;
    }

    public static zp zp(woN won, Activity activity, com.bytedance.sdk.openadsdk.component.ku.zp zpVar) {
        zp zpVar2 = new zp(activity.getApplicationContext(), won, "open_ad", 4, zpVar);
        zpVar2.zp(activity.findViewById(R.id.content));
        zpVar2.lMd(activity.findViewById(520093713));
        zp(activity.getApplicationContext(), won, zpVar2);
        zp(zpVar2, won);
        return zpVar2;
    }

    public static QR zp(woN won, Activity activity, final com.bytedance.sdk.openadsdk.component.ku.zp zpVar, PAGAppOpenAdExpressView pAGAppOpenAdExpressView) {
        QR qr = new QR(activity, won, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.zp.lMd.1
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
            public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(zpVar.lMd()));
                zp(hashMap);
                super.zp(view, f9, f10, f11, f12, sparseArray, z8);
            }
        };
        qr.zp(pAGAppOpenAdExpressView);
        zp(activity.getApplicationContext(), won, qr);
        zp(qr, won);
        return qr;
    }

    public static void zp(com.bytedance.sdk.openadsdk.core.lMd.lMd lmd, woN won) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(won.dT()));
        hashMap.put("openad_creative_type", woN.COT(won) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(cz.Bj(won) ? 3 : 1));
        lmd.zp(hashMap);
    }

    private static void zp(Context context, woN won, com.bytedance.sdk.openadsdk.core.lMd.lMd lmd) {
        if (won == null || won.oKZ() != 4) {
            return;
        }
        lmd.zp(jU.zp(context, won, "open_ad"));
    }
}
