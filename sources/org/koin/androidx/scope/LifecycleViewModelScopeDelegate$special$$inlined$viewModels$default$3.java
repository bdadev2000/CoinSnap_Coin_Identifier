package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$3 extends r implements a {
    final /* synthetic */ a $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleViewModelScopeDelegate$special$$inlined$viewModels$default$3(a aVar, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_viewModels = componentActivity;
    }

    @Override // q0.a
    @NotNull
    public final CreationExtras invoke() {
        CreationExtras creationExtras;
        a aVar = this.$extrasProducer;
        if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
            return creationExtras;
        }
        CreationExtras defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
        p0.a.r(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
