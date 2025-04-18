package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes.dex */
public final class FragmentStateVMKt$stateViewModel$1 extends r implements a {
    final /* synthetic */ Fragment $this_stateViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentStateVMKt$stateViewModel$1(Fragment fragment) {
        super(0);
        this.$this_stateViewModel = fragment;
    }

    @Override // q0.a
    @NotNull
    public final Fragment invoke() {
        return this.$this_stateViewModel;
    }
}
