package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes.dex */
public final class FragmentStateVMKt$getStateViewModel$1 extends r implements a {
    final /* synthetic */ Fragment $this_getStateViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentStateVMKt$getStateViewModel$1(Fragment fragment) {
        super(0);
        this.$this_getStateViewModel = fragment;
    }

    @Override // q0.a
    @NotNull
    public final Fragment invoke() {
        return this.$this_getStateViewModel;
    }
}
