package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhdi implements zzhdz {
    private final zzhde zza;
    private final zzheq zzb;
    private final boolean zzc;
    private final zzhaz zzd;

    private zzhdi(zzheq zzheqVar, zzhaz zzhazVar, zzhde zzhdeVar) {
        this.zzb = zzheqVar;
        this.zzc = zzhazVar.zzj(zzhdeVar);
        this.zzd = zzhazVar;
        this.zza = zzhdeVar;
    }

    public static zzhdi zzc(zzheq zzheqVar, zzhaz zzhazVar, zzhde zzhdeVar) {
        return new zzhdi(zzheqVar, zzhazVar, zzhdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final int zza(Object obj) {
        zzheq zzheqVar = this.zzb;
        int zzb = zzheqVar.zzb(zzheqVar.zzd(obj));
        if (this.zzc) {
            return zzb + this.zzd.zzb(obj).zzd();
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Object zze() {
        zzhde zzhdeVar = this.zza;
        if (zzhdeVar instanceof zzhbo) {
            return ((zzhbo) zzhdeVar).zzbj();
        }
        return zzhdeVar.zzcY().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzg(Object obj, Object obj2) {
        zzheb.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzheb.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzh(Object obj, zzhdr zzhdrVar, zzhay zzhayVar) throws IOException {
        boolean zzQ;
        zzheq zzheqVar = this.zzb;
        Object zzc = zzheqVar.zzc(obj);
        zzhaz zzhazVar = this.zzd;
        zzhbd zzc2 = zzhazVar.zzc(obj);
        while (zzhdrVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzhdrVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzhazVar.zzd(zzhayVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzhazVar.zzg(zzhdrVar, zzd2, zzhayVar, zzc2);
                        } else {
                            zzQ = zzheqVar.zzr(zzc, zzhdrVar);
                        }
                    } else {
                        zzQ = zzhdrVar.zzQ();
                    }
                    if (!zzQ) {
                        break;
                    }
                } else {
                    Object obj2 = null;
                    int i9 = 0;
                    zzhac zzhacVar = null;
                    while (zzhdrVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzhdrVar.zzd();
                        if (zzd3 == 16) {
                            i9 = zzhdrVar.zzj();
                            obj2 = zzhazVar.zzd(zzhayVar, this.zza, i9);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzhazVar.zzg(zzhdrVar, obj2, zzhayVar, zzc2);
                            } else {
                                zzhacVar = zzhdrVar.zzp();
                            }
                        } else if (!zzhdrVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzhdrVar.zzd() == 12) {
                        if (zzhacVar != null) {
                            if (obj2 != null) {
                                zzhazVar.zzh(zzhacVar, obj2, zzhayVar, zzc2);
                            } else {
                                zzheqVar.zzk(zzc, i9, zzhacVar);
                            }
                        }
                    } else {
                        throw zzhcd.zzb();
                    }
                }
            } finally {
                zzheqVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzi(Object obj, byte[] bArr, int i9, int i10, zzgzn zzgznVar) throws IOException {
        zzhbo zzhboVar = (zzhbo) obj;
        if (zzhboVar.zzt == zzher.zzc()) {
            zzhboVar.zzt = zzher.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzj(Object obj, zzhfi zzhfiVar) throws IOException {
        Iterator zzg = this.zzd.zzb(obj).zzg();
        while (zzg.hasNext()) {
            Map.Entry entry = (Map.Entry) zzg.next();
            zzhbc zzhbcVar = (zzhbc) entry.getKey();
            if (zzhbcVar.zze() == zzhfh.MESSAGE && !zzhbcVar.zzg() && !zzhbcVar.zzf()) {
                if (entry instanceof zzhch) {
                    zzhfiVar.zzw(zzhbcVar.zza(), ((zzhch) entry).zza().zzb());
                } else {
                    zzhfiVar.zzw(zzhbcVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzheq zzheqVar = this.zzb;
        zzheqVar.zzp(zzheqVar.zzd(obj), zzhfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final boolean zzk(Object obj, Object obj2) {
        zzheq zzheqVar = this.zzb;
        if (!zzheqVar.zzd(obj).equals(zzheqVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzl();
    }
}
