package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzaly {

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
    private zzalr zzr;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzaly zzA(boolean z2) {
        this.zzq = z2 ? 1 : 0;
        return this;
    }

    public final zzaly zzB(@Nullable zzalr zzalrVar) {
        this.zzr = zzalrVar;
        return this;
    }

    public final zzaly zzC(boolean z2) {
        this.zzg = z2 ? 1 : 0;
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
        int i2 = this.zzh;
        if (i2 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
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
    public final zzalr zzk() {
        return this.zzr;
    }

    public final zzaly zzl(@Nullable zzaly zzalyVar) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzalyVar != null) {
            if (!this.zzc && zzalyVar.zzc) {
                zzo(zzalyVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzalyVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzalyVar.zzi;
            }
            if (this.zza == null && (str = zzalyVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzalyVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzalyVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzalyVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzalyVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzalyVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzalyVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzalyVar.zzj;
                this.zzk = zzalyVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzalyVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzalyVar.zzs;
            }
            if (!this.zze && zzalyVar.zze) {
                zzm(zzalyVar.zzd);
            }
            if (this.zzm == -1 && (i2 = zzalyVar.zzm) != -1) {
                this.zzm = i2;
            }
        }
        return this;
    }

    public final zzaly zzm(int i2) {
        this.zzd = i2;
        this.zze = true;
        return this;
    }

    public final zzaly zzn(boolean z2) {
        this.zzh = z2 ? 1 : 0;
        return this;
    }

    public final zzaly zzo(int i2) {
        this.zzb = i2;
        this.zzc = true;
        return this;
    }

    public final zzaly zzp(@Nullable String str) {
        this.zza = str;
        return this;
    }

    public final zzaly zzq(float f2) {
        this.zzk = f2;
        return this;
    }

    public final zzaly zzr(int i2) {
        this.zzj = i2;
        return this;
    }

    public final zzaly zzs(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    public final zzaly zzt(boolean z2) {
        this.zzi = z2 ? 1 : 0;
        return this;
    }

    public final zzaly zzu(boolean z2) {
        this.zzf = z2 ? 1 : 0;
        return this;
    }

    public final zzaly zzv(@Nullable Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzaly zzw(int i2) {
        this.zzn = i2;
        return this;
    }

    public final zzaly zzx(int i2) {
        this.zzm = i2;
        return this;
    }

    public final zzaly zzy(float f2) {
        this.zzs = f2;
        return this;
    }

    public final zzaly zzz(@Nullable Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
