package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzalq {
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

    private static int zzA(int i10, String str, @Nullable String str2, int i11) {
        if (!str.isEmpty() && i10 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i10 + i11;
        }
        return i10;
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
        int i10 = this.zzk;
        if (i10 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final zzalq zzh(int i10) {
        this.zzh = i10;
        this.zzi = true;
        return this;
    }

    public final zzalq zzi(boolean z10) {
        this.zzk = 1;
        return this;
    }

    public final zzalq zzj(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzalq zzk(int i10) {
        this.zzf = i10;
        this.zzg = true;
        return this;
    }

    public final zzalq zzl(@Nullable String str) {
        this.zze = zzfwa.zza(str);
        return this;
    }

    public final zzalq zzm(float f10) {
        this.zzn = f10;
        return this;
    }

    public final zzalq zzn(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzalq zzo(boolean z10) {
        this.zzl = 1;
        return this;
    }

    public final zzalq zzp(int i10) {
        this.zzo = i10;
        return this;
    }

    public final zzalq zzq(boolean z10) {
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
