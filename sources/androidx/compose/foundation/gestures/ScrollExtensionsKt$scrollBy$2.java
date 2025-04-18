package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ScrollExtensionsKt$scrollBy$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f3422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f3423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(c0 c0Var, float f2, g gVar) {
        super(2, gVar);
        this.f3422b = c0Var;
        this.f3423c = f2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.f3422b, this.f3423c, gVar);
        scrollExtensionsKt$scrollBy$2.f3421a = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = (ScrollExtensionsKt$scrollBy$2) create((ScrollScope) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        scrollExtensionsKt$scrollBy$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        this.f3422b.f30922a = ((ScrollScope) this.f3421a).a(this.f3423c);
        return b0.f30125a;
    }
}
