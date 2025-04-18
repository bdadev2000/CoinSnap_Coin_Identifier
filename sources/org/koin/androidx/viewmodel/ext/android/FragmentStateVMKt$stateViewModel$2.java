package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes.dex */
public final class FragmentStateVMKt$stateViewModel$2 extends r implements a {
    final /* synthetic */ a $owner;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ a $state;
    final /* synthetic */ Fragment $this_stateViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentStateVMKt$stateViewModel$2(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3) {
        super(0);
        this.$this_stateViewModel = fragment;
        this.$qualifier = qualifier;
        this.$state = aVar;
        this.$owner = aVar2;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        Fragment fragment = this.$this_stateViewModel;
        a aVar = this.$state;
        ((ViewModelStoreOwner) this.$owner.invoke()).getViewModelStore();
        if (BundleExtKt.toExtras((Bundle) aVar.invoke(), fragment) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }
}
