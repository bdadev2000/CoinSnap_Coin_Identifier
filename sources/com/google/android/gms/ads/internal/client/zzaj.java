package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaj extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpg zzb;

    public zzaj(zzba zzbaVar, Context context, zzbpg zzbpgVar) {
        this.zza = context;
        this.zzb = zzbpgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzm(ObjectWrapper.wrap(this.zza), this.zzb, 243799000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbtc) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzai
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    return zzbtb.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 243799000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
            return null;
        }
    }
}
