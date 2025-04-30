package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazk extends zzazs {
    private final StackTraceElement[] zzi;

    public zzazk(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, StackTraceElement[] stackTraceElementArr) {
        super(zzayeVar, "9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", zzatpVar, i9, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavc zzavcVar;
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzaxv zzaxvVar = new zzaxv((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                try {
                    this.zze.zzL(zzaxvVar.zza.longValue());
                    if (zzaxvVar.zzb.booleanValue()) {
                        zzatp zzatpVar = this.zze;
                        if (zzaxvVar.zzc.booleanValue()) {
                            zzavcVar = zzavc.ENUM_FALSE;
                        } else {
                            zzavcVar = zzavc.ENUM_TRUE;
                        }
                        zzatpVar.zzA(zzavcVar);
                    } else {
                        this.zze.zzA(zzavc.ENUM_FAILURE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
