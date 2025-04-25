package com.glority.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.app.NotificationManagerCompat;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.base.R;
import com.glority.utils.UtilsApp;
import com.glority.utils.app.IntentUtils;
import com.glority.utils.ui.ToastUtils;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemUtil.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0015\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001d\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0007J\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0018H\u0002¨\u0006\""}, d2 = {"Lcom/glority/base/utils/SystemUtil;", "", "<init>", "()V", "startMarket", "", "activity", "Landroid/app/Activity;", "openApplicationDetailsSetting", "isNotificationEnabled", "", "getSystemLanguage", "", "getSystemLanguageList", "", "Ljava/util/Locale;", "()[Ljava/util/Locale;", "getSystemVersion", "getSystemModel", "getDeviceBrand", "context", "Landroid/content/Context;", "openSystemSetting", "requestCode", "", "(Landroid/app/Activity;Ljava/lang/Integer;)V", "openChannelNotificationSetting", "channelId", "showAvailableLocales", "isTablet", "dpiFromPx", "", LogEventArguments.ARG_SIZE, "densityDpi", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class SystemUtil {
    public static final int $stable = 0;
    public static final SystemUtil INSTANCE = new SystemUtil();

    private final float dpiFromPx(float size, int densityDpi) {
        return size / (densityDpi / 160);
    }

    private SystemUtil() {
    }

    public final void startMarket(Activity activity) {
        if (activity == null) {
            return;
        }
        Intent launchMarketIntent = IntentUtils.getLaunchMarketIntent(AppContext.INSTANCE.getConfig("APPLICATION_ID"));
        if (launchMarketIntent != null) {
            activity.startActivity(launchMarketIntent);
        } else {
            ToastUtils.showShort(R.string.text_failed);
        }
    }

    public final void openApplicationDetailsSetting(Activity activity) {
        if (activity == null) {
            return;
        }
        Intent launchSettingIntent = IntentUtils.getLaunchSettingIntent(AppContext.INSTANCE.getConfig("APPLICATION_ID"), true);
        if (launchSettingIntent != null) {
            activity.startActivity(launchSettingIntent);
        } else {
            ToastUtils.showShort(R.string.text_failed);
        }
    }

    public final boolean isNotificationEnabled() {
        return NotificationManagerCompat.from(UtilsApp.getApp()).areNotificationsEnabled();
    }

    public final String getSystemLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public final Locale[] getSystemLanguageList() {
        return Locale.getAvailableLocales();
    }

    public final String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    public final String getSystemModel() {
        return Build.MODEL;
    }

    public final String getDeviceBrand() {
        return Build.BRAND;
    }

    public final boolean isNotificationEnabled(Context context) {
        Intrinsics.checkNotNull(context);
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public final void openSystemSetting(Activity activity, Integer requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent("android.settings.SETTINGS");
        if (requestCode != null) {
            activity.startActivityForResult(intent, requestCode.intValue());
        } else {
            activity.startActivity(intent);
        }
    }

    public final void openChannelNotificationSetting(Context context, String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", channelId);
        context.startActivity(intent);
    }

    public final void showAvailableLocales() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = ArrayIteratorKt.iterator(Locale.getAvailableLocales());
        int i = 0;
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            stringBuffer.append(i + ": " + locale + " -> \t" + locale.getDisplayLanguage(locale) + " -> \t" + locale.getDisplayName(new Locale("en", "")) + " -> \t" + locale.getDisplayName(new Locale("zh", "")) + "\n");
            i++;
        }
        System.out.println((Object) ("sb=" + ((Object) stringBuffer)));
    }

    public final boolean isTablet(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            return dpiFromPx((float) Math.min(bounds.width(), bounds.height()), context.getResources().getConfiguration().densityDpi) >= 600.0f;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return dpiFromPx((float) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels), context.getResources().getConfiguration().densityDpi) >= 600.0f;
    }
}
