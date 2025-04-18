package androidx.compose.foundation.gestures;

import j0.c;
import j0.e;
import kotlin.jvm.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {966}, m = "semanticsScrollBy-d-4ec7I")
/* loaded from: classes4.dex */
public final class ScrollableKt$semanticsScrollBy$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public ScrollingLogic f3437a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f3438b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3439c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3439c = obj;
        this.d |= Integer.MIN_VALUE;
        return ScrollableKt.a(null, 0L, this);
    }
}
