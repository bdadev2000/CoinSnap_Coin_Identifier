package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzhb extends zzcs implements zzed {
    private static final zzhb zzb;
    private int zzd;
    private int zze;

    static {
        zzhb zzhbVar = new zzhb();
        zzb = zzhbVar;
        zzcs.zzt(zzhb.class, zzhbVar);
    }

    private zzhb() {
    }

    public static /* synthetic */ void zzA(zzhb zzhbVar, int i9) {
        zzhbVar.zze = i9 - 1;
        zzhbVar.zzd |= 1;
    }

    public static zzgz zzy() {
        return (zzgz) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgz(null);
                }
                return new zzhb();
            }
            return zzcs.zzq(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzha.zza});
        }
        return (byte) 1;
    }
}
