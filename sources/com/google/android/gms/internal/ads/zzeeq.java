package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzeeq implements zzeer {
    public static /* synthetic */ zzeew zzc(String str, String str2, String str3, zzees zzeesVar, String str4, WebView webView, String str5, String str6, zzeet zzeetVar) {
        zzfnj zza = zzfnj.zza("Google", str2);
        zzfni zzp = zzp("javascript");
        zzfnb zzn = zzn(zzeesVar.toString());
        zzfni zzfniVar = zzfni.NONE;
        if (zzp == zzfniVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeesVar)));
            return null;
        }
        zzfni zzp2 = zzp(str4);
        if (zzn == zzfnb.VIDEO && zzp2 == zzfniVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfmy zzb = zzfmy.zzb(zza, webView, str5, "");
        return new zzeew(zzfmw.zza(zzfmx.zza(zzn, zzo(zzeetVar.toString()), zzp, zzp2, true), zzb), zzb);
    }

    public static /* synthetic */ zzeew zzd(String str, String str2, String str3, String str4, zzees zzeesVar, WebView webView, String str5, String str6, zzeet zzeetVar) {
        zzfnj zza = zzfnj.zza(str, str2);
        zzfni zzp = zzp("javascript");
        zzfni zzp2 = zzp(str4);
        zzfnb zzn = zzn(zzeesVar.toString());
        zzfni zzfniVar = zzfni.NONE;
        if (zzp == zzfniVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeesVar)));
            return null;
        }
        if (zzn == zzfnb.VIDEO && zzp2 == zzfniVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfmy zzc = zzfmy.zzc(zza, webView, str5, "");
        return new zzeew(zzfmw.zza(zzfmx.zza(zzn, zzo(zzeetVar.toString()), zzp, zzp2, true), zzc), zzc);
    }

    @Nullable
    private static zzfnb zzn(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    c10 = 2;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("htmlDisplay")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return null;
                }
                return zzfnb.VIDEO;
            }
            return zzfnb.NATIVE_DISPLAY;
        }
        return zzfnb.HTML_DISPLAY;
    }

    private static zzfne zzo(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("definedByJavascript")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("beginToRender")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return zzfne.UNSPECIFIED;
                }
                return zzfne.ONE_PIXEL;
            }
            return zzfne.DEFINED_BY_JAVASCRIPT;
        }
        return zzfne.BEGIN_TO_RENDER;
    }

    private static zzfni zzp(@Nullable String str) {
        if ("native".equals(str)) {
            return zzfni.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfni.JAVASCRIPT;
        }
        return zzfni.NONE;
    }

    @Nullable
    private static final Object zzq(zzeep zzeepVar) {
        try {
            return zzeepVar.zza();
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e2, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e2, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    @Nullable
    public final zzeew zza(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzeet zzeetVar, final zzees zzeesVar, @Nullable final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
            final String str6 = "";
            final String str7 = "javascript";
            final String str8 = "Google";
            return (zzeew) zzq(new zzeep(str8, str, str7, zzeesVar, str4, webView, str5, str6, zzeetVar) { // from class: com.google.android.gms.internal.ads.zzeef
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzees zzd;
                public final /* synthetic */ String zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeet zzi;
                public final /* synthetic */ String zza = "Google";
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzb = str;
                    this.zzd = zzeesVar;
                    this.zze = str4;
                    this.zzf = webView;
                    this.zzg = str5;
                    this.zzi = zzeetVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeep
                public final Object zza() {
                    return zzeeq.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    @Nullable
    public final zzeew zzb(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzeet zzeetVar, final zzees zzeesVar, @Nullable final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
            final String str7 = "";
            final String str8 = "javascript";
            return (zzeew) zzq(new zzeep(str5, str, str8, str4, zzeesVar, webView, str6, str7, zzeetVar) { // from class: com.google.android.gms.internal.ads.zzeei
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzd;
                public final /* synthetic */ zzees zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzeet zzi;
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzd = str4;
                    this.zze = zzeesVar;
                    this.zzf = webView;
                    this.zzg = str6;
                    this.zzi = zzeetVar;
                }

                @Override // com.google.android.gms.internal.ads.zzeep
                public final Object zza() {
                    return zzeeq.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    @Nullable
    public final zzfnh zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z10) {
        final boolean z11 = true;
        return (zzfnh) zzq(new zzeep(webView, z11) { // from class: com.google.android.gms.internal.ads.zzeen
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeep
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                return zzfnh.zza(zzfnj.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    @Nullable
    public final String zzf(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue()) {
            return null;
        }
        return (String) zzq(new zzeep() { // from class: com.google.android.gms.internal.ads.zzeel
            @Override // com.google.android.gms.internal.ads.zzeep
            public final Object zza() {
                return "a.1.4.14-google_20240908";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzg(final zzfmw zzfmwVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
                    zzfmw.this.zzb(view, zzfnd.zzc, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzh(final zzfnh zzfnhVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // java.lang.Runnable
            public final void run() {
                zzfnh.this.zze(view, zzfnd.zzc, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzi(final zzfmw zzfmwVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
                    zzfmw.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzj(final zzfmw zzfmwVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
                    zzfmw.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzk(final zzfmw zzfmwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
            Objects.requireNonNull(zzfmwVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeh
                @Override // java.lang.Runnable
                public final void run() {
                    zzfmw.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final boolean zzl(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzq(new zzeep() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzeep
            public final Object zza() {
                if (zzfmu.zzb()) {
                    return Boolean.TRUE;
                }
                zzfmu.zza(context);
                return Boolean.valueOf(zzfmu.zzb());
            }
        });
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzm(final zzfnh zzfnhVar, final zzcfz zzcfzVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // java.lang.Runnable
            public final void run() {
                zzfnh.this.zzf(zzcfzVar);
            }
        });
    }
}
