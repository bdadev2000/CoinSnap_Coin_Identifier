package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbep;

@TargetApi(24)
/* loaded from: classes2.dex */
public class zzv extends zzu {
    public static final boolean zze(int i9, int i10, int i11) {
        if (Math.abs(i9 - i10) <= i11) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzd(Activity activity, Configuration configuration) {
        int i9;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeO)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeQ)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenHeightDp);
        int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = zzt.zzt(windowManager);
        int i10 = zzt.heightPixels;
        int i11 = zzt.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i9 = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i9 = 0;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeM)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        if (zze(i10, zzy + i9, intValue) && zze(i11, zzy2, intValue)) {
            return false;
        }
        return true;
    }
}
