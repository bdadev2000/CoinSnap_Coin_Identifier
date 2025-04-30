package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzelw implements zzehr {
    private final Context zza;
    private final zzdrm zzb;

    public zzelw(Context context, zzdrm zzdrmVar) {
        this.zza = context;
        this.zzb = zzdrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        zzejq zzejqVar = new zzejq(zzfgtVar, (zzbte) zzehoVar.zzb, AdFormat.REWARDED);
        zzdri zze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdrj(zzejqVar));
        zzejqVar.zzb(zze.zzc());
        ((zzejh) zzehoVar.zzc).zzc(zze.zzo());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            if (zzfhfVar.zza.zza.zzo.zza == 3) {
                ((zzbte) zzehoVar.zzb).zzo(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzelv(this, zzehoVar, null), (zzbrl) zzehoVar.zzc);
            } else {
                ((zzbte) zzehoVar.zzb).zzp(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzelv(this, zzehoVar, null), (zzbrl) zzehoVar.zzc);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e4);
        }
    }
}
