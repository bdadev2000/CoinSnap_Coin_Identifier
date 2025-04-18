package org.koin.androidx.viewmodel.parameter;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class AndroidParametersHolder$getOrNull$1 extends r implements a {
    final /* synthetic */ c $clazz;
    final /* synthetic */ AndroidParametersHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParametersHolder$getOrNull$1(AndroidParametersHolder androidParametersHolder, c cVar) {
        super(0);
        this.this$0 = androidParametersHolder;
        this.$clazz = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // q0.a
    @Nullable
    public final T invoke() {
        ?? orNull;
        orNull = super/*org.koin.core.parameter.ParametersHolder*/.getOrNull(this.$clazz);
        return orNull;
    }
}
