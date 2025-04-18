package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* loaded from: classes3.dex */
final class zzav extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzba zzb;

    public zzav(zzba zzbaVar, Context context) {
        this.zza = context;
        this.zzb = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "mobile_ads_settings");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzh(ObjectWrapper.wrap(this.zza), 243799000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzfe zzfeVar;
        zzbul zzbulVar;
        Object zzcxVar;
        zzbcn.zza(this.zza);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkp)).booleanValue()) {
            try {
                IBinder zze = ((zzda) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzau
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof zzda) {
                            return (zzda) queryLocalInterface;
                        }
                        return new zzda(iBinder);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), 243799000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                if (queryLocalInterface instanceof zzcz) {
                    zzcxVar = (zzcz) queryLocalInterface;
                } else {
                    zzcxVar = new zzcx(zze);
                }
                return zzcxVar;
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                this.zzb.zzg = zzbuj.zza(this.zza);
                zzbulVar = this.zzb.zzg;
                zzbulVar.zzh(e2, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzba zzbaVar = this.zzb;
        Context context = this.zza;
        zzfeVar = zzbaVar.zzc;
        return zzfeVar.zza(context);
    }
}
