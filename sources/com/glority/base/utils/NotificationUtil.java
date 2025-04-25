package com.glority.base.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.glority.utils.UtilsApp;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationUtil.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\u0006\u0010\u0017\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/glority/base/utils/NotificationUtil;", "", "<init>", "()V", "atomicInteger", "Ljava/util/concurrent/atomic/AtomicInteger;", "uniqueNotificationId", "", "getUniqueNotificationId", "()I", "createNotificationChannel", "", "context", "Landroid/content/Context;", "channelId", "", "channelName", "importance", "toSetting", "", "checkNotificationChannelEnable", "notificationChannel", "Landroid/app/NotificationChannel;", "areNotificationsEnable", "isNotificationEnabled", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class NotificationUtil {
    public static final NotificationUtil INSTANCE = new NotificationUtil();
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    public static final int $stable = 8;

    private NotificationUtil() {
    }

    public final int getUniqueNotificationId() {
        return atomicInteger.incrementAndGet();
    }

    public final void createNotificationChannel(Context context, String channelId, String channelName, int importance, boolean toSetting) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, importance);
        Object systemService = UtilsApp.getApp().getApplicationContext().getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        if (toSetting) {
            checkNotificationChannelEnable(context, notificationChannel);
        }
    }

    private final void checkNotificationChannelEnable(Context context, NotificationChannel notificationChannel) {
        if (notificationChannel.getImportance() == 0) {
            SystemUtil.INSTANCE.openChannelNotificationSetting(context, notificationChannel.getId());
        }
    }

    public final boolean areNotificationsEnable() {
        return NotificationManagerCompat.from(UtilsApp.getApp()).areNotificationsEnabled();
    }

    public final boolean isNotificationEnabled(Context context) {
        try {
            Intrinsics.checkNotNull(context);
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
