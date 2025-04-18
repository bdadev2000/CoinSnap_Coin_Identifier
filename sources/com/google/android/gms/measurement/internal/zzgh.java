package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.common.internal.Preconditions;
import eb.j;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzgh {
    private static final AtomicReference<String[]> zza = new AtomicReference<>();
    private static final AtomicReference<String[]> zzb = new AtomicReference<>();
    private static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzgk zzd;

    public zzgh(zzgk zzgkVar) {
        this.zzd = zzgkVar;
    }

    private final String zza(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder m10 = j.m("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zza((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (m10.length() != 1) {
                    m10.append(", ");
                }
                m10.append(valueOf);
            }
        }
        m10.append("]");
        return m10.toString();
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zza(str, zzjk.zzb, zzjk.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return e.f("experiment_id(", str, ")");
        }
        return zza(str, zzjj.zzb, zzjj.zza, zzc);
    }

    public final String zza(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder m10 = j.m("Bundle[{");
        for (String str : bundle.keySet()) {
            if (m10.length() != 8) {
                m10.append(", ");
            }
            m10.append(zzb(str));
            m10.append("=");
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
            m10.append(valueOf);
        }
        m10.append("}]");
        return m10.toString();
    }

    public final String zza(zzbf zzbfVar) {
        String str = null;
        if (zzbfVar == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return zzbfVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbfVar.zzc);
        sb2.append(",name=");
        sb2.append(zza(zzbfVar.zza));
        sb2.append(",params=");
        zzbe zzbeVar = zzbfVar.zzb;
        if (zzbeVar != null) {
            if (!this.zzd.zza()) {
                str = zzbeVar.toString();
            } else {
                str = zza(zzbeVar.zzb());
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zzji.zzc, zzji.zza, zza);
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i10] == null) {
                        strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                    }
                    str2 = strArr3[i10];
                }
                return str2;
            }
        }
        return str;
    }
}
