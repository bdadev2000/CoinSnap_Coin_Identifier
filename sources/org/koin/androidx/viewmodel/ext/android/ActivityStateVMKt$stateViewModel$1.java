package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes2.dex */
public final class ActivityStateVMKt$stateViewModel$1 extends r implements a {
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ a $state;
    final /* synthetic */ ComponentActivity $this_stateViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityStateVMKt$stateViewModel$1(ComponentActivity componentActivity, Qualifier qualifier, a aVar, a aVar2) {
        super(0);
        this.$this_stateViewModel = componentActivity;
        this.$qualifier = qualifier;
        this.$state = aVar;
        this.$parameters = aVar2;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        ComponentActivity componentActivity = this.$this_stateViewModel;
        a aVar = this.$state;
        componentActivity.getViewModelStore();
        if (BundleExtKt.toExtras((Bundle) aVar.invoke(), componentActivity) == null) {
            p0.a.r(componentActivity.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        p0.a.A0();
        throw null;
    }
}
