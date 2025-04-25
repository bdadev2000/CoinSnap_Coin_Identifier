package com.glority.reviewpopview.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: ReviewPopLogEvents.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/reviewpopview/base/ReviewPopLogEvents;", "", "()V", "GOOGLE_REVIEW_PROCEDURE_FAILURE", "", "GOOGLE_REVIEW_PROCEDURE_SUCCESS", "RequestRatingDialog", "RequestRatingDialog_Click_Close", "RequestRatingDialog_Close", "RequestRatingDialog_NotNow", "RequestRatingDialog_Rate", "START_GOOGLE_REVIEW_PROCEDURE", "mod_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ReviewPopLogEvents {
    public static final String GOOGLE_REVIEW_PROCEDURE_FAILURE = "newratingdialog_failed_click";
    public static final String GOOGLE_REVIEW_PROCEDURE_SUCCESS = "newratingdialog_success_click";
    public static final ReviewPopLogEvents INSTANCE = new ReviewPopLogEvents();
    public static final String RequestRatingDialog = "newratingdialog_show";
    public static final String RequestRatingDialog_Click_Close = "newratingdialog_click_close";
    public static final String RequestRatingDialog_Close = "newratingdialog_close";
    public static final String RequestRatingDialog_NotNow = "newratingdialog_notnow_click";
    public static final String RequestRatingDialog_Rate = "newratingdialog_writereview_click";
    public static final String START_GOOGLE_REVIEW_PROCEDURE = "newratingdialog_startopen_click";

    private ReviewPopLogEvents() {
    }
}
