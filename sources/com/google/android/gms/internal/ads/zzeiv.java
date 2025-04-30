package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class zzeiv extends zzbsr {
    final /* synthetic */ zzeiw zza;
    private final zzeho zzb;

    public /* synthetic */ zzeiv(zzeiw zzeiwVar, zzeho zzehoVar, zzeiu zzeiuVar) {
        this.zza = zzeiwVar;
        this.zzb = zzehoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zze(String str) throws RemoteException {
        ((zzejh) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzejh) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzeiw.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzejh) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zzh(zzbro zzbroVar) throws RemoteException {
        zzeiw.zzd(this.zza, zzbroVar);
        ((zzejh) this.zzb.zzc).zzo();
    }
}
