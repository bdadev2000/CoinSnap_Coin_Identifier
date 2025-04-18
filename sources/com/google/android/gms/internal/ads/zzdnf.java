package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzdnf extends zzbgm {

    @Nullable
    private final String zza;
    private final zzdit zzb;
    private final zzdiy zzc;

    public zzdnf(@Nullable String str, zzdit zzditVar, zzdiy zzdiyVar) {
        this.zza = str;
        this.zzb = zzditVar;
        this.zzc = zzdiyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final double zzb() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final Bundle zzc() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.ads.internal.client.zzeb zzd() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbfr zze() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbfy zzf() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzg() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzh() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzm() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzn() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final List zzo() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzp() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzq(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zzZ(bundle);
    }
}
