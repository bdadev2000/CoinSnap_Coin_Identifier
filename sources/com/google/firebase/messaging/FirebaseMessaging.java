package com.google.firebase.messaging;

import H0.b;
import K4.c;
import M0.C0218i;
import O4.e;
import U4.A;
import U4.B;
import U4.C0315k;
import U4.C0316l;
import U4.F;
import U4.m;
import U4.o;
import U4.p;
import U4.r;
import U4.z;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.applovin.impl.N1;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import g4.C2296f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.InterfaceC2433b;
import w4.v0;
import y2.AbstractC2947c;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static A f14328k;
    public static ScheduledThreadPoolExecutor m;

    /* renamed from: a, reason: collision with root package name */
    public final C2296f f14329a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final p f14330c;

    /* renamed from: d, reason: collision with root package name */
    public final C0315k f14331d;

    /* renamed from: e, reason: collision with root package name */
    public final b f14332e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f14333f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f14334g;

    /* renamed from: h, reason: collision with root package name */
    public final r f14335h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14336i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f14327j = TimeUnit.HOURS.toSeconds(8);
    public static N4.b l = new m(0);

    /* JADX WARN: Type inference failed for: r10v0, types: [U4.r, java.lang.Object] */
    public FirebaseMessaging(C2296f c2296f, N4.b bVar, N4.b bVar2, e eVar, N4.b bVar3, c cVar) {
        final int i9 = 1;
        final int i10 = 0;
        c2296f.a();
        Context context = c2296f.f20433a;
        final ?? obj = new Object();
        obj.f3325c = 0;
        obj.f3327e = context;
        final p pVar = new p(c2296f, obj, bVar, bVar2, eVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f14336i = false;
        l = bVar3;
        this.f14329a = c2296f;
        this.f14332e = new b(this, cVar);
        c2296f.a();
        final Context context2 = c2296f.f20433a;
        this.b = context2;
        C0316l c0316l = new C0316l();
        this.f14335h = obj;
        this.f14330c = pVar;
        this.f14331d = new C0315k(newSingleThreadExecutor);
        this.f14333f = scheduledThreadPoolExecutor;
        this.f14334g = threadPoolExecutor;
        c2296f.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c0316l);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: U4.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f3315c;

            {
                this.f3315c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f3315c;
                        if (firebaseMessaging.f14332e.f() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f14336i) {
                                    firebaseMessaging.f(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f3315c;
                        Context context3 = firebaseMessaging2.b;
                        AbstractC2947c.n(context3);
                        boolean e4 = firebaseMessaging2.e();
                        boolean isAtLeastQ = PlatformVersion.isAtLeastQ();
                        p pVar2 = firebaseMessaging2.f14330c;
                        if (isAtLeastQ) {
                            SharedPreferences l2 = y8.a.l(context3);
                            if (!l2.contains("proxy_retention") || l2.getBoolean("proxy_retention", false) != e4) {
                                ((Rpc) pVar2.f3318c).setRetainProxiedNotifications(e4).addOnSuccessListener(new A0.c(0), new N1(4, context3, e4));
                            }
                        }
                        if (firebaseMessaging2.e()) {
                            ((Rpc) pVar2.f3318c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f14333f, new o(firebaseMessaging2, 1));
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i11 = F.f3258j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: U4.E
            @Override // java.util.concurrent.Callable
            public final Object call() {
                D d2;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                r rVar = obj;
                p pVar2 = pVar;
                synchronized (D.class) {
                    try {
                        WeakReference weakReference = D.f3251c;
                        if (weakReference != null) {
                            d2 = (D) weakReference.get();
                        } else {
                            d2 = null;
                        }
                        if (d2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            D d9 = new D(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                            synchronized (d9) {
                                d9.f3252a = F1.i.a(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                            }
                            D.f3251c = new WeakReference(d9);
                            d2 = d9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new F(firebaseMessaging, rVar, d2, pVar2, context3, (ScheduledThreadPoolExecutor) scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new o(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: U4.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f3315c;

            {
                this.f3315c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f3315c;
                        if (firebaseMessaging.f14332e.f() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f14336i) {
                                    firebaseMessaging.f(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f3315c;
                        Context context3 = firebaseMessaging2.b;
                        AbstractC2947c.n(context3);
                        boolean e4 = firebaseMessaging2.e();
                        boolean isAtLeastQ = PlatformVersion.isAtLeastQ();
                        p pVar2 = firebaseMessaging2.f14330c;
                        if (isAtLeastQ) {
                            SharedPreferences l2 = y8.a.l(context3);
                            if (!l2.contains("proxy_retention") || l2.getBoolean("proxy_retention", false) != e4) {
                                ((Rpc) pVar2.f3318c).setRetainProxiedNotifications(e4).addOnSuccessListener(new A0.c(0), new N1(4, context3, e4));
                            }
                        }
                        if (firebaseMessaging2.e()) {
                            ((Rpc) pVar2.f3318c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f14333f, new o(firebaseMessaging2, 1));
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j7) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                m.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized A c(Context context) {
        A a6;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f14328k == null) {
                    f14328k = new A(context);
                }
                a6 = f14328k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a6;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull C2296f c2296f) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c2296f.b(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        z d2 = d();
        if (!g(d2)) {
            return d2.f3338a;
        }
        String b = r.b(this.f14329a);
        C0315k c0315k = this.f14331d;
        synchronized (c0315k) {
            task = (Task) ((x.b) c0315k.b).getOrDefault(b, null);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + b);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b);
                }
                p pVar = this.f14330c;
                task = pVar.m(pVar.u(r.b((C2296f) pVar.f3317a), "*", new Bundle())).onSuccessTask(this.f14334g, new C0218i(this, b, d2, 1)).continueWithTask((Executor) c0315k.f3313a, new F2.e(2, c0315k, b));
                ((x.b) c0315k.b).put(b, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e4) {
            throw new IOException(e4);
        }
    }

    public final z d() {
        String d2;
        z b;
        A c9 = c(this.b);
        C2296f c2296f = this.f14329a;
        c2296f.a();
        if ("[DEFAULT]".equals(c2296f.b)) {
            d2 = "";
        } else {
            d2 = c2296f.d();
        }
        String b8 = r.b(this.f14329a);
        synchronized (c9) {
            b = z.b(c9.f3244a.getString(d2 + "|T|" + b8 + "|*", null));
        }
        return b;
    }

    public final boolean e() {
        boolean z8;
        String notificationDelegate;
        Context context = this.b;
        AbstractC2947c.n(context);
        if (!PlatformVersion.isAtLeastQ()) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if (!"com.google.android.gms".equals(notificationDelegate)) {
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
            }
            if (this.f14329a.b(InterfaceC2433b.class) != null) {
                return true;
            }
            if (!v0.j() || l == null) {
                return false;
            }
            return true;
        }
        Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
        return false;
    }

    public final synchronized void f(long j7) {
        b(new B(this, Math.min(Math.max(30L, 2 * j7), f14327j)), j7);
        this.f14336i = true;
    }

    public final boolean g(z zVar) {
        if (zVar != null) {
            String a6 = this.f14335h.a();
            if (System.currentTimeMillis() <= zVar.f3339c + z.f3337d && a6.equals(zVar.b)) {
                return false;
            }
        }
        return true;
    }
}
