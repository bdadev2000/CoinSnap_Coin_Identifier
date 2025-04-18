package org.koin.androidx.viewmodel.parameter;

import kotlin.jvm.internal.r;
import q0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class AndroidParametersHolder$elementAt$1 extends r implements a {
    final /* synthetic */ c $clazz;
    final /* synthetic */ int $i;
    final /* synthetic */ AndroidParametersHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParametersHolder$elementAt$1(AndroidParametersHolder androidParametersHolder, int i2, c cVar) {
        super(0);
        this.this$0 = androidParametersHolder;
        this.$i = i2;
        this.$clazz = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // q0.a
    public final T invoke() {
        ?? elementAt;
        elementAt = super/*org.koin.core.parameter.ParametersHolder*/.elementAt(this.$i, this.$clazz);
        return elementAt;
    }
}
