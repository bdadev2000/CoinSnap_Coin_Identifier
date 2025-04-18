package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import eb.j;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgw extends zzgu {
    public final int zzc;

    public zzgw(int i10, @Nullable String str, @Nullable IOException iOException, Map map, zzgi zzgiVar, byte[] bArr) {
        super(j.i("Response code: ", i10), iOException, zzgiVar, 2004, 1);
        this.zzc = i10;
    }
}
