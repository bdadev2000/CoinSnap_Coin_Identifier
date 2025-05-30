package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzfol {
    private final zzfow zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;
    private final zzfom zzg;

    private zzfol(zzfow zzfowVar, WebView webView, String str, List list, @Nullable String str2, @Nullable String str3, zzfom zzfomVar) {
        this.zza = zzfowVar;
        this.zzb = webView;
        this.zzg = zzfomVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfol zzb(zzfow zzfowVar, WebView webView, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzfqd.zzd(str2, NotificationCompat.FLAG_LOCAL_ONLY, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfol(zzfowVar, webView, null, null, str, str2, zzfom.HTML);
    }

    public static zzfol zzc(zzfow zzfowVar, WebView webView, @Nullable String str, @Nullable String str2) {
        zzfqd.zzd("", NotificationCompat.FLAG_LOCAL_ONLY, "CustomReferenceData is greater than 256 characters");
        return new zzfol(zzfowVar, webView, null, null, str, "", zzfom.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfom zzd() {
        return this.zzg;
    }

    public final zzfow zze() {
        return this.zza;
    }

    @Nullable
    public final String zzf() {
        return this.zzf;
    }

    @Nullable
    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
