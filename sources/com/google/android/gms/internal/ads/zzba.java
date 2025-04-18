package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzba {
    public static final zzba zza = new zzba(new zzay());

    @Nullable
    public final CharSequence zzb;

    @Nullable
    public final CharSequence zzc;

    @Nullable
    public final CharSequence zzd;

    @Nullable
    public final CharSequence zze;

    @Nullable
    public final CharSequence zzf;

    @Nullable
    public final byte[] zzg;

    @Nullable
    public final Integer zzh;

    @Nullable
    public final Integer zzi;

    @Nullable
    public final Integer zzj;

    @Nullable
    @Deprecated
    public final Integer zzk;

    @Nullable
    public final Boolean zzl;

    @Nullable
    @Deprecated
    public final Integer zzm;

    @Nullable
    public final Integer zzn;

    @Nullable
    public final Integer zzo;

    @Nullable
    public final Integer zzp;

    @Nullable
    public final Integer zzq;

    @Nullable
    public final Integer zzr;

    @Nullable
    public final Integer zzs;

    @Nullable
    public final CharSequence zzt;

    @Nullable
    public final CharSequence zzu;

    @Nullable
    public final CharSequence zzv;

    @Nullable
    public final CharSequence zzw;

    @Nullable
    public final CharSequence zzx;

    @Nullable
    public final Integer zzy;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(1000, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.equals(this.zzb, zzbaVar.zzb) && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zzd, zzbaVar.zzd) && Objects.equals(this.zze, zzbaVar.zze) && Objects.equals(this.zzf, zzbaVar.zzf) && Arrays.equals(this.zzg, zzbaVar.zzg) && Objects.equals(this.zzh, zzbaVar.zzh) && Objects.equals(this.zzi, zzbaVar.zzi) && Objects.equals(this.zzj, zzbaVar.zzj) && Objects.equals(this.zzk, zzbaVar.zzk) && Objects.equals(this.zzl, zzbaVar.zzl) && Objects.equals(this.zzn, zzbaVar.zzn) && Objects.equals(this.zzo, zzbaVar.zzo) && Objects.equals(this.zzp, zzbaVar.zzp) && Objects.equals(this.zzq, zzbaVar.zzq) && Objects.equals(this.zzr, zzbaVar.zzr) && Objects.equals(this.zzs, zzbaVar.zzs) && Objects.equals(this.zzt, zzbaVar.zzt) && Objects.equals(this.zzu, zzbaVar.zzu) && Objects.equals(this.zzv, zzbaVar.zzv) && Objects.equals(this.zzw, zzbaVar.zzw) && Objects.equals(this.zzx, zzbaVar.zzx) && Objects.equals(this.zzy, zzbaVar.zzy)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, null, null, this.zzw, null, this.zzx, this.zzy, Boolean.TRUE});
    }

    public final zzay zza() {
        return new zzay(this, null);
    }

    private zzba(zzay zzayVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        bool = zzayVar.zzk;
        num = zzayVar.zzj;
        num2 = zzayVar.zzw;
        int i10 = 1;
        int i11 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    num = Integer.valueOf(i10);
                }
                i10 = 0;
                num = Integer.valueOf(i10);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                num2 = Integer.valueOf(i11);
            }
        } else {
            num = null;
        }
        charSequence = zzayVar.zza;
        this.zzb = charSequence;
        charSequence2 = zzayVar.zzb;
        this.zzc = charSequence2;
        charSequence3 = zzayVar.zzc;
        this.zzd = charSequence3;
        charSequence4 = zzayVar.zzd;
        this.zze = charSequence4;
        charSequence5 = zzayVar.zze;
        this.zzf = charSequence5;
        bArr = zzayVar.zzf;
        this.zzg = bArr;
        num3 = zzayVar.zzg;
        this.zzh = num3;
        num4 = zzayVar.zzh;
        this.zzi = num4;
        num5 = zzayVar.zzi;
        this.zzj = num5;
        this.zzk = num;
        this.zzl = bool;
        num6 = zzayVar.zzl;
        this.zzm = num6;
        num7 = zzayVar.zzl;
        this.zzn = num7;
        num8 = zzayVar.zzm;
        this.zzo = num8;
        num9 = zzayVar.zzn;
        this.zzp = num9;
        num10 = zzayVar.zzo;
        this.zzq = num10;
        num11 = zzayVar.zzp;
        this.zzr = num11;
        num12 = zzayVar.zzq;
        this.zzs = num12;
        charSequence6 = zzayVar.zzr;
        this.zzt = charSequence6;
        charSequence7 = zzayVar.zzs;
        this.zzu = charSequence7;
        charSequence8 = zzayVar.zzt;
        this.zzv = charSequence8;
        charSequence9 = zzayVar.zzu;
        this.zzw = charSequence9;
        charSequence10 = zzayVar.zzv;
        this.zzx = charSequence10;
        this.zzy = num2;
    }
}
