package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u00102J¦\u0002\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b82\u0006\u0010%\u001a\u00020&2\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020;2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010?\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010@\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010A\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010B\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010C\u001a\u00020D2\u0013\b\u0002\u0010E\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b8H\u0007¢\u0006\u0002\u0010FJ\r\u0010,\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010GJÂ\u0003\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020I2\b\b\u0002\u0010M\u001a\u00020I2\b\b\u0002\u0010N\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020I2\b\b\u0002\u0010P\u001a\u00020I2\b\b\u0002\u0010Q\u001a\u00020I2\b\b\u0002\u0010R\u001a\u00020I2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010U\u001a\u00020I2\b\b\u0002\u0010V\u001a\u00020I2\b\b\u0002\u0010W\u001a\u00020I2\b\b\u0002\u0010X\u001a\u00020I2\b\b\u0002\u0010Y\u001a\u00020I2\b\b\u0002\u0010Z\u001a\u00020I2\b\b\u0002\u0010[\u001a\u00020I2\b\b\u0002\u0010\\\u001a\u00020I2\b\b\u0002\u0010]\u001a\u00020I2\b\b\u0002\u0010^\u001a\u00020I2\b\b\u0002\u0010_\u001a\u00020I2\b\b\u0002\u0010`\u001a\u00020I2\b\b\u0002\u0010a\u001a\u00020I2\b\b\u0002\u0010b\u001a\u00020I2\b\b\u0002\u0010c\u001a\u00020I2\b\b\u0002\u0010d\u001a\u00020I2\b\b\u0002\u0010e\u001a\u00020I2\b\b\u0002\u0010f\u001a\u00020I2\b\b\u0002\u0010g\u001a\u00020I2\b\b\u0002\u0010h\u001a\u00020I2\b\b\u0002\u0010i\u001a\u00020I2\b\b\u0002\u0010j\u001a\u00020I2\b\b\u0002\u0010k\u001a\u00020I2\b\b\u0002\u0010l\u001a\u00020I2\b\b\u0002\u0010m\u001a\u00020I2\b\b\u0002\u0010n\u001a\u00020I2\b\b\u0002\u0010o\u001a\u00020I2\b\b\u0002\u0010p\u001a\u00020I2\b\b\u0002\u0010q\u001a\u00020I2\b\b\u0002\u0010r\u001a\u00020I2\b\b\u0002\u0010s\u001a\u00020I2\b\b\u0002\u0010t\u001a\u00020IH\u0007ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ8\u0010w\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b|\u0010}J8\u0010~\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010}J<\u0010\u0080\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010}J<\u0010\u0082\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010}J<\u0010\u0084\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010}J<\u0010\u0086\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u0010}JM\u0010\u0088\u0001\u001a\u00020+*\u00020+2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u001e\u001a\u00020\u001f*\u00020 8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape$annotations", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape$annotations", "getOutlinedShape", "shape", "getShape", "defaultTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", TextFieldImplKt.ContainerId, "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.RUBY_CONTAINER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "contentPaddingWithLabel", "start", TtmlNode.END, "top", LogEvents.bottom, "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6997constructorimpl(56);
    private static final float MinWidth = Dp.m6997constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations */
    public static /* synthetic */ void m2987getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations */
    public static /* synthetic */ void m2988getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    private TextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1941327459, "C60@2756L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM */
    public final float m3000getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM */
    public final float m3001getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM */
    public final float m3003getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM */
    public final float m2999getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0197  */
    /* renamed from: Container-4EFweAY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2994Container4EFweAY(final boolean r26, final boolean r27, final androidx.compose.foundation.interaction.InteractionSource r28, androidx.compose.ui.Modifier r29, androidx.compose.material3.TextFieldColors r30, androidx.compose.ui.graphics.Shape r31, float r32, float r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m2994Container4EFweAY(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void DecorationBox(final java.lang.String r42, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, final boolean r44, final boolean r45, final androidx.compose.ui.text.input.VisualTransformation r46, final androidx.compose.foundation.interaction.InteractionSource r47, boolean r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, androidx.compose.ui.graphics.Shape r56, androidx.compose.material3.TextFieldColors r57, androidx.compose.foundation.layout.PaddingValues r58, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2985contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2996contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4 */
    public final PaddingValues m2996contentPaddingWithLabela9UjIt4(float start, float r2, float top, float r4) {
        return PaddingKt.m981PaddingValuesa9UjIt4(start, top, r2, r4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2986contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2997contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4 */
    public final PaddingValues m2997contentPaddingWithoutLabela9UjIt4(float start, float top, float r3, float r4) {
        return PaddingKt.m981PaddingValuesa9UjIt4(start, top, r3, r4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default */
    public static /* synthetic */ PaddingValues m2991supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = Dp.m6997constructorimpl(0);
        }
        return textFieldDefaults.m3006supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release */
    public final PaddingValues m3006supportingTextPaddinga9UjIt4$material3_release(float start, float top, float r3, float r4) {
        return PaddingKt.m981PaddingValuesa9UjIt4(start, top, r3, r4);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 831731228, "C(colors)336@16080L11,336@16092L22:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors;
    }

    /* renamed from: colors-0hiis_0 */
    public final TextFieldColors m2995colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ComposerKt.sourceInformationMarkerStart(composer, 1513344955, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,32,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)438@22922L11,438@22934L22:TextFieldDefaults.kt#uh7d8r");
        long m4551getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j;
        long m4551getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j2;
        long m4551getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j3;
        long m4551getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j4;
        long m4551getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j5;
        long m4551getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j6;
        long m4551getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j7;
        long m4551getUnspecified0d7_KjU8 = (i6 & 128) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j8;
        long m4551getUnspecified0d7_KjU9 = (i6 & 256) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j9;
        long m4551getUnspecified0d7_KjU10 = (i6 & 512) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j10;
        TextSelectionColors textSelectionColors2 = (i6 & 1024) != 0 ? null : textSelectionColors;
        long m4551getUnspecified0d7_KjU11 = (i6 & 2048) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j11;
        long m4551getUnspecified0d7_KjU12 = (i6 & 4096) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j12;
        long m4551getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j13;
        long m4551getUnspecified0d7_KjU14 = (i6 & 16384) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j14;
        long m4551getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j15;
        long m4551getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j16;
        long m4551getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j17;
        long m4551getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j18;
        long m4551getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j19;
        long m4551getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j20;
        long m4551getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j21;
        long m4551getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j22;
        long m4551getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j23;
        long m4551getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j24;
        long m4551getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j25;
        long m4551getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j26;
        long m4551getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j27;
        long m4551getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j28;
        long m4551getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j29;
        long m4551getUnspecified0d7_KjU30 = (i6 & 1073741824) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j30;
        long m4551getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j31;
        long m4551getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j32;
        long m4551getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j33;
        long m4551getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j34;
        long m4551getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j35;
        long m4551getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j36;
        long m4551getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j37;
        long m4551getUnspecified0d7_KjU38 = (i7 & 128) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j38;
        long m4551getUnspecified0d7_KjU39 = (i7 & 256) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j39;
        long m4551getUnspecified0d7_KjU40 = (i7 & 512) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j40;
        long m4551getUnspecified0d7_KjU41 = (i7 & 1024) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j41;
        long m4551getUnspecified0d7_KjU42 = (i7 & 2048) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        }
        TextFieldColors m2932copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA).m2932copyejIjP34(m4551getUnspecified0d7_KjU, m4551getUnspecified0d7_KjU2, m4551getUnspecified0d7_KjU3, m4551getUnspecified0d7_KjU4, m4551getUnspecified0d7_KjU5, m4551getUnspecified0d7_KjU6, m4551getUnspecified0d7_KjU7, m4551getUnspecified0d7_KjU8, m4551getUnspecified0d7_KjU9, m4551getUnspecified0d7_KjU10, textSelectionColors2, m4551getUnspecified0d7_KjU11, m4551getUnspecified0d7_KjU12, m4551getUnspecified0d7_KjU13, m4551getUnspecified0d7_KjU14, m4551getUnspecified0d7_KjU15, m4551getUnspecified0d7_KjU16, m4551getUnspecified0d7_KjU17, m4551getUnspecified0d7_KjU18, m4551getUnspecified0d7_KjU19, m4551getUnspecified0d7_KjU20, m4551getUnspecified0d7_KjU21, m4551getUnspecified0d7_KjU22, m4551getUnspecified0d7_KjU23, m4551getUnspecified0d7_KjU24, m4551getUnspecified0d7_KjU25, m4551getUnspecified0d7_KjU26, m4551getUnspecified0d7_KjU27, m4551getUnspecified0d7_KjU28, m4551getUnspecified0d7_KjU29, m4551getUnspecified0d7_KjU30, m4551getUnspecified0d7_KjU31, m4551getUnspecified0d7_KjU32, m4551getUnspecified0d7_KjU33, m4551getUnspecified0d7_KjU34, m4551getUnspecified0d7_KjU35, m4551getUnspecified0d7_KjU36, m4551getUnspecified0d7_KjU37, m4551getUnspecified0d7_KjU38, m4551getUnspecified0d7_KjU39, m4551getUnspecified0d7_KjU40, m4551getUnspecified0d7_KjU41, m4551getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2932copyejIjP34;
    }

    public final TextFieldColors getDefaultTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1341970309, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        composer.startReplaceGroup(27085453);
        ComposerKt.sourceInformation(composer, "*501@26788L7");
        if (defaultTextFieldColorsCached == null) {
            long fromToken = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusInputColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputColor());
            long m4514copywmQWz5c$default = Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorInputColor());
            long fromToken4 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken5 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken6 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken7 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken8 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getCaretColor());
            long fromToken9 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            defaultTextFieldColorsCached = new TextFieldColors(fromToken, fromToken2, m4514copywmQWz5c$default, fromToken3, fromToken4, fromToken5, fromToken6, fromToken7, fromToken8, fromToken9, (TextSelectionColors) consume, ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor()), FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLabelColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLabelColor()), FilledTextFieldTokens.INSTANCE.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getSupportingColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor()), FilledTextFieldTokens.INSTANCE.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(defaultTextFieldColorsCached);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColorsCached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if ((r29 & 16) != 0) goto L181;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @kotlin.ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ContainerBox(final boolean r22, final boolean r23, final androidx.compose.foundation.interaction.InteractionSource r24, final androidx.compose.material3.TextFieldColors r25, androidx.compose.ui.graphics.Shape r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -584749279, "C613@33100L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 611926497, "C621@33346L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM */
    public final float m3002getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM */
    public final float m2998getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2992textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m3007textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithLabelPadding-a9UjIt4 */
    public final PaddingValues m3007textFieldWithLabelPaddinga9UjIt4(float start, float r2, float top, float r4) {
        return m2996contentPaddingWithLabela9UjIt4(start, r2, top, r4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2993textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m3008textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4 */
    public final PaddingValues m3008textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float r3, float r4) {
        return m2997contentPaddingWithoutLabela9UjIt4(start, top, r3, r4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m2990outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m3005outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldPadding-a9UjIt4 */
    public final PaddingValues m3005outlinedTextFieldPaddinga9UjIt4(float start, float top, float r4, float r5) {
        return OutlinedTextFieldDefaults.INSTANCE.m2665contentPaddinga9UjIt4(start, top, r4, r5);
    }

    /* renamed from: indicatorLine-gv0btCI */
    public final Modifier m3004indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m6995boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m6995boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
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
                composer.startReplaceGroup(-891038934);
                ComposerKt.sourceInformation(composer, "C169@7666L25,171@7739L263:TextFieldDefaults.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, TextFieldImplKt.m3303animateBorderStrokeAsStateNuRrP5Q(z, z2, FocusInteractionKt.collectIsFocusedAsState(InteractionSource.this, composer, 0).getValue().booleanValue(), textFieldColors, f, f2, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return drawIndicatorLine;
            }
        });
    }

    static {
        float m6997constructorimpl = Dp.m6997constructorimpl(1);
        UnfocusedIndicatorThickness = m6997constructorimpl;
        float m6997constructorimpl2 = Dp.m6997constructorimpl(2);
        FocusedIndicatorThickness = m6997constructorimpl2;
        UnfocusedBorderThickness = m6997constructorimpl;
        FocusedBorderThickness = m6997constructorimpl2;
    }
}
