package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzao extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbrf zzc;
    final /* synthetic */ zzaw zzd;

    public zzao(zzaw zzawVar, Context context, String str, zzbrf zzbrfVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbrfVar;
        this.zzd = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 241806000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzi zziVar;
        zzbwl zzbwlVar;
        Object zzboVar;
        zzbep.zza(this.zza);
        if (((Boolean) zzba.zzc().zza(zzbep.zzkI)).booleanValue()) {
            try {
                IBinder zze = ((zzbr) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzan
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof zzbr) {
                            return (zzbr) queryLocalInterface;
                        }
                        return new zzbr(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 241806000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof zzbq) {
                    zzboVar = (zzbq) queryLocalInterface;
                } else {
                    zzboVar = new zzbo(zze);
                }
                return zzboVar;
            } catch (RemoteException e4) {
                e = e4;
                this.zzd.zzh = zzbwj.zza(this.zza);
                zzbwlVar = this.zzd.zzh;
                zzbwlVar.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzp e9) {
                e = e9;
                this.zzd.zzh = zzbwj.zza(this.zza);
                zzbwlVar = this.zzd.zzh;
                zzbwlVar.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                this.zzd.zzh = zzbwj.zza(this.zza);
                zzbwlVar = this.zzd.zzh;
                zzbwlVar.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zzaw zzawVar = this.zzd;
        Context context = this.zza;
        String str = this.zzb;
        zzbrf zzbrfVar = this.zzc;
        zziVar = zzawVar.zzb;
        return zziVar.zza(context, str, zzbrfVar);
    }
}
