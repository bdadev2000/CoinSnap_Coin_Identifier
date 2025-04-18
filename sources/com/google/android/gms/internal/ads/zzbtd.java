package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class zzbtd extends RemoteCreator {
    public zzbtd() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbtj) {
            return (zzbtj) queryLocalInterface;
        }
        return new zzbth(iBinder);
    }

    @Nullable
    public final zzbtg zza(Activity activity) {
        zzbtg zzbteVar;
        try {
            IBinder zze = ((zzbtj) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbtg) {
                zzbteVar = (zzbtg) queryLocalInterface;
            } else {
                zzbteVar = new zzbte(zze);
            }
            return zzbteVar;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote AdOverlay.", e10);
            return null;
        }
    }
}
