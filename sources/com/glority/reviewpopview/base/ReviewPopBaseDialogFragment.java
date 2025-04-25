package com.glority.reviewpopview.base;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.glority.android.core.app.AppContext;
import com.glority.reviewpopview.R;
import com.glority.reviewpopview.base.ReviewPopILogEvent;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewPopBaseDialogFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/glority/reviewpopview/base/ReviewPopBaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/glority/reviewpopview/base/ReviewPopILogEvent;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "mod_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public class ReviewPopBaseDialogFragment extends DialogFragment implements ReviewPopILogEvent {
    @Override // com.glority.reviewpopview.base.ReviewPopILogEvent
    public void logEvent(String str, Bundle bundle) {
        ReviewPopILogEvent.DefaultImpls.logEvent(this, str, bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.ReviewPopView_BaseDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Window window2;
        Window window3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setGravity(17);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            super.show(manager, tag);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
