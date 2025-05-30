package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.model.vwr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    private static final SparseArray<WeakReference<woN>> zp = new SparseArray<>();

    public static void zp(zp zpVar, Intent intent, Bundle bundle) {
        zp(intent, zpVar);
        zp(bundle, zpVar);
    }

    public static woN zp(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd) {
        woN won;
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            won = null;
            if (intent != null) {
                try {
                    String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                    if (stringExtra != null) {
                        won = new vwr(com.bytedance.sdk.openadsdk.core.model.zp.lMd(new JSONObject(stringExtra)));
                    }
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.RFDM", "", e4);
                }
            }
        } else {
            woN lMd = cz.zp().lMd();
            com.bytedance.sdk.openadsdk.core.model.zp QR = cz.zp().QR();
            if (lMd == null && QR != null) {
                lMd = new vwr(QR);
            }
            if (lmd != null) {
                lmd.zp(bundle);
            }
            cz.zp().HWF();
            won = lMd;
        }
        if (bundle != null) {
            try {
                WeakReference<woN> weakReference = zp.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    won = weakReference.get();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.RFDM", "", th);
            }
        }
        if (won != null) {
            won.zp(won.dQp(), 7);
        }
        return won;
    }

    private static void zp(Intent intent, zp zpVar) {
        if (intent == null) {
            return;
        }
        zpVar.UPs.KS(intent.getBooleanExtra("video_is_cached", false));
        zpVar.KS = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
        zpVar.rV = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void zp(Bundle bundle, zp zpVar) {
        if (bundle == null) {
            return;
        }
        zpVar.KS = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
        zpVar.UPs.KS(bundle.getBoolean("video_is_cached", false));
        zpVar.jU = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            zpVar.UPs.zp(bundle.getLong("video_current", 0L));
        }
        zpVar.zp(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void zp(zp zpVar, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            woN won = zpVar.zp;
            zp.append(won.hashCode(), new WeakReference<>(won));
            bundle.putInt("meta_tmp", won.hashCode());
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, zpVar.KS);
            bundle.putBoolean("video_is_cached", zpVar.UPs.ox());
            bundle.putLong("video_current", zpVar.UPs.QR());
            bundle.putBoolean("is_mute", zpVar.jU);
            bundle.putBoolean("has_show_skip_btn", zpVar.KVG);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zp(android.content.Intent r2, android.app.Activity r3, boolean r4, com.bytedance.sdk.openadsdk.core.model.zp r5, java.lang.String r6) {
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
            com.bytedance.sdk.component.utils.tG.zp(r0, r1, r3)
        L1d:
            r3 = 0
        L1e:
            java.lang.String r0 = "orientation_angle"
            r2.putExtra(r0, r3)
            java.lang.String r3 = "video_is_cached"
            r2.putExtra(r3, r4)
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.lMd.KS()
            if (r3 == 0) goto L49
            org.json.JSONObject r3 = r5.Bj()
            if (r3 != 0) goto L3a
            java.lang.String r2 = "toJsonObj return null"
            com.bytedance.sdk.component.utils.tG.lMd(r2)
            return
        L3a:
            java.lang.String r4 = "multi_process_ad_info"
            java.lang.String r3 = r3.toString()
            r2.putExtra(r4, r3)
            java.lang.String r3 = "multi_process_meta_md5"
            r2.putExtra(r3, r6)
            return
        L49:
            com.bytedance.sdk.openadsdk.core.cz r2 = com.bytedance.sdk.openadsdk.core.cz.zp()
            r2.HWF()
            com.bytedance.sdk.openadsdk.core.cz r2 = com.bytedance.sdk.openadsdk.core.cz.zp()
            r2.zp(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.zp.lMd.zp(android.content.Intent, android.app.Activity, boolean, com.bytedance.sdk.openadsdk.core.model.zp, java.lang.String):void");
    }
}
