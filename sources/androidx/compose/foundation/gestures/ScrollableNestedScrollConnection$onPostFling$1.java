package androidx.compose.foundation.gestures;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {865}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes4.dex */
public final class ScrollableNestedScrollConnection$onPostFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public long f3449a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollableNestedScrollConnection f3451c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, g gVar) {
        super(gVar);
        this.f3451c = scrollableNestedScrollConnection;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3450b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3451c.h1(0L, 0L, this);
    }
}
