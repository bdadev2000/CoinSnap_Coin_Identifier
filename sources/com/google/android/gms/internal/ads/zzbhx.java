package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class zzbhx extends RemoteCreator {
    public zzbhx() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbgf) {
            return (zzbgf) queryLocalInterface;
        }
        return new zzbgd(iBinder);
    }

    @Nullable
    public final zzbgc zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbgc zzbgaVar;
        try {
            IBinder zze = ((zzbgf) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 243799000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbgc) {
                zzbgaVar = (zzbgc) queryLocalInterface;
            } else {
                zzbgaVar = new zzbga(zze);
            }
            return zzbgaVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not create remote NativeAdViewDelegate.", e2);
            return null;
        }
    }
}
