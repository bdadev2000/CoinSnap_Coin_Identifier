package com.google.android.gms.internal.ads;

import Q7.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzftt extends zzftz {
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzftt(String str, boolean z8, boolean z9, zzftp zzftpVar, zzftq zzftqVar, int i9, zzfts zzftsVar) {
        this.zzb = str;
        this.zzc = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftz) {
            zzftz zzftzVar = (zzftz) obj;
            if (this.zzb.equals(zzftzVar.zzc())) {
                zzftzVar.zzd();
                zzftzVar.zze();
                zzftzVar.zza();
                zzftzVar.zzb();
                int i9 = this.zzc;
                int zzf = zzftzVar.zzf();
                if (i9 != 0) {
                    if (zzf == 1) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzc != 0) {
            return (((((hashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        if (this.zzc != 1) {
            str = "null";
        } else {
            str = "READ_AND_WRITE";
        }
        return n0.j("FileComplianceOptions{fileOwner=", this.zzb, ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final zzftp zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final zzftq zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final int zzf() {
        return this.zzc;
    }
}
