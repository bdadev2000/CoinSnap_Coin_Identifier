package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
import b1.d0;
import d0.b0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", l = {448, 451}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldCoreModifierNode f6533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f6534c;
    public final /* synthetic */ Rect d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f2, Rect rect, g gVar) {
        super(2, gVar);
        this.f6533b = textFieldCoreModifierNode;
        this.f6534c = f2;
        this.d = rect;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.f6533b, this.f6534c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6532a;
        TextFieldCoreModifierNode textFieldCoreModifierNode = this.f6533b;
        if (i2 == 0) {
            q.m(obj);
            ScrollState scrollState = textFieldCoreModifierNode.x;
            float f2 = TextFieldCoreModifierKt.f6510a;
            float f3 = this.f6534c;
            if (!Float.isNaN(f3) && !Float.isInfinite(f3)) {
                f3 = (float) (f3 > 0.0f ? Math.ceil(f3) : Math.floor(f3));
            }
            this.f6532a = 1;
            if (ScrollExtensionsKt.b(scrollState, f3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                return b0.f30125a;
            }
            q.m(obj);
        }
        BringIntoViewRequester bringIntoViewRequester = textFieldCoreModifierNode.f6513s.f6649h;
        this.f6532a = 2;
        if (bringIntoViewRequester.a(this.d, this) == aVar) {
            return aVar;
        }
        return b0.f30125a;
    }
}
