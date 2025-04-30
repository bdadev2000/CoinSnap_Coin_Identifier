package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdpx extends zzbil {

    @Nullable
    private final String zza;
    private final zzdlo zzb;
    private final zzdlt zzc;

    public zzdpx(@Nullable String str, zzdlo zzdloVar, zzdlt zzdltVar) {
        this.zza = str;
        this.zzb = zzdloVar;
        this.zzc = zzdltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final com.google.android.gms.ads.internal.client.zzdq zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final zzbho zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final zzbhv zze() throws RemoteException {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final String zzh() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final List zzm() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final void zzn() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzL(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzY(bundle);
    }
}
