package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzph;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkn extends zzmx {
    public zzkn(zznc zzncVar) {
        super(zzncVar);
    }

    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    public final boolean zzc() {
        return false;
    }

    public final byte[] zza(@NonNull zzbd zzbdVar, String str) {
        zznq zznqVar;
        Bundle bundle;
        zzfn.zzk.zza zzaVar;
        zzfn.zzj.zzb zzbVar;
        zzg zzgVar;
        byte[] bArr;
        long j7;
        zzaz zza;
        zzt();
        this.zzu.zzy();
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotEmpty(str);
        if (!zze().zze(str, zzbf.zzbg)) {
            zzj().zzc().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzbdVar.zza) && !"_iapx".equals(zzbdVar.zza)) {
            zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", str, zzbdVar.zza);
            return null;
        }
        zzfn.zzj.zzb zzb = zzfn.zzj.zzb();
        zzh().zzp();
        try {
            zzg zze = zzh().zze(str);
            if (zze == null) {
                zzj().zzc().zza("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zze.zzar()) {
                zzj().zzc().zza("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzfn.zzk.zza zzp = zzfn.zzk.zzw().zzh(1).zzp("android");
            if (!TextUtils.isEmpty(zze.zzac())) {
                zzp.zzb(zze.zzac());
            }
            if (!TextUtils.isEmpty(zze.zzae())) {
                zzp.zzd((String) Preconditions.checkNotNull(zze.zzae()));
            }
            if (!TextUtils.isEmpty(zze.zzaf())) {
                zzp.zze((String) Preconditions.checkNotNull(zze.zzaf()));
            }
            if (zze.zze() != -2147483648L) {
                zzp.zze((int) zze.zze());
            }
            zzp.zzf(zze.zzq()).zzd(zze.zzo());
            String zzah = zze.zzah();
            String zzaa = zze.zzaa();
            if (!TextUtils.isEmpty(zzah)) {
                zzp.zzm(zzah);
            } else if (!TextUtils.isEmpty(zzaa)) {
                zzp.zza(zzaa);
            }
            zzp.zzj(zze.zzw());
            zzin zzb2 = this.zzf.zzb(str);
            zzp.zzc(zze.zzn());
            if (this.zzu.zzac() && zze().zzj(zzp.zzt()) && zzb2.zzi() && !TextUtils.isEmpty(null)) {
                zzp.zzj((String) null);
            }
            zzp.zzg(zzb2.zzg());
            if (zzb2.zzi() && zze.zzaq()) {
                Pair<String, Boolean> zza2 = zzn().zza(zze.zzac(), zzb2);
                if (zze.zzaq() && zza2 != null && !TextUtils.isEmpty((CharSequence) zza2.first)) {
                    zzp.zzq(zza((String) zza2.first, Long.toString(zzbdVar.zzd)));
                    Object obj = zza2.second;
                    if (obj != null) {
                        zzp.zzc(((Boolean) obj).booleanValue());
                    }
                }
            }
            zzf().zzac();
            zzfn.zzk.zza zzi = zzp.zzi(Build.MODEL);
            zzf().zzac();
            zzi.zzo(Build.VERSION.RELEASE).zzj((int) zzf().zzg()).zzs(zzf().zzh());
            if (zzb2.zzj() && zze.zzad() != null) {
                zzp.zzc(zza((String) Preconditions.checkNotNull(zze.zzad()), Long.toString(zzbdVar.zzd)));
            }
            if (!TextUtils.isEmpty(zze.zzag())) {
                zzp.zzl((String) Preconditions.checkNotNull(zze.zzag()));
            }
            String zzac = zze.zzac();
            List<zznq> zzk = zzh().zzk(zzac);
            Iterator<zznq> it = zzk.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zznqVar = null;
                    break;
                }
                zznqVar = it.next();
                if ("_lte".equals(zznqVar.zzc)) {
                    break;
                }
            }
            if (zznqVar == null || zznqVar.zze == null) {
                zznq zznqVar2 = new zznq(zzac, "auto", "_lte", zzb().currentTimeMillis(), 0L);
                zzk.add(zznqVar2);
                zzh().zza(zznqVar2);
            }
            zzfn.zzo[] zzoVarArr = new zzfn.zzo[zzk.size()];
            for (int i9 = 0; i9 < zzk.size(); i9++) {
                zzfn.zzo.zza zzb3 = zzfn.zzo.zze().zza(zzk.get(i9).zzc).zzb(zzk.get(i9).zzd);
                g_().zza(zzb3, zzk.get(i9).zze);
                zzoVarArr[i9] = (zzfn.zzo) ((com.google.android.gms.internal.measurement.zzjk) zzb3.zzai());
            }
            zzp.zze(Arrays.asList(zzoVarArr));
            g_().zza(zzp);
            this.zzf.zza(zze, zzp);
            if (zzoj.zza() && zze().zza(zzbf.zzcm)) {
                this.zzf.zzb(zze, zzp);
            }
            zzga zza3 = zzga.zza(zzbdVar);
            zzq().zza(zza3.zzb, zzh().zzd(str));
            zzq().zza(zza3, zze().zzb(str));
            Bundle bundle2 = zza3.zzb;
            bundle2.putLong("_c", 1L);
            zzj().zzc().zza("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", zzbdVar.zzc);
            if (zzq().zzd(zzp.zzt(), zze.zzam())) {
                zzq().zza(bundle2, "_dbg", (Object) 1L);
                zzq().zza(bundle2, "_r", (Object) 1L);
            }
            zzaz zzd = zzh().zzd(str, zzbdVar.zza);
            if (zzd == null) {
                bundle = bundle2;
                zzaVar = zzp;
                zzbVar = zzb;
                zzgVar = zze;
                bArr = null;
                zza = new zzaz(str, zzbdVar.zza, 0L, 0L, zzbdVar.zzd, 0L, null, null, null, null);
                j7 = 0;
            } else {
                bundle = bundle2;
                zzaVar = zzp;
                zzbVar = zzb;
                zzgVar = zze;
                bArr = null;
                j7 = zzd.zzf;
                zza = zzd.zza(zzbdVar.zzd);
            }
            zzh().zza(zza);
            zzba zzbaVar = new zzba(this.zzu, zzbdVar.zzc, str, zzbdVar.zza, zzbdVar.zzd, j7, bundle);
            zzfn.zzf.zza zza4 = zzfn.zzf.zze().zzb(zzbaVar.zzc).zza(zzbaVar.zzb).zza(zzbaVar.zzd);
            Iterator<String> it2 = zzbaVar.zze.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                zzfn.zzh.zza zza5 = zzfn.zzh.zze().zza(next);
                Object zzc = zzbaVar.zze.zzc(next);
                if (zzc != null) {
                    g_().zza(zza5, zzc);
                    zza4.zza(zza5);
                }
            }
            zzfn.zzk.zza zzaVar2 = zzaVar;
            zzaVar2.zza(zza4).zza(zzfn.zzl.zza().zza(zzfn.zzg.zza().zza(zza.zzc).zza(zzbdVar.zza)));
            zzaVar2.zza(zzg().zza(zzgVar.zzac(), Collections.emptyList(), zzaVar2.zzab(), Long.valueOf(zza4.zzc()), Long.valueOf(zza4.zzc())));
            if (zza4.zzg()) {
                zzaVar2.zzi(zza4.zzc()).zze(zza4.zzc());
            }
            long zzs = zzgVar.zzs();
            if (zzs != 0) {
                zzaVar2.zzg(zzs);
            }
            long zzu = zzgVar.zzu();
            if (zzu != 0) {
                zzaVar2.zzh(zzu);
            } else if (zzs != 0) {
                zzaVar2.zzh(zzs);
            }
            String zzal = zzgVar.zzal();
            if (zzph.zza() && zze().zze(str, zzbf.zzbr) && zzal != null) {
                zzaVar2.zzr(zzal);
            }
            zzgVar.zzap();
            zzaVar2.zzf((int) zzgVar.zzt()).zzl(97001L).zzk(zzb().currentTimeMillis()).zzd(true);
            this.zzf.zza(zzaVar2.zzt(), zzaVar2);
            zzfn.zzj.zzb zzbVar2 = zzbVar;
            zzbVar2.zza(zzaVar2);
            zzg zzgVar2 = zzgVar;
            zzgVar2.zzr(zzaVar2.zzf());
            zzgVar2.zzp(zzaVar2.zze());
            zzh().zza(zzgVar2, false, false);
            zzh().zzw();
            try {
                return g_().zzb(((zzfn.zzj) ((com.google.android.gms.internal.measurement.zzjk) zzbVar2.zzai())).zzbz());
            } catch (IOException e4) {
                zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzfw.zza(str), e4);
                return bArr;
            }
        } catch (SecurityException e9) {
            zzj().zzc().zza("Resettable device id encryption failed", e9.getMessage());
            return new byte[0];
        } catch (SecurityException e10) {
            zzj().zzc().zza("app instance id encryption failed", e10.getMessage());
            return new byte[0];
        } finally {
            zzh().zzu();
        }
    }
}
