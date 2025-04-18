package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import eb.j;
import java.io.IOException;
import vd.e;

/* loaded from: classes3.dex */
public class zzbh extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbh(@Nullable String str, @Nullable Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzbh zza(@Nullable String str, @Nullable Throwable th2) {
        return new zzbh(str, th2, true, 1);
    }

    public static zzbh zzb(@Nullable String str, @Nullable Throwable th2) {
        return new zzbh(str, th2, true, 0);
    }

    public static zzbh zzc(@Nullable String str) {
        return new zzbh(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        StringBuilder n10 = j.n(super.getMessage(), " {contentIsMalformed=");
        n10.append(this.zza);
        n10.append(", dataType=");
        return e.g(n10, this.zzb, "}");
    }
}
