package com.swordfish.libretrodroid;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$setCheat$1 extends r implements q0.a {
    final /* synthetic */ String $code;
    final /* synthetic */ boolean $enable;
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRetroView$setCheat$1(int i2, boolean z2, String str) {
        super(0);
        this.$index = i2;
        this.$enable = z2;
        this.$code = str;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m627invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m627invoke() {
        LibretroDroid.setCheat(this.$index, this.$enable, this.$code);
    }
}
