package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
public final class zziv extends zzex implements zzgd {
    private static final zziv zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzio zzg;

    static {
        zziv zzivVar = new zziv();
        zzb = zzivVar;
        zzex.zzp(zziv.class, zzivVar);
    }

    private zziv() {
    }

    public static /* synthetic */ void zzA(zziv zzivVar, zzic zzicVar) {
        zzivVar.zzf = zzicVar;
        zzivVar.zze = 3;
    }

    public static zziu zzv() {
        return (zziu) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zziv zzivVar, zziz zzizVar) {
        zzivVar.zzf = zzizVar;
        zzivVar.zze = 4;
    }

    public static /* synthetic */ void zzy(zziv zzivVar, zzio zzioVar) {
        zzivVar.zzg = zzioVar;
        zzivVar.zzd |= 1;
    }

    public static /* synthetic */ void zzz(zziv zzivVar, zzhy zzhyVar) {
        zzivVar.zzf = zzhyVar;
        zzivVar.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzex
    public final Object zzu(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzex.zzm(zzb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzhy.class, zzic.class, zziz.class, zzil.class});
        }
        if (i3 == 3) {
            return new zziv();
        }
        zzit zzitVar = null;
        if (i3 == 4) {
            return new zziu(zzitVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
