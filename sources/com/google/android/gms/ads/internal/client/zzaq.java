package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaq extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    public zzaq(zzaw zzawVar, Context context) {
        this.zza = context;
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzg(ObjectWrapper.wrap(this.zza), 241806000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzeq zzeqVar;
        zzbwl zzbwlVar;
        Object zzcmVar;
        zzbep.zza(this.zza);
        if (((Boolean) zzba.zzc().zza(zzbep.zzkI)).booleanValue()) {
            try {
                IBinder zze = ((zzcp) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzap
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof zzcp) {
                            return (zzcp) queryLocalInterface;
                        }
                        return new zzcp(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), 241806000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                if (queryLocalInterface instanceof zzco) {
                    zzcmVar = (zzco) queryLocalInterface;
                } else {
                    zzcmVar = new zzcm(zze);
                }
                return zzcmVar;
            } catch (RemoteException e4) {
                e = e4;
                this.zzb.zzh = zzbwj.zza(this.zza);
                zzbwlVar = this.zzb.zzh;
                zzbwlVar.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzp e9) {
                e = e9;
                this.zzb.zzh = zzbwj.zza(this.zza);
                zzbwlVar = this.zzb.zzh;
                zzbwlVar.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                this.zzb.zzh = zzbwj.zza(this.zza);
                zzbwlVar = this.zzb.zzh;
                zzbwlVar.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzaw zzawVar = this.zzb;
        Context context = this.zza;
        zzeqVar = zzawVar.zzc;
        return zzeqVar.zza(context);
    }
}
