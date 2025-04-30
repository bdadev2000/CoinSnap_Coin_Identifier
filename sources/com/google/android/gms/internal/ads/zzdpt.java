package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzdpt extends zzbob implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbhh {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdlo zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdpt(zzdlo zzdloVar, zzdlt zzdltVar) {
        this.zza = zzdltVar.zzf();
        this.zzb = zzdltVar.zzj();
        this.zzc = zzdloVar;
        if (zzdltVar.zzs() != null) {
            zzdltVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdlo zzdloVar = this.zzc;
        if (zzdloVar != null && (view = this.zza) != null) {
            zzdloVar.zzB(view, Collections.emptyMap(), Collections.emptyMap(), zzdlo.zzX(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbof zzbofVar, int i9) {
        try {
            zzbofVar.zze(i9);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    @Nullable
    public final zzbhs zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdlo zzdloVar = this.zzc;
        if (zzdloVar == null || zzdloVar.zzc() == null) {
            return null;
        }
        return zzdloVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdlo zzdloVar = this.zzc;
        if (zzdloVar != null) {
            zzdloVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdps(this));
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzf(IObjectWrapper iObjectWrapper, zzbof zzbofVar) throws RemoteException {
        String str;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbofVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad should not be used again.");
                zzi(zzbofVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzu.zzx();
            zzccv.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzu.zzx();
            zzccv.zzb(this.zza, this);
            zzg();
            try {
                zzbofVar.zzf();
                return;
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream internal error: ".concat(str));
        zzi(zzbofVar, 0);
    }
}
