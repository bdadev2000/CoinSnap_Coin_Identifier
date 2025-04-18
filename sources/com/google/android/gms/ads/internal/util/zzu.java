package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbcn;

@TargetApi(24)
/* loaded from: classes3.dex */
public class zzu extends zzt {
    public static final boolean zze(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzd(Activity activity, Configuration configuration) {
        int i10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeQ)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeS)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenHeightDp);
        int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzv.zzq();
        DisplayMetrics zzt = zzs.zzt(windowManager);
        int i11 = zzt.heightPixels;
        int i12 = zzt.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i10 = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i10 = 0;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeO)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        if (zze(i11, zzy + i10, intValue) && zze(i12, zzy2, intValue)) {
            return false;
        }
        return true;
    }
}
