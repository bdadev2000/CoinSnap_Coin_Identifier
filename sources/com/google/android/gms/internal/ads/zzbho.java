package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class zzbho extends zzayd implements zzbhp {
    public static zzbhp zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface instanceof zzbhp) {
            return (zzbhp) queryLocalInterface;
        }
        return new zzbhn(iBinder);
    }
}
