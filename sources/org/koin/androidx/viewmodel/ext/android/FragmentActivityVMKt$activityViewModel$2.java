package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes3.dex */
public final class FragmentActivityVMKt$activityViewModel$2 extends r implements a {
    final /* synthetic */ a $extrasProducer;
    final /* synthetic */ a $ownerProducer;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Fragment $this_activityViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentActivityVMKt$activityViewModel$2(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3) {
        super(0);
        this.$this_activityViewModel = fragment;
        this.$qualifier = qualifier;
        this.$ownerProducer = aVar;
        this.$extrasProducer = aVar2;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        Fragment fragment = this.$this_activityViewModel;
        a aVar = this.$ownerProducer;
        a aVar2 = this.$extrasProducer;
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) aVar.invoke();
        viewModelStoreOwner.getViewModelStore();
        if (aVar2 == null || ((CreationExtras) aVar2.invoke()) == null) {
            ComponentActivity componentActivity = viewModelStoreOwner instanceof ComponentActivity ? (ComponentActivity) viewModelStoreOwner : null;
            if ((componentActivity != null ? componentActivity.getDefaultViewModelCreationExtras() : null) == null) {
                p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
            }
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }
}
