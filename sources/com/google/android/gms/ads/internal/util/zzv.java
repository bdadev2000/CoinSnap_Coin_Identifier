package com.google.android.gms.ads.internal.util;

import a4.h0;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.core.app.f1;
import com.bytedance.sdk.openadsdk.oem.a;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbcn;

@TargetApi(26)
/* loaded from: classes3.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    @Nullable
    public final Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzbbs.zzq zzg(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (zzs.zzA(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return zzbbs.zzq.ENUM_TRUE;
            }
            return zzbbs.zzq.ENUM_FALSE;
        }
        return zzbbs.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzh(Context context, String str, String str2) {
        h0.m();
        NotificationChannel b3 = a.b(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzig)).intValue());
        b3.setShowBadge(false);
        f1.r((NotificationManager) context.getSystemService(NotificationManager.class), b3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        if (importance != 0) {
            return false;
        }
        return true;
    }
}
