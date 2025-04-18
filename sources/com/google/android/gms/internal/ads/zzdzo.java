package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class zzdzo {
    private final zzges zza;
    private final zzges zzb;
    private final zzeaj zzc;
    private final zzhfr zzd;

    public zzdzo(zzges zzgesVar, zzges zzgesVar2, zzeaj zzeajVar, zzhfr zzhfrVar) {
        this.zza = zzgesVar;
        this.zzb = zzgesVar2;
        this.zzc = zzeajVar;
        this.zzd = zzhfrVar;
    }

    public final /* synthetic */ ua.b zza(zzbvb zzbvbVar) throws Exception {
        return this.zzc.zza(zzbvbVar, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlk)).longValue());
    }

    public final /* synthetic */ ua.b zzb(zzbvb zzbvbVar, int i10, zzdyw zzdywVar) throws Exception {
        return ((zzebq) this.zzd.zzb()).zzb(zzbvbVar, i10);
    }

    public final ua.b zzc(final zzbvb zzbvbVar) {
        ua.b zzf;
        String str = zzbvbVar.zzf;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzC(str)) {
            zzf = zzgei.zzg(new zzdyw(1, "Ads service proxy force local"));
        } else {
            zzf = zzgei.zzf(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzdzl
                @Override // com.google.android.gms.internal.ads.zzgdo
                public final ua.b zza() {
                    return zzdzo.this.zza(zzbvbVar);
                }
            }, this.zza), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzm
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgei.zzg(th2);
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgei.zzf(zzf, zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdzo.this.zzb(zzbvbVar, callingUid, (zzdyw) obj);
            }
        }, this.zzb);
    }
}
