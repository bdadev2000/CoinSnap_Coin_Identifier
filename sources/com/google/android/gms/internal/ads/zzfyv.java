package com.google.android.gms.internal.ads;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzfyv {
    public static String zza(String str) {
        if (zzfyf.zza(str)) {
            return null;
        }
        return str;
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String j7;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                j7 = "null";
            } else {
                try {
                    j7 = obj.toString();
                } catch (Exception e4) {
                    String k6 = o.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(k6), (Throwable) e4);
                    j7 = n0.j("<", k6, " threw ", e4.getClass().getName(), ">");
                }
            }
            objArr[i10] = j7;
            i10++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i11, indexOf);
            sb.append(objArr[i9]);
            i11 = indexOf + 2;
            i9++;
        }
        sb.append((CharSequence) str, i11, str.length());
        if (i9 < length2) {
            sb.append(" [");
            sb.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb.append(", ");
                sb.append(objArr[i12]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String zzc(String str) {
        return str == null ? "" : str;
    }

    public static boolean zzd(String str) {
        return zzfyf.zza(str);
    }
}
