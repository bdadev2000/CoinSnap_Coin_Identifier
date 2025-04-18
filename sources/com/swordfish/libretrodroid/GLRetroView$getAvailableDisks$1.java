package com.swordfish.libretrodroid;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class GLRetroView$getAvailableDisks$1 extends r implements q0.a {
    public static final GLRetroView$getAvailableDisks$1 INSTANCE = new GLRetroView$getAvailableDisks$1();

    public GLRetroView$getAvailableDisks$1() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Integer invoke() {
        return Integer.valueOf(LibretroDroid.availableDisks());
    }
}
