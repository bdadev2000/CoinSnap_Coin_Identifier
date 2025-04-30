package G7;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class k implements g, Serializable {
    private final int arity;

    public k(int i9) {
        this.arity = i9;
    }

    @Override // G7.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        s.f1335a.getClass();
        String a6 = t.a(this);
        j.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
