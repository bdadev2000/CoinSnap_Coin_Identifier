package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.hQ;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private static final ConcurrentHashMap<String, Sg> YFl = new ConcurrentHashMap<>();

    @NonNull
    private static HashMap<String, Sg> Sg(JSONArray jSONArray) {
        HashMap<String, Sg> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Sg YFl2 = YFl(jSONArray.getJSONObject(i10));
                if (YFl2 != null) {
                    hashMap.put(YFl2.YFl, YFl2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static void YFl(boolean z10) {
        String YFl2;
        File Sg = Sg();
        if (!Sg.exists()) {
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                YFl2 = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                YFl2 = hQ.YFl("tt_sdk_settings", lG.YFl()).YFl("ad_slot_conf", (String) null);
            }
            if (TextUtils.isEmpty(YFl2)) {
                return;
            }
            try {
                HashMap<String, Sg> Sg2 = Sg(new JSONArray(YFl2));
                if (Sg2.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, Sg> concurrentHashMap = YFl;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(Sg2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap<String, Sg> Sg3 = Sg(new JSONArray(new String(com.bytedance.sdk.component.utils.vc.AlY(Sg))));
            if (Sg3.isEmpty()) {
                return;
            }
            for (Map.Entry<String, Sg> entry : Sg3.entrySet()) {
                String key = entry.getKey();
                Sg value = entry.getValue();
                if (value.Sco && !z10) {
                    Sg sg2 = YFl.get(key);
                    if (sg2 != null) {
                        sg2.zG = value.BPI;
                    }
                } else {
                    YFl.put(key, value);
                }
            }
        } catch (Exception unused2) {
        }
    }

    @NonNull
    private static File Sg() {
        return new File(lG.YFl().getFilesDir(), "tt_ads_conf");
    }

    private static Sg Sg(String str) {
        return new Sg(str, 1);
    }

    private static Sg YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new Sg(jSONObject);
    }

    @NonNull
    public static Sg YFl(String str) {
        Sg sg2 = YFl.get(str);
        return sg2 == null ? Sg(str) : sg2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void YFl(org.json.JSONArray r5) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            java.io.File r0 = Sg()
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
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r3 == 0) goto L2f
            r1.delete()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
        L2f:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r3.write(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.lG.YFl()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            com.bytedance.sdk.openadsdk.utils.hQ r0 = com.bytedance.sdk.openadsdk.utils.hQ.YFl(r0, r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r2 = "ad_slot_conf"
            r0.YFl(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            boolean r0 = r1.exists()
            if (r0 == 0) goto L56
            r1.delete()
        L56:
            com.bytedance.sdk.openadsdk.utils.nc.YFl(r3)
            goto L76
        L5a:
            r5 = move-exception
            r2 = r3
            goto Lba
        L5d:
            r0 = move-exception
            r2 = r3
            goto L63
        L60:
            r5 = move-exception
            goto Lba
        L62:
            r0 = move-exception
        L63:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L60
            boolean r0 = r1.exists()
            if (r0 == 0) goto L73
            r1.delete()
        L73:
            com.bytedance.sdk.openadsdk.utils.nc.YFl(r2)
        L76:
            java.util.HashMap r5 = Sg(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lb9
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L88:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.Sg r0 = (com.bytedance.sdk.openadsdk.core.settings.Sg) r0
            boolean r2 = r0.Sco
            if (r2 == 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.Sg> r2 = com.bytedance.sdk.openadsdk.core.settings.tN.YFl
            java.lang.Object r1 = r2.get(r1)
            com.bytedance.sdk.openadsdk.core.settings.Sg r1 = (com.bytedance.sdk.openadsdk.core.settings.Sg) r1
            if (r1 == 0) goto L88
            java.lang.String r0 = r0.BPI
            r1.zG = r0
            goto L88
        Lb3:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.Sg> r2 = com.bytedance.sdk.openadsdk.core.settings.tN.YFl
            r2.put(r1, r0)
            goto L88
        Lb9:
            return
        Lba:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lc3
            r1.delete()
        Lc3:
            com.bytedance.sdk.openadsdk.utils.nc.YFl(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.tN.YFl(org.json.JSONArray):void");
    }

    public static void YFl() {
        File Sg = Sg();
        if (Sg.exists()) {
            Sg.delete();
        }
    }
}
