package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazl extends zzazs {
    public zzazl(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "6JHAw9/xzu8LcH4q9f7Udi9sTntehS9dfukXhX8DEHhp54WYBhd6ZhWkqnOAMGmY", "bFK3lRg0oaTUwYDrSsMiLa/j4LG9nRlI5KKEyt63x08=", zzatpVar, i9, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzaxz zzaxzVar = new zzaxz((String) this.zzf.invoke(null, null));
            this.zze.zzq(zzaxzVar.zza.longValue());
            this.zze.zzr(zzaxzVar.zzb.longValue());
        }
    }
}
