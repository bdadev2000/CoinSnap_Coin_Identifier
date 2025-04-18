package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* loaded from: classes3.dex */
public final class zzk extends RemoteCreator {
    private zzbul zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbz) {
            return (zzbz) queryLocalInterface;
        }
        return new zzbz(iBinder);
    }

    @Nullable
    public final zzby zza(Context context, zzs zzsVar, String str, zzbpg zzbpgVar, int i10) {
        zzby zzbwVar;
        zzby zzbwVar2;
        zzbcn.zza(context);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkp)).booleanValue()) {
            try {
                IBinder zze = ((zzbz) com.google.android.gms.ads.internal.util.client.zzq.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzj
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzbz) {
                            return (zzbz) queryLocalInterface;
                        }
                        return new zzbz(iBinder);
                    }
                })).zze(ObjectWrapper.wrap(context), zzsVar, str, zzbpgVar, 243799000, i10);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzby) {
                    zzbwVar = (zzby) queryLocalInterface;
                } else {
                    zzbwVar = new zzbw(zze);
                }
                return zzbwVar;
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                zzbul zza = zzbuj.zza(context);
                this.zza = zza;
                zza.zzh(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbz) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzsVar, str, zzbpgVar, 243799000, i10);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzby) {
                zzbwVar2 = (zzby) queryLocalInterface2;
            } else {
                zzbwVar2 = new zzbw(zze2);
            }
            return zzbwVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Could not create remote AdManager.", e10);
            return null;
        }
    }
}
