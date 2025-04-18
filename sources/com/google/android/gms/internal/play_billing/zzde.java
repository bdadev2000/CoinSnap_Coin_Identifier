package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class zzde implements zzdd {
    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final StackTraceElement zza(Class cls, int i2) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i3 = 3;
        boolean z2 = false;
        while (true) {
            if (i3 >= stackTrace.length) {
                i3 = -1;
                break;
            }
            if (stackTrace[i3].getClassName().equals(name)) {
                z2 = true;
            } else {
                if (z2) {
                    break;
                }
                z2 = false;
            }
            i3++;
        }
        if (i3 != -1) {
            return stackTrace[i3];
        }
        return null;
    }
}
