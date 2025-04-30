package V0;

import Q7.n0;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import androidx.work.n;
import androidx.work.o;
import c1.InterfaceC0586a;
import d1.C2164e;
import d1.C2168i;
import f1.C2262k;
import g1.InterfaceC2286a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f3425v = o.g("WorkerWrapper");
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public String f3426c;

    /* renamed from: d, reason: collision with root package name */
    public List f3427d;

    /* renamed from: f, reason: collision with root package name */
    public C.c f3428f;

    /* renamed from: g, reason: collision with root package name */
    public C2168i f3429g;

    /* renamed from: h, reason: collision with root package name */
    public ListenableWorker f3430h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC2286a f3431i;

    /* renamed from: j, reason: collision with root package name */
    public n f3432j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.work.b f3433k;
    public InterfaceC0586a l;
    public WorkDatabase m;

    /* renamed from: n, reason: collision with root package name */
    public B4.c f3434n;

    /* renamed from: o, reason: collision with root package name */
    public a7.b f3435o;

    /* renamed from: p, reason: collision with root package name */
    public E1.d f3436p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3437q;

    /* renamed from: r, reason: collision with root package name */
    public String f3438r;

    /* renamed from: s, reason: collision with root package name */
    public C2262k f3439s;

    /* renamed from: t, reason: collision with root package name */
    public f4.c f3440t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f3441u;

    public final void a(n nVar) {
        boolean z8 = nVar instanceof m;
        String str = f3425v;
        if (z8) {
            o.e().f(str, AbstractC2914a.d("Worker result SUCCESS for ", this.f3438r), new Throwable[0]);
            if (this.f3429g.c()) {
                e();
                return;
            }
            a7.b bVar = this.f3435o;
            String str2 = this.f3426c;
            B4.c cVar = this.f3434n;
            WorkDatabase workDatabase = this.m;
            workDatabase.c();
            try {
                cVar.q(3, str2);
                cVar.o(str2, ((m) this.f3432j).f5246a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = bVar.p(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (cVar.g(str3) == 5 && bVar.t(str3)) {
                        o.e().f(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                        cVar.q(1, str3);
                        cVar.p(currentTimeMillis, str3);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                f(false);
                return;
            } catch (Throwable th) {
                workDatabase.f();
                f(false);
                throw th;
            }
        }
        if (nVar instanceof androidx.work.l) {
            o.e().f(str, AbstractC2914a.d("Worker result RETRY for ", this.f3438r), new Throwable[0]);
            d();
            return;
        }
        o.e().f(str, AbstractC2914a.d("Worker result FAILURE for ", this.f3438r), new Throwable[0]);
        if (this.f3429g.c()) {
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
            B4.c cVar = this.f3434n;
            if (cVar.g(str2) != 6) {
                cVar.q(4, str2);
            }
            linkedList.addAll(this.f3435o.p(str2));
        }
    }

    public final void c() {
        boolean i9 = i();
        String str = this.f3426c;
        WorkDatabase workDatabase = this.m;
        if (!i9) {
            workDatabase.c();
            try {
                int g9 = this.f3434n.g(str);
                b1.h m = workDatabase.m();
                D0.j jVar = (D0.j) m.b;
                jVar.b();
                C2164e c2164e = (C2164e) m.f5271d;
                I0.f a6 = c2164e.a();
                if (str == null) {
                    a6.i(1);
                } else {
                    a6.j(1, str);
                }
                jVar.c();
                try {
                    a6.p();
                    jVar.h();
                    if (g9 == 0) {
                        f(false);
                    } else if (g9 == 2) {
                        a(this.f3432j);
                    } else if (!n0.b(g9)) {
                        d();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    jVar.f();
                    c2164e.c(a6);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.f3427d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(str);
            }
            d.a(this.f3433k, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f3426c;
        B4.c cVar = this.f3434n;
        WorkDatabase workDatabase = this.m;
        workDatabase.c();
        try {
            cVar.q(1, str);
            cVar.p(System.currentTimeMillis(), str);
            cVar.m(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f3426c;
        B4.c cVar = this.f3434n;
        WorkDatabase workDatabase = this.m;
        workDatabase.c();
        try {
            cVar.p(System.currentTimeMillis(), str);
            cVar.q(1, str);
            cVar.n(str);
            cVar.m(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x0070, B:30:0x007d, B:32:0x007e, B:38:0x0092, B:39:0x0098, B:24:0x0071, B:25:0x0079, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x0070, B:30:0x007d, B:32:0x007e, B:38:0x0092, B:39:0x0098, B:24:0x0071, B:25:0x0079, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.m
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.m     // Catch: java.lang.Throwable -> L42
            B4.c r0 = r0.n()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            D0.m r1 = D0.m.c(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f316a     // Catch: java.lang.Throwable -> L42
            D0.j r0 = (D0.j) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L92
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.b     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            e1.g.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L99
        L44:
            if (r6 == 0) goto L5a
            B4.c r0 = r5.f3434n     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f3426c     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.q(r4, r1)     // Catch: java.lang.Throwable -> L42
            B4.c r0 = r5.f3434n     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f3426c     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.m(r2, r1)     // Catch: java.lang.Throwable -> L42
        L5a:
            d1.i r0 = r5.f3429g     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7e
            androidx.work.ListenableWorker r0 = r5.f3430h     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7e
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7e
            c1.a r0 = r5.l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f3426c     // Catch: java.lang.Throwable -> L42
            V0.b r0 = (V0.b) r0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.m     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f3396h     // Catch: java.lang.Throwable -> L7b
            r3.remove(r1)     // Catch: java.lang.Throwable -> L7b
            r0.h()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            goto L7e
        L7b:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            throw r6     // Catch: java.lang.Throwable -> L42
        L7e:
            androidx.work.impl.WorkDatabase r0 = r5.m     // Catch: java.lang.Throwable -> L42
            r0.h()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.m
            r0.f()
            f1.k r0 = r5.f3439s
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L92:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L99:
            androidx.work.impl.WorkDatabase r0 = r5.m
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.l.f(boolean):void");
    }

    public final void g() {
        B4.c cVar = this.f3434n;
        String str = this.f3426c;
        int g9 = cVar.g(str);
        String str2 = f3425v;
        if (g9 == 2) {
            o.e().b(str2, AbstractC2914a.e("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            f(true);
            return;
        }
        o e4 = o.e();
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Status for ", str, " is ");
        n2.append(n0.z(g9));
        n2.append("; not doing any work");
        e4.b(str2, n2.toString(), new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f3426c;
        WorkDatabase workDatabase = this.m;
        workDatabase.c();
        try {
            b(str);
            this.f3434n.o(str, ((androidx.work.k) this.f3432j).f5245a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f3441u) {
            return false;
        }
        o.e().b(f3425v, AbstractC2914a.d("Work interrupted for ", this.f3438r), new Throwable[0]);
        if (this.f3434n.g(this.f3426c) == 0) {
            f(false);
        } else {
            f(!n0.b(r0));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r6.f19810k > 0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Type inference failed for: r0v33, types: [f1.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.l.run():void");
    }
}
