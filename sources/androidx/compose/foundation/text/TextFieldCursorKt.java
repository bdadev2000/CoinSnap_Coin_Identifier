package androidx.compose.foundation.text;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: TextFieldCursor.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "getDefaultCursorThickness", "()F", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m443infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            keyframesSpecConfig.setDurationMillis(1000);
            Float valueOf = Float.valueOf(1.0f);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf, 0);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf2, 500);
            keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = Dp.m6997constructorimpl(2);

    public static final Modifier cursor(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, final Brush brush, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                Modifier.Companion companion;
                composer.startReplaceGroup(-84507373);
                ComposerKt.sourceInformation(composer, "C45@1789L35,51@2211L7:TextFieldCursor.kt#423gt5");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-84507373, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, 1411529727, "CC(remember):TextFieldCursor.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new CursorAnimationState();
                    composer.updateRememberedValue(rememberedValue);
                }
                final CursorAnimationState cursorAnimationState = (CursorAnimationState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Brush brush2 = Brush.this;
                boolean z2 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).getValue() == 16) ? false : true;
                ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(localWindowInfo);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (((WindowInfo) consume).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m6454getCollapsedimpl(textFieldValue.getSelection()) && z2) {
                    composer.startReplaceGroup(808320157);
                    ComposerKt.sourceInformation(composer, "53@2392L65,53@2337L120,56@2482L1096");
                    AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
                    TextRange m6448boximpl = TextRange.m6448boximpl(textFieldValue.getSelection());
                    ComposerKt.sourceInformationMarkerStart(composer, 1411549053, "CC(remember):TextFieldCursor.kt#9igjgp");
                    boolean changedInstance = composer.changedInstance(cursorAnimationState);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function2) new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    EffectsKt.LaunchedEffect(annotatedString, m6448boximpl, (Function2) rememberedValue2, composer, 0);
                    ComposerKt.sourceInformationMarkerStart(composer, 1411552964, "CC(remember):TextFieldCursor.kt#9igjgp");
                    boolean changedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(Brush.this);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final Brush brush3 = Brush.this;
                    Object rememberedValue3 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function1) new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) {
                                Rect rect;
                                TextLayoutResult value;
                                contentDrawScope.drawContent();
                                float cursorAlpha = CursorAnimationState.this.getCursorAlpha();
                                if (cursorAlpha == 0.0f) {
                                    return;
                                }
                                int originalToTransformed = offsetMapping2.originalToTransformed(TextRange.m6460getStartimpl(textFieldValue2.getSelection()));
                                TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                float f = contentDrawScope.mo677toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                                float f2 = f / 2;
                                float coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(rect.getLeft() + f2, Size.m4343getWidthimpl(contentDrawScope.mo5071getSizeNHjbRc()) - f2), f2);
                                DrawScope.m5056drawLine1RTmtNc$default(contentDrawScope, brush3, OffsetKt.Offset(coerceAtLeast, rect.getTop()), OffsetKt.Offset(coerceAtLeast, rect.getBottom()), f, 0, null, cursorAlpha, null, 0, 432, null);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    companion = DrawModifierKt.drawWithContent(modifier2, (Function1) rememberedValue3);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(809534830);
                    composer.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return companion;
            }
        }, 1, null) : modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
