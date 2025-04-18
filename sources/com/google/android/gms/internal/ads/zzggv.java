package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class zzggv {
    private final OutputStream zza;

    private zzggv(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzggv zzb(OutputStream outputStream) {
        return new zzggv(outputStream);
    }

    public final void zza(zzgwn zzgwnVar) throws IOException {
        try {
            zzgwnVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
