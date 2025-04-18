package com.swordfish.libretrodroid;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$serializeState$1 extends r implements q0.a {
    public static final GLRetroView$serializeState$1 INSTANCE = new GLRetroView$serializeState$1();

    public GLRetroView$serializeState$1() {
        super(0);
    }

    @Override // q0.a
    public final byte[] invoke() {
        return LibretroDroid.serializeState();
    }
}
