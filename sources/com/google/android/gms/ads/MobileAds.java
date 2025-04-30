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
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzcbg;
import u.AbstractC2736e;
import u.C2732a;
import u.C2744m;

/* loaded from: classes2.dex */
public class MobileAds {

    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@NonNull Context context) {
        zzej.zzf().zzl(context);
    }

    @Nullable
    public static InitializationStatus getInitializationStatus() {
        return zzej.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzej.zzf().zzh();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzej.zzf().zzc();
    }

    @NonNull
    public static VersionInfo getVersion() {
        zzej.zzf();
        String[] split = TextUtils.split("23.2.0", "\\.");
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
        zzej.zzf().zzm(context, null, null);
    }

    public static void openAdInspector(@NonNull Context context, @NonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzej.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@NonNull Context context, @NonNull String str) {
        zzej.zzf().zzq(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z8) {
        return zzej.zzf().zzx(z8);
    }

    @Nullable
    public static C2744m registerCustomTabsSession(@NonNull Context context, @NonNull AbstractC2736e abstractC2736e, @NonNull String str, @Nullable C2732a c2732a) {
        zzej.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcbg zza = zzbvx.zza(context);
        if (zza == null) {
            zzm.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (C2744m) ObjectWrapper.unwrap(zza.zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(abstractC2736e), str, ObjectWrapper.wrap(c2732a)));
        } catch (RemoteException | IllegalArgumentException e4) {
            zzm.zzh("Unable to register custom tabs session. Error: ", e4);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(@NonNull Class<? extends RtbAdapter> cls) {
        zzej.zzf().zzr(cls);
    }

    public static void registerWebView(@NonNull WebView webView) {
        zzej.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzm.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzcbg zza = zzbvx.zza(webView.getContext());
        if (zza == null) {
            zzm.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzj(ObjectWrapper.wrap(webView));
        } catch (RemoteException e4) {
            zzm.zzh("", e4);
        }
    }

    public static void setAppMuted(boolean z8) {
        zzej.zzf().zzs(z8);
    }

    public static void setAppVolume(float f9) {
        zzej.zzf().zzt(f9);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzej.zzf().zzu(str);
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        zzej.zzf().zzv(requestConfiguration);
    }

    public static void initialize(@NonNull Context context, @NonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        zzej.zzf().zzm(context, null, onInitializationCompleteListener);
    }
}
