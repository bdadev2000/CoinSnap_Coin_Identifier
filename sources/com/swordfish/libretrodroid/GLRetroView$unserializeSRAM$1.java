package com.swordfish.libretrodroid;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class GLRetroView$unserializeSRAM$1 extends r implements q0.a {
    final /* synthetic */ byte[] $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$unserializeSRAM$1(byte[] bArr) {
        super(0);
        this.$data = bArr;
    }

    @Override // q0.a
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(LibretroDroid.unserializeSRAM(this.$data));
    }
}
