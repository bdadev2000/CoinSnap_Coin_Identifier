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
import com.mbridge.msdk.foundation.entity.o;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbwj implements zzbwl {
    public static zzbwl zza;
    static zzbwl zzb;
    static zzbwl zzc;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbwj(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfuu.zza()
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
            com.google.android.gms.internal.ads.zzbeg r4 = com.google.android.gms.internal.ads.zzbep.zzhS
            com.google.android.gms.internal.ads.zzben r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbeg r3 = com.google.android.gms.internal.ads.zzbep.zzhQ
            com.google.android.gms.internal.ads.zzben r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L80
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L81
        L80:
            r4 = r1
        L81:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzben r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb0
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9a
            goto Lb1
        L9a:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r3 != 0) goto La9
            goto Lb1
        La9:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto Lb1
        Lb0:
            r0 = r1
        Lb1:
            r2.zzm = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwj.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbwl zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzl()) {
                        zza = new zzbwj(context, VersionInfoParcel.forPackage());
                    } else {
                        zza = new zzbwk();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbwl zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z8 = false;
                    if (((Boolean) zzbgc.zzc.zze()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhM)).booleanValue() || ((Boolean) zzbgc.zza.zze()).booleanValue()) {
                            z8 = true;
                        }
                    }
                    if (zzl()) {
                        zzbwj zzbwjVar = new zzbwj(context, versionInfoParcel);
                        zzbwjVar.zzk();
                        zzbwjVar.zzj();
                        zzc = zzbwjVar;
                    } else if (z8) {
                        zzbwj zzbwjVar2 = new zzbwj(context, versionInfoParcel, true);
                        zzbwjVar2.zzk();
                        zzbwjVar2.zzj();
                        zzc = zzbwjVar2;
                    } else {
                        zzc = new zzbwk();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    public static zzbwl zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhN)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhM)).booleanValue()) {
                            zzb = new zzbwj(context, VersionInfoParcel.forPackage());
                        }
                    }
                    zzb = new zzbwk();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static zzbwl zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhN)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhM)).booleanValue()) {
                            zzb = new zzbwj(context, versionInfoParcel);
                        }
                    }
                    zzb = new zzbwk();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzfyv.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th)));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbwh(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbwi(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl() {
        boolean z8;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmJ)).booleanValue()) {
            if (((Boolean) zzbgt.zze.zze()).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhM)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    if (com.google.android.gms.ads.internal.client.zzay.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmG)).intValue()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zzd = Boolean.valueOf(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhM)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean z8 = false;
            boolean z9 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z8 |= com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName());
                    z9 |= zzbwj.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z8 && !z9) {
                if (!this.zzo) {
                    zzh(th, "");
                }
                if (!this.zzn.getAndSet(true) && ((Boolean) zzbgc.zzc.zze()).booleanValue()) {
                    zzbdz.zzc(this.zzg);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzi(Throwable th, String str, float f9) {
        Throwable th2;
        boolean z8;
        Throwable th3;
        String str2;
        int i9;
        String str3;
        String str4;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo zzc2;
        if (!this.zzo) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            boolean z9 = false;
            if (((Boolean) zzbgt.zzf.zze()).booleanValue()) {
                th2 = th;
            } else {
                LinkedList linkedList = new LinkedList();
                for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                    linkedList.push(th4);
                }
                th2 = null;
                while (!linkedList.isEmpty()) {
                    Throwable th5 = (Throwable) linkedList.pop();
                    StackTraceElement[] stackTrace = th5.getStackTrace();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcj)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzp(th5.getClass().getName())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName())) {
                            arrayList.add(stackTraceElement);
                            z8 = true;
                        } else {
                            String className = stackTraceElement.getClassName();
                            if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                                arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            } else {
                                arrayList.add(stackTraceElement);
                            }
                        }
                    }
                    if (z8) {
                        if (th2 == null) {
                            th3 = new Throwable(th5.getMessage());
                        } else {
                            th3 = new Throwable(th5.getMessage(), th2);
                        }
                        th2 = th3;
                        th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    }
                }
            }
            if (th2 != null) {
                String name = th.getClass().getName();
                String zze2 = zze(th);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziP)).booleanValue()) {
                    str2 = zzf(th);
                } else {
                    str2 = "";
                }
                double d2 = f9;
                double random = Math.random();
                if (f9 > 0.0f) {
                    i9 = (int) (1.0f / f9);
                } else {
                    i9 = 1;
                }
                if (random < d2) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        z9 = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                    } catch (Throwable th6) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching instant app info", th6);
                    }
                    try {
                        str3 = this.zzg.getPackageName();
                    } catch (Throwable unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot obtain package name, proceeding.");
                        str3 = AppLovinMediationProvider.UNKNOWN;
                    }
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme(Constants.SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z9)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                    int i10 = Build.VERSION.SDK_INT;
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i10));
                    String str5 = Build.MANUFACTURER;
                    String str6 = Build.MODEL;
                    if (!str6.startsWith(str5)) {
                        str6 = o.k(str5, " ", str6);
                    }
                    Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzj.afmaVersion).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "636244245").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i9)).appendQueryParameter("pb_tm", String.valueOf(zzbgt.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzg)));
                    String str7 = "1";
                    if (true == this.zzj.isLiteSdk) {
                        str4 = "1";
                    } else {
                        str4 = "0";
                    }
                    Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("lite", str4);
                    if (!TextUtils.isEmpty(str2)) {
                        appendQueryParameter4.appendQueryParameter("hash", str2);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhR)).booleanValue() && (zzc2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzg)) != null) {
                        appendQueryParameter4.appendQueryParameter("available_memory", Long.toString(zzc2.availMem));
                        appendQueryParameter4.appendQueryParameter("total_memory", Long.toString(zzc2.totalMem));
                        if (true != zzc2.lowMemory) {
                            str7 = "0";
                        }
                        appendQueryParameter4.appendQueryParameter("is_low_memory", str7);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhQ)).booleanValue()) {
                        if (!TextUtils.isEmpty(this.zzl)) {
                            appendQueryParameter4.appendQueryParameter("countrycode", this.zzl);
                        }
                        if (!TextUtils.isEmpty(this.zzm)) {
                            appendQueryParameter4.appendQueryParameter("psv", this.zzm);
                        }
                        Context context = this.zzg;
                        if (i10 >= 26) {
                            packageInfo = WebView.getCurrentWebViewPackage();
                        } else {
                            if (context != null) {
                                try {
                                    packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                                } catch (PackageManager.NameNotFoundException unused2) {
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
                        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwg
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

    public zzbwj(Context context, VersionInfoParcel versionInfoParcel, boolean z8) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
