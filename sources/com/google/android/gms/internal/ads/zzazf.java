package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazf extends zzazs {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzazf(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "+pOuZc4XP/KXmz3ZcR0Th/zrptiqFMKeADXdr6ffDtBODTAlpCvFIUU/DK0sXoAh", "l4qa5EABhdRHJHltXD4U8dy0wNZl4oyoZ9TbFONnMI4=", zzatpVar, i9, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzG("E");
        if (zzi == null) {
            synchronized (zzj) {
                try {
                    if (zzi == null) {
                        zzi = (String) this.zzf.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzG(zzi);
        }
    }
}
