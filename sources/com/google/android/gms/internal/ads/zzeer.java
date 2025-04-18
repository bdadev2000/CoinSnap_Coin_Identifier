package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public interface zzeer {
    @Nullable
    zzeew zza(String str, WebView webView, String str2, String str3, @Nullable String str4, zzeet zzeetVar, zzees zzeesVar, @Nullable String str5);

    @Nullable
    zzeew zzb(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzeet zzeetVar, zzees zzeesVar, @Nullable String str6);

    @Nullable
    zzfnh zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z10);

    @Nullable
    String zzf(Context context);

    void zzg(zzfmw zzfmwVar, View view);

    void zzh(zzfnh zzfnhVar, View view);

    void zzi(zzfmw zzfmwVar);

    void zzj(zzfmw zzfmwVar, View view);

    void zzk(zzfmw zzfmwVar);

    boolean zzl(Context context);

    void zzm(zzfnh zzfnhVar, zzcfz zzcfzVar);
}
