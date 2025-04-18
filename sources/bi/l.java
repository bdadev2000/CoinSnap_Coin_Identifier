package bi;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final ai.c f2502c;

    /* renamed from: d, reason: collision with root package name */
    public final zh.i f2503d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2504e;

    public l(ai.f taskRunner, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.a = 5;
        this.f2501b = timeUnit.toNanos(5L);
        this.f2502c = taskRunner.f();
        this.f2503d = new zh.i(1, this, Intrinsics.stringPlus(xh.b.f27682g, " ConnectionPool"));
        this.f2504e = new ConcurrentLinkedQueue();
    }

    public final boolean a(wh.a address, i call, List list, boolean z10) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f2504e.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                return false;
            }
            k connection = (k) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (connection.f2490g != null) {
                        z11 = true;
                    }
                    if (!z11) {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (connection.h(address, list)) {
                    call.b(connection);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final int b(k kVar, long j3) {
        byte[] bArr = xh.b.a;
        ArrayList arrayList = kVar.f2499p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + kVar.f2485b.a.f27007i + " was leaked. Did you forget to close a response body?";
                gi.l lVar = gi.l.a;
                gi.l.a.j(str, ((g) reference).a);
                arrayList.remove(i10);
                kVar.f2493j = true;
                if (arrayList.isEmpty()) {
                    kVar.f2500q = j3 - this.f2501b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
