package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbpl;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfn extends zzcy {
    private zzbmb zza;

    public final /* synthetic */ void zzb() {
        zzbmb zzbmbVar = this.zza;
        if (zzbmbVar != null) {
            try {
                zzbmbVar.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onComplete event.", e);
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
    public final void zzj(boolean z2) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfm
            @Override // java.lang.Runnable
            public final void run() {
                zzfn.this.zzb();
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
    public final void zzo(zzbpl zzbplVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z2) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f2) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzbmb zzbmbVar) throws RemoteException {
        this.zza = zzbmbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfw zzfwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        return false;
    }
}
