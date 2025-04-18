package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbxo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzab extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpg zzc;

    public zzab(zzba zzbaVar, Context context, String str, zzbpg zzbpgVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "rewarded");
        return new zzfq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzp(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 243799000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzbxo.zza(this.zza, this.zzb, this.zzc);
    }
}
