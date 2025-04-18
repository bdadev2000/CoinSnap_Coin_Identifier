package androidx.compose.foundation.gestures;

import j0.c;
import j0.e;
import kotlin.jvm.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1049}, m = "animateToWithDecay")
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$animateToWithDecay$1<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    public float f3016a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f3017b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3018c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3018c = obj;
        this.d |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.c(null, null, 0.0f, this);
    }
}
