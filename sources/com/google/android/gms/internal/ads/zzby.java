package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzby {

    @Nullable
    private CharSequence zza;

    @Nullable
    private CharSequence zzb;

    @Nullable
    private CharSequence zzc;

    @Nullable
    private CharSequence zzd;

    @Nullable
    private CharSequence zze;

    @Nullable
    private byte[] zzf;

    @Nullable
    private Integer zzg;

    @Nullable
    private Integer zzh;

    @Nullable
    private Integer zzi;

    @Nullable
    private Integer zzj;

    @Nullable
    private Boolean zzk;

    @Nullable
    private Integer zzl;

    @Nullable
    private Integer zzm;

    @Nullable
    private Integer zzn;

    @Nullable
    private Integer zzo;

    @Nullable
    private Integer zzp;

    @Nullable
    private Integer zzq;

    @Nullable
    private CharSequence zzr;

    @Nullable
    private CharSequence zzs;

    @Nullable
    private CharSequence zzt;

    @Nullable
    private CharSequence zzu;

    @Nullable
    private CharSequence zzv;

    @Nullable
    private Integer zzw;

    public zzby() {
    }

    public final zzby zza(byte[] bArr, int i9) {
        if (this.zzf == null || zzgd.zzG(Integer.valueOf(i9), 3) || !zzgd.zzG(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i9);
        }
        return this;
    }

    public final zzby zzb(@Nullable zzca zzcaVar) {
        if (zzcaVar != null) {
            CharSequence charSequence = zzcaVar.zzc;
            if (charSequence != null) {
                this.zza = charSequence;
            }
            CharSequence charSequence2 = zzcaVar.zzd;
            if (charSequence2 != null) {
                this.zzb = charSequence2;
            }
            CharSequence charSequence3 = zzcaVar.zze;
            if (charSequence3 != null) {
                this.zzc = charSequence3;
            }
            CharSequence charSequence4 = zzcaVar.zzf;
            if (charSequence4 != null) {
                this.zzd = charSequence4;
            }
            CharSequence charSequence5 = zzcaVar.zzg;
            if (charSequence5 != null) {
                this.zze = charSequence5;
            }
            byte[] bArr = zzcaVar.zzh;
            if (bArr != null) {
                Integer num = zzcaVar.zzi;
                this.zzf = (byte[]) bArr.clone();
                this.zzg = num;
            }
            Integer num2 = zzcaVar.zzj;
            if (num2 != null) {
                this.zzh = num2;
            }
            Integer num3 = zzcaVar.zzk;
            if (num3 != null) {
                this.zzi = num3;
            }
            Integer num4 = zzcaVar.zzl;
            if (num4 != null) {
                this.zzj = num4;
            }
            Boolean bool = zzcaVar.zzm;
            if (bool != null) {
                this.zzk = bool;
            }
            Integer num5 = zzcaVar.zzn;
            if (num5 != null) {
                this.zzl = num5;
            }
            Integer num6 = zzcaVar.zzo;
            if (num6 != null) {
                this.zzl = num6;
            }
            Integer num7 = zzcaVar.zzp;
            if (num7 != null) {
                this.zzm = num7;
            }
            Integer num8 = zzcaVar.zzq;
            if (num8 != null) {
                this.zzn = num8;
            }
            Integer num9 = zzcaVar.zzr;
            if (num9 != null) {
                this.zzo = num9;
            }
            Integer num10 = zzcaVar.zzs;
            if (num10 != null) {
                this.zzp = num10;
            }
            Integer num11 = zzcaVar.zzt;
            if (num11 != null) {
                this.zzq = num11;
            }
            CharSequence charSequence6 = zzcaVar.zzu;
            if (charSequence6 != null) {
                this.zzr = charSequence6;
            }
            CharSequence charSequence7 = zzcaVar.zzv;
            if (charSequence7 != null) {
                this.zzs = charSequence7;
            }
            CharSequence charSequence8 = zzcaVar.zzw;
            if (charSequence8 != null) {
                this.zzt = charSequence8;
            }
            CharSequence charSequence9 = zzcaVar.zzx;
            if (charSequence9 != null) {
                this.zzu = charSequence9;
            }
            CharSequence charSequence10 = zzcaVar.zzy;
            if (charSequence10 != null) {
                this.zzv = charSequence10;
            }
            Integer num12 = zzcaVar.zzz;
            if (num12 != null) {
                this.zzw = num12;
            }
        }
        return this;
    }

    public final zzby zzc(@Nullable CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzby zzd(@Nullable CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzby zze(@Nullable CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzby zzf(@Nullable CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzby zzg(@Nullable CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzby zzh(@Nullable CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzby zzi(@Nullable CharSequence charSequence) {
        this.zzu = charSequence;
        return this;
    }

    public final zzby zzj(@Nullable Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzby zzk(@Nullable Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzby zzl(@Nullable Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzby zzm(@Nullable Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzby zzn(@Nullable Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzby zzo(@Nullable Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzby zzp(@Nullable CharSequence charSequence) {
        this.zzv = charSequence;
        return this;
    }

    public final zzby zzq(@Nullable CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzby zzr(@Nullable Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzby zzs(@Nullable Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzby zzt(@Nullable CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzca zzu() {
        return new zzca(this);
    }

    public /* synthetic */ zzby(zzca zzcaVar, zzbx zzbxVar) {
        this.zza = zzcaVar.zzc;
        this.zzb = zzcaVar.zzd;
        this.zzc = zzcaVar.zze;
        this.zzd = zzcaVar.zzf;
        this.zze = zzcaVar.zzg;
        this.zzf = zzcaVar.zzh;
        this.zzg = zzcaVar.zzi;
        this.zzh = zzcaVar.zzj;
        this.zzi = zzcaVar.zzk;
        this.zzj = zzcaVar.zzl;
        this.zzk = zzcaVar.zzm;
        this.zzl = zzcaVar.zzo;
        this.zzm = zzcaVar.zzp;
        this.zzn = zzcaVar.zzq;
        this.zzo = zzcaVar.zzr;
        this.zzp = zzcaVar.zzs;
        this.zzq = zzcaVar.zzt;
        this.zzr = zzcaVar.zzu;
        this.zzs = zzcaVar.zzv;
        this.zzt = zzcaVar.zzw;
        this.zzu = zzcaVar.zzx;
        this.zzv = zzcaVar.zzy;
        this.zzw = zzcaVar.zzz;
    }
}
