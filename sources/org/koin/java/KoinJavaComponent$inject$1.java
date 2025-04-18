package org.koin.java;

import kotlin.jvm.internal.r;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes2.dex */
public final class KoinJavaComponent$inject$1 extends r implements a {
    final /* synthetic */ Class<?> $clazz;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinJavaComponent$inject$1(Class<?> cls, Qualifier qualifier, a aVar) {
        super(0);
        this.$clazz = cls;
        this.$qualifier = qualifier;
        this.$parameters = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // q0.a
    public final T invoke() {
        return KoinJavaComponent.get(this.$clazz, this.$qualifier, this.$parameters);
    }
}
