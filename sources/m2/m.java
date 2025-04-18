package m2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.n;
import androidx.work.o;
import androidx.work.p;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f21475v = p.g("WorkerWrapper");

    /* renamed from: b, reason: collision with root package name */
    public final Context f21476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21477c;

    /* renamed from: d, reason: collision with root package name */
    public final List f21478d;

    /* renamed from: f, reason: collision with root package name */
    public final h.c f21479f;

    /* renamed from: g, reason: collision with root package name */
    public u2.j f21480g;

    /* renamed from: h, reason: collision with root package name */
    public ListenableWorker f21481h;

    /* renamed from: i, reason: collision with root package name */
    public final x2.a f21482i;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.work.b f21484k;

    /* renamed from: l, reason: collision with root package name */
    public final t2.a f21485l;

    /* renamed from: m, reason: collision with root package name */
    public final WorkDatabase f21486m;

    /* renamed from: n, reason: collision with root package name */
    public final u2.l f21487n;

    /* renamed from: o, reason: collision with root package name */
    public final u2.c f21488o;

    /* renamed from: p, reason: collision with root package name */
    public final u2.c f21489p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f21490q;

    /* renamed from: r, reason: collision with root package name */
    public String f21491r;
    public volatile boolean u;

    /* renamed from: j, reason: collision with root package name */
    public o f21483j = new androidx.work.l();

    /* renamed from: s, reason: collision with root package name */
    public final w2.j f21492s = new w2.j();

    /* renamed from: t, reason: collision with root package name */
    public ua.b f21493t = null;

    public m(l lVar) {
        this.f21476b = (Context) lVar.f21467b;
        this.f21482i = (x2.a) lVar.f21470e;
        this.f21485l = (t2.a) lVar.f21469d;
        this.f21477c = (String) lVar.a;
        this.f21478d = (List) lVar.f21473h;
        this.f21479f = (h.c) lVar.f21474i;
        this.f21481h = (ListenableWorker) lVar.f21468c;
        this.f21484k = (androidx.work.b) lVar.f21471f;
        WorkDatabase workDatabase = (WorkDatabase) lVar.f21472g;
        this.f21486m = workDatabase;
        this.f21487n = workDatabase.h();
        this.f21488o = workDatabase.c();
        this.f21489p = workDatabase.i();
    }

    public final void a(o oVar) {
        boolean z10 = oVar instanceof n;
        String str = f21475v;
        if (z10) {
            p.e().f(str, String.format("Worker result SUCCESS for %s", this.f21491r), new Throwable[0]);
            if (this.f21480g.c()) {
                e();
                return;
            }
            u2.c cVar = this.f21488o;
            String str2 = this.f21477c;
            u2.l lVar = this.f21487n;
            WorkDatabase workDatabase = this.f21486m;
            workDatabase.beginTransaction();
            try {
                lVar.s(y.SUCCEEDED, str2);
                lVar.q(str2, ((n) this.f21483j).a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = cVar.a(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (lVar.h(str3) == y.BLOCKED && cVar.d(str3)) {
                        p.e().f(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                        lVar.s(y.ENQUEUED, str3);
                        lVar.r(currentTimeMillis, str3);
                    }
                }
                workDatabase.setTransactionSuccessful();
                return;
            } finally {
                workDatabase.endTransaction();
                f(false);
            }
        }
        if (oVar instanceof androidx.work.m) {
            p.e().f(str, String.format("Worker result RETRY for %s", this.f21491r), new Throwable[0]);
            d();
            return;
        }
        p.e().f(str, String.format("Worker result FAILURE for %s", this.f21491r), new Throwable[0]);
        if (this.f21480g.c()) {
            e();
        } else {
            h();
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            u2.l lVar = this.f21487n;
            if (lVar.h(str2) != y.CANCELLED) {
                lVar.s(y.FAILED, str2);
            }
            linkedList.addAll(this.f21488o.a(str2));
        }
    }

    public final void c() {
        boolean i10 = i();
        String str = this.f21477c;
        WorkDatabase workDatabase = this.f21486m;
        if (!i10) {
            workDatabase.beginTransaction();
            try {
                y h10 = this.f21487n.h(str);
                workDatabase.g().i(str);
                if (h10 == null) {
                    f(false);
                } else if (h10 == y.RUNNING) {
                    a(this.f21483j);
                } else if (!h10.a()) {
                    d();
                }
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
        List list = this.f21478d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(str);
            }
            d.a(this.f21484k, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f21477c;
        u2.l lVar = this.f21487n;
        WorkDatabase workDatabase = this.f21486m;
        workDatabase.beginTransaction();
        try {
            lVar.s(y.ENQUEUED, str);
            lVar.r(System.currentTimeMillis(), str);
            lVar.n(-1L, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(true);
        }
    }

    public final void e() {
        String str = this.f21477c;
        u2.l lVar = this.f21487n;
        WorkDatabase workDatabase = this.f21486m;
        workDatabase.beginTransaction();
        try {
            lVar.r(System.currentTimeMillis(), str);
            lVar.s(y.ENQUEUED, str);
            lVar.o(str);
            lVar.n(-1L, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final void f(boolean z10) {
        ListenableWorker listenableWorker;
        this.f21486m.beginTransaction();
        try {
            if (!this.f21486m.h().l()) {
                v2.g.a(this.f21476b, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f21487n.s(y.ENQUEUED, this.f21477c);
                this.f21487n.n(-1L, this.f21477c);
            }
            if (this.f21480g != null && (listenableWorker = this.f21481h) != null && listenableWorker.isRunInForeground()) {
                t2.a aVar = this.f21485l;
                String str = this.f21477c;
                b bVar = (b) aVar;
                synchronized (bVar.f21443m) {
                    bVar.f21438h.remove(str);
                    bVar.g();
                }
            }
            this.f21486m.setTransactionSuccessful();
            this.f21486m.endTransaction();
            this.f21492s.h(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f21486m.endTransaction();
            throw th2;
        }
    }

    public final void g() {
        u2.l lVar = this.f21487n;
        String str = this.f21477c;
        y h10 = lVar.h(str);
        y yVar = y.RUNNING;
        String str2 = f21475v;
        if (h10 == yVar) {
            p.e().b(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            f(true);
        } else {
            p.e().b(str2, String.format("Status for %s is %s; not doing any work", str, h10), new Throwable[0]);
            f(false);
        }
    }

    public final void h() {
        String str = this.f21477c;
        WorkDatabase workDatabase = this.f21486m;
        workDatabase.beginTransaction();
        try {
            b(str);
            this.f21487n.q(str, ((androidx.work.l) this.f21483j).a);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.u) {
            return false;
        }
        p.e().b(f21475v, String.format("Work interrupted for %s", this.f21491r), new Throwable[0]);
        if (this.f21487n.h(this.f21477c) == null) {
            f(false);
        } else {
            f(!r0.a());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r0 != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.m.run():void");
    }
}
