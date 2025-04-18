package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxl extends zzaxt {
    private final StackTraceElement[] zzh;

    public zzaxl(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzawfVar, "XiB4JwXCMuAhsrPKvk3dS2LvKyxjCmXSaJ2VZGWg6jlAdLRjKnhTMhSQBaeXXZDY", "3gV4tnMlvvkjR90RI+zlkPr5OOXNb6rIM0OBAfjFnhQ=", zzasfVar, i10, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            int i10 = 1;
            zzavw zzavwVar = new zzavw((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                this.zzd.zzF(zzavwVar.zza.longValue());
                if (zzavwVar.zzb.booleanValue()) {
                    zzasf zzasfVar = this.zzd;
                    if (true != zzavwVar.zzc.booleanValue()) {
                        i10 = 2;
                    }
                    zzasfVar.zzac(i10);
                } else {
                    this.zzd.zzac(3);
                }
            }
        }
    }
}
