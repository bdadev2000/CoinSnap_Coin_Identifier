package androidx.compose.material3.internal;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00012\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a-\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a5\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0006\u0010P\u001a\u00020Q2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a×\u0001\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020L2\u0006\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020L2\u0006\u0010Z\u001a\u00020?2\u0099\u0001\u0010M\u001a\u0094\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(`\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(c\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020.0[¢\u0006\u0002\b4H\u0083\bø\u0001\u0000¢\u0006\u0004\be\u0010f\u001aH\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\\2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010i\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0012\u0010n\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u0012\u0010q\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u001c\u0010r\u001a\u00020\b*\u00020\b2\u0006\u0010A\u001a\u00020?2\u0006\u0010s\u001a\u00020\u0001H\u0000\u001a\u001c\u0010t\u001a\u00020\b*\u00020\b2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020xH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0012\u0010\u0005\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0019\u0010\u0005\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u001d\u0010\u0005\"\u000e\u0010\u001e\u001a\u00020\u0014X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010 \u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b!\u0010\u0005\"\u000e\u0010\"\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006y²\u0006\n\u0010z\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010{\u001a\u00020?X\u008a\u0084\u0002"}, d2 = {"ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldAnimationDuration", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/internal/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", TtmlNode.RUBY_CONTAINER, "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "content", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextFieldTransitionScope", "inputState", "Landroidx/compose/material3/internal/InputPhase;", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "labelColor", "showLabel", "Lkotlin/Function5;", "Landroidx/compose/runtime/State;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "TextFieldTransitionScope-Jy8F4Js", "(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "animateBorderStrokeAsState", "Landroidx/compose/foundation/BorderStroke;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "defaultErrorMessage", "textFieldBackground", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "shape", "Landroidx/compose/ui/graphics/Shape;", "material3_release", "showPlaceholder", "showPrefixSuffix"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class TextFieldImplKt {
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final int TextFieldAnimationDuration = 150;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = Dp.m6997constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m6997constructorimpl(4);
    private static final float PrefixSuffixTextPadding = Dp.m6997constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m6997constructorimpl(24);

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x0546, code lost:
    
        if (r6 != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x04f5, code lost:
    
        if (r6 != false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b92  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommonDecorationBox(final androidx.compose.material3.internal.TextFieldType r45, final java.lang.String r46, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, final androidx.compose.ui.text.input.VisualTransformation r48, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, boolean r56, boolean r57, boolean r58, final androidx.compose.foundation.interaction.InteractionSource r59, final androidx.compose.foundation.layout.PaddingValues r60, final androidx.compose.material3.TextFieldColors r61, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 3009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.internal.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m3298Decoration3JVO9M(final long j, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1208685580);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color,2)298@12599L62:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208685580, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyleKt.m3224ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, startRestartGroup, (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
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
                    TextFieldImplKt.m3298Decoration3JVO9M(j, textStyle, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m3299DecorationIv8Zu3U(final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(660142980);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color)303@12806L84:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660142980, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(j)), function2, startRestartGroup, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
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
                    TextFieldImplKt.m3299DecorationIv8Zu3U(j, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$defaultErrorSemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                final Outline mo588createOutlinePq9zytI = Shape.this.mo588createOutlinePq9zytI(cacheDrawScope.m4164getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                final ColorProducer colorProducer2 = colorProducer;
                return cacheDrawScope.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        OutlineKt.m4773drawOutlinewDX37Ww(drawScope, Outline.this, colorProducer2.mo2041invoke0d7_KjU(), (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? Fill.INSTANCE : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? DrawScope.INSTANCE.m5073getDefaultBlendMode0nO6VwU() : 0);
                    }
                });
            }
        });
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0174, code lost:
    
        if (r29 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0130, code lost:
    
        if (r29 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0232, code lost:
    
        if (r29 != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f0  */
    /* renamed from: TextFieldTransitionScope-Jy8F4Js, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m3300TextFieldTransitionScopeJy8F4Js(androidx.compose.material3.internal.InputPhase r22, long r23, long r25, long r27, boolean r29, kotlin.jvm.functions.Function7<? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>, ? super androidx.compose.runtime.State<androidx.compose.ui.graphics.Color>, ? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.State<java.lang.Float>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.m3300TextFieldTransitionScopeJy8F4Js(androidx.compose.material3.internal.InputPhase, long, long, long, boolean, kotlin.jvm.functions.Function7, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m3303animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, boolean z3, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        State<Color> rememberUpdatedState;
        State<Dp> rememberUpdatedState2;
        ComposerKt.sourceInformationMarkerStart(composer, 2047013045, "C(animateBorderStrokeAsState)P(1,4,2!1,3:c#ui.unit.Dp,5:c#ui.unit.Dp)458@18252L73:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long m2976indicatorColorXeAY9LY$material3_release = textFieldColors.m2976indicatorColorXeAY9LY$material3_release(z, z2, z3);
        if (z) {
            composer.startReplaceGroup(1023053998);
            ComposerKt.sourceInformation(composer, "445@17754L84");
            rememberUpdatedState = SingleValueAnimationKt.m418animateColorAsStateeuL9pac(m2976indicatorColorXeAY9LY$material3_release, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1023165505);
            ComposerKt.sourceInformation(composer, "447@17868L33");
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4505boximpl(m2976indicatorColorXeAY9LY$material3_release), composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> state = rememberUpdatedState;
        if (z) {
            composer.startReplaceGroup(1023269417);
            ComposerKt.sourceInformation(composer, "453@18068L85");
            rememberUpdatedState2 = AnimateAsStateKt.m432animateDpAsStateAjpBEmI(z3 ? f : f2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1023478388);
            ComposerKt.sourceInformation(composer, "455@18183L46");
            rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Dp.m6995boximpl(f2), composer, (i >> 15) & 14);
            composer.endReplaceGroup();
        }
        State<BorderStroke> rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m567BorderStrokecXLIe8U(rememberUpdatedState2.getValue().m7011unboximpl(), state.getValue().m4525unboximpl()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rememberUpdatedState3;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 16;
        TextFieldPadding = Dp.m6997constructorimpl(f);
        MinFocusedLabelLineHeight = Dp.m6997constructorimpl(f);
        MinSupportingTextLineHeight = Dp.m6997constructorimpl(f);
        float f2 = 48;
        IconDefaultSizeModifier = SizeKt.m1014defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), Dp.m6997constructorimpl(f2));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
