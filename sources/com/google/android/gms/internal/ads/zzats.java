package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzats implements zzhbs {
    DEBUGGER_STATE_UNSPECIFIED(0),
    DEBUGGER_STATE_NOT_INSTALLED(1),
    DEBUGGER_STATE_INSTALLED(2),
    DEBUGGER_STATE_ACTIVE(3),
    DEBUGGER_STATE_ENVVAR(4),
    DEBUGGER_STATE_MACHPORT(5),
    DEBUGGER_STATE_ENVVAR_MACHPORT(6);

    private static final zzhbt zzh = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzatq
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzats.zzb(i9);
        }
    };
    private final int zzj;

    zzats(int i9) {
        this.zzj = i9;
    }

    public static zzats zzb(int i9) {
        switch (i9) {
            case 0:
                return DEBUGGER_STATE_UNSPECIFIED;
            case 1:
                return DEBUGGER_STATE_NOT_INSTALLED;
            case 2:
                return DEBUGGER_STATE_INSTALLED;
            case 3:
                return DEBUGGER_STATE_ACTIVE;
            case 4:
                return DEBUGGER_STATE_ENVVAR;
            case 5:
                return DEBUGGER_STATE_MACHPORT;
            case 6:
                return DEBUGGER_STATE_ENVVAR_MACHPORT;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzj;
    }
}
