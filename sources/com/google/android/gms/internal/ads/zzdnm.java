package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzdnm extends zzbhu {

    @Nullable
    private final String zza;
    private final zzdit zzb;
    private final zzdiy zzc;
    private final zzdsm zzd;

    public zzdnm(@Nullable String str, zzdit zzditVar, zzdiy zzdiyVar, zzdsm zzdsmVar) {
        this.zza = str;
        this.zzb = zzditVar;
        this.zzc = zzdiyVar;
        this.zzd = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzB(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmF)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzC(Bundle bundle) throws RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        this.zzb.zzP(zzddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        try {
            if (!zzdrVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzb.zzQ(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzG(zzbhs zzbhsVar) throws RemoteException {
        this.zzb.zzR(zzbhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzI() throws RemoteException {
        if (!this.zzc.zzH().isEmpty() && this.zzc.zzk() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgD)).booleanValue()) {
            return null;
        }
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfr zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfv zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfy zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final List zzv() throws RemoteException {
        if (zzI()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzw() throws RemoteException {
        this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzy(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) throws RemoteException {
        this.zzb.zzC(zzdhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }
}
