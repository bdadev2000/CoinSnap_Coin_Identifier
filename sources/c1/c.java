package c1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import y0.j;

/* loaded from: classes.dex */
public final class c implements j {
    public final j a;

    public c(j delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // y0.j
    public final Object a(Function2 function2, Continuation continuation) {
        return this.a.a(new b(function2, null), continuation);
    }

    @Override // y0.j
    public final Flow getData() {
        return this.a.getData();
    }
}
