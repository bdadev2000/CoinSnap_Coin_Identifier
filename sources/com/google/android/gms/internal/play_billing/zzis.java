package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
public final class zzis extends zzex implements zzgd {
    private static final zzis zzb;
    private int zzd;
    private int zze;

    static {
        zzis zzisVar = new zzis();
        zzb = zzisVar;
        zzex.zzp(zzis.class, zzisVar);
    }

    private zzis() {
    }

    public static zziq zzv() {
        return (zziq) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzis zzisVar, int i2) {
        zzisVar.zze = i2 - 1;
        zzisVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzex
    public final Object zzu(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzex.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzir.zza});
        }
        if (i3 == 3) {
            return new zzis();
        }
        if (i3 == 4) {
            return new zziq(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
