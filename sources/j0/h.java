package j0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class h extends g implements m {
    private final int arity;

    public h(h0.g gVar) {
        super(gVar);
        this.arity = 2;
    }

    @Override // kotlin.jvm.internal.m
    public int getArity() {
        return this.arity;
    }

    @Override // j0.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        g0.f30932a.getClass();
        String a2 = h0.a(this);
        p0.a.r(a2, "renderLambdaToString(...)");
        return a2;
    }
}
