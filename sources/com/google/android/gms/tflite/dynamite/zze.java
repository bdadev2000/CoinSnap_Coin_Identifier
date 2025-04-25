package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public abstract class zze extends com.google.android.gms.internal.tflite.zzb implements zzf {
    public static zzf zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.ITfLiteLoggerCreator");
        return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zzd(iBinder);
    }
}
