package y7;

import G7.j;
import G7.s;
import G7.t;

/* renamed from: y7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2960i extends AbstractC2954c implements G7.g {

    /* renamed from: f, reason: collision with root package name */
    public final int f24450f;

    public AbstractC2960i(int i9, w7.f fVar) {
        super(fVar);
        this.f24450f = i9;
    }

    @Override // G7.g
    public final int getArity() {
        return this.f24450f;
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
