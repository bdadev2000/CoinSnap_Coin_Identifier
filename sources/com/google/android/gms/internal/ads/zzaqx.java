package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zzaqx extends ThreadLocal {
    public zzaqx(zzaqy zzaqyVar) {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
