package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public final class zzfr {
    private static final AtomicReference<String[]> zza = new AtomicReference<>();
    private static final AtomicReference<String[]> zzb = new AtomicReference<>();
    private static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzfu zzd;

    public zzfr(zzfu zzfuVar) {
        this.zzd = zzfuVar;
    }

    private final String zza(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder b = AbstractC2965e.b("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zza((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (b.length() != 1) {
                    b.append(", ");
                }
                b.append(valueOf);
            }
        }
        b.append("]");
        return b.toString();
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zza(str, zzip.zzb, zzip.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return AbstractC2914a.e("experiment_id(", str, ")");
        }
        return zza(str, zzis.zzb, zzis.zza, zzc);
    }

    public final String zza(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder b = AbstractC2965e.b("Bundle[{");
        for (String str : bundle.keySet()) {
            if (b.length() != 8) {
                b.append(", ");
            }
            b.append(zzb(str));
            b.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zza(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            b.append(valueOf);
        }
        b.append("}]");
        return b.toString();
    }

    public final String zza(zzbd zzbdVar) {
        String str = null;
        if (zzbdVar == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return zzbdVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbdVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbdVar.zza));
        sb.append(",params=");
        zzbc zzbcVar = zzbdVar.zzb;
        if (zzbcVar != null) {
            if (!this.zzd.zza()) {
                str = zzbcVar.toString();
            } else {
                str = zza(zzbcVar.zzb());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zziq.zzc, zziq.zza, zza);
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (Objects.equals(str, strArr[i9])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i9] == null) {
                            strArr3[i9] = strArr2[i9] + "(" + strArr[i9] + ")";
                        }
                        str2 = strArr3[i9];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }
}
