package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzdig extends zzbfu {
    private final zzdiy zza;
    private IObjectWrapper zzb;

    public zzdig(zzdiy zzdiyVar) {
        this.zza = zzdiyVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper != null && (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) != null && drawable.getIntrinsicWidth() != -1 && drawable.getIntrinsicHeight() != -1) {
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zze() throws RemoteException {
        float f10;
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Remote exception getting video controller aspect ratio.", e2);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbfy zzm = this.zza.zzm();
        if (zzm == null) {
            return 0.0f;
        }
        if (zzm.zzd() != -1 && zzm.zzc() != -1) {
            f10 = zzm.zzd() / zzm.zzc();
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return zzb(zzm.zzf());
        }
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzf() throws RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzg() throws RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    @Nullable
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbfy zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzk() throws RemoteException {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzl() throws RemoteException {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzm(zzbhg zzbhgVar) {
        if (this.zza.zzj() instanceof zzcgm) {
            ((zzcgm) this.zza.zzj()).zzv(zzbhgVar);
        }
    }
}
