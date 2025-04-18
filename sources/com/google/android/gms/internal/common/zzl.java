package com.google.android.gms.internal.common;

import androidx.compose.foundation.text.input.a;

/* loaded from: classes3.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c2) {
        this.zza = c2;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i2 = this.zza;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        return a.A("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c2) {
        return c2 == this.zza;
    }
}
