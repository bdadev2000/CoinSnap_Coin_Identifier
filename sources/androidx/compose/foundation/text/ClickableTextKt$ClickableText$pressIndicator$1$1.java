package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", l = {Opcodes.POP}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5765a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f5767c;
    public final /* synthetic */ l d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState f5768a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f5769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState mutableState, l lVar) {
            super(1);
            this.f5768a = mutableState;
            this.f5769b = lVar;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((Offset) obj).f14913a;
            TextLayoutResult textLayoutResult = (TextLayoutResult) this.f5768a.getValue();
            if (textLayoutResult != null) {
                this.f5769b.invoke(Integer.valueOf(textLayoutResult.f17047b.e(j2)));
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$pressIndicator$1$1(MutableState mutableState, l lVar, g gVar) {
        super(2, gVar);
        this.f5767c = mutableState;
        this.d = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.f5767c, this.d, gVar);
        clickableTextKt$ClickableText$pressIndicator$1$1.f5766b = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f5765a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f5766b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5767c, this.d);
            this.f5765a = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, null, anonymousClass1, this, 7) == aVar) {
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
