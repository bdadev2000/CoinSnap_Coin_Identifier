package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdvh;

/* loaded from: classes2.dex */
public final class zzf extends QueryInfoGenerationCallback {
    private final zze zza;
    private final zzdvh zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();

    @Nullable
    private final Boolean zzf;

    public zzf(zze zzeVar, boolean z8, int i9, @Nullable Boolean bool, zzdvh zzdvhVar) {
        this.zza = zzeVar;
        this.zzc = z8;
        this.zzd = i9;
        this.zzf = bool;
        this.zzb = zzdvhVar;
    }

    private static long zza() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue() + com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        String str2;
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(zzb()));
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(this.zzd));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        if (true != this.zzc) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        zzp.zzd(this.zzb, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", str2));
        this.zza.zzf(this.zzc, new zzg(null, str, zza(), this.zzd));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzb()));
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(this.zzd));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        if (true != this.zzc) {
            str = "0";
        } else {
            str = "1";
        }
        zzp.zzd(this.zzb, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", str));
        this.zza.zzf(this.zzc, new zzg(queryInfo, "", zza(), this.zzd));
    }
}
