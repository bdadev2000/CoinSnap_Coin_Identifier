package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class k1 extends r1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(h1 h1Var) {
        super(true);
        boolean z2 = true;
        W(h1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f22371b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar != null) {
            r1 x = pVar.x();
            while (!x.Q()) {
                o oVar2 = (o) atomicReferenceFieldUpdater.get(x);
                p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
                if (pVar2 != null) {
                    x = pVar2.x();
                }
            }
            this.f22335c = z2;
        }
        z2 = false;
        this.f22335c = z2;
    }

    @Override // b1.r1
    public final boolean Q() {
        return this.f22335c;
    }

    @Override // b1.r1
    public final boolean R() {
        return true;
    }
}
