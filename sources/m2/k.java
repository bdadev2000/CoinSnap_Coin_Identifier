package m2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;
import com.facebook.appevents.o;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import v1.c0;
import v1.f0;
import v1.n0;

/* loaded from: classes.dex */
public final class k extends va.b {

    /* renamed from: r, reason: collision with root package name */
    public static k f21455r;

    /* renamed from: s, reason: collision with root package name */
    public static k f21456s;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f21457t;

    /* renamed from: i, reason: collision with root package name */
    public Context f21458i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.b f21459j;

    /* renamed from: k, reason: collision with root package name */
    public WorkDatabase f21460k;

    /* renamed from: l, reason: collision with root package name */
    public x2.a f21461l;

    /* renamed from: m, reason: collision with root package name */
    public List f21462m;

    /* renamed from: n, reason: collision with root package name */
    public b f21463n;

    /* renamed from: o, reason: collision with root package name */
    public v2.f f21464o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21465p;

    /* renamed from: q, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f21466q;

    static {
        p.g("WorkManagerImpl");
        f21455r = null;
        f21456s = null;
        f21457t = new Object();
    }

    public k(Context context, androidx.work.b bVar, h.c cVar) {
        c0 f10;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        v2.i executor = (v2.i) cVar.f18523c;
        int i10 = WorkDatabase.f2200b;
        if (z10) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            f10 = new c0(context2, WorkDatabase.class, null);
            f10.f25854j = true;
        } else {
            String str = i.a;
            f10 = o.f(context2, WorkDatabase.class, "androidx.work.workdb");
            f10.f25853i = new j.a(context2);
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        f10.f25851g = executor;
        f callback = new f();
        Intrinsics.checkNotNullParameter(callback, "callback");
        f10.f25848d.add(callback);
        f10.a(va.b.a);
        f10.a(new h(context2, 2, 3));
        f10.a(va.b.f26376b);
        f10.a(va.b.f26377c);
        f10.a(new h(context2, 5, 6));
        f10.a(va.b.f26378d);
        f10.a(va.b.f26379e);
        f10.a(va.b.f26380f);
        f10.a(new h(context2));
        f10.a(new h(context2, 10, 11));
        f10.a(va.b.f26381g);
        f10.f25856l = false;
        f10.f25857m = true;
        WorkDatabase workDatabase = (WorkDatabase) f10.b();
        Context applicationContext = context.getApplicationContext();
        p pVar = new p(bVar.f2182f);
        synchronized (p.class) {
            p.f2226c = pVar;
        }
        String str2 = d.a;
        p2.b bVar2 = new p2.b(applicationContext, this);
        v2.g.a(applicationContext, SystemJobService.class, true);
        p.e().b(d.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List asList = Arrays.asList(bVar2, new n2.b(applicationContext, bVar, cVar, this));
        b bVar3 = new b(context, bVar, cVar, workDatabase, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.f21458i = applicationContext2;
        this.f21459j = bVar;
        this.f21461l = cVar;
        this.f21460k = workDatabase;
        this.f21462m = asList;
        this.f21463n = bVar3;
        this.f21464o = new v2.f(workDatabase);
        this.f21465p = false;
        if (!applicationContext2.isDeviceProtectedStorage()) {
            ((h.c) this.f21461l).r(new v2.e(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static k v(Context context) {
        k kVar;
        Object obj = f21457t;
        synchronized (obj) {
            synchronized (obj) {
                kVar = f21455r;
                if (kVar == null) {
                    kVar = f21456s;
                }
            }
            return kVar;
        }
        if (kVar != null) {
            return kVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (m2.k.f21456s != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        m2.k.f21456s = new m2.k(r4, r5, new h.c(r5.f2178b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        m2.k.f21455r = m2.k.f21456s;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(android.content.Context r4, androidx.work.b r5) {
        /*
            java.lang.Object r0 = m2.k.f21457t
            monitor-enter(r0)
            m2.k r1 = m2.k.f21455r     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            m2.k r2 = m2.k.f21456s     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            m2.k r1 = m2.k.f21456s     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            m2.k r1 = new m2.k     // Catch: java.lang.Throwable -> L32
            h.c r2 = new h.c     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.f2178b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            m2.k.f21456s = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            m2.k r4 = m2.k.f21456s     // Catch: java.lang.Throwable -> L32
            m2.k.f21455r = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.k.w(android.content.Context, androidx.work.b):void");
    }

    public final void A(String str) {
        ((h.c) this.f21461l).r(new v2.j(this, str, false));
    }

    public final d3.g u(List list) {
        if (!list.isEmpty()) {
            e eVar = new e(this, list);
            if (!eVar.f21449j) {
                v2.d dVar = new v2.d(eVar);
                ((h.c) this.f21461l).r(dVar);
                eVar.f21450k = dVar.f25980c;
            } else {
                p.e().h(e.f21444l, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", eVar.f21447h)), new Throwable[0]);
            }
            return eVar.f21450k;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void x() {
        synchronized (f21457t) {
            this.f21465p = true;
            BroadcastReceiver.PendingResult pendingResult = this.f21466q;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f21466q = null;
            }
        }
    }

    public final void y() {
        ArrayList d10;
        Context context = this.f21458i;
        String str = p2.b.f23351g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d10 = p2.b.d(context, jobScheduler)) != null && !d10.isEmpty()) {
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                p2.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        u2.l h10 = this.f21460k.h();
        ((f0) h10.a).assertNotSuspendingTransaction();
        z1.j acquire = ((n0) h10.f25476i).acquire();
        ((f0) h10.a).beginTransaction();
        try {
            acquire.D();
            ((f0) h10.a).setTransactionSuccessful();
            ((f0) h10.a).endTransaction();
            ((n0) h10.f25476i).release(acquire);
            d.a(this.f21459j, this.f21460k, this.f21462m);
        } catch (Throwable th2) {
            ((f0) h10.a).endTransaction();
            ((n0) h10.f25476i).release(acquire);
            throw th2;
        }
    }

    public final void z(String str, h.c cVar) {
        ((h.c) this.f21461l).r(new k0.a(this, str, cVar, 7));
    }
}
