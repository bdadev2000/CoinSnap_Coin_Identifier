package e1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class i1 extends f1.b implements m0, h, f1.s {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30285g = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_state");

    @Nullable
    private volatile Object _state;

    /* renamed from: f, reason: collision with root package name */
    public int f30286f;

    public i1(Object obj) {
        this._state = obj;
    }

    @Override // e1.l0
    public final boolean b(Object obj) {
        h(obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f1.d] */
    @Override // f1.b
    public final f1.d c() {
        return new Object();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c7, B:31:0x00df, B:37:0x00f3, B:33:0x00ea, B:36:0x00f0, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c7, B:31:0x00df, B:37:0x00f3, B:33:0x00ea, B:36:0x00f0, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c6 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // e1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(e1.i r17, h0.g r18) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.i1.collect(e1.i, h0.g):java.lang.Object");
    }

    @Override // f1.b
    public final f1.d[] d() {
        return new j1[2];
    }

    @Override // e1.l0, e1.i
    public final Object emit(Object obj, h0.g gVar) {
        h(obj);
        return d0.b0.f30125a;
    }

    public final boolean g(Object obj, Object obj2) {
        android.support.v4.media.session.i iVar = f1.c.f30458b;
        if (obj == null) {
            obj = iVar;
        }
        if (obj2 == null) {
            obj2 = iVar;
        }
        return i(obj, obj2);
    }

    @Override // e1.g1
    public final Object getValue() {
        android.support.v4.media.session.i iVar = f1.c.f30458b;
        Object obj = f30285g.get(this);
        if (obj == iVar) {
            return null;
        }
        return obj;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = f1.c.f30458b;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i2;
        f1.d[] dVarArr;
        android.support.v4.media.session.i iVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30285g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !p0.a.g(obj3, obj)) {
                return false;
            }
            if (p0.a.g(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f30286f;
            if ((i3 & 1) != 0) {
                this.f30286f = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f30286f = i4;
            f1.d[] dVarArr2 = this.f30452a;
            while (true) {
                j1[] j1VarArr = (j1[]) dVarArr2;
                if (j1VarArr != null) {
                    for (j1 j1Var : j1VarArr) {
                        if (j1Var != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j1.f30293a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(j1Var);
                                if (obj4 != null && obj4 != (iVar = t0.f30347c)) {
                                    android.support.v4.media.session.i iVar2 = t0.f30346b;
                                    if (obj4 != iVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(j1Var, obj4, iVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(j1Var) != obj4) {
                                                break;
                                            }
                                        }
                                        ((b1.l) obj4).resumeWith(d0.b0.f30125a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(j1Var, obj4, iVar)) {
                                        if (atomicReferenceFieldUpdater2.get(j1Var) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f30286f;
                    if (i2 == i4) {
                        this.f30286f = i4 + 1;
                        return true;
                    }
                    dVarArr = this.f30452a;
                }
                dVarArr2 = dVarArr;
                i4 = i2;
            }
        }
    }

    @Override // e1.l0
    public final void n() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }
}
