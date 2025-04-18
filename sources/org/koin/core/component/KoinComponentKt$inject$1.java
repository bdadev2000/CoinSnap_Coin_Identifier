package org.koin.core.component;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes3.dex */
public final class KoinComponentKt$inject$1 extends r implements a {
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ KoinComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinComponentKt$inject$1(KoinComponent koinComponent, Qualifier qualifier, a aVar) {
        super(0);
        this.$this_inject = koinComponent;
        this.$qualifier = qualifier;
        this.$parameters = aVar;
    }

    @Override // q0.a
    @NotNull
    public final T invoke() {
        KoinComponent koinComponent = this.$this_inject;
        if (koinComponent instanceof KoinScopeComponent) {
            ((KoinScopeComponent) koinComponent).getScope();
            p0.a.A0();
            throw null;
        }
        koinComponent.getKoin().getScopeRegistry().getRootScope();
        p0.a.A0();
        throw null;
    }
}
