package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzayu extends zzazs {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzayu(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "KvkOAolI09ZSAixqGUOtipMDBdKXVlslzVnQOpfDZOEJW+xbFKrK173Gu3h1RVkI", "SkMlFTLt8H3eQLYvgf87g2pXBfp4xPpxL3RMs974XSU=", zzatpVar, i9, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                try {
                    if (zzi == null) {
                        zzi = (Long) this.zzf.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzp(zzi.longValue());
        }
    }
}
