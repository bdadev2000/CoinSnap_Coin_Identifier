package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
final class zzegk extends zzbqs {
    final /* synthetic */ zzegm zza;
    private final zzefe zzb;

    public /* synthetic */ zzegk(zzegm zzegmVar, zzefe zzefeVar, zzegl zzeglVar) {
        this.zza = zzegmVar;
        this.zzb = zzefeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zze(String str) throws RemoteException {
        ((zzegx) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegx) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzegm.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzegx) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzh(zzbpp zzbppVar) throws RemoteException {
        zzegm.zzd(this.zza, zzbppVar);
        ((zzegx) this.zzb.zzc).zzo();
    }
}
