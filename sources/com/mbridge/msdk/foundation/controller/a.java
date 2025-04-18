package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {
    public static final String a = "c";

    /* renamed from: b, reason: collision with root package name */
    public static HashMap<String, String> f13020b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected String f13021c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f13022d;

    /* renamed from: e, reason: collision with root package name */
    protected String f13023e;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f13025g;

    /* renamed from: h, reason: collision with root package name */
    private String f13026h;

    /* renamed from: i, reason: collision with root package name */
    private int f13027i;

    /* renamed from: l, reason: collision with root package name */
    private String f13030l;

    /* renamed from: m, reason: collision with root package name */
    private String f13031m;

    /* renamed from: n, reason: collision with root package name */
    private int f13032n;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference<Context> f13034p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f13035q;

    /* renamed from: s, reason: collision with root package name */
    private String f13037s;

    /* renamed from: f, reason: collision with root package name */
    private final g f13024f = new g();

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f13028j = new JSONObject();

    /* renamed from: k, reason: collision with root package name */
    private boolean f13029k = false;

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f13033o = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private int f13036r = 0;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0168a {
    }

    public final WeakReference<Activity> a() {
        return this.f13025g;
    }

    public abstract void a(InterfaceC0168a interfaceC0168a);

    public final String b() {
        if (!TextUtils.isEmpty(this.f13030l)) {
            return this.f13030l;
        }
        Context context = this.f13022d;
        if (context != null) {
            return (String) al.a(context, "sp_appKey", "");
        }
        return null;
    }

    public final Context c() {
        return this.f13022d;
    }

    public final g d() {
        return this.f13024f;
    }

    public final Context e() {
        WeakReference<Context> weakReference = this.f13034p;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int f() {
        return this.f13027i;
    }

    public final String g() {
        try {
            if (!TextUtils.isEmpty(this.f13023e)) {
                return this.f13023e;
            }
            Context context = this.f13022d;
            if (context != null) {
                String packageName = context.getPackageName();
                this.f13023e = packageName;
                return packageName;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.f13031m)) {
            return this.f13031m;
        }
        Context context = this.f13022d;
        if (context != null) {
            return (String) al.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public final JSONObject i() {
        return this.f13035q;
    }

    public final int j() {
        return this.f13036r;
    }

    public final String k() {
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f13021c)) {
            return this.f13021c;
        }
        Context context = this.f13022d;
        if (context != null) {
            return (String) al.a(context, "sp_appId", "");
        }
        return "";
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.f13037s)) {
            return this.f13037s;
        }
        try {
            String md5 = SameMD5.getMD5(c.m().k() + c.m().b());
            this.f13037s = md5;
            return md5;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(WeakReference<Activity> weakReference) {
        this.f13025g = weakReference;
    }

    public final void c(int i10) {
        this.f13036r = i10;
    }

    public final void d(String str) {
        Context context;
        try {
            this.f13021c = str;
            if (TextUtils.isEmpty(str) || (context = this.f13022d) == null) {
                return;
            }
            al.b(context, "sp_appId", str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void e(String str) {
        Context context;
        try {
            this.f13030l = str;
            if (TextUtils.isEmpty(str) || (context = this.f13022d) == null) {
                return;
            }
            al.b(context, "sp_appKey", str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13023e = str;
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            this.f13034p = new WeakReference<>(context);
        }
    }

    public final void c(String str) {
        Context context;
        try {
            this.f13026h = str;
            if (TextUtils.isEmpty(str) || (context = this.f13022d) == null) {
                return;
            }
            al.b(context, "applicationIds", str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(int i10) {
        this.f13027i = i10;
    }

    public final void b(int i10) {
        this.f13032n = i10;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f13031m = str;
            Context context = this.f13022d;
            if (context != null) {
                al.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            if (this.f13033o != null && !TextUtils.isEmpty(str) && this.f13033o.containsKey(str)) {
                this.f13033o.remove(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(Context context) {
        this.f13022d = context;
    }

    public final BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f13033o) == null || !concurrentHashMap.containsKey(str) || !af.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.f13033o.get(str);
        BitmapDrawable n10 = ai.n(str2);
        i.a(str, i10, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : n10 != null ? "" : "str to bitmap failed", n10 == null ? 2 : 1, str2);
        return n10;
    }

    public final void a(JSONObject jSONObject) {
        this.f13035q = jSONObject;
    }

    public final void a(final InterfaceC0168a interfaceC0168a, final Handler handler) {
        if (this.f13029k) {
            return;
        }
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.a() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object a10 = al.a(this.f13022d, MBridgeConstans.SP_GA_ID, "");
                Object a11 = al.a(this.f13022d, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (a10 instanceof String) {
                    String str = (String) a10;
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.foundation.tools.e.a(str);
                    } else {
                        com.mbridge.msdk.foundation.tools.e.c();
                    }
                    if (a11 instanceof Integer) {
                        com.mbridge.msdk.foundation.tools.e.a(((Integer) a11).intValue());
                    }
                }
            }
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f13035q = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            ad.b(a, e10.getMessage());
        }
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                try {
                    z.o(a.this.f13022d);
                    a.this.a(interfaceC0168a);
                    a aVar = a.this;
                    h.a(aVar.f13022d, aVar.f13021c);
                } catch (Exception e11) {
                    ad.b(a.a, e11.getMessage());
                }
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                    try {
                        if (a.this.f13022d.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        z.c(i10);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z.c(0);
                    } catch (Throwable th2) {
                        ad.b(a.a, th2.getMessage());
                    }
                }
                try {
                    com.mbridge.msdk.c.g b3 = h.a().b(c.m().k());
                    if (b3 == null) {
                        h.a();
                        b3 = com.mbridge.msdk.c.i.a();
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = b3;
                    obtain.what = 9;
                    handler.sendMessage(obtain);
                } catch (Exception e12) {
                    ad.b(a.a, e12.getMessage());
                }
            }
        }).start();
    }

    public final void a(String str, JSONObject jSONObject) {
        if (af.a().a("w_m_r_l", true)) {
            try {
                if (this.f13028j == null) {
                    this.f13028j = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f13028j.put(next, jSONObject.get(next));
                    }
                }
                if (this.f13028j.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f13033o == null) {
                        this.f13033o = new ConcurrentHashMap<>();
                    }
                    this.f13033o.put(str, this.f13028j.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
