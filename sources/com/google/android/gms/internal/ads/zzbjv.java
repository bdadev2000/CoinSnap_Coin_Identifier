package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzbjv extends RemoteCreator {
    public zzbjv() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbii) {
            return (zzbii) queryLocalInterface;
        }
        return new zzbig(iBinder);
    }

    @Nullable
    public final zzbif zza(View view, HashMap hashMap, HashMap hashMap2) {
        zzbif zzbidVar;
        try {
            IBinder zze = ((zzbii) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbif) {
                zzbidVar = (zzbif) queryLocalInterface;
            } else {
                zzbidVar = new zzbid(zze);
            }
            return zzbidVar;
        } catch (RemoteException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            e = e9;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
