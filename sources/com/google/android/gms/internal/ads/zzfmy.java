package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzfmy {
    private final zzfnj zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;
    private final zzfmz zzg;

    private zzfmy(zzfnj zzfnjVar, WebView webView, String str, List list, @Nullable String str2, @Nullable String str3, zzfmz zzfmzVar) {
        this.zza = zzfnjVar;
        this.zzb = webView;
        this.zzg = zzfmzVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfmy zzb(zzfnj zzfnjVar, WebView webView, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzfor.zzd(str2, NotificationCompat.FLAG_LOCAL_ONLY, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfmy(zzfnjVar, webView, null, null, str, str2, zzfmz.HTML);
    }

    public static zzfmy zzc(zzfnj zzfnjVar, WebView webView, @Nullable String str, @Nullable String str2) {
        zzfor.zzd("", NotificationCompat.FLAG_LOCAL_ONLY, "CustomReferenceData is greater than 256 characters");
        return new zzfmy(zzfnjVar, webView, null, null, str, "", zzfmz.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfmz zzd() {
        return this.zzg;
    }

    public final zzfnj zze() {
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
