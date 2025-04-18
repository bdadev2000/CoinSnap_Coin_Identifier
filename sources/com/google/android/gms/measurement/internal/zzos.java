package com.google.android.gms.measurement.internal;

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
import android.text.TextUtils;
import androidx.activity.j;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
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
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import o0.e;
import q1.h;

/* loaded from: classes3.dex */
public final class zzos extends zzjd {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private h zzf;
    private Boolean zzg;
    private Integer zzh;

    public zzos(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzh = null;
        this.zzd = new AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzos.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public static int zzc() {
        if (Build.VERSION.SDK_INT < 30 || j.a() <= 3) {
            return 0;
        }
        return e.a();
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
        for (int i10 = 0; i10 < 2; i10++) {
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

    @TargetApi(30)
    private final boolean zzy() {
        Integer num;
        if (this.zzg == null) {
            h zzo = zzo();
            boolean z10 = false;
            if (zzo == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) zzo.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (CancellationException e10) {
                        e = e10;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (ExecutionException e11) {
                        e = e11;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    } catch (TimeoutException e12) {
                        e = e12;
                        num2 = num;
                        zzj().zzu().zza("Measurement manager api exception", e);
                        this.zzg = Boolean.FALSE;
                        num = num2;
                        zzj().zzp().zza("Measurement manager api status result", num);
                        return this.zzg.booleanValue();
                    }
                }
                this.zzg = Boolean.valueOf(z10);
            } catch (InterruptedException e13) {
                e = e13;
            } catch (CancellationException e14) {
                e = e14;
            } catch (ExecutionException e15) {
                e = e15;
            } catch (TimeoutException e16) {
                e = e16;
            }
            zzj().zzp().zza("Measurement manager api status result", num);
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
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
        if (zza("user property", zzjj.zza, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    public final int zzg() {
        if (this.zzh == null) {
            this.zzh = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(zza()) / 1000);
        }
        return this.zzh.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    public final long zzn() {
        long andIncrement;
        long j3;
        if (this.zzd.get() == 0) {
            synchronized (this.zzd) {
                long nextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
                int i10 = this.zze + 1;
                this.zze = i10;
                j3 = nextLong + i10;
            }
            return j3;
        }
        synchronized (this.zzd) {
            this.zzd.compareAndSet(-1L, 1L);
            andIncrement = this.zzd.getAndIncrement();
        }
        return andIncrement;
    }

    public final h zzo() {
        if (this.zzf == null) {
            this.zzf = h.a(zza());
        }
        return this.zzf;
    }

    public final String zzp() {
        byte[] bArr = new byte[16];
        zzv().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
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
        if (zzm() == 1) {
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
        return zze(zzbh.zzbd.zza(null), str);
    }

    public static boolean zzf(String str) {
        return zze(zzbh.zzca.zza(null), str);
    }

    public static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
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

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final long zzc(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i10 = 0;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i10 = applicationInfo.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().zzo().zza("PackageManager failed to find running app: app_id", str);
        }
        return i10;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    public final long zzm() {
        long j3;
        zzt();
        if (!zzd(this.zzu.zzh().zzad())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j3 = 4;
        } else if (j.a() < 4) {
            j3 = 8;
        } else {
            j3 = zzc() < zzbh.zzax.zza(null).intValue() ? 16L : 0L;
        }
        if (!zze("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j3 |= 2;
        }
        if (j3 == 0 && !zzy()) {
            j3 |= 64;
        }
        if (j3 == 0) {
            return 1L;
        }
        return j3;
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
        if (zzpu.zza() && zze().zza(zzbh.zzby) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zze().zzo().equals(str);
    }

    public final Object zzc(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return zza(zzm(str), obj, true, false, (String) null);
        }
        return zza(zzm(str), obj, false, false, (String) null);
    }

    private static boolean zzn(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public final boolean zzc(String str, String str2) {
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzm().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().zzm().zza("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
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
            zzjf.zza(bundle, Preconditions.checkNotNull(zzaeVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzaeVar.zze);
            String str = zzaeVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzbf zzbfVar = zzaeVar.zzg;
            if (zzbfVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbfVar.zza);
                zzbe zzbeVar = zzbfVar.zzb;
                if (zzbeVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbeVar.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzaeVar.zzh);
            zzbf zzbfVar2 = zzaeVar.zzi;
            if (zzbfVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbfVar2.zza);
                zzbe zzbeVar2 = zzbfVar2.zzb;
                if (zzbeVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbeVar2.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzaeVar.zzc.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzaeVar.zzj);
            zzbf zzbfVar3 = zzaeVar.zzk;
            if (zzbfVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbfVar3.zza);
                zzbe zzbeVar3 = zzbfVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbeVar3.zzb());
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

    private static boolean zzb(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public final boolean zzb(String str, String str2) {
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzm().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().zzm().zza("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
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
        if (zza(NotificationCompat.CATEGORY_EVENT, zzji.zza, zzji.zzb, str)) {
            return !zza(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int zza(int i10) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zza(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0065 -> B:8:0x0072). Please report as a decompilation issue!!! */
    public final long zza(Context context, String str) {
        zzt();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest zzu = zzu();
        long j3 = -1;
        if (zzu == null) {
            zzj().zzg().zza("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    zzj().zzg().zza("Package name not found", e2);
                }
                if (!zzb(context, str)) {
                    Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        j3 = zza(zzu.digest(signatureArr[0].toByteArray()));
                    } else {
                        zzj().zzu().zza("Could not get signatures");
                    }
                }
            }
            j3 = 0;
        }
        return j3;
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
        } catch (PackageManager.NameNotFoundException e2) {
            zzj().zzg().zza("Package name not found", e2);
            return true;
        } catch (CertificateException e10) {
            zzj().zzg().zza("Error obtaining certificate", e10);
            return true;
        }
    }

    public static long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i10 = 0;
        Preconditions.checkState(bArr.length > 0);
        long j3 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j3 += (bArr[length] & 255) << i10;
            i10 += 8;
        }
        return j3;
    }

    public static long zza(zzbe zzbeVar) {
        long j3 = 0;
        if (zzbeVar == null) {
            return 0L;
        }
        Iterator<String> it = zzbeVar.iterator();
        while (it.hasNext()) {
            if (zzbeVar.zzc(it.next()) instanceof Parcelable[]) {
                j3 += ((Parcelable[]) r3).length;
            }
        }
        return j3;
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

    public static long zza(long j3, long j10) {
        return ((j10 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j3) / com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Bundle zza(List<zzon> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzon zzonVar : list) {
            String str = zzonVar.zzd;
            if (str != null) {
                bundle.putString(zzonVar.zza, str);
            } else {
                Long l10 = zzonVar.zzc;
                if (l10 != null) {
                    bundle.putLong(zzonVar.zza, l10.longValue());
                } else {
                    Double d10 = zzonVar.zzf;
                    if (d10 != null) {
                        bundle.putDouble(zzonVar.zza, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public final Bundle zza(Uri uri, boolean z10) {
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
                str5 = z10 ? uri.getQueryParameter("gbraid") : null;
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
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z10 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
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
            if (z10 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (z10 && !TextUtils.isEmpty(queryParameter)) {
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
        } catch (UnsupportedOperationException e2) {
            zzj().zzu().zza("Install referrer url isn't a hierarchical URI", e2);
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
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
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

    public final Bundle zza(String str, String str2, Bundle bundle, List<String> list, boolean z10) {
        int zzl;
        zzos zzosVar = this;
        boolean zza2 = zza(str2, zzji.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int zzc = zze().zzc();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list == null || !list.contains(str3)) {
                zzl = !z10 ? zzosVar.zzl(str3) : 0;
                if (zzl == 0) {
                    zzl = zzosVar.zzk(str3);
                }
            } else {
                zzl = 0;
            }
            if (zzl != 0) {
                zza(bundle2, zzl, str3, zzl == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int zza3 = zza(str, str2, str3, bundle.get(str3), bundle2, list, z10, zza2);
                if (zza3 == 17) {
                    zza(bundle2, zza3, str3, Boolean.FALSE);
                } else if (zza3 != 0 && !"_ev".equals(str3)) {
                    zza(bundle2, zza3, zza3 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3)) {
                    int i11 = i10 + 1;
                    if (i11 > zzc) {
                        zzj().zzm().zza(a.i("Event can't contain more than ", zzc, " params"), zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i10 = i11;
                }
            }
            zzosVar = this;
        }
        return bundle2;
    }

    public final zzbf zza(String str, String str2, Bundle bundle, String str3, long j3, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zza(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            Bundle zza2 = zza(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
            if (z10) {
                zza2 = zza(zza2, str);
            }
            Preconditions.checkNotNull(zza2);
            return new zzbf(str2, new zzbe(zza2), str3, j3);
        }
        zzj().zzg().zza("Invalid conditional property event name", zzi().zzc(str2));
        throw new IllegalArgumentException();
    }

    private final Object zza(int i10, Object obj, boolean z10, boolean z11, String str) {
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
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
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
        return zza(String.valueOf(obj), i10, z10);
    }

    public static String zza(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return eb.j.k(str.substring(0, str.offsetByCodePoints(0, i10)), "...");
        }
        return null;
    }

    public final URL zza(long j3, String str, String str2, long j10, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j3), Integer.valueOf(zzg())), str2, str, Long.valueOf(j10));
            if (str.equals(zze().zzp())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            zzj().zzg().zza("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final void zza(Bundle bundle, long j3) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            zzj().zzu().zza("Params already contained engagement", Long.valueOf(j10));
        }
        bundle.putLong("_et", j3 + j10);
    }

    private static void zza(Bundle bundle, int i10, String str, Object obj) {
        if (zzb(bundle, i10)) {
            bundle.putString("_ev", zza(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void zza(zzlk zzlkVar, Bundle bundle, boolean z10) {
        if (bundle == null || zzlkVar == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && zzlkVar == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = zzlkVar.zza;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = zzlkVar.zzb;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", zzlkVar.zzc);
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

    public final void zza(Parcelable[] parcelableArr, int i10) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzh(str) && !zza(str, zzjk.zzd) && (i11 = i11 + 1) > i10) {
                    zzj().zzm().zza(a.i("Param can't contain more than ", i10, " item-scoped custom parameters"), zzi().zzb(str), zzi().zza(bundle));
                    zzb(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    public final void zza(zzgs zzgsVar, int i10) {
        Iterator it = new TreeSet(zzgsVar.zzc.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzh(str) && (i11 = i11 + 1) > i10) {
                zzj().zzm().zza(a.i("Event can't contain more than ", i10, " params"), zzi().zza(zzgsVar.zza), zzi().zza(zzgsVar.zzc));
                zzb(zzgsVar.zzc, 5);
                zzgsVar.zzc.remove(str);
            }
        }
    }

    public static void zza(zzor zzorVar, int i10, String str, String str2, int i11) {
        zza(zzorVar, (String) null, i10, str, str2, i11);
    }

    public static void zza(zzor zzorVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        zzb(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        zzorVar.zza(str, "_err", bundle);
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

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CampaignEx.JSON_KEY_AD_R, z10);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning boolean value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(CampaignEx.JSON_KEY_AD_R, arrayList);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning bundle list to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, Bundle bundle) {
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning bundle value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(CampaignEx.JSON_KEY_AD_R, bArr);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning byte array to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(CampaignEx.JSON_KEY_AD_R, i10);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning int value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong(CampaignEx.JSON_KEY_AD_R, j3);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning long value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_AD_R, str);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning string value to wrapper", e2);
        }
    }

    private final void zza(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int zzl;
        String str4;
        int zza2;
        char c10;
        if (bundle == null) {
            return;
        }
        int i10 = zze().zzq().zza(231100000, true) ? 35 : 0;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list == null || !list.contains(str5)) {
                zzl = !z10 ? zzl(str5) : 0;
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
                    zza2 = zza(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (zza2 != 0 && !"_ev".equals(str4)) {
                    zza(bundle, zza2, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (!zzh(str4) || zza(str4, zzjk.zzd)) {
                    c10 = 20064;
                } else {
                    int i12 = i11 + 1;
                    c10 = 20064;
                    if (!zza(231100000, true)) {
                        zzj().zzm().zza("Item array not supported on client's version of Google Play Services (Android Only)", zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle, 23);
                        bundle.remove(str4);
                    } else if (i12 > i10) {
                        zzj().zzm().zza(a.i("Item can't contain more than ", i10, " item-scoped custom params"), zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle, 28);
                        bundle.remove(str4);
                    }
                    i11 = i12;
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
                zzj().zzm().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgo.zza(str));
            }
            return false;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (zzn(str2)) {
                return true;
            }
            zzj().zzm().zza("Invalid admob_app_id. Analytics disabled.", zzgo.zza(str2));
            return false;
        }
        if (this.zzu.zzae()) {
            zzj().zzm().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final boolean zza(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        zzj().zzm().zza("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean zza(String str, String[] strArr, String str2) {
        return zza(str, strArr, (String[]) null, str2);
    }

    public final boolean zza(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z10;
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        int length = strArr3.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (str2.startsWith(strArr3[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            zzj().zzm().zza("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !zza(str2, strArr) || (strArr2 != null && zza(str2, strArr2))) {
            return true;
        }
        zzj().zzm().zza("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zza(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().zzv().zza("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public static boolean zza(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    public static boolean zza(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zza(int i10, boolean z10) {
        Boolean zzab = this.zzu.zzr().zzab();
        if (zzg() < i10 / 1000) {
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

    public static boolean zza(Context context, boolean z10) {
        Preconditions.checkNotNull(context);
        return zzc(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    @SuppressLint({"ApplySharedPref"})
    public final boolean zza(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString(Constants.DEEPLINK, str);
            edit.putLong(CampaignEx.JSON_KEY_TIMESTAMP, Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e2) {
            zzj().zzg().zza("Failed to persist Deferred Deep Link. exception", e2);
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
