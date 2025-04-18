package androidx.compose.runtime;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@e(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f13974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(l lVar, g gVar) {
        super(2, gVar);
        this.f13975b = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.f13975b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f13974a;
        if (i2 == 0) {
            q.m(obj);
            this.f13974a = 1;
            if (p0.a.L(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return this.f13975b.invoke(new Long(System.nanoTime()));
    }
}
