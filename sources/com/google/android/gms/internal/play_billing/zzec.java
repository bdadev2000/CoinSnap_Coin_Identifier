package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzec extends IOException {
    public zzec() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzec(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzec(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
