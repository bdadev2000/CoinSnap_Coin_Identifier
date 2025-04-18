package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.Qualifier;
import q0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class FragmentSharedStateVMKt$sharedStateViewModel$4 extends r implements a {
    final /* synthetic */ c $clazz;
    final /* synthetic */ a $owner;
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ a $state;
    final /* synthetic */ Fragment $this_sharedStateViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentSharedStateVMKt$sharedStateViewModel$4(Fragment fragment, Qualifier qualifier, a aVar, a aVar2, c cVar, a aVar3) {
        super(0);
        this.$this_sharedStateViewModel = fragment;
        this.$qualifier = qualifier;
        this.$state = aVar;
        this.$owner = aVar2;
        this.$clazz = cVar;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // q0.a
    @NotNull
    public final ViewModel invoke() {
        return FragmentSharedStateVMKt.getSharedStateViewModel(this.$this_sharedStateViewModel, this.$qualifier, this.$state, this.$owner, this.$clazz, this.$parameters);
    }
}
