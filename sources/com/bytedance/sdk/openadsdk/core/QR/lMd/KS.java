package com.bytedance.sdk.openadsdk.core.QR.lMd;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.yRU;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.QR.lMd.lMd;
import com.bytedance.sdk.openadsdk.core.QR.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private static final Map<String, lMd> COT = new ConcurrentHashMap();
    private static final AtomicBoolean HWF = new AtomicBoolean(false);
    private boolean KS;
    private boolean jU;
    private EnumC0101KS lMd;
    private final String zp;

    /* renamed from: com.bytedance.sdk.openadsdk.core.QR.lMd.KS$KS, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0101KS {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    /* loaded from: classes.dex */
    public static class lMd {
        float KS;
        woN lMd;
        String zp;

        public lMd(String str, woN won) {
            this(str, won, -1.0f);
        }

        public lMd(String str, woN won, float f9) {
            this.zp = str;
            this.lMd = won;
            this.KS = f9;
        }
    }

    /* loaded from: classes.dex */
    public static class zp {
        private final String zp;
        private EnumC0101KS lMd = EnumC0101KS.TRACKING_URL;
        private boolean KS = false;

        public zp(String str) {
            this.zp = str;
        }

        public zp zp(boolean z8) {
            this.KS = z8;
            return this;
        }

        public KS zp() {
            return new KS(this.zp, this.lMd, Boolean.valueOf(this.KS));
        }
    }

    static {
        yRU.zp(new yRU.zp() { // from class: com.bytedance.sdk.openadsdk.core.QR.lMd.KS.1
            @Override // com.bytedance.sdk.component.utils.yRU.zp
            public void zp(Context context, Intent intent, boolean z8, int i9) {
                if (i9 != 0 && KS.COT.size() > 0) {
                    KS.lMd();
                }
            }
        }, KVG.zp());
    }

    public KS(String str, EnumC0101KS enumC0101KS, Boolean bool) {
        this.zp = str;
        this.lMd = enumC0101KS;
        this.KS = bool.booleanValue();
    }

    public static void lMd(@NonNull List<KS> list, @Nullable com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar, @Nullable long j7, @Nullable String str) {
        zp(list, zpVar, j7, str, null);
    }

    public boolean COT() {
        return this.jU;
    }

    public String KS() {
        return this.zp;
    }

    public void h_() {
        this.jU = true;
    }

    public boolean jU() {
        return this.KS;
    }

    public static List<com.bytedance.sdk.openadsdk.core.QR.lMd.zp> KS(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    arrayList.add(new zp.C0102zp(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), optJSONObject.optLong("trackingMilliseconds", 0L)).zp());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd() {
        if (HWF.compareAndSet(false, true)) {
            Map<String, lMd> map = COT;
            HashSet hashSet = new HashSet(map.entrySet());
            map.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    zp((String) entry.getKey(), (lMd) entry.getValue(), true);
                }
            }
            HWF.set(false);
        }
    }

    public static List<String> zp(@NonNull List<KS> list, @Nullable com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar, @Nullable long j7, @Nullable String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (KS ks : list) {
            if (ks != null && (!ks.COT() || ks.jU())) {
                arrayList.add(ks.KS());
                ks.h_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.QR.KS.KS(arrayList).zp(zpVar).zp(j7).zp(str).zp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(final boolean z8, final String str, final String str2, final lMd lmd, final String str3, final boolean z9) {
        com.bytedance.sdk.openadsdk.lMd.KS.zp(new ku("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.QR.lMd.KS.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", lmd.zp);
                    jSONObject.put("success", z8);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put("url", str3);
                    if (lmd.KS >= 0.0f) {
                        jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, Math.round(r1 * 100.0f) / 100.0d);
                    }
                    if (z9) {
                        jSONObject.put("retry", true);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(lmd.lMd, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.QR.lMd.lMd> lMd(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    arrayList.add(new lMd.zp(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).zp());
                }
            }
        }
        return arrayList;
    }

    public static void zp(@NonNull List<KS> list, @Nullable com.bytedance.sdk.openadsdk.core.QR.zp.zp zpVar, @Nullable long j7, @Nullable String str, lMd lmd) {
        zp(zp(list, zpVar, j7, str), lmd);
    }

    public static void zp(List<String> list, lMd lmd) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = list.get(i9);
            if (!TextUtils.isEmpty(str)) {
                zp(str, lmd, false);
            }
        }
    }

    private static void zp(final String str, final lMd lmd, final boolean z8) {
        com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
        if (KS == null) {
            return;
        }
        KS.zp(true);
        KS.lMd(str);
        KS.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.QR.lMd.KS.2
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd2) {
                boolean z9;
                lMd lmd3 = lMd.this;
                if (lmd3 == null || lmd3.lMd == null) {
                    return;
                }
                String str2 = null;
                if (lmd2 == null || !lmd2.HWF()) {
                    z9 = false;
                    if (lmd2 != null) {
                        str2 = lmd2.zp() + ":" + lmd2.lMd();
                        if (!z8 && (lmd2.zp() <= 300 || lmd2.zp() >= 400)) {
                            KS.COT.put(str, lMd.this);
                        }
                    }
                } else {
                    z9 = true;
                }
                KS.lMd(z9, str2, YhE.KS(lMd.this.lMd.Dp()), lMd.this, str, z8);
                if (lmd2 == null || lmd2.zp() != 200 || KS.COT.size() <= 0) {
                    return;
                }
                KS.lMd();
            }

            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                woN won;
                lMd lmd2 = lMd.this;
                if (lmd2 != null && (won = lmd2.lMd) != null) {
                    KS.lMd(false, iOException != null ? iOException.getMessage() : null, YhE.KS(won.Dp()), lMd.this, str, z8);
                }
                if (z8 || lMd.this == null) {
                    return;
                }
                KS.COT.put(str, lMd.this);
            }
        });
    }

    public static JSONArray zp(List<KS> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < list.size(); i9++) {
            jSONArray.put(list.get(i9).KS());
        }
        return jSONArray;
    }

    public static List<KS> zp(JSONArray jSONArray) {
        return zp(jSONArray, false);
    }

    public static List<KS> zp(JSONArray jSONArray, boolean z8) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                String optString = jSONArray.optString(i9);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new zp(optString).zp(z8).zp());
                }
            }
        }
        return arrayList;
    }
}
