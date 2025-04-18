package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzegy extends zzbwt implements zzcxw {
    private zzbwu zza;
    private zzcxv zzb;
    private zzdew zzc;

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zza(zzcxv zzcxvVar) {
        this.zzb = zzcxvVar;
    }

    public final synchronized void zzc(zzbwu zzbwuVar) {
        this.zza = zzbwuVar;
    }

    public final synchronized void zzd(zzdew zzdewVar) {
        this.zzc = zzdewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            zzbwuVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxv zzcxvVar = this.zzb;
        if (zzcxvVar != null) {
            zzcxvVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zza.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzdew zzdewVar = this.zzc;
        if (zzdewVar != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzekc) zzdewVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdew zzdewVar = this.zzc;
        if (zzdewVar != null) {
            Executor zzc = zzeke.zzc(((zzekc) zzdewVar).zzd);
            final zzekc zzekcVar = (zzekc) zzdewVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekb
                @Override // java.lang.Runnable
                public final void run() {
                    zzekc zzekcVar2 = zzekc.this;
                    zzeke zzekeVar = zzekcVar2.zzd;
                    zzeke.zze(zzekcVar2.zza, zzekcVar2.zzb, zzekcVar2.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbwv zzbwvVar) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzd.zza(zzbwvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            ((zzekd) zzbwuVar).zzd.zzc();
        }
    }
}
