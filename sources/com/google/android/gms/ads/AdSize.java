package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    @NonNull
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");

    @NonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");

    @NonNull
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");

    @NonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");

    @NonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");

    @NonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @NonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");

    @NonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");

    @NonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");

    @NonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    @NonNull
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AdSize(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        La:
            r1 = -2
            if (r6 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L14:
            java.lang.String r2 = "x"
            java.lang.String r3 = "_as"
            java.lang.String r0 = x0.AbstractC2914a.f(r0, r2, r1, r3)
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    @NonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i9) {
        AdSize zzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i9, 50, 0);
        zzd.zze = true;
        return zzd;
    }

    @NonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@NonNull Context context, int i9) {
        int zza2 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i9, 0);
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    public static AdSize getCurrentOrientationInterscrollerAdSize(@NonNull Context context, int i9) {
        return zzj(i9, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0));
    }

    @NonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i9, int i10) {
        AdSize adSize = new AdSize(i9, 0);
        adSize.zzg = i10;
        adSize.zzf = true;
        if (i10 < 32) {
            zzm.zzj("The maximum height set for the inline adaptive ad size was " + i10 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    @NonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i9) {
        AdSize zzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i9, 50, 2);
        zzd.zze = true;
        return zzd;
    }

    @NonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@NonNull Context context, int i9) {
        int zza2 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        AdSize adSize = new AdSize(i9, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    public static AdSize getLandscapeInterscrollerAdSize(@NonNull Context context, int i9) {
        return zzj(i9, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2));
    }

    @NonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i9) {
        AdSize zzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i9, 50, 1);
        zzd.zze = true;
        return zzd;
    }

    @NonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@NonNull Context context, int i9) {
        int zza2 = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        AdSize adSize = new AdSize(i9, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    public static AdSize getPortraitInterscrollerAdSize(@NonNull Context context, int i9) {
        return zzj(i9, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1));
    }

    private static AdSize zzj(int i9, int i10) {
        if (i10 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i9, 0);
        adSize.zzi = i10;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (this.zzb != adSize.zzb || this.zzc != adSize.zzc || !this.zzd.equals(adSize.zzd)) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@NonNull Context context) {
        int i9 = this.zzc;
        if (i9 != -4 && i9 != -3) {
            if (i9 != -2) {
                zzay.zzb();
                return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i9);
            }
            return zzq.zza(context.getResources().getDisplayMetrics());
        }
        return -1;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@NonNull Context context) {
        int i9 = this.zzb;
        if (i9 == -3) {
            return -1;
        }
        if (i9 != -1) {
            zzay.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i9);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @NonNull
    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i9) {
        this.zzg = i9;
    }

    public final void zzd(int i9) {
        this.zzi = i9;
    }

    public final void zze(boolean z8) {
        this.zzf = true;
    }

    public final void zzf(boolean z8) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public AdSize(int i9, int i10, String str) {
        if (i9 < 0 && i9 != -1 && i9 != -3) {
            throw new IllegalArgumentException(o.h(i9, "Invalid width for AdSize: "));
        }
        if (i10 < 0 && i10 != -2 && i10 != -4) {
            throw new IllegalArgumentException(o.h(i10, "Invalid height for AdSize: "));
        }
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = str;
    }
}
