package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SearchBar.android.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0091\u0001\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u0089\u0002\u0010,\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u009b\u0001\u0010O\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u0093\u0002\u0010O\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a»\u0001\u0010V\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\b\b\u0002\u00105\u001a\u0002062\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u0094\u0001\u0010b\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u0006\u00105\u001a\u0002062\u0006\u0010P\u001a\u00020Q2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b0H\u0003¢\u0006\u0002\u0010d\u001a\"\u0010e\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0007H\u0002\u001aD\u0010g\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010k\u001a\u00020l2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010o\u001aN\u0010p\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010\\\u001a\u0004\u0018\u00010^2\u0006\u0010q\u001a\u00020\u00012\u0006\u0010r\u001a\u00020\u00012\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001d\u001a\u00020\u0015X\u0082\u0004¢\u0006\n\n\u0002\u0010\u0018\u0012\u0004\b\u001e\u0010\u001f\"\u0010\u0010 \u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010!\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0016\u0010\"\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017\"\u000e\u0010$\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010%\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010&\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u000e\u0010'\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010(\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b)\u0010\u0017\"\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006u²\u0006\n\u0010v\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u0010w\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"AnimationDelayMillis", "", "AnimationEnterDurationMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitDurationMillis", "AnimationExitEasing", "AnimationExitFloatSpec", "AnimationExitSizeSpec", "AnimationPredictiveBackExitFloatSpec", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "DockedExpandedTableMaxHeightScreenRatio", "DockedExpandedTableMinHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedExpandedTableMinHeight", "()F", "F", "LayoutIdInputField", "", "LayoutIdSearchContent", "LayoutIdSurface", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "SearchBarIconOffsetX", "SearchBarMaxWidth", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarPredictiveBackMaxOffsetXRatio", "SearchBarPredictiveBackMaxOffsetY", "SearchBarPredictiveBackMinMargin", "SearchBarPredictiveBackMinScale", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "UnspecifiedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "DockedSearchBar", "", "inputField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", CmsUILogEvents.CMS_NAME_TYPE_EXPANDED, "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "shadowElevation", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DockedSearchBar-EQC0FA8", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", SearchIntents.EXTRA_QUERY, "onQueryChange", "onSearch", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "SearchBar-Y92LkZI", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarImpl", "animationProgress", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "finalBackProgress", "Landroidx/compose/runtime/MutableFloatState;", "firstBackEvent", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "currentBackEvent", "SearchBarImpl-j1jLAyQ", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarLayout", "surface", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "calculatePredictiveBackMultiplier", "progress", "calculatePredictiveBackOffsetX", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minMargin", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "predictiveBackMultiplier", "calculatePredictiveBackOffsetX-rOvwMX4", "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I", "calculatePredictiveBackOffsetY", "height", "maxOffsetY", "calculatePredictiveBackOffsetY-dzo92Q0", "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I", "material3_release", "useFullScreenShape", "showContent"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;
    private static final TextFieldColors UnspecifiedTextFieldColors = new TextFieldColors(Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), new TextSelectionColors(Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), null), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU(), null);
    private static final float SearchBarCornerRadius = Dp.m6997constructorimpl(SearchBarDefaults.INSTANCE.m2739getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedExpandedTableMinHeight = Dp.m6997constructorimpl(PsExtractor.VIDEO_STREAM_MASK);
    private static final float SearchBarMinWidth = Dp.m6997constructorimpl(360);
    private static final float SearchBarMaxWidth = Dp.m6997constructorimpl(720);
    private static final float SearchBarIconOffsetX = Dp.m6997constructorimpl(4);
    private static final float SearchBarPredictiveBackMaxOffsetY = Dp.m6997constructorimpl(24);

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a6  */
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2747SearchBarY92LkZI(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, final boolean r35, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r36, androidx.compose.ui.Modifier r37, androidx.compose.ui.graphics.Shape r38, androidx.compose.material3.SearchBarColors r39, float r40, float r41, androidx.compose.foundation.layout.WindowInsets r42, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m2747SearchBarY92LkZI(kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f4  */
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2744DockedSearchBarEQC0FA8(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, final boolean r26, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.SearchBarColors r30, float r31, float r32, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m2744DockedSearchBarEQC0FA8(kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    @kotlin.Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @kotlin.ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2746SearchBarWuY5d9Q(final java.lang.String r36, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, final boolean r39, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r40, androidx.compose.ui.Modifier r41, boolean r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.ui.graphics.Shape r46, androidx.compose.material3.SearchBarColors r47, float r48, float r49, androidx.compose.foundation.layout.WindowInsets r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m2746SearchBarWuY5d9Q(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    @kotlin.Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @kotlin.ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2745DockedSearchBareWTbjVg(final java.lang.String r42, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r43, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r44, final boolean r45, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r46, androidx.compose.ui.Modifier r47, boolean r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, androidx.compose.ui.graphics.Shape r52, androidx.compose.material3.SearchBarColors r53, float r54, float r55, androidx.compose.foundation.interaction.MutableInteractionSource r56, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m2745DockedSearchBareWTbjVg(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0339  */
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2748SearchBarImplj1jLAyQ(final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r29, final androidx.compose.runtime.MutableFloatState r30, final androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r31, final androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.ui.graphics.Shape r35, androidx.compose.material3.SearchBarColors r36, float r37, float r38, androidx.compose.foundation.layout.WindowInsets r39, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m2748SearchBarImplj1jLAyQ(androidx.compose.animation.core.Animatable, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(70029564);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBarLayout)P(!1,3,4,2,6,8,5,7)945@42029L34,950@42191L120,965@42827L5009,946@42068L5768:SearchBar.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableState2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i4 = i2;
        if ((38347923 & i4) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70029564, i4, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -660147884, "CC(remember):SearchBar.android.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MutableWindowInsets(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier zIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -660142614, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z = (458752 & i4) == 131072;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                        invoke2(windowInsets2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(WindowInsets windowInsets2) {
                        MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(zIndex, (Function1) rememberedValue2), windowInsets);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -660117373, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z2 = ((i4 & 14) == 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(animatable))) | ((i4 & 7168) == 2048) | ((i4 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 32) | ((i4 & 896) == 256);
            MeasurePolicy rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                rememberedValue3 = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j) {
                        Measurable measurable;
                        final float calculatePredictiveBackMultiplier;
                        Placeable placeable;
                        int i5;
                        int m6949getMaxHeightimpl;
                        MeasureScope measureScope2 = measureScope;
                        long j2 = j;
                        final float floatValue = animatable.getValue().floatValue();
                        int size = list.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Measurable measurable2 = list.get(i6);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                                int size2 = list.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Measurable measurable3 = list.get(i7);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                                        int size3 = list.size();
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i8);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                                break;
                                            }
                                            i8++;
                                        }
                                        Measurable measurable4 = measurable;
                                        final int top = mutableWindowInsets.getTop(measureScope2) + measureScope2.mo671roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int i9 = measureScope2.mo671roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int m6967constrainWidthK40F9xA = ConstraintsKt.m6967constrainWidthK40F9xA(j2, measurable2.maxIntrinsicWidth(Constraints.m6949getMaxHeightimpl(j)));
                                        int m6966constrainHeightK40F9xA = ConstraintsKt.m6966constrainHeightK40F9xA(j2, measurable2.minIntrinsicHeight(Constraints.m6950getMaxWidthimpl(j)));
                                        int roundToInt = MathKt.roundToInt(Constraints.m6950getMaxWidthimpl(j) * 0.9f);
                                        int roundToInt2 = MathKt.roundToInt(Constraints.m6949getMaxHeightimpl(j) * 0.9f);
                                        calculatePredictiveBackMultiplier = SearchBar_androidKt.calculatePredictiveBackMultiplier(mutableState2.getValue(), floatValue, mutableFloatState.getFloatValue());
                                        int lerp = MathHelpersKt.lerp(m6967constrainWidthK40F9xA, roundToInt, calculatePredictiveBackMultiplier);
                                        int i10 = top + m6966constrainHeightK40F9xA;
                                        int lerp2 = MathHelpersKt.lerp(i10, roundToInt2, calculatePredictiveBackMultiplier);
                                        int m6950getMaxWidthimpl = Constraints.m6950getMaxWidthimpl(j);
                                        int m6949getMaxHeightimpl2 = Constraints.m6949getMaxHeightimpl(j);
                                        int lerp3 = MathHelpersKt.lerp(lerp, m6950getMaxWidthimpl, floatValue);
                                        final int lerp4 = MathHelpersKt.lerp(lerp2, m6949getMaxHeightimpl2, floatValue);
                                        final int lerp5 = MathHelpersKt.lerp(top, 0, floatValue);
                                        final int lerp6 = MathHelpersKt.lerp(0, i9, floatValue);
                                        final Placeable mo5851measureBRTryo0 = measurable2.mo5851measureBRTryo0(ConstraintsKt.Constraints(lerp3, m6950getMaxWidthimpl, m6966constrainHeightK40F9xA, m6966constrainHeightK40F9xA));
                                        int width = mo5851measureBRTryo0.getWidth();
                                        final Placeable mo5851measureBRTryo02 = measurable3.mo5851measureBRTryo0(Constraints.INSTANCE.m6960fixedJhjzzOo(width, lerp4 - lerp5));
                                        if (measurable4 != null) {
                                            if (Constraints.m6945getHasBoundedHeightimpl(j)) {
                                                i5 = 0;
                                                m6949getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m6949getMaxHeightimpl(j) - (i10 + i9), 0);
                                            } else {
                                                i5 = 0;
                                                m6949getMaxHeightimpl = Constraints.m6949getMaxHeightimpl(j);
                                            }
                                            placeable = measurable4.mo5851measureBRTryo0(ConstraintsKt.Constraints(width, width, i5, m6949getMaxHeightimpl));
                                        } else {
                                            placeable = null;
                                        }
                                        final MutableState<BackEventCompat> mutableState3 = mutableState2;
                                        final MutableState<BackEventCompat> mutableState4 = mutableState;
                                        final Placeable placeable2 = placeable;
                                        return MeasureScope.layout$default(measureScope, width, lerp4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                float f;
                                                int m2751calculatePredictiveBackOffsetXrOvwMX4;
                                                float f2;
                                                int m2752calculatePredictiveBackOffsetYdzo92Q0;
                                                MeasureScope measureScope3 = MeasureScope.this;
                                                f = SearchBar_androidKt.SearchBarPredictiveBackMinMargin;
                                                int i11 = measureScope3.mo671roundToPx0680j_4(f);
                                                m2751calculatePredictiveBackOffsetXrOvwMX4 = SearchBar_androidKt.m2751calculatePredictiveBackOffsetXrOvwMX4(j, i11, mutableState3.getValue(), MeasureScope.this.getLayoutDirection(), floatValue, calculatePredictiveBackMultiplier);
                                                long j3 = j;
                                                BackEventCompat value = mutableState3.getValue();
                                                BackEventCompat value2 = mutableState4.getValue();
                                                int i12 = lerp4;
                                                MeasureScope measureScope4 = MeasureScope.this;
                                                f2 = SearchBar_androidKt.SearchBarPredictiveBackMaxOffsetY;
                                                m2752calculatePredictiveBackOffsetYdzo92Q0 = SearchBar_androidKt.m2752calculatePredictiveBackOffsetYdzo92Q0(j3, i11, value, value2, i12, measureScope4.mo671roundToPx0680j_4(f2), calculatePredictiveBackMultiplier);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo5851measureBRTryo02, m2751calculatePredictiveBackOffsetXrOvwMX4, m2752calculatePredictiveBackOffsetYdzo92Q0 + lerp5, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo5851measureBRTryo0, m2751calculatePredictiveBackOffsetXrOvwMX4, m2752calculatePredictiveBackOffsetYdzo92Q0 + top, 0.0f, 4, null);
                                                Placeable placeable3 = placeable2;
                                                if (placeable3 != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, m2751calculatePredictiveBackOffsetXrOvwMX4, m2752calculatePredictiveBackOffsetYdzo92Q0 + top + mo5851measureBRTryo0.getHeight() + lerp6, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    i7++;
                                    measureScope2 = measureScope;
                                    j2 = j;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i6++;
                            measureScope2 = measureScope;
                            j2 = j;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                i3 = i4;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, consumeWindowInsets);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 36789781, "C955@42396L85,956@42494L119:SearchBar.android.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSurface);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1442016074, "C955@42470L9:SearchBar.android.kt#uh7d8r");
            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdInputField);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1442132231, "C957@42587L12:SearchBar.android.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-1107184481);
            ComposerKt.sourceInformation(startRestartGroup, "*960@42668L127");
            if (function23 != null) {
                Modifier layoutId3 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSearchContent);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                Updater.m4015setimpl(m4008constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1302856683, "C961@42768L9:SearchBar.android.kt#uh7d8r");
                function23.invoke(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$4
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

                public final void invoke(Composer composer2, int i5) {
                    SearchBar_androidKt.SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, function2, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f, float f2) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f2)) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m2751calculatePredictiveBackOffsetXrOvwMX4(long j, int i, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f, float f2) {
        if (backEventCompat == null || f2 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(((Constraints.m6950getMaxWidthimpl(j) * SearchBarPredictiveBackMaxOffsetXRatio) - i) * (1 - f) * f2 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m2752calculatePredictiveBackOffsetYdzo92Q0(long j, int i, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i2, int i3, float f) {
        if (backEventCompat2 == null || backEventCompat == null || f == 0.0f) {
            return 0;
        }
        int min = Math.min(Math.max(0, ((Constraints.m6949getMaxHeightimpl(j) - i2) / 2) - i), i3);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float abs = Math.abs(touchY) / Constraints.m6949getMaxHeightimpl(j);
        return MathKt.roundToInt(MathHelpersKt.lerp(0, min, abs) * f * Math.signum(touchY));
    }

    static {
        float f = 8;
        SearchBarVerticalPadding = Dp.m6997constructorimpl(f);
        SearchBarPredictiveBackMinMargin = Dp.m6997constructorimpl(f);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tween;
        TweenSpec tween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tween3;
        TweenSpec tween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, null, false, null, 14, null));
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
