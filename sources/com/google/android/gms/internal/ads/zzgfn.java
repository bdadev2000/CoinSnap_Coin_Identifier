package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzgfn {
    private final InputStream zza;

    private zzgfn(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgfn zzb(byte[] bArr) {
        return new zzgfn(new ByteArrayInputStream(bArr));
    }

    public final zzgum zza() throws IOException {
        try {
            return zzgum.zzg(this.zza, zzgyh.zza());
        } finally {
            this.zza.close();
        }
    }
}
