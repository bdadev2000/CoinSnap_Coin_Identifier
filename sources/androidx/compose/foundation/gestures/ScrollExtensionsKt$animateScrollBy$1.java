package androidx.compose.foundation.gestures;

import j0.c;
import j0.e;
import kotlin.jvm.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
/* loaded from: classes4.dex */
public final class ScrollExtensionsKt$animateScrollBy$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public c0 f3409a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3410b;

    /* renamed from: c, reason: collision with root package name */
    public int f3411c;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3410b = obj;
        this.f3411c |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.a(null, 0.0f, null, this);
    }
}
