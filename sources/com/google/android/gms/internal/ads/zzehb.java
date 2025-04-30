package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public interface zzehb {
    @Nullable
    zzehg zza(String str, WebView webView, String str2, String str3, @Nullable String str4, zzehd zzehdVar, zzehc zzehcVar, @Nullable String str5);

    @Nullable
    zzehg zzb(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzehd zzehdVar, zzehc zzehcVar, @Nullable String str6);

    @Nullable
    zzfou zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z8);

    @Nullable
    String zzf(Context context);

    void zzg(zzfoj zzfojVar, View view);

    void zzh(zzfou zzfouVar, View view);

    void zzi(zzfoj zzfojVar);

    void zzj(zzfoj zzfojVar, View view);

    void zzk(zzfoj zzfojVar);

    boolean zzl(Context context);

    void zzm(zzfou zzfouVar, zzchs zzchsVar);
}
