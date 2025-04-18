package androidx.compose.foundation.layout;

import h0.g;
import j0.c;
import j0.e;
import kotlin.jvm.internal.c0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {320, 346, 371}, m = "fling-huYlsQE")
/* loaded from: classes4.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4172a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f4173b;

    /* renamed from: c, reason: collision with root package name */
    public long f4174c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsNestedScrollConnection f4176g;

    /* renamed from: h, reason: collision with root package name */
    public int f4177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, g gVar) {
        super(gVar);
        this.f4176g = windowInsetsNestedScrollConnection;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f4175f = obj;
        this.f4177h |= Integer.MIN_VALUE;
        return this.f4176g.b(0L, 0.0f, false, this);
    }
}
