package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbpl;

/* loaded from: classes2.dex */
public final class zzl extends RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof zzcj ? (zzcj) queryLocalInterface : new zzcj(iBinder);
    }

    public final zzci zza(Context context, zzbpl zzbplVar) {
        zzci zzcgVar;
        try {
            IBinder zze = ((zzcj) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzbplVar, 243220000);
            if (zze == null) {
                zzcgVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzcg(zze);
            }
            zzcgVar.zzh(zzbplVar);
            return zzcgVar;
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
