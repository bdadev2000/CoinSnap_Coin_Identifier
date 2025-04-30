package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzmc extends zzmx {
    public final zzgm zza;
    public final zzgm zzb;
    public final zzgm zzc;
    public final zzgm zzd;
    public final zzgm zze;
    private final Map<String, zzmb> zzg;

    public zzmc(zznc zzncVar) {
        super(zzncVar);
        this.zzg = new HashMap();
        zzgh zzk = zzk();
        Objects.requireNonNull(zzk);
        this.zza = new zzgm(zzk, "last_delete_stale", 0L);
        zzgh zzk2 = zzk();
        Objects.requireNonNull(zzk2);
        this.zzb = new zzgm(zzk2, "backoff", 0L);
        zzgh zzk3 = zzk();
        Objects.requireNonNull(zzk3);
        this.zzc = new zzgm(zzk3, "last_upload", 0L);
        zzgh zzk4 = zzk();
        Objects.requireNonNull(zzk4);
        this.zzd = new zzgm(zzk4, "last_upload_attempt", 0L);
        zzgh zzk5 = zzk();
        Objects.requireNonNull(zzk5);
        this.zze = new zzgm(zzk5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zznl g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzgt zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzmc zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzna zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Deprecated
    private final Pair<String, Boolean> zza(String str) {
        zzmb zzmbVar;
        AdvertisingIdClient.Info info;
        zzt();
        long elapsedRealtime = zzb().elapsedRealtime();
        zzmb zzmbVar2 = this.zzg.get(str);
        if (zzmbVar2 != null && elapsedRealtime < zzmbVar2.zzc) {
            return new Pair<>(zzmbVar2.zza, Boolean.valueOf(zzmbVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long zzd = zze().zzd(str) + elapsedRealtime;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (zzmbVar2 != null && elapsedRealtime < zzmbVar2.zzc + zze().zzc(str, zzbf.zzb)) {
                    return new Pair<>(zzmbVar2.zza, Boolean.valueOf(zzmbVar2.zzb));
                }
                info = null;
            }
        } catch (Exception e4) {
            zzj().zzc().zza("Unable to get advertising id", e4);
            zzmbVar = new zzmb("", false, zzd);
        }
        if (info == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = info.getId();
        if (id != null) {
            zzmbVar = new zzmb(id, info.isLimitAdTrackingEnabled(), zzd);
        } else {
            zzmbVar = new zzmb("", info.isLimitAdTrackingEnabled(), zzd);
        }
        this.zzg.put(str, zzmbVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(zzmbVar.zza, Boolean.valueOf(zzmbVar.zzb));
    }

    public final Pair<String, Boolean> zza(String str, zzin zzinVar) {
        if (zzinVar.zzi()) {
            return zza(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    public final String zza(String str, boolean z8) {
        String str2;
        zzt();
        if (z8) {
            str2 = (String) zza(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest zzu = zznp.zzu();
        if (zzu == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzu.digest(str2.getBytes())));
    }
}
