package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzgh extends IOException {
    public final int zza;

    public zzgh(int i2) {
        this.zza = i2;
    }

    public zzgh(@Nullable String str, int i2) {
        super(str);
        this.zza = i2;
    }

    public zzgh(@Nullable String str, @Nullable Throwable th, int i2) {
        super(str, th);
        this.zza = i2;
    }

    public zzgh(@Nullable Throwable th, int i2) {
        super(th);
        this.zza = i2;
    }
}
