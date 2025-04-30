package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzayr extends zzazs {
    private static final zzazt zzi = new zzazt();
    private final Context zzj;

    public zzayr(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, Context context) {
        super(zzayeVar, "LYoHKR17UvbUNibqKPKJklawQJNaw1zk7CnhZAC68YBTzC7x4MYQVXp9Sihs98Ok", "ngqbGKXcQCvq0ft27xRzOzNoEVN+ei+Vq2+CNx9QQMc=", zzatpVar, i9, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzo("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zzf.invoke(null, this.zzj));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzo(zzavo.zza(str.getBytes(), true));
        }
    }
}
