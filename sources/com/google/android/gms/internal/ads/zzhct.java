package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhct implements zzhdk {
    private final zzhcp zza;
    private final zzhdy zzb;
    private final boolean zzc;
    private final zzhap zzd;

    private zzhct(zzhdy zzhdyVar, zzhap zzhapVar, zzhcp zzhcpVar) {
        this.zzb = zzhdyVar;
        this.zzc = zzhcpVar instanceof zzhba;
        this.zzd = zzhapVar;
        this.zza = zzhcpVar;
    }

    public static zzhct zzc(zzhdy zzhdyVar, zzhap zzhapVar, zzhcp zzhcpVar) {
        return new zzhct(zzhdyVar, zzhapVar, zzhcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final int zza(Object obj) {
        int zzb = ((zzhbe) obj).zzt.zzb();
        return this.zzc ? zzb + ((zzhba) obj).zza.zzd() : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final int zzb(Object obj) {
        int hashCode = ((zzhbe) obj).zzt.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzhba) obj).zza.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final Object zze() {
        zzhcp zzhcpVar = this.zza;
        return zzhcpVar instanceof zzhbe ? ((zzhbe) zzhcpVar).zzbj() : zzhcpVar.zzcZ().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzg(Object obj, Object obj2) {
        zzhdm.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhdm.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzh(Object obj, zzhdc zzhdcVar, zzhao zzhaoVar) throws IOException {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zzgzg zzgzgVar) throws IOException {
        zzhbe zzhbeVar = (zzhbe) obj;
        if (zzhbeVar.zzt == zzhdz.zzc()) {
            zzhbeVar.zzt = zzhdz.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzj(Object obj, zzhen zzhenVar) throws IOException {
        Iterator zzf = ((zzhba) obj).zza.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzhas zzhasVar = (zzhas) entry.getKey();
            if (zzhasVar.zzc() != zzhem.MESSAGE || zzhasVar.zze() || zzhasVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzhbx) {
                zzhenVar.zzw(zzhasVar.zza(), ((zzhbx) entry).zza().zzb());
            } else {
                zzhenVar.zzw(zzhasVar.zza(), entry.getValue());
            }
        }
        ((zzhbe) obj).zzt.zzk(zzhenVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzhbe) obj).zzt.equals(((zzhbe) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzhba) obj).zza.equals(((zzhba) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final boolean zzl(Object obj) {
        return ((zzhba) obj).zza.zzi();
    }
}
