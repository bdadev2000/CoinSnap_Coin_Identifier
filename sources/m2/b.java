package m2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b implements a, t2.a {

    /* renamed from: n, reason: collision with root package name */
    public static final String f21432n = p.g("Processor");

    /* renamed from: c, reason: collision with root package name */
    public final Context f21434c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.b f21435d;

    /* renamed from: f, reason: collision with root package name */
    public final x2.a f21436f;

    /* renamed from: g, reason: collision with root package name */
    public final WorkDatabase f21437g;

    /* renamed from: j, reason: collision with root package name */
    public final List f21440j;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f21439i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f21438h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f21441k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f21442l = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f21433b = null;

    /* renamed from: m, reason: collision with root package name */
    public final Object f21443m = new Object();

    public b(Context context, androidx.work.b bVar, h.c cVar, WorkDatabase workDatabase, List list) {
        this.f21434c = context;
        this.f21435d = bVar;
        this.f21436f = cVar;
        this.f21437g = workDatabase;
        this.f21440j = list;
    }

    public static boolean b(String str, m mVar) {
        boolean z10;
        if (mVar != null) {
            mVar.u = true;
            mVar.i();
            ua.b bVar = mVar.f21493t;
            if (bVar != null) {
                z10 = bVar.isDone();
                mVar.f21493t.cancel(true);
            } else {
                z10 = false;
            }
            ListenableWorker listenableWorker = mVar.f21481h;
            if (listenableWorker != null && !z10) {
                listenableWorker.stop();
            } else {
                p.e().b(m.f21475v, String.format("WorkSpec %s is already done. Not interrupting.", mVar.f21480g), new Throwable[0]);
            }
            p.e().b(f21432n, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        p.e().b(f21432n, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    public final void a(a aVar) {
        synchronized (this.f21443m) {
            this.f21442l.add(aVar);
        }
    }

    public final boolean c(String str) {
        boolean z10;
        synchronized (this.f21443m) {
            if (!this.f21439i.containsKey(str) && !this.f21438h.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // m2.a
    public final void d(String str, boolean z10) {
        synchronized (this.f21443m) {
            this.f21439i.remove(str);
            p.e().b(f21432n, String.format("%s %s executed; reschedule = %s", b.class.getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator it = this.f21442l.iterator();
            while (it.hasNext()) {
                ((a) it.next()).d(str, z10);
            }
        }
    }

    public final void e(String str, androidx.work.i iVar) {
        synchronized (this.f21443m) {
            p.e().f(f21432n, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            m mVar = (m) this.f21439i.remove(str);
            if (mVar != null) {
                if (this.f21433b == null) {
                    PowerManager.WakeLock a = v2.k.a(this.f21434c, "ProcessorForegroundLck");
                    this.f21433b = a;
                    a.acquire();
                }
                this.f21438h.put(str, mVar);
                d0.h.startForegroundService(this.f21434c, t2.c.c(this.f21434c, str, iVar));
            }
        }
    }

    public final boolean f(String str, h.c cVar) {
        synchronized (this.f21443m) {
            if (c(str)) {
                p.e().b(f21432n, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            l lVar = new l(this.f21434c, this.f21435d, this.f21436f, this, this.f21437g, str);
            lVar.f21473h = this.f21440j;
            if (cVar != null) {
                lVar.f21474i = cVar;
            }
            m mVar = new m(lVar);
            w2.j jVar = mVar.f21492s;
            jVar.addListener(new k0.a(this, str, jVar, 3), (Executor) ((h.c) this.f21436f).f18525f);
            this.f21439i.put(str, mVar);
            ((v2.i) ((h.c) this.f21436f).f18523c).execute(mVar);
            p.e().b(f21432n, String.format("%s: processing %s", b.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.f21443m) {
            if (!(!this.f21438h.isEmpty())) {
                Context context = this.f21434c;
                String str = t2.c.f25180m;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f21434c.startService(intent);
                } catch (Throwable th2) {
                    p.e().c(f21432n, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f21433b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f21433b = null;
                }
            }
        }
    }

    public final boolean h(String str) {
        boolean b3;
        synchronized (this.f21443m) {
            p.e().b(f21432n, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            b3 = b(str, (m) this.f21438h.remove(str));
        }
        return b3;
    }

    public final boolean i(String str) {
        boolean b3;
        synchronized (this.f21443m) {
            p.e().b(f21432n, String.format("Processor stopping background work %s", str), new Throwable[0]);
            b3 = b(str, (m) this.f21439i.remove(str));
        }
        return b3;
    }
}
