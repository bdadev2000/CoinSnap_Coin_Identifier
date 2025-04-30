package com.google.android.gms.internal.ads;

import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfxo extends zzfxn {
    private final char zza;

    public zzfxo(char c9) {
        this.zza = c9;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i9 = this.zza;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i9 & 15);
            i9 >>= 4;
        }
        return AbstractC2914a.e("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.ads.zzfxr
    public final boolean zzb(char c9) {
        return c9 == this.zza;
    }
}
