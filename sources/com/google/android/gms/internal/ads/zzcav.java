package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzcav {
    static zzcav zza;

    public static synchronized zzcav zzd(Context context) {
        synchronized (zzcav.class) {
            try {
                zzcav zzcavVar = zza;
                if (zzcavVar != null) {
                    return zzcavVar;
                }
                Context applicationContext = context.getApplicationContext();
                zzbep.zza(applicationContext);
                com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
                zzi.zzs(applicationContext);
                zzcan zzcanVar = new zzcan(null);
                zzcanVar.zzb(applicationContext);
                zzcanVar.zzc(com.google.android.gms.ads.internal.zzu.zzB());
                zzcanVar.zza(zzi);
                zzcanVar.zzd(com.google.android.gms.ads.internal.zzu.zzn());
                zzcav zze = zzcanVar.zze();
                zza = zze;
                zze.zza().zza();
                zzcaz zzc = zza.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzar)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    Map zzv = com.google.android.gms.ads.internal.util.zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzat));
                    Iterator it = zzv.keySet().iterator();
                    while (it.hasNext()) {
                        zzc.zzc((String) it.next());
                    }
                    zzc.zzd(new zzcax(zzc, zzv));
                }
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract zzcag zza();

    public abstract zzcak zzb();

    public abstract zzcaz zzc();
}
