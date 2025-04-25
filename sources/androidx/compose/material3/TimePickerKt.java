package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00012\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020#0(¢\u0006\u0002\b)H\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001d\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a%\u00101\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\u00104\u001a-\u00105\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u00192\u0006\u00102\u001a\u000203H\u0003¢\u0006\u0002\u00107\u001a\u0015\u00108\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u00109\u001a\u001d\u0010:\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a%\u0010;\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u0010<\u001a1\u0010=\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\u0010>\u001a=\u0010?\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020CH\u0003¢\u0006\u0002\u0010E\u001a)\u0010F\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u0010G\u001a%\u0010H\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010I\u001a8\u0010J\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010K\u001a\u00020LH\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a \u0010O\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u000203H\u0007\u001ab\u0010S\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u00106\u001a\u00020T2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020#0V2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020X2\b\b\u0002\u0010Y\u001a\u00020Z2\b\b\u0002\u0010[\u001a\u00020\\2\u0006\u0010.\u001a\u00020/H\u0003ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a:\u0010_\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u00106\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020X2\u0006\u0010.\u001a\u00020/H\u0003ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001aQ\u0010b\u001a\u00020#2\u0006\u0010c\u001a\u0002032\u0006\u0010d\u001a\u00020C2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020#0(2\u0006\u0010.\u001a\u00020/2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020#0V¢\u0006\u0002\b)¢\u0006\u0002\bgH\u0003¢\u0006\u0002\u0010h\u001a\u001d\u0010i\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a%\u0010j\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u0010<\u001a1\u0010k\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\u0010>\u001a\u0018\u0010l\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0006\u0010n\u001a\u00020\bH\u0002\u001a(\u0010o\u001a\u00020\b2\u0006\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020\b2\u0006\u0010r\u001a\u00020\u00192\u0006\u0010s\u001a\u00020\u0019H\u0002\u001a*\u0010t\u001a\u00020u2\u0006\u0010W\u001a\u00020X2\u0006\u0010R\u001a\u0002032\u0006\u0010v\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010x\u001a+\u0010y\u001a\u00020\u001a2\b\b\u0002\u0010P\u001a\u00020\u00192\b\b\u0002\u0010Q\u001a\u00020\u00192\b\b\u0002\u0010R\u001a\u000203H\u0007¢\u0006\u0002\u0010z\u001a`\u0010{\u001a\u00020#2\u0006\u0010W\u001a\u00020X2\u0006\u0010-\u001a\u00020\u001a2\u0006\u00106\u001a\u00020T2\u0006\u0010|\u001a\u00020T2\u0006\u0010}\u001a\u00020\u00192\"\u0010~\u001a\u001e\u0012\u0014\u0012\u00120T¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020#0VH\u0002ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u001d\u0010\u0083\u0001\u001a\u00020%*\u00020%2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0002\u001a<\u0010\u0084\u0001\u001a\u00020#*\u00020\u001a2\u0006\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\b2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001aE\u0010\u008a\u0001\u001a\u00020#*\u00020\u001f2\u0006\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\b2\u0006\u00102\u001a\u0002032\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0016\u0010\u008d\u0001\u001a\u00020%*\u00020%2\u0007\u0010\u008d\u0001\u001a\u000203H\u0003\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0018\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0018\u0010\u001d\u001a\u00020\u001e*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u008e\u0001²\u0006\u000b\u0010\u008f\u0001\u001a\u000203X\u008a\u0084\u0002²\u0006\u000b\u0010\u0090\u0001\u001a\u00020TX\u008a\u008e\u0002²\u0006\u000b\u0010\u0091\u0001\u001a\u00020TX\u008a\u008e\u0002²\u0006\f\u0010\u0086\u0001\u001a\u00030\u0092\u0001X\u008a\u008e\u0002²\u0006\f\u0010\u0093\u0001\u001a\u00030\u0087\u0001X\u008a\u008e\u0002"}, d2 = {"ClockDisplayBottomMargin", "Landroidx/compose/ui/unit/Dp;", "F", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "ExtraHours", "Landroidx/collection/IntList;", "FullCircle", "", "HalfCircle", "Hours", "InnerCircleRadius", "MaxDistance", "MinimumInteractiveSize", "Minutes", "OuterCircleSizeRadius", "PeriodToggleMargin", "QuarterCircle", "", "RadiansPerHour", "RadiansPerMinute", "SeparatorZIndex", "SupportLabelTop", "TimeInputBottomPadding", "hourForDisplay", "", "Landroidx/compose/material3/TimePickerState;", "getHourForDisplay", "(Landroidx/compose/material3/TimePickerState;)I", "selectorPos", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/material3/AnalogTimePickerState;", "getSelectorPos", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "CircularLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "radius", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ClockDisplayNumbers", "state", "colors", "Landroidx/compose/material3/TimePickerColors;", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ClockFace", "autoSwitchToMinute", "", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "ClockText", "value", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "HorizontalTimePicker", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "PeriodToggleImpl", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startShape", "Landroidx/compose/ui/graphics/Shape;", "endShape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "TimePicker", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePickerState", "initialHour", "initialMinute", "is24Hour", "TimePickerTextField", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "selection", "Landroidx/compose/material3/TimePickerSelectionMode;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "TimePickerTextField-1vLObsk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeSelector", "TimeSelector-SAnMeKU", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ToggleItem", "checked", "shape", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "VerticalPeriodToggle", "VerticalTimePicker", "atan", "y", "x", "dist", "x1", "y1", "x2", "y2", "numberContentDescription", "", LogEventArguments.ARG_NUMBER, "numberContentDescription-dSwYdS4", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "timeInputOnChange", "prevValue", "max", "onNewValue", "Lkotlin/ParameterName;", "name", "timeInputOnChange-z7XvuPQ", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "drawSelector", "moveSelector", "maxDist", TtmlNode.CENTER, "Landroidx/compose/ui/unit/IntOffset;", "moveSelector-d3b8Pxo", "(Landroidx/compose/material3/TimePickerState;FFFJ)V", "onTap", "onTap-rOwcSBo", "(Landroidx/compose/material3/AnalogTimePickerState;FFFZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visible", "material3_release", "a11yServicesEnabled", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "parentCenter"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final IntList ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final IntList Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = Dp.m6997constructorimpl(101);
    private static final float InnerCircleRadius = Dp.m6997constructorimpl(69);
    private static final float ClockDisplayBottomMargin = Dp.m6997constructorimpl(36);
    private static final float SupportLabelTop = Dp.m6997constructorimpl(7);
    private static final float MaxDistance = Dp.m6997constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m6997constructorimpl(48);
    private static final IntList Minutes = IntListKt.intListOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if ((r14 & 8) != 0) goto L70;
     */
    /* renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m3041TimePickermT9BvqQ(final androidx.compose.material3.TimePickerState r8, androidx.compose.ui.Modifier r9, androidx.compose.material3.TimePickerColors r10, int r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m3041TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if ((r12 & 4) != 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TimeInput(final androidx.compose.material3.TimePickerState r7, androidx.compose.ui.Modifier r8, androidx.compose.material3.TimePickerColors r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TimePickerState rememberTimePickerState(int i, int i2, boolean z, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1237715277, "C(rememberTimePickerState)572@28878L14,575@29014L185,575@28960L239:TimePicker.kt#uh7d8r");
        final int i5 = (i4 & 1) != 0 ? 0 : i;
        final int i6 = (i4 & 2) != 0 ? 0 : i2;
        final boolean is24HourFormat = (i4 & 4) != 0 ? TimeFormat_androidKt.is24HourFormat(composer, 0) : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i3, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.INSTANCE.Saver();
        ComposerKt.sourceInformationMarkerStart(composer, -1964549601, "CC(remember):TimePicker.kt#9igjgp");
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && composer.changed(i5)) || (i3 & 6) == 4) | ((((i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(i6)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(is24HourFormat)) || (i3 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<TimePickerStateImpl>() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$state$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TimePickerStateImpl invoke() {
                    return new TimePickerStateImpl(i5, i6, is24HourFormat);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m4101rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return timePickerStateImpl;
    }

    public static final TimePickerState TimePickerState(int i, int i2, boolean z) {
        return new TimePickerStateImpl(i, i2, z);
    }

    public static final int getHourForDisplay(TimePickerState timePickerState) {
        if (timePickerState.getIs24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return timePickerState.isAfternoon() ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    public static final void m3050moveSelectord3b8Pxo(TimePickerState timePickerState, float f, float f2, float f3, long j) {
        if (TimePickerSelectionMode.m3068equalsimpl0(timePickerState.mo2080getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI()) && timePickerState.getIs24hour()) {
            timePickerState.setAfternoon(dist(f, f2, IntOffset.m7125getXimpl(j), IntOffset.m7126getYimpl(j)) < f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: onTap-rOwcSBo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m3052onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState r14, float r15, float r16, float r17, boolean r18, long r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m3052onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final long getSelectorPos(AnalogTimePickerState analogTimePickerState) {
        float f;
        float f2 = 2;
        float m6997constructorimpl = Dp.m6997constructorimpl(TimePickerTokens.INSTANCE.m3862getClockDialSelectorHandleContainerSizeD9Ej5fM() / f2);
        if (analogTimePickerState.getIs24hour() && analogTimePickerState.isAfternoon() && TimePickerSelectionMode.m3068equalsimpl0(analogTimePickerState.mo2080getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI())) {
            f = InnerCircleRadius;
        } else {
            f = OuterCircleSizeRadius;
        }
        float m6997constructorimpl2 = Dp.m6997constructorimpl(Dp.m6997constructorimpl(f - m6997constructorimpl) + m6997constructorimpl);
        return DpKt.m7018DpOffsetYgX7TsA(Dp.m6997constructorimpl(Dp.m6997constructorimpl(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * m6997constructorimpl2) + Dp.m6997constructorimpl(TimePickerTokens.INSTANCE.m3860getClockDialContainerSizeD9Ej5fM() / f2)), Dp.m6997constructorimpl(Dp.m6997constructorimpl(m6997constructorimpl2 * ((float) Math.sin(analogTimePickerState.getCurrentAngle()))) + Dp.m6997constructorimpl(TimePickerTokens.INSTANCE.m3860getClockDialContainerSizeD9Ej5fM() / f2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if ((r15 & 4) != 0) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VerticalTimePicker(final androidx.compose.material3.AnalogTimePickerState r9, androidx.compose.ui.Modifier r10, androidx.compose.material3.TimePickerColors r11, final boolean r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void HorizontalTimePicker(final androidx.compose.material3.AnalogTimePickerState r18, androidx.compose.ui.Modifier r19, androidx.compose.material3.TimePickerColors r20, final boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeInputImpl(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i) {
        int i2;
        Composer composer2;
        TextStyle m6486copyp1EtxEg;
        Composer startRestartGroup = composer.startRestartGroup(-475657989);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeInputImpl)P(1)965@41356L112,965@41304L164,969@41552L104,969@41500L156,972@41661L4502:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
            }
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.INSTANCE.getSaver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 339122986, "CC(remember):TimePicker.kt#9igjgp");
            int i4 = i3 & 896;
            boolean z = i4 == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        MutableState<TextFieldValue> mutableStateOf$default;
                        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(TimePickerKt.getHourForDisplay(TimePickerState.this), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, startRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = TextFieldValue.INSTANCE.getSaver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 339129250, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = i4 == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        MutableState<TextFieldValue> mutableStateOf$default;
                        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(TimePickerState.this.getMinute(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 4);
            composer2 = startRestartGroup;
            Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Vertical top = Alignment.INSTANCE.getTop();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m989paddingqDBjuR0$default);
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
            Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -1328966913, "C977@41861L5,986@42225L3553,982@42004L3774:TimePicker.kt#uh7d8r");
            m6486copyp1EtxEg = r18.m6486copyp1EtxEg((r48 & 1) != 0 ? r18.spanStyle.m6410getColor0d7_KjU() : timePickerColors.m3037timeSelectorContentColorvNxB06k$material3_release(true), (r48 & 2) != 0 ? r18.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r18.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r18.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r18.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r18.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r18.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r18.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r18.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r18.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r18.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r18.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r18.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r18.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r18.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r18.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6864getCentere0LSkKk(), (r48 & 65536) != 0 ? r18.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r18.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r18.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r18.platformStyle : null, (r48 & 1048576) != 0 ? r18.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r18.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r18.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(m6486copyp1EtxEg), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TextFieldValue TimeInputImpl$lambda$6;
                    float f;
                    TextFieldValue TimeInputImpl$lambda$9;
                    ComposerKt.sourceInformation(composer3, "C987@42239L3529:TimePicker.kt#uh7d8r");
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1306700887, i5, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:987)");
                        }
                        final MutableState<TextFieldValue> mutableState = rememberSaveable;
                        final TimePickerState timePickerState2 = timePickerState;
                        TimePickerColors timePickerColors2 = timePickerColors;
                        final MutableState<TextFieldValue> mutableState2 = rememberSaveable2;
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer3);
                        Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -227350393, "C990@42357L529,1004@42963L451,1024@43854L52,988@42261L1727,1028@44005L123,1033@44248L422,1045@44749L429,1065@45620L52,1031@44145L1609:TimePicker.kt#uh7d8r");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -284428440, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed = composer3.changed(mutableState) | composer3.changedInstance(timePickerState2);
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m3054invokeZmokQxo(keyEvent.m5569unboximpl());
                                }

                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m3054invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                    TextFieldValue TimeInputImpl$lambda$62;
                                    TextFieldValue TimeInputImpl$lambda$63;
                                    int m5582getUtf16CodePointZmokQxo = KeyEvent_androidKt.m5582getUtf16CodePointZmokQxo(keyEvent);
                                    if (48 <= m5582getUtf16CodePointZmokQxo && m5582getUtf16CodePointZmokQxo < 58) {
                                        TimeInputImpl$lambda$62 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                                        if (TextRange.m6460getStartimpl(TimeInputImpl$lambda$62.getSelection()) == 2) {
                                            TimeInputImpl$lambda$63 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                                            if (TimeInputImpl$lambda$63.getText().length() == 2) {
                                                TimePickerState.this.mo2081setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI());
                                            }
                                        }
                                    }
                                    return false;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (Function1) rememberedValue3);
                        TimeInputImpl$lambda$6 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                        ComposerKt.sourceInformationMarkerStart(composer3, -284409126, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changedInstance = composer3.changedInstance(timePickerState2) | composer3.changed(mutableState);
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldValue textFieldValue) {
                                    TextFieldValue TimeInputImpl$lambda$62;
                                    int m3072getHouryecRtBI = TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI();
                                    TimePickerState timePickerState3 = TimePickerState.this;
                                    TimeInputImpl$lambda$62 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                                    int i6 = TimePickerState.this.getIs24hour() ? 23 : 12;
                                    final MutableState<TextFieldValue> mutableState3 = mutableState;
                                    TimePickerKt.m3053timeInputOnChangez7XvuPQ(m3072getHouryecRtBI, timePickerState3, textFieldValue, TimeInputImpl$lambda$62, i6, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                            invoke2(textFieldValue2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextFieldValue textFieldValue2) {
                                            mutableState3.setValue(textFieldValue2);
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        Function1 function1 = (Function1) rememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        int m3072getHouryecRtBI = TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI();
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6695getNumberPjHm6EE(), ImeAction.INSTANCE.m6641getNexteUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                        ComposerKt.sourceInformationMarkerStart(composer3, -284381013, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changedInstance2 = composer3.changedInstance(timePickerState2);
                        Object rememberedValue5 = composer3.rememberedValue();
                        if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$3$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                    invoke2(keyboardActionScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                    TimePickerState.this.mo2081setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI());
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        TimePickerKt.m3042TimePickerTextField1vLObsk(onKeyEvent, TimeInputImpl$lambda$6, function1, timePickerState2, m3072getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (Function1) rememberedValue5, null, null, null, 59, null), timePickerColors2, composer3, 24576, 0);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        f = TimePickerKt.DisplaySeparatorWidth;
                        TimePickerKt.DisplaySeparator(SizeKt.m1032sizeVpY3zN4(companion3, f, TimeInputTokens.INSTANCE.m3854getPeriodSelectorContainerHeightD9Ej5fM()), composer3, 6);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -284368035, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed2 = composer3.changed(mutableState2) | composer3.changedInstance(timePickerState2);
                        Object rememberedValue6 = composer3.rememberedValue();
                        if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$4$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m3055invokeZmokQxo(keyEvent.m5569unboximpl());
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Boolean m3055invokeZmokQxo(android.view.KeyEvent r3) {
                                    /*
                                        r2 = this;
                                        int r3 = androidx.compose.ui.input.key.KeyEvent_androidKt.m5582getUtf16CodePointZmokQxo(r3)
                                        if (r3 != 0) goto L18
                                        androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r3 = r2
                                        androidx.compose.ui.text.input.TextFieldValue r3 = androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$9(r3)
                                        long r0 = r3.getSelection()
                                        int r3 = androidx.compose.ui.text.TextRange.m6460getStartimpl(r0)
                                        if (r3 != 0) goto L18
                                        r3 = 1
                                        goto L19
                                    L18:
                                        r3 = 0
                                    L19:
                                        if (r3 == 0) goto L26
                                        androidx.compose.material3.TimePickerState r0 = androidx.compose.material3.TimePickerState.this
                                        androidx.compose.material3.TimePickerSelectionMode$Companion r1 = androidx.compose.material3.TimePickerSelectionMode.INSTANCE
                                        int r1 = r1.m3072getHouryecRtBI()
                                        r0.mo2081setSelection6_8s6DQ(r1)
                                    L26:
                                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                                        return r3
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$4$1.m3055invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue6);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion4, (Function1) rememberedValue6);
                        TimeInputImpl$lambda$9 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                        ComposerKt.sourceInformationMarkerStart(composer3, -284351996, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changedInstance3 = composer3.changedInstance(timePickerState2) | composer3.changed(mutableState2);
                        Object rememberedValue7 = composer3.rememberedValue();
                        if (changedInstance3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldValue textFieldValue) {
                                    TextFieldValue TimeInputImpl$lambda$92;
                                    int m3073getMinuteyecRtBI = TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI();
                                    TimePickerState timePickerState3 = TimePickerState.this;
                                    TimeInputImpl$lambda$92 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                                    final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                    TimePickerKt.m3053timeInputOnChangez7XvuPQ(m3073getMinuteyecRtBI, timePickerState3, textFieldValue, TimeInputImpl$lambda$92, 59, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                            invoke2(textFieldValue2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextFieldValue textFieldValue2) {
                                            mutableState3.setValue(textFieldValue2);
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue7);
                        }
                        Function1 function12 = (Function1) rememberedValue7;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        int m3073getMinuteyecRtBI = TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI();
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6695getNumberPjHm6EE(), ImeAction.INSTANCE.m6639getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                        ComposerKt.sourceInformationMarkerStart(composer3, -284324501, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changedInstance4 = composer3.changedInstance(timePickerState2);
                        Object rememberedValue8 = composer3.rememberedValue();
                        if (changedInstance4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$6$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                    invoke2(keyboardActionScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                    TimePickerState.this.mo2081setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI());
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue8);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        TimePickerKt.m3042TimePickerTextField1vLObsk(onPreviewKeyEvent, TimeInputImpl$lambda$9, function12, timePickerState2, m3073getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (Function1) rememberedValue8, null, null, null, 59, null), timePickerColors2, composer3, 24576, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
            composer2.startReplaceGroup(511443242);
            ComposerKt.sourceInformation(composer2, "1073@45823L324");
            if (!timePickerState.getIs24hour()) {
                Modifier m989paddingqDBjuR0$default2 = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m989paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer2);
                Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -415465671, "C1074@45891L242:TimePicker.kt#uh7d8r");
                VerticalPeriodToggle(SizeKt.m1032sizeVpY3zN4(Modifier.INSTANCE, TimeInputTokens.INSTANCE.m3855getPeriodSelectorContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m3854getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composer2, 6 | ((i3 >> 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ((i3 << 3) & 896));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TimePickerKt.TimeInputImpl(Modifier.this, timePickerColors, timePickerState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$6(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$9(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalClockDisplay)P(1)1087@46270L590:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1556019140, "C1088@46329L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
            startRestartGroup.startReplaceGroup(919638492);
            ComposerKt.sourceInformation(startRestartGroup, "1090@46407L437");
            if (!timePickerState.getIs24hour()) {
                Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -743649264, "C1091@46484L346:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                HorizontalPeriodToggle(SizeKt.m1032sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m3866getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3865getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalClockDisplay$2
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

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.HorizontalClockDisplay(TimePickerState.this, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalClockDisplay(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalClockDisplay)P(1)1107@46965L585:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -519240274, "C1108@47023L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
            startRestartGroup.startReplaceGroup(-709485014);
            ComposerKt.sourceInformation(startRestartGroup, "1110@47101L433");
            if (!timePickerState.getIs24hour()) {
                Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 204292100, "C1111@47180L340:TimePicker.kt#uh7d8r");
                int i3 = i2 << 3;
                VerticalPeriodToggle(SizeKt.m1032sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m3869getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3868getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i3 & 896) | (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalClockDisplay$2
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

                public final void invoke(Composer composer2, int i4) {
                    TimePickerKt.VerticalClockDisplay(TimePickerState.this, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockDisplayNumbers(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockDisplayNumbers)P(1)1128@47738L5,1131@47873L775,1127@47654L994:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), startRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1
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

                public final void invoke(Composer composer2, int i3) {
                    float f;
                    ComposerKt.sourceInformation(composer2, "C1132@47883L759:TimePicker.kt#uh7d8r");
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-477913269, i3, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
                        }
                        TimePickerState timePickerState2 = TimePickerState.this;
                        TimePickerColors timePickerColors2 = timePickerColors;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
                        Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 599195447, "C1133@47901L294,1140@48208L123,1143@48344L288:TimePicker.kt#uh7d8r");
                        TimePickerKt.m3043TimeSelectorSAnMeKU(SizeKt.m1032sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m3872getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3871getTimeSelectorContainerHeightD9Ej5fM()), TimePickerKt.getHourForDisplay(timePickerState2), timePickerState2, TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI(), timePickerColors2, composer2, 3078);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        f = TimePickerKt.DisplaySeparatorWidth;
                        TimePickerKt.DisplaySeparator(SizeKt.m1032sizeVpY3zN4(companion2, f, TimePickerTokens.INSTANCE.m3868getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                        TimePickerKt.m3043TimeSelectorSAnMeKU(SizeKt.m1032sizeVpY3zN4(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m3872getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3871getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI(), timePickerColors2, composer2, 3078);
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
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$2
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

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.ClockDisplayNumbers(TimePickerState.this, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalPeriodToggle(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPeriodToggle)P(1,2)1160@48810L1014,1188@49871L5,1190@49902L206:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2071625362, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j, 0, measureScope.mo671roundToPx0680j_4(TimePickerTokens.INSTANCE.m3867getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                                int size3 = arrayList2.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    arrayList3.add(((Measurable) arrayList2.get(i5)).mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j, 0, Constraints.m6950getMaxWidthimpl(j) / 2, 0, 0, 12, null)));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                return MeasureScope.layout$default(measureScope, Constraints.m6950getMaxWidthimpl(j), Constraints.m6949getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(1), arrayList4.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, mo5851measureBRTryo0, arrayList4.get(0).getWidth() - (mo5851measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$1
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

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.HorizontalPeriodToggle(Modifier.this, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalPeriodToggle(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPeriodToggle)P(1,2)1206@50268L1021,1234@51336L5,1236@51367L207:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1491514731, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, measureScope.mo671roundToPx0680j_4(TimePickerTokens.INSTANCE.m3867getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                                int size3 = arrayList2.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    arrayList3.add(((Measurable) arrayList2.get(i5)).mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, Constraints.m6949getMaxHeightimpl(j) / 2, 3, null)));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                return MeasureScope.layout$default(measureScope, Constraints.m6950getMaxWidthimpl(j), Constraints.m6949getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(1), 0, arrayList4.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, mo5851measureBRTryo0, 0, arrayList4.get(0).getHeight() - (mo5851measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$1
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

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.VerticalPeriodToggle(Modifier.this, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, final MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1374241901);
        ComposerKt.sourceInformation(startRestartGroup, "C(PeriodToggleImpl)P(3,5!1,2,4)1258@51953L5,1259@52008L41,1263@52129L128,1260@52054L1189:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(measurePolicy) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(shape2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i2, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
            }
            BorderStroke m567BorderStrokecXLIe8U = BorderStrokeKt.m567BorderStrokecXLIe8U(TimePickerTokens.INSTANCE.m3867getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.INSTANCE;
            final String m3296getString2EP1pXo = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(R.string.m3c_time_picker_period_toggle_description), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2132305224, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m3296getString2EP1pXo);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
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
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m3296getString2EP1pXo);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier border = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null)), m567BorderStrokecXLIe8U, cornerBasedShape);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, border);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 822309452, "C1274@52547L29,1271@52427L283,1279@52723L219,1288@53072L28,1285@52955L272:TimePicker.kt#uh7d8r");
            boolean z = !timePickerState.isAfternoon();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -250565484, "CC(remember):TimePicker.kt#9igjgp");
            int i3 = i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA;
            boolean z2 = i3 == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        TimePickerState.this.setAfternoon(false);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i4 = (i2 << 3) & 7168;
            ToggleItem(z, shape, (Function0) rememberedValue2, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m2311getLambda1$material3_release(), startRestartGroup, ((i2 >> 9) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 24576 | i4);
            SpacerKt.Spacer(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), SeparatorZIndex), 0.0f, 1, null), timePickerColors.getPeriodSelectorBorderColor(), null, 2, null), startRestartGroup, 0);
            boolean isAfternoon = timePickerState.isAfternoon();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -250548685, "CC(remember):TimePicker.kt#9igjgp");
            boolean z3 = i3 == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(timePickerState));
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        TimePickerState.this.setAfternoon(true);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ToggleItem(isAfternoon, shape2, (Function0) rememberedValue3, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m2312getLambda2$material3_release(), startRestartGroup, ((i2 >> 12) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 24576 | i4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3
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

                public final void invoke(Composer composer2, int i5) {
                    TimePickerKt.PeriodToggleImpl(Modifier.this, timePickerState, timePickerColors, measurePolicy, shape, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ToggleItem(final boolean z, final Shape shape, final Function0<Unit> function0, final TimePickerColors timePickerColors, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1937408098);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleItem)P(!1,4,3)1310@53677L22,1316@53868L124,1308@53569L429:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
            }
            long m3035periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m3035periodSelectorContentColorvNxB06k$material3_release(z);
            long m3034periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m3034periodSelectorContainerColorvNxB06k$material3_release(z);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z ? 0.0f : 1.0f), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -857429536, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
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
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (Function1) rememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m2141textButtonColorsro_MJ88(m3034periodSelectorContainerColorvNxB06k$material3_release, m3035periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, startRestartGroup, 24576, 12), null, null, PaddingKt.m978PaddingValues0680j_4(Dp.m6997constructorimpl(0)), null, function3, startRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$2
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
                    TimePickerKt.ToggleItem(z, shape, function0, timePickerColors, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplaySeparator(final Modifier modifier, Composer composer, final int i) {
        int i2;
        TextStyle m6486copyp1EtxEg;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisplaySeparator)1326@54104L7,1335@54375L172:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i2, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
            }
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m6486copyp1EtxEg = r16.m6486copyp1EtxEg((r48 & 1) != 0 ? r16.spanStyle.m6410getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r16.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r16.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r16.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r16.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6864getCentere0LSkKk(), (r48 & 65536) != 0 ? r16.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r16.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m6841getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m6853getBothEVpEnUU(), null), (r48 & 2097152) != 0 ? r16.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r16.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? ((TextStyle) consume).paragraphStyle.getTextMotion() : null);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -789568360, "C1336@54520L5,1336@54471L70:TimePicker.kt#uh7d8r");
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(":", (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m6486copyp1EtxEg, composer2, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    TimePickerKt.DisplaySeparator(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TimeSelector-SAnMeKU, reason: not valid java name */
    public static final void m3043TimeSelectorSAnMeKU(final Modifier modifier, final int i, final TimePickerState timePickerState, final int i2, final TimePickerColors timePickerColors, Composer composer, final int i3) {
        int i4;
        int m3226constructorimpl;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1148055889);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeSelector)P(1,4,3,2:c#material3.TimePickerSelectionMode)1351@54864L214,1363@55302L124,1373@55637L5,1367@55446L117,1375@55682L497,1361@55218L961:TimePicker.kt#uh7d8r");
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & 512) == 0 ? startRestartGroup.changed(timePickerState) : startRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= startRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        if ((i4 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148055889, i4, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
            }
            boolean m3068equalsimpl0 = TimePickerSelectionMode.m3068equalsimpl0(timePickerState.mo2080getSelectionyecRtBI(), i2);
            if (TimePickerSelectionMode.m3068equalsimpl0(i2, TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI())) {
                Strings.Companion companion = Strings.INSTANCE;
                m3226constructorimpl = Strings.m3226constructorimpl(R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.INSTANCE;
                m3226constructorimpl = Strings.m3226constructorimpl(R.string.m3c_time_picker_minute_selection);
            }
            final String m3296getString2EP1pXo = Strings_androidKt.m3296getString2EP1pXo(m3226constructorimpl, startRestartGroup, 0);
            long m3036timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m3036timeSelectorContainerColorvNxB06k$material3_release(m3068equalsimpl0);
            final long m3037timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m3037timeSelectorContentColorvNxB06k$material3_release(m3068equalsimpl0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1840519339, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m3296getString2EP1pXo);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
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
                        SemanticsPropertiesKt.m6289setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6274getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m3296getString2EP1pXo);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1840523940, "CC(remember):TimePicker.kt#9igjgp");
            boolean z = ((i4 & 7168) == 2048) | ((i4 & 896) == 256 || ((i4 & 512) != 0 && startRestartGroup.changedInstance(timePickerState)));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
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
                        if (TimePickerSelectionMode.m3068equalsimpl0(i2, timePickerState.mo2080getSelectionyecRtBI())) {
                            return;
                        }
                        timePickerState.mo2081setSelection6_8s6DQ(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            SurfaceKt.m2865Surfaced85dljk(m3068equalsimpl0, (Function0<Unit>) rememberedValue2, semantics, false, value, m3036timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1477282471, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    ComposerKt.sourceInformation(composer3, "C1377@55734L152,1383@55896L277:TimePicker.kt#uh7d8r");
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1477282471, i5, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)");
                        }
                        final String m3051numberContentDescriptiondSwYdS4 = TimePickerKt.m3051numberContentDescriptiondSwYdS4(i2, timePickerState.getIs24hour(), i, composer3, 0);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        int i6 = i;
                        long j = m3037timeSelectorContentColorvNxB06k$material3_release;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion3);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4008constructorimpl = Updater.m4008constructorimpl(composer3);
                        Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 396102018, "C1385@56003L48,1384@55951L212:TimePicker.kt#uh7d8r");
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 705515645, "CC(remember):TimePicker.kt#9igjgp");
                        boolean changed2 = composer3.changed(m3051numberContentDescriptiondSwYdS4);
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
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
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m3051numberContentDescriptiondSwYdS4);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        TextKt.m3014Text4IGK_g(CalendarLocale_jvmKt.toLocalString$default(i6, 2, 0, false, 6, null), SemanticsModifierKt.semantics$default(companion4, false, (Function1) rememberedValue3, 1, null), j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TimePickerKt.m3043TimeSelectorSAnMeKU(Modifier.this, i, timePickerState, i2, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    public static final void ClockFace(final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1170157036);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockFace)P(2,1)1521@60272L2018,1513@59878L2412:TimePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170157036, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
            }
            CrossfadeKt.Crossfade(analogTimePickerState.getClockFaceValues(), drawSelector(SizeKt.m1030size3ABfNKs(BackgroundKt.m539backgroundbw27NRU(Modifier.INSTANCE, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z, analogTimePickerState.mo2080getSelectionyecRtBI(), null)), TimePickerTokens.INSTANCE.m3860getClockDialContainerSizeD9Ej5fM()), analogTimePickerState, timePickerColors), AnimationSpecKt.tween$default(200, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1022006568, true, new Function3<IntList, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(IntList intList, Composer composer2, Integer num) {
                    invoke(intList, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final IntList intList, Composer composer2, int i3) {
                    float f;
                    ComposerKt.sourceInformation(composer2, "C1525@60456L1828,1522@60292L1992:TimePicker.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022006568, i3, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, TimePickerTokens.INSTANCE.m3860getClockDialContainerSizeD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
                        }
                    }, 1, null);
                    f = TimePickerKt.OuterCircleSizeRadius;
                    final TimePickerColors timePickerColors2 = TimePickerColors.this;
                    final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                    final boolean z2 = z;
                    TimePickerKt.m3040CircularLayoutuFdPcIQ(semantics$default, f, ComposableLambdaKt.rememberComposableLambda(-320307952, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            ComposerKt.sourceInformation(composer3, "C1528@60589L1685,1526@60470L1804:TimePicker.kt#uh7d8r");
                            if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-320307952, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                                }
                                ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(TimePickerColors.this.m3018clockDialContentColorvNxB06k$material3_release(false)));
                                final IntList intList2 = intList;
                                final AnalogTimePickerState analogTimePickerState3 = analogTimePickerState2;
                                final boolean z3 = z2;
                                CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(1992872400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i5) {
                                        float f2;
                                        int i6;
                                        ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                                        if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1992872400, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                            }
                                            composer4.startReplaceGroup(1547046870);
                                            ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                                            int size = IntList.this.getSize();
                                            AnalogTimePickerState analogTimePickerState4 = analogTimePickerState3;
                                            IntList intList3 = IntList.this;
                                            boolean z4 = z3;
                                            for (final int i7 = 0; i7 < size; i7++) {
                                                if (!analogTimePickerState4.getIs24hour() || TimePickerSelectionMode.m3068equalsimpl0(analogTimePickerState4.mo2080getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI())) {
                                                    i6 = intList3.get(i7);
                                                } else {
                                                    i6 = intList3.get(i7) % 12;
                                                }
                                                int i8 = i6;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                                boolean changed = composer4.changed(i7);
                                                Object rememberedValue = composer4.rememberedValue();
                                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i7);
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), analogTimePickerState4, i8, z4, composer4, 0);
                                            }
                                            composer4.endReplaceGroup();
                                            if (TimePickerSelectionMode.m3068equalsimpl0(analogTimePickerState3.mo2080getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI()) && analogTimePickerState3.getIs24hour()) {
                                                Modifier m539backgroundbw27NRU = BackgroundKt.m539backgroundbw27NRU(SizeKt.m1030size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3860getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m4550getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                                                f2 = TimePickerKt.InnerCircleRadius;
                                                final AnalogTimePickerState analogTimePickerState5 = analogTimePickerState3;
                                                final boolean z5 = z3;
                                                TimePickerKt.m3040CircularLayoutuFdPcIQ(m539backgroundbw27NRU, f2, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i9) {
                                                        IntList intList4;
                                                        IntList intList5;
                                                        ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                                        if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                            }
                                                            intList4 = TimePickerKt.ExtraHours;
                                                            int size2 = intList4.getSize();
                                                            AnalogTimePickerState analogTimePickerState6 = AnalogTimePickerState.this;
                                                            boolean z6 = z5;
                                                            for (final int i10 = 0; i10 < size2; i10++) {
                                                                intList5 = TimePickerKt.ExtraHours;
                                                                int i11 = intList5.get(i10);
                                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                                boolean changed2 = composer5.changed(i10);
                                                                Object rememberedValue2 = composer5.rememberedValue();
                                                                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                                        }
                                                                    };
                                                                    composer5.updateRememberedValue(rememberedValue2);
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue2, 1, null), analogTimePickerState6, i11, z6, composer5, 0);
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }, composer4, 54), composer4, 432, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2
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

                public final void invoke(Composer composer2, int i3) {
                    TimePickerKt.ClockFace(AnalogTimePickerState.this, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier drawSelector(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$drawSelector$1
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
                long Offset = OffsetKt.Offset(contentDrawScope.mo677toPx0680j_4(DpOffset.m7058getXD9Ej5fM(TimePickerKt.getSelectorPos(AnalogTimePickerState.this))), contentDrawScope.mo677toPx0680j_4(DpOffset.m7060getYD9Ej5fM(TimePickerKt.getSelectorPos(AnalogTimePickerState.this))));
                float f = 2;
                float f2 = contentDrawScope.mo677toPx0680j_4(TimePickerTokens.INSTANCE.m3862getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
                long selectorColor = timePickerColors.getSelectorColor();
                ContentDrawScope contentDrawScope2 = contentDrawScope;
                DrawScope.m5052drawCircleVaOC9Bg$default(contentDrawScope2, Color.INSTANCE.m4541getBlack0d7_KjU(), f2, Offset, 0.0f, null, null, BlendMode.INSTANCE.m4430getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                DrawScope.m5052drawCircleVaOC9Bg$default(contentDrawScope2, selectorColor, f2, Offset, 0.0f, null, null, BlendMode.INSTANCE.m4458getXor0nO6VwU(), 56, null);
                DrawScope.m5057drawLineNGM6Ib0$default(contentDrawScope2, selectorColor, androidx.compose.ui.geometry.SizeKt.m4353getCenteruvyYCjk(contentDrawScope.mo5071getSizeNHjbRc()), Offset.m4278minusMKHz9U(Offset, OffsetKt.Offset(((float) Math.cos(AnalogTimePickerState.this.getCurrentAngle())) * f2, ((float) Math.sin(AnalogTimePickerState.this.getCurrentAngle())) * f2)), contentDrawScope.mo677toPx0680j_4(TimePickerTokens.INSTANCE.m3863getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, BlendMode.INSTANCE.m4457getSrcOver0nO6VwU(), PsExtractor.VIDEO_STREAM_MASK, null);
                DrawScope.m5052drawCircleVaOC9Bg$default(contentDrawScope2, selectorColor, contentDrawScope.mo677toPx0680j_4(TimePickerTokens.INSTANCE.m3861getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, androidx.compose.ui.geometry.SizeKt.m4353getCenteruvyYCjk(contentDrawScope.mo5071getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
                DrawScope.m5052drawCircleVaOC9Bg$default(contentDrawScope2, timePickerColors.m3018clockDialContentColorvNxB06k$material3_release(true), f2, Offset, 0.0f, null, null, BlendMode.INSTANCE.m4440getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText(final Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i, final boolean z, Composer composer, final int i2) {
        int i3;
        boolean areEqual;
        final MutableState mutableState;
        final MutableState mutableState2;
        Alignment alignment;
        String str;
        Modifier modifier2;
        boolean z2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-206784607);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockText)P(1,2,3)1639@64421L5,*1640@64463L7,1641@64513L40,1642@64578L43,1643@64638L24,1645@64700L142,1665@65318L163,1670@65563L503,1659@65093L1182:TimePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(analogTimePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206784607, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), startRestartGroup, 6);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float mo677toPx0680j_4 = ((Density) consume).mo677toPx0680j_4(MaxDistance);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 297230880, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4263boximpl(Offset.INSTANCE.m4290getZeroF1C5BW0()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 297232963, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m7116boximpl(IntOffset.INSTANCE.m7135getZeronOccac()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final String m3051numberContentDescriptiondSwYdS4 = m3051numberContentDescriptiondSwYdS4(analogTimePickerState.mo2080getSelectionyecRtBI(), analogTimePickerState.getIs24hour(), i, startRestartGroup, i4 & 896);
            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i, 0, 0, false, 7, null);
            if (TimePickerSelectionMode.m3068equalsimpl0(analogTimePickerState.mo2080getSelectionyecRtBI(), TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI())) {
                areEqual = Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getMinute(), 0, 0, false, 7, null), localString$default);
            } else {
                areEqual = Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            }
            final boolean z3 = areEqual;
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier m1030size3ABfNKs = SizeKt.m1030size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 297256763, "CC(remember):TimePicker.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState4;
                mutableState2 = mutableState3;
                rememberedValue4 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        MutableState<IntOffset> mutableState5 = mutableState;
                        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
                        TimePickerKt.ClockText$lambda$33(mutableState5, parentCoordinates != null ? IntSizeKt.m7173getCenterozmzZPI(parentCoordinates.mo5859getSizeYbymL2g()) : IntOffset.INSTANCE.m7135getZeronOccac());
                        TimePickerKt.ClockText$lambda$30(mutableState2, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m4304getCenterF1C5BW0());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                mutableState = mutableState4;
                mutableState2 = mutableState3;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState5 = mutableState2;
            Modifier focusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(m1030size3ABfNKs, (Function1) rememberedValue4), false, null, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 297264943, "CC(remember):TimePicker.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(analogTimePickerState) | startRestartGroup.changed(mo677toPx0680j_4) | ((i4 & 7168) == 2048) | startRestartGroup.changed(z3);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                alignment = center;
                str = localString$default;
                modifier2 = focusable$default;
                z2 = true;
                final MutableState mutableState6 = mutableState;
                rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
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
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                        final float f = mo677toPx0680j_4;
                        final boolean z4 = z;
                        final MutableState<Offset> mutableState7 = mutableState5;
                        final MutableState<IntOffset> mutableState8 = mutableState6;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* compiled from: TimePicker.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                            @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1674}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* loaded from: classes8.dex */
                            public static final class C00671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ MutableState<Offset> $center$delegate;
                                final /* synthetic */ float $maxDist;
                                final /* synthetic */ MutableState<IntOffset> $parentCenter$delegate;
                                final /* synthetic */ AnalogTimePickerState $state;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00671(AnalogTimePickerState analogTimePickerState, float f, boolean z, MutableState<Offset> mutableState, MutableState<IntOffset> mutableState2, Continuation<? super C00671> continuation) {
                                    super(2, continuation);
                                    this.$state = analogTimePickerState;
                                    this.$maxDist = f;
                                    this.$autoSwitchToMinute = z;
                                    this.$center$delegate = mutableState;
                                    this.$parentCenter$delegate = mutableState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00671(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    long ClockText$lambda$29;
                                    long ClockText$lambda$292;
                                    long ClockText$lambda$32;
                                    Object m3052onTaprOwcSBo;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        AnalogTimePickerState analogTimePickerState = this.$state;
                                        ClockText$lambda$29 = TimePickerKt.ClockText$lambda$29(this.$center$delegate);
                                        float m4274getXimpl = Offset.m4274getXimpl(ClockText$lambda$29);
                                        ClockText$lambda$292 = TimePickerKt.ClockText$lambda$29(this.$center$delegate);
                                        float m4275getYimpl = Offset.m4275getYimpl(ClockText$lambda$292);
                                        float f = this.$maxDist;
                                        boolean z = this.$autoSwitchToMinute;
                                        ClockText$lambda$32 = TimePickerKt.ClockText$lambda$32(this.$parentCenter$delegate);
                                        this.label = 1;
                                        m3052onTaprOwcSBo = TimePickerKt.m3052onTaprOwcSBo(analogTimePickerState, m4274getXimpl, m4275getYimpl, f, z, ClockText$lambda$32, this);
                                        if (m3052onTaprOwcSBo == coroutine_suspended) {
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

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00671(analogTimePickerState2, f, z4, mutableState7, mutableState8, null), 3, null);
                                return true;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                modifier2 = focusable$default;
                alignment = center;
                str = localString$default;
                z2 = true;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics = SemanticsModifierKt.semantics(modifier2, z2, (Function1) rememberedValue5);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1481062706, "C1688@66158L48,1686@66083L186:TimePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 879062471, "CC(remember):TimePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m3051numberContentDescriptiondSwYdS4);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
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
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m3051numberContentDescriptiondSwYdS4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue6);
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(str, clearAndSetSemantics, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, value, composer2, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    TimePickerKt.ClockText(Modifier.this, analogTimePickerState, i, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m4263boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ClockText$lambda$32(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClockText$lambda$33(MutableState<IntOffset> mutableState, long j) {
        mutableState.setValue(IntOffset.m7116boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: timeInputOnChange-z7XvuPQ, reason: not valid java name */
    public static final void m3053timeInputOnChangez7XvuPQ(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, Function1<? super TextFieldValue, Unit> function1) {
        int parseInt;
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (TimePickerSelectionMode.m3068equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI())) {
                timePickerState.setHour(0);
            } else {
                timePickerState.setMinute(0);
            }
            function1.invoke(TextFieldValue.m6703copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValue.getText().length() == 3 && TextRange.m6460getStartimpl(textFieldValue.getSelection()) == 1) {
                parseInt = CharsKt.digitToInt(textFieldValue.getText().charAt(0));
            } else {
                parseInt = Integer.parseInt(textFieldValue.getText());
            }
            if (parseInt <= i2) {
                if (TimePickerSelectionMode.m3068equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m3072getHouryecRtBI())) {
                    timePickerState.setHour(parseInt);
                    if (parseInt > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.mo2081setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI());
                    }
                } else {
                    timePickerState.setMinute(parseInt);
                }
                if (textFieldValue.getText().length() > 2) {
                    textFieldValue = TextFieldValue.m6703copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                function1.invoke(textFieldValue);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x05fc, code lost:
    
        if (r5.changedInstance(r4) != false) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x061a  */
    /* renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m3042TimePickerTextField1vLObsk(final androidx.compose.ui.Modifier r115, final androidx.compose.ui.text.input.TextFieldValue r116, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r117, final androidx.compose.material3.TimePickerState r118, final int r119, androidx.compose.foundation.text.KeyboardOptions r120, androidx.compose.foundation.text.KeyboardActions r121, final androidx.compose.material3.TimePickerColors r122, androidx.compose.runtime.Composer r123, final int r124, final int r125) {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m3042TimePickerTextField1vLObsk(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final void m3040CircularLayoutuFdPcIQ(Modifier modifier, final float f, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1548175696);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularLayout)P(1,2:c#ui.unit.Dp)1871@72466L1666,1871@72419L1713:TimePicker.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -328610546, "CC(remember):TimePicker.kt#9igjgp");
            boolean z = (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 32;
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j) {
                        Measurable measurable;
                        Measurable measurable2;
                        final float f2 = measureScope.mo677toPx0680j_4(f);
                        long m6941copyZbe2FdA$default = Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i5 = 0;
                        for (int i6 = 0; i6 < size; i6++) {
                            Measurable measurable3 = list.get(i6);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                                arrayList.add(measurable3);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int size2 = arrayList2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            arrayList3.add(((Measurable) arrayList2.get(i7)).mo5851measureBRTryo0(m6941copyZbe2FdA$default));
                        }
                        final ArrayList arrayList4 = arrayList3;
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i8);
                            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        while (true) {
                            if (i5 >= size4) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i5);
                            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i5++;
                        }
                        Measurable measurable6 = measurable2;
                        final float size5 = 6.2831855f / arrayList4.size();
                        Placeable mo5851measureBRTryo0 = measurable5 != null ? measurable5.mo5851measureBRTryo0(m6941copyZbe2FdA$default) : null;
                        final Placeable mo5851measureBRTryo02 = measurable6 != null ? measurable6.mo5851measureBRTryo0(m6941copyZbe2FdA$default) : null;
                        final Placeable placeable = mo5851measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, Constraints.m6952getMinWidthimpl(j), Constraints.m6951getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable placeable2 = Placeable.this;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList4;
                                long j2 = j;
                                float f3 = f2;
                                float f4 = size5;
                                int size6 = list2.size();
                                int i9 = 0;
                                while (i9 < size6) {
                                    Placeable placeable3 = list2.get(i9);
                                    double d = f3;
                                    double d2 = (i9 * f4) - 1.5707963267948966d;
                                    Placeable.PlacementScope.place$default(placementScope, placeable3, MathKt.roundToInt((Math.cos(d2) * d) + ((Constraints.m6950getMaxWidthimpl(j2) / 2) - (placeable3.getWidth() / 2))), MathKt.roundToInt((d * Math.sin(d2)) + ((Constraints.m6949getMaxHeightimpl(j2) / 2) - (placeable3.getHeight() / 2))), 0.0f, 4, null);
                                    i9++;
                                    list2 = list2;
                                    j2 = j2;
                                }
                                Placeable placeable4 = mo5851measureBRTryo02;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable4, (Constraints.m6952getMinWidthimpl(j) - mo5851measureBRTryo02.getWidth()) / 2, (Constraints.m6951getMinHeightimpl(j) - mo5851measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i5 = ((i3 >> 6) & 14) | ((i3 << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((i5 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
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

                public final void invoke(Composer composer2, int i7) {
                    TimePickerKt.m3040CircularLayoutuFdPcIQ(Modifier.this, f, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m3051numberContentDescriptiondSwYdS4(int i, boolean z, int i2, Composer composer, int i3) {
        int m3226constructorimpl;
        ComposerKt.sourceInformationMarkerStart(composer, 194237364, "C(numberContentDescription)P(2:c#material3.TimePickerSelectionMode)1924@74567L21:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
        }
        if (TimePickerSelectionMode.m3068equalsimpl0(i, TimePickerSelectionMode.INSTANCE.m3073getMinuteyecRtBI())) {
            Strings.Companion companion = Strings.INSTANCE;
            m3226constructorimpl = Strings.m3226constructorimpl(R.string.m3c_time_picker_minute_suffix);
        } else if (z) {
            Strings.Companion companion2 = Strings.INSTANCE;
            m3226constructorimpl = Strings.m3226constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.INSTANCE;
            m3226constructorimpl = Strings.m3226constructorimpl(R.string.m3c_time_picker_hour_suffix);
        }
        String m3297getStringqBjtwXw = Strings_androidKt.m3297getStringqBjtwXw(m3226constructorimpl, new Object[]{Integer.valueOf(i2)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3297getStringqBjtwXw;
    }

    private static final float dist(float f, float f2, int i, int i2) {
        return (float) Math.hypot(i - f, i2 - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float atan(float f, float f2) {
        float atan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + FullCircle : atan2;
    }

    private static final Modifier visible(Modifier modifier, final boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("visible");
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static {
        float f = 24;
        ClockFaceBottomMargin = Dp.m6997constructorimpl(f);
        DisplaySeparatorWidth = Dp.m6997constructorimpl(f);
        TimeInputBottomPadding = Dp.m6997constructorimpl(f);
        IntList intListOf = IntListKt.intListOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = intListOf;
        MutableIntList mutableIntList = new MutableIntList(intListOf.getSize());
        int[] iArr = intListOf.content;
        int i = intListOf._size;
        for (int i2 = 0; i2 < i; i2++) {
            mutableIntList.add((iArr[i2] % 12) + 12);
        }
        ExtraHours = mutableIntList;
        PeriodToggleMargin = Dp.m6997constructorimpl(12);
    }
}
