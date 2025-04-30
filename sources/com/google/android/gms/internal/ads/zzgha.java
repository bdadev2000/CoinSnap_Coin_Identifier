package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class zzgha {
    private final OutputStream zza;

    private zzgha(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgha zzb(OutputStream outputStream) {
        return new zzgha(outputStream);
    }

    public final void zza(zzgwu zzgwuVar) throws IOException {
        try {
            zzgwuVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
