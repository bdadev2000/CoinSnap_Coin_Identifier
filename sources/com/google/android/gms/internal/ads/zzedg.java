package com.google.android.gms.internal.ads;

import a4.j;
import android.app.Activity;
import androidx.annotation.Nullable;
import vd.e;

/* loaded from: classes3.dex */
final class zzedg extends zzeec {
    private final Activity zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    public /* synthetic */ zzedg(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzedf zzedfVar) {
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
        if (obj instanceof zzeec) {
            zzeec zzeecVar = (zzeec) obj;
            if (this.zza.equals(zzeecVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzeecVar.zzb()) : zzeecVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeecVar.zzc()) : zzeecVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeecVar.zzd()) : zzeecVar.zzd() == null)) {
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
        int i10 = 0;
        if (zzmVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzmVar.hashCode();
        }
        int i11 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        String str = this.zzc;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.zzd;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i12 ^ i10;
    }

    public final String toString() {
        StringBuilder p10 = j.p("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        p10.append(this.zzc);
        p10.append(", uri=");
        return e.h(p10, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}
