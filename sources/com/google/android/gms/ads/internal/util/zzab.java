package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzegk;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzab {
    public /* synthetic */ zzab(zzaa zzaaVar) {
    }

    @Nullable
    public CookieManager zza(Context context) {
        throw null;
    }

    public WebResourceResponse zzb(String str, String str2, int i9, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public zzchl zzc(zzchd zzchdVar, zzbdm zzbdmVar, boolean z8, @Nullable zzegk zzegkVar) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    @Nullable
    public Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbdv.zzq zzg(Context context, TelephonyManager telephonyManager) {
        return zzbdv.zzq.ENUM_UNKNOWN;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public void zzk(Activity activity) {
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
