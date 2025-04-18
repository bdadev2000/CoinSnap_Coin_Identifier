package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfhd implements zzfhc {
    private final ConcurrentHashMap zza;
    private final zzfhj zzb;
    private final zzfhf zzc = new zzfhf();

    public zzfhd(zzfhj zzfhjVar) {
        this.zza = new ConcurrentHashMap(zzfhjVar.zzd);
        this.zzb = zzfhjVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfhj> creator = zzfhj.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgi)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.zzb.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfhm) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfhb) entry.getValue()).zzb(); i11++) {
                    sb2.append("[O]");
                }
                for (int zzb = ((zzfhb) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfhb) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final zzfhj zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    @Nullable
    public final synchronized zzfhl zzb(zzfhm zzfhmVar) {
        zzfhl zzfhlVar;
        zzfhb zzfhbVar = (zzfhb) this.zza.get(zzfhmVar);
        if (zzfhbVar != null) {
            zzfhlVar = zzfhbVar.zze();
            if (zzfhlVar == null) {
                this.zzc.zze();
            }
            zzfhz zzf = zzfhbVar.zzf();
            if (zzfhlVar != null) {
                zzbbs.zzb.zzc zzd = zzbbs.zzb.zzd();
                zzbbs.zzb.zza.C0144zza zza = zzbbs.zzb.zza.zza();
                zza.zzf(zzbbs.zzb.zzd.IN_MEMORY);
                zzbbs.zzb.zze.zza zzb = zzbbs.zzb.zze.zzb();
                zzb.zzd(zzf.zza);
                zzb.zze(zzf.zzb);
                zza.zzg(zzb);
                zzd.zzd(zza);
                zzfhlVar.zza.zzb().zzc().zzi(zzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfhlVar = null;
        }
        return zzfhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    @Deprecated
    public final zzfhm zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzy zzyVar) {
        return new zzfhn(zzmVar, str, new zzbwa(this.zzb.zza).zza().zzj, this.zzb.zzf, zzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final synchronized boolean zzd(zzfhm zzfhmVar, zzfhl zzfhlVar) {
        boolean zzh;
        zzfhb zzfhbVar = (zzfhb) this.zza.get(zzfhmVar);
        zzfhlVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        if (zzfhbVar == null) {
            zzfhj zzfhjVar = this.zzb;
            zzfhb zzfhbVar2 = new zzfhb(zzfhjVar.zzd, zzfhjVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i10 = this.zzb.zzg;
                int i11 = i10 - 1;
                zzfhm zzfhmVar2 = null;
                if (i10 != 0) {
                    long j3 = Long.MAX_VALUE;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                int i12 = Integer.MAX_VALUE;
                                for (Map.Entry entry : this.zza.entrySet()) {
                                    if (((zzfhb) entry.getValue()).zza() < i12) {
                                        i12 = ((zzfhb) entry.getValue()).zza();
                                        zzfhmVar2 = (zzfhm) entry.getKey();
                                    }
                                }
                                if (zzfhmVar2 != null) {
                                    this.zza.remove(zzfhmVar2);
                                }
                            }
                        } else {
                            for (Map.Entry entry2 : this.zza.entrySet()) {
                                if (((zzfhb) entry2.getValue()).zzd() < j3) {
                                    j3 = ((zzfhb) entry2.getValue()).zzd();
                                    zzfhmVar2 = (zzfhm) entry2.getKey();
                                }
                            }
                            if (zzfhmVar2 != null) {
                                this.zza.remove(zzfhmVar2);
                            }
                        }
                    } else {
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfhb) entry3.getValue()).zzc() < j3) {
                                j3 = ((zzfhb) entry3.getValue()).zzc();
                                zzfhmVar2 = (zzfhm) entry3.getKey();
                            }
                        }
                        if (zzfhmVar2 != null) {
                            this.zza.remove(zzfhmVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfhmVar, zzfhbVar2);
            this.zzc.zzd();
            zzfhbVar = zzfhbVar2;
        }
        zzh = zzfhbVar.zzh(zzfhlVar);
        this.zzc.zzc();
        zzfhe zza = this.zzc.zza();
        zzfhz zzf = zzfhbVar.zzf();
        zzbbs.zzb.zzc zzd = zzbbs.zzb.zzd();
        zzbbs.zzb.zza.C0144zza zza2 = zzbbs.zzb.zza.zza();
        zza2.zzf(zzbbs.zzb.zzd.IN_MEMORY);
        zzbbs.zzb.zzg.zza zzb = zzbbs.zzb.zzg.zzb();
        zzb.zze(zza.zza);
        zzb.zzf(zza.zzb);
        zzb.zzg(zzf.zzb);
        zza2.zzi(zzb);
        zzd.zzd(zza2);
        zzfhlVar.zza.zzb().zzc().zzj(zzd.zzbr());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final synchronized boolean zze(zzfhm zzfhmVar) {
        zzfhb zzfhbVar = (zzfhb) this.zza.get(zzfhmVar);
        if (zzfhbVar == null) {
            return true;
        }
        zzfhj zzfhjVar = this.zzb;
        if (zzfhbVar.zzb() < zzfhjVar.zzd) {
            return true;
        }
        return false;
    }
}
