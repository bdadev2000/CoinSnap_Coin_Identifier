package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import j0.c;
import j0.e;
import kotlin.jvm.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {379}, m = "animateWithTarget")
/* loaded from: classes3.dex */
public final class SnapFlingBehaviorKt$animateWithTarget$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public float f3709a;

    /* renamed from: b, reason: collision with root package name */
    public float f3710b;

    /* renamed from: c, reason: collision with root package name */
    public AnimationState f3711c;
    public c0 d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3712f;

    /* renamed from: g, reason: collision with root package name */
    public int f3713g;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3712f = obj;
        this.f3713g |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.b(null, 0.0f, 0.0f, null, null, null, this);
    }
}
