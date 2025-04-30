package com.mbridge.msdk.foundation.same.net.e;

import android.text.TextUtils;
import com.applovin.impl.L;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.tracker.network.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15795a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f15796c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f15797d;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f15798a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public long f15799c;

        public a(long j7, int i9, String str) {
            this.f15799c = j7;
            this.f15798a = i9;
            this.b = str;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f15800a = new c();
    }

    public static c a() {
        return b.f15800a;
    }

    private com.mbridge.msdk.foundation.same.net.d b(String str, String str2, String str3, String str4, String str5) {
        int parseInt;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str3);
        sb.append("_");
        sb.append(str2);
        String h6 = AbstractC2914a.h(sb, "_", str5);
        a a6 = a(h6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h("data_res_type", "1"));
        if (a6 != null && !TextUtils.isEmpty(a6.b)) {
            try {
                if (a6.f15798a != -1) {
                    return com.mbridge.msdk.foundation.same.net.d.a(new JSONObject(a6.b), new com.mbridge.msdk.foundation.same.net.d.a(200, a6.b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (parseInt = Integer.parseInt(str5)) != 287 && parseInt != 94) {
                    if (System.currentTimeMillis() < (com.mbridge.msdk.c.h.a().a(str, str2).n() * 1000) + a6.f15799c) {
                        return com.mbridge.msdk.foundation.same.net.d.a(new JSONObject(a6.b), new com.mbridge.msdk.foundation.same.net.d.a(200, a6.b.getBytes(), arrayList));
                    }
                    this.f15796c.remove(h6);
                    return null;
                }
            } catch (Exception e4) {
                ad.b("IDErrorUtil", e4.getMessage());
            }
        }
        ad.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private c() {
        this.f15795a = "IDErrorUtil";
        this.f15796c = new ConcurrentHashMap<>();
        this.f15797d = new ArrayList<>();
        g f9 = L.f(com.mbridge.msdk.c.h.a());
        if (f9 == null) {
            com.mbridge.msdk.c.h.a();
            f9 = i.a();
        }
        this.b = f9.x() * 1000;
        if (f9.B() == null || f9.B().size() <= 0) {
            ad.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f15797d.addAll(Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616));
        } else {
            ad.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f15797d.addAll(f9.B());
        }
    }

    public final synchronized void a(String str, int i9, String str2, long j7) {
        if (this.f15796c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f15797d.contains(Integer.valueOf(i9))) {
            ad.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f15796c.put(str, new a(j7, i9, str2));
        }
    }

    public final com.mbridge.msdk.foundation.same.net.d a(String str, String str2, String str3, String str4, String str5) {
        return b(str, str2, str3, str4, str5);
    }

    public final com.mbridge.msdk.foundation.same.net.d a(e eVar) {
        String str = eVar.a().get(MBridgeConstans.APP_ID);
        String str2 = eVar.a().get(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String str4 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(str4)) {
            str4 = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(str4)) {
                str4 = str4.replace("[", "").replace("]", "");
            }
        }
        String str5 = str4;
        String str6 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str6)) {
            str6 = "0";
        }
        return b(str, str5, str3, eVar.a().get(BidResponsed.KEY_TOKEN), str6);
    }

    private synchronized a a(String str) {
        a aVar;
        ad.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f15796c.containsKey(str) || (aVar = this.f15796c.get(str)) == null) {
            return null;
        }
        if (aVar.f15798a == -1) {
            return aVar;
        }
        if (System.currentTimeMillis() > aVar.f15799c + this.b) {
            this.f15796c.remove(str);
            if (this.f15796c.size() > 0) {
                for (Map.Entry<String, a> entry : this.f15796c.entrySet()) {
                    ad.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f15799c > this.b) {
                        this.f15796c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        ad.b("IDErrorUtil", "getErrorInfo : " + aVar.b);
        return aVar;
    }
}
