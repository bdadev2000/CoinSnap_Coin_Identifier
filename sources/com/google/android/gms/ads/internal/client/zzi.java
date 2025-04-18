package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbpg;

/* loaded from: classes3.dex */
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzbv) {
            return (zzbv) queryLocalInterface;
        }
        return new zzbv(iBinder);
    }

    @Nullable
    public final zzbu zza(Context context, String str, zzbpg zzbpgVar) {
        zzbu zzbsVar;
        try {
            IBinder zze = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), str, zzbpgVar, 243799000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(zze);
            }
            return zzbsVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }
}
