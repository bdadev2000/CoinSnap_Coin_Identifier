package org.koin.android.scope;

import android.content.ComponentCallbacks;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;
import q0.a;

/* JADX WARN: Incorrect field signature: TT; */
/* loaded from: classes2.dex */
public final class ComponentCallbacksExtKt$getOrCreateScope$1 extends r implements a {
    final /* synthetic */ ComponentCallbacks $this_getOrCreateScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public ComponentCallbacksExtKt$getOrCreateScope$1(ComponentCallbacks componentCallbacks) {
        super(0);
        this.$this_getOrCreateScope = componentCallbacks;
    }

    @Override // q0.a
    @NotNull
    public final Scope invoke() {
        Scope scopeOrNull = ComponentCallbacksExtKt.getScopeOrNull(this.$this_getOrCreateScope);
        return scopeOrNull == null ? ComponentCallbacksExtKt.createScope$default(this.$this_getOrCreateScope, null, 1, null) : scopeOrNull;
    }
}
