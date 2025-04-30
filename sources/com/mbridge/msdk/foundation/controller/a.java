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

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15376a = "c";
    public static HashMap<String, String> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected String f15377c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f15378d;

    /* renamed from: e, reason: collision with root package name */
    protected String f15379e;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f15381g;

    /* renamed from: h, reason: collision with root package name */
    private String f15382h;

    /* renamed from: i, reason: collision with root package name */
    private int f15383i;
    private String l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private int f15386n;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference<Context> f15388p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f15389q;

    /* renamed from: s, reason: collision with root package name */
    private String f15391s;

    /* renamed from: f, reason: collision with root package name */
    private final g f15380f = new g();

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f15384j = new JSONObject();

    /* renamed from: k, reason: collision with root package name */
    private boolean f15385k = false;

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f15387o = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private int f15390r = 0;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0156a {
    }

    public final WeakReference<Activity> a() {
        return this.f15381g;
    }

    public abstract void a(InterfaceC0156a interfaceC0156a);

    public final String b() {
        if (!TextUtils.isEmpty(this.l)) {
            return this.l;
        }
        Context context = this.f15378d;
        if (context != null) {
            return (String) al.a(context, "sp_appKey", "");
        }
        return null;
    }

    public final Context c() {
        return this.f15378d;
    }

    public final g d() {
        return this.f15380f;
    }

    public final Context e() {
        WeakReference<Context> weakReference = this.f15388p;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int f() {
        return this.f15383i;
    }

    public final String g() {
        try {
            if (!TextUtils.isEmpty(this.f15379e)) {
                return this.f15379e;
            }
            Context context = this.f15378d;
            if (context != null) {
                String packageName = context.getPackageName();
                this.f15379e = packageName;
                return packageName;
            }
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.m)) {
            return this.m;
        }
        Context context = this.f15378d;
        if (context != null) {
            return (String) al.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public final JSONObject i() {
        return this.f15389q;
    }

    public final int j() {
        return this.f15390r;
    }

    public final String k() {
        try {
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f15377c)) {
            return this.f15377c;
        }
        Context context = this.f15378d;
        if (context != null) {
            return (String) al.a(context, "sp_appId", "");
        }
        return "";
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.f15391s)) {
            return this.f15391s;
        }
        try {
            String md5 = SameMD5.getMD5(c.m().k() + c.m().b());
            this.f15391s = md5;
            return md5;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(WeakReference<Activity> weakReference) {
        this.f15381g = weakReference;
    }

    public final void c(int i9) {
        this.f15390r = i9;
    }

    public final void d(String str) {
        Context context;
        try {
            this.f15377c = str;
            if (TextUtils.isEmpty(str) || (context = this.f15378d) == null) {
                return;
            }
            al.b(context, "sp_appId", str);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void e(String str) {
        Context context;
        try {
            this.l = str;
            if (TextUtils.isEmpty(str) || (context = this.f15378d) == null) {
                return;
            }
            al.b(context, "sp_appKey", str);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15379e = str;
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            this.f15388p = new WeakReference<>(context);
        }
    }

    public final void c(String str) {
        Context context;
        try {
            this.f15382h = str;
            if (TextUtils.isEmpty(str) || (context = this.f15378d) == null) {
                return;
            }
            al.b(context, "applicationIds", str);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void a(int i9) {
        this.f15383i = i9;
    }

    public final void b(int i9) {
        this.f15386n = i9;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.m = str;
            Context context = this.f15378d;
            if (context != null) {
                al.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            if (this.f15387o != null && !TextUtils.isEmpty(str) && this.f15387o.containsKey(str)) {
                this.f15387o.remove(str);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void b(Context context) {
        this.f15378d = context;
    }

    public final BitmapDrawable a(String str, int i9) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f15387o) == null || !concurrentHashMap.containsKey(str) || !af.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.f15387o.get(str);
        BitmapDrawable n2 = ai.n(str2);
        i.a(str, i9, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : n2 != null ? "" : "str to bitmap failed", n2 == null ? 2 : 1, str2);
        return n2;
    }

    public final void a(JSONObject jSONObject) {
        this.f15389q = jSONObject;
    }

    public final void a(final InterfaceC0156a interfaceC0156a, final Handler handler) {
        if (this.f15385k) {
            return;
        }
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.a() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object a6 = al.a(this.f15378d, MBridgeConstans.SP_GA_ID, "");
                Object a9 = al.a(this.f15378d, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (a6 instanceof String) {
                    String str = (String) a6;
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.foundation.tools.e.a(str);
                    } else {
                        com.mbridge.msdk.foundation.tools.e.c();
                    }
                    if (a9 instanceof Integer) {
                        com.mbridge.msdk.foundation.tools.e.a(((Integer) a9).intValue());
                    }
                }
            }
        } catch (Exception e4) {
            ad.b(f15376a, e4.getMessage());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f15389q = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e9) {
            ad.b(f15376a, e9.getMessage());
        }
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i9;
                try {
                    z.o(a.this.f15378d);
                    a.this.a(interfaceC0156a);
                    a aVar = a.this;
                    h.a(aVar.f15378d, aVar.f15377c);
                } catch (Exception e10) {
                    ad.b(a.f15376a, e10.getMessage());
                }
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                    try {
                        if (a.this.f15378d.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            i9 = 1;
                        } else {
                            i9 = 2;
                        }
                        z.c(i9);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z.c(0);
                    } catch (Throwable th) {
                        ad.b(a.f15376a, th.getMessage());
                    }
                }
                try {
                    com.mbridge.msdk.c.g b8 = h.a().b(c.m().k());
                    if (b8 == null) {
                        h.a();
                        b8 = com.mbridge.msdk.c.i.a();
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = b8;
                    obtain.what = 9;
                    handler.sendMessage(obtain);
                } catch (Exception e11) {
                    ad.b(a.f15376a, e11.getMessage());
                }
            }
        }).start();
    }

    public final void a(String str, JSONObject jSONObject) {
        if (af.a().a("w_m_r_l", true)) {
            try {
                if (this.f15384j == null) {
                    this.f15384j = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f15384j.put(next, jSONObject.get(next));
                    }
                }
                if (this.f15384j.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f15387o == null) {
                        this.f15387o = new ConcurrentHashMap<>();
                    }
                    this.f15387o.put(str, this.f15384j.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }
}
