package com.applovin.impl;

import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class u0 {

    /* renamed from: l */
    private static final u0 f27232l = new u0();

    /* renamed from: b */
    private Handler f27234b;
    private Handler d;

    /* renamed from: g */
    private com.applovin.impl.sdk.j f27237g;

    /* renamed from: h */
    private Thread f27238h;

    /* renamed from: i */
    private long f27239i;

    /* renamed from: j */
    private long f27240j;

    /* renamed from: k */
    private long f27241k;

    /* renamed from: a */
    private final AtomicLong f27233a = new AtomicLong(0);

    /* renamed from: c */
    private final HandlerThread f27235c = new HandlerThread("AppLovinSdk:anr_detector");
    private final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: f */
    private final AtomicBoolean f27236f = new AtomicBoolean();

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (u0.this.e.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - u0.this.f27233a.get();
            if (currentTimeMillis < 0 || currentTimeMillis > u0.this.f27239i) {
                u0.this.a();
                if (u0.this.f27238h == null || u0.this.f27238h.getStackTrace().length <= 0) {
                    str = "None";
                } else {
                    StackTraceElement stackTraceElement = u0.this.f27238h.getStackTrace()[0];
                    str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                }
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - com.applovin.impl.sdk.j.k());
                HashMap hashMap = new HashMap(3);
                hashMap.put("top_main_method", str);
                hashMap.put("source", u0.this.f27237g.t0() ? "non_first_session" : "first_session");
                hashMap.put("details", "seconds_since_app_launch=" + seconds);
                u0.this.f27237g.E().a(la.C, (Map) hashMap);
            }
            u0.this.d.postDelayed(this, u0.this.f27241k);
        }

        public /* synthetic */ b(u0 u0Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (u0.this.e.get()) {
                return;
            }
            u0.this.f27233a.set(System.currentTimeMillis());
            u0.this.f27234b.postDelayed(this, u0.this.f27240j);
        }

        public /* synthetic */ c(u0 u0Var, a aVar) {
            this();
        }
    }

    private u0() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f27239i = timeUnit.toMillis(4L);
        this.f27240j = timeUnit.toMillis(3L);
        this.f27241k = timeUnit.toMillis(3L);
    }

    public void a() {
        if (this.f27236f.get()) {
            this.e.set(true);
        }
    }

    public /* synthetic */ void b() {
        this.f27238h = Thread.currentThread();
    }

    public static void b(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (((Boolean) jVar.a(sj.Y5)).booleanValue() && !yp.c(jVar)) {
                f27232l.a(jVar);
            } else {
                f27232l.a();
            }
        }
    }

    private void a(com.applovin.impl.sdk.j jVar) {
        if (this.f27236f.compareAndSet(false, true)) {
            this.f27237g = jVar;
            AppLovinSdkUtils.runOnUiThread(new mt(this, 16));
            this.f27239i = ((Long) jVar.a(sj.Z5)).longValue();
            this.f27240j = ((Long) jVar.a(sj.a6)).longValue();
            this.f27241k = ((Long) jVar.a(sj.b6)).longValue();
            this.f27234b = new Handler(com.applovin.impl.sdk.j.l().getMainLooper());
            this.f27235c.start();
            this.f27234b.post(new c());
            Handler handler = new Handler(this.f27235c.getLooper());
            this.d = handler;
            handler.postDelayed(new b(), this.f27241k / 2);
        }
    }
}
