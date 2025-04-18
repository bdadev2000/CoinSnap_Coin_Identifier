package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes4.dex */
public final class FragmentSharedVMKt$sharedViewModel$2 extends r implements a {
    final /* synthetic */ a $extrasProducer;
    final /* synthetic */ a $owner;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Fragment $this_sharedViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentSharedVMKt$sharedViewModel$2(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, a aVar3) {
        super(0);
        this.$this_sharedViewModel = fragment;
        this.$qualifier = qualifier;
        this.$owner = aVar;
        this.$extrasProducer = aVar2;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        Fragment fragment = this.$this_sharedViewModel;
        a aVar = this.$owner;
        a aVar2 = this.$extrasProducer;
        ((ViewModelStoreOwner) aVar.invoke()).getViewModelStore();
        if (aVar2 == null || ((CreationExtras) aVar2.invoke()) == null) {
            p0.a.r(fragment.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(fragment);
        p0.a.A0();
        throw null;
    }
}
