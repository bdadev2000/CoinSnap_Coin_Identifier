package com.glority.android.picturexx.nps;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NpsFragmentLifecycleCallbacks.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/nps/NpsFragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "<init>", "()V", "onFragmentResumed", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class NpsFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        FragmentActivity activity = f.getActivity();
        if (activity != null) {
            CustomNpsPopupController.INSTANCE.checkAndOpen(activity, f.getClass());
        }
    }
}
