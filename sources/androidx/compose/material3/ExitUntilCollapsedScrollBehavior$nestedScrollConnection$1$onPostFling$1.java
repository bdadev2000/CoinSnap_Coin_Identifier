package androidx.compose.material3;

import h0.g;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {2467, 2469}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes3.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 f9274a;

    /* renamed from: b, reason: collision with root package name */
    public long f9275b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9276c;
    public final /* synthetic */ ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 d;

    /* renamed from: f, reason: collision with root package name */
    public int f9277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1, g gVar) {
        super(gVar);
        this.d = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f9276c = obj;
        this.f9277f |= Integer.MIN_VALUE;
        return this.d.h1(0L, 0L, this);
    }
}
