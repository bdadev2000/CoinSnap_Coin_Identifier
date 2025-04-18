package com.mbridge.msdk.foundation.same.net.e;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.tracker.network.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes4.dex */
public final class c {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private int f13381b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f13382c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f13383d;

    /* loaded from: classes4.dex */
    public static class a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public String f13384b;

        /* renamed from: c, reason: collision with root package name */
        public long f13385c;

        public a(long j3, int i10, String str) {
            this.f13385c = j3;
            this.a = i10;
            this.f13384b = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        private static final c a = new c();
    }

    public static c a() {
        return b.a;
    }

    private com.mbridge.msdk.foundation.same.net.d b(String str, String str2, String str3, String str4, String str5) {
        int parseInt;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(str3);
        sb2.append("_");
        sb2.append(str2);
        String h10 = e.h(sb2, "_", str5);
        a a10 = a(h10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h("data_res_type", "1"));
        if (a10 != null && !TextUtils.isEmpty(a10.f13384b)) {
            try {
                if (a10.a != -1) {
                    return com.mbridge.msdk.foundation.same.net.d.a(new JSONObject(a10.f13384b), new com.mbridge.msdk.foundation.same.net.d.a(200, a10.f13384b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (parseInt = Integer.parseInt(str5)) != 287 && parseInt != 94) {
                    if (System.currentTimeMillis() < (com.mbridge.msdk.c.h.a().a(str, str2).n() * 1000) + a10.f13385c) {
                        return com.mbridge.msdk.foundation.same.net.d.a(new JSONObject(a10.f13384b), new com.mbridge.msdk.foundation.same.net.d.a(200, a10.f13384b.getBytes(), arrayList));
                    }
                    this.f13382c.remove(h10);
                    return null;
                }
            } catch (Exception e2) {
                ad.b("IDErrorUtil", e2.getMessage());
            }
        }
        ad.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private c() {
        this.a = "IDErrorUtil";
        this.f13382c = new ConcurrentHashMap<>();
        this.f13383d = new ArrayList<>();
        g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        if (d10 == null) {
            com.mbridge.msdk.c.h.a();
            d10 = i.a();
        }
        this.f13381b = d10.x() * 1000;
        if (d10.B() != null && d10.B().size() > 0) {
            ad.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f13383d.addAll(d10.B());
        } else {
            ad.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f13383d.addAll(Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616));
        }
    }

    public final synchronized void a(String str, int i10, String str2, long j3) {
        if (this.f13382c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f13383d.contains(Integer.valueOf(i10))) {
            ad.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f13382c.put(str, new a(j3, i10, str2));
        }
    }

    public final com.mbridge.msdk.foundation.same.net.d a(String str, String str2, String str3, String str4, String str5) {
        return b(str, str2, str3, str4, str5);
    }

    public final com.mbridge.msdk.foundation.same.net.d a(com.mbridge.msdk.foundation.same.net.f.e eVar) {
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
        if (!this.f13382c.containsKey(str) || (aVar = this.f13382c.get(str)) == null) {
            return null;
        }
        if (aVar.a == -1) {
            return aVar;
        }
        if (System.currentTimeMillis() > aVar.f13385c + this.f13381b) {
            this.f13382c.remove(str);
            if (this.f13382c.size() > 0) {
                for (Map.Entry<String, a> entry : this.f13382c.entrySet()) {
                    ad.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f13385c > this.f13381b) {
                        this.f13382c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        ad.b("IDErrorUtil", "getErrorInfo : " + aVar.f13384b);
        return aVar;
    }
}
