package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbzh;
import java.util.List;
import o.a;
import o.h;
import o.s;

/* loaded from: classes3.dex */
public class MobileAds {

    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@NonNull Context context) {
        zzex.zzf().zzn(context);
    }

    @Nullable
    public static InitializationStatus getInitializationStatus() {
        return zzex.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzex.zzf().zzi();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzex.zzf().zzc();
    }

    @NonNull
    public static VersionInfo getVersion() {
        zzex.zzf();
        String[] split = TextUtils.split("23.5.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void initialize(@NonNull Context context) {
        zzex.zzf().zzo(context, null, null);
    }

    public static void openAdInspector(@NonNull Context context, @NonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzex.zzf().zzr(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@NonNull Context context, @NonNull String str) {
        zzex.zzf().zzs(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z10) {
        return zzex.zzf().zzz(z10);
    }

    @Nullable
    public static s registerCustomTabsSession(@NonNull Context context, @NonNull h hVar, @NonNull String str, @Nullable a aVar) {
        zzex.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbzh zza = zzbtx.zza(context);
        if (zza == null) {
            zzm.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (s) ObjectWrapper.unwrap(zza.zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(hVar), str, ObjectWrapper.wrap(aVar)));
        } catch (RemoteException | IllegalArgumentException e2) {
            zzm.zzh("Unable to register custom tabs session. Error: ", e2);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(@NonNull Class<? extends RtbAdapter> cls) {
        zzex.zzf().zzt(cls);
    }

    public static void registerWebView(@NonNull WebView webView) {
        zzex.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzm.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbzh zza = zzbtx.zza(webView.getContext());
        if (zza == null) {
            zzm.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzj(ObjectWrapper.wrap(webView));
        } catch (RemoteException e2) {
            zzm.zzh("", e2);
        }
    }

    public static void setAppMuted(boolean z10) {
        zzex.zzf().zzu(z10);
    }

    public static void setAppVolume(float f10) {
        zzex.zzf().zzv(f10);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzex.zzf().zzw(str);
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        zzex.zzf().zzx(requestConfiguration);
    }

    public static void startPreload(@NonNull Context context, @NonNull List<PreloadConfiguration> list, @NonNull PreloadCallback preloadCallback) {
        zzex.zzf().zzg(context, list, preloadCallback);
    }

    public static void initialize(@NonNull Context context, @NonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        zzex.zzf().zzo(context, null, onInitializationCompleteListener);
    }
}
