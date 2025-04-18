package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class AdValue {
    private final int zza;
    private final String zzb;
    private final long zzc;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i10, String str, long j3) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = j3;
    }

    @NonNull
    public static AdValue zza(int i10, @NonNull String str, long j3) {
        return new AdValue(i10, str, j3);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.zzb;
    }

    public int getPrecisionType() {
        return this.zza;
    }

    public long getValueMicros() {
        return this.zzc;
    }
}
