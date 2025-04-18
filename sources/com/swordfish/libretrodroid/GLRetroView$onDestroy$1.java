package com.swordfish.libretrodroid;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$onDestroy$1 extends r implements q0.a {
    final /* synthetic */ GLRetroView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$onDestroy$1(GLRetroView gLRetroView) {
        super(0);
        this.this$0 = gLRetroView;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m624invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m624invoke() {
        LibretroDroid.destroy();
        this.this$0.lifecycle = null;
    }
}
