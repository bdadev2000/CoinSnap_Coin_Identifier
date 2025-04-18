package androidx.compose.foundation.lazy.grid;

import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class LazyGridState$Companion$Saver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyGridState$Companion$Saver$1 f4621a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LazyGridState lazyGridState = (LazyGridState) obj2;
        return f0.v(Integer.valueOf(lazyGridState.g()), Integer.valueOf(lazyGridState.h()));
    }
}
