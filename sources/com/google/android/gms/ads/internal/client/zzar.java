package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbur;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzar extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpl zzc;
    final /* synthetic */ zzba zzd;

    public zzar(zzba zzbaVar, Context context, String str, zzbpl zzbplVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbplVar;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "native_ad");
        return new zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 243220000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzi zziVar;
        zzbur zzburVar;
        zzbcv.zza(this.zza);
        if (!((Boolean) zzbe.zzc().zza(zzbcv.zzkn)).booleanValue()) {
            zzba zzbaVar = this.zzd;
            Context context = this.zza;
            String str = this.zzb;
            zzbpl zzbplVar = this.zzc;
            zziVar = zzbaVar.zzb;
            return zziVar.zza(context, str, zzbplVar);
        }
        try {
            IBinder zze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzaq
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 243220000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
        } catch (RemoteException e) {
            e = e;
            this.zzd.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzd.zzg;
            zzburVar.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e2) {
            e = e2;
            this.zzd.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzd.zzg;
            zzburVar.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.zzd.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzd.zzg;
            zzburVar.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
