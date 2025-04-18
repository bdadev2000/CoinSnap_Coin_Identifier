package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzawi implements zzfsy {
    private final zzfrb zza;
    private final zzfrs zzb;
    private final zzawv zzc;
    private final zzawh zzd;
    private final zzavr zze;
    private final zzawx zzf;
    private final zzawp zzg;
    private final zzawg zzh;

    public zzawi(@NonNull zzfrb zzfrbVar, @NonNull zzfrs zzfrsVar, @NonNull zzawv zzawvVar, @NonNull zzawh zzawhVar, @Nullable zzavr zzavrVar, @Nullable zzawx zzawxVar, @Nullable zzawp zzawpVar, @Nullable zzawg zzawgVar) {
        this.zza = zzfrbVar;
        this.zzb = zzfrsVar;
        this.zzc = zzawvVar;
        this.zzd = zzawhVar;
        this.zze = zzavrVar;
        this.zzf = zzawxVar;
        this.zzg = zzawpVar;
        this.zzh = zzawgVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfrb zzfrbVar = this.zza;
        zzath zzb = this.zzb.zzb();
        hashMap.put("v", zzfrbVar.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put(ImpressionLog.w, zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzawp zzawpVar = this.zzg;
        if (zzawpVar != null) {
            hashMap.put("tcq", Long.valueOf(zzawpVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final Map zza() {
        zzawv zzawvVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzawvVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final Map zzb() {
        Map zze = zze();
        zzath zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzavr zzavrVar = this.zze;
        if (zzavrVar != null) {
            zze.put("nt", Long.valueOf(zzavrVar.zza()));
        }
        zzawx zzawxVar = this.zzf;
        if (zzawxVar != null) {
            zze.put("vs", Long.valueOf(zzawxVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    public final Map zzc() {
        zzawg zzawgVar = this.zzh;
        Map zze = zze();
        if (zzawgVar != null) {
            zze.put(ImpressionLog.B, zzawgVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
