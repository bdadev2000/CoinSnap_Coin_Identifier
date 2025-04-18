package com.google.android.gms.internal.play_billing;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class zzcz {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzdd zzb;

    static {
        zzdd zzdeVar;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                zzdeVar = new zzde();
                break;
            }
            try {
                zzdeVar = (zzdd) Class.forName(zza[i2]).asSubclass(zzdd.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzdeVar = null;
            }
            if (zzdeVar != null) {
                break;
            } else {
                i2++;
            }
        }
        zzb = zzdeVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i2) {
        zzda.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
