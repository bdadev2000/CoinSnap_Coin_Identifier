package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbhd {
    private final Context zza;

    public zzbhd(Context context) {
        this.zza = context;
    }

    public final void zza(zzbwq zzbwqVar) {
        try {
            ((zzbhe) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbhc
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof zzbhe) {
                        return (zzbhe) queryLocalInterface;
                    }
                    return new zzbhe(obj);
                }
            })).zze(zzbwqVar);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e4.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzp e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e9.getMessage())));
        }
    }
}
