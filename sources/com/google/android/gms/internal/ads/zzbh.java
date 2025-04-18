package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbh {
    public static final zzbh zza = new zzbh(new zzbf());

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
        if (obj != null && zzbh.class == obj.getClass()) {
            zzbh zzbhVar = (zzbh) obj;
            if (Objects.equals(this.zzb, zzbhVar.zzb) && Objects.equals(this.zzc, zzbhVar.zzc) && Objects.equals(this.zzd, zzbhVar.zzd) && Objects.equals(this.zze, zzbhVar.zze) && Objects.equals(this.zzf, zzbhVar.zzf) && Arrays.equals(this.zzg, zzbhVar.zzg) && Objects.equals(this.zzh, zzbhVar.zzh) && Objects.equals(this.zzi, zzbhVar.zzi) && Objects.equals(this.zzj, zzbhVar.zzj) && Objects.equals(this.zzk, zzbhVar.zzk) && Objects.equals(this.zzl, zzbhVar.zzl) && Objects.equals(this.zzn, zzbhVar.zzn) && Objects.equals(this.zzo, zzbhVar.zzo) && Objects.equals(this.zzp, zzbhVar.zzp) && Objects.equals(this.zzq, zzbhVar.zzq) && Objects.equals(this.zzr, zzbhVar.zzr) && Objects.equals(this.zzs, zzbhVar.zzs) && Objects.equals(this.zzt, zzbhVar.zzt) && Objects.equals(this.zzu, zzbhVar.zzu) && Objects.equals(this.zzv, zzbhVar.zzv) && Objects.equals(this.zzw, zzbhVar.zzw) && Objects.equals(this.zzx, zzbhVar.zzx) && Objects.equals(this.zzy, zzbhVar.zzy)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, null, null, this.zzw, null, this.zzx, this.zzy, Boolean.TRUE});
    }

    public final zzbf zza() {
        return new zzbf(this, null);
    }

    private zzbh(zzbf zzbfVar) {
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
        bool = zzbfVar.zzk;
        num = zzbfVar.zzj;
        num2 = zzbfVar.zzw;
        int i2 = 1;
        int i3 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i2 = 2;
                            break;
                        case 22:
                            i2 = 3;
                            break;
                        case 23:
                            i2 = 4;
                            break;
                        case 24:
                            i2 = 5;
                            break;
                        case 25:
                            i2 = 6;
                            break;
                    }
                    num = Integer.valueOf(i2);
                }
                i2 = 0;
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i3 = 21;
                        break;
                    case 3:
                        i3 = 22;
                        break;
                    case 4:
                        i3 = 23;
                        break;
                    case 5:
                        i3 = 24;
                        break;
                    case 6:
                        i3 = 25;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                num2 = Integer.valueOf(i3);
            }
        } else {
            num = null;
        }
        charSequence = zzbfVar.zza;
        this.zzb = charSequence;
        charSequence2 = zzbfVar.zzb;
        this.zzc = charSequence2;
        charSequence3 = zzbfVar.zzc;
        this.zzd = charSequence3;
        charSequence4 = zzbfVar.zzd;
        this.zze = charSequence4;
        charSequence5 = zzbfVar.zze;
        this.zzf = charSequence5;
        bArr = zzbfVar.zzf;
        this.zzg = bArr;
        num3 = zzbfVar.zzg;
        this.zzh = num3;
        num4 = zzbfVar.zzh;
        this.zzi = num4;
        num5 = zzbfVar.zzi;
        this.zzj = num5;
        this.zzk = num;
        this.zzl = bool;
        num6 = zzbfVar.zzl;
        this.zzm = num6;
        num7 = zzbfVar.zzl;
        this.zzn = num7;
        num8 = zzbfVar.zzm;
        this.zzo = num8;
        num9 = zzbfVar.zzn;
        this.zzp = num9;
        num10 = zzbfVar.zzo;
        this.zzq = num10;
        num11 = zzbfVar.zzp;
        this.zzr = num11;
        num12 = zzbfVar.zzq;
        this.zzs = num12;
        charSequence6 = zzbfVar.zzr;
        this.zzt = charSequence6;
        charSequence7 = zzbfVar.zzs;
        this.zzu = charSequence7;
        charSequence8 = zzbfVar.zzt;
        this.zzv = charSequence8;
        charSequence9 = zzbfVar.zzu;
        this.zzw = charSequence9;
        charSequence10 = zzbfVar.zzv;
        this.zzx = charSequence10;
        this.zzy = num2;
    }
}
