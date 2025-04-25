package com.bumptech.glide.integration.compose;

import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.ModelExtractorKt;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.integration.compose.DoNotTransition;
import com.bumptech.glide.integration.compose.GlideNode$callback$2;
import com.bumptech.glide.integration.compose.RequestState;
import com.bumptech.glide.integration.compose.Transition;
import com.bumptech.glide.integration.ktx.AsyncGlideSize;
import com.bumptech.glide.integration.ktx.FlowsKt;
import com.bumptech.glide.integration.ktx.GlideFlowInstant;
import com.bumptech.glide.integration.ktx.ImmediateGlideSize;
import com.bumptech.glide.integration.ktx.ResolvableGlideSize;
import com.bumptech.glide.integration.ktx.Resource;
import com.bumptech.glide.integration.ktx.Size;
import com.bumptech.glide.integration.ktx.Status;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.util.Preconditions;
import com.glority.android.core.data.LogEventArguments;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: GlideModifier.kt */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001nB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010=\u001a\u00020>H\u0002J\u0013\u0010?\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020CH\u0016J\u0016\u0010D\u001a\u00020>2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190%H\u0002J\u001d\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\b\u0010J\u001a\u00020>H\u0016J\b\u0010K\u001a\u00020>H\u0016J[\u0010L\u001a\u00020>2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190%2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u00101\u001a\u0004\u0018\u000102¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020>H\u0016J\u0012\u0010O\u001a\u00020>2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\f\u0010P\u001a\u00020>*\u00020QH\u0016J\f\u0010\u0016\u001a\u00020>*\u00020RH\u0016JD\u0010S\u001a\u0004\u0018\u00010\u001b*\u00020R2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010T\u001a\u0004\u0018\u00010\u001b2\u001d\u0010S\u001a\u0019\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020>0U¢\u0006\u0002\bWH\u0002ø\u0001\u0000J\u0019\u0010\u001c\u001a\u00020\u0017*\u00020FH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u00106J\u001a\u0010Y\u001a\u00020>*\u00020Z2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00190\\H\u0002J\u0012\u0010]\u001a\u0004\u0018\u00010^*\u0006\u0012\u0002\b\u00030%H\u0002J)\u0010_\u001a\u00020`*\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010G\u001a\u00020FH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\u0019\u0010f\u001a\u00020g*\u000204H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010IJ\u0019\u0010i\u001a\u00020j*\u00020kH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010mR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190%X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00103\u001a\u00020\u0017*\u0002048BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b5\u00106R\u0018\u00107\u001a\u00020\u0017*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001b\u00109\u001a\u00020\u0017*\u0002048BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b:\u00106R\u001b\u0010;\u001a\u00020\u0017*\u0002048BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u00106\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"Lcom/bumptech/glide/integration/compose/GlideNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "alignment", "Landroidx/compose/ui/Alignment;", "alpha", "", "callback", "Landroid/graphics/drawable/Drawable$Callback;", "getCallback", "()Landroid/graphics/drawable/Drawable$Callback;", "callback$delegate", "Lkotlin/Lazy;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "currentJob", "Lkotlinx/coroutines/Job;", "draw", "", "drawable", "Landroid/graphics/drawable/Drawable;", "drawablePositionAndSize", "Lcom/bumptech/glide/integration/compose/GlideNode$CachedPositionAndSize;", "hasFixedSize", "inferredGlideSize", "Lcom/bumptech/glide/integration/ktx/Size;", "isFirstResource", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", "placeholderPositionAndSize", "requestBuilder", "Lcom/bumptech/glide/RequestBuilder;", "requestListener", "Lcom/bumptech/glide/integration/compose/RequestListener;", "resolvableGlideSize", "Lcom/bumptech/glide/integration/ktx/ResolvableGlideSize;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "state", "Lcom/bumptech/glide/integration/compose/RequestState;", "transition", "Lcom/bumptech/glide/integration/compose/Transition;", "transitionFactory", "Lcom/bumptech/glide/integration/compose/Transition$Factory;", "isValid", "Landroidx/compose/ui/geometry/Size;", "isValid-uvyYCjk", "(J)Z", "isValidDimension", "(F)Z", "isValidHeight", "isValidHeight-uvyYCjk", "isValidWidth", "isValidWidth-uvyYCjk", "clear", "", "equals", "other", "", "hashCode", "", "launchRequest", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "(J)J", "onAttach", "onDetach", "onNewRequest", "(Lcom/bumptech/glide/RequestBuilder;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;Ljava/lang/Float;Landroidx/compose/ui/graphics/ColorFilter;Lcom/bumptech/glide/integration/compose/RequestListener;Ljava/lang/Boolean;Lcom/bumptech/glide/integration/compose/Transition$Factory;)V", "onReset", "updateDrawable", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawOne", "cache", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "hasFixedSize-BRTryo0", "maybeAnimate", "Lkotlinx/coroutines/CoroutineScope;", "instant", "Lcom/bumptech/glide/integration/ktx/Resource;", "maybeImmediateSize", "Lcom/bumptech/glide/integration/ktx/ImmediateGlideSize;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "roundToInt", "Landroidx/compose/ui/unit/IntSize;", "roundToInt-OLKMvJU", "toPointF", "Landroid/graphics/PointF;", "Landroidx/compose/ui/unit/IntOffset;", "toPointF--gyyYBs", "(J)Landroid/graphics/PointF;", "CachedPositionAndSize", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GlideNode extends Modifier.Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {
    private Alignment alignment;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Job currentJob;
    private Drawable drawable;
    private CachedPositionAndSize drawablePositionAndSize;
    private boolean hasFixedSize;
    private Size inferredGlideSize;
    private Painter painter;
    private Painter placeholder;
    private CachedPositionAndSize placeholderPositionAndSize;
    private RequestBuilder<Drawable> requestBuilder;
    private RequestListener requestListener;
    private ResolvableGlideSize resolvableGlideSize;
    private float alpha = 1.0f;
    private Transition.Factory transitionFactory = DoNotTransition.Factory.INSTANCE;
    private boolean draw = true;
    private RequestState state = RequestState.Loading.INSTANCE;
    private boolean isFirstResource = true;
    private Transition transition = DoNotTransition.INSTANCE;

    /* renamed from: callback$delegate, reason: from kotlin metadata */
    private final Lazy callback = LazyKt.lazy(new Function0<GlideNode$callback$2.AnonymousClass1>() { // from class: com.bumptech.glide.integration.compose.GlideNode$callback$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.integration.compose.GlideNode$callback$2$1] */
        @Override // kotlin.jvm.functions.Function0
        public final AnonymousClass1 invoke() {
            final GlideNode glideNode = GlideNode.this;
            return new Drawable.Callback() { // from class: com.bumptech.glide.integration.compose.GlideNode$callback$2.1
                @Override // android.graphics.drawable.Drawable.Callback
                public void invalidateDrawable(Drawable d) {
                    Intrinsics.checkNotNullParameter(d, "d");
                    DrawModifierNodeKt.invalidateDraw(GlideNode.this);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void scheduleDrawable(Drawable d, Runnable what, long time) {
                    Handler main_handler;
                    Intrinsics.checkNotNullParameter(d, "d");
                    Intrinsics.checkNotNullParameter(what, "what");
                    main_handler = GlideModifierKt.getMAIN_HANDLER();
                    main_handler.postAtTime(what, time);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void unscheduleDrawable(Drawable d, Runnable what) {
                    Handler main_handler;
                    Intrinsics.checkNotNullParameter(d, "d");
                    Intrinsics.checkNotNullParameter(what, "what");
                    main_handler = GlideModifierKt.getMAIN_HANDLER();
                    main_handler.removeCallbacks(what);
                }
            };
        }
    });

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final Drawable.Callback getCallback() {
        return (Drawable.Callback) this.callback.getValue();
    }

    private final ImmediateGlideSize maybeImmediateSize(RequestBuilder<?> requestBuilder) {
        Size overrideSize = SizesKt.overrideSize(requestBuilder);
        if (overrideSize != null) {
            return new ImmediateGlideSize(overrideSize);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onNewRequest(com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> r5, androidx.compose.ui.layout.ContentScale r6, androidx.compose.ui.Alignment r7, java.lang.Float r8, androidx.compose.ui.graphics.ColorFilter r9, com.bumptech.glide.integration.compose.RequestListener r10, java.lang.Boolean r11, com.bumptech.glide.integration.compose.Transition.Factory r12) {
        /*
            r4 = this;
            java.lang.String r0 = "requestBuilder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r1 = "contentScale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "alignment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> r1 = r4.requestBuilder
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L24
            if (r1 != 0) goto L1b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r1 = r3
        L1b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r0 != 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = r2
        L25:
            r4.requestBuilder = r5
            r4.contentScale = r6
            r4.alignment = r7
            if (r8 == 0) goto L32
            float r6 = r8.floatValue()
            goto L34
        L32:
            r6 = 1065353216(0x3f800000, float:1.0)
        L34:
            r4.alpha = r6
            r4.colorFilter = r9
            r4.requestListener = r10
            if (r11 == 0) goto L40
            boolean r2 = r11.booleanValue()
        L40:
            r4.draw = r2
            if (r12 != 0) goto L49
            com.bumptech.glide.integration.compose.DoNotTransition$Factory r6 = com.bumptech.glide.integration.compose.DoNotTransition.Factory.INSTANCE
            r12 = r6
            com.bumptech.glide.integration.compose.Transition$Factory r12 = (com.bumptech.glide.integration.compose.Transition.Factory) r12
        L49:
            r4.transitionFactory = r12
            com.bumptech.glide.integration.ktx.ImmediateGlideSize r6 = r4.maybeImmediateSize(r5)
            if (r6 == 0) goto L54
            com.bumptech.glide.integration.ktx.ResolvableGlideSize r6 = (com.bumptech.glide.integration.ktx.ResolvableGlideSize) r6
            goto L6c
        L54:
            com.bumptech.glide.integration.ktx.Size r6 = r4.inferredGlideSize
            if (r6 == 0) goto L5e
            com.bumptech.glide.integration.ktx.ImmediateGlideSize r7 = new com.bumptech.glide.integration.ktx.ImmediateGlideSize
            r7.<init>(r6)
            goto L5f
        L5e:
            r7 = r3
        L5f:
            if (r7 == 0) goto L65
            r6 = r7
            com.bumptech.glide.integration.ktx.ResolvableGlideSize r6 = (com.bumptech.glide.integration.ktx.ResolvableGlideSize) r6
            goto L6c
        L65:
            com.bumptech.glide.integration.ktx.AsyncGlideSize r6 = new com.bumptech.glide.integration.ktx.AsyncGlideSize
            r6.<init>()
            com.bumptech.glide.integration.ktx.ResolvableGlideSize r6 = (com.bumptech.glide.integration.ktx.ResolvableGlideSize) r6
        L6c:
            r4.resolvableGlideSize = r6
            if (r0 == 0) goto L80
            r4.clear()
            r4.updateDrawable(r3)
            boolean r6 = r4.getIsAttached()
            if (r6 == 0) goto L86
            r4.launchRequest(r5)
            goto L86
        L80:
            r5 = r4
            androidx.compose.ui.node.DrawModifierNode r5 = (androidx.compose.ui.node.DrawModifierNode) r5
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r5)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.compose.GlideNode.onNewRequest(com.bumptech.glide.RequestBuilder, androidx.compose.ui.layout.ContentScale, androidx.compose.ui.Alignment, java.lang.Float, androidx.compose.ui.graphics.ColorFilter, com.bumptech.glide.integration.compose.RequestListener, java.lang.Boolean, com.bumptech.glide.integration.compose.Transition$Factory):void");
    }

    private final boolean isValidDimension(float f) {
        return (f <= 0.0f || Float.isInfinite(f) || Float.isNaN(f)) ? false : true;
    }

    /* renamed from: isValid-uvyYCjk, reason: not valid java name */
    private final boolean m7664isValiduvyYCjk(long j) {
        return m7666isValidWidthuvyYCjk(j) && m7665isValidHeightuvyYCjk(j);
    }

    /* renamed from: roundToInt-OLKMvJU, reason: not valid java name */
    private final long m7668roundToIntOLKMvJU(long j) {
        return IntSizeKt.IntSize(MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4343getWidthimpl(j)), MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4340getHeightimpl(j)));
    }

    /* renamed from: toPointF--gyyYBs, reason: not valid java name */
    private final PointF m7669toPointFgyyYBs(long j) {
        return new PointF(IntOffset.m7125getXimpl(j), IntOffset.m7126getYimpl(j));
    }

    /* compiled from: GlideModifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/bumptech/glide/integration/compose/GlideNode$CachedPositionAndSize;", "", "position", "Landroid/graphics/PointF;", LogEventArguments.ARG_SIZE, "Landroidx/compose/ui/geometry/Size;", "(Landroid/graphics/PointF;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPosition", "()Landroid/graphics/PointF;", "getSize-NH-jbRc", "()J", "J", "component1", "component2", "component2-NH-jbRc", "copy", "copy-d16Qtg0", "(Landroid/graphics/PointF;J)Lcom/bumptech/glide/integration/compose/GlideNode$CachedPositionAndSize;", "equals", "", "other", "hashCode", "", "toString", "", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final /* data */ class CachedPositionAndSize {
        private final PointF position;
        private final long size;

        public /* synthetic */ CachedPositionAndSize(PointF pointF, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(pointF, j);
        }

        /* renamed from: copy-d16Qtg0$default, reason: not valid java name */
        public static /* synthetic */ CachedPositionAndSize m7670copyd16Qtg0$default(CachedPositionAndSize cachedPositionAndSize, PointF pointF, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                pointF = cachedPositionAndSize.position;
            }
            if ((i & 2) != 0) {
                j = cachedPositionAndSize.size;
            }
            return cachedPositionAndSize.m7672copyd16Qtg0(pointF, j);
        }

        /* renamed from: component1, reason: from getter */
        public final PointF getPosition() {
            return this.position;
        }

        /* renamed from: component2-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: copy-d16Qtg0, reason: not valid java name */
        public final CachedPositionAndSize m7672copyd16Qtg0(PointF position, long size) {
            Intrinsics.checkNotNullParameter(position, "position");
            return new CachedPositionAndSize(position, size, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedPositionAndSize)) {
                return false;
            }
            CachedPositionAndSize cachedPositionAndSize = (CachedPositionAndSize) other;
            return Intrinsics.areEqual(this.position, cachedPositionAndSize.position) && androidx.compose.ui.geometry.Size.m4339equalsimpl0(this.size, cachedPositionAndSize.size);
        }

        public int hashCode() {
            return (this.position.hashCode() * 31) + androidx.compose.ui.geometry.Size.m4344hashCodeimpl(this.size);
        }

        public String toString() {
            return "CachedPositionAndSize(position=" + this.position + ", size=" + ((Object) androidx.compose.ui.geometry.Size.m4347toStringimpl(this.size)) + ')';
        }

        private CachedPositionAndSize(PointF pointF, long j) {
            this.position = pointF;
            this.size = j;
        }

        public final PointF getPosition() {
            return this.position;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m7673getSizeNHjbRc() {
            return this.size;
        }
    }

    private final CachedPositionAndSize drawOne(ContentDrawScope contentDrawScope, Painter painter, CachedPositionAndSize cachedPositionAndSize, Function2<? super DrawScope, ? super androidx.compose.ui.geometry.Size, Unit> function2) {
        float m4343getWidthimpl;
        float m4340getHeightimpl;
        long m4352getZeroNHjbRc;
        Alignment alignment;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (painter == null) {
            return null;
        }
        if (cachedPositionAndSize == null) {
            if (m7666isValidWidthuvyYCjk(painter.getDrawableIntrinsicSize())) {
                m4343getWidthimpl = androidx.compose.ui.geometry.Size.m4343getWidthimpl(painter.getDrawableIntrinsicSize());
            } else {
                m4343getWidthimpl = androidx.compose.ui.geometry.Size.m4343getWidthimpl(contentDrawScope.mo5071getSizeNHjbRc());
            }
            if (m7665isValidHeightuvyYCjk(painter.getDrawableIntrinsicSize())) {
                m4340getHeightimpl = androidx.compose.ui.geometry.Size.m4340getHeightimpl(painter.getDrawableIntrinsicSize());
            } else {
                m4340getHeightimpl = androidx.compose.ui.geometry.Size.m4340getHeightimpl(contentDrawScope.mo5071getSizeNHjbRc());
            }
            long Size = SizeKt.Size(m4343getWidthimpl, m4340getHeightimpl);
            if (m7664isValiduvyYCjk(contentDrawScope.mo5071getSizeNHjbRc())) {
                ContentScale contentScale = this.contentScale;
                if (contentScale == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentScale");
                    contentScale = null;
                }
                m4352getZeroNHjbRc = ScaleFactorKt.m5956timesmw2e94(contentScale.mo5842computeScaleFactorH7hwNQA(Size, contentDrawScope.mo5071getSizeNHjbRc()), Size);
            } else {
                m4352getZeroNHjbRc = androidx.compose.ui.geometry.Size.INSTANCE.m4352getZeroNHjbRc();
            }
            Alignment alignment2 = this.alignment;
            if (alignment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("alignment");
                alignment = null;
            } else {
                alignment = alignment2;
            }
            cachedPositionAndSize = new CachedPositionAndSize(m7669toPointFgyyYBs(alignment.mo4120alignKFBX0sM(m7668roundToIntOLKMvJU(m4352getZeroNHjbRc), m7668roundToIntOLKMvJU(contentDrawScope.mo5071getSizeNHjbRc()), contentDrawScope.getLayoutDirection())), m4352getZeroNHjbRc, defaultConstructorMarker);
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float m4343getWidthimpl2 = androidx.compose.ui.geometry.Size.m4343getWidthimpl(contentDrawScope2.mo5071getSizeNHjbRc());
        float m4340getHeightimpl2 = androidx.compose.ui.geometry.Size.m4340getHeightimpl(contentDrawScope2.mo5071getSizeNHjbRc());
        int m4504getIntersectrtfAjoo = ClipOp.INSTANCE.m4504getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long mo4992getSizeNHjbRc = drawContext.mo4992getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4995clipRectN_I0leg(0.0f, 0.0f, m4343getWidthimpl2, m4340getHeightimpl2, m4504getIntersectrtfAjoo);
        float f = cachedPositionAndSize.getPosition().x;
        float f2 = cachedPositionAndSize.getPosition().y;
        contentDrawScope2.getDrawContext().getTransform().translate(f, f2);
        function2.invoke(contentDrawScope2, androidx.compose.ui.geometry.Size.m4331boximpl(cachedPositionAndSize.m7673getSizeNHjbRc()));
        contentDrawScope2.getDrawContext().getTransform().translate(-f, -f2);
        drawContext.getCanvas().restore();
        drawContext.mo4993setSizeuvyYCjk(mo4992getSizeNHjbRc);
        return cachedPositionAndSize;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        if (this.draw) {
            final Function5<DrawScope, Painter, androidx.compose.ui.geometry.Size, Float, ColorFilter, Unit> drawPlaceholder = this.transition.getDrawPlaceholder();
            if (drawPlaceholder == null) {
                drawPlaceholder = DoNotTransition.INSTANCE.getDrawPlaceholder();
            }
            final Painter painter = this.placeholder;
            if (painter != null) {
                Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
                try {
                    canvas.save();
                    this.placeholderPositionAndSize = drawOne(contentDrawScope, painter, this.placeholderPositionAndSize, new Function2<DrawScope, androidx.compose.ui.geometry.Size, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideNode$draw$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, androidx.compose.ui.geometry.Size size) {
                            m7674invoked16Qtg0(drawScope, size.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-d16Qtg0, reason: not valid java name */
                        public final void m7674invoked16Qtg0(DrawScope drawOne, long j) {
                            float f;
                            ColorFilter colorFilter;
                            Intrinsics.checkNotNullParameter(drawOne, "$this$drawOne");
                            Function5<DrawScope, Painter, androidx.compose.ui.geometry.Size, Float, ColorFilter, Unit> function5 = drawPlaceholder;
                            Painter painter2 = painter;
                            androidx.compose.ui.geometry.Size m4331boximpl = androidx.compose.ui.geometry.Size.m4331boximpl(j);
                            f = this.alpha;
                            Float valueOf = Float.valueOf(f);
                            colorFilter = this.colorFilter;
                            function5.invoke(drawOne, painter2, m4331boximpl, valueOf, colorFilter);
                        }
                    });
                    canvas.restore();
                } finally {
                }
            }
            final Painter painter2 = this.painter;
            if (painter2 != null) {
                try {
                    contentDrawScope.getDrawContext().getCanvas().save();
                    this.drawablePositionAndSize = drawOne(contentDrawScope, painter2, this.drawablePositionAndSize, new Function2<DrawScope, androidx.compose.ui.geometry.Size, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideNode$draw$2$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, androidx.compose.ui.geometry.Size size) {
                            m7675invoked16Qtg0(drawScope, size.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-d16Qtg0, reason: not valid java name */
                        public final void m7675invoked16Qtg0(DrawScope drawOne, long j) {
                            Transition transition;
                            float f;
                            ColorFilter colorFilter;
                            Intrinsics.checkNotNullParameter(drawOne, "$this$drawOne");
                            transition = GlideNode.this.transition;
                            Function5<DrawScope, Painter, androidx.compose.ui.geometry.Size, Float, ColorFilter, Unit> drawCurrent = transition.getDrawCurrent();
                            Painter painter3 = painter2;
                            androidx.compose.ui.geometry.Size m4331boximpl = androidx.compose.ui.geometry.Size.m4331boximpl(j);
                            f = GlideNode.this.alpha;
                            Float valueOf = Float.valueOf(f);
                            colorFilter = GlideNode.this.colorFilter;
                            drawCurrent.invoke(drawOne, painter3, m4331boximpl, valueOf, colorFilter);
                        }
                    });
                } finally {
                }
            }
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        if (this.currentJob == null) {
            RequestBuilder<Drawable> requestBuilder = this.requestBuilder;
            if (requestBuilder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestBuilder");
                requestBuilder = null;
            }
            launchRequest(requestBuilder);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        clear();
        updateDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeAnimate(CoroutineScope coroutineScope, Resource<Drawable> resource) {
        if (resource.getDataSource() == DataSource.MEMORY_CACHE || !this.isFirstResource || Intrinsics.areEqual(this.transitionFactory, DoNotTransition.Factory.INSTANCE)) {
            this.isFirstResource = false;
            this.transition = DoNotTransition.INSTANCE;
        } else {
            this.isFirstResource = false;
            this.transition = this.transitionFactory.build();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GlideNode$maybeAnimate$1(this, null), 3, null);
        }
    }

    private final void launchRequest(final RequestBuilder<Drawable> requestBuilder) {
        sideEffect(new Function0<Unit>() { // from class: com.bumptech.glide.integration.compose.GlideNode$launchRequest$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RequestBuilder requestBuilder2;
                Job job;
                Job launch$default;
                requestBuilder2 = GlideNode.this.requestBuilder;
                if (requestBuilder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("requestBuilder");
                    requestBuilder2 = null;
                }
                if (Intrinsics.areEqual(requestBuilder2, requestBuilder)) {
                    job = GlideNode.this.currentJob;
                    Preconditions.checkArgument(job == null);
                    GlideNode glideNode = GlideNode.this;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.plus(glideNode.getCoroutineScope(), Dispatchers.getMain().getImmediate()), null, null, new AnonymousClass1(GlideNode.this, requestBuilder, null), 3, null);
                    glideNode.currentJob = launch$default;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: GlideModifier.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(c = "com.bumptech.glide.integration.compose.GlideNode$launchRequest$1$1", f = "GlideModifier.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.bumptech.glide.integration.compose.GlideNode$launchRequest$1$1, reason: invalid class name */
            /* loaded from: classes7.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ RequestBuilder<Drawable> $requestBuilder;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GlideNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GlideNode glideNode, RequestBuilder<Drawable> requestBuilder, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = glideNode;
                    this.$requestBuilder = requestBuilder;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$requestBuilder, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ResolvableGlideSize resolvableGlideSize;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        ResolvableGlideSize resolvableGlideSize2 = null;
                        this.this$0.placeholder = null;
                        this.this$0.placeholderPositionAndSize = null;
                        RequestBuilder<Drawable> requestBuilder = this.$requestBuilder;
                        resolvableGlideSize = this.this$0.resolvableGlideSize;
                        if (resolvableGlideSize == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("resolvableGlideSize");
                        } else {
                            resolvableGlideSize2 = resolvableGlideSize;
                        }
                        Flow flowResolvable = FlowsKt.flowResolvable(requestBuilder, resolvableGlideSize2);
                        final GlideNode glideNode = this.this$0;
                        final RequestBuilder<Drawable> requestBuilder2 = this.$requestBuilder;
                        this.label = 1;
                        if (flowResolvable.collect(new FlowCollector<GlideFlowInstant<Drawable>>() { // from class: com.bumptech.glide.integration.compose.GlideNode.launchRequest.1.1.1

                            /* compiled from: GlideModifier.kt */
                            @Metadata(k = 3, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                            /* renamed from: com.bumptech.glide.integration.compose.GlideNode$launchRequest$1$1$1$WhenMappings */
                            /* loaded from: classes7.dex */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[Status.values().length];
                                    iArr[Status.RUNNING.ordinal()] = 1;
                                    iArr[Status.CLEARED.ordinal()] = 2;
                                    iArr[Status.FAILED.ordinal()] = 3;
                                    iArr[Status.SUCCEEDED.ordinal()] = 4;
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(GlideFlowInstant<Drawable> glideFlowInstant, Continuation continuation) {
                                return emit2(glideFlowInstant, (Continuation<? super Unit>) continuation);
                            }

                            /* renamed from: emit, reason: avoid collision after fix types in other method */
                            public final Object emit2(GlideFlowInstant<Drawable> glideFlowInstant, Continuation<? super Unit> continuation) {
                                RequestState.Loading loading;
                                Pair pair;
                                RequestListener requestListener;
                                boolean z;
                                if (glideFlowInstant instanceof Resource) {
                                    Resource resource = (Resource) glideFlowInstant;
                                    GlideNode.this.maybeAnimate(coroutineScope, resource);
                                    pair = new Pair(new RequestState.Success(resource.getDataSource()), resource.getResource());
                                } else if (glideFlowInstant instanceof com.bumptech.glide.integration.ktx.Placeholder) {
                                    Drawable placeholder = ((com.bumptech.glide.integration.ktx.Placeholder) glideFlowInstant).getPlaceholder();
                                    int i2 = WhenMappings.$EnumSwitchMapping$0[glideFlowInstant.getStatus().ordinal()];
                                    if (i2 == 1 || i2 == 2) {
                                        loading = RequestState.Loading.INSTANCE;
                                    } else {
                                        if (i2 != 3) {
                                            if (i2 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw new IllegalStateException();
                                        }
                                        loading = RequestState.Failure.INSTANCE;
                                    }
                                    GlideNode.this.placeholder = placeholder != null ? PainterKt.toPainter(placeholder) : null;
                                    GlideNode.this.placeholderPositionAndSize = null;
                                    pair = new Pair(loading, placeholder);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                RequestState requestState = (RequestState) pair.component1();
                                Drawable drawable = (Drawable) pair.component2();
                                GlideNode.this.updateDrawable(drawable);
                                requestListener = GlideNode.this.requestListener;
                                if (requestListener != null) {
                                    requestListener.onStateChanged(ModelExtractorKt.getInternalModel(requestBuilder2), drawable, requestState);
                                }
                                GlideNode.this.state = requestState;
                                z = GlideNode.this.hasFixedSize;
                                if (z) {
                                    DrawModifierNodeKt.invalidateDraw(GlideNode.this);
                                } else {
                                    LayoutModifierNodeKt.invalidateMeasurement(GlideNode.this);
                                }
                                return Unit.INSTANCE;
                            }
                        }, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateDrawable(Drawable drawable) {
        this.drawable = drawable;
        if (drawable != 0) {
            drawable.setCallback(null);
        }
        Drawable drawable2 = this.drawable;
        if (drawable2 != null) {
            drawable2.setVisible(false, false);
        }
        Object obj = this.drawable;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        this.painter = drawable != 0 ? PainterKt.toPainter(drawable) : null;
        if (drawable != 0) {
            drawable.setCallback(getCallback());
        }
        if (drawable != 0) {
            drawable.setVisible(true, true);
        }
        Animatable animatable2 = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        this.drawablePositionAndSize = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        clear();
        if (Intrinsics.areEqual(this.transition, DoNotTransition.INSTANCE)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new GlideNode$onDetach$1(this, null), 3, null);
    }

    private final void clear() {
        this.isFirstResource = true;
        Job job = this.currentJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.currentJob = null;
        this.state = RequestState.Loading.INSTANCE;
        updateDrawable(null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo395measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ResolvableGlideSize resolvableGlideSize = null;
        this.placeholderPositionAndSize = null;
        this.drawablePositionAndSize = null;
        this.hasFixedSize = m7663hasFixedSizeBRTryo0(j);
        this.inferredGlideSize = SizesKt.m7684inferredGlideSizeBRTryo0(j);
        ResolvableGlideSize resolvableGlideSize2 = this.resolvableGlideSize;
        if (resolvableGlideSize2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resolvableGlideSize");
        } else {
            resolvableGlideSize = resolvableGlideSize2;
        }
        if (resolvableGlideSize instanceof AsyncGlideSize) {
            Size size = this.inferredGlideSize;
            if (size != null) {
                ((AsyncGlideSize) resolvableGlideSize).setSize(size);
            }
        } else {
            boolean z = resolvableGlideSize instanceof ImmediateGlideSize;
        }
        final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(m7667modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measure, mo5851measureBRTryo0.getWidth(), mo5851measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideNode$measure$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: hasFixedSize-BRTryo0, reason: not valid java name */
    private final boolean m7663hasFixedSizeBRTryo0(long j) {
        return Constraints.m6948getHasFixedWidthimpl(j) && Constraints.m6947getHasFixedHeightimpl(j);
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m7667modifyConstraintsZezNO4M(long constraints) {
        int m6952getMinWidthimpl;
        int m6951getMinHeightimpl;
        if (m7663hasFixedSizeBRTryo0(constraints)) {
            return Constraints.m6941copyZbe2FdA$default(constraints, Constraints.m6950getMaxWidthimpl(constraints), 0, Constraints.m6949getMaxHeightimpl(constraints), 0, 10, null);
        }
        Painter painter = this.painter;
        if (painter == null) {
            return constraints;
        }
        long drawableIntrinsicSize = painter.getDrawableIntrinsicSize();
        if (Constraints.m6948getHasFixedWidthimpl(constraints)) {
            m6952getMinWidthimpl = Constraints.m6950getMaxWidthimpl(constraints);
        } else if (m7666isValidWidthuvyYCjk(drawableIntrinsicSize)) {
            m6952getMinWidthimpl = MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4343getWidthimpl(drawableIntrinsicSize));
        } else {
            m6952getMinWidthimpl = Constraints.m6952getMinWidthimpl(constraints);
        }
        if (Constraints.m6947getHasFixedHeightimpl(constraints)) {
            m6951getMinHeightimpl = Constraints.m6949getMaxHeightimpl(constraints);
        } else if (m7665isValidHeightuvyYCjk(drawableIntrinsicSize)) {
            m6951getMinHeightimpl = MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4340getHeightimpl(drawableIntrinsicSize));
        } else {
            m6951getMinHeightimpl = Constraints.m6951getMinHeightimpl(constraints);
        }
        int m6967constrainWidthK40F9xA = ConstraintsKt.m6967constrainWidthK40F9xA(constraints, m6952getMinWidthimpl);
        int m6966constrainHeightK40F9xA = ConstraintsKt.m6966constrainHeightK40F9xA(constraints, m6951getMinHeightimpl);
        long Size = SizeKt.Size(m6952getMinWidthimpl, m6951getMinHeightimpl);
        ContentScale contentScale = this.contentScale;
        if (contentScale == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentScale");
            contentScale = null;
        }
        long m5955timesUQTWf7w = ScaleFactorKt.m5955timesUQTWf7w(Size, contentScale.mo5842computeScaleFactorH7hwNQA(Size, SizeKt.Size(m6967constrainWidthK40F9xA, m6966constrainHeightK40F9xA)));
        return Constraints.m6941copyZbe2FdA$default(constraints, ConstraintsKt.m6967constrainWidthK40F9xA(constraints, MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4343getWidthimpl(m5955timesUQTWf7w))), 0, ConstraintsKt.m6966constrainHeightK40F9xA(constraints, MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4340getHeightimpl(m5955timesUQTWf7w))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        GlideModifierKt.setDisplayedDrawable(semanticsPropertyReceiver, new Function0<Drawable>() { // from class: com.bumptech.glide.integration.compose.GlideNode$applySemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Drawable invoke() {
                Drawable drawable;
                drawable = GlideNode.this.drawable;
                return drawable;
            }
        });
    }

    public boolean equals(Object other) {
        if (!(other instanceof GlideNode)) {
            return false;
        }
        RequestBuilder<Drawable> requestBuilder = this.requestBuilder;
        Alignment alignment = null;
        if (requestBuilder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBuilder");
            requestBuilder = null;
        }
        GlideNode glideNode = (GlideNode) other;
        RequestBuilder<Drawable> requestBuilder2 = glideNode.requestBuilder;
        if (requestBuilder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBuilder");
            requestBuilder2 = null;
        }
        if (!Intrinsics.areEqual(requestBuilder, requestBuilder2)) {
            return false;
        }
        ContentScale contentScale = this.contentScale;
        if (contentScale == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentScale");
            contentScale = null;
        }
        ContentScale contentScale2 = glideNode.contentScale;
        if (contentScale2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentScale");
            contentScale2 = null;
        }
        if (!Intrinsics.areEqual(contentScale, contentScale2)) {
            return false;
        }
        Alignment alignment2 = this.alignment;
        if (alignment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alignment");
            alignment2 = null;
        }
        Alignment alignment3 = glideNode.alignment;
        if (alignment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alignment");
        } else {
            alignment = alignment3;
        }
        return Intrinsics.areEqual(alignment2, alignment) && Intrinsics.areEqual(this.colorFilter, glideNode.colorFilter) && Intrinsics.areEqual(this.requestListener, glideNode.requestListener) && this.draw == glideNode.draw && Intrinsics.areEqual(this.transitionFactory, glideNode.transitionFactory) && this.alpha == glideNode.alpha;
    }

    public int hashCode() {
        RequestBuilder<Drawable> requestBuilder = this.requestBuilder;
        Alignment alignment = null;
        if (requestBuilder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBuilder");
            requestBuilder = null;
        }
        int hashCode = requestBuilder.hashCode() * 31;
        ContentScale contentScale = this.contentScale;
        if (contentScale == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentScale");
            contentScale = null;
        }
        int hashCode2 = (hashCode + contentScale.hashCode()) * 31;
        Alignment alignment2 = this.alignment;
        if (alignment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alignment");
        } else {
            alignment = alignment2;
        }
        int hashCode3 = (hashCode2 + alignment.hashCode()) * 31;
        ColorFilter colorFilter = this.colorFilter;
        int hashCode4 = (((hashCode3 + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + Boolean.hashCode(this.draw)) * 31;
        RequestListener requestListener = this.requestListener;
        return ((((hashCode4 + (requestListener != null ? requestListener.hashCode() : 0)) * 31) + this.transitionFactory.hashCode()) * 31) + Float.hashCode(this.alpha);
    }

    /* renamed from: isValidWidth-uvyYCjk, reason: not valid java name */
    private final boolean m7666isValidWidthuvyYCjk(long j) {
        return j != androidx.compose.ui.geometry.Size.INSTANCE.m4351getUnspecifiedNHjbRc() && isValidDimension(androidx.compose.ui.geometry.Size.m4343getWidthimpl(j));
    }

    /* renamed from: isValidHeight-uvyYCjk, reason: not valid java name */
    private final boolean m7665isValidHeightuvyYCjk(long j) {
        return j != androidx.compose.ui.geometry.Size.INSTANCE.m4351getUnspecifiedNHjbRc() && isValidDimension(androidx.compose.ui.geometry.Size.m4340getHeightimpl(j));
    }
}
