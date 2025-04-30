package V0;

import D0.n;
import T1.C0300f;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import d1.C2164e;
import g1.InterfaceC2286a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import n1.C2475f;
import r.C2650a;

/* loaded from: classes.dex */
public final class k extends e1.f {

    /* renamed from: j, reason: collision with root package name */
    public static k f3415j;

    /* renamed from: k, reason: collision with root package name */
    public static k f3416k;
    public static final Object l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3417a;
    public final androidx.work.b b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f3418c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2286a f3419d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3420e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3421f;

    /* renamed from: g, reason: collision with root package name */
    public final C2475f f3422g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3423h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f3424i;

    static {
        o.g("WorkManagerImpl");
        f3415j = null;
        f3416k = null;
        l = new Object();
    }

    public k(Context context, androidx.work.b bVar, C.c cVar) {
        D0.h hVar;
        Executor executor;
        int i9;
        String str;
        boolean z8;
        int i10 = 5;
        int i11 = 3;
        boolean z9 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        e1.i iVar = (e1.i) cVar.f347c;
        int i12 = WorkDatabase.f5218k;
        if (z9) {
            hVar = new D0.h(applicationContext, null);
            hVar.f610h = true;
        } else {
            String str2 = j.f3414a;
            hVar = new D0.h(applicationContext, "androidx.work.workdb");
            hVar.f609g = new C0300f(applicationContext, i11);
        }
        hVar.f607e = iVar;
        Object obj = new Object();
        if (hVar.f606d == null) {
            hVar.f606d = new ArrayList();
        }
        hVar.f606d.add(obj);
        hVar.a(i.f3408a);
        hVar.a(new h(applicationContext, 2, 3));
        hVar.a(i.b);
        hVar.a(i.f3409c);
        hVar.a(new h(applicationContext, 5, 6));
        hVar.a(i.f3410d);
        hVar.a(i.f3411e);
        hVar.a(i.f3412f);
        hVar.a(new h(applicationContext));
        hVar.a(new h(applicationContext, 10, 11));
        hVar.a(i.f3413g);
        hVar.f611i = false;
        hVar.f612j = true;
        Context context2 = hVar.f605c;
        if (context2 != null) {
            Class cls = hVar.f604a;
            if (cls != null) {
                Executor executor2 = hVar.f607e;
                if (executor2 == null && hVar.f608f == null) {
                    A0.c cVar2 = C2650a.f22807c;
                    hVar.f608f = cVar2;
                    hVar.f607e = cVar2;
                } else if (executor2 != null && hVar.f608f == null) {
                    hVar.f608f = executor2;
                } else if (executor2 == null && (executor = hVar.f608f) != null) {
                    hVar.f607e = executor;
                }
                if (hVar.f609g == null) {
                    hVar.f609g = new R3.e(i10);
                }
                H0.c cVar3 = hVar.f609g;
                ArrayList arrayList = hVar.f606d;
                boolean z10 = hVar.f610h;
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager != null && !activityManager.isLowRamDevice()) {
                    i9 = 3;
                } else {
                    i9 = 2;
                }
                Executor executor3 = hVar.f607e;
                int i13 = i9;
                D0.a aVar = new D0.a(context2, hVar.b, cVar3, hVar.f613k, arrayList, z10, i13, executor3, hVar.f608f, hVar.f611i, hVar.f612j);
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                String str3 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str3;
                    } else {
                        str = name + "." + str3;
                    }
                    D0.j jVar = (D0.j) Class.forName(str).newInstance();
                    H0.d e4 = jVar.e(aVar);
                    jVar.f616c = e4;
                    if (e4 instanceof n) {
                        ((n) e4).getClass();
                    }
                    if (i13 == 3) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    e4.setWriteAheadLoggingEnabled(z8);
                    jVar.f620g = arrayList;
                    jVar.b = executor3;
                    new ArrayDeque();
                    jVar.f618e = z10;
                    jVar.f619f = z8;
                    WorkDatabase workDatabase = (WorkDatabase) jVar;
                    Context applicationContext2 = context.getApplicationContext();
                    o oVar = new o(bVar.f5199f);
                    synchronized (o.class) {
                        o.f5247c = oVar;
                    }
                    String str4 = d.f3400a;
                    Y0.b bVar2 = new Y0.b(applicationContext2, this);
                    e1.g.a(applicationContext2, SystemJobService.class, true);
                    o.e().b(d.f3400a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                    List asList = Arrays.asList(bVar2, new W0.b(applicationContext2, bVar, cVar, this));
                    b bVar3 = new b(context, bVar, cVar, workDatabase, asList);
                    Context applicationContext3 = context.getApplicationContext();
                    this.f3417a = applicationContext3;
                    this.b = bVar;
                    this.f3419d = cVar;
                    this.f3418c = workDatabase;
                    this.f3420e = asList;
                    this.f3421f = bVar3;
                    this.f3422g = new C2475f(workDatabase, 27);
                    this.f3423h = false;
                    if (!applicationContext3.isDeviceProtectedStorage()) {
                        ((C.c) this.f3419d).p(new e1.e(applicationContext3, this));
                        return;
                    }
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
                }
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    public static k v(Context context) {
        k kVar;
        Object obj = l;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kVar = f3415j;
                    if (kVar == null) {
                        kVar = f3416k;
                    }
                }
                return kVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (kVar != null) {
            return kVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (V0.k.f3416k != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        V0.k.f3416k = new V0.k(r4, r5, new C.c(r5.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        V0.k.f3415j = V0.k.f3416k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(android.content.Context r4, androidx.work.b r5) {
        /*
            java.lang.Object r0 = V0.k.l
            monitor-enter(r0)
            V0.k r1 = V0.k.f3415j     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            V0.k r2 = V0.k.f3416k     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L34
        L16:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            V0.k r1 = V0.k.f3416k     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L2e
            V0.k r1 = new V0.k     // Catch: java.lang.Throwable -> L14
            C.c r2 = new C.c     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r3 = r5.b     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            V0.k.f3416k = r1     // Catch: java.lang.Throwable -> L14
        L2e:
            V0.k r4 = V0.k.f3416k     // Catch: java.lang.Throwable -> L14
            V0.k.f3415j = r4     // Catch: java.lang.Throwable -> L14
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.k.w(android.content.Context, androidx.work.b):void");
    }

    public final void A(String str) {
        ((C.c) this.f3419d).p(new e1.j(this, str, false));
    }

    public final void x() {
        synchronized (l) {
            try {
                this.f3423h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f3424i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f3424i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y() {
        ArrayList c9;
        WorkDatabase workDatabase = this.f3418c;
        Context context = this.f3417a;
        String str = Y0.b.f3751g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (c9 = Y0.b.c(context, jobScheduler)) != null && !c9.isEmpty()) {
            Iterator it = c9.iterator();
            while (it.hasNext()) {
                Y0.b.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        B4.c n2 = workDatabase.n();
        D0.j jVar = (D0.j) n2.f316a;
        jVar.b();
        C2164e c2164e = (C2164e) n2.f323i;
        I0.f a6 = c2164e.a();
        jVar.c();
        try {
            a6.f1407f.executeUpdateDelete();
            jVar.h();
            jVar.f();
            c2164e.c(a6);
            d.a(this.b, workDatabase, this.f3420e);
        } catch (Throwable th) {
            jVar.f();
            c2164e.c(a6);
            throw th;
        }
    }

    public final void z(String str, C.c cVar) {
        InterfaceC2286a interfaceC2286a = this.f3419d;
        A4.e eVar = new A4.e(10);
        eVar.f51c = this;
        eVar.f52d = str;
        eVar.f53f = cVar;
        ((C.c) interfaceC2286a).p(eVar);
    }
}
