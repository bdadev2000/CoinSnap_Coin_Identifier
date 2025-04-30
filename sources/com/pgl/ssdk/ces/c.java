package com.pgl.ssdk.ces;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.o;
import com.pgl.ssdk.A;
import com.pgl.ssdk.AbstractC2049c;
import com.pgl.ssdk.B;
import com.pgl.ssdk.C;
import com.pgl.ssdk.C2063q;
import com.pgl.ssdk.E;
import com.pgl.ssdk.G;
import com.pgl.ssdk.J;
import com.pgl.ssdk.K;
import com.pgl.ssdk.L;
import com.pgl.ssdk.P;
import com.pgl.ssdk.Q;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.v;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static volatile c f19556h = null;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f19557i = false;

    /* renamed from: j, reason: collision with root package name */
    private static Map<String, Object> f19558j = null;

    /* renamed from: k, reason: collision with root package name */
    private static int f19559k = 1;
    private static J.a l;

    /* renamed from: a, reason: collision with root package name */
    public Context f19560a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f19561c;

    /* renamed from: d, reason: collision with root package name */
    private int f19562d;

    /* renamed from: e, reason: collision with root package name */
    private String f19563e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f19564f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f19565g = null;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            v.a(v.b());
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C.a(c.this.f19560a).a();
            B.a(c.this.f19560a).a();
        }
    }

    private c(Context context, String str) {
        this.f19560a = context;
        this.b = str;
    }

    public static c a(Context context, String str, int i9, int i10, int i11) {
        Application application;
        if (f19556h == null) {
            synchronized (c.class) {
                try {
                    if (f19556h == null) {
                        if (context == null) {
                            try {
                                application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
                            } catch (Throwable unused) {
                                application = null;
                            }
                            context = application.getApplicationContext();
                        }
                        if (context == null) {
                            f19559k = 4;
                            return null;
                        }
                        E.f19525a = i9;
                        J.a a6 = J.a(context, "nms");
                        if (a6 != null) {
                            f19559k = a6.f19544a;
                            l = a6;
                            return null;
                        }
                        c cVar = new c(context, str);
                        f19556h = cVar;
                        cVar.f19561c = i10;
                        f19556h.f19562d = i11;
                        f19556h.a(context);
                        c cVar2 = f19556h;
                        SharedPreferences a9 = K.a(context);
                        String string = a9 != null ? a9.getString("iid", "") : "";
                        if (TextUtils.isEmpty(string)) {
                            string = UUID.randomUUID().toString();
                            SharedPreferences a10 = K.a(context);
                            if (a10 != null) {
                                a10.edit().putString("iid", string).commit();
                            }
                        }
                        cVar2.getClass();
                        if (!TextUtils.isEmpty(string)) {
                            com.pgl.ssdk.ces.a.meta(104, null, string);
                        }
                        v.b(context);
                        f19559k = 0;
                        AbstractC2049c.a(new a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19556h;
    }

    public static String c() {
        if (f19556h != null) {
            return f19556h.b;
        }
        return null;
    }

    public static String d() {
        if (f19556h != null) {
            return f19556h.f19563e;
        }
        return null;
    }

    public static int e() {
        return f19559k;
    }

    public static c f() {
        return f19556h;
    }

    public static J.a g() {
        return l;
    }

    public void b() {
        Map<String, Object> map = f19558j;
        if (map != null) {
            Object obj = map.get(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ);
            if (obj instanceof String) {
                String str = (String) obj;
                String[] split = !TextUtils.isEmpty(str) ? str.split("//") : null;
                ArrayList arrayList = new ArrayList();
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        try {
                            Class.forName(str2);
                            arrayList.add(str2);
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                String obj2 = !arrayList.isEmpty() ? arrayList.toString() : null;
                if (TextUtils.isEmpty(obj2)) {
                    return;
                }
                com.pgl.ssdk.ces.a.meta(159, null, obj2);
            }
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19565g)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f19565g = str;
            Q.c();
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19564f)) {
            com.pgl.ssdk.ces.a.meta(112, null, str);
            this.f19564f = str;
            Q.c();
        }
    }

    public synchronized void b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19563e)) {
            com.pgl.ssdk.ces.a.meta(103, null, str);
            Q.c();
            this.f19563e = str;
        }
    }

    private void a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (context == null || f19557i) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.b);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f19561c));
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC2049c.a(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            try {
                str = context.getPackageName();
            } catch (Throwable unused) {
                str = null;
            }
            sb2.append(str == null ? "" : str.trim());
            com.pgl.ssdk.ces.a.meta(106, null, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            try {
                str2 = context.getFilesDir().getAbsolutePath();
            } catch (Throwable unused2) {
                str2 = null;
            }
            sb3.append(str2 == null ? "" : str2.trim());
            com.pgl.ssdk.ces.a.meta(107, null, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            try {
                str3 = context.getApplicationInfo().sourceDir;
            } catch (Throwable unused3) {
                str3 = null;
            }
            sb4.append(str3 == null ? "" : str3.trim());
            com.pgl.ssdk.ces.a.meta(108, null, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            try {
                str4 = Environment.getExternalStorageDirectory().getAbsolutePath();
            } catch (Throwable unused4) {
                str4 = null;
            }
            sb5.append(str4 == null ? "" : str4.trim());
            com.pgl.ssdk.ces.a.meta(109, null, sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            try {
                str5 = Environment.getDataDirectory().getPath();
            } catch (Throwable unused5) {
                str5 = null;
            }
            sb6.append(str5 != null ? str5.trim() : "");
            com.pgl.ssdk.ces.a.meta(110, null, sb6.toString());
            f19557i = true;
        } catch (Throwable unused6) {
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        this.f19563e = str2;
        this.f19564f = str3;
        com.pgl.ssdk.ces.a.meta(113, null, str);
        com.pgl.ssdk.ces.a.meta(112, null, str3);
        com.pgl.ssdk.ces.a.meta(103, null, str2);
        com.pgl.ssdk.ces.a.meta(111, null, str4);
        try {
            G.b();
            Q.a(this.f19560a, this.b);
            a("CZL-L1st");
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        P c9;
        try {
            if ("CZL-L1st".equals(str) && (c9 = L.a().c()) != null) {
                c9.postDelayed(new d(this.f19560a, str), 10000L);
            }
            AbstractC2049c.a(new b());
            v.a();
        } catch (Throwable unused) {
        }
    }

    public Object a(int i9, Object obj) {
        if (i9 == 123) {
            return A.a(this.f19560a);
        }
        if (i9 == 121) {
            return LocaleList.getDefault().get(0).getLanguage();
        }
        String str = null;
        if (i9 == 122) {
            try {
                str = TimeZone.getDefault().getDisplayName(false, 0);
            } catch (Throwable unused) {
            }
            if (str != null) {
                return str.trim();
            }
        } else {
            if (i9 == 126) {
                return y.a(this.f19560a);
            }
            if (i9 != 128) {
                if (i9 == 120) {
                    return x.b();
                }
                if (i9 == 124) {
                    return "[]";
                }
                if (i9 != 130) {
                    if (i9 == 145) {
                        Context context = this.f19560a;
                        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                        String str2 = (wifiManager == null || !wifiManager.isWifiEnabled()) ? "0" : "1";
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager != null) {
                            StringBuilder b8 = AbstractC2965e.b(str2);
                            b8.append(telephonyManager.getSimState() != 5 ? "0" : "1");
                            return b8.toString();
                        }
                        return o.j(str2, "0");
                    }
                    if (i9 != 125) {
                        if (i9 == 129) {
                            return z.b(this.f19560a);
                        }
                        if (i9 == 141) {
                            Context context2 = this.f19560a;
                            int i10 = -1;
                            if (context2 != null) {
                                try {
                                    i10 = Settings.System.getInt(context2.getContentResolver(), "screen_brightness", -1);
                                } catch (Throwable unused2) {
                                }
                            }
                            return String.valueOf(i10);
                        }
                        if (i9 == 131) {
                            return Q.a();
                        }
                        if (i9 == 132) {
                            a((String) obj);
                        } else {
                            if (i9 == 134) {
                                return C.a(this.f19560a).b();
                            }
                            if (i9 == 140) {
                                return B.a(this.f19560a).c();
                            }
                            if (i9 == 144) {
                                return B.a(this.f19560a).b();
                            }
                            if (i9 == 133) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    for (Map.Entry<String, Object> entry : f19558j.entrySet()) {
                                        if (entry.getValue() == null) {
                                            jSONObject.put(entry.getKey(), "");
                                        } else {
                                            jSONObject.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    str = jSONObject.toString();
                                } catch (Throwable unused3) {
                                }
                                return str == null ? JsonUtils.EMPTY_JSON : str.trim();
                            }
                            try {
                                if (i9 == 135) {
                                    byte[] byteArray = this.f19560a.getPackageManager().getPackageInfo(this.f19560a.getPackageName(), 64).signatures[0].toByteArray();
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                                    if (messageDigest != null) {
                                        byte[] digest = messageDigest.digest(byteArray);
                                        StringBuilder sb = new StringBuilder();
                                        for (byte b9 : digest) {
                                            sb.append(Integer.toHexString((b9 & 255) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                                            sb.append(":");
                                        }
                                        return sb.substring(0, sb.length() - 1);
                                    }
                                } else {
                                    if (i9 == 136) {
                                        return this.f19560a.getPackageManager().getPackageInfo(this.f19560a.getPackageName(), 64).signatures[0].toByteArray();
                                    }
                                    if (i9 == 201) {
                                        try {
                                            str = Settings.Secure.getString(this.f19560a.getContentResolver(), "android_id");
                                        } catch (Throwable unused4) {
                                        }
                                        if (str != null) {
                                            return str.trim();
                                        }
                                    } else if (i9 != 202) {
                                        if (i9 == 236) {
                                            try {
                                                return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, (String) obj);
                                            } catch (Throwable unused5) {
                                                return null;
                                            }
                                        }
                                        if (i9 == 142) {
                                            try {
                                                str = this.f19560a.getPackageResourcePath();
                                            } catch (Throwable unused6) {
                                            }
                                            if (str != null) {
                                                return str.trim();
                                            }
                                        } else {
                                            if (i9 == 143) {
                                                return A.b(this.f19560a);
                                            }
                                            if (i9 == 146) {
                                                try {
                                                    return C2063q.b();
                                                } catch (Throwable unused7) {
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable unused8) {
                            }
                        }
                    }
                }
                return null;
            }
        }
        return "";
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            f19558j = map;
        }
    }

    public void a() {
        AbstractC2049c.a(new b());
    }
}
