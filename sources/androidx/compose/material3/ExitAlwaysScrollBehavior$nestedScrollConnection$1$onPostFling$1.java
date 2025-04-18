package androidx.compose.material3;

import h0.g;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {1769, 1771}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes4.dex */
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public ExitAlwaysScrollBehavior$nestedScrollConnection$1 f9270a;

    /* renamed from: b, reason: collision with root package name */
    public long f9271b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9272c;
    public final /* synthetic */ ExitAlwaysScrollBehavior$nestedScrollConnection$1 d;

    /* renamed from: f, reason: collision with root package name */
    public int f9273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitAlwaysScrollBehavior$nestedScrollConnection$1 exitAlwaysScrollBehavior$nestedScrollConnection$1, g gVar) {
        super(gVar);
        this.d = exitAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f9272c = obj;
        this.f9273f |= Integer.MIN_VALUE;
        return this.d.h1(0L, 0L, this);
    }
}
