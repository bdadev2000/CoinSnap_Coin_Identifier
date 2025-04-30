package com.google.android.gms.internal.location;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzbn {
    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String sb;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str2, (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 9 + name2.length());
                    AbstractC2914a.j(sb4, "<", sb3, " threw ", name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i10] = sb;
            i10++;
        }
        StringBuilder sb5 = new StringBuilder((length * 16) + str.length());
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i11, indexOf);
            sb5.append(objArr[i9]);
            i11 = indexOf + 2;
            i9++;
        }
        sb5.append((CharSequence) str, i11, str.length());
        if (i9 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb5.append(", ");
                sb5.append(objArr[i12]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
