package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes.dex */
public final class ComponentCallbackExtKt$inject$1 extends r implements a {
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ ComponentCallbacks $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentCallbackExtKt$inject$1(ComponentCallbacks componentCallbacks, Qualifier qualifier, a aVar) {
        super(0);
        this.$this_inject = componentCallbacks;
        this.$qualifier = qualifier;
        this.$parameters = aVar;
    }

    @Override // q0.a
    @NotNull
    public final T invoke() {
        AndroidKoinScopeExtKt.getKoinScope(this.$this_inject);
        p0.a.A0();
        throw null;
    }
}
