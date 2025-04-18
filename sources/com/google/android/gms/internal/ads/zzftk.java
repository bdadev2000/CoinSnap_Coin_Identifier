package com.google.android.gms.internal.ads;

import android.support.v4.media.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzftk extends zzftr {
    private final String zzb;
    private final boolean zzc;
    private final int zzd;

    public /* synthetic */ zzftk(String str, boolean z2, boolean z3, zzftg zzftgVar, zzfth zzfthVar, int i2, zzftj zzftjVar) {
        this.zzb = str;
        this.zzc = z3;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftr) {
            zzftr zzftrVar = (zzftr) obj;
            if (this.zzb.equals(zzftrVar.zzc())) {
                zzftrVar.zzd();
                if (this.zzc == zzftrVar.zze()) {
                    zzftrVar.zza();
                    zzftrVar.zzb();
                    int i2 = this.zzd;
                    int zzf = zzftrVar.zzf();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzd == 0) {
            throw null;
        }
        return (((((hashCode * 1000003) ^ 1237) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 583896283) ^ 1;
    }

    public final String toString() {
        String str = this.zzd != 1 ? "null" : "READ_AND_WRITE";
        boolean z2 = this.zzc;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder("FileComplianceOptions{fileOwner=");
        sb.append(str2);
        sb.append(", hasDifferentDmaOwner=false, skipChecks=");
        sb.append(z2);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        return d.r(sb, str, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final zzftg zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final zzfth zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final int zzf() {
        return this.zzd;
    }
}
