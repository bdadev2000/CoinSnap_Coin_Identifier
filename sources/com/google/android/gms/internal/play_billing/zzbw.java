package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbw extends IOException {
    public zzbw() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzbw(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzbw(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
