package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes2.dex */
public class VersionInfo {
    protected final int zza;
    protected final int zzb;
    protected final int zzc;

    public VersionInfo(int i9, int i10, int i11) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        return this.zza + "." + this.zzb + "." + this.zzc;
    }
}
