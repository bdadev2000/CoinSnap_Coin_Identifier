package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import j0.c;
import j0.e;
import kotlin.jvm.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {334}, m = "animateDecay")
/* loaded from: classes3.dex */
public final class SnapFlingBehaviorKt$animateDecay$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public float f3702a;

    /* renamed from: b, reason: collision with root package name */
    public AnimationState f3703b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f3704c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public int f3705f;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f3705f |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.a(null, 0.0f, null, null, null, this);
    }
}
