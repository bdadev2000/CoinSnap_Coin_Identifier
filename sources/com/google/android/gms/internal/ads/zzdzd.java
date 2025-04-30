package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzdzd extends Exception {
    private final int zza;

    public zzdzd(int i9) {
        this.zza = i9;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdzd(int i9, String str) {
        super(str);
        this.zza = i9;
    }

    public zzdzd(int i9, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
