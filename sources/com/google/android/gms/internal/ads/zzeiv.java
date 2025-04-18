package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzeiv implements zzegq {
    private final Context zza;
    private final zzdic zzb;

    public zzeiv(Context context, zzdic zzdicVar) {
        this.zza = context;
        this.zzb = zzdicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj, zzeki {
        zzeip zzeipVar = new zzeip(zzfghVar, (zzbrk) zzegnVar.zzb, AdFormat.INTERSTITIAL);
        zzdgz zze = this.zzb.zze(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdhc(zzeipVar, null));
        zzeipVar.zzb(zze.zzc());
        ((zzeig) zzegnVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        try {
            ((zzbrk) zzegnVar.zzb).zzq(zzfghVar.zzZ);
            ((zzbrk) zzegnVar.zzb).zzl(zzfghVar.zzU, zzfghVar.zzv.toString(), zzfgtVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiu(this, zzegnVar, null), (zzbpr) zzegnVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfhj(e);
        }
    }
}
