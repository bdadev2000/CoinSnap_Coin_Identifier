package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzeku implements zzehl {
    private static Bundle zzd(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        return new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        String optString = zzfgtVar.zzw.optString("pubid", "");
        zzfho zzfhoVar = zzfhfVar.zza.zza;
        zzfhm zzfhmVar = new zzfhm();
        zzfhmVar.zzq(zzfhoVar);
        zzfhmVar.zzt(optString);
        Bundle zzd = zzd(zzfhoVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfgtVar.zzw.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfgtVar.zzw.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfgtVar.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfgtVar.zzE.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfhoVar.zzd;
        Bundle bundle = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        String str2 = zzlVar.zzq;
        int i9 = zzlVar.zzd;
        boolean z8 = zzlVar.zzr;
        List list2 = zzlVar.zze;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        boolean z9 = zzlVar.zzf;
        int i10 = zzlVar.zzt;
        int i11 = zzlVar.zzg;
        String str3 = zzlVar.zzu;
        boolean z10 = zzlVar.zzh;
        List list3 = zzlVar.zzv;
        String str4 = zzlVar.zzi;
        int i12 = zzlVar.zzw;
        com.google.android.gms.ads.internal.client.zzfh zzfhVar = zzlVar.zzj;
        String str5 = zzlVar.zzx;
        zzfhmVar.zzH(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzd2, i9, list2, z9, i11, z10, str4, zzfhVar, zzlVar.zzk, zzlVar.zzl, zzd, bundle, list, str, str2, z8, zzcVar, i10, str3, list3, i12, str5, zzlVar.zzy, zzlVar.zzz));
        zzfho zzJ = zzfhmVar.zzJ();
        Bundle bundle2 = new Bundle();
        zzfgw zzfgwVar = zzfhfVar.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(zzfgwVar.zza));
        bundle3.putInt("refresh_interval", zzfgwVar.zzc);
        bundle3.putString("gws_query_id", zzfgwVar.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        zzfho zzfhoVar2 = zzfhfVar.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzfhoVar2.zzf);
        bundle4.putString("allocation_id", zzfgtVar.zzx);
        bundle4.putString("ad_source_name", zzfgtVar.zzG);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(zzfgtVar.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(zzfgtVar.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfgtVar.zzq));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(zzfgtVar.zzn));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(zzfgtVar.zzh));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(zzfgtVar.zzi));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(zzfgtVar.zzj));
        bundle4.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfgtVar.zzk);
        bundle4.putString("valid_from_timestamp", zzfgtVar.zzl);
        bundle4.putBoolean("is_closable_area_disabled", zzfgtVar.zzQ);
        bundle4.putString("recursive_server_response_data", zzfgtVar.zzap);
        if (zzfgtVar.zzm != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfgtVar.zzm.zzb);
            bundle5.putString("rb_type", zzfgtVar.zzm.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzJ, bundle2, zzfgtVar, zzfhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        if (!TextUtils.isEmpty(zzfgtVar.zzw.optString("pubid", ""))) {
            return true;
        }
        return false;
    }

    public abstract f4.c zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar);
}
