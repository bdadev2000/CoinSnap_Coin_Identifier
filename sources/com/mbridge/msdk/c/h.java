package com.mbridge.msdk.c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14728a = "h";
    private static volatile h b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile g f14729c;

    /* renamed from: d, reason: collision with root package name */
    private static HashMap<String, k> f14730d = new HashMap<>();

    private h() {
    }

    public static void a(Context context, String str) {
        FastKV fastKV;
        com.mbridge.msdk.foundation.controller.d.a();
        Map<String, Object> map = null;
        try {
            fastKV = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
        } catch (Exception unused) {
            fastKV = null;
        }
        if (fastKV != null) {
            try {
                map = fastKV.getAll();
            } catch (Exception unused2) {
            }
            if (map != null) {
                try {
                    for (String str2 : map.keySet()) {
                        if (str2.startsWith(str + "_")) {
                            f14730d.put(str2, k.g((String) map.get(str2)));
                        }
                    }
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            Map<String, ?> all = context.getSharedPreferences("mbridge", 0).getAll();
            for (String str3 : all.keySet()) {
                if (str3.startsWith(str + "_")) {
                    f14730d.put(str3, k.g((String) all.get(str3)));
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private k i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.m().k();
        }
        String k6 = o.k(str, "_", str2);
        if (f14730d.containsKey(k6)) {
            return f14730d.get(k6);
        }
        k kVar = null;
        try {
            kVar = k.g(com.mbridge.msdk.foundation.a.a.a.a().a(k6));
            f14730d.put(k6, kVar);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return kVar;
    }

    public final g b(String str) {
        if (f14729c == null) {
            try {
                String a6 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (!TextUtils.isEmpty(a6)) {
                    JSONObject jSONObject = new JSONObject(a6);
                    if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    }
                    if (jSONObject.has(com.mbridge.msdk.foundation.controller.a.f15376a)) {
                        jSONObject.remove(com.mbridge.msdk.foundation.controller.a.f15376a);
                    }
                    f14729c = g.e(jSONObject.toString());
                    if (f14729c != null) {
                        f14729c.aI();
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return f14729c;
    }

    public final String c(String str) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("ivreward_" + str);
    }

    public final k d(String str, String str2) {
        k i9 = i(str, str2);
        if (i9 != null && i9.v() == 0) {
            i9.a(1);
        }
        return i9;
    }

    public final boolean e(String str, String str2) {
        g b8 = b(str2);
        if (d(str2) && a(str2, 1, str)) {
            new j().a(com.mbridge.msdk.foundation.controller.c.m().c(), str2, com.mbridge.msdk.foundation.controller.c.m().b());
        }
        k d2 = d(str2, str);
        if (b8 != null && d2 != null) {
            long aq = b8.aq() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long i9 = d2.i() + aq;
            if (i9 > currentTimeMillis) {
                String str3 = f14728a;
                StringBuilder a6 = AbstractC2933a.a("unit setting  nexttime is not ready  [settingNextRequestTime= ", i9, " currentTime = ");
                a6.append(currentTimeMillis);
                a6.append("]");
                ad.c(str3, a6.toString());
                return false;
            }
        }
        ad.c(f14728a, "unit setting timeout or not exists");
        return true;
    }

    public final void f(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a("ivreward_" + str, str2);
    }

    public final String g(String str) {
        if (str == null) {
            return "";
        }
        try {
            String a6 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
            return a6 == null ? "" : a6;
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
            return "";
        }
    }

    public final void h(String str, String str2) {
        try {
            String a6 = com.mbridge.msdk.foundation.a.a.a.a().a(str + "_" + str2);
            if (!TextUtils.isEmpty(a6)) {
                JSONObject jSONObject = new JSONObject(a6);
                jSONObject.put("current_time", System.currentTimeMillis());
                a(str, str2, jSONObject.toString());
            }
        } catch (Throwable th) {
            ad.b(f14728a, th.getMessage());
        }
    }

    public final k c(String str, String str2) {
        k d2 = d(str, str2);
        return d2 == null ? k.y() : d2;
    }

    public final void f(String str) {
        try {
            String g9 = g(str);
            if (TextUtils.isEmpty(g9)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(g9);
            jSONObject.put("current_time", System.currentTimeMillis());
            g(str, jSONObject.toString());
        } catch (Throwable th) {
            ad.b(f14728a, th.getMessage());
        }
    }

    public final boolean d(String str) {
        g b8 = b(str);
        if (b8 != null) {
            long E8 = b8.E() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long A8 = b8.A() + E8;
            if (A8 > currentTimeMillis) {
                String str2 = f14728a;
                StringBuilder a6 = AbstractC2933a.a("app setting nexttime is not ready  [settingNextRequestTime= ", A8, " currentTime = ");
                a6.append(currentTimeMillis);
                a6.append("]");
                ad.c(str2, a6.toString());
                return false;
            }
        }
        ad.c(f14728a, "app setting timeout or not exists");
        return true;
    }

    public final void g(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a(str, str2);
        f14729c = g.e(str2);
        if (f14729c != null) {
            f14729c.aI();
        }
    }

    public final k b(String str, String str2) {
        return i(str, str2);
    }

    public final void e(String str) {
        com.mbridge.msdk.foundation.a.a.a.a().c("ivreward_" + str);
    }

    public static h a() {
        if (b == null) {
            synchronized (h.class) {
                try {
                    if (b == null) {
                        b = new h();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final g a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return i.a();
            }
            g b8 = b(str);
            return b8 == null ? i.a() : b8;
        } catch (Exception unused) {
            return i.a();
        }
    }

    public final boolean a(String str, int i9, String str2) {
        try {
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            String str3 = str + "_" + i9 + "_" + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j7 = 0;
            long longValue = ((Long) al.a(c9, str3, 0L)).longValue();
            g b8 = b(str);
            if (b8 == null) {
                a();
                b8 = i.a();
            } else {
                j7 = longValue;
            }
            if ((b8.al() * 1000) + j7 > currentTimeMillis) {
                return false;
            }
            al.b(c9, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public final void a(String str, String str2, String str3) {
        String k6 = o.k(str, "_", str2);
        com.mbridge.msdk.foundation.a.a.a.a().a(k6, str3);
        f14730d.put(k6, k.g(str3));
    }

    public final k a(String str, String str2) {
        k i9 = i(str, str2);
        return i9 == null ? k.y() : i9;
    }
}
