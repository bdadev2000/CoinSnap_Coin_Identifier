package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxi extends zzaxt {
    public zzaxi(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "znXH0RM1XxCTrwmP7d8xA6zmeZad4bsyeawjZRDuwEtKXTURGEnX+tv9VD8MEWrm", "W+zVAKx2eduhDPC6RoJgOXSegMcVlCiHMJF4lAq9BYw=", zzasfVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasf zzasfVar = this.zzd;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzasfVar.zzaf(i10);
        } catch (InvocationTargetException unused) {
            this.zzd.zzaf(3);
        }
    }
}
