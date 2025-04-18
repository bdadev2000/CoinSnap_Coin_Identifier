package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;

/* loaded from: classes3.dex */
public final class zzbaw extends com.google.android.gms.ads.internal.zzc {
    public zzbaw(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzbwh.zza(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof zzbaz) {
            return (zzbaz) queryLocalInterface;
        }
        return new zzbaz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.ads.zzg.zzb;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue() && ArrayUtils.contains(availableFeatures, com.google.android.gms.ads.zzg.zza)) {
            return true;
        }
        return false;
    }

    public final zzbaz zzq() throws DeadObjectException {
        return (zzbaz) super.getService();
    }
}
