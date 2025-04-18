package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {565, 570}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AndroidViewHolder$onNestedFling$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f17546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17548c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z2, AndroidViewHolder androidViewHolder, long j2, g gVar) {
        super(2, gVar);
        this.f17547b = z2;
        this.f17548c = androidViewHolder;
        this.d = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AndroidViewHolder$onNestedFling$1(this.f17547b, this.f17548c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidViewHolder$onNestedFling$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f17546a;
        if (i2 == 0) {
            q.m(obj);
            boolean z2 = this.f17547b;
            AndroidViewHolder androidViewHolder = this.f17548c;
            if (z2) {
                NestedScrollDispatcher nestedScrollDispatcher = androidViewHolder.f17508a;
                long j2 = this.d;
                this.f17546a = 2;
                if (nestedScrollDispatcher.a(j2, 0L, this) == aVar) {
                    return aVar;
                }
            } else {
                NestedScrollDispatcher nestedScrollDispatcher2 = androidViewHolder.f17508a;
                long j3 = this.d;
                this.f17546a = 1;
                if (nestedScrollDispatcher2.a(0L, j3, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
