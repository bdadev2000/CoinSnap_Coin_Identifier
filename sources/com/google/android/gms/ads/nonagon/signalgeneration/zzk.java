package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzdsr;

/* loaded from: classes3.dex */
public final class zzk extends QueryInfoGenerationCallback {
    private final zzj zza;
    private final zzdsr zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();

    @Nullable
    private final Boolean zzf;

    public zzk(zzj zzjVar, boolean z10, int i10, @Nullable Boolean bool, zzdsr zzdsrVar) {
        this.zza = zzjVar;
        this.zzc = z10;
        this.zzd = i10;
        this.zzf = bool;
        this.zzb = zzdsrVar;
    }

    private static long zza() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjz)).longValue() + com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        String str2;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", "true");
        pairArr[5] = new Pair("lat_ms", Long.toString(zzb()));
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(this.zzd));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        if (true != this.zzc) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        pairArr[8] = new Pair("tpc", str2);
        zzv.zzd(this.zzb, null, "sgpcf", pairArr);
        this.zza.zzf(this.zzc, new zzl(null, str, zza(), this.zzd));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(zzb()));
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(this.zzd));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        if (true != this.zzc) {
            str = "0";
        } else {
            str = "1";
        }
        pairArr[7] = new Pair("tpc", str);
        zzv.zzd(this.zzb, null, "sgpcs", pairArr);
        this.zza.zzf(this.zzc, new zzl(queryInfo, "", zza(), this.zzd));
    }
}
