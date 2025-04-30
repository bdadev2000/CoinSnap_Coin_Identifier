package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhgw implements zzhbs {
    ACTION_UNSPECIFIED(0),
    PROCEED(1),
    DISCARD(2),
    KEEP(3),
    CLOSE(4),
    CANCEL(5),
    DISMISS(6),
    BACK(7),
    OPEN_SUBPAGE(8),
    PROCEED_DEEP_SCAN(9),
    OPEN_LEARN_MORE_LINK(10);

    private static final zzhbt zzl = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhgu
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhgw.zzb(i9);
        }
    };
    private final int zzn;

    zzhgw(int i9) {
        this.zzn = i9;
    }

    public static zzhgw zzb(int i9) {
        switch (i9) {
            case 0:
                return ACTION_UNSPECIFIED;
            case 1:
                return PROCEED;
            case 2:
                return DISCARD;
            case 3:
                return KEEP;
            case 4:
                return CLOSE;
            case 5:
                return CANCEL;
            case 6:
                return DISMISS;
            case 7:
                return BACK;
            case 8:
                return OPEN_SUBPAGE;
            case 9:
                return PROCEED_DEEP_SCAN;
            case 10:
                return OPEN_LEARN_MORE_LINK;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzn;
    }
}
