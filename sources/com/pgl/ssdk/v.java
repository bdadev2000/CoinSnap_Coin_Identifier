package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static Context f19607a;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            w.b(v.b());
            com.pgl.ssdk.ces.a.meta(226, v.b(), null);
            C2062p.a(v.b());
        }
    }

    @DungeonFlag
    public static String a(Context context) {
        TelephonyManager telephonyManager;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
            jSONObject.put("envcode", ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", r.a(context));
            Object meta = com.pgl.ssdk.ces.a.meta(155, context, null);
            jSONObject.put("usb_debug", meta instanceof Boolean ? ((Boolean) meta).booleanValue() : false);
            JSONArray[] b = r.b(context);
            if (b != null) {
                jSONObject.put("sdata", b[0]);
                jSONObject.put("sdmta", b[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            int i9 = C2065t.b;
            if (i9 == -1) {
                SharedPreferences a6 = K.a(b());
                if (a6 != null && (i9 = a6.getInt("camera_count", -1)) != -1) {
                    C2065t.b = i9;
                } else {
                    AbstractC2049c.a(new RunnableC2064s());
                    i9 = -1;
                }
            }
            jSONObject.put("camera_count", i9);
            if (C2065t.f19598a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                C2065t.f19598a = telephonyManager.getSimState();
            }
            jSONObject.put("sim", C2065t.f19598a);
            jSONObject.put("virtual_display", w.a(context));
            jSONObject.put("acbs", C2062p.c(context));
            Object meta2 = com.pgl.ssdk.ces.a.meta(156, context, null);
            jSONObject.put("bl_unlock", meta2 instanceof Boolean ? ((Boolean) meta2).booleanValue() : false);
            jSONObject.put("easyclick", C2062p.a());
            C2066u.g();
            C2066u.a(jSONObject);
            String d2 = C2063q.d();
            if (!TextUtils.isEmpty(d2)) {
                jSONObject.put("sign", d2);
            }
            return (String) com.pgl.ssdk.ces.a.meta(227, context, jSONObject.toString());
        } catch (Throwable th) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, 3);
                jSONObject2.put("exception", th.toString());
                jSONObject2.put("stacktrace", Arrays.toString(th.getStackTrace()));
                jSONObject2.put("cause", String.valueOf(th.getCause()));
                return Base64.encodeToString(jSONObject2.toString().getBytes("UTF-8"), 0);
            } catch (Throwable unused) {
                return "eyJzdGF0dXMiOjN9";
            }
        }
    }

    public static void b(Context context) {
        f19607a = context;
    }

    public static String c() {
        String a6 = a(f19607a);
        a();
        return a6;
    }

    public static Context b() {
        return f19607a;
    }

    @DungeonFlag
    public static void a() {
        AbstractC2049c.a(new a());
    }
}
