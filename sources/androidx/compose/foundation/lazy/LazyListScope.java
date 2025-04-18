package androidx.compose.foundation.lazy;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import q0.l;
import q0.q;

@LazyScopeMarker
/* loaded from: classes3.dex */
public interface LazyListScope {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void f(LazyListScope lazyListScope, String str, q qVar, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        lazyListScope.c(str, null, qVar);
    }

    default void c(Object obj, Object obj2, q qVar) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    default void d(int i2, l lVar, l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        throw new IllegalStateException("The method is not implemented".toString());
    }
}
