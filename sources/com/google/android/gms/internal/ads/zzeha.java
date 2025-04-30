package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzeha implements zzehb {
    public static /* synthetic */ zzehg zzc(String str, String str2, String str3, zzehc zzehcVar, String str4, WebView webView, String str5, String str6, zzehd zzehdVar) {
        zzfow zza = zzfow.zza("Google", str2);
        zzfov zzp = zzp("javascript");
        zzfoo zzn = zzn(zzehcVar.toString());
        zzfov zzfovVar = zzfov.NONE;
        if (zzp == zzfovVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzehcVar)));
            return null;
        }
        zzfov zzp2 = zzp(str4);
        if (zzn == zzfoo.VIDEO && zzp2 == zzfovVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfol zzb = zzfol.zzb(zza, webView, str5, "");
        return new zzehg(zzfoj.zza(zzfok.zza(zzn, zzo(zzehdVar.toString()), zzp, zzp2, true), zzb), zzb);
    }

    public static /* synthetic */ zzehg zzd(String str, String str2, String str3, String str4, zzehc zzehcVar, WebView webView, String str5, String str6, zzehd zzehdVar) {
        zzfow zza = zzfow.zza(str, str2);
        zzfov zzp = zzp("javascript");
        zzfov zzp2 = zzp(str4);
        zzfoo zzn = zzn(zzehcVar.toString());
        zzfov zzfovVar = zzfov.NONE;
        if (zzp == zzfovVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzehcVar)));
            return null;
        }
        if (zzn == zzfoo.VIDEO && zzp2 == zzfovVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfol zzc = zzfol.zzc(zza, webView, str5, "");
        return new zzehg(zzfoj.zza(zzfok.zza(zzn, zzo(zzehdVar.toString()), zzp, zzp2, true), zzc), zzc);
    }

    @Nullable
    private static zzfoo zzn(String str) {
        char c9;
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    c9 = 1;
                }
                c9 = 65535;
            } else {
                if (str.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    c9 = 2;
                }
                c9 = 65535;
            }
        } else {
            if (str.equals("htmlDisplay")) {
                c9 = 0;
            }
            c9 = 65535;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    return null;
                }
                return zzfoo.VIDEO;
            }
            return zzfoo.NATIVE_DISPLAY;
        }
        return zzfoo.HTML_DISPLAY;
    }

    private static zzfor zzo(String str) {
        char c9;
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    c9 = 2;
                }
                c9 = 65535;
            } else {
                if (str.equals("definedByJavascript")) {
                    c9 = 1;
                }
                c9 = 65535;
            }
        } else {
            if (str.equals("beginToRender")) {
                c9 = 0;
            }
            c9 = 65535;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    return zzfor.UNSPECIFIED;
                }
                return zzfor.ONE_PIXEL;
            }
            return zzfor.DEFINED_BY_JAVASCRIPT;
        }
        return zzfor.BEGIN_TO_RENDER;
    }

    private static zzfov zzp(@Nullable String str) {
        if ("native".equals(str)) {
            return zzfov.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfov.JAVASCRIPT;
        }
        return zzfov.NONE;
    }

    @Nullable
    private static final Object zzq(zzegz zzegzVar) {
        try {
            return zzegzVar.zza();
        } catch (RuntimeException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e4, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e4, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    @Nullable
    public final zzehg zza(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzehd zzehdVar, final zzehc zzehcVar, @Nullable final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
            final String str6 = "javascript";
            final String str7 = "Google";
            final String str8 = "";
            return (zzehg) zzq(new zzegz(str7, str, str6, zzehcVar, str4, webView, str5, str8, zzehdVar) { // from class: com.google.android.gms.internal.ads.zzegp
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzehc zzd;
                public final /* synthetic */ String zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzehd zzi;
                public final /* synthetic */ String zza = "Google";
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzb = str;
                    this.zzd = zzehcVar;
                    this.zze = str4;
                    this.zzf = webView;
                    this.zzg = str5;
                    this.zzi = zzehdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzegz
                public final Object zza() {
                    return zzeha.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    @Nullable
    public final zzehg zzb(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzehd zzehdVar, final zzehc zzehcVar, @Nullable final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
            final String str7 = "";
            final String str8 = "javascript";
            return (zzehg) zzq(new zzegz(str5, str, str8, str4, zzehcVar, webView, str6, str7, zzehdVar) { // from class: com.google.android.gms.internal.ads.zzegs
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzd;
                public final /* synthetic */ zzehc zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzehd zzi;
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzd = str4;
                    this.zze = zzehcVar;
                    this.zzf = webView;
                    this.zzg = str6;
                    this.zzi = zzehdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzegz
                public final Object zza() {
                    return zzeha.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    @Nullable
    public final zzfou zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z8) {
        final boolean z9 = true;
        return (zzfou) zzq(new zzegz(webView, z9) { // from class: com.google.android.gms.internal.ads.zzegx
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzegz
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                return zzfou.zza(zzfow.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    @Nullable
    public final String zzf(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue()) {
            return null;
        }
        return (String) zzq(new zzegz() { // from class: com.google.android.gms.internal.ads.zzegv
            @Override // com.google.android.gms.internal.ads.zzegz
            public final Object zza() {
                return "a.1.4.10-google_20240110";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzg(final zzfoj zzfojVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzego
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
                    zzfoj.this.zzb(view, zzfoq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzh(final zzfou zzfouVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // java.lang.Runnable
            public final void run() {
                zzfou.this.zze(view, zzfoq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzi(final zzfoj zzfojVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegy
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
                    zzfoj.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzj(final zzfoj zzfojVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegq
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
                    zzfoj.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzk(final zzfoj zzfojVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
            Objects.requireNonNull(zzfojVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfoj.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final boolean zzl(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzq(new zzegz() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // com.google.android.gms.internal.ads.zzegz
            public final Object zza() {
                if (zzfoh.zzb()) {
                    return Boolean.TRUE;
                }
                zzfoh.zza(context);
                return Boolean.valueOf(zzfoh.zzb());
            }
        });
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzm(final zzfou zzfouVar, final zzchs zzchsVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // java.lang.Runnable
            public final void run() {
                zzfou.this.zzf(zzchsVar);
            }
        });
    }
}
