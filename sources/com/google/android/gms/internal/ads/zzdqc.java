package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdqc extends zzbjr {

    @Nullable
    private final String zza;
    private final zzdlo zzb;
    private final zzdlt zzc;
    private final zzdvc zzd;

    public zzdqc(@Nullable String str, zzdlo zzdloVar, zzdlt zzdltVar, zzdvc zzdvcVar) {
        this.zza = str;
        this.zzb = zzdloVar;
        this.zzc = zzdltVar;
        this.zzd = zzdvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzL(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzC() {
        this.zzb.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        this.zzb.zzO(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        try {
            if (!zzdgVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzb.zzP(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzF(zzbjp zzbjpVar) throws RemoteException {
        this.zzb.zzQ(zzbjpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final boolean zzG() {
        return this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final boolean zzH() throws RemoteException {
        if (!this.zzc.zzH().isEmpty() && this.zzc.zzk() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzY(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgW)).booleanValue()) {
            return null;
        }
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final zzbho zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final zzbhs zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final zzbhv zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final List zzv() throws RemoteException {
        if (zzH()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzw() throws RemoteException {
        this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzy(@Nullable com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        this.zzb.zzC(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }
}
