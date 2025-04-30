package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeji extends zzbyr implements zzdav {
    private zzbys zza;
    private zzdau zzb;
    private zzdht zzc;

    @Override // com.google.android.gms.internal.ads.zzdav
    public final synchronized void zza(zzdau zzdauVar) {
        this.zzb = zzdauVar;
    }

    public final synchronized void zzc(zzbys zzbysVar) {
        this.zza = zzbysVar;
    }

    public final synchronized void zzd(zzdht zzdhtVar) {
        this.zzc = zzdhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbys zzbysVar = this.zza;
        if (zzbysVar != null) {
            ((zzemn) zzbysVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbys zzbysVar = this.zza;
        if (zzbysVar != null) {
            zzbysVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i9) throws RemoteException {
        zzdau zzdauVar = this.zzb;
        if (zzdauVar != null) {
            zzdauVar.zza(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbys zzbysVar = this.zza;
        if (zzbysVar != null) {
            ((zzemn) zzbysVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdau zzdauVar = this.zzb;
        if (zzdauVar != null) {
            zzdauVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbys zzbysVar = this.zza;
        if (zzbysVar != null) {
            ((zzemn) zzbysVar).zza.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i9) throws RemoteException {
        zzdht zzdhtVar = this.zzc;
        if (zzdhtVar != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzemm) zzdhtVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdht zzdhtVar = this.zzc;
        if (zzdhtVar != null) {
            Executor zzc = zzemo.zzc(((zzemm) zzdhtVar).zzd);
            final zzeho zzehoVar = ((zzemm) zzdhtVar).zzc;
            final zzfgt zzfgtVar = ((zzemm) zzdhtVar).zzb;
            final zzfhf zzfhfVar = ((zzemm) zzdhtVar).zza;
            final zzemm zzemmVar = (zzemm) zzdhtVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeml
                @Override // java.lang.Runnable
                public final void run() {
                    zzemo zzemoVar = zzemm.this.zzd;
                    zzemo.zze(zzfhfVar, zzfgtVar, zzehoVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbyt zzbytVar) throws RemoteException {
        zzbys zzbysVar = this.zza;
        if (zzbysVar != null) {
            ((zzemn) zzbysVar).zzd.zza(zzbytVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbys zzbysVar = this.zza;
        if (zzbysVar != null) {
            ((zzemn) zzbysVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbys zzbysVar = this.zza;
        if (zzbysVar != null) {
            ((zzemn) zzbysVar).zzd.zzc();
        }
    }
}
