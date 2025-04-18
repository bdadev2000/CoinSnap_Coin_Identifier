package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {583}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AndroidViewHolder$onNestedPreFling$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f17549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j2, g gVar) {
        super(2, gVar);
        this.f17550b = androidViewHolder;
        this.f17551c = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AndroidViewHolder$onNestedPreFling$1(this.f17550b, this.f17551c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidViewHolder$onNestedPreFling$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f17549a;
        if (i2 == 0) {
            q.m(obj);
            NestedScrollDispatcher nestedScrollDispatcher = this.f17550b.f17508a;
            this.f17549a = 1;
            if (nestedScrollDispatcher.b(this.f17551c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
