package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.v;
import androidx.emoji2.text.t;
import cc.c;
import com.facebook.i;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import db.f;
import dc.e;
import ic.j;
import ic.k;
import ic.m;
import ic.r;
import ic.u;
import ic.z;
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
import va.g;
import y7.q;

/* loaded from: classes3.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static q f12072k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f12074m;
    public final g a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12075b;

    /* renamed from: c, reason: collision with root package name */
    public final v f12076c;

    /* renamed from: d, reason: collision with root package name */
    public final r f12077d;

    /* renamed from: e, reason: collision with root package name */
    public final t f12078e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f12079f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f12080g;

    /* renamed from: h, reason: collision with root package name */
    public final i f12081h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12082i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f12071j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static c f12073l = new f(6);

    public FirebaseMessaging(g gVar, c cVar, c cVar2, e eVar, c cVar3, zb.c cVar4) {
        gVar.a();
        Context context = gVar.a;
        final i iVar = new i(context);
        final v vVar = new v(gVar, iVar, cVar, cVar2, eVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i11 = 0;
        this.f12082i = false;
        f12073l = cVar3;
        this.a = gVar;
        this.f12078e = new t(this, cVar4);
        gVar.a();
        final Context context2 = gVar.a;
        this.f12075b = context2;
        j jVar = new j();
        this.f12081h = iVar;
        this.f12076c = vVar;
        this.f12077d = new r(newSingleThreadExecutor);
        this.f12079f = scheduledThreadPoolExecutor;
        this.f12080g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(jVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ic.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f19561c;

            {
                this.f19561c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                FirebaseMessaging firebaseMessaging = this.f19561c;
                switch (i12) {
                    case 0:
                        y7.q qVar = FirebaseMessaging.f12072k;
                        if (firebaseMessaging.f12078e.f() && firebaseMessaging.f(firebaseMessaging.c())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f12082i) {
                                    firebaseMessaging.e(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.f12075b;
                        a6.k.C(context3);
                        boolean d10 = firebaseMessaging.d();
                        if (PlatformVersion.isAtLeastQ()) {
                            SharedPreferences n10 = com.facebook.appevents.g.n(context3);
                            boolean z10 = false;
                            if (n10.contains("proxy_retention") && n10.getBoolean("proxy_retention", false) == d10) {
                                z10 = true;
                            }
                            if (!z10) {
                                ((Rpc) firebaseMessaging.f12076c.f1058c).setRetainProxiedNotifications(d10).addOnSuccessListener(new l.a(20), new p(context3, d10));
                            }
                        }
                        if (firebaseMessaging.d()) {
                            ((Rpc) firebaseMessaging.f12076c.f1058c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f12079f, new k(firebaseMessaging, 2));
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i12 = z.f19593j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: ic.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                x xVar;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                com.facebook.i iVar2 = iVar;
                androidx.appcompat.widget.v vVar2 = vVar;
                synchronized (x.class) {
                    WeakReference weakReference = x.f19586c;
                    if (weakReference != null) {
                        xVar = (x) weakReference.get();
                    } else {
                        xVar = null;
                    }
                    if (xVar == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        x xVar2 = new x(sharedPreferences, scheduledExecutorService);
                        synchronized (xVar2) {
                            xVar2.a = a4.f.c(sharedPreferences, scheduledExecutorService);
                        }
                        x.f19586c = new WeakReference(xVar2);
                        xVar = xVar2;
                    }
                }
                return new z(firebaseMessaging, iVar2, xVar, vVar2, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new k(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ic.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f19561c;

            {
                this.f19561c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i10;
                FirebaseMessaging firebaseMessaging = this.f19561c;
                switch (i122) {
                    case 0:
                        y7.q qVar = FirebaseMessaging.f12072k;
                        if (firebaseMessaging.f12078e.f() && firebaseMessaging.f(firebaseMessaging.c())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f12082i) {
                                    firebaseMessaging.e(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.f12075b;
                        a6.k.C(context3);
                        boolean d10 = firebaseMessaging.d();
                        if (PlatformVersion.isAtLeastQ()) {
                            SharedPreferences n10 = com.facebook.appevents.g.n(context3);
                            boolean z10 = false;
                            if (n10.contains("proxy_retention") && n10.getBoolean("proxy_retention", false) == d10) {
                                z10 = true;
                            }
                            if (!z10) {
                                ((Rpc) firebaseMessaging.f12076c.f1058c).setRetainProxiedNotifications(d10).addOnSuccessListener(new l.a(20), new p(context3, d10));
                            }
                        }
                        if (firebaseMessaging.d()) {
                            ((Rpc) firebaseMessaging.f12076c.f1058c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f12079f, new k(firebaseMessaging, 2));
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(long j3, ic.v vVar) {
        synchronized (FirebaseMessaging.class) {
            if (f12074m == null) {
                f12074m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f12074m.schedule(vVar, j3, TimeUnit.SECONDS);
        }
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        u c10 = c();
        if (!f(c10)) {
            return c10.a;
        }
        String a = i.a(this.a);
        r rVar = this.f12077d;
        m mVar = new m(this, a, c10);
        synchronized (rVar) {
            task = (Task) rVar.f19571b.getOrDefault(a, null);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + a);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + a);
                }
                task = mVar.a().continueWithTask(rVar.a, new androidx.fragment.app.e(24, rVar, a));
                rVar.f19571b.put(a, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final u c() {
        q qVar;
        String d10;
        u b3;
        Context context = this.f12075b;
        synchronized (FirebaseMessaging.class) {
            if (f12072k == null) {
                f12072k = new q(context);
            }
            qVar = f12072k;
        }
        g gVar = this.a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f26388b)) {
            d10 = "";
        } else {
            d10 = gVar.d();
        }
        String a = i.a(this.a);
        synchronized (qVar) {
            b3 = u.b(((SharedPreferences) qVar.f27991b).getString(d10 + "|T|" + a + "|*", null));
        }
        return b3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f12075b
            a6.k.C(r0)
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            r2 = 1
            r3 = 0
            r4 = 3
            java.lang.String r5 = "FirebaseMessaging"
            if (r1 != 0) goto L1c
            boolean r0 = android.util.Log.isLoggable(r5, r4)
            if (r0 == 0) goto L64
            java.lang.String r0 = "Platform doesn't support proxying."
            android.util.Log.d(r5, r0)
            goto L64
        L1c:
            int r1 = android.os.Binder.getCallingUid()
            android.content.pm.ApplicationInfo r6 = r0.getApplicationInfo()
            int r6 = r6.uid
            if (r1 != r6) goto L2a
            r1 = r2
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 != 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "error retrieving notification delegate for package "
            r1.<init>(r4)
            java.lang.String r0 = r0.getPackageName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r5, r0)
            goto L64
        L43:
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r0 = g0.q.n(r0)
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            boolean r0 = android.util.Log.isLoggable(r5, r4)
            if (r0 == 0) goto L62
            java.lang.String r0 = "GMS core is set for proxying"
            android.util.Log.d(r5, r0)
        L62:
            r0 = r2
            goto L65
        L64:
            r0 = r3
        L65:
            if (r0 != 0) goto L68
            return r3
        L68:
            va.g r0 = r7.a
            java.lang.Class<za.b> r1 = za.b.class
            java.lang.Object r0 = r0.b(r1)
            if (r0 == 0) goto L73
            return r2
        L73:
            boolean r0 = c6.c.j()
            if (r0 == 0) goto L7e
            cc.c r0 = com.google.firebase.messaging.FirebaseMessaging.f12073l
            if (r0 == 0) goto L7e
            goto L7f
        L7e:
            r2 = r3
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.d():boolean");
    }

    public final synchronized void e(long j3) {
        b(j3, new ic.v(this, Math.min(Math.max(30L, 2 * j3), f12071j)));
        this.f12082i = true;
    }

    public final boolean f(u uVar) {
        String str;
        boolean z10;
        if (uVar == null) {
            return true;
        }
        i iVar = this.f12081h;
        synchronized (iVar) {
            if (iVar.a == null) {
                iVar.d();
            }
            str = iVar.a;
        }
        if (System.currentTimeMillis() <= uVar.f19579c + u.f19577d && str.equals(uVar.f19578b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
