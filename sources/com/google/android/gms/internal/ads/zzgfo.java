package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class zzgfo {
    private final OutputStream zza;

    private zzgfo(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgfo zzb(OutputStream outputStream) {
        return new zzgfo(outputStream);
    }

    public final void zza(zzgum zzgumVar) throws IOException {
        try {
            zzgumVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
