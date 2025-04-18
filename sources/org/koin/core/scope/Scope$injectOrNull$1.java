package org.koin.core.scope;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes.dex */
public final class Scope$injectOrNull$1 extends r implements a {
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scope$injectOrNull$1(Scope scope, Qualifier qualifier, a aVar) {
        super(0);
        this.this$0 = scope;
        this.$qualifier = qualifier;
        this.$parameters = aVar;
    }

    @Override // q0.a
    @Nullable
    public final T invoke() {
        p0.a.A0();
        throw null;
    }
}
