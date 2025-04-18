package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbpg;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfm extends zzcy {
    private zzblw zza;

    public final /* synthetic */ void zzb() {
        zzblw zzblwVar = this.zza;
        if (zzblwVar != null) {
            try {
                zzblwVar.zzb(Collections.emptyList());
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onComplete event.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(@Nullable String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final void run() {
                zzfm.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpg zzbpgVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblw zzblwVar) throws RemoteException {
        this.zza = zzblwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        return false;
    }
}
