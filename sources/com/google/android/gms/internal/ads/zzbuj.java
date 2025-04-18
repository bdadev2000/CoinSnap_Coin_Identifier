package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzbuj implements zzbul {
    public static zzbul zza;
    static zzbul zzb;
    static zzbul zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbuj(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzftc.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbce r4 = com.google.android.gms.internal.ads.zzbcn.zzhv
            com.google.android.gms.internal.ads.zzbcl r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L61
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L61
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L51
            goto L61
        L51:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            goto L62
        L61:
            r3 = r0
        L62:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbce r3 = com.google.android.gms.internal.ads.zzbcn.zzht
            com.google.android.gms.internal.ads.zzbcl r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L81
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L82
        L81:
            r4 = r1
        L82:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbcl r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb1
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9b
            goto Lb2
        L9b:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            if (r3 != 0) goto Laa
            goto Lb2
        Laa:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            goto Lb2
        Lb1:
            r0 = r1
        Lb2:
            r2.zzm = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuj.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbul zza(Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzl(context)) {
                    zza = new zzbuj(context, VersionInfoParcel.forPackage());
                } else {
                    zza = new zzbuk();
                }
            }
        }
        return zza;
    }

    public static zzbul zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzc == null) {
                boolean z10 = false;
                if (((Boolean) zzbef.zzc.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzho)).booleanValue() || ((Boolean) zzbef.zza.zze()).booleanValue()) {
                        z10 = true;
                    }
                }
                if (zzl(context)) {
                    zzbuj zzbujVar = new zzbuj(context, versionInfoParcel);
                    zzbujVar.zzk();
                    zzbujVar.zzj();
                    zzc = zzbujVar;
                } else if (z10 && context != null) {
                    zzbuj zzbujVar2 = new zzbuj(context, versionInfoParcel, true);
                    zzbujVar2.zzk();
                    zzbujVar2.zzj();
                    zzc = zzbujVar2;
                } else {
                    zzc = new zzbuk();
                }
            }
        }
        return zzc;
    }

    public static zzbul zzc(Context context) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhp)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzho)).booleanValue()) {
                        zzb = new zzbuj(context, VersionInfoParcel.forPackage());
                    }
                }
                zzb = new zzbuk();
            }
        }
        return zzb;
    }

    public static zzbul zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhp)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzho)).booleanValue()) {
                        zzb = new zzbuj(context, versionInfoParcel);
                    }
                }
                zzb = new zzbuk();
            }
        }
        return zzb;
    }

    public static String zze(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th2) {
        return zzfxf.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th2)));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbuh(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbui(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context) {
        boolean z10;
        if (context == null) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmv)).booleanValue()) {
            if (((Boolean) zzbew.zze.zze()).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzho)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            if (zzd == null) {
                if (com.google.android.gms.ads.internal.client.zzbc.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzms)).intValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzd = Boolean.valueOf(z10);
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzho)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th2) {
        if (th2 != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    z10 |= com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName());
                    z11 |= zzbuj.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z10 && !z11) {
                if (!this.zzo) {
                    zzh(th2, "");
                }
                if (!this.zzn.getAndSet(true) && ((Boolean) zzbef.zzc.zze()).booleanValue()) {
                    zzbbx.zzc(this.zzg);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbul
    public final void zzh(Throwable th2, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbul
    public final void zzi(Throwable th2, String str, float f10) {
        Throwable th3;
        boolean z10;
        String str2;
        int i10;
        String str3;
        String str4;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo zzc2;
        if (!this.zzo) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            boolean z11 = false;
            if (((Boolean) zzbew.zzf.zze()).booleanValue()) {
                th3 = th2;
            } else {
                LinkedList linkedList = new LinkedList();
                for (Throwable th4 = th2; th4 != null; th4 = th4.getCause()) {
                    linkedList.push(th4);
                }
                th3 = null;
                while (!linkedList.isEmpty()) {
                    Throwable th5 = (Throwable) linkedList.pop();
                    StackTraceElement[] stackTrace = th5.getStackTrace();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcr)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzp(th5.getClass().getName())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName())) {
                            arrayList.add(stackTraceElement);
                            z10 = true;
                        } else {
                            String className = stackTraceElement.getClassName();
                            if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                                arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            } else {
                                arrayList.add(stackTraceElement);
                            }
                        }
                    }
                    if (z10) {
                        if (th3 == null) {
                            th3 = new Throwable(th5.getMessage());
                        } else {
                            th3 = new Throwable(th5.getMessage(), th3);
                        }
                        th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    }
                }
            }
            if (th3 != null) {
                String name = th2.getClass().getName();
                String zze2 = zze(th2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziu)).booleanValue()) {
                    str2 = zzf(th2);
                } else {
                    str2 = "";
                }
                double d10 = f10;
                double random = Math.random();
                if (f10 > 0.0f) {
                    i10 = (int) (1.0f / f10);
                } else {
                    i10 = 1;
                }
                if (random < d10) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        z11 = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                    } catch (Throwable th6) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching instant app info", th6);
                    }
                    try {
                        str3 = this.zzg.getPackageName();
                    } catch (Throwable unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot obtain package name, proceeding.");
                        str3 = AppLovinMediationProvider.UNKNOWN;
                    }
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme(Constants.SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z11)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                    int i11 = Build.VERSION.SDK_INT;
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i11));
                    String str5 = Build.MANUFACTURER;
                    String str6 = Build.MODEL;
                    if (!str6.startsWith(str5)) {
                        str6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str5, " ", str6);
                    }
                    Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "685849915").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(zzbew.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzg)));
                    String str7 = "0";
                    if (true != this.zzj.isLiteSdk) {
                        str4 = "0";
                    } else {
                        str4 = "1";
                    }
                    Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("lite", str4);
                    if (!TextUtils.isEmpty(str2)) {
                        appendQueryParameter4.appendQueryParameter("hash", str2);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhu)).booleanValue() && (zzc2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzg)) != null) {
                        appendQueryParameter4.appendQueryParameter("available_memory", Long.toString(zzc2.availMem));
                        appendQueryParameter4.appendQueryParameter("total_memory", Long.toString(zzc2.totalMem));
                        if (true == zzc2.lowMemory) {
                            str7 = "1";
                        }
                        appendQueryParameter4.appendQueryParameter("is_low_memory", str7);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzht)).booleanValue()) {
                        if (!TextUtils.isEmpty(this.zzl)) {
                            appendQueryParameter4.appendQueryParameter("countrycode", this.zzl);
                        }
                        if (!TextUtils.isEmpty(this.zzm)) {
                            appendQueryParameter4.appendQueryParameter("psv", this.zzm);
                        }
                        Context context = this.zzg;
                        if (i11 >= 26) {
                            packageInfo = WebView.getCurrentWebViewPackage();
                        } else {
                            if (context != null) {
                                try {
                                    packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    packageInfo = null;
                                }
                            }
                            packageInfo = null;
                        }
                        if (packageInfo != null) {
                            appendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                            appendQueryParameter4.appendQueryParameter("wvvn", packageInfo.versionName);
                            appendQueryParameter4.appendQueryParameter("wvpn", packageInfo.packageName);
                        }
                    }
                    PackageInfo packageInfo2 = this.zzk;
                    if (packageInfo2 != null) {
                        appendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                        appendQueryParameter4.appendQueryParameter("appvn", this.zzk.versionName);
                    }
                    arrayList2.add(appendQueryParameter4.toString());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        final String str8 = (String) it.next();
                        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = new com.google.android.gms.ads.internal.util.client.zzr(null);
                        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbug
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.gms.ads.internal.util.client.zzr.this.zza(str8);
                            }
                        });
                    }
                }
            }
        }
    }

    public zzbuj(Context context, VersionInfoParcel versionInfoParcel, boolean z10) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
