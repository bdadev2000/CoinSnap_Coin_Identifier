package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class zzeq extends RemoteCreator {
    public zzeq() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzcp) {
            return (zzcp) queryLocalInterface;
        }
        return new zzcp(iBinder);
    }

    @Nullable
    public final zzco zza(Context context) {
        zzco zzcmVar;
        try {
            IBinder zze = ((zzcp) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), 241806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzco) {
                zzcmVar = (zzco) queryLocalInterface;
            } else {
                zzcmVar = new zzcm(zze);
            }
            return zzcmVar;
        } catch (RemoteException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            e = e9;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
