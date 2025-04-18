package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzcam;
import ua.b;

/* loaded from: classes3.dex */
public final class zzd {
    public static void zza(Context context) {
        int i10 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbej.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    b zzb = new zzc(context).zzb();
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Updating ad debug logging enablement.");
                    zzcam.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to determine debug setting.", e2);
            }
        }
    }
}
