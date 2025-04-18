package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbsn implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzbgs zza;

    public zzbsn(zzbgs zzbgsVar) {
        this.zza = zzbgsVar;
        try {
            zzbgsVar.zzm();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            return false;
        }
    }
}
