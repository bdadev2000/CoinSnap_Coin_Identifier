package com.google.android.gms.internal.ads;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import vd.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfsa extends zzfsh {
    private final String zzb;
    private final boolean zzc;
    private final int zzd;

    public /* synthetic */ zzfsa(String str, boolean z10, boolean z11, zzfrw zzfrwVar, zzfrx zzfrxVar, int i10, zzfrz zzfrzVar) {
        this.zzb = str;
        this.zzc = z11;
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsh) {
            zzfsh zzfshVar = (zzfsh) obj;
            if (this.zzb.equals(zzfshVar.zzc())) {
                zzfshVar.zzd();
                if (this.zzc == zzfshVar.zze()) {
                    zzfshVar.zza();
                    zzfshVar.zzb();
                    int i10 = this.zzd;
                    int zzf = zzfshVar.zzf();
                    if (i10 != 0) {
                        if (zzf == 1) {
                            return true;
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzd != 0) {
            int i11 = hashCode * 1000003;
            if (true != this.zzc) {
                i10 = 1237;
            } else {
                i10 = 1231;
            }
            return ((((i11 ^ 1237) * 1000003) ^ i10) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        if (this.zzd != 1) {
            str = AbstractJsonLexerKt.NULL;
        } else {
            str = "READ_AND_WRITE";
        }
        boolean z10 = this.zzc;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder("FileComplianceOptions{fileOwner=");
        sb2.append(str2);
        sb2.append(", hasDifferentDmaOwner=false, skipChecks=");
        sb2.append(z10);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        return e.h(sb2, str, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfrw zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final zzfrx zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final int zzf() {
        return this.zzd;
    }
}
