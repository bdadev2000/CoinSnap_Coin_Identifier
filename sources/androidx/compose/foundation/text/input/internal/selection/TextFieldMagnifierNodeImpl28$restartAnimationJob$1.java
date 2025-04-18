package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import b1.d0;
import d0.b0;
import e1.j;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", l = {Opcodes.I2F}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TextFieldMagnifierNodeImpl28$restartAnimationJob$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6699a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldMagnifierNodeImpl28 f6701c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldMagnifierNodeImpl28 f6702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
            super(0);
            this.f6702a = textFieldMagnifierNodeImpl28;
        }

        @Override // q0.a
        public final Object invoke() {
            TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.f6702a;
            return new Offset((textFieldMagnifierNodeImpl28.f6694t || ((TextFieldSelectionState.InputType) textFieldMagnifierNodeImpl28.f6692r.f6727p.getValue()) == TextFieldSelectionState.InputType.f6746b) ? TextFieldMagnifierKt.a(textFieldMagnifierNodeImpl28.f6691q, textFieldMagnifierNodeImpl28.f6692r, textFieldMagnifierNodeImpl28.f6693s, ((IntSize) textFieldMagnifierNodeImpl28.f6695u.getValue()).f17493a) : 9205357640488583168L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$restartAnimationJob$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, g gVar) {
        super(2, gVar);
        this.f6701c = textFieldMagnifierNodeImpl28;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldMagnifierNodeImpl28$restartAnimationJob$1 textFieldMagnifierNodeImpl28$restartAnimationJob$1 = new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this.f6701c, gVar);
        textFieldMagnifierNodeImpl28$restartAnimationJob$1.f6700b = obj;
        return textFieldMagnifierNodeImpl28$restartAnimationJob$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldMagnifierNodeImpl28$restartAnimationJob$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6699a;
        if (i2 == 0) {
            q.m(obj);
            final d0 d0Var = (d0) this.f6700b;
            final TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.f6701c;
            j l2 = SnapshotStateKt.l(new AnonymousClass1(textFieldMagnifierNodeImpl28));
            e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1.2

                @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", l = {Opcodes.LCMP}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                final class AnonymousClass1 extends i implements p {

                    /* renamed from: a, reason: collision with root package name */
                    public int f6705a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TextFieldMagnifierNodeImpl28 f6706b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ long f6707c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, long j2, g gVar) {
                        super(2, gVar);
                        this.f6706b = textFieldMagnifierNodeImpl28;
                        this.f6707c = j2;
                    }

                    @Override // j0.a
                    public final g create(Object obj, g gVar) {
                        return new AnonymousClass1(this.f6706b, this.f6707c, gVar);
                    }

                    @Override // q0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                    }

                    @Override // j0.a
                    public final Object invokeSuspend(Object obj) {
                        i0.a aVar = i0.a.f30806a;
                        int i2 = this.f6705a;
                        if (i2 == 0) {
                            q.m(obj);
                            Animatable animatable = this.f6706b.f6696v;
                            Offset offset = new Offset(this.f6707c);
                            SpringSpec springSpec = SelectionMagnifierKt.d;
                            this.f6705a = 1;
                            if (Animatable.c(animatable, offset, springSpec, null, null, this, 12) == aVar) {
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

                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    long j2 = ((Offset) obj2).f14913a;
                    TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl282 = TextFieldMagnifierNodeImpl28.this;
                    boolean c2 = OffsetKt.c(((Offset) textFieldMagnifierNodeImpl282.f6696v.d()).f14913a);
                    b0 b0Var = b0.f30125a;
                    Animatable animatable = textFieldMagnifierNodeImpl282.f6696v;
                    if (c2 && OffsetKt.c(j2) && Offset.h(((Offset) animatable.d()).f14913a) != Offset.h(j2)) {
                        kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(textFieldMagnifierNodeImpl282, j2, null), 3);
                        return b0Var;
                    }
                    Object e = animatable.e(new Offset(j2), gVar);
                    return e == i0.a.f30806a ? e : b0Var;
                }
            };
            this.f6699a = 1;
            if (l2.collect(iVar, this) == aVar) {
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
