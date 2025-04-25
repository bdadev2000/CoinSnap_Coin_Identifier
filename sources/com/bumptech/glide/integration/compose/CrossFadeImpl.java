package com.bumptech.glide.integration.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0016\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010\t\u001a1\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\nj\u0002`\u0010¢\u0006\u0002\b\u0011X\u0096\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013RF\u0010\u0014\u001a1\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\nj\u0002`\u0010¢\u0006\u0002\b\u0011X\u0096\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/bumptech/glide/integration/compose/CrossFadeImpl;", "Lcom/bumptech/glide/integration/compose/Transition;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/animation/core/AnimationSpec;)V", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "drawCurrent", "Lkotlin/Function5;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/graphics/ColorFilter;", "", "Lcom/bumptech/glide/integration/compose/DrawPainter;", "Lkotlin/ExtensionFunctionType;", "getDrawCurrent", "()Lkotlin/jvm/functions/Function5;", "drawPlaceholder", "getDrawPlaceholder", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transition", "invalidate", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class CrossFadeImpl implements Transition {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final float OPAQUE_ALPHA = 1.0f;
    private final Animatable<Float, AnimationVector1D> animatable;
    private final AnimationSpec<Float> animationSpec;
    private final Function5<DrawScope, Painter, Size, Float, ColorFilter, Unit> drawCurrent;
    private final Function5<DrawScope, Painter, Size, Float, ColorFilter, Unit> drawPlaceholder;

    public CrossFadeImpl(AnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.animationSpec = animationSpec;
        this.animatable = new Animatable<>(Float.valueOf(0.0f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(1.0f), null, 8, null);
        this.drawPlaceholder = new Function5<DrawScope, Painter, Size, Float, ColorFilter, Unit>() { // from class: com.bumptech.glide.integration.compose.CrossFadeImpl$drawPlaceholder$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Painter painter, Size size, Float f, ColorFilter colorFilter) {
                m7659invokeQfoU1oo(drawScope, painter, size.getPackedValue(), f.floatValue(), colorFilter);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-QfoU1oo, reason: not valid java name */
            public final void m7659invokeQfoU1oo(DrawScope drawScope, Painter painter, long j, float f, ColorFilter colorFilter) {
                Animatable animatable;
                Intrinsics.checkNotNullParameter(drawScope, "$this$null");
                Intrinsics.checkNotNullParameter(painter, "painter");
                animatable = CrossFadeImpl.this.animatable;
                painter.m5198drawx_KDEd0(drawScope, j, (1.0f - ((Number) animatable.getValue()).floatValue()) * f, colorFilter);
            }
        };
        this.drawCurrent = new Function5<DrawScope, Painter, Size, Float, ColorFilter, Unit>() { // from class: com.bumptech.glide.integration.compose.CrossFadeImpl$drawCurrent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Painter painter, Size size, Float f, ColorFilter colorFilter) {
                m7658invokeQfoU1oo(drawScope, painter, size.getPackedValue(), f.floatValue(), colorFilter);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-QfoU1oo, reason: not valid java name */
            public final void m7658invokeQfoU1oo(DrawScope drawScope, Painter painter, long j, float f, ColorFilter colorFilter) {
                Animatable animatable;
                Intrinsics.checkNotNullParameter(drawScope, "$this$null");
                Intrinsics.checkNotNullParameter(painter, "painter");
                animatable = CrossFadeImpl.this.animatable;
                painter.m5198drawx_KDEd0(drawScope, j, ((Number) animatable.getValue()).floatValue() * f, colorFilter);
            }
        };
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bumptech/glide/integration/compose/CrossFadeImpl$Companion;", "", "()V", "OPAQUE_ALPHA", "", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(1:(2:11|12)(3:14|15|16))(3:17|18|19))(4:20|21|22|23))(7:40|41|42|43|44|45|(1:47)(1:48))|24|25|26|(1:28)(3:29|18|19)))|55|6|(0)(0)|24|25|26|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.bumptech.glide.integration.compose.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object transition(kotlin.jvm.functions.Function0<kotlin.Unit> r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.compose.CrossFadeImpl.transition(kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bumptech.glide.integration.compose.Transition
    public Object stop(Continuation<? super Unit> continuation) {
        Object stop = this.animatable.stop(continuation);
        return stop == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? stop : Unit.INSTANCE;
    }

    @Override // com.bumptech.glide.integration.compose.Transition
    public Function5<DrawScope, Painter, Size, Float, ColorFilter, Unit> getDrawPlaceholder() {
        return this.drawPlaceholder;
    }

    @Override // com.bumptech.glide.integration.compose.Transition
    public Function5<DrawScope, Painter, Size, Float, ColorFilter, Unit> getDrawCurrent() {
        return this.drawCurrent;
    }
}
