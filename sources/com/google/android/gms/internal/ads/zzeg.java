package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class zzeg {

    @Nullable
    private CharSequence zza;

    @Nullable
    private Bitmap zzb;

    @Nullable
    private Layout.Alignment zzc;

    @Nullable
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzeg() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzeg zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzeg zzd(float f9) {
        this.zzm = f9;
        return this;
    }

    public final zzeg zze(float f9, int i9) {
        this.zze = f9;
        this.zzf = i9;
        return this;
    }

    public final zzeg zzf(int i9) {
        this.zzg = i9;
        return this;
    }

    public final zzeg zzg(@Nullable Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzeg zzh(float f9) {
        this.zzh = f9;
        return this;
    }

    public final zzeg zzi(int i9) {
        this.zzi = i9;
        return this;
    }

    public final zzeg zzj(float f9) {
        this.zzo = f9;
        return this;
    }

    public final zzeg zzk(float f9) {
        this.zzl = f9;
        return this;
    }

    public final zzeg zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzeg zzm(@Nullable Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzeg zzn(float f9, int i9) {
        this.zzk = f9;
        this.zzj = i9;
        return this;
    }

    public final zzeg zzo(int i9) {
        this.zzn = i9;
        return this;
    }

    public final zzei zzp() {
        return new zzei(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, ViewCompat.MEASURED_STATE_MASK, this.zzn, this.zzo, null);
    }

    @Nullable
    public final CharSequence zzq() {
        return this.zza;
    }

    public /* synthetic */ zzeg(zzei zzeiVar, zzef zzefVar) {
        this.zza = zzeiVar.zzc;
        this.zzb = zzeiVar.zzf;
        this.zzc = zzeiVar.zzd;
        this.zzd = zzeiVar.zze;
        this.zze = zzeiVar.zzg;
        this.zzf = zzeiVar.zzh;
        this.zzg = zzeiVar.zzi;
        this.zzh = zzeiVar.zzj;
        this.zzi = zzeiVar.zzk;
        this.zzj = zzeiVar.zzn;
        this.zzk = zzeiVar.zzo;
        this.zzl = zzeiVar.zzl;
        this.zzm = zzeiVar.zzm;
        this.zzn = zzeiVar.zzp;
        this.zzo = zzeiVar.zzq;
    }
}
