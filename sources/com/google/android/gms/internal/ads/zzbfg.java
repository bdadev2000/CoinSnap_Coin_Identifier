package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzbfg {
    private final Context zza;

    public zzbfg(Context context) {
        this.zza = context;
    }

    public final void zza(zzbuq zzbuqVar) {
        try {
            ((zzbfh) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbff
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof zzbfh) {
                        return (zzbfh) queryLocalInterface;
                    }
                    return new zzbfh(iBinder);
                }
            })).zze(zzbuqVar);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzp e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
        }
    }
}
