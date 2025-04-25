package androidx.compose.foundation.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextLinkScope.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001fJ>\u0010 \u001a\u00020\t2\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\"\"\u0004\u0018\u00010\u00012\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010$J\r\u0010%\u001a\u00020\u0003H\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u001c\u0010,\u001a\u0004\u0018\u00010-2\u0010\u0010.\u001a\f\u0012\u0004\u0012\u00020)0/j\u0002`0H\u0002J\u001c\u00101\u001a\u0004\u0018\u0001022\u0010\u0010.\u001a\f\u0012\u0004\u0012\u00020)0/j\u0002`0H\u0002J\u001a\u00103\u001a\u0004\u0018\u000104*\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000104H\u0002J\u001c\u00106\u001a\u000207*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002R%\u0010\u0005\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0004R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006;"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "initialText", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotators", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/TextAnnotatorScope;", "", "Lkotlin/ExtensionFunctionType;", "getInitialText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "shouldMeasureLinks", "Lkotlin/Function0;", "", "getShouldMeasureLinks", "()Lkotlin/jvm/functions/Function0;", "text", "getText$foundation_release", "setText$foundation_release", "<set-?>", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setTextLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "textLayoutResult$delegate", "Landroidx/compose/runtime/MutableState;", "LinksComposables", "(Landroidx/compose/runtime/Composer;I)V", "StyleAnnotation", UserMetadata.KEYDATA_FILENAME, "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "applyAnnotators", "applyAnnotators$foundation_release", "handleLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "uriHandler", "Landroidx/compose/ui/platform/UriHandler;", "pathForRangeInRangeCoordinates", "Landroidx/compose/ui/graphics/Path;", "range", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/foundation/text/LinkRange;", "shapeForRange", "Landroidx/compose/ui/graphics/Shape;", "mergeOrUse", "Landroidx/compose/ui/text/SpanStyle;", "other", "textRange", "Landroidx/compose/ui/Modifier;", "start", "", TtmlNode.END, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextLinkScope {
    public static final int $stable = 8;
    private final SnapshotStateList<Function1<TextAnnotatorScope, Unit>> annotators;
    private final AnnotatedString initialText;
    private AnnotatedString text;

    /* renamed from: textLayoutResult$delegate, reason: from kotlin metadata */
    private final MutableState textLayoutResult;

    public TextLinkScope(AnnotatedString annotatedString) {
        MutableState mutableStateOf$default;
        SpanStyle style;
        this.initialText = annotatedString;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.textLayoutResult = mutableStateOf$default;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString);
        List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
        int size = linkAnnotations.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<LinkAnnotation> range = linkAnnotations.get(i);
            TextLinkStyles styles = range.getItem().getStyles();
            if (styles != null && (style = styles.getStyle()) != null) {
                builder.addStyle(style, range.getStart(), range.getEnd());
            }
        }
        this.text = builder.toAnnotatedString();
        this.annotators = SnapshotStateKt.mutableStateListOf();
    }

    /* renamed from: getInitialText$foundation_release, reason: from getter */
    public final AnnotatedString getInitialText() {
        return this.initialText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult getTextLayoutResult() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void setTextLayoutResult(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }

    /* renamed from: getText$foundation_release, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    public final void setText$foundation_release(AnnotatedString annotatedString) {
        this.text = annotatedString;
    }

    public final Function0<Boolean> getShouldMeasureLinks() {
        return new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextLinkScope$shouldMeasureLinks$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextLayoutInput layoutInput;
                AnnotatedString text = TextLinkScope.this.getText();
                TextLayoutResult textLayoutResult = TextLinkScope.this.getTextLayoutResult();
                return Boolean.valueOf(Intrinsics.areEqual(text, (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null) ? null : layoutInput.getText()));
            }
        };
    }

    private final Modifier textRange(Modifier modifier, final int i, final int i2) {
        return modifier.then(new TextRangeLayoutModifier(new TextRangeScopeMeasurePolicy() { // from class: androidx.compose.foundation.text.TextLinkScope$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
            public final TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
                TextRangeLayoutMeasureResult textRange$lambda$3;
                textRange$lambda$3 = TextLinkScope.textRange$lambda$3(TextLinkScope.this, i, i2, textRangeLayoutMeasureScope);
                return textRange$lambda$3;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRangeLayoutMeasureResult textRange$lambda$3(TextLinkScope textLinkScope, int i, int i2, TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult textLayoutResult = textLinkScope.getTextLayoutResult();
        if (textLayoutResult == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$layoutResult$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ IntOffset invoke() {
                    return IntOffset.m7116boximpl(m1402invokenOccac());
                }

                /* renamed from: invoke-nOcc-ac, reason: not valid java name */
                public final long m1402invokenOccac() {
                    return IntOffset.INSTANCE.m7135getZeronOccac();
                }
            });
        }
        final IntRect roundToIntRect = IntRectKt.roundToIntRect(textLayoutResult.getPathForRange(i, i2).getBounds());
        return textRangeLayoutMeasureScope.layout(roundToIntRect.getWidth(), roundToIntRect.getHeight(), new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ IntOffset invoke() {
                return IntOffset.m7116boximpl(m1401invokenOccac());
            }

            /* renamed from: invoke-nOcc-ac, reason: not valid java name */
            public final long m1401invokenOccac() {
                return IntRect.this.m7153getTopLeftnOccac();
            }
        });
    }

    private final Shape shapeForRange(AnnotatedString.Range<LinkAnnotation> range) {
        final Path pathForRangeInRangeCoordinates = pathForRangeInRangeCoordinates(range);
        return pathForRangeInRangeCoordinates != null ? new Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
            @Override // androidx.compose.ui.graphics.Shape
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo588createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
                return new Outline.Generic(Path.this);
            }
        } : null;
    }

    private final Path pathForRangeInRangeCoordinates(AnnotatedString.Range<LinkAnnotation> range) {
        TextLayoutResult textLayoutResult;
        if (!getShouldMeasureLinks().invoke().booleanValue() || (textLayoutResult = getTextLayoutResult()) == null) {
            return null;
        }
        Path pathForRange = textLayoutResult.getPathForRange(range.getStart(), range.getEnd());
        Rect boundingBox = textLayoutResult.getBoundingBox(range.getStart());
        pathForRange.mo4410translatek4lQ0M(Offset.m4283unaryMinusF1C5BW0(OffsetKt.Offset(textLayoutResult.getLineForOffset(range.getStart()) == textLayoutResult.getLineForOffset(range.getEnd()) ? Math.min(textLayoutResult.getBoundingBox(range.getEnd() - 1).getLeft(), boundingBox.getLeft()) : 0.0f, boundingBox.getTop())));
        return pathForRange;
    }

    public final void LinksComposables(Composer composer, final int i) {
        int i2;
        int i3;
        Modifier modifier;
        Modifier m574combinedClickableXVZzFYc;
        boolean isNullOrEmpty;
        Composer startRestartGroup = composer.startRestartGroup(1154651354);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinksComposables)152@6664L7:TextLinkScope.kt#423gt5");
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154651354, i2, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:151)");
            }
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final UriHandler uriHandler = (UriHandler) consume;
            AnnotatedString annotatedString = this.text;
            List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
            int size = linkAnnotations.size();
            int i5 = 0;
            while (i5 < size) {
                final AnnotatedString.Range<LinkAnnotation> range = linkAnnotations.get(i5);
                if (range.getStart() != range.getEnd()) {
                    startRestartGroup.startReplaceGroup(1383573569);
                    ComposerKt.sourceInformation(startRestartGroup, "159@6983L39,169@7447L38,161@7040L489");
                    Shape shapeForRange = shapeForRange(range);
                    if (shapeForRange == null || (modifier = ClipKt.clip(Modifier.INSTANCE, shapeForRange)) == null) {
                        modifier = Modifier.INSTANCE;
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -371007813, "CC(remember):TextLinkScope.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(HoverableKt.hoverable$default(textRange(modifier, range.getStart(), range.getEnd()), mutableInteractionSource, false, i4, null), PointerIcon.INSTANCE.getHand(), false, i4, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -370992966, "CC(remember):TextLinkScope.kt#9igjgp");
                    boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changed(range) | startRestartGroup.changedInstance(uriHandler);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$1$1
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
                                TextLinkScope.this.handleLink(range.getItem(), uriHandler);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    m574combinedClickableXVZzFYc = ClickableKt.m574combinedClickableXVZzFYc(pointerHoverIcon$default, mutableInteractionSource, null, (r22 & 4) != 0, (r22 & 8) != 0 ? null : null, (r22 & 16) != 0 ? null : null, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : null, (r22 & 128) != 0 ? null : null, (Function0) rememberedValue2);
                    BoxKt.Box(m574combinedClickableXVZzFYc, startRestartGroup, 0);
                    isNullOrEmpty = TextLinkScopeKt.isNullOrEmpty(range.getItem().getStyles());
                    if (!isNullOrEmpty) {
                        startRestartGroup.startReplaceGroup(1384317910);
                        ComposerKt.sourceInformation(startRestartGroup, "174@7633L49,175@7737L110,175@7703L144,187@8288L1225,179@7869L1644");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -370987003, "CC(remember):TextLinkScope.kt#9igjgp");
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new LinkStateInteractionSourceObserver();
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        final LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (LinkStateInteractionSourceObserver) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -370983614, "CC(remember):TextLinkScope.kt#9igjgp");
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function2) new TextLinkScope$LinksComposables$1$2$1(linkStateInteractionSourceObserver, mutableInteractionSource, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 6);
                        Object[] objArr = new Object[7];
                        objArr[0] = Boolean.valueOf(linkStateInteractionSourceObserver.isHovered());
                        objArr[1] = Boolean.valueOf(linkStateInteractionSourceObserver.isFocused());
                        i3 = 2;
                        objArr[2] = Boolean.valueOf(linkStateInteractionSourceObserver.isPressed());
                        TextLinkStyles styles = range.getItem().getStyles();
                        objArr[3] = styles != null ? styles.getStyle() : null;
                        TextLinkStyles styles2 = range.getItem().getStyles();
                        objArr[4] = styles2 != null ? styles2.getFocusedStyle() : null;
                        TextLinkStyles styles3 = range.getItem().getStyles();
                        objArr[5] = styles3 != null ? styles3.getHoveredStyle() : null;
                        TextLinkStyles styles4 = range.getItem().getStyles();
                        objArr[6] = styles4 != null ? styles4.getPressedStyle() : null;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -370964867, "CC(remember):TextLinkScope.kt#9igjgp");
                        boolean changedInstance2 = startRestartGroup.changedInstance(this) | startRestartGroup.changed(range);
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (Function1) new Function1<TextAnnotatorScope, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatorScope textAnnotatorScope) {
                                    invoke2(textAnnotatorScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextAnnotatorScope textAnnotatorScope) {
                                    SpanStyle mergeOrUse;
                                    SpanStyle mergeOrUse2;
                                    SpanStyle mergeOrUse3;
                                    TextLinkStyles styles5;
                                    TextLinkStyles styles6;
                                    TextLinkStyles styles7;
                                    TextLinkScope textLinkScope = TextLinkScope.this;
                                    TextLinkStyles styles8 = range.getItem().getStyles();
                                    SpanStyle spanStyle = null;
                                    mergeOrUse = textLinkScope.mergeOrUse(styles8 != null ? styles8.getStyle() : null, (!linkStateInteractionSourceObserver.isFocused() || (styles7 = range.getItem().getStyles()) == null) ? null : styles7.getFocusedStyle());
                                    mergeOrUse2 = textLinkScope.mergeOrUse(mergeOrUse, (!linkStateInteractionSourceObserver.isHovered() || (styles6 = range.getItem().getStyles()) == null) ? null : styles6.getHoveredStyle());
                                    if (linkStateInteractionSourceObserver.isPressed() && (styles5 = range.getItem().getStyles()) != null) {
                                        spanStyle = styles5.getPressedStyle();
                                    }
                                    mergeOrUse3 = textLinkScope.mergeOrUse(mergeOrUse2, spanStyle);
                                    if (mergeOrUse3 != null) {
                                        AnnotatedString.Range<LinkAnnotation> range2 = range;
                                        textAnnotatorScope.replaceStyle(mergeOrUse3, range2.getStart(), range2.getEnd());
                                    }
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        StyleAnnotation(objArr, (Function1) rememberedValue5, startRestartGroup, (i2 << 6) & 896);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i3 = 2;
                        startRestartGroup.startReplaceGroup(1386186094);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    i3 = i4;
                    startRestartGroup.startReplaceGroup(1386199982);
                    startRestartGroup.endReplaceGroup();
                }
                i5++;
                i4 = i3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    TextLinkScope.this.LinksComposables(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpanStyle mergeOrUse(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle merge;
        return (spanStyle == null || (merge = spanStyle.merge(spanStyle2)) == null) ? spanStyle2 : merge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLink(LinkAnnotation link, UriHandler uriHandler) {
        LinkInteractionListener linkInteractionListener;
        Unit unit;
        if (!(link instanceof LinkAnnotation.Url)) {
            if (!(link instanceof LinkAnnotation.Clickable) || (linkInteractionListener = link.getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.onClick(link);
            return;
        }
        LinkInteractionListener linkInteractionListener2 = link.getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.onClick(link);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            try {
                uriHandler.openUri(((LinkAnnotation.Url) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final AnnotatedString applyAnnotators$foundation_release() {
        AnnotatedString annotatedString;
        if (this.annotators.isEmpty()) {
            annotatedString = this.text;
        } else {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(this.initialText);
            TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(builder);
            SnapshotStateList<Function1<TextAnnotatorScope, Unit>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                snapshotStateList.get(i).invoke(textAnnotatorScope);
            }
            annotatedString = builder.toAnnotatedString();
        }
        this.text = annotatedString;
        return annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void StyleAnnotation(final Object[] objArr, final Function1<? super TextAnnotatorScope, Unit> function1, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2083052099);
        ComposerKt.sourceInformation(startRestartGroup, "C(StyleAnnotation)P(1)250@11030L117,250@10999L148:TextLinkScope.kt#423gt5");
        int i2 = (i & 48) == 0 ? (startRestartGroup.changedInstance(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        startRestartGroup.startMovableGroup(-416694679, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i2 |= startRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2083052099, i2, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:249)");
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(function1);
            spreadBuilder.addSpread(objArr);
            Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -416691443, "CC(remember):TextLinkScope.kt#9igjgp");
            boolean changedInstance = ((i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 32) | startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        SnapshotStateList snapshotStateList;
                        snapshotStateList = TextLinkScope.this.annotators;
                        snapshotStateList.add(function1);
                        final TextLinkScope textLinkScope = TextLinkScope.this;
                        final Function1<TextAnnotatorScope, Unit> function12 = function1;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                SnapshotStateList snapshotStateList2;
                                snapshotStateList2 = TextLinkScope.this.annotators;
                                snapshotStateList2.remove(function12);
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(array, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$2
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
                    TextLinkScope textLinkScope = TextLinkScope.this;
                    Object[] objArr2 = objArr;
                    textLinkScope.StyleAnnotation(Arrays.copyOf(objArr2, objArr2.length), function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
