package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhx extends zzhv {
    public final int zzd;

    @Nullable
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhx(int i9, @Nullable String str, @Nullable IOException iOException, Map map, zzhh zzhhVar, byte[] bArr) {
        super(o.h(i9, "Response code: "), iOException, zzhhVar, 2004, 1);
        this.zzd = i9;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
