package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzcby {
    private final Context zza;
    private final zzccj zzb;
    private final ViewGroup zzc;
    private zzcbx zzd;

    public zzcby(Context context, ViewGroup viewGroup, zzcfo zzcfoVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcfoVar;
        this.zzd = null;
    }

    public final zzcbx zza() {
        return this.zzd;
    }

    @Nullable
    public final Integer zzb() {
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            return zzcbxVar.zzl();
        }
        return null;
    }

    public final void zzc(int i2, int i3, int i4, int i5) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzF(i2, i3, i4, i5);
        }
    }

    public final void zzd(int i2, int i3, int i4, int i5, int i6, boolean z2, zzcci zzcciVar) {
        if (this.zzd != null) {
            return;
        }
        zzbdc.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzccj zzccjVar = this.zzb;
        zzcbx zzcbxVar = new zzcbx(context, zzccjVar, i6, z2, zzccjVar.zzm().zza(), zzcciVar);
        this.zzd = zzcbxVar;
        this.zzc.addView(zzcbxVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i2, i3, i4, i5);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzu();
        }
    }

    public final void zzg(int i2) {
        zzcbx zzcbxVar = this.zzd;
        if (zzcbxVar != null) {
            zzcbxVar.zzC(i2);
        }
    }
}
