package com.glority.android.picturexx.payment.workmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.payment.PurchaseConstants;
import com.glority.android.picturexx.payment.R;
import com.glority.base.utils.NotificationUtil;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TrialReminderWorker.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/payment/workmanager/TrialReminderWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "atomicInteger", "Ljava/util/concurrent/atomic/AtomicInteger;", "doWork", "Landroidx/work/ListenableWorker$Result;", "pushNotification", "", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class TrialReminderWorker extends Worker {
    private final AtomicInteger atomicInteger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrialReminderWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.atomicInteger = new AtomicInteger(0);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        new LogEventRequest("trialendsreminder_notificationstart_click", null, 2, null).post();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        pushNotification(applicationContext);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    private final void pushNotification(Context context) {
        try {
            NotificationUtil.INSTANCE.createNotificationChannel(context, PurchaseConstants.TRIAL_REMINDER, "Trial Reminder", 4, true);
            String string = context.getString(R.string.TEXT_REMINDER_PUSH_TITLE);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(R.string.TEXT_REMINDER_PUSH_CONTENT);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = context.getString(R.string.app_name);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String replace$default = StringsKt.replace$default(string2, BuildConfig.appName, string3, false, 4, (Object) null);
            Intent intent = new Intent();
            intent.setClassName(context, "com.glority.android.picturexx.splash.SplashActivity");
            NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(context, PurchaseConstants.TRIAL_REMINDER).setSmallIcon(R.mipmap.launcher).setContentTitle(string).setContentText(replace$default).setPriority(0).setAutoCancel(true).setCategory(NotificationCompat.CATEGORY_REMINDER).setVisibility(0).setContentIntent(PendingIntent.getActivity(context, 0, intent, 201326592));
            Intrinsics.checkNotNullExpressionValue(contentIntent, "setContentIntent(...)");
            if (ActivityCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0 && NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                new LogEventRequest("trialendsreminder_notificationhaspermission_click", null, 2, null).post();
                NotificationManagerCompat.from(context).notify(NotificationUtil.INSTANCE.getUniqueNotificationId(), contentIntent.build());
            } else {
                new LogEventRequest("trialendsreminder_notificationnopermission_click", null, 2, null).post();
            }
        } catch (Throwable unused) {
            new LogEventRequest("trialendsreminder_notificationerror_click", null, 2, null).post();
        }
    }
}
