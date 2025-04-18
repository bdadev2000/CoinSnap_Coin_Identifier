package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzhjb;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzo implements zzbdr {
    final /* synthetic */ zzbds zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzo(zzt zztVar, zzbds zzbdsVar, Context context, Uri uri) {
        this.zza = zzbdsVar;
        this.zzb = context;
        this.zzc = uri;
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p02, Context p12, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, g.f30053h);
        p02.launchUrl(p12, p2);
    }

    @Override // com.google.android.gms.internal.ads.zzbdr
    public final void zza() {
        CustomTabsIntent a2 = new CustomTabsIntent.Builder(this.zza.zza()).a();
        a2.intent.setPackage(zzhjb.zza(this.zzb));
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a2, this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
