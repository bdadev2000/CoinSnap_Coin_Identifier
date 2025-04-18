package com.mbridge.msdk.c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class h {
    public static final String a = "h";

    /* renamed from: b, reason: collision with root package name */
    private static volatile h f12436b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile g f12437c;

    /* renamed from: d, reason: collision with root package name */
    private static HashMap<String, k> f12438d = new HashMap<>();

    private h() {
    }

    private k i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.m().k();
        }
        String m10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, "_", str2);
        if (f12438d.containsKey(m10)) {
            return f12438d.get(m10);
        }
        k kVar = null;
        try {
            kVar = k.g(com.mbridge.msdk.foundation.a.a.a.a().a(m10));
            f12438d.put(m10, kVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return kVar;
    }

    public final void a(String str, String str2, String str3) {
        String m10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, "_", str2);
        com.mbridge.msdk.foundation.a.a.a.a().a(m10, str3);
        f12438d.put(m10, k.g(str3));
    }

    public final g b(String str) {
        if (f12437c == null) {
            try {
                String a10 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (!TextUtils.isEmpty(a10)) {
                    JSONObject jSONObject = new JSONObject(a10);
                    if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    }
                    if (jSONObject.has(com.mbridge.msdk.foundation.controller.a.a)) {
                        jSONObject.remove(com.mbridge.msdk.foundation.controller.a.a);
                    }
                    f12437c = g.e(jSONObject.toString());
                    if (f12437c != null) {
                        f12437c.aI();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return f12437c;
    }

    public final String c(String str) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("ivreward_" + str);
    }

    public final k d(String str, String str2) {
        k i10 = i(str, str2);
        if (i10 != null && i10.v() == 0) {
            i10.a(1);
        }
        return i10;
    }

    public final boolean e(String str, String str2) {
        g b3 = b(str2);
        if (d(str2) && a(str2, 1, str)) {
            new j().a(com.mbridge.msdk.foundation.controller.c.m().c(), str2, com.mbridge.msdk.foundation.controller.c.m().b());
        }
        k d10 = d(str2, str);
        if (b3 != null && d10 != null) {
            long aq = b3.aq() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long i10 = d10.i() + aq;
            if (i10 > currentTimeMillis) {
                String str3 = a;
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("unit setting  nexttime is not ready  [settingNextRequestTime= ", i10, " currentTime = ");
                o10.append(currentTimeMillis);
                o10.append("]");
                ad.c(str3, o10.toString());
                return false;
            }
        }
        ad.c(a, "unit setting timeout or not exists");
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
            String a10 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
            return a10 == null ? "" : a10;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return "";
        }
    }

    public final void h(String str, String str2) {
        try {
            String a10 = com.mbridge.msdk.foundation.a.a.a.a().a(str + "_" + str2);
            if (!TextUtils.isEmpty(a10)) {
                JSONObject jSONObject = new JSONObject(a10);
                jSONObject.put("current_time", System.currentTimeMillis());
                a(str, str2, jSONObject.toString());
            }
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }

    public final k c(String str, String str2) {
        k d10 = d(str, str2);
        return d10 == null ? k.y() : d10;
    }

    public final void f(String str) {
        try {
            String g10 = g(str);
            if (TextUtils.isEmpty(g10)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(g10);
            jSONObject.put("current_time", System.currentTimeMillis());
            g(str, jSONObject.toString());
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }

    public final boolean d(String str) {
        g b3 = b(str);
        if (b3 != null) {
            long E = b3.E() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long A = b3.A() + E;
            if (A > currentTimeMillis) {
                String str2 = a;
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("app setting nexttime is not ready  [settingNextRequestTime= ", A, " currentTime = ");
                o10.append(currentTimeMillis);
                o10.append("]");
                ad.c(str2, o10.toString());
                return false;
            }
        }
        ad.c(a, "app setting timeout or not exists");
        return true;
    }

    public final void g(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a(str, str2);
        f12437c = g.e(str2);
        if (f12437c != null) {
            f12437c.aI();
        }
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
                            f12438d.put(str2, k.g((String) map.get(str2)));
                        }
                    }
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            Map<String, ?> all = context.getSharedPreferences("mbridge", 0).getAll();
            for (String str3 : all.keySet()) {
                if (str3.startsWith(str + "_")) {
                    f12438d.put(str3, k.g((String) all.get(str3)));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final k b(String str, String str2) {
        return i(str, str2);
    }

    public final void e(String str) {
        com.mbridge.msdk.foundation.a.a.a.a().c("ivreward_" + str);
    }

    public static h a() {
        if (f12436b == null) {
            synchronized (h.class) {
                if (f12436b == null) {
                    f12436b = new h();
                }
            }
        }
        return f12436b;
    }

    public final g a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return i.a();
            }
            g b3 = b(str);
            return b3 == null ? i.a() : b3;
        } catch (Exception unused) {
            return i.a();
        }
    }

    public final boolean a(String str, int i10, String str2) {
        try {
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            String str3 = str + "_" + i10 + "_" + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = 0;
            long longValue = ((Long) al.a(c10, str3, 0L)).longValue();
            g b3 = b(str);
            if (b3 == null) {
                a();
                b3 = i.a();
            } else {
                j3 = longValue;
            }
            if ((b3.al() * 1000) + j3 > currentTimeMillis) {
                return false;
            }
            al.b(c10, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
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
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public final k a(String str, String str2) {
        k i10 = i(str, str2);
        return i10 == null ? k.y() : i10;
    }
}
