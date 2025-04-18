package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzar extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpg zzc;
    final /* synthetic */ zzba zzd;

    public zzar(zzba zzbaVar, Context context, String str, zzbpg zzbpgVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpgVar;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "native_ad");
        return new zzfi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 243799000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzi zziVar;
        zzbul zzbulVar;
        Object zzbsVar;
        zzbcn.zza(this.zza);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkp)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzaq
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof zzbv) {
                            return (zzbv) queryLocalInterface;
                        }
                        return new zzbv(iBinder);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 243799000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof zzbu) {
                    zzbsVar = (zzbu) queryLocalInterface;
                } else {
                    zzbsVar = new zzbs(zze);
                }
                return zzbsVar;
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                this.zzd.zzg = zzbuj.zza(this.zza);
                zzbulVar = this.zzd.zzg;
                zzbulVar.zzh(e2, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zzba zzbaVar = this.zzd;
        Context context = this.zza;
        String str = this.zzb;
        zzbpg zzbpgVar = this.zzc;
        zziVar = zzbaVar.zzb;
        return zziVar.zza(context, str, zzbpgVar);
    }
}
