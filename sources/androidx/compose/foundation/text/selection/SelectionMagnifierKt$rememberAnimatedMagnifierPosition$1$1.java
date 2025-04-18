package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import b1.d0;
import d0.b0;
import e1.j;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {Opcodes.SASTORE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7206a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f7208c;
    public final /* synthetic */ Animatable d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State f7209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State state) {
            super(0);
            this.f7209a = state;
        }

        @Override // q0.a
        public final Object invoke() {
            AnimationVector2D animationVector2D = SelectionMagnifierKt.f7198a;
            return new Offset(((Offset) this.f7209a.getValue()).f14913a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(State state, Animatable animatable, g gVar) {
        super(2, gVar);
        this.f7208c = state;
        this.d = animatable;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.f7208c, this.d, gVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.f7207b = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7206a;
        if (i2 == 0) {
            q.m(obj);
            final d0 d0Var = (d0) this.f7207b;
            j l2 = SnapshotStateKt.l(new AnonymousClass1(this.f7208c));
            final Animatable animatable = this.d;
            e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2

                @e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {100}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                final class AnonymousClass1 extends i implements p {

                    /* renamed from: a, reason: collision with root package name */
                    public int f7212a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Animatable f7213b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ long f7214c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Animatable animatable, long j2, g gVar) {
                        super(2, gVar);
                        this.f7213b = animatable;
                        this.f7214c = j2;
                    }

                    @Override // j0.a
                    public final g create(Object obj, g gVar) {
                        return new AnonymousClass1(this.f7213b, this.f7214c, gVar);
                    }

                    @Override // q0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                    }

                    @Override // j0.a
                    public final Object invokeSuspend(Object obj) {
                        i0.a aVar = i0.a.f30806a;
                        int i2 = this.f7212a;
                        if (i2 == 0) {
                            q.m(obj);
                            Animatable animatable = this.f7213b;
                            Offset offset = new Offset(this.f7214c);
                            SpringSpec springSpec = SelectionMagnifierKt.d;
                            this.f7212a = 1;
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
                    Animatable animatable2 = Animatable.this;
                    boolean c2 = OffsetKt.c(((Offset) animatable2.d()).f14913a);
                    b0 b0Var = b0.f30125a;
                    if (c2 && OffsetKt.c(j2) && Offset.h(((Offset) animatable2.d()).f14913a) != Offset.h(j2)) {
                        kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(animatable2, j2, null), 3);
                        return b0Var;
                    }
                    Object e = animatable2.e(new Offset(j2), gVar);
                    return e == i0.a.f30806a ? e : b0Var;
                }
            };
            this.f7206a = 1;
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
