package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
public final class zziz extends zzex implements zzgd {
    private static final zziz zzb;
    private int zzd;
    private int zze;

    static {
        zziz zzizVar = new zziz();
        zzb = zzizVar;
        zzex.zzp(zziz.class, zzizVar);
    }

    private zziz() {
    }

    public static zziz zzw() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzex
    public final Object zzu(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzex.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zziy.zza});
        }
        if (i3 == 3) {
            return new zziz();
        }
        zziw zziwVar = null;
        if (i3 == 4) {
            return new zzix(zziwVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
