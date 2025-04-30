package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbzm {
    @Nullable
    public static final zzbza zza(Context context, String str, zzbrf zzbrfVar) {
        zzbza zzbyyVar;
        try {
            IBinder zze = ((zzbze) com.google.android.gms.ads.internal.util.client.zzq.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbzl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof zzbze) {
                        return (zzbze) queryLocalInterface;
                    }
                    return new zzbze(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbrfVar, 241806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzbza) {
                zzbyyVar = (zzbza) queryLocalInterface;
            } else {
                zzbyyVar = new zzbyy(zze);
            }
            return zzbyyVar;
        } catch (RemoteException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e9) {
            e = e9;
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
