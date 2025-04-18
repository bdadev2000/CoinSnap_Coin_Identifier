package org.koin.core.component;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;
import q0.a;

/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: classes.dex */
public final class KoinScopeComponentKt$newScope$1 extends r implements a {
    final /* synthetic */ KoinScopeComponent $this_newScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public KoinScopeComponentKt$newScope$1(KoinScopeComponent koinScopeComponent) {
        super(0);
        this.$this_newScope = koinScopeComponent;
    }

    @Override // q0.a
    @NotNull
    public final Scope invoke() {
        return KoinScopeComponentKt.createScope$default(this.$this_newScope, null, 1, null);
    }
}
