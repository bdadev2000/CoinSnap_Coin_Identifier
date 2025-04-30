package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzekl implements zzehr {
    private final Context zza;
    private final zzdkd zzb;
    private zzbru zzc;
    private final VersionInfoParcel zzd;

    public zzekl(Context context, zzdkd zzdkdVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdkdVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        if (zzfhfVar.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdlt zzt = zzdlt.zzt(this.zzc);
            zzfho zzfhoVar = zzfhfVar.zza.zza;
            if (zzfhoVar.zzg.contains(Integer.toString(zzt.zzc()))) {
                zzdlv zze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdmf(zzt), new zzdnw(null, null, this.zzc));
                ((zzejh) zzehoVar.zzc).zzc(zze.zzj());
                return zze.zza();
            }
            throw new zzelj(1, "No corresponding native ad listener");
        }
        throw new zzelj(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbI)).intValue()) {
                ((zzbte) zzehoVar.zzb).zzm(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekk(this, zzehoVar, null), (zzbrl) zzehoVar.zzc);
            } else {
                ((zzbte) zzehoVar.zzb).zzn(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekk(this, zzehoVar, null), (zzbrl) zzehoVar.zzc, zzfhfVar.zza.zza.zzi);
            }
        } catch (RemoteException e4) {
            throw new zzfhv(e4);
        }
    }
}
