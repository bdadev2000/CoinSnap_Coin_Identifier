package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import j0.c;
import j0.e;
import kotlin.jvm.internal.f0;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
/* loaded from: classes4.dex */
public final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends c {

    /* renamed from: a, reason: collision with root package name */
    public AnimationState f2240a;

    /* renamed from: b, reason: collision with root package name */
    public Animation f2241b;

    /* renamed from: c, reason: collision with root package name */
    public l f2242c;
    public f0 d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2243f;

    /* renamed from: g, reason: collision with root package name */
    public int f2244g;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f2243f = obj;
        this.f2244g |= Integer.MIN_VALUE;
        return SuspendAnimationKt.b(null, null, 0L, null, this);
    }
}
