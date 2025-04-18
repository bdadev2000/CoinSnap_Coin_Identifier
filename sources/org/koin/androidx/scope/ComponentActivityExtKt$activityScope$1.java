package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes.dex */
public final class ComponentActivityExtKt$activityScope$1 extends r implements a {
    final /* synthetic */ ComponentActivity $this_activityScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivityExtKt$activityScope$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_activityScope = componentActivity;
    }

    @Override // q0.a
    @NotNull
    public final Scope invoke() {
        return ComponentActivityExtKt.createActivityScope(this.$this_activityScope);
    }
}
