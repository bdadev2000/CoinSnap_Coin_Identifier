package V0;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.o;
import c1.C0588c;
import c1.InterfaceC0586a;
import f1.C2262k;
import g1.InterfaceC2286a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class b implements a, InterfaceC0586a {

    /* renamed from: n, reason: collision with root package name */
    public static final String f3391n = o.g("Processor");

    /* renamed from: c, reason: collision with root package name */
    public final Context f3392c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.b f3393d;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2286a f3394f;

    /* renamed from: g, reason: collision with root package name */
    public final WorkDatabase f3395g;

    /* renamed from: j, reason: collision with root package name */
    public final List f3398j;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f3397i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f3396h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f3399k = new HashSet();
    public final ArrayList l = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object m = new Object();

    public b(Context context, androidx.work.b bVar, C.c cVar, WorkDatabase workDatabase, List list) {
        this.f3392c = context;
        this.f3393d = bVar;
        this.f3394f = cVar;
        this.f3395g = workDatabase;
        this.f3398j = list;
    }

    public static boolean b(String str, l lVar) {
        boolean z8;
        if (lVar != null) {
            lVar.f3441u = true;
            lVar.i();
            f4.c cVar = lVar.f3440t;
            if (cVar != null) {
                z8 = cVar.isDone();
                lVar.f3440t.cancel(true);
            } else {
                z8 = false;
            }
            ListenableWorker listenableWorker = lVar.f3430h;
            if (listenableWorker != null && !z8) {
                listenableWorker.stop();
            } else {
                o.e().b(l.f3425v, "WorkSpec " + lVar.f3429g + " is already done. Not interrupting.", new Throwable[0]);
            }
            o.e().b(f3391n, AbstractC2914a.d("WorkerWrapper interrupted for ", str), new Throwable[0]);
            return true;
        }
        o.e().b(f3391n, AbstractC2914a.d("WorkerWrapper could not be found for ", str), new Throwable[0]);
        return false;
    }

    public final void a(a aVar) {
        synchronized (this.m) {
            this.l.add(aVar);
        }
    }

    @Override // V0.a
    public final void c(String str, boolean z8) {
        synchronized (this.m) {
            try {
                this.f3397i.remove(str);
                o.e().b(f3391n, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z8, new Throwable[0]);
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).c(str, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z8;
        synchronized (this.m) {
            try {
                if (!this.f3397i.containsKey(str) && !this.f3396h.containsKey(str)) {
                    z8 = false;
                }
                z8 = true;
            } finally {
            }
        }
        return z8;
    }

    public final void e(a aVar) {
        synchronized (this.m) {
            this.l.remove(aVar);
        }
    }

    public final void f(String str, androidx.work.h hVar) {
        synchronized (this.m) {
            try {
                o.e().f(f3391n, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                l lVar = (l) this.f3397i.remove(str);
                if (lVar != null) {
                    if (this.b == null) {
                        PowerManager.WakeLock a6 = e1.k.a(this.f3392c, "ProcessorForegroundLck");
                        this.b = a6;
                        a6.acquire();
                    }
                    this.f3396h.put(str, lVar);
                    I.h.startForegroundService(this.f3392c, C0588c.d(this.f3392c, str, hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.Runnable, V0.l] */
    /* JADX WARN: Type inference failed for: r8v2, types: [f1.k, java.lang.Object] */
    public final boolean g(String str, C.c cVar) {
        synchronized (this.m) {
            try {
                if (d(str)) {
                    o.e().b(f3391n, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f3392c;
                androidx.work.b bVar = this.f3393d;
                InterfaceC2286a interfaceC2286a = this.f3394f;
                WorkDatabase workDatabase = this.f3395g;
                C.c cVar2 = new C.c((byte) 0, 15);
                Context applicationContext = context.getApplicationContext();
                List list = this.f3398j;
                if (cVar == null) {
                    cVar = cVar2;
                }
                ?? obj = new Object();
                obj.f3432j = new androidx.work.k();
                obj.f3439s = new Object();
                obj.f3440t = null;
                obj.b = applicationContext;
                obj.f3431i = interfaceC2286a;
                obj.l = this;
                obj.f3426c = str;
                obj.f3427d = list;
                obj.f3428f = cVar;
                obj.f3430h = null;
                obj.f3433k = bVar;
                obj.m = workDatabase;
                obj.f3434n = workDatabase.n();
                obj.f3435o = workDatabase.i();
                obj.f3436p = workDatabase.o();
                C2262k c2262k = obj.f3439s;
                A4.e eVar = new A4.e(3);
                eVar.f51c = this;
                eVar.f52d = str;
                eVar.f53f = c2262k;
                c2262k.addListener(eVar, (P.h) ((C.c) this.f3394f).f349f);
                this.f3397i.put(str, obj);
                ((e1.i) ((C.c) this.f3394f).f347c).execute(obj);
                o.e().b(f3391n, com.mbridge.msdk.foundation.entity.o.k(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.m) {
            try {
                if (!(!this.f3396h.isEmpty())) {
                    Context context = this.f3392c;
                    String str = C0588c.m;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f3392c.startService(intent);
                    } catch (Throwable th) {
                        o.e().d(f3391n, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean b;
        synchronized (this.m) {
            o.e().b(f3391n, "Processor stopping foreground work " + str, new Throwable[0]);
            b = b(str, (l) this.f3396h.remove(str));
        }
        return b;
    }

    public final boolean j(String str) {
        boolean b;
        synchronized (this.m) {
            o.e().b(f3391n, "Processor stopping background work " + str, new Throwable[0]);
            b = b(str, (l) this.f3397i.remove(str));
        }
        return b;
    }
}
