package com.glority.base.utils;

import android.app.Activity;
import android.util.Log;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.base.logs.LogEvents;
import com.glority.utils.ui.ToastUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppReviewManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ&\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/base/utils/AppReviewManager;", "", "<init>", "()V", "modeTs", "", "getModeTs", "()J", "setModeTs", "(J)V", "launch", "", "activity", "Landroid/app/Activity;", "from", "", "key", "complete", "Lkotlin/Function1;", "", "logStartEvent", "logEndEvent", "createdTs", "status", "isShowing", "()Z", "setShowing", "(Z)V", "TAG", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AppReviewManager {
    private static final String TAG = "AppReviewManager";
    private static boolean isShowing;
    public static final AppReviewManager INSTANCE = new AppReviewManager();
    private static long modeTs = System.currentTimeMillis();
    public static final int $stable = 8;

    private AppReviewManager() {
    }

    public final long getModeTs() {
        return modeTs;
    }

    public final void setModeTs(long j) {
        modeTs = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void launch$default(AppReviewManager appReviewManager, Activity activity, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1<Boolean, Unit>() { // from class: com.glority.base.utils.AppReviewManager$launch$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }
            };
        }
        appReviewManager.launch(activity, str, str2, function1);
    }

    public final void launch(final Activity activity, final String from, final String key, final Function1<? super Boolean, Unit> complete) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(complete, "complete");
        if (isShowing) {
            return;
        }
        isShowing = true;
        final ReviewManager create = ReviewManagerFactory.create(activity);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        Task<ReviewInfo> requestReviewFlow = create.requestReviewFlow();
        Intrinsics.checkNotNullExpressionValue(requestReviewFlow, "requestReviewFlow(...)");
        requestReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: com.glority.base.utils.AppReviewManager$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AppReviewManager.launch$lambda$1(ReviewManager.this, activity, from, key, complete, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launch$lambda$1(ReviewManager manager, Activity activity, final String from, final String key, final Function1 complete, Task it) {
        Intrinsics.checkNotNullParameter(manager, "$manager");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(from, "$from");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(complete, "$complete");
        Intrinsics.checkNotNullParameter(it, "it");
        final boolean isSuccessful = it.isSuccessful();
        Exception exception = it.getException();
        Log.d(TAG, "REQUEST review flow complete. isSuccessful: " + isSuccessful + ", errorMsg: " + (exception != null ? exception.getMessage() : null));
        if (isSuccessful) {
            Task<Void> launchReviewFlow = manager.launchReviewFlow(activity, (ReviewInfo) it.getResult());
            Intrinsics.checkNotNullExpressionValue(launchReviewFlow, "launchReviewFlow(...)");
            final long currentTimeMillis = System.currentTimeMillis();
            INSTANCE.logStartEvent(from, key);
            launchReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: com.glority.base.utils.AppReviewManager$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AppReviewManager.launch$lambda$1$lambda$0(currentTimeMillis, from, key, complete, isSuccessful, task);
                }
            });
            return;
        }
        complete.invoke(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launch$lambda$1$lambda$0(long j, String from, String key, Function1 complete, boolean z, Task it) {
        Intrinsics.checkNotNullParameter(from, "$from");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(complete, "$complete");
        Intrinsics.checkNotNullParameter(it, "it");
        boolean isSuccessful = it.isSuccessful();
        Exception exception = it.getException();
        Log.d(TAG, "LAUNCH review flow complete. isSuccessful: " + isSuccessful + ", errorMsg: " + (exception != null ? exception.getMessage() : null));
        INSTANCE.logEndEvent(j, from, key, isSuccessful ? "completed" : "cancelled");
        complete.invoke(Boolean.valueOf(isSuccessful));
        if (!z || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), BuildConfig.ENV)) {
            return;
        }
        ToastUtils.showShort("Shown Google Play in-app Review component. [" + from + "]", new Object[0]);
    }

    public final void logStartEvent(String from, String key) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(key, "key");
        new LogEventRequest(LogEvents.POPUP_START, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("key", key), TuplesKt.to("type", "goodreview"), TuplesKt.to("from", from), TuplesKt.to("mode", String.valueOf(modeTs)))).post();
    }

    public final void logEndEvent(long createdTs, String from, String key, String status) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(status, "status");
        new LogEventRequest(LogEvents.POPUP_END, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("key", key), TuplesKt.to("type", "goodreview"), TuplesKt.to("from", from), TuplesKt.to("status", status), TuplesKt.to("time", Double.valueOf((System.currentTimeMillis() - createdTs) / 1000)), TuplesKt.to("mode", String.valueOf(modeTs)))).post();
    }

    public final boolean isShowing() {
        return isShowing;
    }

    public final void setShowing(boolean z) {
        isShowing = z;
    }
}
