package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
public final class zzhy extends zzex implements zzgd {
    private static final zzhy zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzii zzh;

    static {
        zzhy zzhyVar = new zzhy();
        zzb = zzhyVar;
        zzex.zzp(zzhy.class, zzhyVar);
    }

    private zzhy() {
    }

    public static /* synthetic */ void zzA(zzhy zzhyVar, int i2) {
        zzhyVar.zzg = i2 - 1;
        zzhyVar.zzd |= 1;
    }

    public static zzhx zzv() {
        return (zzhx) zzb.zzg();
    }

    public static zzhy zzx(byte[] bArr, zzej zzejVar) throws zzff {
        return (zzhy) zzex.zzj(zzb, bArr, zzejVar);
    }

    public static /* synthetic */ void zzy(zzhy zzhyVar, zzii zziiVar) {
        zziiVar.getClass();
        zzhyVar.zzh = zziiVar;
        zzhyVar.zzd |= 2;
    }

    public static /* synthetic */ void zzz(zzhy zzhyVar, zzis zzisVar) {
        zzisVar.getClass();
        zzhyVar.zzf = zzisVar;
        zzhyVar.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzex
    public final Object zzu(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzex.zzm(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzhz.zza, "zzh", zzis.class});
        }
        if (i3 == 3) {
            return new zzhy();
        }
        zzhw zzhwVar = null;
        if (i3 == 4) {
            return new zzhx(zzhwVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
