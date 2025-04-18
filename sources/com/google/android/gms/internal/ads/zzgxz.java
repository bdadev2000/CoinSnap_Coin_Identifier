package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzgxz extends IOException {
    public zzgxz() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzgxz(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    public zzgxz(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
