package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzeem extends zzeeq {
    private final String zza;
    private final String zzb;

    @Nullable
    private final Drawable zzc;

    public zzeem(String str, String str2, @Nullable Drawable drawable) {
        if (str == null) {
            throw new NullPointerException("Null advertiserName");
        }
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeeq) {
            zzeeq zzeeqVar = (zzeeq) obj;
            if (this.zza.equals(zzeeqVar.zzb()) && this.zzb.equals(zzeeqVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzeeqVar.zza()) : zzeeqVar.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (hashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + String.valueOf(this.zzc) + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzeeq
    @Nullable
    public final Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeeq
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeeq
    public final String zzc() {
        return this.zzb;
    }
}
