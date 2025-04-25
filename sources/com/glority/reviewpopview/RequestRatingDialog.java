package com.glority.reviewpopview;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.glority.reviewpopview.base.GoogleReviewDialogUtils;
import com.glority.reviewpopview.base.RatingDialogListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestRatingDialog.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u000b"}, d2 = {"Lcom/glority/reviewpopview/RequestRatingDialog;", "", "()V", "showAppReviewDialog", "", "activity", "Landroidx/fragment/app/FragmentActivity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/reviewpopview/base/RatingDialogListener;", "showGoogleReviewDialog", "Landroid/app/Activity;", "mod_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class RequestRatingDialog {
    public static final RequestRatingDialog INSTANCE = new RequestRatingDialog();

    private RequestRatingDialog() {
    }

    public static /* synthetic */ void showGoogleReviewDialog$default(RequestRatingDialog requestRatingDialog, Activity activity, RatingDialogListener ratingDialogListener, int i, Object obj) {
        if ((i & 2) != 0) {
            ratingDialogListener = null;
        }
        requestRatingDialog.showGoogleReviewDialog(activity, ratingDialogListener);
    }

    public final void showGoogleReviewDialog(Activity activity, RatingDialogListener listener) {
        GoogleReviewDialogUtils.INSTANCE.showGoogleReviewDialog(activity, listener);
    }

    public static /* synthetic */ void showAppReviewDialog$default(RequestRatingDialog requestRatingDialog, FragmentActivity fragmentActivity, RatingDialogListener ratingDialogListener, int i, Object obj) {
        if ((i & 2) != 0) {
            ratingDialogListener = null;
        }
        requestRatingDialog.showAppReviewDialog(fragmentActivity, ratingDialogListener);
    }

    public final void showAppReviewDialog(FragmentActivity activity, RatingDialogListener listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RequestRatingDialogFragment requestRatingDialogFragment = new RequestRatingDialogFragment(listener);
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        requestRatingDialogFragment.show(supportFragmentManager, "RequestRatingDialogFragment");
    }
}
