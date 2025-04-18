package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import d0.b0;
import e1.j;
import h0.g;
import j0.i;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", l = {563}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TextFieldCoreModifierNode$startCursorJob$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldCoreModifierNode f6526b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldCoreModifierNode f6527a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f6528b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldCoreModifierNode textFieldCoreModifierNode, d0 d0Var) {
            super(0);
            this.f6527a = textFieldCoreModifierNode;
            this.f6528b = d0Var;
        }

        @Override // q0.a
        public final Object invoke() {
            TextFieldCoreModifierNode textFieldCoreModifierNode = this.f6527a;
            textFieldCoreModifierNode.f6514t.d();
            int i2 = (textFieldCoreModifierNode.f14699n && ((WindowInfo) CompositionLocalConsumerModifierNodeKt.a(textFieldCoreModifierNode, CompositionLocalsKt.f16446r)).a()) ? 1 : 2;
            d0 d0Var = this.f6528b;
            Integer valueOf = Integer.valueOf(i2 * d0Var.f30925a);
            valueOf.intValue();
            d0Var.f30925a *= -1;
            return valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", l = {565}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6529a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f6530b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextFieldCoreModifierNode f6531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldCoreModifierNode textFieldCoreModifierNode, g gVar) {
            super(2, gVar);
            this.f6531c = textFieldCoreModifierNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f6531c, gVar);
            anonymousClass2.f6530b = ((Number) obj).intValue();
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(Integer.valueOf(((Number) obj).intValue()), (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f6529a;
            if (i2 == 0) {
                q.m(obj);
                if (Math.abs(this.f6530b) == 1) {
                    CursorAnimationState cursorAnimationState = this.f6531c.f6518z;
                    this.f6529a = 1;
                    if (cursorAnimationState.a(this) == aVar) {
                        return aVar;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$startCursorJob$1(TextFieldCoreModifierNode textFieldCoreModifierNode, g gVar) {
        super(2, gVar);
        this.f6526b = textFieldCoreModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TextFieldCoreModifierNode$startCursorJob$1(this.f6526b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldCoreModifierNode$startCursorJob$1) create((b1.d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6525a;
        if (i2 == 0) {
            q.m(obj);
            ?? obj2 = new Object();
            obj2.f30925a = 1;
            TextFieldCoreModifierNode textFieldCoreModifierNode = this.f6526b;
            j l2 = SnapshotStateKt.l(new AnonymousClass1(textFieldCoreModifierNode, obj2));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(textFieldCoreModifierNode, null);
            this.f6525a = 1;
            if (p0.a.D(l2, anonymousClass2, this) == aVar) {
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
