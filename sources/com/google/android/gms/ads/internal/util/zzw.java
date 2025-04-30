package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzbep;

@TargetApi(26)
/* loaded from: classes2.dex */
public class zzw extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzab
    @Nullable
    public final Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final zzbdv.zzq zzg(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (zzt.zzA(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return zzbdv.zzq.ENUM_TRUE;
            }
            return zzbdv.zzq.ENUM_FALSE;
        }
        return zzbdv.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzh(Context context, String str, String str2) {
        com.bykv.vk.openvk.component.video.zp.jU.a.B();
        NotificationChannel b = com.bykv.vk.openvk.component.video.zp.jU.a.b(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziC)).intValue());
        b.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(b);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
