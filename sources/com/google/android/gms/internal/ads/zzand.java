package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzand {
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

    private static int zzA(int i9, String str, @Nullable String str2, int i10) {
        if (!str.isEmpty() && i9 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i9 + i10;
        }
        return i9;
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
            if (!TextUtils.isEmpty(str2)) {
                return 0;
            }
            return 1;
        }
        int zzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (zzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + zzA;
    }

    public final int zzg() {
        int i9 = this.zzk;
        if (i9 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i9 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final zzand zzh(int i9) {
        this.zzh = i9;
        this.zzi = true;
        return this;
    }

    public final zzand zzi(boolean z8) {
        this.zzk = 1;
        return this;
    }

    public final zzand zzj(boolean z8) {
        this.zzp = z8;
        return this;
    }

    public final zzand zzk(int i9) {
        this.zzf = i9;
        this.zzg = true;
        return this;
    }

    public final zzand zzl(@Nullable String str) {
        this.zze = zzfxm.zza(str);
        return this;
    }

    public final zzand zzm(float f9) {
        this.zzn = f9;
        return this;
    }

    public final zzand zzn(int i9) {
        this.zzm = i9;
        return this;
    }

    public final zzand zzo(boolean z8) {
        this.zzl = 1;
        return this;
    }

    public final zzand zzp(int i9) {
        this.zzo = i9;
        return this;
    }

    public final zzand zzq(boolean z8) {
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
