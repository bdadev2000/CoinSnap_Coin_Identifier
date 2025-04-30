package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazo extends zzazs {
    public zzazo(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "5HcA415u1KU8m2yVlDZBhQQK+0IFNRmmWPxuAq0DnfPzSdJ/uWlnYMD1kKfkH6cZ", "u7Ufq5yuXkEXg69T8jpWuOOX55Q9g2DSVI1gtbNUvY8=", zzatpVar, i9, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(zzavc.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            try {
                if (booleanValue) {
                    this.zze.zzaa(zzavc.ENUM_TRUE);
                } else {
                    this.zze.zzaa(zzavc.ENUM_FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
