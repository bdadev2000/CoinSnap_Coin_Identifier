package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class zzbvd extends RemoteCreator {
    public zzbvd() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbvj) {
            return (zzbvj) queryLocalInterface;
        }
        return new zzbvh(iBinder);
    }

    @Nullable
    public final zzbvg zza(Activity activity) {
        zzbvg zzbveVar;
        try {
            IBinder zze = ((zzbvj) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbvg) {
                zzbveVar = (zzbvg) queryLocalInterface;
            } else {
                zzbveVar = new zzbve(zze);
            }
            return zzbveVar;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote AdOverlay.", e4);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote AdOverlay.", e9);
            return null;
        }
    }
}
