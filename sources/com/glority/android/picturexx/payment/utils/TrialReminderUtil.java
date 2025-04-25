package com.glority.android.picturexx.payment.utils;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.glority.android.picturexx.payment.PurchaseConstants;
import com.glority.android.picturexx.payment.workmanager.TrialReminderWorker;
import com.glority.utils.UtilsApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrialReminderUtil.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/payment/utils/TrialReminderUtil;", "", "<init>", "()V", "remindUserToAttentionTrialIfNeeded", "", "daysToRemind", "", "scheduleLocalTrialNotification", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class TrialReminderUtil {
    public static final TrialReminderUtil INSTANCE = new TrialReminderUtil();

    private TrialReminderUtil() {
    }

    public static /* synthetic */ void remindUserToAttentionTrialIfNeeded$default(TrialReminderUtil trialReminderUtil, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 5;
        }
        trialReminderUtil.remindUserToAttentionTrialIfNeeded(i);
    }

    public final void remindUserToAttentionTrialIfNeeded(int daysToRemind) {
        scheduleLocalTrialNotification(daysToRemind);
    }

    private final void scheduleLocalTrialNotification(int daysToRemind) {
        OneTimeWorkRequest build = new OneTimeWorkRequest.Builder(TrialReminderWorker.class).setInitialDelay(daysToRemind, TimeUnit.DAYS).addTag(PurchaseConstants.TRIAL_REMINDER).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        WorkManager.getInstance(UtilsApp.getApp()).enqueue(build);
    }
}
