package com.cooldev.gba.emulator.gameboy.features.in_app_review;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class InAppReviewManager {

    @NotNull
    private final ReviewManager reviewManager;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = "InAppReviewManager";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public InAppReviewManager(@NotNull Context context) {
        a.s(context, "context");
        ReviewManager create = ReviewManagerFactory.create(context);
        a.r(create, "create(...)");
        this.reviewManager = create;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void startInAppReview$lambda$1(InAppReviewManager inAppReviewManager, Activity activity, Task task) {
        a.s(inAppReviewManager, "this$0");
        a.s(activity, "$activity");
        a.s(task, "task");
        if (task.isSuccessful()) {
            Log.d(LOG_TAG, "Review flow request successful");
            Task<Void> launchReviewFlow = inAppReviewManager.reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult());
            a.r(launchReviewFlow, "launchReviewFlow(...)");
            launchReviewFlow.addOnCompleteListener(new Object());
            return;
        }
        Exception exception = task.getException();
        String message = exception != null ? exception.getMessage() : null;
        String str = LOG_TAG;
        Log.e(str, "Review flow request failed: " + message);
        if (a.g(message, "-1")) {
            Log.e(str, "Error: Play Store not found");
        } else {
            Log.e(str, "Unknown error occurred");
        }
    }

    public static final void startInAppReview$lambda$1$lambda$0(Task task) {
        a.s(task, "it");
        Log.d(LOG_TAG, "Review flow completed");
    }

    public final void startInAppReview(@NotNull Activity activity) {
        a.s(activity, "activity");
        Task<ReviewInfo> requestReviewFlow = this.reviewManager.requestReviewFlow();
        a.r(requestReviewFlow, "requestReviewFlow(...)");
        requestReviewFlow.addOnCompleteListener(new com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.a(2, activity, this));
    }
}
