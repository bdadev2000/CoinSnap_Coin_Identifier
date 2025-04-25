package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010#J\u001a\u00107\u001a\u0002052\u0006\u00108\u001a\u000209H\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\b\u0010<\u001a\u000205H\u0016J\r\u0010=\u001a\u000205H\u0007¢\u0006\u0002\u0010>J\b\u0010?\u001a\u000205H\u0016J&\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010C\u001a\u00020AH\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ \u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u0007H\u0016J,\u0010J\u001a\u00020K2\"\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070Mj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`NH\u0002J\u0018\u0010O\u001a\u0002052\u0006\u0010P\u001a\u00020Q2\u0006\u0010O\u001a\u00020RH\u0016J\"\u0010S\u001a\u00020T2\u0006\u0010P\u001a\u00020Q2\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0000¢\u0006\u0004\bU\u0010VJH\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u001c2\u0006\u0010\\\u001a\u00020\u001c2\u0006\u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020X2\u0006\u0010_\u001a\u00020X2\u0006\u0010`\u001a\u00020\u001c2\u0006\u0010a\u001a\u00020\u0019H\u0002J\u000e\u0010b\u001a\u0002052\u0006\u0010c\u001a\u00020dJ>\u0010e\u001a\u00020f2\u0006\u00108\u001a\u0002092\u0006\u0010g\u001a\u00020h2\u0006\u0010c\u001a\u00020d2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00140j2\u0006\u0010k\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\r\u0010n\u001a\u000205H\u0000¢\u0006\u0002\boJ\u001f\u0010p\u001a\u000205*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010O\u001a\u00020RH\u0002¢\u0006\u0002\u0010qJ\u0019\u0010r\u001a\u000205*\u00020s2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010tJ\u0012\u0010r\u001a\u000205*\u00020u2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010v\u001a\u000205*\u00020w2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00140jR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020)0\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u0014\u0010+\u001a\u00020,X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u000200X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006x"}, d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "computedLayoutResult", "", "designElements", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;", "Lkotlin/collections/ArrayList;", "forcedScaleFactor", "", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "frameCache", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/constraintlayout/core/state/WidgetFrame;", "getFrameCache", "()Ljava/util/Map;", "heightConstraintsHolder", "", "lastMeasures", "", "", "layoutCurrentHeight", "getLayoutCurrentHeight", "()I", "layoutCurrentWidth", "getLayoutCurrentWidth", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "placeables", "Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "state", "Landroidx/constraintlayout/compose/State;", "getState", "()Landroidx/constraintlayout/compose/State;", "widthConstraintsHolder", "addLayoutInformationReceiver", "", "layoutReceiver", "applyRootSize", "constraints", "Landroidx/compose/ui/unit/Constraints;", "applyRootSize-BRTryo0", "(J)V", "computeLayoutResult", "createDesignElements", "(Landroidx/compose/runtime/Composer;I)V", "didMeasures", "getColor", "Landroidx/compose/ui/graphics/Color;", "str", "defaultColor", "getColor-wrIjXm8", "(Ljava/lang/String;J)J", "getDesignInfo", "startX", "startY", "args", "getTextStyle", "Landroidx/compose/ui/text/TextStyle;", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "measure", "constraintWidget", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "measureWidget", "Landroidx/collection/IntIntPair;", "measureWidget-yQShABA", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J", "obtainConstraints", "", "dimensionBehaviour", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", TypedValues.Custom.S_DIMENSION, "matchConstraintDefaultDimension", "measureStrategy", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "outConstraints", "parseDesignElements", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "performMeasure", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "measurables", "", "optimizationLevel", "performMeasure-2eBlSMk", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;I)J", "resetMeasureState", "resetMeasureState$constraintlayout_compose_release", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "drawDebugBounds", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "performLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {
    public static final int $stable = 8;
    private String computedLayoutResult = "";
    private ArrayList<ConstraintSetParser.DesignElement> designElements;
    private float forcedScaleFactor;
    private final Map<Measurable, WidgetFrame> frameCache;
    private final int[] heightConstraintsHolder;
    private final Map<String, Integer[]> lastMeasures;
    private LayoutInformationReceiver layoutInformationReceiver;
    private final Map<Measurable, Placeable> placeables;
    private final ConstraintWidgetContainer root;
    private final State state;
    private final int[] widthConstraintsHolder;

    /* compiled from: ConstraintLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    public Measurer(Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    protected final void setLayoutInformationReceiver(LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final State getState() {
        return this.state;
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    public final void setForcedScaleFactor(float f) {
        this.forcedScaleFactor = f;
    }

    public final int getLayoutCurrentWidth() {
        return this.root.getWidth();
    }

    public final int getLayoutCurrentHeight() {
        return this.root.getHeight();
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    public String getDesignInfo(int startX, int startY, String args) {
        return ToolingUtilsKt.parseConstraintsToJson(this.root, this.state, startX, startY, args);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void measure(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
        String str;
        boolean z;
        String str2 = constraintWidget.stringId;
        if (ConstraintLayoutKt.access$getDEBUG$p()) {
            Log.d("CCL", "Measuring " + str2 + " with: " + ConstraintLayoutKt.access$toDebugString(constraintWidget) + '\n');
        }
        Integer[] numArr = this.lastMeasures.get(str2);
        boolean z2 = false;
        obtainConstraints(measure.horizontalBehavior, measure.horizontalDimension, constraintWidget.mMatchConstraintDefaultWidth, measure.measureStrategy, (numArr != null ? numArr[1].intValue() : 0) == constraintWidget.getHeight(), constraintWidget.isResolvedHorizontally(), Constraints.m6950getMaxWidthimpl(this.state.getRootIncomingConstraints()), this.widthConstraintsHolder);
        obtainConstraints(measure.verticalBehavior, measure.verticalDimension, constraintWidget.mMatchConstraintDefaultHeight, measure.measureStrategy, (numArr != null ? numArr[0].intValue() : 0) == constraintWidget.getWidth(), constraintWidget.isResolvedVertically(), Constraints.m6949getMaxHeightimpl(this.state.getRootIncomingConstraints()), this.heightConstraintsHolder);
        int[] iArr = this.widthConstraintsHolder;
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = this.heightConstraintsHolder;
        long Constraints = ConstraintsKt.Constraints(i, i2, iArr2[0], iArr2[1]);
        if (measure.measureStrategy == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measure.measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || measure.horizontalBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultWidth != 0 || measure.verticalBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultHeight != 0) {
            if (ConstraintLayoutKt.access$getDEBUG$p()) {
                str = "CCL";
                Log.d(str, "Measuring " + str2 + " with " + ((Object) Constraints.m6955toStringimpl(Constraints)));
            } else {
                str = "CCL";
            }
            long m7396measureWidgetyQShABA = m7396measureWidgetyQShABA(constraintWidget, Constraints);
            constraintWidget.setMeasureRequested(false);
            if (ConstraintLayoutKt.access$getDEBUG$p()) {
                Log.d(str, str2 + " is size " + IntIntPair.m332getFirstimpl(m7396measureWidgetyQShABA) + ' ' + IntIntPair.m333getSecondimpl(m7396measureWidgetyQShABA));
            }
            Integer valueOf = Integer.valueOf(IntIntPair.m332getFirstimpl(m7396measureWidgetyQShABA));
            Integer valueOf2 = Integer.valueOf(constraintWidget.mMatchConstraintMinWidth);
            if (valueOf2.intValue() <= 0) {
                valueOf2 = null;
            }
            Integer num = valueOf2;
            Integer valueOf3 = Integer.valueOf(constraintWidget.mMatchConstraintMaxWidth);
            if (valueOf3.intValue() <= 0) {
                valueOf3 = null;
            }
            int intValue = ((Number) RangesKt.coerceIn(valueOf, num, valueOf3)).intValue();
            Integer valueOf4 = Integer.valueOf(IntIntPair.m333getSecondimpl(m7396measureWidgetyQShABA));
            Integer valueOf5 = Integer.valueOf(constraintWidget.mMatchConstraintMinHeight);
            if (valueOf5.intValue() <= 0) {
                valueOf5 = null;
            }
            Integer num2 = valueOf5;
            Integer valueOf6 = Integer.valueOf(constraintWidget.mMatchConstraintMaxHeight);
            int intValue2 = ((Number) RangesKt.coerceIn(valueOf4, num2, valueOf6.intValue() > 0 ? valueOf6 : null)).intValue();
            if (intValue != IntIntPair.m332getFirstimpl(m7396measureWidgetyQShABA)) {
                Constraints = ConstraintsKt.Constraints(intValue, intValue, Constraints.m6951getMinHeightimpl(Constraints), Constraints.m6949getMaxHeightimpl(Constraints));
                z = true;
            } else {
                z = false;
            }
            if (intValue2 != IntIntPair.m333getSecondimpl(m7396measureWidgetyQShABA)) {
                Constraints = ConstraintsKt.Constraints(Constraints.m6952getMinWidthimpl(Constraints), Constraints.m6950getMaxWidthimpl(Constraints), intValue2, intValue2);
                z = true;
            }
            if (z) {
                if (ConstraintLayoutKt.access$getDEBUG$p()) {
                    Log.d(str, "Remeasuring coerced " + str2 + " with " + ((Object) Constraints.m6955toStringimpl(Constraints)));
                }
                m7396measureWidgetyQShABA(constraintWidget, Constraints);
                constraintWidget.setMeasureRequested(false);
            }
        }
        Placeable placeable = this.placeables.get(constraintWidget.getCompanionWidget());
        measure.measuredWidth = placeable != null ? placeable.getWidth() : constraintWidget.getWidth();
        measure.measuredHeight = placeable != null ? placeable.getHeight() : constraintWidget.getHeight();
        int i3 = (placeable == null || !this.state.isBaselineNeeded(constraintWidget)) ? Integer.MIN_VALUE : placeable.get(AlignmentLineKt.getFirstBaseline());
        measure.measuredHasBaseline = i3 != Integer.MIN_VALUE;
        measure.measuredBaseline = i3;
        Map<String, Integer[]> map = this.lastMeasures;
        Integer[] numArr2 = map.get(str2);
        if (numArr2 == null) {
            Integer[] numArr3 = {0, 0, Integer.MIN_VALUE};
            map.put(str2, numArr3);
            numArr2 = numArr3;
        }
        copyFrom(numArr2, measure);
        if (measure.measuredWidth != measure.horizontalDimension || measure.measuredHeight != measure.verticalDimension) {
            z2 = true;
        }
        measure.measuredNeedsSolverPass = z2;
    }

    public final void addLayoutInformationReceiver(LayoutInformationReceiver layoutReceiver) {
        this.layoutInformationReceiver = layoutReceiver;
        if (layoutReceiver != null) {
            layoutReceiver.setLayoutInformation(this.computedLayoutResult);
        }
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{   root: {interpolated: { left:  0,  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    next.stringId = layoutId != null ? layoutId.toString() : null;
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(" " + next.stringId + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            } else if (next instanceof Guideline) {
                sb.append(" " + next.stringId + ": {");
                Guideline guideline = (Guideline) next;
                if (guideline.getOrientation() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String sb2 = sb.toString();
        this.computedLayoutResult = sb2;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb2);
        }
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
        } else {
            if (i == 2) {
                outConstraints[0] = 0;
                outConstraints[1] = rootMaxConstraint;
                return true;
            }
            if (i == 3) {
                if (ConstraintLayoutKt.access$getDEBUG$p()) {
                    Log.d("CCL", "Measure strategy " + measureStrategy);
                    Log.d("CCL", "DW " + matchConstraintDefaultDimension);
                    Log.d("CCL", "ODR " + otherDimensionResolved);
                    Log.d("CCL", "IRH " + currentDimensionResolved);
                }
                boolean z = currentDimensionResolved || ((measureStrategy == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
                if (ConstraintLayoutKt.access$getDEBUG$p()) {
                    Log.d("CCL", "UD " + z);
                }
                outConstraints[0] = z ? dimension : 0;
                if (!z) {
                    dimension = rootMaxConstraint;
                }
                outConstraints[1] = dimension;
                if (!z) {
                    return true;
                }
            } else if (i == 4) {
                outConstraints[0] = rootMaxConstraint;
                outConstraints[1] = rootMaxConstraint;
            } else {
                throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
            }
        }
        return false;
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* renamed from: performMeasure-2eBlSMk, reason: not valid java name */
    public final long m7398performMeasure2eBlSMk(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSet, List<? extends Measurable> measurables, int optimizationLevel) {
        androidx.constraintlayout.core.state.Dimension min;
        androidx.constraintlayout.core.state.Dimension min2;
        String str;
        Object layoutId;
        if (measurables.isEmpty()) {
            return IntSizeKt.IntSize(Constraints.m6952getMinWidthimpl(constraints), Constraints.m6951getMinHeightimpl(constraints));
        }
        State state = this.state;
        if (Constraints.m6948getHasFixedWidthimpl(constraints)) {
            min = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m6950getMaxWidthimpl(constraints));
        } else {
            min = androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m6952getMinWidthimpl(constraints));
        }
        state.width(min);
        State state2 = this.state;
        if (Constraints.m6947getHasFixedHeightimpl(constraints)) {
            min2 = androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m6949getMaxHeightimpl(constraints));
        } else {
            min2 = androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m6951getMinHeightimpl(constraints));
        }
        state2.height(min2);
        this.state.mParent.getWidth().apply(this.state, this.root, 0);
        this.state.mParent.getHeight().apply(this.state, this.root, 1);
        this.state.m7466setRootIncomingConstraintsBRTryo0(constraints);
        this.state.setRtl(layoutDirection == LayoutDirection.Rtl);
        resetMeasureState$constraintlayout_compose_release();
        if (constraintSet.isDirty(measurables)) {
            this.state.reset();
            constraintSet.applyTo(this.state, measurables);
            ConstraintLayoutKt.buildMapping(this.state, measurables);
            this.state.apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(this.state, measurables);
        }
        m7397applyRootSizeBRTryo0(constraints);
        this.root.updateHierarchy();
        if (ConstraintLayoutKt.access$getDEBUG$p()) {
            this.root.setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = children.get(i);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (str = layoutId.toString()) == null) {
                    str = "NOTAG";
                }
                constraintWidget.setDebugName(str);
            }
            Log.d("CCL", "ConstraintLayout is asked to measure with " + ((Object) Constraints.m6955toStringimpl(constraints)));
            Log.d("CCL", ConstraintLayoutKt.access$toDebugString(this.root));
            ArrayList<ConstraintWidget> children2 = this.root.getChildren();
            int size2 = children2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Log.d("CCL", ConstraintLayoutKt.access$toDebugString(children2.get(i2)));
            }
        }
        this.root.setOptimizationLevel(optimizationLevel);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        if (ConstraintLayoutKt.access$getDEBUG$p()) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.root.getWidth() + ' ' + this.root.getHeight());
        }
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$constraintlayout_compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    public final void m7397applyRootSizeBRTryo0(long constraints) {
        this.root.setWidth(Constraints.m6950getMaxWidthimpl(constraints));
        this.root.setHeight(Constraints.m6949getMaxHeightimpl(constraints));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null && (layoutInformationReceiver == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE)) {
            LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
            Intrinsics.checkNotNull(layoutInformationReceiver2);
            int forcedWidth = layoutInformationReceiver2.getForcedWidth();
            if (forcedWidth > this.root.getWidth()) {
                this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
            } else {
                this.forcedScaleFactor = 1.0f;
            }
            this.root.setWidth(forcedWidth);
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            if (layoutInformationReceiver3 == null || layoutInformationReceiver3.getForcedHeight() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLayout(Placeable.PlacementScope placementScope, List<? extends Measurable> list) {
        Measurable measurable;
        Placeable placeable;
        int i = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget = children.get(i2);
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(companionWidget, new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int size2 = list.size();
        while (true) {
            if (i >= size2) {
                LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
                if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                    computeLayoutResult();
                    return;
                }
                return;
            }
            Measurable measurable2 = list.get(i);
            if (this.frameCache.containsKey(measurable2)) {
                measurable = measurable2;
            } else {
                Iterator<T> it = this.frameCache.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Measurable measurable3 = (Measurable) next;
                    if (LayoutIdKt.getLayoutId(measurable3) != null && Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), LayoutIdKt.getLayoutId(measurable2))) {
                        r2 = next;
                        break;
                    }
                }
                measurable = (Measurable) r2;
                if (measurable == null) {
                    continue;
                    i++;
                }
            }
            WidgetFrame widgetFrame = this.frameCache.get(measurable);
            if (widgetFrame == null || (placeable = this.placeables.get(measurable)) == null) {
                return;
            }
            if (!this.frameCache.containsKey(measurable2)) {
                ConstraintLayoutKt.m7342placeWithFrameTransformKtjjmr4$default(placementScope, measurable2.mo5851measureBRTryo0(Constraints.INSTANCE.m6960fixedJhjzzOo(placeable.getWidth(), placeable.getHeight())), widgetFrame, 0L, 4, null);
            } else {
                ConstraintLayoutKt.m7342placeWithFrameTransformKtjjmr4$default(placementScope, placeable, widgetFrame, 0L, 4, null);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    private final long m7396measureWidgetyQShABA(ConstraintWidget constraintWidget, long constraints) {
        int i;
        Object companionWidget = constraintWidget.getCompanionWidget();
        String str = constraintWidget.stringId;
        int i2 = 0;
        if (constraintWidget instanceof VirtualLayout) {
            if (Constraints.m6948getHasFixedWidthimpl(constraints)) {
                i = 1073741824;
            } else {
                i = Constraints.m6946getHasBoundedWidthimpl(constraints) ? Integer.MIN_VALUE : 0;
            }
            if (Constraints.m6947getHasFixedHeightimpl(constraints)) {
                i2 = 1073741824;
            } else if (Constraints.m6945getHasBoundedHeightimpl(constraints)) {
                i2 = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.measure(i, Constraints.m6950getMaxWidthimpl(constraints), i2, Constraints.m6949getMaxHeightimpl(constraints));
            return IntIntPair.m328constructorimpl(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
        if (companionWidget instanceof Measurable) {
            Placeable mo5851measureBRTryo0 = ((Measurable) companionWidget).mo5851measureBRTryo0(constraints);
            this.placeables.put(companionWidget, mo5851measureBRTryo0);
            return IntIntPair.m328constructorimpl(mo5851measureBRTryo0.getWidth(), mo5851measureBRTryo0.getHeight());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.m328constructorimpl(0, 0);
    }

    public final void drawDebugBounds(final BoxScope boxScope, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2126574786);
        ComposerKt.sourceInformation(startRestartGroup, "C(drawDebugBounds)2070@81916L38,2070@81870L84:ConstraintLayout.kt#fysre8");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126574786, i2, -1, "androidx.constraintlayout.compose.Measurer.drawDebugBounds (ConstraintLayout.kt:2069)");
            }
            Modifier matchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1991031410, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance = ((i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 32) | startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$drawDebugBounds$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        Measurer.this.drawDebugBounds(drawScope, f);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(matchParentSize, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$drawDebugBounds$2
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
                    Measurer.this.drawDebugBounds(boxScope, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public final void drawDebugBounds(DrawScope drawScope, float f) {
        float layoutCurrentWidth = getLayoutCurrentWidth() * f;
        float layoutCurrentHeight = getLayoutCurrentHeight() * f;
        float m4343getWidthimpl = (Size.m4343getWidthimpl(drawScope.mo5071getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
        float m4340getHeightimpl = (Size.m4340getHeightimpl(drawScope.mo5071getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
        long m4552getWhite0d7_KjU = Color.INSTANCE.m4552getWhite0d7_KjU();
        float f2 = m4343getWidthimpl + layoutCurrentWidth;
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4552getWhite0d7_KjU, OffsetKt.Offset(m4343getWidthimpl, m4340getHeightimpl), OffsetKt.Offset(f2, m4340getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        float f3 = m4340getHeightimpl + layoutCurrentHeight;
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4552getWhite0d7_KjU, OffsetKt.Offset(f2, m4340getHeightimpl), OffsetKt.Offset(f2, f3), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4552getWhite0d7_KjU, OffsetKt.Offset(f2, f3), OffsetKt.Offset(m4343getWidthimpl, f3), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4552getWhite0d7_KjU, OffsetKt.Offset(m4343getWidthimpl, f3), OffsetKt.Offset(m4343getWidthimpl, m4340getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        float f4 = 1;
        float f5 = m4343getWidthimpl + f4;
        float f6 = m4340getHeightimpl + f4;
        long m4541getBlack0d7_KjU = Color.INSTANCE.m4541getBlack0d7_KjU();
        float f7 = layoutCurrentWidth + f5;
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4541getBlack0d7_KjU, OffsetKt.Offset(f5, f6), OffsetKt.Offset(f7, f6), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        float f8 = layoutCurrentHeight + f6;
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4541getBlack0d7_KjU, OffsetKt.Offset(f7, f6), OffsetKt.Offset(f7, f8), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4541getBlack0d7_KjU, OffsetKt.Offset(f7, f8), OffsetKt.Offset(f5, f8), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        DrawScope.m5057drawLineNGM6Ib0$default(drawScope, m4541getBlack0d7_KjU, OffsetKt.Offset(f5, f8), OffsetKt.Offset(f5, f6), 0.0f, 0, null, 0.0f, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
    }

    /* renamed from: getColor-wrIjXm8$default, reason: not valid java name */
    static /* synthetic */ long m7395getColorwrIjXm8$default(Measurer measurer, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
        }
        if ((i & 2) != 0) {
            j = Color.INSTANCE.m4541getBlack0d7_KjU();
        }
        return measurer.m7394getColorwrIjXm8(str, j);
    }

    /* renamed from: getColor-wrIjXm8, reason: not valid java name */
    private final long m7394getColorwrIjXm8(String str, long defaultColor) {
        if (str != null && StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = "FF" + substring;
            }
            try {
                return ColorKt.Color((int) Long.parseLong(substring, 16));
            } catch (Exception unused) {
            }
        }
        return defaultColor;
    }

    private final TextStyle getTextStyle(HashMap<String, String> params) {
        String str = params.get(LogEventArguments.ARG_SIZE);
        long m7201getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7201getUnspecifiedXSAIIZE();
        if (str != null) {
            m7201getUnspecifiedXSAIIZE = TextUnitKt.getSp(Float.parseFloat(str));
        }
        return new TextStyle(m7395getColorwrIjXm8$default(this, params.get("color"), 0L, 2, null), m7201getUnspecifiedXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    public final void createDesignElements(Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1750959258);
        ComposerKt.sourceInformation(startRestartGroup, "C(createDesignElements):ConstraintLayout.kt#fysre8");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1750959258, i2, -1, "androidx.constraintlayout.compose.Measurer.createDesignElements (ConstraintLayout.kt:2120)");
            }
            ArrayList<ConstraintSetParser.DesignElement> arrayList = this.designElements;
            int size = arrayList.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                ConstraintSetParser.DesignElement designElement = arrayList.get(i7);
                String id = designElement.getId();
                Function4<String, HashMap<String, String>, Composer, Integer, Unit> function4 = DesignElements.INSTANCE.getMap().get(designElement.getType());
                if (function4 != null) {
                    startRestartGroup.startReplaceGroup(-209368134);
                    ComposerKt.sourceInformation(startRestartGroup, "2125@84012L28");
                    function4.invoke(id, designElement.getParams(), startRestartGroup, Integer.valueOf(i6));
                    startRestartGroup.endReplaceGroup();
                    i3 = i7;
                    i5 = i6;
                    i4 = size;
                } else {
                    startRestartGroup.startReplaceGroup(-209229285);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    String type = designElement.getType();
                    if (type != null) {
                        switch (type.hashCode()) {
                            case -1377687758:
                                i3 = i7;
                                i5 = i6;
                                i4 = size;
                                Composer composer2 = startRestartGroup;
                                if (!type.equals(LogEvents.button)) {
                                    startRestartGroup = composer2;
                                    startRestartGroup.startReplaceGroup(-206910826);
                                    startRestartGroup.endReplaceGroup();
                                    break;
                                } else {
                                    startRestartGroup = composer2;
                                    startRestartGroup.startReplaceGroup(-209212359);
                                    ComposerKt.sourceInformation(startRestartGroup, "2132@84361L418");
                                    String str = designElement.getParams().get("text");
                                    if (str == null) {
                                        str = "text";
                                    }
                                    BasicTextKt.m1281BasicTextVhcvRP8(str, PaddingKt.m985padding3ABfNKs(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(LayoutIdKt.layoutId(Modifier.INSTANCE, id), RoundedCornerShapeKt.RoundedCornerShape(20)), m7394getColorwrIjXm8(designElement.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.INSTANCE.m4547getLightGray0d7_KjU()), null, 2, null), Dp.m6997constructorimpl(8)), getTextStyle(designElement.getParams()), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, startRestartGroup, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                                    startRestartGroup.endReplaceGroup();
                                    break;
                                }
                            case -1031434259:
                                i3 = i7;
                                i5 = i6;
                                i4 = size;
                                if (type.equals("textfield")) {
                                    startRestartGroup.startReplaceGroup(-207560958);
                                    ComposerKt.sourceInformation(startRestartGroup, "2164@85902L192");
                                    String str2 = designElement.getParams().get("text");
                                    if (str2 == null) {
                                        str2 = "text";
                                    }
                                    Composer composer3 = startRestartGroup;
                                    BasicTextFieldKt.BasicTextField(str2, (Function1<? super String, Unit>) new Function1<String, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$createDesignElements$1$2
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(String str3) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                                            invoke2(str3);
                                            return Unit.INSTANCE;
                                        }
                                    }, LayoutIdKt.layoutId(Modifier.INSTANCE, id), false, false, (TextStyle) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer3, 48, 0, 65528);
                                    composer3.endReplaceGroup();
                                    startRestartGroup = composer3;
                                    break;
                                }
                                startRestartGroup.startReplaceGroup(-206910826);
                                startRestartGroup.endReplaceGroup();
                                break;
                            case 97739:
                                i3 = i7;
                                i4 = size;
                                if (!type.equals("box")) {
                                    i5 = 0;
                                    startRestartGroup.startReplaceGroup(-206910826);
                                    startRestartGroup.endReplaceGroup();
                                    break;
                                } else {
                                    startRestartGroup.startReplaceGroup(-208521400);
                                    ComposerKt.sourceInformation(startRestartGroup, "2146@85056L343");
                                    String str3 = designElement.getParams().get("text");
                                    String str4 = str3 != null ? str3 : "";
                                    Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(LayoutIdKt.layoutId(Modifier.INSTANCE, id), m7394getColorwrIjXm8(designElement.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.INSTANCE.m4547getLightGray0d7_KjU()), null, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m540backgroundbw27NRU$default);
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
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1239419301, "C2147@85152L221:ConstraintLayout.kt#fysre8");
                                    i5 = 0;
                                    BasicTextKt.m1281BasicTextVhcvRP8(str4, PaddingKt.m985padding3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(8)), getTextStyle(designElement.getParams()), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, startRestartGroup, 48, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endReplaceGroup();
                                    break;
                                }
                            case 3556653:
                                i3 = i7;
                                if (type.equals("text")) {
                                    startRestartGroup.startReplaceGroup(-207913738);
                                    ComposerKt.sourceInformation(startRestartGroup, "2156@85546L204");
                                    String str5 = designElement.getParams().get("text");
                                    if (str5 == null) {
                                        str5 = "text";
                                    }
                                    i4 = size;
                                    BasicTextKt.m1281BasicTextVhcvRP8(str5, LayoutIdKt.layoutId(Modifier.INSTANCE, id), getTextStyle(designElement.getParams()), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, startRestartGroup, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                                    startRestartGroup.endReplaceGroup();
                                    i5 = 0;
                                    break;
                                }
                                i5 = i6;
                                i4 = size;
                                startRestartGroup.startReplaceGroup(-206910826);
                                startRestartGroup.endReplaceGroup();
                                break;
                            case 100313435:
                                if (type.equals("image")) {
                                    startRestartGroup.startReplaceGroup(-207223709);
                                    ComposerKt.sourceInformation(startRestartGroup, "2173@86281L56,2171@86174L259");
                                    i3 = i7;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(android.R.drawable.ic_menu_gallery, startRestartGroup, 6), "Placeholder Image", LayoutIdKt.layoutId(Modifier.INSTANCE, id), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                                    startRestartGroup.endReplaceGroup();
                                    i5 = i6;
                                    i4 = size;
                                    break;
                                }
                            default:
                                i3 = i7;
                                i5 = i6;
                                i4 = size;
                                startRestartGroup.startReplaceGroup(-206910826);
                                startRestartGroup.endReplaceGroup();
                                break;
                        }
                        startRestartGroup.endReplaceGroup();
                    }
                    i3 = i7;
                    i5 = i6;
                    i4 = size;
                    startRestartGroup.startReplaceGroup(-206910826);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endReplaceGroup();
                }
                i7 = i3 + 1;
                i6 = i5;
                size = i4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$createDesignElements$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i8) {
                    Measurer.this.createDesignElements(composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public final void parseDesignElements(ConstraintSet constraintSet) {
        if (constraintSet instanceof JSONConstraintSet) {
            ((JSONConstraintSet) constraintSet).emitDesignElements(this.designElements);
        }
    }
}
