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

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5981a = true;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5982c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f5983d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5984e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f5985f = -1;

    /* renamed from: z, reason: collision with root package name */
    private static volatile b f5986z;

    /* renamed from: B, reason: collision with root package name */
    private int f5988B;

    /* renamed from: g, reason: collision with root package name */
    private Application f5989g;

    /* renamed from: h, reason: collision with root package name */
    private Context f5990h;

    /* renamed from: n, reason: collision with root package name */
    private String f5994n;

    /* renamed from: o, reason: collision with root package name */
    private long f5995o;

    /* renamed from: p, reason: collision with root package name */
    private String f5996p;

    /* renamed from: q, reason: collision with root package name */
    private long f5997q;

    /* renamed from: r, reason: collision with root package name */
    private String f5998r;

    /* renamed from: s, reason: collision with root package name */
    private long f5999s;

    /* renamed from: t, reason: collision with root package name */
    private String f6000t;

    /* renamed from: u, reason: collision with root package name */
    private long f6001u;

    /* renamed from: v, reason: collision with root package name */
    private String f6002v;

    /* renamed from: w, reason: collision with root package name */
    private long f6003w;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f5991i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List<Long> f5992j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f5993k = new ArrayList();
    private List<Long> l = new ArrayList();
    private LinkedList<a> m = new LinkedList<>();

    /* renamed from: x, reason: collision with root package name */
    private boolean f6004x = false;

    /* renamed from: y, reason: collision with root package name */
    private long f6005y = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f5987A = 50;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f6007a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        long f6008c;

        public a(String str, String str2, long j7) {
            this.b = str2;
            this.f6008c = j7;
            this.f6007a = str;
        }

        public String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f6008c)) + " : " + this.f6007a + ' ' + this.b;
        }
    }

    private b(@NonNull Application application) {
        this.f5990h = application;
        this.f5989g = application;
        try {
            m();
        } catch (Throwable unused) {
        }
    }

    public static int b() {
        int i9 = f5983d;
        return i9 == 1 ? f5984e ? 2 : 1 : i9;
    }

    public static long c() {
        return f5985f;
    }

    public static /* synthetic */ int g(b bVar) {
        int i9 = bVar.f5988B;
        bVar.f5988B = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int l(b bVar) {
        int i9 = bVar.f5988B;
        bVar.f5988B = i9 - 1;
        return i9;
    }

    public long e() {
        return SystemClock.uptimeMillis() - this.f6005y;
    }

    @NonNull
    public String h() {
        return String.valueOf(this.f5998r);
    }

    public static b d() {
        if (f5986z == null) {
            synchronized (b.class) {
                try {
                    if (f5986z == null) {
                        f5986z = new b(com.apm.insight.i.h());
                    }
                } finally {
                }
            }
        }
        return f5986z;
    }

    private void m() {
        if (this.f5989g != null) {
            this.f5989g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    b.this.f5994n = activity.getClass().getName();
                    b.this.f5995o = System.currentTimeMillis();
                    boolean unused = b.b = bundle != null;
                    boolean unused2 = b.f5982c = true;
                    b.this.f5991i.add(b.this.f5994n);
                    b.this.f5992j.add(Long.valueOf(b.this.f5995o));
                    b bVar = b.this;
                    bVar.a(bVar.f5994n, b.this.f5995o, "onCreate");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    String name = activity.getClass().getName();
                    int indexOf = b.this.f5991i.indexOf(name);
                    if (indexOf > -1 && indexOf < b.this.f5991i.size()) {
                        b.this.f5991i.remove(indexOf);
                        b.this.f5992j.remove(indexOf);
                    }
                    b.this.f5993k.add(name);
                    long currentTimeMillis = System.currentTimeMillis();
                    b.this.l.add(Long.valueOf(currentTimeMillis));
                    b.this.a(name, currentTimeMillis, "onDestroy");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    b.this.f6000t = activity.getClass().getName();
                    b.this.f6001u = System.currentTimeMillis();
                    b.l(b.this);
                    if (b.this.f5988B != 0) {
                        if (b.this.f5988B < 0) {
                            b.this.f5988B = 0;
                        }
                        b bVar = b.this;
                        bVar.a(bVar.f6000t, b.this.f6001u, "onPause");
                    }
                    b.this.f6004x = false;
                    boolean unused = b.f5982c = false;
                    b.this.f6005y = SystemClock.uptimeMillis();
                    b bVar2 = b.this;
                    bVar2.a(bVar2.f6000t, b.this.f6001u, "onPause");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    b.this.f5998r = activity.getClass().getName();
                    b.this.f5999s = System.currentTimeMillis();
                    b.g(b.this);
                    if (!b.this.f6004x) {
                        if (b.f5981a) {
                            boolean unused = b.f5981a = false;
                            int unused2 = b.f5983d = 1;
                            long unused3 = b.f5985f = b.this.f5999s;
                        }
                        if (!b.this.f5998r.equals(b.this.f6000t)) {
                            return;
                        }
                        if (b.f5982c && !b.b) {
                            int unused4 = b.f5983d = 4;
                            long unused5 = b.f5985f = b.this.f5999s;
                            return;
                        } else if (!b.f5982c) {
                            int unused6 = b.f5983d = 3;
                            long unused7 = b.f5985f = b.this.f5999s;
                            return;
                        }
                    }
                    b.this.f6004x = true;
                    b bVar = b.this;
                    bVar.a(bVar.f5998r, b.this.f5999s, "onResume");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    b.this.f5996p = activity.getClass().getName();
                    b.this.f5997q = System.currentTimeMillis();
                    b bVar = b.this;
                    bVar.a(bVar.f5996p, b.this.f5997q, "onStart");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    b.this.f6002v = activity.getClass().getName();
                    b.this.f6003w = System.currentTimeMillis();
                    b bVar = b.this;
                    bVar.a(bVar.f6002v, b.this.f6003w, "onStop");
                }
            });
        }
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f5991i;
        if (list != null && !list.isEmpty()) {
            for (int i9 = 0; i9 < this.f5991i.size(); i9++) {
                try {
                    jSONArray.put(a(this.f5991i.get(i9), this.f5992j.get(i9).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f5993k;
        if (list != null && !list.isEmpty()) {
            for (int i9 = 0; i9 < this.f5993k.size(); i9++) {
                try {
                    jSONArray.put(a(this.f5993k.get(i9), this.l.get(i9).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.f5994n, this.f5995o));
            jSONObject.put("last_start_activity", a(this.f5996p, this.f5997q));
            jSONObject.put("last_resume_activity", a(this.f5998r, this.f5999s));
            jSONObject.put("last_pause_activity", a(this.f6000t, this.f6001u));
            jSONObject.put("last_stop_activity", a(this.f6002v, this.f6003w));
            jSONObject.put("alive_activities", n());
            jSONObject.put("finish_activities", o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public boolean f() {
        return this.f6004x;
    }

    private a a(String str, String str2, long j7) {
        a aVar;
        if (this.m.size() >= this.f5987A) {
            aVar = this.m.poll();
            if (aVar != null) {
                this.m.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str, str2, j7);
        this.m.add(aVar2);
        return aVar2;
    }

    private JSONObject a(String str, long j7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j7);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a() {
        f5984e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j7, String str2) {
        try {
            a a6 = a(str, str2, j7);
            a6.b = str2;
            a6.f6007a = str;
            a6.f6008c = j7;
        } catch (Throwable unused) {
        }
    }
}
