package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzefq extends zzegm {
    private final Activity zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    public /* synthetic */ zzefq(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzefp zzefpVar) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzegm) {
            zzegm zzegmVar = (zzegm) obj;
            if (this.zza.equals(zzegmVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzegmVar.zzb()) : zzegmVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzegmVar.zzc()) : zzegmVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzegmVar.zzd()) : zzegmVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int i9 = 0;
        if (zzmVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzmVar.hashCode();
        }
        int i10 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        String str = this.zzc;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str2 = this.zzd;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i11 ^ i9;
    }

    public final String toString() {
        StringBuilder o3 = o.o("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        o3.append(this.zzc);
        o3.append(", uri=");
        return AbstractC2914a.h(o3, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}
