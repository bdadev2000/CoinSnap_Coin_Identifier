package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class FragmentVMKt$getViewModel$1 extends r implements a {
    final /* synthetic */ Fragment $this_getViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentVMKt$getViewModel$1(Fragment fragment) {
        super(0);
        this.$this_getViewModel = fragment;
    }

    @Override // q0.a
    @NotNull
    public final Fragment invoke() {
        return this.$this_getViewModel;
    }
}
