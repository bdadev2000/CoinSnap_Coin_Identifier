package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbsj extends zzbrk {
    private final Adapter zza;
    private final zzbys zzb;

    public zzbsj(Adapter adapter, zzbys zzbysVar) {
        this.zza = adapter;
        this.zzb = zzbysVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zze() throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzf() throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzg(int i9) throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zzg(ObjectWrapper.wrap(this.zza), i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzi(int i9, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzj(int i9) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzo() throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzp() throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzr(zzbip zzbipVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzs(zzbyt zzbytVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzt(zzbyx zzbyxVar) throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zzm(ObjectWrapper.wrap(this.zza), new zzbyt(zzbyxVar.zzf(), zzbyxVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzu() throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzy() throws RemoteException {
        zzbys zzbysVar = this.zzb;
        if (zzbysVar != null) {
            zzbysVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
