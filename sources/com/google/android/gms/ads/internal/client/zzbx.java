package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbae;

/* loaded from: classes2.dex */
public abstract class zzbx extends zzbae implements zzby {
    public static zzby zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if (queryLocalInterface instanceof zzby) {
            return (zzby) queryLocalInterface;
        }
        return new zzbw(iBinder);
    }
}
