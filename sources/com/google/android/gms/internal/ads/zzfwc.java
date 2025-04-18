package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfwc extends zzfwb {
    private final char zza;

    public zzfwc(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        int i10 = this.zza;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return e.f("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final boolean zzb(char c10) {
        return c10 == this.zza;
    }
}
