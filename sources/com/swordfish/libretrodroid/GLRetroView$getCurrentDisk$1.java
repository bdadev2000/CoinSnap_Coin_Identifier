package com.swordfish.libretrodroid;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class GLRetroView$getCurrentDisk$1 extends r implements q0.a {
    public static final GLRetroView$getCurrentDisk$1 INSTANCE = new GLRetroView$getCurrentDisk$1();

    public GLRetroView$getCurrentDisk$1() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Integer invoke() {
        return Integer.valueOf(LibretroDroid.currentDisk());
    }
}
