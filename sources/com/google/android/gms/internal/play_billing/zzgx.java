package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzgx extends zzcs implements zzed {
    private static final zzgx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzgx zzgxVar = new zzgx();
        zzb = zzgxVar;
        zzcs.zzt(zzgx.class, zzgxVar);
    }

    private zzgx() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    zzgv zzgvVar = null;
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgw(zzgvVar);
                }
                return new zzgx();
            }
            return zzcs.zzq(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
