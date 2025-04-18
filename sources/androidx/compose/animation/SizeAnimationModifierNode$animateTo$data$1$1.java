package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.IntSize;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SizeAnimationModifierNode$animateTo$data$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SizeAnimationModifierNode.AnimData f1953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1954c;
    public final /* synthetic */ SizeAnimationModifierNode d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j2, SizeAnimationModifierNode sizeAnimationModifierNode, g gVar) {
        super(2, gVar);
        this.f1953b = animData;
        this.f1954c = j2;
        this.d = sizeAnimationModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.f1953b, this.f1954c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f1952a;
        SizeAnimationModifierNode sizeAnimationModifierNode = this.d;
        SizeAnimationModifierNode.AnimData animData = this.f1953b;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = animData.f1950a;
            IntSize intSize = new IntSize(this.f1954c);
            AnimationSpec animationSpec = sizeAnimationModifierNode.f1943o;
            this.f1952a = 1;
            obj = Animatable.c(animatable, intSize, animationSpec, null, null, this, 12);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.f2026b == AnimationEndReason.f2023b && (pVar = sizeAnimationModifierNode.f1945q) != null) {
            pVar.invoke(new IntSize(animData.f1951b), animationResult.f2025a.f2035b.getValue());
        }
        return b0.f30125a;
    }
}
