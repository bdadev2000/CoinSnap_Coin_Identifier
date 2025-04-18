package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzbza {

    @GuardedBy
    @VisibleForTesting
    static zzbza zza;

    public static synchronized zzbza zzd(Context context) {
        synchronized (zzbza.class) {
            try {
                zzbza zzbzaVar = zza;
                if (zzbzaVar != null) {
                    return zzbzaVar;
                }
                Context applicationContext = context.getApplicationContext();
                zzbcv.zza(applicationContext);
                com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
                zzi.zzs(applicationContext);
                zzbys zzbysVar = new zzbys(null);
                zzbysVar.zzb(applicationContext);
                zzbysVar.zzc(com.google.android.gms.ads.internal.zzu.zzB());
                zzbysVar.zza(zzi);
                zzbysVar.zzd(com.google.android.gms.ads.internal.zzu.zzn());
                zzbza zze = zzbysVar.zze();
                zza = zze;
                zze.zza().zza();
                zzbze zzc = zza.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzay)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    Map zzv = com.google.android.gms.ads.internal.util.zzt.zzv((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaz));
                    Iterator it = zzv.keySet().iterator();
                    while (it.hasNext()) {
                        zzc.zzc((String) it.next());
                    }
                    zzc.zzd(new zzbzc(zzc, zzv));
                }
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract zzbyl zza();

    public abstract zzbyp zzb();

    public abstract zzbze zzc();
}
