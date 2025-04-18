package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes3.dex */
public final class zzfrr {
    final zzfru zza;
    final boolean zzb;

    private zzfrr(zzfru zzfruVar) {
        this.zza = zzfruVar;
        this.zzb = zzfruVar != null;
    }

    public static zzfrr zzb(Context context, String str, String str2) {
        zzfru zzfrsVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfrsVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzfru) {
                            zzfrsVar = (zzfru) queryLocalInterface;
                        } else {
                            zzfrsVar = new zzfrs(instantiate);
                        }
                    }
                    zzfrsVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfrr(zzfrsVar);
                } catch (Exception e2) {
                    throw new zzfqt(e2);
                }
            } catch (Exception e10) {
                throw new zzfqt(e10);
            }
        } catch (RemoteException | zzfqt | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfrr(new zzfrv());
        }
    }

    public static zzfrr zzc() {
        zzfrv zzfrvVar = new zzfrv();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfrr(zzfrvVar);
    }

    public final zzfrp zza(byte[] bArr) {
        return new zzfrp(this, bArr, null);
    }
}
