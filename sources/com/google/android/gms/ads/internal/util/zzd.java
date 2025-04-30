package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzccl;
import f4.c;

/* loaded from: classes2.dex */
public final class zzd {
    public static void zza(Context context) {
        int i9 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbgg.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    c zzb = new zzc(context).zzb();
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Updating ad debug logging enablement.");
                    zzccl.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to determine debug setting.", e4);
            }
        }
    }
}
