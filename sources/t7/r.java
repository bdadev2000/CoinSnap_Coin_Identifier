package T7;

import Q7.C0238f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.y;

/* loaded from: classes3.dex */
public final class r extends U7.b implements o, b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3079g = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: f, reason: collision with root package name */
    public int f3080f;

    public r(Object obj) {
        this._state$volatile = obj;
    }

    @Override // T7.c
    public final Object a(Object obj, w7.f fVar) {
        if (obj == null) {
            obj = U7.p.f3378a;
        }
        c(null, obj);
        return y.f23029a;
    }

    public final boolean b(Object obj, Object obj2) {
        H0.a aVar = U7.p.f3378a;
        if (obj == null) {
            obj = aVar;
        }
        return c(obj, obj2);
    }

    public final boolean c(Object obj, Object obj2) {
        int i9;
        U7.c[] cVarArr;
        H0.a aVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3079g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !G7.j.a(obj3, obj)) {
                return false;
            }
            if (G7.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f3080f;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.f3080f = i11;
                U7.c[] cVarArr2 = this.b;
                while (true) {
                    t[] tVarArr = (t[]) cVarArr2;
                    if (tVarArr != null) {
                        for (t tVar : tVarArr) {
                            if (tVar != null) {
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t.f3082a;
                                    Object obj4 = atomicReferenceFieldUpdater2.get(tVar);
                                    if (obj4 != null && obj4 != (aVar = s.b)) {
                                        H0.a aVar2 = s.f3081a;
                                        if (obj4 == aVar2) {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, obj4, aVar)) {
                                                if (atomicReferenceFieldUpdater2.get(tVar) != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, obj4, aVar2)) {
                                                if (atomicReferenceFieldUpdater2.get(tVar) != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C0238f) obj4).e(y.f23029a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i9 = this.f3080f;
                        if (i9 == i11) {
                            this.f3080f = i11 + 1;
                            return true;
                        }
                        cVarArr = this.b;
                    }
                    cVarArr2 = cVarArr;
                    i11 = i9;
                }
            } else {
                this.f3080f = i10 + 2;
                return true;
            }
        }
    }

    @Override // T7.p
    public final Object getValue() {
        H0.a aVar = U7.p.f3378a;
        Object obj = f3079g.get(this);
        if (obj == aVar) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // T7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(T7.c r18, w7.f r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.r.k(T7.c, w7.f):java.lang.Object");
    }
}
