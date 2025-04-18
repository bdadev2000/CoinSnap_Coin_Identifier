package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3279b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3280c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f3281d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3282e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f3283f = -1;

    /* renamed from: z, reason: collision with root package name */
    private static volatile b f3284z;
    private int B;

    /* renamed from: g, reason: collision with root package name */
    private Application f3285g;

    /* renamed from: h, reason: collision with root package name */
    private Context f3286h;

    /* renamed from: n, reason: collision with root package name */
    private String f3292n;

    /* renamed from: o, reason: collision with root package name */
    private long f3293o;

    /* renamed from: p, reason: collision with root package name */
    private String f3294p;

    /* renamed from: q, reason: collision with root package name */
    private long f3295q;

    /* renamed from: r, reason: collision with root package name */
    private String f3296r;

    /* renamed from: s, reason: collision with root package name */
    private long f3297s;

    /* renamed from: t, reason: collision with root package name */
    private String f3298t;
    private long u;

    /* renamed from: v, reason: collision with root package name */
    private String f3299v;

    /* renamed from: w, reason: collision with root package name */
    private long f3300w;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f3287i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List<Long> f3288j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f3289k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<Long> f3290l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private LinkedList<a> f3291m = new LinkedList<>();

    /* renamed from: x, reason: collision with root package name */
    private boolean f3301x = false;

    /* renamed from: y, reason: collision with root package name */
    private long f3302y = -1;
    private int A = 50;

    /* loaded from: classes.dex */
    public static class a {
        String a;

        /* renamed from: b, reason: collision with root package name */
        String f3303b;

        /* renamed from: c, reason: collision with root package name */
        long f3304c;

        public a(String str, String str2, long j3) {
            this.f3303b = str2;
            this.f3304c = j3;
            this.a = str;
        }

        public String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f3304c)) + " : " + this.a + ' ' + this.f3303b;
        }
    }

    private b(@NonNull Application application) {
        this.f3286h = application;
        this.f3285g = application;
        try {
            m();
        } catch (Throwable unused) {
        }
    }

    public static int b() {
        int i10 = f3281d;
        return i10 == 1 ? f3282e ? 2 : 1 : i10;
    }

    public static long c() {
        return f3283f;
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    public long e() {
        return SystemClock.uptimeMillis() - this.f3302y;
    }

    @NonNull
    public String h() {
        return String.valueOf(this.f3296r);
    }

    public static b d() {
        if (f3284z == null) {
            synchronized (b.class) {
                if (f3284z == null) {
                    f3284z = new b(com.apm.insight.i.h());
                }
            }
        }
        return f3284z;
    }

    private void m() {
        if (this.f3285g != null) {
            this.f3285g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    b.this.f3292n = activity.getClass().getName();
                    b.this.f3293o = System.currentTimeMillis();
                    boolean unused = b.f3279b = bundle != null;
                    boolean unused2 = b.f3280c = true;
                    b.this.f3287i.add(b.this.f3292n);
                    b.this.f3288j.add(Long.valueOf(b.this.f3293o));
                    b bVar = b.this;
                    bVar.a(bVar.f3292n, b.this.f3293o, "onCreate");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    String name = activity.getClass().getName();
                    int indexOf = b.this.f3287i.indexOf(name);
                    if (indexOf > -1 && indexOf < b.this.f3287i.size()) {
                        b.this.f3287i.remove(indexOf);
                        b.this.f3288j.remove(indexOf);
                    }
                    b.this.f3289k.add(name);
                    long currentTimeMillis = System.currentTimeMillis();
                    b.this.f3290l.add(Long.valueOf(currentTimeMillis));
                    b.this.a(name, currentTimeMillis, "onDestroy");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    b.this.f3298t = activity.getClass().getName();
                    b.this.u = System.currentTimeMillis();
                    b.l(b.this);
                    if (b.this.B != 0) {
                        if (b.this.B < 0) {
                            b.this.B = 0;
                        }
                        b bVar = b.this;
                        bVar.a(bVar.f3298t, b.this.u, "onPause");
                    }
                    b.this.f3301x = false;
                    boolean unused = b.f3280c = false;
                    b.this.f3302y = SystemClock.uptimeMillis();
                    b bVar2 = b.this;
                    bVar2.a(bVar2.f3298t, b.this.u, "onPause");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    b.this.f3296r = activity.getClass().getName();
                    b.this.f3297s = System.currentTimeMillis();
                    b.g(b.this);
                    if (!b.this.f3301x) {
                        if (b.a) {
                            boolean unused = b.a = false;
                            int unused2 = b.f3281d = 1;
                            long unused3 = b.f3283f = b.this.f3297s;
                        }
                        if (!b.this.f3296r.equals(b.this.f3298t)) {
                            return;
                        }
                        if (b.f3280c && !b.f3279b) {
                            int unused4 = b.f3281d = 4;
                            long unused5 = b.f3283f = b.this.f3297s;
                            return;
                        } else if (!b.f3280c) {
                            int unused6 = b.f3281d = 3;
                            long unused7 = b.f3283f = b.this.f3297s;
                            return;
                        }
                    }
                    b.this.f3301x = true;
                    b bVar = b.this;
                    bVar.a(bVar.f3296r, b.this.f3297s, "onResume");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    b.this.f3294p = activity.getClass().getName();
                    b.this.f3295q = System.currentTimeMillis();
                    b bVar = b.this;
                    bVar.a(bVar.f3294p, b.this.f3295q, "onStart");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    b.this.f3299v = activity.getClass().getName();
                    b.this.f3300w = System.currentTimeMillis();
                    b bVar = b.this;
                    bVar.a(bVar.f3299v, b.this.f3300w, "onStop");
                }
            });
        }
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f3287i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f3287i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f3287i.get(i10), this.f3288j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f3289k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f3289k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f3289k.get(i10), this.f3290l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.f3292n, this.f3293o));
            jSONObject.put("last_start_activity", a(this.f3294p, this.f3295q));
            jSONObject.put("last_resume_activity", a(this.f3296r, this.f3297s));
            jSONObject.put("last_pause_activity", a(this.f3298t, this.u));
            jSONObject.put("last_stop_activity", a(this.f3299v, this.f3300w));
            jSONObject.put("alive_activities", n());
            jSONObject.put("finish_activities", o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f3291m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public boolean f() {
        return this.f3301x;
    }

    private a a(String str, String str2, long j3) {
        a aVar;
        if (this.f3291m.size() >= this.A) {
            aVar = this.f3291m.poll();
            if (aVar != null) {
                this.f3291m.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str, str2, j3);
        this.f3291m.add(aVar2);
        return aVar2;
    }

    private JSONObject a(String str, long j3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a() {
        f3282e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j3, String str2) {
        try {
            a a10 = a(str, str2, j3);
            a10.f3303b = str2;
            a10.a = str;
            a10.f3304c = j3;
        } catch (Throwable unused) {
        }
    }
}
