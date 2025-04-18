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

/* loaded from: classes3.dex */
public final class zzdnd extends zzbmd implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfk {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private zzdit zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdnd(zzdit zzditVar, zzdiy zzdiyVar) {
        this.zza = zzdiyVar.zzf();
        this.zzb = zzdiyVar.zzj();
        this.zzc = zzditVar;
        if (zzdiyVar.zzs() != null) {
            zzdiyVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdit zzditVar = this.zzc;
        if (zzditVar != null && (view = this.zza) != null) {
            zzditVar.zzB(view, Collections.emptyMap(), Collections.emptyMap(), zzdit.zzY(this.zza));
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

    private static final void zzi(zzbmh zzbmhVar, int i10) {
        try {
            zzbmhVar.zze(i10);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
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

    @Override // com.google.android.gms.internal.ads.zzbme
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    @Nullable
    public final zzbfv zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdit zzditVar = this.zzc;
        if (zzditVar == null || zzditVar.zzc() == null) {
            return null;
        }
        return zzditVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdit zzditVar = this.zzc;
        if (zzditVar != null) {
            zzditVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdnc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzf(IObjectWrapper iObjectWrapper, zzbmh zzbmhVar) throws RemoteException {
        String str;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbmhVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad should not be used again.");
                zzi(zzbmhVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzv.zzy();
            zzcaw.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzv.zzy();
            zzcaw.zzb(this.zza, this);
            zzg();
            try {
                zzbmhVar.zzf();
                return;
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream internal error: ".concat(str));
        zzi(zzbmhVar, 0);
    }
}
