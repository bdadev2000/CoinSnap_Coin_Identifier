package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzbcb;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
final class zzfir implements zzfiq {
    private final ConcurrentHashMap zza;
    private final zzfix zzb;
    private final zzfit zzc = new zzfit();

    public zzfir(zzfix zzfixVar) {
        this.zza = new ConcurrentHashMap(zzfixVar.zzd);
        this.zzb = zzfixVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfix> creator = zzfix.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgd)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i2 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i2++;
                sb.append(i2);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfja) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i3 = 0; i3 < ((zzfip) entry.getValue()).zzb(); i3++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfip) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfip) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i2 < this.zzb.zzc) {
                i2++;
                sb.append(i2);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final zzfix zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    @Nullable
    public final synchronized zzfiz zzb(zzfja zzfjaVar) {
        zzfiz zzfizVar;
        try {
            zzfip zzfipVar = (zzfip) this.zza.get(zzfjaVar);
            if (zzfipVar != null) {
                zzfizVar = zzfipVar.zze();
                if (zzfizVar == null) {
                    this.zzc.zze();
                }
                zzfjn zzf = zzfipVar.zzf();
                if (zzfizVar != null) {
                    zzbcb.zzb.zzc zzd = zzbcb.zzb.zzd();
                    zzbcb.zzb.zza.C0125zza zza = zzbcb.zzb.zza.zza();
                    zza.zzf(zzbcb.zzb.zzd.IN_MEMORY);
                    zzbcb.zzb.zze.zza zzc = zzbcb.zzb.zze.zzc();
                    zzc.zzd(zzf.zza);
                    zzc.zze(zzf.zzb);
                    zza.zzg(zzc);
                    zzd.zzd(zza);
                    zzfizVar.zza.zzb().zzc().zzi(zzd.zzbr());
                }
                zzf();
            } else {
                this.zzc.zzf();
                zzf();
                zzfizVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    @Deprecated
    public final zzfja zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzy zzyVar) {
        return new zzfjb(zzmVar, str, new zzbwd(this.zzb.zza).zza().zzj, this.zzb.zzf, zzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final synchronized boolean zzd(zzfja zzfjaVar, zzfiz zzfizVar) {
        boolean zzh;
        try {
            zzfip zzfipVar = (zzfip) this.zza.get(zzfjaVar);
            zzfizVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (zzfipVar == null) {
                zzfix zzfixVar = this.zzb;
                zzfip zzfipVar2 = new zzfip(zzfixVar.zzd, zzfixVar.zze * 1000);
                if (this.zza.size() == this.zzb.zzc) {
                    int i2 = this.zzb.zzg;
                    int i3 = i2 - 1;
                    zzfja zzfjaVar2 = null;
                    if (i2 == 0) {
                        throw null;
                    }
                    long j2 = Long.MAX_VALUE;
                    if (i3 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfip) entry.getValue()).zzc() < j2) {
                                j2 = ((zzfip) entry.getValue()).zzc();
                                zzfjaVar2 = (zzfja) entry.getKey();
                            }
                        }
                        if (zzfjaVar2 != null) {
                            this.zza.remove(zzfjaVar2);
                        }
                    } else if (i3 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfip) entry2.getValue()).zzd() < j2) {
                                j2 = ((zzfip) entry2.getValue()).zzd();
                                zzfjaVar2 = (zzfja) entry2.getKey();
                            }
                        }
                        if (zzfjaVar2 != null) {
                            this.zza.remove(zzfjaVar2);
                        }
                    } else if (i3 == 2) {
                        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfip) entry3.getValue()).zza() < i4) {
                                i4 = ((zzfip) entry3.getValue()).zza();
                                zzfjaVar2 = (zzfja) entry3.getKey();
                            }
                        }
                        if (zzfjaVar2 != null) {
                            this.zza.remove(zzfjaVar2);
                        }
                    }
                    this.zzc.zzg();
                }
                this.zza.put(zzfjaVar, zzfipVar2);
                this.zzc.zzd();
                zzfipVar = zzfipVar2;
            }
            zzh = zzfipVar.zzh(zzfizVar);
            this.zzc.zzc();
            zzfis zza = this.zzc.zza();
            zzfjn zzf = zzfipVar.zzf();
            zzbcb.zzb.zzc zzd = zzbcb.zzb.zzd();
            zzbcb.zzb.zza.C0125zza zza2 = zzbcb.zzb.zza.zza();
            zza2.zzf(zzbcb.zzb.zzd.IN_MEMORY);
            zzbcb.zzb.zzg.zza zzc = zzbcb.zzb.zzg.zzc();
            zzc.zze(zza.zza);
            zzc.zzf(zza.zzb);
            zzc.zzg(zzf.zzb);
            zza2.zzi(zzc);
            zzd.zzd(zza2);
            zzfizVar.zza.zzb().zzc().zzj(zzd.zzbr());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final synchronized boolean zze(zzfja zzfjaVar) {
        zzfip zzfipVar = (zzfip) this.zza.get(zzfjaVar);
        if (zzfipVar == null) {
            return true;
        }
        return zzfipVar.zzb() < this.zzb.zzd;
    }
}
