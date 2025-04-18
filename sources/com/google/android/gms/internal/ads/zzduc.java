package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzduc implements zzdtm {
    private final long zza;
    private final zzdtr zzb;
    private final zzfek zzc;

    public zzduc(long j3, Context context, zzdtr zzdtrVar, zzchk zzchkVar, String str) {
        this.zza = j3;
        this.zzb = zzdtrVar;
        zzfem zzw = zzchkVar.zzw();
        zzw.zzb(context);
        zzw.zza(str);
        this.zzc = zzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzf(zzmVar, new zzdua(this));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdub(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        }
    }
}
