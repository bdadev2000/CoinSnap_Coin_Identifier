package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.glority.android.core.data.LogEventArguments;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BM\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000205H\u0002JM\u00109\u001a\u0002052=\u0010:\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110<¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(=\u0012\u0004\u0012\u0002050;\u0012\n\u0012\b\u0012\u0004\u0012\u0002050(\u0012\u0006\u0012\u0004\u0018\u00010)0 H\u0096@¢\u0006\u0002\u0010>J\b\u0010?\u001a\u000205H\u0016J\u001a\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020FH\u0016ø\u0001\u0000¢\u0006\u0004\bG\u0010CJ\u001a\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020JH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u000205H\u0016J*\u0010N\u001a\u0002052\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u001a\u0010W\u001a\u00020\u00102\u0006\u0010I\u001a\u00020JH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010LJ\"\u0010Y\u001a\u0002052\u0006\u0010I\u001a\u00020P2\u0006\u0010Z\u001a\u00020TH\u0002ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u000205H\u0002J\b\u0010^\u001a\u00020\u0010H\u0016JN\u0010_\u001a\u0002052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010`\u001a\u000205H\u0002J\f\u0010a\u001a\u000205*\u00020bH\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R@\u0010\u001f\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0010\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010&\u001a \b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0(\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "contentInViewNode", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollByAction", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "x", "y", "scrollByOffsetAction", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "scrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "scrollableContainerNode", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "applyFocusProperties", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "clearScrollSemanticsActions", "drag", "forEachDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttach", "onDragStarted", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped-TH1AsA0", "onKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "processMouseWheelEvent", LogEventArguments.ARG_SIZE, "processMouseWheelEvent-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "setScrollSemanticsActions", "startDragImmediately", "update", "updateDefaultFlingBehavior", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ScrollableNode extends DragGestureNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, KeyInputModifierNode, SemanticsModifierNode {
    private final ContentInViewNode contentInViewNode;
    private final DefaultFlingBehavior defaultFlingBehavior;
    private FlingBehavior flingBehavior;
    private final ScrollableNestedScrollConnection nestedScrollConnection;
    private final NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private Function2<? super Float, ? super Float, Boolean> scrollByAction;
    private Function2<? super Offset, ? super Continuation<? super Offset>, ? extends Object> scrollByOffsetAction;
    private ScrollConfig scrollConfig;
    private final ScrollableContainerNode scrollableContainerNode;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo694onDragStartedk4lQ0M(long startedPosition) {
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo514onPreKeyEventZmokQxo(KeyEvent event) {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ScrollableNode(androidx.compose.foundation.gestures.ScrollableState r13, androidx.compose.foundation.OverscrollEffect r14, androidx.compose.foundation.gestures.FlingBehavior r15, androidx.compose.foundation.gestures.Orientation r16, boolean r17, boolean r18, androidx.compose.foundation.interaction.MutableInteractionSource r19, androidx.compose.foundation.gestures.BringIntoViewSpec r20) {
        /*
            r12 = this;
            r0 = r12
            r8 = r16
            r9 = r17
            kotlin.jvm.functions.Function1 r1 = androidx.compose.foundation.gestures.ScrollableKt.access$getCanDragCalculation$p()
            r2 = r19
            r12.<init>(r1, r9, r2, r8)
            r1 = r14
            r0.overscrollEffect = r1
            r1 = r15
            r0.flingBehavior = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r10 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r10.<init>()
            r0.nestedScrollDispatcher = r10
            androidx.compose.foundation.gestures.ScrollableContainerNode r1 = new androidx.compose.foundation.gestures.ScrollableContainerNode
            r1.<init>(r9)
            androidx.compose.ui.node.DelegatableNode r1 = (androidx.compose.ui.node.DelegatableNode) r1
            androidx.compose.ui.node.DelegatableNode r1 = r12.delegate(r1)
            androidx.compose.foundation.gestures.ScrollableContainerNode r1 = (androidx.compose.foundation.gestures.ScrollableContainerNode) r1
            r0.scrollableContainerNode = r1
            androidx.compose.foundation.gestures.DefaultFlingBehavior r1 = new androidx.compose.foundation.gestures.DefaultFlingBehavior
            androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1 r2 = androidx.compose.foundation.gestures.ScrollableKt.access$getUnityDensity$p()
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.animation.core.DecayAnimationSpec r2 = androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(r2)
            r3 = 0
            r4 = 2
            r1.<init>(r2, r3, r4, r3)
            r0.defaultFlingBehavior = r1
            androidx.compose.foundation.OverscrollEffect r3 = r0.overscrollEffect
            androidx.compose.foundation.gestures.FlingBehavior r2 = r0.flingBehavior
            if (r2 != 0) goto L47
            androidx.compose.foundation.gestures.FlingBehavior r1 = (androidx.compose.foundation.gestures.FlingBehavior) r1
            r4 = r1
            goto L48
        L47:
            r4 = r2
        L48:
            androidx.compose.foundation.gestures.ScrollingLogic r11 = new androidx.compose.foundation.gestures.ScrollingLogic
            r1 = r11
            r2 = r13
            r5 = r16
            r6 = r18
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.scrollingLogic = r11
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r1 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection
            r1.<init>(r11, r9)
            r0.nestedScrollConnection = r1
            androidx.compose.foundation.gestures.ContentInViewNode r2 = new androidx.compose.foundation.gestures.ContentInViewNode
            r3 = r18
            r4 = r20
            r2.<init>(r8, r11, r3, r4)
            androidx.compose.ui.node.DelegatableNode r2 = (androidx.compose.ui.node.DelegatableNode) r2
            androidx.compose.ui.node.DelegatableNode r2 = r12.delegate(r2)
            androidx.compose.foundation.gestures.ContentInViewNode r2 = (androidx.compose.foundation.gestures.ContentInViewNode) r2
            r0.contentInViewNode = r2
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r1
            androidx.compose.ui.node.DelegatableNode r1 = androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.nestedScrollModifierNode(r1, r10)
            r12.delegate(r1)
            androidx.compose.ui.focus.FocusTargetModifierNode r1 = androidx.compose.ui.focus.FocusTargetModifierNodeKt.FocusTargetModifierNode()
            androidx.compose.ui.node.DelegatableNode r1 = (androidx.compose.ui.node.DelegatableNode) r1
            r12.delegate(r1)
            androidx.compose.foundation.relocation.BringIntoViewResponderNode r1 = new androidx.compose.foundation.relocation.BringIntoViewResponderNode
            androidx.compose.foundation.relocation.BringIntoViewResponder r2 = (androidx.compose.foundation.relocation.BringIntoViewResponder) r2
            r1.<init>(r2)
            androidx.compose.ui.node.DelegatableNode r1 = (androidx.compose.ui.node.DelegatableNode) r1
            r12.delegate(r1)
            androidx.compose.foundation.FocusedBoundsObserverNode r1 = new androidx.compose.foundation.FocusedBoundsObserverNode
            androidx.compose.foundation.gestures.ScrollableNode$1 r2 = new androidx.compose.foundation.gestures.ScrollableNode$1
            r2.<init>()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r1.<init>(r2)
            androidx.compose.ui.node.DelegatableNode r1 = (androidx.compose.ui.node.DelegatableNode) r1
            r12.delegate(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNode.<init>(androidx.compose.foundation.gestures.ScrollableState, androidx.compose.foundation.OverscrollEffect, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec):void");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object scroll = scrollingLogic.scroll(MutatePriority.UserInput, new ScrollableNode$drag$2$1(function2, scrollingLogic, null), continuation);
        return scroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0 */
    public void mo695onDragStoppedTH1AsA0(long velocity) {
        BuildersKt__Builders_commonKt.launch$default(this.nestedScrollDispatcher.getCoroutineScope(), null, null, new ScrollableNode$onDragStopped$1(this, velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.shouldScrollImmediately();
    }

    public final void update(ScrollableState state, Orientation orientation, OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, FlingBehavior flingBehavior, MutableInteractionSource interactionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z;
        Function1<? super PointerInputChange, Boolean> function1;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.setEnabled(enabled);
            this.scrollableContainerNode.update(enabled);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean update = this.scrollingLogic.update(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.update(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        function1 = ScrollableKt.CanDragCalculation;
        update(function1, enabled, interactionSource, this.scrollingLogic.isVertical() ? Orientation.Vertical : Orientation.Horizontal, update);
        if (z2) {
            clearScrollSemanticsActions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateDefaultFlingBehavior();
    }

    private final void updateDefaultFlingBehavior() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$updateDefaultFlingBehavior$1
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
                DefaultFlingBehavior defaultFlingBehavior;
                Density density = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(ScrollableNode.this, CompositionLocalsKt.getLocalDensity());
                defaultFlingBehavior = ScrollableNode.this.defaultFlingBehavior;
                defaultFlingBehavior.setFlingDecay(SplineBasedDecayKt.splineBasedDecay(density));
            }
        });
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo512onKeyEventZmokQxo(KeyEvent event) {
        long Offset;
        if (!getEnabled() || ((!Key.m5272equalsimpl0(KeyEvent_androidKt.m5580getKeyZmokQxo(event), Key.INSTANCE.m5460getPageDownEK5gGoQ()) && !Key.m5272equalsimpl0(KeyEvent_androidKt.m5580getKeyZmokQxo(event), Key.INSTANCE.m5461getPageUpEK5gGoQ())) || !KeyEventType.m5573equalsimpl0(KeyEvent_androidKt.m5581getTypeZmokQxo(event), KeyEventType.INSTANCE.m5577getKeyDownCS__XNY()) || KeyEvent_androidKt.m5584isCtrlPressedZmokQxo(event))) {
            return false;
        }
        if (this.scrollingLogic.isVertical()) {
            int m7166getHeightimpl = IntSize.m7166getHeightimpl(this.contentInViewNode.getViewportSize());
            Offset = OffsetKt.Offset(0.0f, Key.m5272equalsimpl0(KeyEvent_androidKt.m5580getKeyZmokQxo(event), Key.INSTANCE.m5461getPageUpEK5gGoQ()) ? m7166getHeightimpl : -m7166getHeightimpl);
        } else {
            int m7167getWidthimpl = IntSize.m7167getWidthimpl(this.contentInViewNode.getViewportSize());
            Offset = OffsetKt.Offset(Key.m5272equalsimpl0(KeyEvent_androidKt.m5580getKeyZmokQxo(event), Key.INSTANCE.m5461getPageUpEK5gGoQ()) ? m7167getWidthimpl : -m7167getWidthimpl, 0.0f);
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, Offset, null), 3, null);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo513onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (getCanDrag().invoke(changes.get(i)).booleanValue()) {
                super.mo513onPointerEventH0pRuoY(pointerEvent, pass, bounds);
                break;
            }
            i++;
        }
        if (pass == PointerEventPass.Main && PointerEventType.m5671equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m5680getScroll7fucELk())) {
            m788processMouseWheelEventO0kMr_c(pointerEvent, bounds);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            setScrollSemanticsActions();
        }
        Function2<? super Float, ? super Float, Boolean> function2 = this.scrollByAction;
        if (function2 != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, function2, 1, null);
        }
        Function2<? super Offset, ? super Continuation<? super Offset>, ? extends Object> function22 = this.scrollByOffsetAction;
        if (function22 != null) {
            SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, function22);
        }
    }

    private final void setScrollSemanticsActions() {
        this.scrollByAction = new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Scrollable.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ float $x;
                final /* synthetic */ float $y;
                int label;
                final /* synthetic */ ScrollableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ScrollableNode scrollableNode, float f, float f2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = scrollableNode;
                    this.$x = f;
                    this.$y = f2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$x, this.$y, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ScrollingLogic scrollingLogic;
                    Object m785semanticsScrollByd4ec7I;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        scrollingLogic = this.this$0.scrollingLogic;
                        this.label = 1;
                        m785semanticsScrollByd4ec7I = ScrollableKt.m785semanticsScrollByd4ec7I(scrollingLogic, OffsetKt.Offset(this.$x, this.$y), this);
                        if (m785semanticsScrollByd4ec7I == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Float f, Float f2) {
                return invoke(f.floatValue(), f2.floatValue());
            }

            public final Boolean invoke(float f, float f2) {
                BuildersKt__Builders_commonKt.launch$default(ScrollableNode.this.getCoroutineScope(), null, null, new AnonymousClass1(ScrollableNode.this, f, f2, null), 3, null);
                return true;
            }
        };
        this.scrollByOffsetAction = new ScrollableNode$setScrollSemanticsActions$2(this, null);
    }

    private final void clearScrollSemanticsActions() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    /* renamed from: processMouseWheelEvent-O0kMr_c, reason: not valid java name */
    private final void m788processMouseWheelEventO0kMr_c(PointerEvent event, long size) {
        int size2 = event.getChanges().size();
        for (int i = 0; i < size2; i++) {
            if (!(!r0.get(i).isConsumed())) {
                return;
            }
        }
        ScrollConfig scrollConfig = this.scrollConfig;
        Intrinsics.checkNotNull(scrollConfig);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new ScrollableNode$processMouseWheelEvent$2$1(this, scrollConfig.mo698calculateMouseWheelScroll8xgXZGE(DelegatableNodeKt.requireDensity(this), event, size), null), 3, null);
        List<PointerInputChange> changes = event.getChanges();
        int size3 = changes.size();
        for (int i2 = 0; i2 < size3; i2++) {
            changes.get(i2).consume();
        }
    }
}
