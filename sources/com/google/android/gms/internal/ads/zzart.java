package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzart extends zzhhp {
    public zzart(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhhp
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
