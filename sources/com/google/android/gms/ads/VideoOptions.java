package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzfk;

/* loaded from: classes2.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        @NonNull
        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        @NonNull
        public Builder setClickToExpandRequested(boolean z8) {
            this.zzc = z8;
            return this;
        }

        @NonNull
        public Builder setCustomControlsRequested(boolean z8) {
            this.zzb = z8;
            return this;
        }

        @NonNull
        public Builder setStartMuted(boolean z8) {
            this.zza = z8;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzi zziVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }

    public VideoOptions(zzfk zzfkVar) {
        this.zza = zzfkVar.zza;
        this.zzb = zzfkVar.zzb;
        this.zzc = zzfkVar.zzc;
    }
}
