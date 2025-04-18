package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzfqr {
    public static boolean zza(int i10) {
        int i11 = i10 - 1;
        return i11 == 2 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int zzb(android.content.Context r14, com.google.android.gms.internal.ads.zzfpp r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqr.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfpp):int");
    }

    private static final String zzc(Context context, zzfpp zzfppVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfxe.OS_ARCH.zza();
        if (!TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e2) {
            zzfppVar.zzc(2024, 0L, e2);
        } catch (NoSuchFieldException e10) {
            zzfppVar.zzc(2024, 0L, e10);
        }
        String str = Build.CPU_ABI;
        if (str != null) {
            return str;
        }
        return Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfpp zzfppVar) {
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(zzfxe.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        zzfppVar.zzb(4007, sb2.toString());
    }
}
