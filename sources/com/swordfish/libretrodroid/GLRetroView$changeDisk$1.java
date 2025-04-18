package com.swordfish.libretrodroid;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$changeDisk$1 extends r implements q0.a {
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$changeDisk$1(int i2) {
        super(0);
        this.$index = i2;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m620invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m620invoke() {
        LibretroDroid.changeDisk(this.$index);
    }
}
