package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes3.dex */
public final class zzftb {

    @VisibleForTesting
    final zzfte zza;

    @VisibleForTesting
    final boolean zzb;

    private zzftb(zzfte zzfteVar) {
        this.zza = zzfteVar;
        this.zzb = zzfteVar != null;
    }

    public static zzftb zzb(Context context, String str, String str2) {
        zzfte zzftcVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzftcVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzftcVar = queryLocalInterface instanceof zzfte ? (zzfte) queryLocalInterface : new zzftc(instantiate);
                    }
                    zzftcVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzftb(zzftcVar);
                } catch (Exception e) {
                    throw new zzfsd(e);
                }
            } catch (RemoteException | zzfsd | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzftb(new zzftf());
            }
        } catch (Exception e2) {
            throw new zzfsd(e2);
        }
    }

    public static zzftb zzc() {
        zzftf zzftfVar = new zzftf();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzftb(zzftfVar);
    }

    public final zzfta zza(byte[] bArr) {
        return new zzfta(this, bArr, null);
    }
}
