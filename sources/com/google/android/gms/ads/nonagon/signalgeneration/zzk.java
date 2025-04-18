package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzdui;

/* loaded from: classes4.dex */
public final class zzk extends QueryInfoGenerationCallback {
    private final zzj zza;
    private final zzdui zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();

    @Nullable
    private final Boolean zzf;

    public zzk(zzj zzjVar, boolean z2, int i2, @Nullable Boolean bool, zzdui zzduiVar) {
        this.zza = zzjVar;
        this.zzc = z2;
        this.zzd = i2;
        this.zzf = bool;
        this.zzb = zzduiVar;
    }

    private static long zza() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjx)).longValue() + com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        pairArr[5] = new Pair("lat_ms", Long.toString(zzb()));
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(this.zzd));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        pairArr[8] = new Pair("tpc", true != this.zzc ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzv.zzd(this.zzb, null, "sgpcf", pairArr);
        this.zza.zzf(this.zzc, new zzl(null, str, zza(), this.zzd));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        pairArr[4] = new Pair("lat_ms", Long.toString(zzb()));
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(this.zzd));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        pairArr[7] = new Pair("tpc", true != this.zzc ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzv.zzd(this.zzb, null, "sgpcs", pairArr);
        this.zza.zzf(this.zzc, new zzl(queryInfo, "", zza(), this.zzd));
    }
}
