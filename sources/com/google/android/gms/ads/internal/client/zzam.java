package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzam extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzs zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbpg zzd;
    final /* synthetic */ zzba zze;

    public zzam(zzba zzbaVar, Context context, zzs zzsVar, String str, zzbpg zzbpgVar) {
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        this.zzd = zzbpgVar;
        this.zze = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "banner");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzd(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 243799000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zze.zza;
        return zzkVar.zza(this.zza, this.zzb, this.zzc, this.zzd, 1);
    }
}
