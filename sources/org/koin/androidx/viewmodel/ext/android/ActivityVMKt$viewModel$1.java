package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes2.dex */
public final class ActivityVMKt$viewModel$1 extends r implements a {
    final /* synthetic */ a $extrasProducer;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ ComponentActivity $this_viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityVMKt$viewModel$1(ComponentActivity componentActivity, Qualifier qualifier, a aVar, a aVar2) {
        super(0);
        this.$this_viewModel = componentActivity;
        this.$qualifier = qualifier;
        this.$extrasProducer = aVar;
        this.$parameters = aVar2;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        ComponentActivity componentActivity = this.$this_viewModel;
        a aVar = this.$extrasProducer;
        componentActivity.getViewModelStore();
        if (aVar == null || ((CreationExtras) aVar.invoke()) == null) {
            p0.a.r(componentActivity.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        p0.a.A0();
        throw null;
    }
}
