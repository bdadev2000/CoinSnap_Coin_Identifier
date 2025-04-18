package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzham implements zzhbb {
    private final zzhai zza;
    private final zzhbn zzb;
    private final boolean zzc;
    private final zzgyi zzd;

    private zzham(zzhbn zzhbnVar, zzgyi zzgyiVar, zzhai zzhaiVar) {
        this.zzb = zzhbnVar;
        this.zzc = zzhaiVar instanceof zzgyt;
        this.zzd = zzgyiVar;
        this.zza = zzhaiVar;
    }

    public static zzham zzc(zzhbn zzhbnVar, zzgyi zzgyiVar, zzhai zzhaiVar) {
        return new zzham(zzhbnVar, zzgyiVar, zzhaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final int zza(Object obj) {
        int zzb = ((zzgyx) obj).zzt.zzb();
        if (this.zzc) {
            return zzb + ((zzgyt) obj).zza.zzd();
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final int zzb(Object obj) {
        int hashCode = ((zzgyx) obj).zzt.hashCode();
        if (this.zzc) {
            return (hashCode * 53) + ((zzgyt) obj).zza.zza.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final Object zze() {
        zzhai zzhaiVar = this.zza;
        if (zzhaiVar instanceof zzgyx) {
            return ((zzgyx) zzhaiVar).zzbj();
        }
        return zzhaiVar.zzcZ().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzg(Object obj, Object obj2) {
        zzhbd.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhbd.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzh(Object obj, zzhav zzhavVar, zzgyh zzgyhVar) throws IOException {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgxd zzgxdVar) throws IOException {
        zzgyx zzgyxVar = (zzgyx) obj;
        if (zzgyxVar.zzt == zzhbo.zzc()) {
            zzgyxVar.zzt = zzhbo.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzj(Object obj, zzhcc zzhccVar) throws IOException {
        Iterator zzf = ((zzgyt) obj).zza.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgyl zzgylVar = (zzgyl) entry.getKey();
            if (zzgylVar.zzc() == zzhcb.MESSAGE && !zzgylVar.zze() && !zzgylVar.zzd()) {
                if (entry instanceof zzgzp) {
                    zzhccVar.zzw(zzgylVar.zza(), ((zzgzp) entry).zza().zzb());
                } else {
                    zzhccVar.zzw(zzgylVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        ((zzgyx) obj).zzt.zzk(zzhccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzgyx) obj).zzt.equals(((zzgyx) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgyt) obj).zza.equals(((zzgyt) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final boolean zzl(Object obj) {
        return ((zzgyt) obj).zza.zzi();
    }
}
