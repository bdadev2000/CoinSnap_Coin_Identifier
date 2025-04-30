package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhjp implements zzhbs {
    UNDEFINED(0),
    BROWSER_INITIATED(1),
    RENDERER_INITIATED_WITHOUT_USER_GESTURE(2),
    RENDERER_INITIATED_WITH_USER_GESTURE(3),
    COPY_PASTE_USER_INITIATED(4),
    NOTIFICATION_INITIATED(5);

    private static final zzhbt zzg = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhjn
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhjp.zzb(i9);
        }
    };
    private final int zzi;

    zzhjp(int i9) {
        this.zzi = i9;
    }

    public static zzhjp zzb(int i9) {
        if (i9 == 0) {
            return UNDEFINED;
        }
        if (i9 == 1) {
            return BROWSER_INITIATED;
        }
        if (i9 == 2) {
            return RENDERER_INITIATED_WITHOUT_USER_GESTURE;
        }
        if (i9 == 3) {
            return RENDERER_INITIATED_WITH_USER_GESTURE;
        }
        if (i9 == 4) {
            return COPY_PASTE_USER_INITIATED;
        }
        if (i9 != 5) {
            return null;
        }
        return NOTIFICATION_INITIATED;
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
