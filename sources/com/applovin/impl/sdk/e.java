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

/* loaded from: classes.dex */
public class e {

    /* renamed from: l, reason: collision with root package name */
    private static final e f7646l = new e();

    /* renamed from: b, reason: collision with root package name */
    private Handler f7647b;

    /* renamed from: d, reason: collision with root package name */
    private Handler f7649d;

    /* renamed from: g, reason: collision with root package name */
    private k f7652g;

    /* renamed from: h, reason: collision with root package name */
    private Thread f7653h;

    /* renamed from: i, reason: collision with root package name */
    private long f7654i;

    /* renamed from: j, reason: collision with root package name */
    private long f7655j;

    /* renamed from: k, reason: collision with root package name */
    private long f7656k;
    private final AtomicLong a = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private final HandlerThread f7648c = new HandlerThread("AppLovinSdk:anr_detector");

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f7650e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f7651f = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            if (!e.this.f7650e.get()) {
                long currentTimeMillis = System.currentTimeMillis() - e.this.a.get();
                if (currentTimeMillis < 0 || currentTimeMillis > e.this.f7654i) {
                    e.this.a();
                    if (e.this.f7653h != null && e.this.f7653h.getStackTrace().length > 0) {
                        StackTraceElement stackTraceElement = e.this.f7653h.getStackTrace()[0];
                        str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                    } else {
                        str = "None";
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.j());
                    HashMap hashMap = new HashMap(3);
                    hashMap.put("top_main_method", str);
                    if (e.this.f7652g.w0()) {
                        str2 = "non_first_session";
                    } else {
                        str2 = "first_session";
                    }
                    hashMap.put("source", str2);
                    hashMap.put("details", "seconds_since_app_launch=" + seconds);
                    e.this.f7652g.B().a(o.b.ANR, (Map) hashMap);
                }
                e.this.f7649d.postDelayed(this, e.this.f7656k);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!e.this.f7650e.get()) {
                e.this.a.set(System.currentTimeMillis());
                e.this.f7647b.postDelayed(this, e.this.f7655j);
            }
        }
    }

    private e() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f7654i = timeUnit.toMillis(4L);
        this.f7655j = timeUnit.toMillis(3L);
        this.f7656k = timeUnit.toMillis(3L);
    }

    private void a(k kVar) {
        if (this.f7651f.compareAndSet(false, true)) {
            this.f7652g = kVar;
            AppLovinSdkUtils.runOnUiThread(new z(this, 3));
            this.f7654i = ((Long) kVar.a(oj.U5)).longValue();
            this.f7655j = ((Long) kVar.a(oj.V5)).longValue();
            this.f7656k = ((Long) kVar.a(oj.W5)).longValue();
            this.f7647b = new Handler(k.k().getMainLooper());
            this.f7648c.start();
            this.f7647b.post(new c());
            Handler handler = new Handler(this.f7648c.getLooper());
            this.f7649d = handler;
            handler.postDelayed(new b(), this.f7656k / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f7653h = Thread.currentThread();
    }

    public static void b(k kVar) {
        if (kVar != null) {
            if (((Boolean) kVar.a(oj.T5)).booleanValue() && !zp.c(kVar)) {
                f7646l.a(kVar);
            } else {
                f7646l.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f7651f.get()) {
            this.f7650e.set(true);
        }
    }
}
