package com.google.android.gms.measurement.internal;

import Q7.n0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.vungle.ads.internal.protos.n;
import com.vungle.ads.internal.signals.j;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import y0.e;

/* loaded from: classes2.dex */
public final class zznp extends zzii {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private e zzf;
    private Boolean zzg;
    private Integer zzh;

    public zznp(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzh = null;
        this.zzd = new AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List<java.lang.String> r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zznp.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public static int zzc() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        if (extensionVersion <= 3) {
            return 0;
        }
        extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
        return extensionVersion2;
    }

    private final int zzk(String str) {
        if (!zzb("event param", str)) {
            return 3;
        }
        if (zza("event param", (String[]) null, str)) {
            return !zza("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int zzl(String str) {
        if (!zzc("event param", str)) {
            return 3;
        }
        if (zza("event param", (String[]) null, str)) {
            return !zza("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int zzm(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? NotificationCompat.FLAG_LOCAL_ONLY : "_lgclid".equals(str) ? 100 : 36;
    }

    public static MessageDigest zzu() {
        MessageDigest messageDigest;
        for (int i9 = 0; i9 < 2; i9++) {
            try {
                messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @TargetApi(n.AD_PLAY_RESET_ON_DEINIT_VALUE)
    private final boolean zzy() {
        Integer num;
        if (this.zzg == null) {
            e zzn = zzn();
            boolean z8 = false;
            if (zzn == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) zzn.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z8 = true;
                        }
                    } catch (InterruptedException e4) {
                        e = e4;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (CancellationException e9) {
                        e = e9;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (ExecutionException e10) {
                        e = e10;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (TimeoutException e11) {
                        e = e11;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    }
                }
                this.zzg = Boolean.valueOf(z8);
            } catch (InterruptedException e12) {
                e = e12;
            } catch (CancellationException e13) {
                e = e13;
            } catch (ExecutionException e14) {
                e = e14;
            } catch (TimeoutException e15) {
                e = e15;
            }
            zzj().zzp().zza("Measurement manager api status result", num);
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    public final void zzaa() {
        zzt();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().zzu().zza("Utils falling back to Random for random id");
            }
        }
        this.zzd.set(nextLong);
    }

    public final int zzb(String str) {
        if (!zzb("user property", str)) {
            return 6;
        }
        if (zza("user property", zzis.zza, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    public final int zzg() {
        if (this.zzh == null) {
            this.zzh = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(zza()) / 1000);
        }
        return this.zzh.intValue();
    }

    public final long zzh() {
        int extensionVersion;
        long j7;
        zzt();
        if (!zzd(this.zzu.zzh().zzad())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j7 = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j7 = 8;
            } else {
                j7 = zzc() < zzbf.zzav.zza(null).intValue() ? 16L : 0L;
            }
        }
        if (!zze("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j7 |= 2;
        }
        if (j7 == 0 && !zzy()) {
            j7 |= 64;
        }
        if (j7 == 0) {
            return 1L;
        }
        return j7;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    public final e zzn() {
        if (this.zzf == null) {
            this.zzf = e.a(zza());
        }
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    public final boolean zzo() {
        return true;
    }

    public final String zzp() {
        byte[] bArr = new byte[16];
        zzv().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final SecureRandom zzv() {
        zzt();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    public final boolean zzw() {
        zzt();
        if (zzh() == 1) {
            return true;
        }
        return false;
    }

    public final boolean zzx() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean zzd(String str) {
        return zze(zzbf.zzbb.zza(null), str);
    }

    public static boolean zzf(String str) {
        return zze(zzbf.zzbu.zza(null), str);
    }

    public static boolean zzj(String str) {
        for (String str2 : zzb) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public final boolean zze(String str) {
        zzt();
        if (Wrappers.packageManager(zza()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().zzc().zza("Permission not granted", str);
        return false;
    }

    public final boolean zzi(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public static boolean zzg(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean zzn(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final long zzc(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i9 = 0;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i9 = applicationInfo.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().zzn().zza("PackageManager failed to find running app: app_id", str);
        }
        return i9;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    public final long zzm() {
        long andIncrement;
        long j7;
        if (this.zzd.get() == 0) {
            synchronized (this.zzd) {
                long nextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
                int i9 = this.zze + 1;
                this.zze = i9;
                j7 = nextLong + i9;
            }
            return j7;
        }
        synchronized (this.zzd) {
            this.zzd.compareAndSet(-1L, 1L);
            andIncrement = this.zzd.getAndIncrement();
        }
        return andIncrement;
    }

    private static boolean zze(String str, String str2) {
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public final Object zzb(String str, Object obj) {
        int zza2;
        if ("_ev".equals(str)) {
            return zza(zze().zzb((String) null, false), obj, true, true, (String) null);
        }
        if (zzg(str)) {
            zza2 = zze().zzb((String) null, false);
        } else {
            zza2 = zze().zza((String) null, false);
        }
        return zza(zza2, obj, false, true, (String) null);
    }

    public final boolean zzd(String str, String str2) {
        if (zzpn.zza() && zze().zza(zzbf.zzbt) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zze().zzn().equals(str);
    }

    public final Object zzc(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return zza(zzm(str), obj, true, false, (String) null);
        }
        return zza(zzm(str), obj, false, false, (String) null);
    }

    public static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final boolean zzc(String str, String str2) {
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzh().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().zzh().zza("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static ArrayList<Bundle> zzb(List<zzae> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzae zzaeVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.APP_ID, zzaeVar.zza);
            bundle.putString("origin", zzaeVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzaeVar.zzd);
            bundle.putString("name", zzaeVar.zzc.zza);
            zzik.zza(bundle, Preconditions.checkNotNull(zzaeVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzaeVar.zze);
            String str = zzaeVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzbd zzbdVar = zzaeVar.zzg;
            if (zzbdVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbdVar.zza);
                zzbc zzbcVar = zzbdVar.zzb;
                if (zzbcVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbcVar.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzaeVar.zzh);
            zzbd zzbdVar2 = zzaeVar.zzi;
            if (zzbdVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbdVar2.zza);
                zzbc zzbcVar2 = zzbdVar2.zzb;
                if (zzbcVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbcVar2.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzaeVar.zzc.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzaeVar.zzj);
            zzbd zzbdVar3 = zzaeVar.zzk;
            if (zzbdVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbdVar3.zza);
                zzbc zzbcVar3 = zzbdVar3.zzb;
                if (zzbcVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbcVar3.zzb());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean zzc(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final int zza(String str, Object obj) {
        boolean zza2;
        if ("_ldl".equals(str)) {
            zza2 = zza("user property referrer", str, zzm(str), obj);
        } else {
            zza2 = zza("user property", str, zzm(str), obj);
        }
        return zza2 ? 0 : 7;
    }

    private static boolean zzb(Bundle bundle, int i9) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i9);
        return true;
    }

    public final boolean zzb(String str, String str2) {
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzh().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().zzh().zza("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final int zza(String str) {
        if (!zzb(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (zza(NotificationCompat.CATEGORY_EVENT, zziq.zza, zziq.zzb, str)) {
            return !zza(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int zza(int i9) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zza(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:8:0x0073). Please report as a decompilation issue!!! */
    public final long zza(Context context, String str) {
        zzt();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest zzu = zzu();
        long j7 = -1;
        if (zzu == null) {
            zzj().zzg().zza("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e4) {
                    zzj().zzg().zza("Package name not found", e4);
                }
                if (!zzb(context, str)) {
                    Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        j7 = zza(zzu.digest(signatureArr[0].toByteArray()));
                    } else {
                        zzj().zzu().zza("Could not get signatures");
                    }
                }
            }
            j7 = 0;
        }
        return j7;
    }

    private final boolean zzb(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e4) {
            zzj().zzg().zza("Package name not found", e4);
            return true;
        } catch (CertificateException e9) {
            zzj().zzg().zza("Error obtaining certificate", e9);
            return true;
        }
    }

    public static long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i9 = 0;
        Preconditions.checkState(bArr.length > 0);
        long j7 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j7 += (bArr[length] & 255) << i9;
            i9 += 8;
        }
        return j7;
    }

    public static long zza(zzbc zzbcVar) {
        long j7 = 0;
        if (zzbcVar == null) {
            return 0L;
        }
        Iterator<String> it = zzbcVar.iterator();
        while (it.hasNext()) {
            if (zzbcVar.zzc(it.next()) instanceof Parcelable[]) {
                j7 += ((Parcelable[]) r3).length;
            }
        }
        return j7;
    }

    public static Bundle[] zzb(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static long zza(long j7, long j9) {
        return ((j9 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j7) / j.TWENTY_FOUR_HOURS_MILLIS;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Bundle zza(List<zzno> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzno zznoVar : list) {
            String str = zznoVar.zzd;
            if (str != null) {
                bundle.putString(zznoVar.zza, str);
            } else {
                Long l = zznoVar.zzc;
                if (l != null) {
                    bundle.putLong(zznoVar.zza, l.longValue());
                } else {
                    Double d2 = zznoVar.zzf;
                    if (d2 != null) {
                        bundle.putDouble(zznoVar.zza, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public final Bundle zza(Uri uri, boolean z8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = z8 ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z8 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(Constants.MEDIUM, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z8 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (z8 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(AppLovinEventTypes.USER_VIEWED_CONTENT, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e4) {
            zzj().zzu().zza("Install referrer url isn't a hierarchical URI", e4);
            return null;
        }
    }

    public static Bundle zza(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i9 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i9 < parcelableArr.length) {
                        if (parcelableArr[i9] instanceof Bundle) {
                            parcelableArr[i9] = new Bundle((Bundle) parcelableArr[i9]);
                        }
                        i9++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i9 < list.size()) {
                        Object obj2 = list.get(i9);
                        if (obj2 instanceof Bundle) {
                            list.set(i9, new Bundle((Bundle) obj2));
                        }
                        i9++;
                    }
                }
            }
        }
        return bundle2;
    }

    public final Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object zzb2 = zzb(str2, bundle.get(str2));
                if (zzb2 == null) {
                    zzj().zzv().zza("Param value can't be null", zzi().zzb(str2));
                } else {
                    zza(bundle2, str2, zzb2);
                }
            }
        }
        return bundle2;
    }

    public final Bundle zza(String str, String str2, Bundle bundle, List<String> list, boolean z8) {
        int zzl;
        int i9;
        zznp zznpVar = this;
        boolean zza2 = zza(str2, zziq.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int zzg = zze().zzg();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list == null || !list.contains(str3)) {
                zzl = !z8 ? zznpVar.zzl(str3) : 0;
                if (zzl == 0) {
                    zzl = zznpVar.zzk(str3);
                }
            } else {
                zzl = 0;
            }
            if (zzl != 0) {
                zza(bundle2, zzl, str3, zzl == 3 ? str3 : null);
                bundle2.remove(str3);
                i9 = zzg;
            } else {
                i9 = zzg;
                int zza3 = zza(str, str2, str3, bundle.get(str3), bundle2, list, z8, zza2);
                if (zza3 == 17) {
                    zza(bundle2, zza3, str3, Boolean.FALSE);
                } else if (zza3 != 0 && !"_ev".equals(str3)) {
                    zza(bundle2, zza3, zza3 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3)) {
                    int i11 = i10 + 1;
                    if (i11 > i9) {
                        zzj().zzh().zza(n0.f(i9, "Event can't contain more than ", " params"), zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i10 = i11;
                }
            }
            zzg = i9;
            zznpVar = this;
        }
        return bundle2;
    }

    public final zzbd zza(String str, String str2, Bundle bundle, String str3, long j7, boolean z8, boolean z9) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zza(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            Bundle zza2 = zza(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
            if (z8) {
                zza2 = zza(zza2, str);
            }
            Preconditions.checkNotNull(zza2);
            return new zzbd(str2, new zzbc(zza2), str3, j7);
        }
        zzj().zzg().zza("Invalid conditional property event name", zzi().zzc(str2));
        throw new IllegalArgumentException();
    }

    private final Object zza(int i9, Object obj, boolean z8, boolean z9, String str) {
        Bundle zza2;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            if (!z9 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (zza2 = zza((Bundle) parcelable, (String) null)) != null && !zza2.isEmpty()) {
                    arrayList.add(zza2);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return zza(String.valueOf(obj), i9, z8);
    }

    public static String zza(String str, int i9, boolean z8) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i9) {
            return str;
        }
        if (z8) {
            return o.j(str.substring(0, str.offsetByCodePoints(0, i9)), "...");
        }
        return null;
    }

    public final URL zza(long j7, String str, String str2, long j9, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String str4 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v" + j7 + "." + zzg()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j9;
            if (str.equals(zze().zzo())) {
                str4 = str4.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    str4 = str4.concat("&");
                }
                str4 = str4.concat(str3);
            }
            return new URL(str4);
        } catch (IllegalArgumentException e4) {
            e = e4;
            zzj().zzg().zza("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e9) {
            e = e9;
            zzj().zzg().zza("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final void zza(Bundle bundle, long j7) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            zzj().zzu().zza("Params already contained engagement", Long.valueOf(j9));
        }
        bundle.putLong("_et", j7 + j9);
    }

    private static void zza(Bundle bundle, int i9, String str, Object obj) {
        if (zzb(bundle, i9)) {
            bundle.putString("_ev", zza(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void zza(zzkp zzkpVar, Bundle bundle, boolean z8) {
        if (bundle == null || zzkpVar == null || (bundle.containsKey("_sc") && !z8)) {
            if (bundle != null && zzkpVar == null && z8) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = zzkpVar.zza;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = zzkpVar.zzb;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", zzkpVar.zzc);
    }

    public final void zza(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zzq().zza(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zza(Parcelable[] parcelableArr, int i9, boolean z8) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzh(str) && !zza(str, zzip.zzd) && (i10 = i10 + 1) > i9) {
                    if (z8) {
                        zzj().zzh().zza(n0.f(i9, "Param can't contain more than ", " item-scoped custom parameters"), zzi().zzb(str), zzi().zza(bundle));
                        zzb(bundle, 28);
                    } else {
                        zzj().zzh().zza("Param cannot contain item-scoped custom parameters", zzi().zzb(str), zzi().zza(bundle));
                        zzb(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void zza(zzga zzgaVar, int i9) {
        Iterator it = new TreeSet(zzgaVar.zzb.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzh(str) && (i10 = i10 + 1) > i9) {
                zzj().zzh().zza(n0.f(i9, "Event can't contain more than ", " params"), zzi().zza(zzgaVar.zza), zzi().zza(zzgaVar.zzb));
                zzb(zzgaVar.zzb, 5);
                zzgaVar.zzb.remove(str);
            }
        }
    }

    public static void zza(zznr zznrVar, int i9, String str, String str2, int i10) {
        zza(zznrVar, (String) null, i9, str, str2, i10);
    }

    public static void zza(zznr zznrVar, String str, int i9, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        zzb(bundle, i9);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i9 == 6 || i9 == 7 || i9 == 2) {
            bundle.putLong("_el", i10);
        }
        zznrVar.zza(str, "_err", bundle);
    }

    public final void zza(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzj().zzv().zza("Not putting event parameter. Invalid value type. name, type", zzi().zzb(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, boolean z8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CampaignEx.JSON_KEY_AD_R, z8);
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza("Error returning boolean value to wrapper", e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(CampaignEx.JSON_KEY_AD_R, arrayList);
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza("Error returning bundle list to wrapper", e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, Bundle bundle) {
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza("Error returning bundle value to wrapper", e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(CampaignEx.JSON_KEY_AD_R, bArr);
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza("Error returning byte array to wrapper", e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt(CampaignEx.JSON_KEY_AD_R, i9);
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza("Error returning int value to wrapper", e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong(CampaignEx.JSON_KEY_AD_R, j7);
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza("Error returning long value to wrapper", e4);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdg zzdgVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_AD_R, str);
        try {
            zzdgVar.zza(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzj().zzu().zza("Error returning string value to wrapper", e4);
        }
    }

    private final void zza(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z8) {
        int zzl;
        String str4;
        int zza2;
        if (bundle == null) {
            return;
        }
        int zzc = zze().zzc();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i9 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list == null || !list.contains(str5)) {
                zzl = !z8 ? zzl(str5) : 0;
                if (zzl == 0) {
                    zzl = zzk(str5);
                }
            } else {
                zzl = 0;
            }
            if (zzl != 0) {
                zza(bundle, zzl, str5, zzl == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (zza(bundle.get(str5))) {
                    zzj().zzv().zza("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    zza2 = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    zza2 = zza(str, str2, str5, bundle.get(str5), bundle, list, z8, false);
                }
                if (zza2 != 0 && !"_ev".equals(str4)) {
                    zza(bundle, zza2, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzh(str4) && !zza(str4, zzip.zzd)) {
                    int i10 = i9 + 1;
                    if (!zza(231100000, true)) {
                        zzj().zzh().zza("Item array not supported on client's version of Google Play Services (Android Only)", zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle, 23);
                        bundle.remove(str4);
                    } else if (i10 > zzc) {
                        if (zzou.zza() && zze().zza(zzbf.zzbx)) {
                            zzj().zzh().zza(n0.f(zzc, "Item can't contain more than ", " item-scoped custom params"), zzi().zza(str2), zzi().zza(bundle));
                            zzb(bundle, 28);
                            bundle.remove(str4);
                        } else {
                            zzj().zzh().zza("Item cannot contain custom parameters", zzi().zza(str2), zzi().zza(bundle));
                            zzb(bundle, 23);
                            bundle.remove(str4);
                        }
                    }
                    i9 = i10;
                }
            }
        }
    }

    private static boolean zza(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzn(str)) {
                return true;
            }
            if (this.zzu.zzae()) {
                zzj().zzh().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzfw.zza(str));
            }
            return false;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (zzn(str2)) {
                return true;
            }
            zzj().zzh().zza("Invalid admob_app_id. Analytics disabled.", zzfw.zza(str2));
            return false;
        }
        if (this.zzu.zzae()) {
            zzj().zzh().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final boolean zza(String str, int i9, String str2) {
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i9) {
            return true;
        }
        zzj().zzh().zza("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i9), str2);
        return false;
    }

    public final boolean zza(String str, String[] strArr, String str2) {
        return zza(str, strArr, (String[]) null, str2);
    }

    public final boolean zza(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().zzh().zza("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        for (String str3 : zza) {
            if (str2.startsWith(str3)) {
                zzj().zzh().zza("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zza(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zza(str2, strArr2)) {
            return true;
        }
        zzj().zzh().zza("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zza(String str, String str2, int i9, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i9) {
                zzj().zzv().zza("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public static boolean zza(Bundle bundle, int i9) {
        int i10 = 0;
        if (bundle.size() <= i9) {
            return false;
        }
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            i10++;
            if (i10 > i9) {
                bundle.remove(str);
            }
        }
        return true;
    }

    public static boolean zza(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zza(int i9, boolean z8) {
        Boolean zzab = this.zzu.zzr().zzab();
        if (zzg() < i9 / 1000) {
            return (zzab == null || zzab.booleanValue()) ? false : true;
        }
        return true;
    }

    public static boolean zza(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zza(Context context, boolean z8) {
        Preconditions.checkNotNull(context);
        return zzc(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    @SuppressLint({"ApplySharedPref"})
    public final boolean zza(String str, double d2) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString(Constants.DEEPLINK, str);
            edit.putLong(CampaignEx.JSON_KEY_TIMESTAMP, Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (RuntimeException e4) {
            zzj().zzg().zza("Failed to persist Deferred Deep Link. exception", e4);
            return false;
        }
    }

    public static boolean zza(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean zza(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
