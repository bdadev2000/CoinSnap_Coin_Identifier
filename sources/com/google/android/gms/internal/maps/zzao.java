package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public abstract class zzao extends zzb implements zzap {
    public static zzap zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof zzap ? (zzap) queryLocalInterface : new zzan(iBinder);
    }
}
