package com.bytedance.sdk.openadsdk.component.YFl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.NjR;
import com.bytedance.sdk.openadsdk.core.qsH.qsH;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Sg {
    public static qsH Sg(Wwa wwa, Activity activity, final com.bytedance.sdk.openadsdk.component.qsH.YFl yFl, com.bytedance.sdk.openadsdk.component.NjR.Sg sg2) {
        qsH qsh = new qsH(activity.getApplicationContext(), wwa, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.YFl.Sg.2
            @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl, com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(yFl.Sg()));
                YFl(hashMap);
                super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        qsh.YFl((View) sg2);
        YFl(activity.getApplicationContext(), wwa, qsh);
        YFl(qsh, wwa);
        return qsh;
    }

    public static YFl YFl(Wwa wwa, Activity activity, com.bytedance.sdk.openadsdk.component.qsH.YFl yFl) {
        YFl yFl2 = new YFl(activity.getApplicationContext(), wwa, "open_ad", 4, yFl);
        yFl2.YFl(activity.findViewById(R.id.content));
        yFl2.Sg(activity.findViewById(520093713));
        YFl(activity.getApplicationContext(), wwa, yFl2);
        YFl(yFl2, wwa);
        return yFl2;
    }

    public static NjR YFl(Wwa wwa, Activity activity, final com.bytedance.sdk.openadsdk.component.qsH.YFl yFl, com.bytedance.sdk.openadsdk.component.NjR.Sg sg2) {
        NjR njR = new NjR(activity, wwa, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.YFl.Sg.1
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(yFl.Sg()));
                YFl(hashMap);
                super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        njR.YFl(sg2);
        YFl(activity.getApplicationContext(), wwa, njR);
        YFl(njR, wwa);
        return njR;
    }

    public static void YFl(com.bytedance.sdk.openadsdk.core.Sg.Sg sg2, Wwa wwa) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(wwa.YoT()));
        hashMap.put("openad_creative_type", Wwa.wN(wwa) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(Ne.tN(wwa) ? 3 : 1));
        sg2.YFl(hashMap);
    }

    private static void YFl(Context context, Wwa wwa, com.bytedance.sdk.openadsdk.core.Sg.Sg sg2) {
        if (wwa == null || wwa.ko() != 4) {
            return;
        }
        sg2.YFl(DSW.YFl(context, wwa, "open_ad"));
    }
}
