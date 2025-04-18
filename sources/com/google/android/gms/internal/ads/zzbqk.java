package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbqk extends zzbpl {
    private final Adapter zza;
    private final zzbwu zzb;

    public zzbqk(Adapter adapter, zzbwu zzbwuVar) {
        this.zza = adapter;
        this.zzb = zzbwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zze() throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzf() throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzg(int i10) throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zzg(ObjectWrapper.wrap(this.zza), i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzi(int i10, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzj(int i10) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzo() throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzp() throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzr(zzbgs zzbgsVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzs(zzbwv zzbwvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzt(zzbwz zzbwzVar) throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zzm(ObjectWrapper.wrap(this.zza), new zzbwv(zzbwzVar.zzf(), zzbwzVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzu() throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy() throws RemoteException {
        zzbwu zzbwuVar = this.zzb;
        if (zzbwuVar != null) {
            zzbwuVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
