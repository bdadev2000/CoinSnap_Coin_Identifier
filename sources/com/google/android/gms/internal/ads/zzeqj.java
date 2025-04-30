package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzeqj implements zzexv {
    final zzfho zza;
    private final long zzb;

    public zzeqj(zzfho zzfhoVar, long j7) {
        Preconditions.checkNotNull(zzfhoVar, "the targeting must not be null");
        this.zza = zzfhoVar;
        this.zzb = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i9 = this.zza.zzo.zza;
        if (i9 != 0) {
            int i10 = i9 - 1;
            boolean z14 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb));
            if (zzlVar.zzb != -1) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzfic.zzf(bundle, "cust_age", format, z8);
            zzfic.zzb(bundle, "extras", zzlVar.zzc);
            int i11 = zzlVar.zzd;
            if (i11 != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            zzfic.zze(bundle, "cust_gender", i11, z9);
            zzfic.zzd(bundle, "kw", zzlVar.zze);
            int i12 = zzlVar.zzg;
            if (i12 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzfic.zze(bundle, "tag_for_child_directed_treatment", i12, z10);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzlVar.zzy);
            if (zzlVar.zza >= 2 && zzlVar.zzh) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzfic.zze(bundle, "d_imp_hdr", 1, z11);
            String str = zzlVar.zzi;
            if (zzlVar.zza >= 2 && !TextUtils.isEmpty(str)) {
                z12 = true;
            } else {
                z12 = false;
            }
            zzfic.zzf(bundle, "ppid", str, z12);
            Location location = zzlVar.zzk;
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
            zzfic.zzc(bundle, "url", zzlVar.zzl);
            zzfic.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
            zzfic.zzb(bundle, "custom_targeting", zzlVar.zzn);
            zzfic.zzd(bundle, "category_exclusions", zzlVar.zzo);
            zzfic.zzc(bundle, "request_agent", zzlVar.zzp);
            zzfic.zzc(bundle, "request_pkg", zzlVar.zzq);
            boolean z15 = zzlVar.zzr;
            if (zzlVar.zza >= 7) {
                z13 = true;
            } else {
                z13 = false;
            }
            zzfic.zzg(bundle, "is_designed_for_families", z15, z13);
            if (zzlVar.zza >= 8) {
                int i13 = zzlVar.zzt;
                if (i13 == -1) {
                    z14 = false;
                }
                zzfic.zze(bundle, "tag_for_under_age_of_consent", i13, z14);
                zzfic.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
