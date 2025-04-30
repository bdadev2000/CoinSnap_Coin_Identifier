package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzapm {
    public final int zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzapm(int i9, @Nullable String str, int i10, @Nullable List list, byte[] bArr) {
        List unmodifiableList;
        this.zza = i9;
        this.zzb = str;
        this.zzc = i10;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzd = unmodifiableList;
        this.zze = bArr;
    }

    public final int zza() {
        int i9 = this.zzc;
        if (i9 != 2) {
            return i9 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
