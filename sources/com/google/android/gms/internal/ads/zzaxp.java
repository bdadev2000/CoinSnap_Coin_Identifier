package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxp extends zzaxt {
    public zzaxp(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "88ETcPLh1JYg+nQ5zdwp+6acsWFKzCMthjLOw7XatJOMkLvYw0fl0jJT3ig1Ktkw", "AW0WUdAlySbPNJG5w1IgQqYKXV7WN2hB/EQpNB2ZwfA=", zzasfVar, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzag(3);
        boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (this.zzd) {
            if (booleanValue) {
                this.zzd.zzag(2);
            } else {
                this.zzd.zzag(1);
            }
        }
    }
}
