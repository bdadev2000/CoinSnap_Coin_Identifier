package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzge extends IOException {
    public final int zza;

    public zzge(int i10) {
        this.zza = i10;
    }

    public zzge(@Nullable String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzge(@Nullable String str, @Nullable Throwable th2, int i10) {
        super(str, th2);
        this.zza = i10;
    }

    public zzge(@Nullable Throwable th2, int i10) {
        super(th2);
        this.zza = i10;
    }
}
