package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdlc extends zzbhr {
    private final zzdlt zza;
    private IObjectWrapper zzb;

    public zzdlc(zzdlt zzdltVar) {
        this.zza = zzdltVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper != null && (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) != null && drawable.getIntrinsicWidth() != -1 && drawable.getIntrinsicHeight() != -1) {
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final float zze() throws RemoteException {
        float f9;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgv)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Remote exception getting video controller aspect ratio.", e4);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbhv zzm = this.zza.zzm();
        if (zzm == null) {
            return 0.0f;
        }
        if (zzm.zzd() != -1 && zzm.zzc() != -1) {
            f9 = zzm.zzd() / zzm.zzc();
        } else {
            f9 = 0.0f;
        }
        if (f9 == 0.0f) {
            return zzb(zzm.zzf());
        }
        return f9;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final float zzf() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgw)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final float zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgw)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgw)).booleanValue()) {
            return null;
        }
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    @Nullable
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbhv zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final boolean zzk() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgw)).booleanValue()) {
            return false;
        }
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final boolean zzl() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgw)).booleanValue() || this.zza.zzj() == null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final void zzm(zzbjd zzbjdVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgw)).booleanValue() && (this.zza.zzj() instanceof zzcif)) {
            ((zzcif) this.zza.zzj()).zzv(zzbjdVar);
        }
    }
}
