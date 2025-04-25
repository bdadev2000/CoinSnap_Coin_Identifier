package com.google.android.gms.tflite.dynamite.acceleration;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;
import com.google.android.gms.tflite.dynamite.internal.zzk;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class AccelerationServiceLoggerFactory {
    private AccelerationServiceLoggerFactory() {
    }

    public static AccelerationServiceLogger create(Context context, CustomerInfo customerInfo) {
        zzd zzdVar;
        try {
            IBinder zzb = zzk.zza(context, zzk.zza).zzb("com.google.android.gms.tflite.dynamite.AccelerationLoggerCreator");
            if (zzb == null) {
                zzdVar = null;
            } else {
                IInterface queryLocalInterface = zzb.queryLocalInterface("com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLoggerCreator");
                zzdVar = queryLocalInterface instanceof zzd ? (zzd) queryLocalInterface : new zzd(zzb);
            }
            return new zza(zzdVar.zzd(ObjectWrapper.wrap(context), customerInfo));
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.w("TfLiteGMS", "Failed to initialize logger.", e);
            return new zze();
        }
    }

    public static AccelerationServiceLogger createNoop() {
        return new zze();
    }
}
