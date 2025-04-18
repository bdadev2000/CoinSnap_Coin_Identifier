package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public interface zzega {
    @Nullable
    zzegf zza(String str, WebView webView, String str2, String str3, @Nullable String str4, zzegc zzegcVar, zzegb zzegbVar, @Nullable String str5);

    @Nullable
    zzegf zzb(String str, WebView webView, String str2, String str3, @Nullable String str4, String str5, zzegc zzegcVar, zzegb zzegbVar, @Nullable String str6);

    @Nullable
    zzfot zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z2);

    @Nullable
    String zzf(Context context);

    void zzg(zzfoi zzfoiVar, View view);

    void zzh(zzfot zzfotVar, View view);

    void zzi(zzfoi zzfoiVar);

    void zzj(zzfoi zzfoiVar, View view);

    void zzk(zzfoi zzfoiVar);

    boolean zzl(Context context);

    void zzm(zzfot zzfotVar, zzcgd zzcgdVar);
}
