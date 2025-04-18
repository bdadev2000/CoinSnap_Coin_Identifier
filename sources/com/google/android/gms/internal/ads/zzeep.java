package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.support.v4.media.d;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzeep extends zzefl {
    private final Activity zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    public /* synthetic */ zzeep(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzeeo zzeeoVar) {
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
        if (obj instanceof zzefl) {
            zzefl zzeflVar = (zzefl) obj;
            if (this.zza.equals(zzeflVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzeflVar.zzb()) : zzeflVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeflVar.zzc()) : zzeflVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeflVar.zzd()) : zzeflVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        t2.append(this.zzc);
        t2.append(", uri=");
        return d.r(t2, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzefl
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}
