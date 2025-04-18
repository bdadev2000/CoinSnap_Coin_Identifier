package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbxo {
    @Nullable
    public static final zzbxc zza(Context context, String str, zzbpg zzbpgVar) {
        zzbxc zzbxaVar;
        try {
            IBinder zze = ((zzbxg) com.google.android.gms.ads.internal.util.client.zzq.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbxn
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof zzbxg) {
                        return (zzbxg) queryLocalInterface;
                    }
                    return new zzbxg(iBinder);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbpgVar, 243799000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzbxc) {
                zzbxaVar = (zzbxc) queryLocalInterface;
            } else {
                zzbxaVar = new zzbxa(zze);
            }
            return zzbxaVar;
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
