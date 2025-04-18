package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzaa {
    String zza;
    int zzb;
    Boolean zzc;
    Boolean zzd;
    Long zze;
    Long zzf;

    public zzaa(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Boolean zza(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzfo.zzd r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzfo$zzd, double):java.lang.Boolean");
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();

    public static Boolean zza(String str, zzfo.zzf zzfVar, zzgo zzgoVar) {
        String zze;
        List<String> list;
        Preconditions.checkNotNull(zzfVar);
        if (str == null || !zzfVar.zzj() || zzfVar.zzb() == zzfo.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzfo.zzf.zzb zzb = zzfVar.zzb();
        zzfo.zzf.zzb zzbVar = zzfo.zzf.zzb.IN_LIST;
        if (zzb == zzbVar) {
            if (zzfVar.zza() == 0) {
                return null;
            }
        } else if (!zzfVar.zzi()) {
            return null;
        }
        zzfo.zzf.zzb zzb2 = zzfVar.zzb();
        boolean zzg = zzfVar.zzg();
        if (!zzg && zzb2 != zzfo.zzf.zzb.REGEXP && zzb2 != zzbVar) {
            zze = zzfVar.zze().toUpperCase(Locale.ENGLISH);
        } else {
            zze = zzfVar.zze();
        }
        String str2 = zze;
        if (zzfVar.zza() == 0) {
            list = null;
        } else {
            List<String> zzf = zzfVar.zzf();
            if (!zzg) {
                ArrayList arrayList = new ArrayList(zzf.size());
                Iterator<String> it = zzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                zzf = Collections.unmodifiableList(arrayList);
            }
            list = zzf;
        }
        return zza(str, zzb2, zzg, str2, list, zzb2 == zzfo.zzf.zzb.REGEXP ? str2 : null, zzgoVar);
    }

    private static Boolean zza(String str, zzfo.zzf.zzb zzbVar, boolean z10, String str2, List<String> list, String str3, zzgo zzgoVar) {
        if (str == null) {
            return null;
        }
        if (zzbVar == zzfo.zzf.zzb.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && zzbVar != zzfo.zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzw.zza[zzbVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z10 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzgoVar != null) {
                        zzgoVar.zzu().zza("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean zza(double d10, zzfo.zzd zzdVar) {
        try {
            return zza(new BigDecimal(d10), zzdVar, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zza(long j3, zzfo.zzd zzdVar) {
        try {
            return zza(new BigDecimal(j3), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zza(String str, zzfo.zzd zzdVar) {
        if (!zzoo.zzb(str)) {
            return null;
        }
        try {
            return zza(new BigDecimal(str), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zza(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }
}
