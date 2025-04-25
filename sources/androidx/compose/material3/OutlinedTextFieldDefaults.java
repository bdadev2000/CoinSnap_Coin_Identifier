package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u009c\u0002\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00180,¢\u0006\u0002\b-2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u00180,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010;J\r\u0010 \u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010<JÂ\u0003\u0010 \u001a\u00020\u00132\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020>2\b\b\u0002\u0010B\u001a\u00020>2\b\b\u0002\u0010C\u001a\u00020>2\b\b\u0002\u0010D\u001a\u00020>2\b\b\u0002\u0010E\u001a\u00020>2\b\b\u0002\u0010F\u001a\u00020>2\b\b\u0002\u0010G\u001a\u00020>2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\b\b\u0002\u0010J\u001a\u00020>2\b\b\u0002\u0010K\u001a\u00020>2\b\b\u0002\u0010L\u001a\u00020>2\b\b\u0002\u0010M\u001a\u00020>2\b\b\u0002\u0010N\u001a\u00020>2\b\b\u0002\u0010O\u001a\u00020>2\b\b\u0002\u0010P\u001a\u00020>2\b\b\u0002\u0010Q\u001a\u00020>2\b\b\u0002\u0010R\u001a\u00020>2\b\b\u0002\u0010S\u001a\u00020>2\b\b\u0002\u0010T\u001a\u00020>2\b\b\u0002\u0010U\u001a\u00020>2\b\b\u0002\u0010V\u001a\u00020>2\b\b\u0002\u0010W\u001a\u00020>2\b\b\u0002\u0010X\u001a\u00020>2\b\b\u0002\u0010Y\u001a\u00020>2\b\b\u0002\u0010Z\u001a\u00020>2\b\b\u0002\u0010[\u001a\u00020>2\b\b\u0002\u0010\\\u001a\u00020>2\b\b\u0002\u0010]\u001a\u00020>2\b\b\u0002\u0010^\u001a\u00020>2\b\b\u0002\u0010_\u001a\u00020>2\b\b\u0002\u0010`\u001a\u00020>2\b\b\u0002\u0010a\u001a\u00020>2\b\b\u0002\u0010b\u001a\u00020>2\b\b\u0002\u0010c\u001a\u00020>2\b\b\u0002\u0010d\u001a\u00020>2\b\b\u0002\u0010e\u001a\u00020>2\b\b\u0002\u0010f\u001a\u00020>2\b\b\u0002\u0010g\u001a\u00020>2\b\b\u0002\u0010h\u001a\u00020>2\b\b\u0002\u0010i\u001a\u00020>H\u0007ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ8\u00108\u001a\u0002092\b\b\u0002\u0010l\u001a\u00020\u00042\b\b\u0002\u0010m\u001a\u00020\u00042\b\b\u0002\u0010n\u001a\u00020\u00042\b\b\u0002\u0010o\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bp\u0010qR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultOutlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", TextFieldImplKt.ContainerId, "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "focusedBorderThickness", "unfocusedBorderThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.RUBY_CONTAINER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "start", "top", TtmlNode.END, LogEvents.bottom, "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m6997constructorimpl(56);
    private static final float MinWidth = Dp.m6997constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m6997constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m6997constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1066756961, "C729@37132L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2667getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2668getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2669getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2666getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0162  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2662Container4EFweAY(final boolean r25, final boolean r26, final androidx.compose.foundation.interaction.InteractionSource r27, androidx.compose.ui.Modifier r28, androidx.compose.material3.TextFieldColors r29, androidx.compose.ui.graphics.Shape r30, float r31, float r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m2662Container4EFweAY(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void DecorationBox(final java.lang.String r41, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, final boolean r43, final boolean r44, final androidx.compose.ui.text.input.VisualTransformation r45, final androidx.compose.foundation.interaction.InteractionSource r46, boolean r47, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, androidx.compose.material3.TextFieldColors r55, androidx.compose.foundation.layout.PaddingValues r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2661contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return outlinedTextFieldDefaults.m2665contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2665contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m981PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -471651810, "C(colors)921@46417L11,921@46429L30:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2664colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ComposerKt.sourceInformationMarkerStart(composer, 1767617725, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,0:c#ui.graphics.Color,13:c#ui.graphics.Color,32,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)1023@53240L11,1023@53252L30:TextFieldDefaults.kt#uh7d8r");
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
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
        }
        TextFieldColors m2932copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA).m2932copyejIjP34(m4551getUnspecified0d7_KjU, m4551getUnspecified0d7_KjU2, m4551getUnspecified0d7_KjU3, m4551getUnspecified0d7_KjU4, m4551getUnspecified0d7_KjU5, m4551getUnspecified0d7_KjU6, m4551getUnspecified0d7_KjU7, m4551getUnspecified0d7_KjU8, m4551getUnspecified0d7_KjU9, m4551getUnspecified0d7_KjU10, textSelectionColors2, m4551getUnspecified0d7_KjU11, m4551getUnspecified0d7_KjU12, m4551getUnspecified0d7_KjU13, m4551getUnspecified0d7_KjU14, m4551getUnspecified0d7_KjU15, m4551getUnspecified0d7_KjU16, m4551getUnspecified0d7_KjU17, m4551getUnspecified0d7_KjU18, m4551getUnspecified0d7_KjU19, m4551getUnspecified0d7_KjU20, m4551getUnspecified0d7_KjU21, m4551getUnspecified0d7_KjU22, m4551getUnspecified0d7_KjU23, m4551getUnspecified0d7_KjU24, m4551getUnspecified0d7_KjU25, m4551getUnspecified0d7_KjU26, m4551getUnspecified0d7_KjU27, m4551getUnspecified0d7_KjU28, m4551getUnspecified0d7_KjU29, m4551getUnspecified0d7_KjU30, m4551getUnspecified0d7_KjU31, m4551getUnspecified0d7_KjU32, m4551getUnspecified0d7_KjU33, m4551getUnspecified0d7_KjU34, m4551getUnspecified0d7_KjU35, m4551getUnspecified0d7_KjU36, m4551getUnspecified0d7_KjU37, m4551getUnspecified0d7_KjU38, m4551getUnspecified0d7_KjU39, m4551getUnspecified0d7_KjU40, m4551getUnspecified0d7_KjU41, m4551getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2932copyejIjP34;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -292363577, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        composer.startReplaceGroup(1540400102);
        ComposerKt.sourceInformation(composer, "*1086@57012L7");
        if (defaultOutlinedTextFieldColorsCached == null) {
            long fromToken = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputColor());
            long m4514copywmQWz5c$default = Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor());
            long m4550getTransparent0d7_KjU = Color.INSTANCE.m4550getTransparent0d7_KjU();
            long m4550getTransparent0d7_KjU2 = Color.INSTANCE.m4550getTransparent0d7_KjU();
            long m4550getTransparent0d7_KjU3 = Color.INSTANCE.m4550getTransparent0d7_KjU();
            long m4550getTransparent0d7_KjU4 = Color.INSTANCE.m4550getTransparent0d7_KjU();
            long fromToken4 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getCaretColor());
            long fromToken5 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            defaultOutlinedTextFieldColorsCached = new TextFieldColors(fromToken, fromToken2, m4514copywmQWz5c$default, fromToken3, m4550getTransparent0d7_KjU, m4550getTransparent0d7_KjU2, m4550getTransparent0d7_KjU3, m4550getTransparent0d7_KjU4, fromToken4, fromToken5, (TextSelectionColors) consume, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(defaultOutlinedTextFieldColorsCached);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedTextFieldColorsCached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0131, code lost:
    
        if ((r32 & 64) != 0) goto L122;
     */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to OutlinedTextFieldDefaults.Container", replaceWith = @kotlin.ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n    focusedBorderThickness = focusedBorderThickness,\n    unfocusedBorderThickness = unfocusedBorderThickness,\n)", imports = {}))
    /* renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2663ContainerBoxnbWgWpA(final boolean r23, final boolean r24, final androidx.compose.foundation.interaction.InteractionSource r25, androidx.compose.material3.TextFieldColors r26, androidx.compose.ui.graphics.Shape r27, float r28, float r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m2663ContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
