package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.base.utils.StatusBarUtils;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010.\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010/\u001aÁ\u0001\u00100\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\t0\r2\u0011\u00108\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\u0010;\u001aZ\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aZ\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010F\u001a&\u0010N\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010O\u001a\u0002072\u0006\u00109\u001a\u00020:H\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a|\u0010R\u001a\u00020\t*\u00020S2\u0006\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020$2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Y\u001a\u00020W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010\\\u001a\u00020W2\u0006\u00104\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010D\u001a\u0002052\u0006\u0010]\u001a\u00020^2\u0006\u00109\u001a\u00020:H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-O3s9Psw", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m6997constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m6997constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(final java.lang.String r101, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r102, androidx.compose.ui.Modifier r103, boolean r104, boolean r105, androidx.compose.ui.text.TextStyle r106, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r107, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r108, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r109, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r110, boolean r111, androidx.compose.ui.text.input.VisualTransformation r112, androidx.compose.foundation.text.KeyboardOptions r113, androidx.compose.foundation.text.KeyboardActions r114, boolean r115, int r116, int r117, androidx.compose.foundation.interaction.MutableInteractionSource r118, androidx.compose.ui.graphics.Shape r119, androidx.compose.material.TextFieldColors r120, androidx.compose.runtime.Composer r121, final int r122, final int r123, final int r124) {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(final java.lang.String r72, final kotlin.jvm.functions.Function1 r73, androidx.compose.ui.Modifier r74, boolean r75, boolean r76, androidx.compose.ui.text.TextStyle r77, kotlin.jvm.functions.Function2 r78, kotlin.jvm.functions.Function2 r79, kotlin.jvm.functions.Function2 r80, kotlin.jvm.functions.Function2 r81, boolean r82, androidx.compose.ui.text.input.VisualTransformation r83, androidx.compose.foundation.text.KeyboardOptions r84, androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material.TextFieldColors r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b6, code lost:
    
        if (r0.changed(r114) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x064f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue r101, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r102, androidx.compose.ui.Modifier r103, boolean r104, boolean r105, androidx.compose.ui.text.TextStyle r106, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r107, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r108, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r109, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r110, boolean r111, androidx.compose.ui.text.input.VisualTransformation r112, androidx.compose.foundation.text.KeyboardOptions r113, androidx.compose.foundation.text.KeyboardActions r114, boolean r115, int r116, int r117, androidx.compose.foundation.interaction.MutableInteractionSource r118, androidx.compose.ui.graphics.Shape r119, androidx.compose.material.TextFieldColors r120, androidx.compose.runtime.Composer r121, final int r122, final int r123, final int r124) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b2, code lost:
    
        if (r0.changed(r85) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029b  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue r72, final kotlin.jvm.functions.Function1 r73, androidx.compose.ui.Modifier r74, boolean r75, boolean r76, androidx.compose.ui.text.TextStyle r77, kotlin.jvm.functions.Function2 r78, kotlin.jvm.functions.Function2 r79, kotlin.jvm.functions.Function2 r80, kotlin.jvm.functions.Function2 r81, boolean r82, androidx.compose.ui.text.input.VisualTransformation r83, androidx.compose.foundation.text.KeyboardOptions r84, androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material.TextFieldColors r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, final Function1<? super Size, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function25, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldLayout)P(4,9,7,2,3,10,8!1,5)493@22963L239,501@23250L7,502@23262L2308:OutlinedTextField.kt#jmzs0o");
        int i4 = (i & 14) == 0 ? i | (startRestartGroup.changed(modifier) ? 4 : 2) : i;
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function25) ? 536870912 : 268435456;
        }
        int i5 = i4;
        int i6 = (i2 & 14) == 0 ? i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2) : i2;
        if ((i5 & 1533916891) != 306783378 || (i6 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i5, i6, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:492)");
            }
            Object[] objArr = {function1, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            int i7 = 0;
            boolean z2 = false;
            for (int i8 = 4; i7 < i8; i8 = 4) {
                z2 |= startRestartGroup.changed(objArr[i7]);
                i7++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, outlinedTextFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1169918312, "C510@23766L8,549@25214L182:OutlinedTextField.kt#jmzs0o");
            function25.invoke(startRestartGroup, Integer.valueOf((i5 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169918334);
            ComposerKt.sourceInformation(startRestartGroup, "513@23827L219");
            if (function23 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
                Updater.m4015setimpl(m4008constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905297530, "C517@24019L9:OutlinedTextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, Integer.valueOf((i5 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169918619);
            ComposerKt.sourceInformation(startRestartGroup, "521@24113L221");
            if (function24 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4008constructorimpl3 = Updater.m4008constructorimpl(startRestartGroup);
                Updater.m4015setimpl(m4008constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905297243, "C525@24306L10:OutlinedTextField.kt#jmzs0o");
                function24.invoke(startRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (function23 != null) {
                i3 = 0;
                calculateStartPadding = Dp.m6997constructorimpl(RangesKt.coerceAtLeast(Dp.m6997constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6997constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (function24 != null) {
                calculateEndPadding = Dp.m6997constructorimpl(RangesKt.coerceAtLeast(Dp.m6997constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6997constructorimpl(i3)));
            }
            Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(companion, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1169919630);
            ComposerKt.sourceInformation(startRestartGroup, "546@25127L59");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, "Hint").then(m989paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i5 >> 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(Modifier.INSTANCE, "TextField").then(m989paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl4 = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905296178, "C553@25371L11:OutlinedTextField.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-614207693);
            ComposerKt.sourceInformation(startRestartGroup, "557@25447L54");
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4008constructorimpl5 = Updater.m4008constructorimpl(startRestartGroup);
                Updater.m4015setimpl(m4008constructorimpl5, rememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl5.getInserting() || !Intrinsics.areEqual(m4008constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4008constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4008constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -905296057, "C557@25492L7:OutlinedTextField.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
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

                public final void invoke(Composer composer2, int i9) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(Modifier.this, function2, function3, function22, function23, function24, z, f, function1, function25, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1919calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        return Math.max(i + Math.max(i3, Math.max(MathHelpersKt.lerp(i4, 0, f), i5)) + i2, Math.max(MathKt.roundToInt((i4 + (Dp.m6997constructorimpl(paddingValues.mo936calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + paddingValues.mo937calculateRightPaddingu2uoSUM(LayoutDirection.Ltr)) * f2)) * f), Constraints.m6952getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1918calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int max = Math.max(i3, Math.max(i5, MathHelpersKt.lerp(i4, 0, f)));
        float top = paddingValues.getTop() * f2;
        return Math.max(Constraints.m6951getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt.roundToInt(MathHelpersKt.lerp(top, Math.max(top, i4 / 2.0f), f) + max + (paddingValues.getBottom() * f2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        int roundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f)) + roundToInt2, MathHelpersKt.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : roundToInt, -(placeable4.getHeight() / 2), f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m5915place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m7135getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1920outlineCutout12SF9DM(Modifier modifier, final long j, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                float f;
                float coerceAtLeast;
                float m4343getWidthimpl = Size.m4343getWidthimpl(j);
                if (m4343getWidthimpl > 0.0f) {
                    f = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
                    float f2 = contentDrawScope.mo677toPx0680j_4(f);
                    float f3 = contentDrawScope.mo677toPx0680j_4(paddingValues.mo936calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - f2;
                    float f4 = 2;
                    float f5 = m4343getWidthimpl + f3 + (f2 * f4);
                    if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        coerceAtLeast = Size.m4343getWidthimpl(contentDrawScope.mo5071getSizeNHjbRc()) - f5;
                    } else {
                        coerceAtLeast = RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    float f6 = coerceAtLeast;
                    if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        f5 = Size.m4343getWidthimpl(contentDrawScope.mo5071getSizeNHjbRc()) - RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    float f7 = f5;
                    float m4340getHeightimpl = Size.m4340getHeightimpl(j);
                    float f8 = (-m4340getHeightimpl) / f4;
                    float f9 = m4340getHeightimpl / f4;
                    int m4503getDifferencertfAjoo = ClipOp.INSTANCE.m4503getDifferencertfAjoo();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long mo4992getSizeNHjbRc = drawContext.mo4992getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo4995clipRectN_I0leg(f6, f8, f7, f9, m4503getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                    drawContext.getCanvas().restore();
                    drawContext.mo4993setSizeuvyYCjk(mo4992getSizeNHjbRc);
                    return;
                }
                contentDrawScope.drawContent();
            }
        });
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
