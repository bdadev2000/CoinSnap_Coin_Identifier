package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class AdValue {
    private final int zza;
    private final String zzb;
    private final long zzc;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i9, String str, long j7) {
        this.zza = i9;
        this.zzb = str;
        this.zzc = j7;
    }

    @NonNull
    public static AdValue zza(int i9, @NonNull String str, long j7) {
        return new AdValue(i9, str, j7);
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
