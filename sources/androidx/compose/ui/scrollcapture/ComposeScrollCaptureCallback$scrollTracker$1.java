package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {Opcodes.CASTORE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ComposeScrollCaptureCallback$scrollTracker$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16754a;

    /* renamed from: b, reason: collision with root package name */
    public int f16755b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ float f16756c;
    public final /* synthetic */ ComposeScrollCaptureCallback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, g gVar) {
        super(2, gVar);
        this.d = composeScrollCaptureCallback;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.d, gVar);
        composeScrollCaptureCallback$scrollTracker$1.f16756c = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(((Number) obj).floatValue()), (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16755b;
        if (i2 == 0) {
            q.m(obj);
            float f2 = this.f16756c;
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.d;
            p pVar = (p) SemanticsConfigurationKt.a(composeScrollCaptureCallback.f16736a.d, SemanticsActions.e);
            if (pVar == null) {
                InlineClassHelperKt.c("Required value was null.");
                throw null;
            }
            boolean z3 = ((ScrollAxisRange) composeScrollCaptureCallback.f16736a.d.c(SemanticsProperties.f16846q)).f16792c;
            if (z3) {
                f2 = -f2;
            }
            Offset offset = new Offset(OffsetKt.a(0.0f, f2));
            this.f16754a = z3;
            this.f16755b = 1;
            obj = pVar.invoke(offset, this);
            if (obj == aVar) {
                return aVar;
            }
            z2 = z3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.f16754a;
            q.m(obj);
        }
        float h2 = Offset.h(((Offset) obj).f14913a);
        if (z2) {
            h2 = -h2;
        }
        return new Float(h2);
    }
}
