package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaxy implements zzfth {
    private final zzfrg zza;
    private final zzfrx zzb;
    private final zzayl zzc;
    private final zzaxx zzd;
    private final zzaxh zze;
    private final zzayn zzf;
    private final zzayf zzg;
    private final zzaxw zzh;

    public zzaxy(@NonNull zzfrg zzfrgVar, @NonNull zzfrx zzfrxVar, @NonNull zzayl zzaylVar, @NonNull zzaxx zzaxxVar, @Nullable zzaxh zzaxhVar, @Nullable zzayn zzaynVar, @Nullable zzayf zzayfVar, @Nullable zzaxw zzaxwVar) {
        this.zza = zzfrgVar;
        this.zzb = zzfrxVar;
        this.zzc = zzaylVar;
        this.zzd = zzaxxVar;
        this.zze = zzaxhVar;
        this.zzf = zzaynVar;
        this.zzg = zzayfVar;
        this.zzh = zzaxwVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfrg zzfrgVar = this.zza;
        zzaus zzb = this.zzb.zzb();
        hashMap.put("v", zzfrgVar.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzi());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzayf zzayfVar = this.zzg;
        if (zzayfVar != null) {
            hashMap.put("tcq", Long.valueOf(zzayfVar.zzc()));
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

    @Override // com.google.android.gms.internal.ads.zzfth
    public final Map zza() {
        zzayl zzaylVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzaylVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final Map zzb() {
        zzfrg zzfrgVar = this.zza;
        zzfrx zzfrxVar = this.zzb;
        Map zze = zze();
        zzaus zza = zzfrxVar.zza();
        zze.put("gai", Boolean.valueOf(zzfrgVar.zzd()));
        zze.put("did", zza.zzh());
        zze.put("dst", Integer.valueOf(zza.zzc().zza()));
        zze.put("doo", Boolean.valueOf(zza.zzaq()));
        zzaxh zzaxhVar = this.zze;
        if (zzaxhVar != null) {
            zze.put("nt", Long.valueOf(zzaxhVar.zza()));
        }
        zzayn zzaynVar = this.zzf;
        if (zzaynVar != null) {
            zze.put("vs", Long.valueOf(zzaynVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final Map zzc() {
        zzaxw zzaxwVar = this.zzh;
        Map zze = zze();
        if (zzaxwVar != null) {
            zze.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, zzaxwVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
