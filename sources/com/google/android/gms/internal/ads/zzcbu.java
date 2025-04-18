package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzcbu {
    private final Context zza;
    private final zzccf zzb;
    private final ViewGroup zzc;
    private zzcbt zzd;

    public zzcbu(Context context, ViewGroup viewGroup, zzcfk zzcfkVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcfkVar;
        this.zzd = null;
    }

    public final zzcbt zza() {
        return this.zzd;
    }

    @Nullable
    public final Integer zzb() {
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            return zzcbtVar.zzl();
        }
        return null;
    }

    public final void zzc(int i10, int i11, int i12, int i13) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzF(i10, i11, i12, i13);
        }
    }

    public final void zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcce zzcceVar) {
        if (this.zzd != null) {
            return;
        }
        zzbcu.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzccf zzccfVar = this.zzb;
        zzcbt zzcbtVar = new zzcbt(context, zzccfVar, i14, z10, zzccfVar.zzm().zza(), zzcceVar);
        this.zzd = zzcbtVar;
        this.zzc.addView(zzcbtVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i10, i11, i12, i13);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzu();
        }
    }

    public final void zzg(int i10) {
        zzcbt zzcbtVar = this.zzd;
        if (zzcbtVar != null) {
            zzcbtVar.zzC(i10);
        }
    }
}
