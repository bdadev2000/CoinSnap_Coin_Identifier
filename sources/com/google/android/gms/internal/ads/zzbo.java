package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes4.dex */
public class zzbo extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbo(@Nullable String str, @Nullable Throwable th, boolean z2, int i2) {
        super(str, th);
        this.zza = z2;
        this.zzb = i2;
    }

    public static zzbo zza(@Nullable String str, @Nullable Throwable th) {
        return new zzbo(str, th, true, 1);
    }

    public static zzbo zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzbo(str, th, true, 0);
    }

    public static zzbo zzc(@Nullable String str) {
        return new zzbo(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        StringBuilder B = androidx.compose.foundation.text.input.a.B(super.getMessage(), "{contentIsMalformed=");
        B.append(this.zza);
        B.append(", dataType=");
        return androidx.compose.foundation.text.input.a.n(B, this.zzb, "}");
    }
}
