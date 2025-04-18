package com.pgl.ssdk;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1278v {
    private static Context a;

    /* renamed from: com.pgl.ssdk.v$a */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            w.b(C1278v.b());
            com.pgl.ssdk.ces.a.meta(226, C1278v.b(), null);
        }
    }

    @DungeonFlag
    public static String a(Context context) {
        TelephonyManager telephonyManager;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
            jSONObject.put("envcode", ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", C1275s.a(context));
            Object meta = com.pgl.ssdk.ces.a.meta(155, context, null);
            jSONObject.put("usb_debug", meta instanceof Boolean ? ((Boolean) meta).booleanValue() : false);
            JSONArray[] b3 = C1275s.b(context);
            if (b3 != null) {
                jSONObject.put("sdata", b3[0]);
                jSONObject.put("sdmta", b3[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            jSONObject.put("camera_count", C1276t.a());
            if (C1276t.a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                C1276t.a = telephonyManager.getSimState();
            }
            jSONObject.put("sim", C1276t.a);
            jSONObject.put("virtual_display", w.a(context));
            jSONObject.put("acbs", C1274q.a(context));
            Object meta2 = com.pgl.ssdk.ces.a.meta(156, context, null);
            jSONObject.put("bl_unlock", meta2 instanceof Boolean ? ((Boolean) meta2).booleanValue() : false);
            C1277u.g();
            C1277u.a(jSONObject);
            String e2 = r.e();
            jSONObject.put("romtype", C1275s.c());
            jSONObject.put("root", ((Integer) com.pgl.ssdk.ces.a.meta(162, null, null)).intValue());
            if (!TextUtils.isEmpty(e2)) {
                jSONObject.put("sign", e2);
            }
            return (String) com.pgl.ssdk.ces.a.meta(227, context, jSONObject.toString());
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, 3);
                jSONObject2.put("exception", th2.toString());
                jSONObject2.put("stacktrace", Arrays.toString(th2.getStackTrace()));
                jSONObject2.put("cause", String.valueOf(th2.getCause()));
                return Base64.encodeToString(jSONObject2.toString().getBytes("UTF-8"), 0);
            } catch (Throwable unused) {
                return "eyJzdGF0dXMiOjN9";
            }
        }
    }

    public static void b(Context context) {
        a = context;
    }

    public static String c() {
        String a10 = a(a);
        a();
        return a10;
    }

    public static Context b() {
        return a;
    }

    @DungeonFlag
    public static void a() {
        AbstractC1260c.a(new a());
    }
}
