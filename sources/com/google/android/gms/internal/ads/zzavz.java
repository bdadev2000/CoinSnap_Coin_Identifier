package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzavz implements zzfro {
    private final zzfpr zza;
    private final zzfqi zzb;
    private final zzawm zzc;
    private final zzavy zzd;
    private final zzavi zze;
    private final zzawo zzf;
    private final zzawg zzg;
    private final zzavx zzh;

    public zzavz(@NonNull zzfpr zzfprVar, @NonNull zzfqi zzfqiVar, @NonNull zzawm zzawmVar, @NonNull zzavy zzavyVar, @Nullable zzavi zzaviVar, @Nullable zzawo zzawoVar, @Nullable zzawg zzawgVar, @Nullable zzavx zzavxVar) {
        this.zza = zzfprVar;
        this.zzb = zzfqiVar;
        this.zzc = zzawmVar;
        this.zzd = zzavyVar;
        this.zze = zzaviVar;
        this.zzf = zzawoVar;
        this.zzg = zzawgVar;
        this.zzh = zzavxVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfpr zzfprVar = this.zza;
        zzata zzb = this.zzb.zzb();
        hashMap.put("v", zzfprVar.zzd());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzg()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("attts", Long.valueOf(zzb.zzf().zza()));
        hashMap.put("att", zzb.zzf().zzd());
        hashMap.put("attkid", zzb.zzf().zzf());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzawg zzawgVar = this.zzg;
        if (zzawgVar != null) {
            hashMap.put("tcq", Long.valueOf(zzawgVar.zzc()));
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

    @Override // com.google.android.gms.internal.ads.zzfro
    public final Map zza() {
        zzawm zzawmVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzawmVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final Map zzb() {
        Map zze = zze();
        zzata zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzh()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzavi zzaviVar = this.zze;
        if (zzaviVar != null) {
            zze.put("nt", Long.valueOf(zzaviVar.zza()));
        }
        zzawo zzawoVar = this.zzf;
        if (zzawoVar != null) {
            zze.put("vs", Long.valueOf(zzawoVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final Map zzc() {
        zzavx zzavxVar = this.zzh;
        Map zze = zze();
        if (zzavxVar != null) {
            zze.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, zzavxVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
