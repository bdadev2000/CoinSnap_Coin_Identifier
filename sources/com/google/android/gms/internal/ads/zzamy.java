package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzamy {

    @Nullable
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;

    @Nullable
    private String zzl;

    @Nullable
    private Layout.Alignment zzo;

    @Nullable
    private Layout.Alignment zzp;

    @Nullable
    private zzamr zzr;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzamy zzA(boolean z8) {
        this.zzq = z8 ? 1 : 0;
        return this;
    }

    public final zzamy zzB(@Nullable zzamr zzamrVar) {
        this.zzr = zzamrVar;
        return this;
    }

    public final zzamy zzC(boolean z8) {
        this.zzg = z8 ? 1 : 0;
        return this;
    }

    @Nullable
    public final String zzD() {
        return this.zza;
    }

    @Nullable
    public final String zzE() {
        return this.zzl;
    }

    public final boolean zzF() {
        return this.zzq == 1;
    }

    public final boolean zzG() {
        return this.zze;
    }

    public final boolean zzH() {
        return this.zzc;
    }

    public final boolean zzI() {
        return this.zzf == 1;
    }

    public final boolean zzJ() {
        return this.zzg == 1;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int zzd() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int i9 = this.zzh;
        if (i9 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i9 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    @Nullable
    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    @Nullable
    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    @Nullable
    public final zzamr zzk() {
        return this.zzr;
    }

    public final zzamy zzl(@Nullable zzamy zzamyVar) {
        int i9;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzamyVar != null) {
            if (!this.zzc && zzamyVar.zzc) {
                zzo(zzamyVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzamyVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzamyVar.zzi;
            }
            if (this.zza == null && (str = zzamyVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzamyVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzamyVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzamyVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzamyVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzamyVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzamyVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzamyVar.zzj;
                this.zzk = zzamyVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzamyVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzamyVar.zzs;
            }
            if (!this.zze && zzamyVar.zze) {
                zzm(zzamyVar.zzd);
            }
            if (this.zzm == -1 && (i9 = zzamyVar.zzm) != -1) {
                this.zzm = i9;
            }
        }
        return this;
    }

    public final zzamy zzm(int i9) {
        this.zzd = i9;
        this.zze = true;
        return this;
    }

    public final zzamy zzn(boolean z8) {
        this.zzh = z8 ? 1 : 0;
        return this;
    }

    public final zzamy zzo(int i9) {
        this.zzb = i9;
        this.zzc = true;
        return this;
    }

    public final zzamy zzp(@Nullable String str) {
        this.zza = str;
        return this;
    }

    public final zzamy zzq(float f9) {
        this.zzk = f9;
        return this;
    }

    public final zzamy zzr(int i9) {
        this.zzj = i9;
        return this;
    }

    public final zzamy zzs(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    public final zzamy zzt(boolean z8) {
        this.zzi = z8 ? 1 : 0;
        return this;
    }

    public final zzamy zzu(boolean z8) {
        this.zzf = z8 ? 1 : 0;
        return this;
    }

    public final zzamy zzv(@Nullable Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzamy zzw(int i9) {
        this.zzn = i9;
        return this;
    }

    public final zzamy zzx(int i9) {
        this.zzm = i9;
        return this;
    }

    public final zzamy zzy(float f9) {
        this.zzs = f9;
        return this;
    }

    public final zzamy zzz(@Nullable Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
