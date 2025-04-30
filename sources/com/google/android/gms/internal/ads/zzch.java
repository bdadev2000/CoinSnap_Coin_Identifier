package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public class zzch extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzch(@Nullable String str, @Nullable Throwable th, boolean z8, int i9) {
        super(str, th);
        this.zza = z8;
        this.zzb = i9;
    }

    public static zzch zza(@Nullable String str, @Nullable Throwable th) {
        return new zzch(str, th, true, 1);
    }

    public static zzch zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzch(str, th, true, 0);
    }

    public static zzch zzc(@Nullable String str) {
        return new zzch(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        StringBuilder c9 = AbstractC2965e.c(super.getMessage(), "{contentIsMalformed=");
        c9.append(this.zza);
        c9.append(", dataType=");
        return AbstractC2914a.g(c9, this.zzb, "}");
    }
}
