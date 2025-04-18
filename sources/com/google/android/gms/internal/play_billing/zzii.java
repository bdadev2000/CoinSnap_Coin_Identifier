package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
public final class zzii extends zzex implements zzgd {
    private static final zzii zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzii zziiVar = new zzii();
        zzb = zziiVar;
        zzex.zzp(zzii.class, zziiVar);
    }

    private zzii() {
    }

    public static /* synthetic */ void zzA(zzii zziiVar, int i2) {
        zziiVar.zzg = i2 - 1;
        zziiVar.zzd |= 4;
    }

    public static zzie zzv() {
        return (zzie) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzii zziiVar, int i2) {
        zziiVar.zzd |= 1;
        zziiVar.zze = i2;
    }

    public static /* synthetic */ void zzy(zzii zziiVar, String str) {
        str.getClass();
        zziiVar.zzd |= 2;
        zziiVar.zzf = str;
    }

    public static /* synthetic */ void zzz(zzii zziiVar, String str) {
        zziiVar.zzd |= 8;
        zziiVar.zzh = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzex
    public final Object zzu(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzex.zzm(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzig.zza, "zzh"});
        }
        if (i3 == 3) {
            return new zzii();
        }
        if (i3 == 4) {
            return new zzie(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
