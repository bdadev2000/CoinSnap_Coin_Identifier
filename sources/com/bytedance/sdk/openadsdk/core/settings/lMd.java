package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.Gzh;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    private static final ConcurrentHashMap<String, zp> zp = new ConcurrentHashMap<>();

    @NonNull
    private static HashMap<String, zp> lMd(JSONArray jSONArray) {
        HashMap<String, zp> hashMap = new HashMap<>();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                zp zp2 = zp(jSONArray.getJSONObject(i9));
                if (zp2 != null) {
                    hashMap.put(zp2.zp, zp2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static void zp(boolean z8) {
        String zp2;
        File lMd = lMd();
        if (!lMd.exists()) {
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                zp2 = com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                zp2 = Gzh.zp("tt_sdk_settings", KVG.zp()).zp("ad_slot_conf", (String) null);
            }
            if (TextUtils.isEmpty(zp2)) {
                return;
            }
            try {
                HashMap<String, zp> lMd2 = lMd(new JSONArray(zp2));
                if (lMd2.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, zp> concurrentHashMap = zp;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(lMd2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap<String, zp> lMd3 = lMd(new JSONArray(new String(com.bytedance.sdk.component.utils.HWF.jU(lMd))));
            if (lMd3.isEmpty()) {
                return;
            }
            for (Map.Entry<String, zp> entry : lMd3.entrySet()) {
                String key = entry.getKey();
                zp value = entry.getValue();
                if (value.UPs && !z8) {
                    zp zpVar = zp.get(key);
                    if (zpVar != null) {
                        zpVar.Iv = value.BO;
                    }
                } else {
                    zp.put(key, value);
                }
            }
        } catch (Exception unused2) {
        }
    }

    @NonNull
    private static File lMd() {
        return new File(KVG.zp().getFilesDir(), "tt_ads_conf");
    }

    private static zp lMd(String str) {
        return new zp(str, 1);
    }

    private static zp zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new zp(jSONObject);
    }

    @NonNull
    public static zp zp(String str) {
        zp zpVar = zp.get(str);
        return zpVar == null ? lMd(str) : zpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zp(org.json.JSONArray r5) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            java.io.File r0 = lMd()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            if (r3 == 0) goto L35
            r1.delete()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            goto L35
        L30:
            r5 = move-exception
            goto Lbc
        L33:
            r0 = move-exception
            goto L65
        L35:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r3.write(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.KVG.zp()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            com.bytedance.sdk.openadsdk.utils.Gzh r0 = com.bytedance.sdk.openadsdk.utils.Gzh.zp(r0, r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r2 = "ad_slot_conf"
            r0.zp(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            boolean r0 = r1.exists()
            if (r0 == 0) goto L5c
            r1.delete()
        L5c:
            com.bytedance.sdk.openadsdk.utils.dT.zp(r3)
            goto L78
        L60:
            r5 = move-exception
            r2 = r3
            goto Lbc
        L63:
            r0 = move-exception
            r2 = r3
        L65:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L30
            boolean r0 = r1.exists()
            if (r0 == 0) goto L75
            r1.delete()
        L75:
            com.bytedance.sdk.openadsdk.utils.dT.zp(r2)
        L78:
            java.util.HashMap r5 = lMd(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lbb
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.zp r0 = (com.bytedance.sdk.openadsdk.core.settings.zp) r0
            boolean r2 = r0.UPs
            if (r2 == 0) goto Lb5
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.zp> r2 = com.bytedance.sdk.openadsdk.core.settings.lMd.zp
            java.lang.Object r1 = r2.get(r1)
            com.bytedance.sdk.openadsdk.core.settings.zp r1 = (com.bytedance.sdk.openadsdk.core.settings.zp) r1
            if (r1 == 0) goto L8a
            java.lang.String r0 = r0.BO
            r1.Iv = r0
            goto L8a
        Lb5:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.zp> r2 = com.bytedance.sdk.openadsdk.core.settings.lMd.zp
            r2.put(r1, r0)
            goto L8a
        Lbb:
            return
        Lbc:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lc5
            r1.delete()
        Lc5:
            com.bytedance.sdk.openadsdk.utils.dT.zp(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.lMd.zp(org.json.JSONArray):void");
    }

    public static void zp() {
        File lMd = lMd();
        if (lMd.exists()) {
            lMd.delete();
        }
    }
}
