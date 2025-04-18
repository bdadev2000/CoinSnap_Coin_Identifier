package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzdye extends Exception {
    private final int zza;

    public zzdye(int i2) {
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdye(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzdye(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
