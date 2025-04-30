package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class zzfjd implements zzfjc {
    private final ConcurrentHashMap zza;
    private final zzfjj zzb;
    private final zzfjf zzc = new zzfjf();

    public zzfjd(zzfjj zzfjjVar) {
        this.zza = new ConcurrentHashMap(zzfjjVar.zzd);
        this.zzb = zzfjjVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfjj> creator = zzfjj.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgB)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i9 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i9++;
                sb.append(i9);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfjm) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i10 = 0; i10 < ((zzfjb) entry.getValue()).zzb(); i10++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfjb) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfjb) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i9 < this.zzb.zzc) {
                i9++;
                sb.append(i9);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    public final zzfjj zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    @Nullable
    public final synchronized zzfjl zzb(zzfjm zzfjmVar) {
        zzfjl zzfjlVar;
        try {
            zzfjb zzfjbVar = (zzfjb) this.zza.get(zzfjmVar);
            if (zzfjbVar != null) {
                zzfjlVar = zzfjbVar.zze();
                if (zzfjlVar == null) {
                    this.zzc.zze();
                }
                zzfjz zzf = zzfjbVar.zzf();
                if (zzfjlVar != null) {
                    zzbdv.zzb.zzc zzd = zzbdv.zzb.zzd();
                    zzbdv.zzb.zza.C0132zza zza = zzbdv.zzb.zza.zza();
                    zza.zzf(zzbdv.zzb.zzd.IN_MEMORY);
                    zzbdv.zzb.zze.zza zzc = zzbdv.zzb.zze.zzc();
                    zzc.zzd(zzf.zza);
                    zzc.zze(zzf.zzb);
                    zza.zzg(zzc);
                    zzd.zzd(zza);
                    zzfjlVar.zza.zzb().zzc().zzi(zzd.zzbr());
                }
                zzf();
            } else {
                this.zzc.zzf();
                zzf();
                zzfjlVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    @Deprecated
    public final zzfjm zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfjn(zzlVar, str, new zzbxy(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    public final synchronized boolean zzd(zzfjm zzfjmVar, zzfjl zzfjlVar) {
        boolean zzh;
        try {
            zzfjb zzfjbVar = (zzfjb) this.zza.get(zzfjmVar);
            zzfjlVar.zzd = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (zzfjbVar == null) {
                zzfjj zzfjjVar = this.zzb;
                zzfjb zzfjbVar2 = new zzfjb(zzfjjVar.zzd, zzfjjVar.zze * 1000);
                if (this.zza.size() == this.zzb.zzc) {
                    int i9 = this.zzb.zzg;
                    int i10 = i9 - 1;
                    zzfjm zzfjmVar2 = null;
                    if (i9 != 0) {
                        long j7 = Long.MAX_VALUE;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    int i11 = Integer.MAX_VALUE;
                                    for (Map.Entry entry : this.zza.entrySet()) {
                                        if (((zzfjb) entry.getValue()).zza() < i11) {
                                            i11 = ((zzfjb) entry.getValue()).zza();
                                            zzfjmVar2 = (zzfjm) entry.getKey();
                                        }
                                    }
                                    if (zzfjmVar2 != null) {
                                        this.zza.remove(zzfjmVar2);
                                    }
                                }
                            } else {
                                for (Map.Entry entry2 : this.zza.entrySet()) {
                                    if (((zzfjb) entry2.getValue()).zzd() < j7) {
                                        j7 = ((zzfjb) entry2.getValue()).zzd();
                                        zzfjmVar2 = (zzfjm) entry2.getKey();
                                    }
                                }
                                if (zzfjmVar2 != null) {
                                    this.zza.remove(zzfjmVar2);
                                }
                            }
                        } else {
                            for (Map.Entry entry3 : this.zza.entrySet()) {
                                if (((zzfjb) entry3.getValue()).zzc() < j7) {
                                    j7 = ((zzfjb) entry3.getValue()).zzc();
                                    zzfjmVar2 = (zzfjm) entry3.getKey();
                                }
                            }
                            if (zzfjmVar2 != null) {
                                this.zza.remove(zzfjmVar2);
                            }
                        }
                        this.zzc.zzg();
                    } else {
                        throw null;
                    }
                }
                this.zza.put(zzfjmVar, zzfjbVar2);
                this.zzc.zzd();
                zzfjbVar = zzfjbVar2;
            }
            zzh = zzfjbVar.zzh(zzfjlVar);
            this.zzc.zzc();
            zzfje zza = this.zzc.zza();
            zzfjz zzf = zzfjbVar.zzf();
            zzbdv.zzb.zzc zzd = zzbdv.zzb.zzd();
            zzbdv.zzb.zza.C0132zza zza2 = zzbdv.zzb.zza.zza();
            zza2.zzf(zzbdv.zzb.zzd.IN_MEMORY);
            zzbdv.zzb.zzg.zza zzc = zzbdv.zzb.zzg.zzc();
            zzc.zze(zza.zza);
            zzc.zzf(zza.zzb);
            zzc.zzg(zzf.zzb);
            zza2.zzi(zzc);
            zzd.zzd(zza2);
            zzfjlVar.zza.zzb().zzc().zzj(zzd.zzbr());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfjc
    public final synchronized boolean zze(zzfjm zzfjmVar) {
        zzfjb zzfjbVar = (zzfjb) this.zza.get(zzfjmVar);
        if (zzfjbVar == null) {
            return true;
        }
        zzfjj zzfjjVar = this.zzb;
        if (zzfjbVar.zzb() < zzfjjVar.zzd) {
            return true;
        }
        return false;
    }
}
