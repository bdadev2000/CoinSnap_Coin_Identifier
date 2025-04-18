package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class zzeik implements zzefb {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(zzfff zzfffVar, zzfet zzfetVar) {
        String optString = zzfetVar.zzv.optString("pubid", "");
        zzffo zzffoVar = zzfffVar.zza.zza;
        zzffm zzffmVar = new zzffm();
        zzffmVar.zzq(zzffoVar);
        zzffmVar.zzt(optString);
        Bundle zzd = zzd(zzffoVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfetVar.zzv.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfetVar.zzv.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfetVar.zzD.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfetVar.zzD.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzffoVar.zzd;
        zzffmVar.zzH(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, zzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz));
        zzffo zzJ = zzffmVar.zzJ();
        Bundle bundle = new Bundle();
        zzfew zzfewVar = zzfffVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfewVar.zza));
        bundle2.putInt("refresh_interval", zzfewVar.zzc);
        bundle2.putString("gws_query_id", zzfewVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        zzffo zzffoVar2 = zzfffVar.zza.zza;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", zzffoVar2.zzf);
        bundle3.putString("allocation_id", zzfetVar.zzw);
        bundle3.putString("ad_source_name", zzfetVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfetVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfetVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfetVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfetVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfetVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfetVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfetVar.zzi));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfetVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfetVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfetVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfetVar.zzao);
        if (zzfetVar.zzl != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfetVar.zzl.zzb);
            bundle4.putString("rb_type", zzfetVar.zzl.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzJ, bundle, zzfetVar, zzfffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        return !TextUtils.isEmpty(zzfetVar.zzv.optString("pubid", ""));
    }

    public abstract ua.b zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar);
}
