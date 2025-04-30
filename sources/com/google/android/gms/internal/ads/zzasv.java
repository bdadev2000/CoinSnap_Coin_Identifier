package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzasv extends zzhjw {
    ByteBuffer zza;

    public zzasv(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhjw
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
