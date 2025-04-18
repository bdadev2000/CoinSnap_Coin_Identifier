package g1;

import b1.c2;
import b1.d2;
import b1.h1;
import b1.k2;
import b1.y0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30588a = new android.support.v4.media.session.i("NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30589b = new android.support.v4.media.session.i("CLOSED");

    /* renamed from: c, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30590c = new android.support.v4.media.session.i("UNDEFINED");
    public static final android.support.v4.media.session.i d = new android.support.v4.media.session.i("REUSABLE_CLAIMED");
    public static final android.support.v4.media.session.i e = new android.support.v4.media.session.i("CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30591f = new android.support.v4.media.session.i("NO_THREAD_ELEMENTS");

    public static final Object a(z zVar, long j2, q0.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (zVar.f30641c >= j2 && !zVar.c()) {
                return zVar;
            }
            Object obj = e.f30603a.get(zVar);
            android.support.v4.media.session.i iVar = f30589b;
            if (obj == iVar) {
                return iVar;
            }
            z zVar2 = (z) ((e) obj);
            if (zVar2 == null) {
                zVar2 = (z) pVar.invoke(Long.valueOf(zVar.f30641c + 1), zVar);
                do {
                    atomicReferenceFieldUpdater = e.f30603a;
                    if (atomicReferenceFieldUpdater.compareAndSet(zVar, null, zVar2)) {
                        if (zVar.c()) {
                            zVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(zVar) == null);
            }
            zVar = zVar2;
        }
    }

    public static final void b(h0.l lVar, Object obj) {
        if (obj == f30591f) {
            return;
        }
        if (!(obj instanceof g0)) {
            Object H = lVar.H(null, c0.f30597c);
            p0.a.q(H, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((c2) H).D(obj);
            return;
        }
        g0 g0Var = (g0) obj;
        c2[] c2VarArr = g0Var.f30612c;
        int length = c2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            c2 c2Var = c2VarArr[length];
            p0.a.p(c2Var);
            c2Var.D(g0Var.f30611b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final void c(h0.g gVar, Object obj, q0.l lVar) {
        if (!(gVar instanceof i)) {
            gVar.resumeWith(obj);
            return;
        }
        i iVar = (i) gVar;
        Throwable a2 = d0.n.a(obj);
        Object vVar = a2 == null ? lVar != null ? new b1.v(obj, lVar) : obj : new b1.u(false, a2);
        h0.g gVar2 = iVar.f30616f;
        h0.l context = gVar2.getContext();
        b1.z zVar = iVar.d;
        if (zVar.j0(context)) {
            iVar.f30617g = vVar;
            iVar.f22348c = 1;
            zVar.h0(gVar2.getContext(), iVar);
            return;
        }
        y0 a3 = d2.a();
        if (a3.p0()) {
            iVar.f30617g = vVar;
            iVar.f22348c = 1;
            a3.m0(iVar);
            return;
        }
        a3.o0(true);
        try {
            h1 h1Var = (h1) gVar2.getContext().i(b1.a0.f22285b);
            if (h1Var == null || h1Var.isActive()) {
                Object obj2 = iVar.f30618h;
                h0.l context2 = gVar2.getContext();
                Object e2 = e(context2, obj2);
                k2 G0 = e2 != f30591f ? p0.a.G0(gVar2, context2, e2) : null;
                try {
                    gVar2.resumeWith(obj);
                } finally {
                    if (G0 == null || G0.p0()) {
                        b(context2, e2);
                    }
                }
            } else {
                CancellationException n2 = h1Var.n();
                iVar.b(vVar, n2);
                iVar.resumeWith(kotlin.jvm.internal.q.d(n2));
            }
            do {
            } while (a3.r0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final Object d(h0.l lVar) {
        Object H = lVar.H(0, c0.f30596b);
        p0.a.p(H);
        return H;
    }

    public static final Object e(h0.l lVar, Object obj) {
        if (obj == null) {
            obj = d(lVar);
        }
        return obj == 0 ? f30591f : obj instanceof Integer ? lVar.H(new g0(lVar, ((Number) obj).intValue()), c0.d) : ((c2) obj).h(lVar);
    }
}
