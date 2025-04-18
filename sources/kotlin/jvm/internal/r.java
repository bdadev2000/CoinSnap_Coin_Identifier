package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class r implements m, Serializable {
    private final int arity;

    public r(int i2) {
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.m
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        g0.f30932a.getClass();
        String a2 = h0.a(this);
        p0.a.r(a2, "renderLambdaToString(...)");
        return a2;
    }
}
