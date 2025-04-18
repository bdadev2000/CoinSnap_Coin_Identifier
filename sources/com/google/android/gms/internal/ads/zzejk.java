package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzejk implements zzegq {
    private final Context zza;
    private final zzdiy zzb;
    private zzbqa zzc;
    private final VersionInfoParcel zzd;

    public zzejk(Context context, zzdiy zzdiyVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdiyVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj, zzeki {
        if (!zzfgtVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzeki(2, "Unified must be used for RTB.");
        }
        zzdkp zzt = zzdkp.zzt(this.zzc);
        zzfhc zzfhcVar = zzfgtVar.zza.zza;
        if (!zzfhcVar.zzg.contains(Integer.toString(zzt.zzc()))) {
            throw new zzeki(1, "No corresponding native ad listener");
        }
        zzdkr zze = this.zzb.zze(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdlb(zzt), new zzdms(null, null, this.zzc));
        ((zzeig) zzegnVar.zzc).zzc(zze.zzj());
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        try {
            ((zzbrk) zzegnVar.zzb).zzq(zzfghVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbK)).intValue()) {
                ((zzbrk) zzegnVar.zzb).zzm(zzfghVar.zzU, zzfghVar.zzv.toString(), zzfgtVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejj(this, zzegnVar, null), (zzbpr) zzegnVar.zzc);
            } else {
                ((zzbrk) zzegnVar.zzb).zzn(zzfghVar.zzU, zzfghVar.zzv.toString(), zzfgtVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejj(this, zzegnVar, null), (zzbpr) zzegnVar.zzc, zzfgtVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfhj(e);
        }
    }
}
