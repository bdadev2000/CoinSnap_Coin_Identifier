package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbrf;

/* loaded from: classes2.dex */
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
        if (queryLocalInterface instanceof zzbr) {
            return (zzbr) queryLocalInterface;
        }
        return new zzbr(iBinder);
    }

    @Nullable
    public final zzbq zza(Context context, String str, zzbrf zzbrfVar) {
        zzbq zzboVar;
        try {
            IBinder zze = ((zzbr) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), str, zzbrfVar, 241806000);
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
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            e = e9;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
