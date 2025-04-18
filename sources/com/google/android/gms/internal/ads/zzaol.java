package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzaol {
    public final int zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzaol(int i2, @Nullable String str, int i3, @Nullable List list, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = i3;
        this.zzd = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i2 = this.zzc;
        return i2 != 2 ? i2 != 3 ? 0 : 512 : Opcodes.ACC_STRICT;
    }
}
