package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzayd;

/* loaded from: classes3.dex */
public abstract class zzcb extends zzayd implements zzcc {
    public static zzcc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if (queryLocalInterface instanceof zzcc) {
            return (zzcc) queryLocalInterface;
        }
        return new zzca(iBinder);
    }
}
