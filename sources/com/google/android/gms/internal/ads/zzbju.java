package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class zzbju extends RemoteCreator {
    public zzbju() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbic) {
            return (zzbic) queryLocalInterface;
        }
        return new zzbia(iBinder);
    }

    @Nullable
    public final zzbhz zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbhz zzbhxVar;
        try {
            IBinder zze = ((zzbic) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 241806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbhz) {
                zzbhxVar = (zzbhz) queryLocalInterface;
            } else {
                zzbhxVar = new zzbhx(zze);
            }
            return zzbhxVar;
        } catch (RemoteException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e9) {
            e = e9;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
