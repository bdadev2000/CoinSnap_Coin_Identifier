package com.google.android.gms.ads.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* loaded from: classes2.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    private final boolean zza;
    private final int zzb;
    private final boolean zzc;
    private final int zzd;
    private final VideoOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int zzh;
    private final int zzi;

    /* loaded from: classes2.dex */
    public @interface AdChoicesPlacement {
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private VideoOptions zzd;
        private boolean zza = false;
        private int zzb = 0;
        private boolean zzc = false;
        private int zze = 1;
        private boolean zzf = false;
        private boolean zzg = false;
        private int zzh = 0;
        private int zzi = 1;

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        @NonNull
        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i9, boolean z8) {
            this.zzg = z8;
            this.zzh = i9;
            return this;
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i9) {
            this.zze = i9;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i9) {
            this.zzb = i9;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z8) {
            this.zzf = z8;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z8) {
            this.zzc = z8;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z8) {
            this.zza = z8;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions) {
            this.zzd = videoOptions;
            return this;
        }

        @NonNull
        public final Builder zzi(int i9) {
            this.zzi = i9;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public @interface NativeMediaAspectRatio {
    }

    /* loaded from: classes2.dex */
    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder, zza zzaVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zze;
        this.zze = builder.zzd;
        this.zzf = builder.zzf;
        this.zzg = builder.zzg;
        this.zzh = builder.zzh;
        this.zzi = builder.zzi;
    }

    public int getAdChoicesPlacement() {
        return this.zzd;
    }

    public int getMediaAspectRatio() {
        return this.zzb;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.zze;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzc;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final int zza() {
        return this.zzh;
    }

    public final boolean zzb() {
        return this.zzg;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzi;
    }
}
