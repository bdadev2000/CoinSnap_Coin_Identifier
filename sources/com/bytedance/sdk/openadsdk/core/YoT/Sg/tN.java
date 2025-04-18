package com.bytedance.sdk.openadsdk.core.YoT.Sg;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
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
public class tN {
    private boolean AlY;
    private EnumC0118tN Sg;
    private final String YFl;
    private boolean tN;
    private static final Map<String, Sg> wN = new ConcurrentHashMap();

    /* renamed from: vc, reason: collision with root package name */
    private static final AtomicBoolean f10652vc = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class Sg {
        Wwa Sg;
        String YFl;
        float tN;

        public Sg(String str, Wwa wwa) {
            this(str, wwa, -1.0f);
        }

        public Sg(String str, Wwa wwa, float f10) {
            this.YFl = str;
            this.Sg = wwa;
            this.tN = f10;
        }
    }

    /* loaded from: classes.dex */
    public static class YFl {
        private final String YFl;
        private EnumC0118tN Sg = EnumC0118tN.TRACKING_URL;
        private boolean tN = false;

        public YFl(String str) {
            this.YFl = str;
        }

        public YFl YFl(boolean z10) {
            this.tN = z10;
            return this;
        }

        public tN YFl() {
            return new tN(this.YFl, this.Sg, Boolean.valueOf(this.tN));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.YoT.Sg.tN$tN, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0118tN {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        Ne.YFl(new Ne.YFl() { // from class: com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.1
            @Override // com.bytedance.sdk.component.utils.Ne.YFl
            public void YFl(Context context, Intent intent, boolean z10, int i10) {
                if (i10 != 0 && tN.wN.size() > 0) {
                    tN.Sg();
                }
            }
        }, lG.YFl());
    }

    public tN(String str, EnumC0118tN enumC0118tN, Boolean bool) {
        this.YFl = str;
        this.Sg = enumC0118tN;
        this.tN = bool.booleanValue();
    }

    public static void Sg(@NonNull List<tN> list, @Nullable com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl, @Nullable long j3, @Nullable String str) {
        YFl(list, yFl, j3, str, null);
    }

    public boolean AlY() {
        return this.tN;
    }

    public void j_() {
        this.AlY = true;
    }

    public String tN() {
        return this.YFl;
    }

    public boolean wN() {
        return this.AlY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg() {
        if (f10652vc.compareAndSet(false, true)) {
            Map<String, Sg> map = wN;
            HashSet hashSet = new HashSet(map.entrySet());
            map.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    YFl((String) entry.getKey(), (Sg) entry.getValue(), true);
                }
            }
            f10652vc.set(false);
        }
    }

    public static List<String> YFl(@NonNull List<tN> list, @Nullable com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl, @Nullable long j3, @Nullable String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (tN tNVar : list) {
            if (tNVar != null && (!tNVar.wN() || tNVar.AlY())) {
                arrayList.add(tNVar.tN());
                tNVar.j_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.YoT.tN.tN(arrayList).YFl(yFl).YFl(j3).YFl(str).YFl();
    }

    public static List<com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl> tN(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new YFl.C0117YFl(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), optJSONObject.optLong("trackingMilliseconds", 0L)).YFl());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(final boolean z10, final String str, final String str2, final Sg sg2, final String str3, final boolean z11) {
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(new qsH("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", sg2.YFl);
                    jSONObject.put("success", z10);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put("url", str3);
                    if (sg2.tN >= 0.0f) {
                        jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, Math.round(r1 * 100.0f) / 100.0d);
                    }
                    if (z11) {
                        jSONObject.put("retry", true);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(sg2.Sg, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.YoT.Sg.Sg> Sg(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new Sg.YFl(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).YFl());
                }
            }
        }
        return arrayList;
    }

    public static void YFl(@NonNull List<tN> list, @Nullable com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl yFl, @Nullable long j3, @Nullable String str, Sg sg2) {
        YFl(YFl(list, yFl, j3, str), sg2);
    }

    public static void YFl(List<String> list, Sg sg2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                YFl(str, sg2, false);
            }
        }
    }

    private static void YFl(final String str, final Sg sg2, final boolean z10) {
        com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
        if (tN == null) {
            return;
        }
        tN.YFl(true);
        tN.Sg(str);
        tN.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.2
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg3) {
                boolean z11;
                Sg sg4 = Sg.this;
                if (sg4 == null || sg4.Sg == null) {
                    return;
                }
                String str2 = null;
                if (sg3 == null || !sg3.vc()) {
                    z11 = false;
                    if (sg3 != null) {
                        str2 = sg3.YFl() + ":" + sg3.Sg();
                        if (!z10 && (sg3.YFl() <= 300 || sg3.YFl() >= 400)) {
                            tN.wN.put(str, Sg.this);
                        }
                    }
                } else {
                    z11 = true;
                }
                tN.Sg(z11, str2, Sco.tN(Sg.this.Sg.Uv()), Sg.this, str, z10);
                if (sg3 == null || sg3.YFl() != 200 || tN.wN.size() <= 0) {
                    return;
                }
                tN.Sg();
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                Wwa wwa;
                Sg sg3 = Sg.this;
                if (sg3 != null && (wwa = sg3.Sg) != null) {
                    tN.Sg(false, iOException != null ? iOException.getMessage() : null, Sco.tN(wwa.Uv()), Sg.this, str, z10);
                }
                if (z10 || Sg.this == null) {
                    return;
                }
                tN.wN.put(str, Sg.this);
            }
        });
    }

    public static JSONArray YFl(List<tN> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).tN());
        }
        return jSONArray;
    }

    public static List<tN> YFl(JSONArray jSONArray) {
        return YFl(jSONArray, false);
    }

    public static List<tN> YFl(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new YFl(optString).YFl(z10).YFl());
                }
            }
        }
        return arrayList;
    }
}
