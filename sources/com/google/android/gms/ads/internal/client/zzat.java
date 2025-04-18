package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzat extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpg zzb;
    final /* synthetic */ zzba zzc;

    public zzat(zzba zzbaVar, Context context, zzbpg zzbpgVar) {
        this.zza = context;
        this.zzb = zzbpgVar;
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
        zzci zzg = zzcpVar.zzg(ObjectWrapper.wrap(this.zza), this.zzb, 243799000);
        zzg.zzh(this.zzb);
        return zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzl zzlVar;
        zzbul zzbulVar;
        zzci zzcgVar;
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbcn.zza(context);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkp)).booleanValue()) {
            try {
                IBinder zze = ((zzcj) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzas
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                        if (queryLocalInterface instanceof zzcj) {
                            return (zzcj) queryLocalInterface;
                        }
                        return new zzcj(iBinder);
                    }
                })).zze(wrap, this.zzb, 243799000);
                if (zze == null) {
                    zzcgVar = null;
                } else {
                    IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    if (queryLocalInterface instanceof zzci) {
                        zzcgVar = (zzci) queryLocalInterface;
                    } else {
                        zzcgVar = new zzcg(zze);
                    }
                }
                zzcgVar.zzh(this.zzb);
                return zzcgVar;
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                this.zzc.zzg = zzbuj.zza(this.zza);
                zzbulVar = this.zzc.zzg;
                zzbulVar.zzh(e2, "ClientApiBroker.getAdPreloader");
                return null;
            }
        }
        zzba zzbaVar = this.zzc;
        Context context2 = this.zza;
        zzbpg zzbpgVar = this.zzb;
        zzlVar = zzbaVar.zzh;
        return zzlVar.zza(context2, zzbpgVar);
    }
}
