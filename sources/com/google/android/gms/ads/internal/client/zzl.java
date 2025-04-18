package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbpg;

/* loaded from: classes3.dex */
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
        if (queryLocalInterface instanceof zzcj) {
            return (zzcj) queryLocalInterface;
        }
        return new zzcj(iBinder);
    }

    public final zzci zza(Context context, zzbpg zzbpgVar) {
        zzci zzcgVar;
        try {
            IBinder zze = ((zzcj) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzbpgVar, 243799000);
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
            zzcgVar.zzh(zzbpgVar);
            return zzcgVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote AdPreloaderCreator.", e2);
            return null;
        }
    }
}
