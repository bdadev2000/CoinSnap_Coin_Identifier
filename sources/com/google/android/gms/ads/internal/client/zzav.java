package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbur;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzav extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzba zzb;

    public zzav(zzba zzbaVar, Context context) {
        this.zza = context;
        this.zzb = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "mobile_ads_settings");
        return new zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzh(ObjectWrapper.wrap(this.zza), 243220000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzff zzffVar;
        zzbur zzburVar;
        zzbcv.zza(this.zza);
        if (!((Boolean) zzbe.zzc().zza(zzbcv.zzkn)).booleanValue()) {
            zzba zzbaVar = this.zzb;
            Context context = this.zza;
            zzffVar = zzbaVar.zzc;
            return zzffVar.zza(context);
        }
        try {
            IBinder zze = ((zzda) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzau
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof zzda ? (zzda) queryLocalInterface : new zzda(iBinder);
                }
            })).zze(ObjectWrapper.wrap(this.zza), 243220000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzcz ? (zzcz) queryLocalInterface : new zzcx(zze);
        } catch (RemoteException e) {
            e = e;
            this.zzb.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzb.zzg;
            zzburVar.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e2) {
            e = e2;
            this.zzb.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzb.zzg;
            zzburVar.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.zzb.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzb.zzg;
            zzburVar.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
