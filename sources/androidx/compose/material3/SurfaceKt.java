package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0091\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001am\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0099\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u009f\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060#2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010$\u001a\"\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a8\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020+H\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "shadowElevation", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surface", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Dp invoke() {
            return Dp.m6995boximpl(m2872invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m2872invokeD9Ej5fM() {
            return Dp.m6997constructorimpl(0);
        }
    }, 1, null);

    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m2864SurfaceT9BRK9s(Modifier modifier, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -513881741, "C(Surface)P(4,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)96@5014L11,97@5061L22,*103@5278L7,107@5451L741,104@5307L885:Surface.kt#uh7d8r");
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Shape rectangleShape = (i2 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long surface = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j;
        long m2251contentColorForek8zF_U = (i2 & 8) != 0 ? ColorSchemeKt.m2251contentColorForek8zF_U(surface, composer, (i >> 6) & 14) : j2;
        float m6997constructorimpl = (i2 & 16) != 0 ? Dp.m6997constructorimpl(0) : f;
        float m6997constructorimpl2 = (i2 & 32) != 0 ? Dp.m6997constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m6997constructorimpl3 = Dp.m6997constructorimpl(((Dp) consume).m7011unboximpl() + m6997constructorimpl);
        final Modifier modifier2 = companion;
        final Shape shape2 = rectangleShape;
        final long j3 = surface;
        final BorderStroke borderStroke3 = borderStroke2;
        final float f3 = m6997constructorimpl2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(m2251contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6995boximpl(m6997constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                long m2871surfaceColorAtElevationCLU3JFs;
                Modifier m2870surfaceXOJAsU;
                ComposerKt.sourceInformation(composer2, "C114@5653L69,*116@5825L7,108@5461L725:Surface.kt#uh7d8r");
                if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-70914509, i3, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
                    }
                    Modifier modifier3 = Modifier.this;
                    Shape shape3 = shape2;
                    m2871surfaceColorAtElevationCLU3JFs = SurfaceKt.m2871surfaceColorAtElevationCLU3JFs(j3, m6997constructorimpl3, composer2, 0);
                    BorderStroke borderStroke4 = borderStroke3;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    m2870surfaceXOJAsU = SurfaceKt.m2870surfaceXOJAsU(modifier3, shape3, m2871surfaceColorAtElevationCLU3JFs, borderStroke4, ((Density) consume2).mo677toPx0680j_4(f3));
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m2870surfaceXOJAsU, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                        }
                    }), Unit.INSTANCE, new AnonymousClass3(null));
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, pointerInput);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1154533166, "C125@6167L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Surface.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
            /* loaded from: classes8.dex */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                int label;

                AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m2867Surfaceo_FOJdg(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -789752804, "C(Surface)P(7,6,4,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.unit.Dp,8:c#ui.unit.Dp!1,5)196@10536L11,197@10583L22,*204@10857L7,208@11030L853,205@10886L997:Surface.kt#uh7d8r");
        final Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z2 = (i3 & 4) != 0 ? true : z;
        final Shape rectangleShape = (i3 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j;
        long m2251contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m2251contentColorForek8zF_U(surface, composer, (i >> 12) & 14) : j2;
        float m6997constructorimpl = (i3 & 64) != 0 ? Dp.m6997constructorimpl(0) : f;
        float m6997constructorimpl2 = (i3 & 128) != 0 ? Dp.m6997constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 256) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i3 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i, i2, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m6997constructorimpl3 = Dp.m6997constructorimpl(((Dp) consume).m7011unboximpl() + m6997constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final float f3 = m6997constructorimpl2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(m2251contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6995boximpl(m6997constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                long m2871surfaceColorAtElevationCLU3JFs;
                Modifier m2870surfaceXOJAsU;
                ComposerKt.sourceInformation(composer2, "C216@11287L69,*218@11459L7,222@11649L32,209@11040L837:Surface.kt#uh7d8r");
                if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1279702876, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
                    }
                    Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                    Shape shape2 = rectangleShape;
                    m2871surfaceColorAtElevationCLU3JFs = SurfaceKt.m2871surfaceColorAtElevationCLU3JFs(surface, m6997constructorimpl3, composer2, 0);
                    BorderStroke borderStroke4 = borderStroke3;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    m2870surfaceXOJAsU = SurfaceKt.m2870surfaceXOJAsU(minimumInteractiveComponentSize, shape2, m2871surfaceColorAtElevationCLU3JFs, borderStroke4, ((Density) consume2).mo677toPx0680j_4(f3));
                    Modifier m571clickableO2vRcR0$default = ClickableKt.m571clickableO2vRcR0$default(m2870surfaceXOJAsU, mutableInteractionSource2, RippleKt.m2728rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z2, null, null, function0, 24, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m571clickableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1148887694, "C228@11858L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2865Surfaced85dljk(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 540296512, "C(Surface)P(8,7,6,4,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,5)299@16163L11,300@16210L22,*307@16484L7,311@16657L899,308@16513L1043:Surface.kt#uh7d8r");
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i3 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j;
        long m2251contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m2251contentColorForek8zF_U(surface, composer, (i >> 15) & 14) : j2;
        float m6997constructorimpl = (i3 & 128) != 0 ? Dp.m6997constructorimpl(0) : f;
        final float m6997constructorimpl2 = (i3 & 256) != 0 ? Dp.m6997constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 1024) != 0 ? null : mutableInteractionSource;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i, i2, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m6997constructorimpl3 = Dp.m6997constructorimpl(((Dp) consume).m7011unboximpl() + m6997constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(m2251contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6995boximpl(m6997constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                long m2871surfaceColorAtElevationCLU3JFs;
                Modifier m2870surfaceXOJAsU;
                ComposerKt.sourceInformation(composer2, "C319@16914L69,*321@17086L7,326@17322L32,312@16667L883:Surface.kt#uh7d8r");
                if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1164547968, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)");
                    }
                    Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                    Shape shape2 = rectangleShape;
                    m2871surfaceColorAtElevationCLU3JFs = SurfaceKt.m2871surfaceColorAtElevationCLU3JFs(surface, m6997constructorimpl3, composer2, 0);
                    BorderStroke borderStroke4 = borderStroke3;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    m2870surfaceXOJAsU = SurfaceKt.m2870surfaceXOJAsU(minimumInteractiveComponentSize, shape2, m2871surfaceColorAtElevationCLU3JFs, borderStroke4, ((Density) consume2).mo677toPx0680j_4(m6997constructorimpl2));
                    Modifier m1237selectableO2vRcR0$default = SelectableKt.m1237selectableO2vRcR0$default(m2870surfaceXOJAsU, z, mutableInteractionSource3, RippleKt.m2728rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, function0, 16, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1237selectableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1143260078, "C332@17531L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2866Surfaced85dljk(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1877401889, "C(Surface)P(1,8,7,5,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,6)403@21903L11,404@21950L22,*411@22224L7,415@22397L909,412@22253L1053:Surface.kt#uh7d8r");
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i3 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j;
        long m2251contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m2251contentColorForek8zF_U(surface, composer, (i >> 15) & 14) : j2;
        float m6997constructorimpl = (i3 & 128) != 0 ? Dp.m6997constructorimpl(0) : f;
        final float m6997constructorimpl2 = (i3 & 256) != 0 ? Dp.m6997constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 1024) != 0 ? null : mutableInteractionSource;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i, i2, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float m6997constructorimpl3 = Dp.m6997constructorimpl(((Dp) consume).m7011unboximpl() + m6997constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(m2251contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6995boximpl(m6997constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(712720927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                long m2871surfaceColorAtElevationCLU3JFs;
                Modifier m2870surfaceXOJAsU;
                ComposerKt.sourceInformation(composer2, "C423@22654L69,*425@22826L7,430@23058L32,416@22407L893:Surface.kt#uh7d8r");
                if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(712720927, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:416)");
                    }
                    Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                    Shape shape2 = rectangleShape;
                    m2871surfaceColorAtElevationCLU3JFs = SurfaceKt.m2871surfaceColorAtElevationCLU3JFs(surface, m6997constructorimpl3, composer2, 0);
                    BorderStroke borderStroke4 = borderStroke3;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    m2870surfaceXOJAsU = SurfaceKt.m2870surfaceXOJAsU(minimumInteractiveComponentSize, shape2, m2871surfaceColorAtElevationCLU3JFs, borderStroke4, ((Density) consume2).mo677toPx0680j_4(m6997constructorimpl2));
                    Modifier m1242toggleableO2vRcR0$default = ToggleableKt.m1242toggleableO2vRcR0$default(m2870surfaceXOJAsU, z, mutableInteractionSource3, RippleKt.m2728rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, function1, 16, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1242toggleableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1137556078, "C436@23281L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m2870surfaceXOJAsU(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier.Companion companion;
        Shape shape2;
        Modifier.Companion companion2;
        if (f > 0.0f) {
            companion = GraphicsLayerModifierKt.m4676graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, false, null, 0L, 0L, 0, 124895, null);
        } else {
            companion = Modifier.INSTANCE;
        }
        Modifier then = modifier.then(companion);
        if (borderStroke != null) {
            shape2 = shape;
            companion2 = BorderKt.border(Modifier.INSTANCE, borderStroke, shape2);
        } else {
            shape2 = shape;
            companion2 = Modifier.INSTANCE;
        }
        return ClipKt.clip(BackgroundKt.m539backgroundbw27NRU(then.then(companion2), j, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m2871surfaceColorAtElevationCLU3JFs(long j, float f, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -2079918090, "C(surfaceColorAtElevation)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)465@24025L11,465@24037L37:Surface.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        int i2 = i << 3;
        long m2249applyTonalElevationRFCenO8 = ColorSchemeKt.m2249applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j, f, composer, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i2 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2249applyTonalElevationRFCenO8;
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }
}
