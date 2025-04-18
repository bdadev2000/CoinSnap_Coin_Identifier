package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class zzd {
    public static void zza(Context context) {
        int i2 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzben.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                ListenableFuture zzb = new zzc(context).zzb();
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Updating ad debug logging enablement.");
                zzcaq.zza(zzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
