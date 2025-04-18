package com.swordfish.libretrodroid;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class GLRetroView$reset$1 extends r implements q0.a {
    public static final GLRetroView$reset$1 INSTANCE = new GLRetroView$reset$1();

    public GLRetroView$reset$1() {
        super(0);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m626invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m626invoke() {
        LibretroDroid.reset();
    }
}
