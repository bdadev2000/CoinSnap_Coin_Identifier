package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzbzo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzah extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpl zzb;

    public zzah(zzba zzbaVar, Context context, zzbpl zzbplVar) {
        this.zza = context;
        this.zzb = zzbplVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzq(ObjectWrapper.wrap(this.zza), this.zzb, 243220000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbzo) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzag
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    return zzbzn.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 243220000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
            return null;
        }
    }
}
