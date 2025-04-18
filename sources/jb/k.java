package jb;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import mb.e1;
import mb.h2;
import mb.o0;
import mb.q0;
import mb.x0;
import mb.z0;

/* loaded from: classes3.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f19898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f19899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2.l f19900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19901e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f19902f;

    public k(m mVar, long j3, Throwable th2, Thread thread, m2.l lVar) {
        this.f19902f = mVar;
        this.a = j3;
        this.f19898b = th2;
        this.f19899c = thread;
        this.f19900d = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        rb.a aVar;
        Boolean bool;
        ob.c cVar;
        String str2;
        rb.a aVar2;
        boolean z10;
        long j3 = this.a;
        long j10 = j3 / 1000;
        m mVar = this.f19902f;
        ob.a aVar3 = (ob.a) mVar.f19916m.f23292b;
        aVar3.getClass();
        NavigableSet descendingSet = new TreeSet(ob.c.s(((File) aVar3.f23289b.f23294d).list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            str = (String) descendingSet.first();
        } else {
            str = null;
        }
        b6.a aVar4 = b6.a.f2288f;
        if (str == null) {
            aVar4.e("Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f19906c.g();
        ob.c cVar2 = mVar.f19916m;
        cVar2.getClass();
        aVar4.h("Persisting fatal event for session ".concat(str));
        r rVar = (r) cVar2.a;
        Context context = rVar.a;
        int i10 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable th2 = this.f19898b; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        ic.t tVar = null;
        while (true) {
            boolean isEmpty = stack.isEmpty();
            aVar = rVar.f19946d;
            if (isEmpty) {
                break;
            }
            Throwable th3 = (Throwable) stack.pop();
            tVar = new ic.t(th3.getLocalizedMessage(), th3.getClass().getName(), aVar.a(th3.getStackTrace()), tVar);
            stack = stack;
            aVar4 = aVar4;
            j3 = j3;
        }
        long j11 = j3;
        b6.a aVar5 = aVar4;
        o0 o0Var = new o0();
        o0Var.f22033b = AppMeasurement.CRASH_ORIGIN;
        o0Var.a = j10;
        o0Var.f22038g = (byte) (o0Var.f22038g | 1);
        h2 g10 = b6.b.f2296h.g(context);
        int i11 = ((e1) g10).f21903c;
        if (i11 > 0) {
            if (i11 != 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
        } else {
            bool = null;
        }
        q0 q0Var = new q0();
        q0Var.f22056d = bool;
        q0Var.f22057e = g10;
        q0Var.f22058f = b6.b.e(context);
        q0Var.f22059g = i10;
        q0Var.f22060h = (byte) (q0Var.f22060h | 1);
        w3.h hVar = new w3.h();
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar.f19575c;
        z0 z0Var = new z0();
        Thread thread = this.f19899c;
        String name = thread.getName();
        if (name != null) {
            z0Var.a = name;
            z0Var.f22140b = 4;
            z0Var.f22142d = (byte) (z0Var.f22142d | 1);
            List d10 = r.d(stackTraceElementArr, 4);
            if (d10 != null) {
                z0Var.f22141c = d10;
                arrayList.add(z0Var.a());
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Thread, StackTraceElement[]> next = it.next();
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                    Thread key = next.getKey();
                    if (!key.equals(thread)) {
                        StackTraceElement[] a = aVar.a(next.getValue());
                        aVar2 = aVar;
                        z0 z0Var2 = new z0();
                        String name2 = key.getName();
                        if (name2 != null) {
                            z0Var2.a = name2;
                            z0Var2.f22140b = 0;
                            z0Var2.f22142d = (byte) (z0Var2.f22142d | 1);
                            List d11 = r.d(a, 0);
                            if (d11 != null) {
                                z0Var2.f22141c = d11;
                                arrayList.add(z0Var2.a());
                            } else {
                                throw new NullPointerException("Null frames");
                            }
                        } else {
                            throw new NullPointerException("Null name");
                        }
                    } else {
                        aVar2 = aVar;
                    }
                    aVar = aVar2;
                    it = it2;
                }
                hVar.a = Collections.unmodifiableList(arrayList);
                hVar.f26699b = r.c(tVar, 0);
                x0 x0Var = new x0();
                x0Var.a = "0";
                x0Var.f22126b = "0";
                x0Var.f22127c = 0L;
                x0Var.f22128d = (byte) (x0Var.f22128d | 1);
                hVar.f26701d = x0Var.a();
                List a10 = rVar.a();
                if (a10 != null) {
                    hVar.f26702e = a10;
                    q0Var.a = hVar.b();
                    o0Var.f22034c = q0Var.a();
                    o0Var.f22035d = rVar.b(i10);
                    ((ob.a) cVar2.f23292b).c(ob.c.i(ob.c.h(o0Var.a(), (lb.e) cVar2.f23294d, (ob.c) cVar2.f23295e), (ob.c) cVar2.f23295e), str, true);
                    try {
                        cVar = mVar.f19910g;
                        str2 = ".ae" + j11;
                        cVar.getClass();
                    } catch (IOException e2) {
                        aVar5.i("Could not create app exception marker file.", e2);
                    }
                    if (!new File((File) cVar.f23293c, str2).createNewFile()) {
                        throw new IOException("Create new file failed.");
                    }
                    m2.l lVar = this.f19900d;
                    mVar.b(false, lVar, false);
                    mVar.c(Boolean.valueOf(this.f19901e), new e().a);
                    if (!mVar.f19905b.a()) {
                        return Tasks.forResult(null);
                    }
                    return ((TaskCompletionSource) ((AtomicReference) lVar.f21474i).get()).getTask().onSuccessTask(mVar.f19908e.a, new qa.a(4, this, str));
                }
                throw new NullPointerException("Null binaries");
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }
}
