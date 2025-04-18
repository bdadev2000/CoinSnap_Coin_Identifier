package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes3.dex */
public final class zzfqw extends com.google.android.gms.ads.internal.zzc {
    private final int zze;

    public zzfqw(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, int i10) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
        this.zze = i10;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof zzfrb) {
            return (zzfrb) queryLocalInterface;
        }
        return new zzfrb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfrb zzp() throws DeadObjectException {
        return (zzfrb) super.getService();
    }
}
