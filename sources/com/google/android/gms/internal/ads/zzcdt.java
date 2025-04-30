package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzcdt {
    private final Context zza;
    private final zzcee zzb;
    private final ViewGroup zzc;
    private zzcds zzd;

    public zzcdt(Context context, ViewGroup viewGroup, zzchd zzchdVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzchdVar;
        this.zzd = null;
    }

    public final zzcds zza() {
        return this.zzd;
    }

    @Nullable
    public final Integer zzb() {
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            return zzcdsVar.zzl();
        }
        return null;
    }

    public final void zzc(int i9, int i10, int i11, int i12) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzF(i9, i10, i11, i12);
        }
    }

    public final void zzd(int i9, int i10, int i11, int i12, int i13, boolean z8, zzced zzcedVar) {
        if (this.zzd != null) {
            return;
        }
        zzbew.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcee zzceeVar = this.zzb;
        zzcds zzcdsVar = new zzcds(context, zzceeVar, i13, z8, zzceeVar.zzm().zza(), zzcedVar);
        this.zzd = zzcdsVar;
        this.zzc.addView(zzcdsVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i9, i10, i11, i12);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzu();
        }
    }

    public final void zzg(int i9) {
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzC(i9);
        }
    }
}
