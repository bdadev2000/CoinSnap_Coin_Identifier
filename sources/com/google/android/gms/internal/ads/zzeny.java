package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzeny implements zzevy {
    final zzffo zza;
    private final long zzb;

    public zzeny(zzffo zzffoVar, long j3) {
        Preconditions.checkNotNull(zzffoVar, "the targeting must not be null");
        this.zza = zzffoVar;
        this.zzb = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i10 = this.zza.zzo.zza;
        if (i10 != 0) {
            int i11 = i10 - 1;
            boolean z16 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfgc.zzg(bundle, "is_sdk_preload", true, zzmVar.zzb());
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzmVar.zzb));
            if (zzmVar.zzb != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzfgc.zzf(bundle, "cust_age", format, z10);
            zzfgc.zzb(bundle, "extras", zzmVar.zzc);
            int i12 = zzmVar.zzd;
            if (i12 != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzfgc.zze(bundle, "cust_gender", i12, z11);
            zzfgc.zzd(bundle, "kw", zzmVar.zze);
            int i13 = zzmVar.zzg;
            if (i13 != -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            zzfgc.zze(bundle, "tag_for_child_directed_treatment", i13, z12);
            if (zzmVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzmVar.zzy);
            if (zzmVar.zza >= 2 && zzmVar.zzh) {
                z13 = true;
            } else {
                z13 = false;
            }
            zzfgc.zze(bundle, "d_imp_hdr", 1, z13);
            String str = zzmVar.zzi;
            if (zzmVar.zza >= 2 && !TextUtils.isEmpty(str)) {
                z14 = true;
            } else {
                z14 = false;
            }
            zzfgc.zzf(bundle, "ppid", str, z14);
            Location location = zzmVar.zzk;
            if (location != null) {
                float accuracy = location.getAccuracy() * 1000.0f;
                long time = location.getTime() * 1000;
                double latitude = location.getLatitude() * 1.0E7d;
                double longitude = 1.0E7d * location.getLongitude();
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy);
                bundle2.putLong("lat", (long) latitude);
                bundle2.putLong(Constants.LONG, (long) longitude);
                bundle2.putLong("time", time);
                bundle.putBundle("uule", bundle2);
            }
            zzfgc.zzc(bundle, "url", zzmVar.zzl);
            zzfgc.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
            zzfgc.zzb(bundle, "custom_targeting", zzmVar.zzn);
            zzfgc.zzd(bundle, "category_exclusions", zzmVar.zzo);
            zzfgc.zzc(bundle, "request_agent", zzmVar.zzp);
            zzfgc.zzc(bundle, "request_pkg", zzmVar.zzq);
            boolean z17 = zzmVar.zzr;
            if (zzmVar.zza >= 7) {
                z15 = true;
            } else {
                z15 = false;
            }
            zzfgc.zzg(bundle, "is_designed_for_families", z17, z15);
            if (zzmVar.zza >= 8) {
                int i14 = zzmVar.zzt;
                if (i14 == -1) {
                    z16 = false;
                }
                zzfgc.zze(bundle, "tag_for_under_age_of_consent", i14, z16);
                zzfgc.zzc(bundle, "max_ad_content_rating", zzmVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
