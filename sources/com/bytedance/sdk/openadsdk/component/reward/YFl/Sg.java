package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.bZ;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    private static final SparseArray<WeakReference<com.bytedance.sdk.openadsdk.core.model.Wwa>> YFl = new SparseArray<>();

    public static void YFl(YFl yFl, Intent intent, Bundle bundle) {
        YFl(intent, yFl);
        YFl(bundle, yFl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.bytedance.sdk.openadsdk.core.model.Wwa] */
    public static com.bytedance.sdk.openadsdk.core.model.Wwa YFl(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2) {
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            com.bytedance.sdk.openadsdk.core.model.YFl DSW = bZ.YFl().DSW();
            r3 = DSW != null ? new com.bytedance.sdk.openadsdk.core.model.qO(DSW) : null;
            if (sg2 != null) {
                sg2.YFl(bundle);
            }
            bZ.YFl().vc();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    r3 = new com.bytedance.sdk.openadsdk.core.model.qO(com.bytedance.sdk.openadsdk.core.model.YFl.Sg(new JSONObject(stringExtra)));
                }
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFDM", "", e2);
            }
        }
        if (bundle != null) {
            try {
                WeakReference<com.bytedance.sdk.openadsdk.core.model.Wwa> weakReference = YFl.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    r3 = weakReference.get();
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFDM", "", th2);
            }
        }
        if (r3 != null) {
            r3.YFl(r3.lG(), 7);
        }
        return r3;
    }

    public static void YFl(Intent intent, YFl yFl) {
        if (intent == null) {
            return;
        }
        yFl.VOe.tN(intent.getBooleanExtra("video_is_cached", false));
        yFl.fIu = intent.getStringExtra("multi_process_listener_key");
        yFl.tQ = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void YFl(Bundle bundle, YFl yFl) {
        if (bundle == null) {
            return;
        }
        yFl.fIu = bundle.getString("multi_process_listener_key");
        yFl.VOe.tN(bundle.getBoolean("video_is_cached", false));
        yFl.iY = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            yFl.VOe.YFl(bundle.getLong("video_current", 0L));
        }
        yFl.YFl(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void YFl(YFl yFl, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = yFl.Sg;
            YFl.append(wwa.hashCode(), new WeakReference<>(wwa));
            bundle.putInt("meta_tmp", wwa.hashCode());
            bundle.putString("multi_process_listener_key", yFl.fIu);
            bundle.putBoolean("video_is_cached", yFl.VOe.bZ());
            bundle.putLong("video_current", yFl.VOe.DSW());
            bundle.putBoolean("is_mute", yFl.iY);
            bundle.putBoolean("has_show_skip_btn", yFl.f10589ib);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void YFl(android.content.Intent r2, android.app.Activity r3, boolean r4, com.bytedance.sdk.openadsdk.core.model.YFl r5, java.lang.String r6) {
        /*
            if (r3 != 0) goto L8
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            goto L1d
        L8:
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L15
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L15
            int r3 = r3.getRotation()     // Catch: java.lang.Exception -> L15
            goto L1e
        L15:
            r3 = move-exception
            java.lang.String r0 = "TTAD.RFDM"
            java.lang.String r1 = ""
            com.bytedance.sdk.component.utils.YoT.YFl(r0, r1, r3)
        L1d:
            r3 = 0
        L1e:
            java.lang.String r0 = "orientation_angle"
            r2.putExtra(r0, r3)
            java.lang.String r3 = "video_is_cached"
            r2.putExtra(r3, r4)
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.Sg.tN()
            if (r3 == 0) goto L49
            org.json.JSONObject r3 = r5.YoT()
            if (r3 != 0) goto L3a
            java.lang.String r2 = "toJsonObj return null"
            com.bytedance.sdk.component.utils.YoT.Sg(r2)
            return
        L3a:
            java.lang.String r4 = "multi_process_ad_info"
            java.lang.String r3 = r3.toString()
            r2.putExtra(r4, r3)
            java.lang.String r3 = "multi_process_listener_key"
            r2.putExtra(r3, r6)
            return
        L49:
            com.bytedance.sdk.openadsdk.core.bZ r2 = com.bytedance.sdk.openadsdk.core.bZ.YFl()
            r2.vc()
            com.bytedance.sdk.openadsdk.core.bZ r2 = com.bytedance.sdk.openadsdk.core.bZ.YFl()
            r2.YFl(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(android.content.Intent, android.app.Activity, boolean, com.bytedance.sdk.openadsdk.core.model.YFl, java.lang.String):void");
    }
}
