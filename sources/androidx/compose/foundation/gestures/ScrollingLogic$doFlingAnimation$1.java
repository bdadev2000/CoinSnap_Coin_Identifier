package androidx.compose.foundation.gestures;

import h0.g;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {769}, m = "doFlingAnimation-QWom1Mo")
/* loaded from: classes4.dex */
public final class ScrollingLogic$doFlingAnimation$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public e0 f3490a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3492c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, g gVar) {
        super(gVar);
        this.f3492c = scrollingLogic;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3491b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3492c.b(0L, this);
    }
}
