package b1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class c extends l1 {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22289i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer");

    @Nullable
    private volatile Object _disposer;

    /* renamed from: f, reason: collision with root package name */
    public final k f22290f;

    /* renamed from: g, reason: collision with root package name */
    public q0 f22291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f22292h;

    public c(e eVar, l lVar) {
        this.f22292h = eVar;
        this.f22290f = lVar;
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return d0.b0.f30125a;
    }

    @Override // b1.l1
    public final void y(Throwable th) {
        k kVar = this.f22290f;
        if (th != null) {
            android.support.v4.media.session.i q2 = kVar.q(th);
            if (q2 != null) {
                kVar.G(q2);
                d dVar = (d) f22289i.get(this);
                if (dVar != null) {
                    dVar.c();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f22297b;
        e eVar = this.f22292h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.f22298a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.e());
            }
            kVar.resumeWith(arrayList);
        }
    }
}
