package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeir implements zzegq {
    private final Context zza;
    private final zzdic zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzeir(Context context, VersionInfoParcel versionInfoParcel, zzdic zzdicVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdicVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, final zzegn zzegnVar) throws zzfhj, zzeki {
        zzdgz zze = this.zzb.zze(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdhc(new zzdik() { // from class: com.google.android.gms.internal.ads.zzeiq
            @Override // com.google.android.gms.internal.ads.zzdik
            public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
                zzeir.this.zzc(zzegnVar, z2, context, zzcynVar);
            }
        }, null));
        zze.zzd().zzo(new zzcof((zzfia) zzegnVar.zzb), this.zzd);
        ((zzeig) zzegnVar.zzc).zzc(zze.zzk());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        zzfia zzfiaVar = (zzfia) zzegnVar.zzb;
        zzfhc zzfhcVar = zzfgtVar.zza.zza;
        String jSONObject = zzfghVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzfghVar.zzs);
        zzfiaVar.zzo(this.zza, zzfhcVar.zzd, jSONObject, zzm, (zzbpr) zzegnVar.zzc);
    }

    public final /* synthetic */ void zzc(zzegn zzegnVar, boolean z2, Context context, zzcyn zzcynVar) throws zzdij {
        try {
            ((zzfia) zzegnVar.zzb).zzv(z2);
            if (this.zzc.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaM)).intValue()) {
                ((zzfia) zzegnVar.zzb).zzx();
            } else {
                ((zzfia) zzegnVar.zzb).zzy(context);
            }
        } catch (zzfhj e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Cannot show interstitial.");
            throw new zzdij(e.getCause());
        }
    }
}
