package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbur;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzat extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpl zzb;
    final /* synthetic */ zzba zzc;

    public zzat(zzba zzbaVar, Context context, zzbpl zzbplVar) {
        this.zza = context;
        this.zzb = zzbplVar;
        this.zzc = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        zzci zzg = zzcpVar.zzg(ObjectWrapper.wrap(this.zza), this.zzb, 243220000);
        zzg.zzh(this.zzb);
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzl zzlVar;
        zzbur zzburVar;
        zzci zzcgVar;
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbcv.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcv.zzkn)).booleanValue()) {
            zzba zzbaVar = this.zzc;
            Context context2 = this.zza;
            zzbpl zzbplVar = this.zzb;
            zzlVar = zzbaVar.zzh;
            return zzlVar.zza(context2, zzbplVar);
        }
        try {
            IBinder zze = ((zzcj) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzas
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    return queryLocalInterface instanceof zzcj ? (zzcj) queryLocalInterface : new zzcj(iBinder);
                }
            })).zze(wrap, this.zzb, 243220000);
            if (zze == null) {
                zzcgVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzcg(zze);
            }
            zzcgVar.zzh(this.zzb);
            return zzcgVar;
        } catch (RemoteException e) {
            e = e;
            this.zzc.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzc.zzg;
            zzburVar.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e2) {
            e = e2;
            this.zzc.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzc.zzg;
            zzburVar.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.zzc.zzg = zzbup.zza(this.zza);
            zzburVar = this.zzc.zzg;
            zzburVar.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }
}
