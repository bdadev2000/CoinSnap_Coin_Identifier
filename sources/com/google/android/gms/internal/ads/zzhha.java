package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhha implements zzhbs {
    SURFACE_UNSPECIFIED(0),
    BUBBLE_MAINPAGE(1),
    BUBBLE_SUBPAGE(2),
    DOWNLOADS_PAGE(3),
    DOWNLOAD_PROMPT(4),
    DOWNLOAD_NOTIFICATION(5);

    private static final zzhbt zzg = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhgy
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhha.zzb(i9);
        }
    };
    private final int zzi;

    zzhha(int i9) {
        this.zzi = i9;
    }

    public static zzhha zzb(int i9) {
        if (i9 == 0) {
            return SURFACE_UNSPECIFIED;
        }
        if (i9 == 1) {
            return BUBBLE_MAINPAGE;
        }
        if (i9 == 2) {
            return BUBBLE_SUBPAGE;
        }
        if (i9 == 3) {
            return DOWNLOADS_PAGE;
        }
        if (i9 == 4) {
            return DOWNLOAD_PROMPT;
        }
        if (i9 != 5) {
            return null;
        }
        return DOWNLOAD_NOTIFICATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzi;
    }
}
