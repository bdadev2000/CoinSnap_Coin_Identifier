package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public final class zzcr {

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

    public zzcr() {
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

    public final zzcr zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzcr zzd(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzcr zze(float f10, int i10) {
        this.zze = f10;
        this.zzf = i10;
        return this;
    }

    public final zzcr zzf(int i10) {
        this.zzg = i10;
        return this;
    }

    public final zzcr zzg(@Nullable Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcr zzh(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzcr zzi(int i10) {
        this.zzi = i10;
        return this;
    }

    public final zzcr zzj(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzcr zzk(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzcr zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzcr zzm(@Nullable Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcr zzn(float f10, int i10) {
        this.zzk = f10;
        this.zzj = i10;
        return this;
    }

    public final zzcr zzo(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzct zzp() {
        return new zzct(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, ViewCompat.MEASURED_STATE_MASK, this.zzn, this.zzo, null);
    }

    @Nullable
    public final CharSequence zzq() {
        return this.zza;
    }

    public /* synthetic */ zzcr(zzct zzctVar, zzcs zzcsVar) {
        this.zza = zzctVar.zza;
        this.zzb = zzctVar.zzd;
        this.zzc = zzctVar.zzb;
        this.zzd = zzctVar.zzc;
        this.zze = zzctVar.zze;
        this.zzf = zzctVar.zzf;
        this.zzg = zzctVar.zzg;
        this.zzh = zzctVar.zzh;
        this.zzi = zzctVar.zzi;
        this.zzj = zzctVar.zzl;
        this.zzk = zzctVar.zzm;
        this.zzl = zzctVar.zzj;
        this.zzm = zzctVar.zzk;
        this.zzn = zzctVar.zzn;
        this.zzo = zzctVar.zzo;
    }
}
