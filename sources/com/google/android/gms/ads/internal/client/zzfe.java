package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class zzfe extends RemoteCreator {
    public zzfe() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzda) {
            return (zzda) queryLocalInterface;
        }
        return new zzda(iBinder);
    }

    @Nullable
    public final zzcz zza(Context context) {
        zzcz zzcxVar;
        try {
            IBinder zze = ((zzda) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), 243799000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzcz) {
                zzcxVar = (zzcz) queryLocalInterface;
            } else {
                zzcxVar = new zzcx(zze);
            }
            return zzcxVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
