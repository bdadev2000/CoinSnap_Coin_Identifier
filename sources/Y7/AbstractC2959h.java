package y7;

import G7.j;
import G7.s;
import G7.t;

/* renamed from: y7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2959h extends AbstractC2958g implements G7.g {

    /* renamed from: c, reason: collision with root package name */
    public final int f24449c;

    public AbstractC2959h(int i9, w7.f fVar) {
        super(fVar);
        this.f24449c = i9;
    }

    @Override // G7.g
    public final int getArity() {
        return this.f24449c;
    }

    @Override // y7.AbstractC2952a
    public final String toString() {
        if (this.b == null) {
            s.f1335a.getClass();
            String a6 = t.a(this);
            j.d(a6, "renderLambdaToString(...)");
            return a6;
        }
        return super.toString();
    }
}
