package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzna extends zzmy {
    public zzna(zznc zzncVar) {
        super(zzncVar);
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

    private final String zzb(String str) {
        String zzf = zzm().zzf(str);
        if (!TextUtils.isEmpty(zzf)) {
            Uri parse = Uri.parse(zzbf.zzq.zza(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(zzf + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return zzbf.zzq.zza(null);
    }

    public final zzmz zza(String str) {
        zzg zze;
        if (zzpn.zza() && zze().zza(zzbf.zzbs)) {
            zzq();
            if (zznp.zzf(str)) {
                zzj().zzp().zza("sgtm feature flag enabled.");
                zzg zze2 = zzh().zze(str);
                if (zze2 == null) {
                    return new zzmz(zzb(str), 1);
                }
                String zzad = zze2.zzad();
                zzfi.zzd zzc = zzm().zzc(str);
                if (zzc != null && (zze = zzh().zze(str)) != null && ((zzc.zzr() && zzc.zzh().zza() == 100) || zzq().zzd(str, zze.zzam()) || (!TextUtils.isEmpty(zzad) && zzad.hashCode() % 100 < zzc.zzh().zza()))) {
                    zzmz zzmzVar = null;
                    if (zze2.zzat()) {
                        zzj().zzp().zza("sgtm upload enabled in manifest.");
                        zzfi.zzd zzc2 = zzm().zzc(zze2.zzac());
                        if (zzc2 != null && zzc2.zzr()) {
                            String zze3 = zzc2.zzh().zze();
                            if (!TextUtils.isEmpty(zze3)) {
                                String zzd = zzc2.zzh().zzd();
                                zzj().zzp().zza("sgtm configured with upload_url, server_info", zze3, TextUtils.isEmpty(zzd) ? "Y" : "N");
                                if (TextUtils.isEmpty(zzd)) {
                                    zzmzVar = new zzmz(zze3, 3);
                                } else {
                                    HashMap m = L.m("x-sgtm-server-info", zzd);
                                    if (!TextUtils.isEmpty(zze2.zzam())) {
                                        m.put("x-gtm-server-preview", zze2.zzam());
                                    }
                                    zzmzVar = new zzmz(zze3, m, 3);
                                }
                            }
                        }
                    }
                    if (zzmzVar != null) {
                        return zzmzVar;
                    }
                } else {
                    return new zzmz(zzb(str), 1);
                }
            }
        }
        return new zzmz(zzb(str), 1);
    }
}
