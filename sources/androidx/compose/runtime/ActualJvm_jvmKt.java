package androidx.compose.runtime;

import kotlin.jvm.internal.e;
import q0.p;

/* loaded from: classes3.dex */
public final class ActualJvm_jvmKt {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final void b(Composer composer, p pVar) {
        p0.a.q(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        e.g(2, pVar);
        pVar.invoke(composer, 1);
    }
}
