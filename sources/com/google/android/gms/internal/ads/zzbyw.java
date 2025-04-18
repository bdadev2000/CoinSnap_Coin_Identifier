package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzbyw {
    static zzbyw zza;

    public static synchronized zzbyw zzd(Context context) {
        synchronized (zzbyw.class) {
            zzbyw zzbywVar = zza;
            if (zzbywVar != null) {
                return zzbywVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbcn.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
            zzi.zzp(applicationContext);
            zzbyo zzbyoVar = new zzbyo(null);
            zzbyoVar.zzb(applicationContext);
            zzbyoVar.zzc(com.google.android.gms.ads.internal.zzv.zzC());
            zzbyoVar.zza(zzi);
            zzbyoVar.zzd(com.google.android.gms.ads.internal.zzv.zzo());
            zzbyw zze = zzbyoVar.zze();
            zza = zze;
            zze.zza().zza();
            zzbza zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaB)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                Map zzv = com.google.android.gms.ads.internal.util.zzs.zzv((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaC));
                Iterator it = zzv.keySet().iterator();
                while (it.hasNext()) {
                    zzc.zzc((String) it.next());
                }
                zzc.zzd(new zzbyy(zzc, zzv));
            }
            return zza;
        }
    }

    public abstract zzbyi zza();

    public abstract zzbym zzb();

    public abstract zzbza zzc();
}
