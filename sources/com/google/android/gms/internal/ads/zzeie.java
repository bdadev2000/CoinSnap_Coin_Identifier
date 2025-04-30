package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzeie implements zzehr {
    private final Context zza;
    private final zzcrt zzb;

    public zzeie(Context context, zzcrt zzcrtVar) {
        this.zza = context;
        this.zzb = zzcrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv, zzelj {
        zzejq zzejqVar = new zzejq(zzfgtVar, (zzbte) zzehoVar.zzb, AdFormat.APP_OPEN_AD);
        zzcrq zza = this.zzb.zza(new zzcvf(zzfhfVar, zzfgtVar, zzehoVar.zza), new zzdik(zzejqVar, null), new zzcrr(zzfgtVar.zzab));
        zzejqVar.zzb(zza.zzc());
        ((zzejh) zzehoVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final void zzb(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws zzfhv {
        try {
            ((zzbte) zzehoVar.zzb).zzq(zzfgtVar.zzaa);
            ((zzbte) zzehoVar.zzb).zzi(zzfgtVar.zzV, zzfgtVar.zzw.toString(), zzfhfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeid(zzehoVar, null), (zzbrl) zzehoVar.zzc);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e4);
            throw new zzfhv(e4);
        }
    }
}
