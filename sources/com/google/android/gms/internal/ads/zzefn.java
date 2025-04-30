package com.google.android.gms.internal.ads;

import Q7.n0;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzefn extends zzefr {
    private final String zza;
    private final String zzb;

    @Nullable
    private final Drawable zzc;

    public zzefn(String str, String str2, @Nullable Drawable drawable) {
        if (str != null) {
            this.zza = str;
            if (str2 != null) {
                this.zzb = str2;
                this.zzc = drawable;
                return;
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null advertiserName");
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzefr) {
            zzefr zzefrVar = (zzefr) obj;
            if (this.zza.equals(zzefrVar.zzb()) && this.zzb.equals(zzefrVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzefrVar.zza()) : zzefrVar.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder("OfflineAdAssets{advertiserName=");
        sb.append(this.zza);
        sb.append(", imageUrl=");
        return n0.m(sb, this.zzb, ", icon=", valueOf, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzefr
    @Nullable
    public final Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzefr
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzefr
    public final String zzc() {
        return this.zzb;
    }
}
