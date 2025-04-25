package com.glority.android.ui.base;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseCenterDialogFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/glority/android/ui/base/BaseCenterDialogFragment;", "Lcom/glority/android/ui/base/BaseDialogFragment;", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseCenterDialogFragment extends BaseDialogFragment {
    @Override // com.glority.android.ui.base.BaseDialogFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.glority.android.ui.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Window window2;
        Window window3;
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setGravity(17);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        super.onViewCreated(view, savedInstanceState);
    }
}
