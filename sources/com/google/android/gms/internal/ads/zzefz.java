package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzefz implements zzega {
    public static /* synthetic */ zzegf zzc(String str, String str2, String str3, zzegb zzegbVar, String str4, WebView webView, String str5, String str6, zzegc zzegcVar) {
        zzfov zza = zzfov.zza("Google", str2);
        zzfou zzp = zzp("javascript");
        zzfon zzn = zzn(zzegbVar.toString());
        zzfou zzfouVar = zzfou.NONE;
        if (zzp == zzfouVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzegbVar)));
            return null;
        }
        zzfou zzp2 = zzp(str4);
        if (zzn == zzfon.VIDEO && zzp2 == zzfouVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfok zzb = zzfok.zzb(zza, webView, str5, "");
        return new zzegf(zzfoi.zza(zzfoj.zza(zzn, zzo(zzegcVar.toString()), zzp, zzp2, true), zzb), zzb);
    }

    public static /* synthetic */ zzegf zzd(String str, String str2, String str3, String str4, zzegb zzegbVar, WebView webView, String str5, String str6, zzegc zzegcVar) {
        zzfov zza = zzfov.zza(str, str2);
        zzfou zzp = zzp("javascript");
        zzfou zzp2 = zzp(str4);
        zzfon zzn = zzn(zzegbVar.toString());
        zzfou zzfouVar = zzfou.NONE;
        if (zzp == zzfouVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzegbVar)));
            return null;
        }
        if (zzn == zzfon.VIDEO && zzp2 == zzfouVar) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfok zzc = zzfok.zzc(zza, webView, str5, "");
        return new zzegf(zzfoi.zza(zzfoj.zza(zzn, zzo(zzegcVar.toString()), zzp, zzp2, true), zzc), zzc);
    }

    @Nullable
    private static zzfon zzn(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("video")) {
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            return zzfon.HTML_DISPLAY;
        }
        if (c2 == 1) {
            return zzfon.NATIVE_DISPLAY;
        }
        if (c2 != 2) {
            return null;
        }
        return zzfon.VIDEO;
    }

    private static zzfoq zzo(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? zzfoq.UNSPECIFIED : zzfoq.ONE_PIXEL : zzfoq.DEFINED_BY_JAVASCRIPT : zzfoq.BEGIN_TO_RENDER;
    }

    private static zzfou zzp(@Nullable String str) {
        return "native".equals(str) ? zzfou.NATIVE : "javascript".equals(str) ? zzfou.JAVASCRIPT : zzfou.NONE;
    }

    @Nullable
    private static final Object zzq(zzefy zzefyVar) {
        try {
            return zzefyVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzega
    @Nullable
    public final zzegf zza(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzegc zzegcVar, final zzegb zzegbVar, @Nullable final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue() || !zzfog.zzb()) {
            return null;
        }
        final String str6 = "";
        final String str7 = "javascript";
        final String str8 = "Google";
        return (zzegf) zzq(new zzefy(str8, str, str7, zzegbVar, str4, webView, str5, str6, zzegcVar) { // from class: com.google.android.gms.internal.ads.zzefo
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzegb zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzegc zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzegbVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzegcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzefy
            public final Object zza() {
                return zzefz.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzega
    @Nullable
    public final zzegf zzb(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzegc zzegcVar, final zzegb zzegbVar, @Nullable final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue() || !zzfog.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzegf) zzq(new zzefy(str5, str, str8, str4, zzegbVar, webView, str6, str7, zzegcVar) { // from class: com.google.android.gms.internal.ads.zzefr
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzegb zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzegc zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzegbVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzegcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzefy
            public final Object zza() {
                return zzefz.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzega
    @Nullable
    public final zzfot zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z2) {
        final boolean z3 = true;
        return (zzfot) zzq(new zzefy(webView, z3) { // from class: com.google.android.gms.internal.ads.zzefw
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzefy
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                return zzfot.zza(zzfov.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzega
    @Nullable
    public final String zzf(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue()) {
            return (String) zzq(new zzefy() { // from class: com.google.android.gms.internal.ads.zzefu
                @Override // com.google.android.gms.internal.ads.zzefy
                public final Object zza() {
                    return "a.1.4.10-google_20240110";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzg(final zzfoi zzfoiVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue() && zzfog.zzb()) {
                    zzfoi.this.zzb(view, zzfop.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzh(final zzfot zzfotVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // java.lang.Runnable
            public final void run() {
                zzfot.this.zze(view, zzfop.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzi(final zzfoi zzfoiVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue() && zzfog.zzb()) {
                    zzfoi.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzj(final zzfoi zzfoiVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue() && zzfog.zzb()) {
                    zzfoi.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzk(final zzfoi zzfoiVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue() && zzfog.zzb()) {
            Objects.requireNonNull(zzfoiVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefq
                @Override // java.lang.Runnable
                public final void run() {
                    zzfoi.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final boolean zzl(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzefy() { // from class: com.google.android.gms.internal.ads.zzefs
                @Override // com.google.android.gms.internal.ads.zzefy
                public final Object zza() {
                    if (zzfog.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfog.zza(context);
                    return Boolean.valueOf(zzfog.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzm(final zzfot zzfotVar, final zzcgd zzcgdVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // java.lang.Runnable
            public final void run() {
                zzfot.this.zzf(zzcgdVar);
            }
        });
    }
}
