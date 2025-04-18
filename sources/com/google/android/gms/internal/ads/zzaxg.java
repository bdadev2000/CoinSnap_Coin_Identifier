package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxg extends zzaxt {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzaxg(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "PDdqBkuC/wlZj3D1GonYQW5lEcio5HWZDbvjL/QlEgG/4K0ExN3jw7lwkOOq3/t+", "G3wZ8gDu6u4efTKrvmsEHv1YK8hQgMyBIdhh8ClIQBY=", zzasfVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzB("E");
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (String) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzB(zzh);
        }
    }
}
