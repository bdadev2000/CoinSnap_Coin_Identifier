package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzehd implements zzegq {
    private final Context zza;
    private final zzcqf zzb;

    public zzehd(Context context, zzcqf zzcqfVar) {
        this.zza = context;
        this.zzb = zzcqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj, zzeki {
        zzeip zzeipVar = new zzeip(zzfghVar, (zzbrk) zzegnVar.zzb, AdFormat.APP_OPEN_AD);
        zzcqc zza = this.zzb.zza(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdhc(zzeipVar, null), new zzcqd(zzfghVar.zzaa));
        zzeipVar.zzb(zza.zzc());
        ((zzeig) zzegnVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        try {
            ((zzbrk) zzegnVar.zzb).zzq(zzfghVar.zzZ);
            ((zzbrk) zzegnVar.zzb).zzi(zzfghVar.zzU, zzfghVar.zzv.toString(), zzfgtVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehc(zzegnVar, null), (zzbpr) zzegnVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfhj(e);
        }
    }
}
