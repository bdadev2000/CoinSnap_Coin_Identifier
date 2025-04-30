package com.google.android.gms.internal.measurement;

import Q7.n0;

/* loaded from: classes2.dex */
final class zzce extends zzcj {
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final zzcc zze;
    private final zzcb zzf;
    private final zzcl zzg;

    public final boolean equals(Object obj) {
        zzcc zzccVar;
        zzcb zzcbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcj) {
            zzcj zzcjVar = (zzcj) obj;
            if (this.zzb.equals(zzcjVar.zzd()) && this.zzc == zzcjVar.zze() && this.zzd == zzcjVar.zzf() && ((zzccVar = this.zze) != null ? zzccVar.equals(zzcjVar.zza()) : zzcjVar.zza() == null) && ((zzcbVar = this.zzf) != null ? zzcbVar.equals(zzcjVar.zzb()) : zzcjVar.zzb() == null) && this.zzg.equals(zzcjVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode;
        int hashCode2 = (this.zzb.hashCode() ^ 1000003) * 1000003;
        int i10 = 1237;
        if (this.zzc) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i11 = (hashCode2 ^ i9) * 1000003;
        if (this.zzd) {
            i10 = 1231;
        }
        int i12 = (i11 ^ i10) * 1000003;
        zzcc zzccVar = this.zze;
        int i13 = 0;
        if (zzccVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzccVar.hashCode();
        }
        int i14 = (i12 ^ hashCode) * 1000003;
        zzcb zzcbVar = this.zzf;
        if (zzcbVar != null) {
            i13 = zzcbVar.hashCode();
        }
        return ((i14 ^ i13) * 1000003) ^ this.zzg.hashCode();
    }

    public final String toString() {
        String str = this.zzb;
        boolean z8 = this.zzc;
        boolean z9 = this.zzd;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(this.zzf);
        String valueOf3 = String.valueOf(this.zzg);
        StringBuilder sb = new StringBuilder("FileComplianceOptions{fileOwner=");
        sb.append(str);
        sb.append(", hasDifferentDmaOwner=");
        sb.append(z8);
        sb.append(", skipChecks=");
        sb.append(z9);
        sb.append(", dataForwardingNotAllowedResolver=");
        sb.append(valueOf);
        sb.append(", multipleProductIdGroupsResolver=");
        return n0.m(sb, valueOf2, ", filePurpose=", valueOf3, "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcc zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcb zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcl zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean zzf() {
        return this.zzd;
    }

    private zzce(String str, boolean z8, boolean z9, zzcc zzccVar, zzcb zzcbVar, zzcl zzclVar) {
        this.zzb = str;
        this.zzc = z8;
        this.zzd = z9;
        this.zze = null;
        this.zzf = null;
        this.zzg = zzclVar;
    }
}
