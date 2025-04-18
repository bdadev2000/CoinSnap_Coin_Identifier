package com.swordfish.libretrodroid;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$serializeSRAM$1 extends r implements q0.a {
    public static final GLRetroView$serializeSRAM$1 INSTANCE = new GLRetroView$serializeSRAM$1();

    public GLRetroView$serializeSRAM$1() {
        super(0);
    }

    @Override // q0.a
    public final byte[] invoke() {
        return LibretroDroid.serializeSRAM();
    }
}
