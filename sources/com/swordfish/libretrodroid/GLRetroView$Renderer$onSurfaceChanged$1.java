package com.swordfish.libretrodroid;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$Renderer$onSurfaceChanged$1 extends r implements q0.a {
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$Renderer$onSurfaceChanged$1(int i2, int i3) {
        super(0);
        this.$width = i2;
        this.$height = i3;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m618invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m618invoke() {
        Thread.currentThread().setPriority(10);
        LibretroDroid.onSurfaceChanged(this.$width, this.$height);
    }
}
