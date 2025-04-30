package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class zzk {

    @Nullable
    private zzi zzh;
    public static final zzk zza = new zzk(0, 0, 1, 1, 0, null);
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);
    private static final String zzf = Integer.toString(3, 36);
    private static final String zzg = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zze
    };

    public /* synthetic */ zzk(int i9, int i10, int i11, int i12, int i13, zzj zzjVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzk.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 486696559;
    }

    @RequiresApi(21)
    public final zzi zza() {
        if (this.zzh == null) {
            this.zzh = new zzi(this, null);
        }
        return this.zzh;
    }
}
