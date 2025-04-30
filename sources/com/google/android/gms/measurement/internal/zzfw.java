package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzoi;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzfw extends zzii {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzfy zzd;
    private final zzfy zze;
    private final zzfy zzf;
    private final zzfy zzg;
    private final zzfy zzh;
    private final zzfy zzi;
    private final zzfy zzj;
    private final zzfy zzk;
    private final zzfy zzl;

    public zzfw(zzhj zzhjVar) {
        super(zzhjVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzfy(this, 6, false, false);
        this.zze = new zzfy(this, 6, true, false);
        this.zzf = new zzfy(this, 6, false, true);
        this.zzg = new zzfy(this, 5, false, false);
        this.zzh = new zzfy(this, 5, true, false);
        this.zzi = new zzfy(this, 5, false, true);
        this.zzj = new zzfy(this, 4, false, false);
        this.zzk = new zzfy(this, 3, false, false);
        this.zzl = new zzfy(this, 2, false, false);
    }

    private final String zzy() {
        String str;
        String str2;
        synchronized (this) {
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final zzfy zzc() {
        return this.zzk;
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

    public final zzfy zzg() {
        return this.zzd;
    }

    public final zzfy zzh() {
        return this.zzf;
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

    public final zzfy zzm() {
        return this.zze;
    }

    public final zzfy zzn() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    public final boolean zzo() {
        return false;
    }

    public final zzfy zzp() {
        return this.zzl;
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

    public final zzfy zzu() {
        return this.zzg;
    }

    public final zzfy zzv() {
        return this.zzi;
    }

    public final zzfy zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> zza;
        if (zzk().zzb == null || (zza = zzk().zzb.zza()) == null || zza == zzgh.zza) {
            return null;
        }
        return o.k(String.valueOf(zza.second), ":", (String) zza.first);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return (zzoi.zza() && zzbf.zzbw.zza(null).booleanValue()) ? "" : str;
        }
        return str.substring(0, lastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzfx(str);
    }

    public static String zza(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zza = zza(z8, obj);
        String zza2 = zza(z8, obj2);
        String zza3 = zza(z8, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb.append(str2);
            sb.append(zza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zza2);
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str3);
            sb.append(zza3);
        }
        return sb.toString();
    }

    private static String zza(boolean z8, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i9 = 0;
        if (obj instanceof Long) {
            if (!z8) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) >= 100) {
                String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
                String valueOf = String.valueOf(Math.abs(l.longValue()));
                return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            }
            return String.valueOf(obj);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z8 ? th.getClass().getName() : th.toString());
            String zzb = zzb(zzhj.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i9];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(zzb)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i9++;
            }
            return sb.toString();
        }
        if (!(obj instanceof zzfx)) {
            return z8 ? "-" : String.valueOf(obj);
        }
        str = ((zzfx) obj).zza;
        return str;
    }

    public final void zza(int i9, boolean z8, boolean z9, String str, Object obj, Object obj2, Object obj3) {
        if (!z8 && zza(i9)) {
            zza(i9, zza(false, str, obj, obj2, obj3));
        }
        if (z9 || i9 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhc zzo = this.zzu.zzo();
        if (zzo == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!zzo.zzaf()) {
            zza(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 >= 9) {
            i9 = 8;
        }
        zzo.zzb(new zzfv(this, i9, str, obj, obj2, obj3));
    }

    public final void zza(int i9, String str) {
        Log.println(i9, zzy(), str);
    }

    public final boolean zza(int i9) {
        return Log.isLoggable(zzy(), i9);
    }
}
