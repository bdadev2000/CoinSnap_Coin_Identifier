package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzdwn extends Exception {
    private final int zza;

    public zzdwn(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdwn(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzdwn(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }
}
