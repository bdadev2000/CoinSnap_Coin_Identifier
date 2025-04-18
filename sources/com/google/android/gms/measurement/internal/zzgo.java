package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes3.dex */
public final class zzgo extends zzjd {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzgq zzd;
    private final zzgq zze;
    private final zzgq zzf;
    private final zzgq zzg;
    private final zzgq zzh;
    private final zzgq zzi;
    private final zzgq zzj;
    private final zzgq zzk;
    private final zzgq zzl;

    public zzgo(zzhy zzhyVar) {
        super(zzhyVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgq(this, 6, false, false);
        this.zze = new zzgq(this, 6, true, false);
        this.zzf = new zzgq(this, 6, false, true);
        this.zzg = new zzgq(this, 5, false, false);
        this.zzh = new zzgq(this, 5, true, false);
        this.zzi = new zzgq(this, 5, false, true);
        this.zzj = new zzgq(this, 4, false, false);
        this.zzk = new zzgq(this, 3, false, false);
        this.zzl = new zzgq(this, 2, false, false);
    }

    private final String zzy() {
        String str;
        String str2;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzu.zzw() != null) {
                    str2 = this.zzu.zzw();
                } else {
                    str2 = "FA";
                }
                this.zzc = str2;
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final zzgq zzc() {
        return this.zzk;
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

    public final zzgq zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    public final boolean zzh() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    public final zzgq zzm() {
        return this.zzf;
    }

    public final zzgq zzn() {
        return this.zze;
    }

    public final zzgq zzo() {
        return this.zzj;
    }

    public final zzgq zzp() {
        return this.zzl;
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

    public final zzgq zzu() {
        return this.zzg;
    }

    public final zzgq zzv() {
        return this.zzi;
    }

    public final zzgq zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> zza;
        if (zzk().zzb == null || (zza = zzk().zzb.zza()) == null || zza == zzha.zza) {
            return null;
        }
        return a.m(String.valueOf(zza.second), ":", (String) zza.first);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return (com.google.android.gms.internal.measurement.zzok.zza() && zzbh.zzcg.zza(null).booleanValue()) ? "" : str;
        }
        return str.substring(0, lastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzgp(str);
    }

    public static String zza(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zza = zza(z10, obj);
        String zza2 = zza(z10, obj2);
        String zza3 = zza(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb2.append(str2);
            sb2.append(zza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(zza2);
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb2.append(str3);
            sb2.append(zza3);
        }
        return sb2.toString();
    }

    private static String zza(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
            String zzb = zzb(zzhy.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(zzb)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb2.toString();
        }
        if (!(obj instanceof zzgp)) {
            return z10 ? "-" : String.valueOf(obj);
        }
        str = ((zzgp) obj).zza;
        return str;
    }

    public final void zza(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && zza(i10)) {
            zza(i10, zza(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhv zzo = this.zzu.zzo();
        if (zzo == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!zzo.zzaf()) {
            zza(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= 9) {
            i10 = 8;
        }
        zzo.zzb(new zzgn(this, i10, str, obj, obj2, obj3));
    }

    public final void zza(int i10, String str) {
        Log.println(i10, zzy(), str);
    }

    public final boolean zza(int i10) {
        return Log.isLoggable(zzy(), i10);
    }
}
