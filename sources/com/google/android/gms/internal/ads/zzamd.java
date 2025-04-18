package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzamd {

    @ColorInt
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.emptySet();
    private String zzd = "";

    @Nullable
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i2, String str, @Nullable String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public final float zza() {
        return this.zzn;
    }

    public final int zzb() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int zzc() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int zzd() {
        return this.zzm;
    }

    public final int zze() {
        return this.zzo;
    }

    public final int zzf(@Nullable String str, @Nullable String str2, Set set, @Nullable String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int zzA = zzA(zzA(zzA(0, this.zza, str, Ints.MAX_POWER_OF_TWO), this.zzb, str2, 2), this.zzd, str3, 4);
        if (zzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + zzA;
    }

    public final int zzg() {
        int i2 = this.zzk;
        if (i2 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final zzamd zzh(int i2) {
        this.zzh = i2;
        this.zzi = true;
        return this;
    }

    public final zzamd zzi(boolean z2) {
        this.zzk = 1;
        return this;
    }

    public final zzamd zzj(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final zzamd zzk(int i2) {
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    public final zzamd zzl(@Nullable String str) {
        this.zze = zzfxi.zza(str);
        return this;
    }

    public final zzamd zzm(float f2) {
        this.zzn = f2;
        return this;
    }

    public final zzamd zzn(int i2) {
        this.zzm = i2;
        return this;
    }

    public final zzamd zzo(boolean z2) {
        this.zzl = 1;
        return this;
    }

    public final zzamd zzp(int i2) {
        this.zzo = i2;
        return this;
    }

    public final zzamd zzq(boolean z2) {
        this.zzj = 1;
        return this;
    }

    @Nullable
    public final String zzr() {
        return this.zze;
    }

    public final void zzs(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzt(String str) {
        this.zza = str;
    }

    public final void zzu(String str) {
        this.zzb = str;
    }

    public final void zzv(String str) {
        this.zzd = str;
    }

    public final boolean zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return this.zzi;
    }

    public final boolean zzy() {
        return this.zzg;
    }

    public final boolean zzz() {
        return this.zzj == 1;
    }
}
