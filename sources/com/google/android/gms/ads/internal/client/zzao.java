package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzao extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzs zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzba zzd;

    public zzao(zzba zzbaVar, Context context, zzs zzsVar, String str) {
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, AppLovinEventTypes.USER_EXECUTED_SEARCH);
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzf(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 243799000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zzd.zza;
        return zzkVar.zza(this.zza, this.zzb, this.zzc, null, 3);
    }
}
