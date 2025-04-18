package androidx.compose.material3;

import h0.g;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {2386, 2388}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes4.dex */
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1 f9264a;

    /* renamed from: b, reason: collision with root package name */
    public long f9265b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9266c;
    public final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 d;

    /* renamed from: f, reason: collision with root package name */
    public int f9267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, g gVar) {
        super(gVar);
        this.d = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f9266c = obj;
        this.f9267f |= Integer.MIN_VALUE;
        return this.d.h1(0L, 0L, this);
    }
}
