package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbrf;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzey extends zzcn {
    private zzbnu zza;

    public final /* synthetic */ void zzb() {
        zzbnu zzbnuVar = this.zza;
        if (zzbnuVar != null) {
            try {
                zzbnuVar.zzb(Collections.emptyList());
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onComplete event.", e4);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(@Nullable String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z8) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzex
            @Override // java.lang.Runnable
            public final void run() {
                zzey.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbrf zzbrfVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z8) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f9) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbnu zzbnuVar) throws RemoteException {
        this.zza = zzbnuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        return false;
    }
}
