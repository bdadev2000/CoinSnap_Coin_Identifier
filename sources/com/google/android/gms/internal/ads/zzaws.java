package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzaws extends zzaxt {
    private static final zzaxu zzh = new zzaxu();
    private final Context zzi;

    public zzaws(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, Context context) {
        super(zzawfVar, "lIDPVUPkMEk1KnSIojzWRzc28dDnPbiGtgyxpW7TpbmhRjdqd91I/FiR+wuEiwMR", "KJxrJ6uU/9eq7G+RMyslIXmSG1J2c6lM89WgXCr+3Fk=", zzasfVar, i10, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzn("E");
        AtomicReference zza = zzh.zza(this.zzi.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zze.invoke(null, this.zzi));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zzd) {
            this.zzd.zzn(zzatt.zza(str.getBytes(), true));
        }
    }
}
