package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfg extends zzbq {
    final /* synthetic */ zzfi zza;

    @Override // com.google.android.gms.ads.internal.client.zzbr
    @Nullable
    public final String zze() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    @Nullable
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) throws RemoteException {
        zzh(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzmVar, int i10) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzff(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        return false;
    }
}
