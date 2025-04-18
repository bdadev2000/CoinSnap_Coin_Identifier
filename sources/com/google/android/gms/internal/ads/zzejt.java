package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class zzejt implements zzegk {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(zzfgt zzfgtVar, zzfgh zzfghVar) {
        String optString = zzfghVar.zzv.optString("pubid", "");
        zzfhc zzfhcVar = zzfgtVar.zza.zza;
        zzfha zzfhaVar = new zzfha();
        zzfhaVar.zzq(zzfhcVar);
        zzfhaVar.zzt(optString);
        Bundle zzd = zzd(zzfhcVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfghVar.zzv.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfghVar.zzv.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfghVar.zzD.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfghVar.zzD.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfhcVar.zzd;
        zzfhaVar.zzH(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, zzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz));
        zzfhc zzJ = zzfhaVar.zzJ();
        Bundle bundle = new Bundle();
        zzfgk zzfgkVar = zzfgtVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfgkVar.zza));
        bundle2.putInt("refresh_interval", zzfgkVar.zzc);
        bundle2.putString("gws_query_id", zzfgkVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        zzfhc zzfhcVar2 = zzfgtVar.zza.zza;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", zzfhcVar2.zzf);
        bundle3.putString("allocation_id", zzfghVar.zzw);
        bundle3.putString("ad_source_name", zzfghVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfghVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfghVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfghVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfghVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfghVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfghVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfghVar.zzi));
        bundle3.putString("transaction_id", zzfghVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfghVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfghVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfghVar.zzao);
        if (zzfghVar.zzl != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfghVar.zzl.zzb);
            bundle4.putString("rb_type", zzfghVar.zzl.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzJ, bundle, zzfghVar, zzfgtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        return !TextUtils.isEmpty(zzfghVar.zzv.optString("pubid", ""));
    }

    public abstract ListenableFuture zzc(zzfhc zzfhcVar, Bundle bundle, zzfgh zzfghVar, zzfgt zzfgtVar);
}
