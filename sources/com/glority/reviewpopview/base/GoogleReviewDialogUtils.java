package com.glority.reviewpopview.base;

import android.app.Activity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.reviewpopview.RequestRatingDialogFragment;
import com.glority.reviewpopview.base.ReviewPopILogEvent;
import com.glority.utils.ui.ToastUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoogleReviewDialogUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/glority/reviewpopview/base/GoogleReviewDialogUtils;", "Lcom/glority/reviewpopview/base/ReviewPopILogEvent;", "()V", "showGoogleReviewDialog", "", "activity", "Landroid/app/Activity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/reviewpopview/base/RatingDialogListener;", "mod_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class GoogleReviewDialogUtils implements ReviewPopILogEvent {
    public static final GoogleReviewDialogUtils INSTANCE = new GoogleReviewDialogUtils();

    private GoogleReviewDialogUtils() {
    }

    @Override // com.glority.reviewpopview.base.ReviewPopILogEvent
    public void logEvent(String str, Bundle bundle) {
        ReviewPopILogEvent.DefaultImpls.logEvent(this, str, bundle);
    }

    public static /* synthetic */ void showGoogleReviewDialog$default(GoogleReviewDialogUtils googleReviewDialogUtils, Activity activity, RatingDialogListener ratingDialogListener, int i, Object obj) {
        if ((i & 2) != 0) {
            ratingDialogListener = null;
        }
        googleReviewDialogUtils.showGoogleReviewDialog(activity, ratingDialogListener);
    }

    public final void showGoogleReviewDialog(final Activity activity, final RatingDialogListener listener) {
        if (activity == null) {
            return;
        }
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage") || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "dev")) {
            ToastUtils.showShort("Google Play Review Popped up", new Object[0]);
        }
        ReviewPopILogEvent.DefaultImpls.logEvent$default(this, ReviewPopLogEvents.START_GOOGLE_REVIEW_PROCEDURE, null, 2, null);
        final ReviewManager create = ReviewManagerFactory.create(activity);
        Intrinsics.checkNotNullExpressionValue(create, "create(activity)");
        Task<ReviewInfo> requestReviewFlow = create.requestReviewFlow();
        Intrinsics.checkNotNullExpressionValue(requestReviewFlow, "manager.requestReviewFlow()");
        requestReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: com.glority.reviewpopview.base.GoogleReviewDialogUtils$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GoogleReviewDialogUtils.showGoogleReviewDialog$lambda$2(RatingDialogListener.this, create, activity, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGoogleReviewDialog$lambda$2(final RatingDialogListener ratingDialogListener, ReviewManager manager, Activity activity, Task task) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(manager, "$manager");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            if (ratingDialogListener != null) {
                ratingDialogListener.onGoogleDialogShow();
            }
            Task<Void> launchReviewFlow = manager.launchReviewFlow(activity, (ReviewInfo) task.getResult());
            Intrinsics.checkNotNullExpressionValue(launchReviewFlow, "manager.launchReviewFlow(activity, reviewInfo)");
            launchReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: com.glority.reviewpopview.base.GoogleReviewDialogUtils$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    GoogleReviewDialogUtils.showGoogleReviewDialog$lambda$2$lambda$0(RatingDialogListener.this, task2);
                }
            });
            return;
        }
        INSTANCE.logEvent(ReviewPopLogEvents.GOOGLE_REVIEW_PROCEDURE_FAILURE, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("error", "review_request_error")));
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        new RequestRatingDialogFragment(ratingDialogListener).show(supportFragmentManager, "RequestRatingDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGoogleReviewDialog$lambda$2$lambda$0(RatingDialogListener ratingDialogListener, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccessful()) {
            ReviewPopILogEvent.DefaultImpls.logEvent$default(INSTANCE, ReviewPopLogEvents.GOOGLE_REVIEW_PROCEDURE_SUCCESS, null, 2, null);
        } else {
            INSTANCE.logEvent(ReviewPopLogEvents.GOOGLE_REVIEW_PROCEDURE_FAILURE, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("error", "review_flow_error")));
        }
        if (ratingDialogListener != null) {
            ratingDialogListener.onDismiss(it.isSuccessful());
        }
    }
}
