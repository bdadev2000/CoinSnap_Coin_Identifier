package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes3.dex */
public class PreloadConfiguration {
    private final String zza;
    private final AdFormat zzb;
    private final AdRequest zzc;
    private final int zzd;

    /* loaded from: classes3.dex */
    public static class Builder {
        private final String zza;
        private final AdFormat zzb;
        private AdRequest zzc = new AdRequest.Builder().build();
        private int zzd;

        public Builder(@NonNull String str, @NonNull AdFormat adFormat) {
            this.zza = str;
            this.zzb = adFormat;
        }

        @NonNull
        public PreloadConfiguration build() {
            return new PreloadConfiguration(this, null);
        }

        @NonNull
        public Builder setAdRequest(@NonNull AdRequest adRequest) {
            this.zzc = adRequest;
            return this;
        }

        @NonNull
        public Builder setBufferSize(int i10) {
            this.zzd = i10;
            return this;
        }
    }

    public /* synthetic */ PreloadConfiguration(Builder builder, zza zzaVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    @NonNull
    public AdFormat getAdFormat() {
        return this.zzb;
    }

    @NonNull
    public AdRequest getAdRequest() {
        return this.zzc;
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}
