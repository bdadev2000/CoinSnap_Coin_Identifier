package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzou;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzag extends zzij {
    private Boolean zza;
    private String zzb;
    private zzai zzc;
    private Boolean zzd;

    public zzag(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzc = new zzai() { // from class: com.google.android.gms.measurement.internal.zzaf
            @Override // com.google.android.gms.measurement.internal.zzai
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static long zzh() {
        return zzbf.zzd.zza(null).longValue();
    }

    public static long zzm() {
        return zzbf.zzad.zza(null).longValue();
    }

    private final Bundle zzz() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().zzg().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(zza().getPackageName(), 128);
            if (applicationInfo == null) {
                zzj().zzg().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e4) {
            zzj().zzg().zza("Failed to load metadata: Package name not found", e4);
            return null;
        }
    }

    public final double zza(String str, zzfj<Double> zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfjVar.zza(null).doubleValue();
        }
        String zza = this.zzc.zza(str, zzfjVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfjVar.zza(null).doubleValue();
        }
        try {
            return zzfjVar.zza(Double.valueOf(Double.parseDouble(zza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzfjVar.zza(null).doubleValue();
        }
    }

    public final int zzb(String str, boolean z8) {
        return Math.max(zza(str, z8), NotificationCompat.FLAG_LOCAL_ONLY);
    }

    public final int zzc() {
        return (zzou.zza() && zze().zzf(null, zzbf.zzbx) && zzq().zza(231100000, true)) ? 35 : 0;
    }

    public final long zzd(String str) {
        return zzc(str, zzbf.zza);
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
        return zzq().zza(201500000, true) ? 100 : 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    public final String zzn() {
        return zza("debug.firebase.analytics.app", "");
    }

    public final String zzo() {
        return zza("debug.deferred.deeplink", "");
    }

    public final String zzp() {
        return this.zzb;
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

    public final boolean zzu() {
        Boolean zze = zze("google_analytics_adid_collection_enabled");
        if (zze != null && !zze.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzv() {
        Boolean zze = zze("google_analytics_automatic_screen_reporting_enabled");
        if (zze != null && !zze.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzw() {
        Boolean zze = zze("firebase_analytics_collection_deactivated");
        if (zze != null && zze.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zze = zze("app_measurement_lite");
            this.zza = zze;
            if (zze == null) {
                this.zza = Boolean.FALSE;
            }
        }
        if (!this.zza.booleanValue() && this.zzu.zzag()) {
            return false;
        }
        return true;
    }

    public final boolean zzy() {
        boolean z8;
        if (this.zzd == null) {
            synchronized (this) {
                try {
                    if (this.zzd == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str != null && str.equals(myProcessName)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.zzd = Boolean.valueOf(z8);
                        }
                        if (this.zzd == null) {
                            this.zzd = Boolean.TRUE;
                            zzj().zzg().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzd.booleanValue();
    }

    public final int zzb(String str) {
        return zza(str, zzbf.zzai, 25, 100);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    public final Boolean zze(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzz = zzz();
        if (zzz == null) {
            zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (zzz.containsKey(str)) {
            return Boolean.valueOf(zzz.getBoolean(str));
        }
        return null;
    }

    public final String zzf(String str) {
        return zzd(str, zzbf.zzal);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> zzg(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzz()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.zzfw r4 = r3.zzj()
            com.google.android.gms.measurement.internal.zzfy r4 = r4.zzg()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zza(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zza()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzfw r0 = r3.zzj()
            com.google.android.gms.measurement.internal.zzfy r0 = r0.zzg()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zza(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzg(java.lang.String):java.util.List");
    }

    public final boolean zzi(String str) {
        return zzf(str, zzbf.zzak);
    }

    public final boolean zzj(String str) {
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzk(String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    public final int zzb(String str, zzfj<Integer> zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfjVar.zza(null).intValue();
        }
        String zza = this.zzc.zza(str, zzfjVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfjVar.zza(null).intValue();
        }
        try {
            return zzfjVar.zza(Integer.valueOf(Integer.parseInt(zza))).intValue();
        } catch (NumberFormatException unused) {
            return zzfjVar.zza(null).intValue();
        }
    }

    public final String zzd(String str, zzfj<String> zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfjVar.zza(null);
        }
        return zzfjVar.zza(this.zzc.zza(str, zzfjVar.zza()));
    }

    public final boolean zzf(String str, zzfj<Boolean> zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfjVar.zza(null).booleanValue();
        }
        String zza = this.zzc.zza(str, zzfjVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfjVar.zza(null).booleanValue();
        }
        return zzfjVar.zza(Boolean.valueOf("1".equals(zza))).booleanValue();
    }

    public final void zzh(String str) {
        this.zzb = str;
    }

    public final int zzc(String str) {
        return zzb(str, zzbf.zzo);
    }

    public final long zzc(String str, zzfj<Long> zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfjVar.zza(null).longValue();
        }
        String zza = this.zzc.zza(str, zzfjVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfjVar.zza(null).longValue();
        }
        try {
            return zzfjVar.zza(Long.valueOf(Long.parseLong(zza))).longValue();
        } catch (NumberFormatException unused) {
            return zzfjVar.zza(null).longValue();
        }
    }

    public final boolean zze(String str, zzfj<Boolean> zzfjVar) {
        return zzf(str, zzfjVar);
    }

    public final int zza(String str) {
        return zza(str, zzbf.zzah, 500, 2000);
    }

    public final int zza(String str, boolean z8) {
        if (!zzop.zza() || !zze().zzf(null, zzbf.zzcn)) {
            return 100;
        }
        if (z8) {
            return zza(str, zzbf.zzar, 100, 500);
        }
        return 500;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final int zza(String str, zzfj<Integer> zzfjVar, int i9, int i10) {
        return Math.max(Math.min(zzb(str, zzfjVar), i10), i9);
    }

    public final zzim zzc(String str, boolean z8) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle zzz = zzz();
        if (zzz == null) {
            zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = zzz.get(str);
        }
        if (obj == null) {
            return zzim.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzim.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzim.DENIED;
        }
        if (z8 && "eu_consent_policy".equals(obj)) {
            return zzim.POLICY;
        }
        zzj().zzu().zza("Invalid manifest metadata for", str);
        return zzim.UNINITIALIZED;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private final String zza(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e4) {
            zzj().zzg().zza("Could not find SystemProperties class", e4);
            return str2;
        } catch (IllegalAccessException e9) {
            zzj().zzg().zza("Could not access SystemProperties.get()", e9);
            return str2;
        } catch (NoSuchMethodException e10) {
            zzj().zzg().zza("Could not find SystemProperties.get() method", e10);
            return str2;
        } catch (InvocationTargetException e11) {
            zzj().zzg().zza("SystemProperties.get() threw an exception", e11);
            return str2;
        }
    }

    public final void zza(zzai zzaiVar) {
        this.zzc = zzaiVar;
    }

    public final boolean zza(zzfj<Boolean> zzfjVar) {
        return zzf(null, zzfjVar);
    }
}
