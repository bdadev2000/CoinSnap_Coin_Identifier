package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class FragmentSharedStateVMKt$getSharedStateViewModel$1 extends r implements a {
    final /* synthetic */ Fragment $this_getSharedStateViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentSharedStateVMKt$getSharedStateViewModel$1(Fragment fragment) {
        super(0);
        this.$this_getSharedStateViewModel = fragment;
    }

    @Override // q0.a
    @NotNull
    public final FragmentActivity invoke() {
        FragmentActivity requireActivity = this.$this_getSharedStateViewModel.requireActivity();
        p0.a.r(requireActivity, "requireActivity(...)");
        return requireActivity;
    }
}
