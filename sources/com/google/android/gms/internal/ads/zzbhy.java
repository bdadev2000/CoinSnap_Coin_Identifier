package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzbhy extends RemoteCreator {
    public zzbhy() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbgl) {
            return (zzbgl) queryLocalInterface;
        }
        return new zzbgj(iBinder);
    }

    @Nullable
    public final zzbgi zza(View view, HashMap hashMap, HashMap hashMap2) {
        zzbgi zzbggVar;
        try {
            IBinder zze = ((zzbgl) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbgi) {
                zzbggVar = (zzbgi) queryLocalInterface;
            } else {
                zzbggVar = new zzbgg(zze);
            }
            return zzbggVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote NativeAdViewHolderDelegate.", e2);
            return null;
        }
    }
}
