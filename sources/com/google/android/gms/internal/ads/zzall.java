package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzall {

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
    private zzale zzr;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzall zzA(boolean z10) {
        this.zzq = z10 ? 1 : 0;
        return this;
    }

    public final zzall zzB(@Nullable zzale zzaleVar) {
        this.zzr = zzaleVar;
        return this;
    }

    public final zzall zzC(boolean z10) {
        this.zzg = z10 ? 1 : 0;
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
        int i10 = this.zzh;
        if (i10 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
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
    public final zzale zzk() {
        return this.zzr;
    }

    public final zzall zzl(@Nullable zzall zzallVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzallVar != null) {
            if (!this.zzc && zzallVar.zzc) {
                zzo(zzallVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzallVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzallVar.zzi;
            }
            if (this.zza == null && (str = zzallVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzallVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzallVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzallVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzallVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzallVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzallVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzallVar.zzj;
                this.zzk = zzallVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzallVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzallVar.zzs;
            }
            if (!this.zze && zzallVar.zze) {
                zzm(zzallVar.zzd);
            }
            if (this.zzm == -1 && (i10 = zzallVar.zzm) != -1) {
                this.zzm = i10;
            }
        }
        return this;
    }

    public final zzall zzm(int i10) {
        this.zzd = i10;
        this.zze = true;
        return this;
    }

    public final zzall zzn(boolean z10) {
        this.zzh = z10 ? 1 : 0;
        return this;
    }

    public final zzall zzo(int i10) {
        this.zzb = i10;
        this.zzc = true;
        return this;
    }

    public final zzall zzp(@Nullable String str) {
        this.zza = str;
        return this;
    }

    public final zzall zzq(float f10) {
        this.zzk = f10;
        return this;
    }

    public final zzall zzr(int i10) {
        this.zzj = i10;
        return this;
    }

    public final zzall zzs(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    public final zzall zzt(boolean z10) {
        this.zzi = z10 ? 1 : 0;
        return this;
    }

    public final zzall zzu(boolean z10) {
        this.zzf = z10 ? 1 : 0;
        return this;
    }

    public final zzall zzv(@Nullable Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzall zzw(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzall zzx(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzall zzy(float f10) {
        this.zzs = f10;
        return this;
    }

    public final zzall zzz(@Nullable Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
