package androidx.compose.ui.scrollcapture;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f16739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposeScrollCaptureCallback f16740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f16741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Runnable runnable, g gVar) {
        super(2, gVar);
        this.f16740b = composeScrollCaptureCallback;
        this.f16741c = runnable;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.f16740b, this.f16741c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16739a;
        b0 b0Var = b0.f30125a;
        ComposeScrollCaptureCallback composeScrollCaptureCallback = this.f16740b;
        if (i2 == 0) {
            q.m(obj);
            RelativeScroller relativeScroller = composeScrollCaptureCallback.e;
            this.f16739a = 1;
            Object a2 = relativeScroller.a(0.0f - relativeScroller.f16761c, this);
            if (a2 != aVar) {
                a2 = b0Var;
            }
            if (a2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        composeScrollCaptureCallback.f16738c.b();
        this.f16741c.run();
        return b0Var;
    }
}
