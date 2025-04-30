package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.applovin.impl.sdk.e */
/* loaded from: classes.dex */
public class C0753e {
    private static final C0753e l = new C0753e();
    private Handler b;

    /* renamed from: d */
    private Handler f10786d;

    /* renamed from: g */
    private k f10789g;

    /* renamed from: h */
    private Thread f10790h;

    /* renamed from: i */
    private long f10791i;

    /* renamed from: j */
    private long f10792j;

    /* renamed from: k */
    private long f10793k;

    /* renamed from: a */
    private final AtomicLong f10784a = new AtomicLong(0);

    /* renamed from: c */
    private final HandlerThread f10785c = new HandlerThread("AppLovinSdk:anr_detector");

    /* renamed from: e */
    private final AtomicBoolean f10787e = new AtomicBoolean();

    /* renamed from: f */
    private final AtomicBoolean f10788f = new AtomicBoolean();

    /* renamed from: com.applovin.impl.sdk.e$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            if (!C0753e.this.f10787e.get()) {
                long currentTimeMillis = System.currentTimeMillis() - C0753e.this.f10784a.get();
                if (currentTimeMillis < 0 || currentTimeMillis > C0753e.this.f10791i) {
                    C0753e.this.a();
                    if (C0753e.this.f10790h != null && C0753e.this.f10790h.getStackTrace().length > 0) {
                        StackTraceElement stackTraceElement = C0753e.this.f10790h.getStackTrace()[0];
                        str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                    } else {
                        str = "None";
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.j());
                    HashMap hashMap = new HashMap(3);
                    hashMap.put("top_main_method", str);
                    if (C0753e.this.f10789g.w0()) {
                        str2 = "non_first_session";
                    } else {
                        str2 = "first_session";
                    }
                    hashMap.put("source", str2);
                    hashMap.put("details", "seconds_since_app_launch=" + seconds);
                    C0753e.this.f10789g.B().a(o.b.ANR, (Map) hashMap);
                }
                C0753e.this.f10786d.postDelayed(this, C0753e.this.f10793k);
            }
        }

        public /* synthetic */ b(C0753e c0753e, a aVar) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.sdk.e$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C0753e.this.f10787e.get()) {
                C0753e.this.f10784a.set(System.currentTimeMillis());
                C0753e.this.b.postDelayed(this, C0753e.this.f10792j);
            }
        }

        public /* synthetic */ c(C0753e c0753e, a aVar) {
            this();
        }
    }

    private C0753e() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10791i = timeUnit.toMillis(4L);
        this.f10792j = timeUnit.toMillis(3L);
        this.f10793k = timeUnit.toMillis(3L);
    }

    private void a(k kVar) {
        if (this.f10788f.compareAndSet(false, true)) {
            this.f10789g = kVar;
            AppLovinSdkUtils.runOnUiThread(new z(this, 3));
            this.f10791i = ((Long) kVar.a(oj.f9687U5)).longValue();
            this.f10792j = ((Long) kVar.a(oj.f9694V5)).longValue();
            this.f10793k = ((Long) kVar.a(oj.f9700W5)).longValue();
            this.b = new Handler(k.k().getMainLooper());
            this.f10785c.start();
            this.b.post(new c());
            Handler handler = new Handler(this.f10785c.getLooper());
            this.f10786d = handler;
            handler.postDelayed(new b(), this.f10793k / 2);
        }
    }

    public /* synthetic */ void b() {
        this.f10790h = Thread.currentThread();
    }

    public static void b(k kVar) {
        if (kVar != null) {
            if (((Boolean) kVar.a(oj.f9680T5)).booleanValue() && !zp.c(kVar)) {
                l.a(kVar);
            } else {
                l.a();
            }
        }
    }

    public void a() {
        if (this.f10788f.get()) {
            this.f10787e.set(true);
        }
    }
}
