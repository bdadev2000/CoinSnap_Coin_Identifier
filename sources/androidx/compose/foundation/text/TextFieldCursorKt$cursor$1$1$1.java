package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TextFieldCursorKt$cursor$1$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CursorAnimationState f6121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1$1$1(CursorAnimationState cursorAnimationState, g gVar) {
        super(2, gVar);
        this.f6121b = cursorAnimationState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TextFieldCursorKt$cursor$1$1$1(this.f6121b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldCursorKt$cursor$1$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6120a;
        if (i2 == 0) {
            q.m(obj);
            this.f6120a = 1;
            if (this.f6121b.a(this) == aVar) {
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
