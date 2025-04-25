package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bª\u0001\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u000eH\u0016J2\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J(\u00106\u001a\u00020\u000e2\u0006\u00102\u001a\u0002032\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020<H\u0016J:\u0010=\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010\f2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\n\u0010B\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010C\u001a\u00020\u0005H\u0002J\u001a\u0010D\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\b\u0010G\u001a\u00020\u0005H\u0016J$\u0010H\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000¢\u0006\u0002\bIJ\u0010\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020LH\u0016J\u0010\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020MH\u0016J\u0010\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\"H\u0016J$\u0010N\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001a\u0010Q\u001a\u00020\u000e2\u0006\u00102\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u00105J\u000e\u0010S\u001a\u0004\u0018\u00010T*\u00020UH\u0002J3\u0010V\u001a\u0004\u0018\u0001HW\"\n\b\u0000\u0010W\u0018\u0001*\u00020X*\u00020U2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002HW0ZH\u0082\bø\u0001\u0000¢\u0006\u0004\b[\u0010\\Jg\u0010]\u001a\u00020\u0005\"\n\b\u0000\u0010W\u0018\u0001*\u00020U*\u00020U2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002HW0Z2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\ba\u0010bR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestFocusForOwner", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusDirection;", "Lkotlin/ParameterName;", "name", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "onLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "rootState", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "clearFocus", "force", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchRotaryEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "focusSearch", "focusedRect", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getFocusRect", "invalidateOwnerFocusState", "moveFocus", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "requestFocusForOwner", "requestFocusForOwner-7o62pno", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "validateKeyEvent", "validateKeyEvent-ZmokQxo", "lastLocalKeyInputNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "nearestAncestorIncludingSelf", ExifInterface.GPS_DIRECTION_TRUE, "", "type", "Landroidx/compose/ui/node/NodeKind;", "nearestAncestorIncludingSelf-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "traverseAncestorsIncludingSelf", "onPreVisit", "onVisit", "onPostVisit", "traverseAncestorsIncludingSelf-QFhIj7k", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private final FocusInvalidationManager focusInvalidationManager;
    private MutableLongSet keysCurrentlyDown;
    private final Function0<Unit> onClearFocusForOwner;
    private final Function0<Rect> onFocusRectInterop;
    private final Function0<LayoutDirection> onLayoutDirection;
    private final Function1<FocusDirection, Boolean> onMoveFocusInterop;
    private final Function2<FocusDirection, Rect, Boolean> onRequestFocusForOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode();
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
    private final Modifier modifier = FocusPropertiesKt.focusProperties(Modifier.INSTANCE, new Function1<FocusProperties, Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
            invoke2(focusProperties);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusProperties focusProperties) {
            focusProperties.setCanFocus(false);
        }
    }).then(new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode node) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create, reason: avoid collision after fix types in other method */
        public FocusTargetNode getNode() {
            return FocusOwnerImpl.this.getRootFocusNode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return FocusOwnerImpl.this.getRootFocusNode().hashCode();
        }
    });

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1, Function2<? super FocusDirection, ? super Rect, Boolean> function2, Function1<? super FocusDirection, Boolean> function12, Function0<Unit> function0, Function0<Rect> function02, Function0<? extends LayoutDirection> function03) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function12;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function02;
        this.onLayoutDirection = function03;
        this.focusInvalidationManager = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this));
    }

    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: requestFocusForOwner-7o62pno */
    public boolean mo4207requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: takeFocus-aToIllA */
    public boolean mo4208takeFocusaToIllA(final int focusDirection, Rect previouslyFocusedRect) {
        Boolean mo4206focusSearchULY8qGw = mo4206focusSearchULY8qGw(focusDirection, previouslyFocusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean m4225requestFocusMxy_nc0 = FocusTransactionsKt.m4225requestFocusMxy_nc0(focusTargetNode, focusDirection);
                return Boolean.valueOf(m4225requestFocusMxy_nc0 != null ? m4225requestFocusMxy_nc0.booleanValue() : false);
            }
        });
        if (mo4206focusSearchULY8qGw != null) {
            return mo4206focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        if (!focusTransactionManager.ongoingTransaction) {
            try {
                focusTransactionManager.beginTransaction();
                FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
                return;
            } finally {
                focusTransactionManager.commitTransaction();
            }
        }
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        mo4203clearFocusI7lrPNg(force, true, true, FocusDirection.INSTANCE.m4194getExitdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    public boolean mo4203clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean clearFocus;
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 != null) {
                focusTransactionManager.cancellationListener.add(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
            }
            if (!force) {
                int i = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m4221performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection).ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    clearFocus = false;
                    if (clearFocus && clearOwnerFocus) {
                        this.onClearFocusForOwner.invoke();
                    }
                    return clearFocus;
                }
            }
            clearFocus = FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents);
            if (clearFocus) {
                this.onClearFocusForOwner.invoke();
            }
            return clearFocus;
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo4201moveFocus3ESFkO8(final int focusDirection) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = false;
        Boolean mo4206focusSearchULY8qGw = mo4206focusSearchULY8qGw(focusDirection, this.onFocusRectInterop.invoke(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = FocusTransactionsKt.m4225requestFocusMxy_nc0(focusTargetNode, focusDirection);
                Boolean bool = objectRef.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        if (mo4206focusSearchULY8qGw == null || objectRef.element == 0) {
            return false;
        }
        if (Intrinsics.areEqual((Object) mo4206focusSearchULY8qGw, (Object) true) && Intrinsics.areEqual((Object) objectRef.element, (Object) true)) {
            return true;
        }
        if (FocusOwnerImplKt.m4212is1dFocusSearch3ESFkO8(focusDirection)) {
            return mo4203clearFocusI7lrPNg(false, true, false, focusDirection) && mo4208takeFocusaToIllA(focusDirection, null);
        }
        return this.onMoveFocusInterop.invoke(FocusDirection.m4183boximpl(focusDirection)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: focusSearch-ULY8qGw */
    public Boolean mo4206focusSearchULY8qGw(int focusDirection, Rect focusedRect, final Function1<? super FocusTargetNode, Boolean> onFound) {
        final FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            FocusRequester m4226customFocusSearchOMvw8 = FocusTraversalKt.m4226customFocusSearchOMvw8(findActiveFocusNode, focusDirection, this.onLayoutDirection.invoke());
            if (Intrinsics.areEqual(m4226customFocusSearchOMvw8, FocusRequester.INSTANCE.getCancel())) {
                return null;
            }
            if (!Intrinsics.areEqual(m4226customFocusSearchOMvw8, FocusRequester.INSTANCE.getDefault())) {
                return Boolean.valueOf(m4226customFocusSearchOMvw8.findFocusTargetNode$ui_release(onFound));
            }
        } else {
            findActiveFocusNode = null;
        }
        return FocusTraversalKt.m4227focusSearch0X8WOeE(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean booleanValue;
                if (Intrinsics.areEqual(focusTargetNode, FocusTargetNode.this)) {
                    booleanValue = false;
                } else {
                    if (Intrinsics.areEqual(focusTargetNode, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.".toString());
                    }
                    booleanValue = onFound.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    public boolean mo4205dispatchKeyEventYhN2O0w(KeyEvent keyEvent, Function0<Boolean> onFocusedItem) {
        DelegatingNode delegatingNode;
        Modifier.Node node;
        NodeChain nodes;
        DelegatingNode delegatingNode2;
        NodeChain nodes2;
        NodeChain nodes3;
        if (!(!this.focusInvalidationManager.hasPendingInvalidation())) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.".toString());
        }
        if (!m4211validateKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null || (node = lastLocalKeyInputNode(findActiveFocusNode)) == null) {
            if (findActiveFocusNode != null) {
                FocusTargetNode focusTargetNode = findActiveFocusNode;
                int m6086constructorimpl = NodeKind.m6086constructorimpl(8192);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node node2 = focusTargetNode.getNode();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop10: while (true) {
                    if (requireLayoutNode == null) {
                        delegatingNode2 = 0;
                        break;
                    }
                    if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl) != 0) {
                        while (node2 != null) {
                            if ((node2.getKindSet() & m6086constructorimpl) != 0) {
                                MutableVector mutableVector = null;
                                delegatingNode2 = node2;
                                while (delegatingNode2 != 0) {
                                    if (delegatingNode2 instanceof KeyInputModifierNode) {
                                        break loop10;
                                    }
                                    if ((delegatingNode2.getKindSet() & m6086constructorimpl) != 0 && (delegatingNode2 instanceof DelegatingNode)) {
                                        Modifier.Node delegate = delegatingNode2.getDelegate();
                                        int i = 0;
                                        delegatingNode2 = delegatingNode2;
                                        while (delegate != null) {
                                            if ((delegate.getKindSet() & m6086constructorimpl) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    delegatingNode2 = delegate;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (delegatingNode2 != 0) {
                                                        if (mutableVector != null) {
                                                            Boolean.valueOf(mutableVector.add(delegatingNode2));
                                                        }
                                                        delegatingNode2 = 0;
                                                    }
                                                    if (mutableVector != null) {
                                                        Boolean.valueOf(mutableVector.add(delegate));
                                                    }
                                                }
                                            }
                                            delegate = delegate.getChild();
                                            delegatingNode2 = delegatingNode2;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    delegatingNode2 = DelegatableNodeKt.pop(mutableVector);
                                }
                            }
                            node2 = node2.getParent();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui_release();
                    node2 = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                }
                KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) delegatingNode2;
                if (keyInputModifierNode != null) {
                    node = keyInputModifierNode.getNode();
                }
            }
            FocusTargetNode focusTargetNode2 = this.rootFocusNode;
            int m6086constructorimpl2 = NodeKind.m6086constructorimpl(8192);
            if (!focusTargetNode2.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = focusTargetNode2.getNode().getParent();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            loop14: while (true) {
                if (requireLayoutNode2 == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m6086constructorimpl2) != 0) {
                            MutableVector mutableVector2 = null;
                            delegatingNode = parent;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof KeyInputModifierNode) {
                                    break loop14;
                                }
                                if ((delegatingNode.getKindSet() & m6086constructorimpl2) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate2 = delegatingNode.getDelegate();
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate2 != null) {
                                        if ((delegate2.getKindSet() & m6086constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                delegatingNode = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    if (mutableVector2 != null) {
                                                        Boolean.valueOf(mutableVector2.add(delegatingNode));
                                                    }
                                                    delegatingNode = 0;
                                                }
                                                if (mutableVector2 != null) {
                                                    Boolean.valueOf(mutableVector2.add(delegate2));
                                                }
                                            }
                                        }
                                        delegate2 = delegate2.getChild();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            KeyInputModifierNode keyInputModifierNode2 = (KeyInputModifierNode) delegatingNode;
            node = keyInputModifierNode2 != null ? keyInputModifierNode2.getNode() : null;
        }
        if (node != null) {
            Modifier.Node node3 = node;
            int m6086constructorimpl3 = NodeKind.m6086constructorimpl(8192);
            if (!node3.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent2 = node3.getNode().getParent();
            LayoutNode requireLayoutNode3 = DelegatableNodeKt.requireLayoutNode(node3);
            ArrayList arrayList = null;
            while (requireLayoutNode3 != null) {
                if ((requireLayoutNode3.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl3) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & m6086constructorimpl3) != 0) {
                            Modifier.Node node4 = parent2;
                            MutableVector mutableVector3 = null;
                            while (node4 != null) {
                                if (node4 instanceof KeyInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node4);
                                } else if ((node4.getKindSet() & m6086constructorimpl3) != 0 && (node4 instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate3 = ((DelegatingNode) node4).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                        if ((delegate3.getKindSet() & m6086constructorimpl3) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node4 = delegate3;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node4 != null) {
                                                    if (mutableVector3 != null) {
                                                        Boolean.valueOf(mutableVector3.add(node4));
                                                    }
                                                    node4 = null;
                                                }
                                                if (mutableVector3 != null) {
                                                    Boolean.valueOf(mutableVector3.add(delegate3));
                                                }
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                node4 = DelegatableNodeKt.pop(mutableVector3);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                requireLayoutNode3 = requireLayoutNode3.getParent$ui_release();
                parent2 = (requireLayoutNode3 == null || (nodes3 = requireLayoutNode3.getNodes()) == null) ? null : nodes3.getTail();
            }
            if (arrayList != null) {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i4 = size - 1;
                        if (((KeyInputModifierNode) arrayList.get(size)).mo514onPreKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        size = i4;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            DelegatingNode node5 = node3.getNode();
            MutableVector mutableVector4 = null;
            while (node5 != 0) {
                if (node5 instanceof KeyInputModifierNode) {
                    if (((KeyInputModifierNode) node5).mo514onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node5.getKindSet() & m6086constructorimpl3) != 0 && (node5 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node5.getDelegate();
                    int i5 = 0;
                    node5 = node5;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m6086constructorimpl3) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node5 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node5 != 0) {
                                    if (mutableVector4 != null) {
                                        Boolean.valueOf(mutableVector4.add(node5));
                                    }
                                    node5 = 0;
                                }
                                if (mutableVector4 != null) {
                                    Boolean.valueOf(mutableVector4.add(delegate4));
                                }
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node5 = node5;
                    }
                    if (i5 == 1) {
                    }
                }
                node5 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (onFocusedItem.invoke().booleanValue()) {
                return true;
            }
            DelegatingNode node6 = node3.getNode();
            MutableVector mutableVector5 = null;
            while (node6 != 0) {
                if (node6 instanceof KeyInputModifierNode) {
                    if (((KeyInputModifierNode) node6).mo512onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node6.getKindSet() & m6086constructorimpl3) != 0 && (node6 instanceof DelegatingNode)) {
                    Modifier.Node delegate5 = node6.getDelegate();
                    int i6 = 0;
                    node6 = node6;
                    while (delegate5 != null) {
                        if ((delegate5.getKindSet() & m6086constructorimpl3) != 0) {
                            i6++;
                            if (i6 == 1) {
                                node6 = delegate5;
                            } else {
                                if (mutableVector5 == null) {
                                    mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node6 != 0) {
                                    if (mutableVector5 != null) {
                                        Boolean.valueOf(mutableVector5.add(node6));
                                    }
                                    node6 = 0;
                                }
                                if (mutableVector5 != null) {
                                    Boolean.valueOf(mutableVector5.add(delegate5));
                                }
                            }
                        }
                        delegate5 = delegate5.getChild();
                        node6 = node6;
                    }
                    if (i6 == 1) {
                    }
                }
                node6 = DelegatableNodeKt.pop(mutableVector5);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((KeyInputModifierNode) arrayList.get(i7)).mo512onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            }
            Unit unit3 = Unit.INSTANCE;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo4204dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNode;
        NodeChain nodes2;
        if (!(!this.focusInvalidationManager.hasPendingInvalidation())) {
            throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.".toString());
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            FocusTargetNode focusTargetNode = findActiveFocusNode;
            int m6086constructorimpl = NodeKind.m6086constructorimpl(131072);
            if (!focusTargetNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node = focusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & m6086constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m6086constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m6086constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNode = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(delegatingNode);
                                                    }
                                                    delegatingNode = 0;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                node = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNode;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode;
            int m6086constructorimpl2 = NodeKind.m6086constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode2.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = softKeyboardInterceptionModifierNode2.getNode().getParent();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode2);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m6086constructorimpl2) != 0) {
                            Modifier.Node node2 = parent;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet() & m6086constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m6086constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(node2);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo5268onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node3 = softKeyboardInterceptionModifierNode2.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node3).mo5268onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & m6086constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node3.getDelegate();
                    int i4 = 0;
                    node3 = node3;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & m6086constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node3 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(node3);
                                    }
                                    node3 = 0;
                                }
                                if (mutableVector3 != null) {
                                    mutableVector3.add(delegate3);
                                }
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node3 = node3;
                    }
                    if (i4 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node4 = softKeyboardInterceptionModifierNode2.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) node4).mo5267onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node4.getKindSet() & m6086constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node4.getDelegate();
                    int i5 = 0;
                    node4 = node4;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m6086constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node4 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node4 != 0) {
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(node4);
                                    }
                                    node4 = 0;
                                }
                                if (mutableVector4 != null) {
                                    mutableVector4.add(delegate4);
                                }
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node4 = node4;
                    }
                    if (i5 == 1) {
                    }
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).mo5267onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes;
        DelegatingNode delegatingNode;
        NodeChain nodes2;
        if (!(!this.focusInvalidationManager.hasPendingInvalidation())) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.".toString());
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            FocusTargetNode focusTargetNode = findActiveFocusNode;
            int m6086constructorimpl = NodeKind.m6086constructorimpl(16384);
            if (!focusTargetNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node = focusTargetNode.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & m6086constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m6086constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m6086constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNode = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(delegatingNode);
                                                    }
                                                    delegatingNode = 0;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                node = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNode;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            RotaryInputModifierNode rotaryInputModifierNode2 = rotaryInputModifierNode;
            int m6086constructorimpl2 = NodeKind.m6086constructorimpl(16384);
            if (!rotaryInputModifierNode2.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = rotaryInputModifierNode2.getNode().getParent();
            LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode2);
            ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m6086constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m6086constructorimpl2) != 0) {
                            Modifier.Node node2 = parent;
                            MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet() & m6086constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate2 = ((DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m6086constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(node2);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            DelegatingNode node3 = rotaryInputModifierNode2.getNode();
            MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node3).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & m6086constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                    Modifier.Node delegate3 = node3.getDelegate();
                    int i4 = 0;
                    node3 = node3;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & m6086constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node3 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(node3);
                                    }
                                    node3 = 0;
                                }
                                if (mutableVector3 != null) {
                                    mutableVector3.add(delegate3);
                                }
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node3 = node3;
                    }
                    if (i4 == 1) {
                    }
                }
                node3 = DelegatableNodeKt.pop(mutableVector3);
            }
            DelegatingNode node4 = rotaryInputModifierNode2.getNode();
            MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node4).onRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node4.getKindSet() & m6086constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                    Modifier.Node delegate4 = node4.getDelegate();
                    int i5 = 0;
                    node4 = node4;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m6086constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node4 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node4 != 0) {
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(node4);
                                    }
                                    node4 = 0;
                                }
                                if (mutableVector4 != null) {
                                    mutableVector4.add(delegate4);
                                }
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node4 = node4;
                    }
                    if (i5 == 1) {
                    }
                }
                node4 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((RotaryInputModifierNode) arrayList.get(i6)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOwnerFocusState() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m4211validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long m5580getKeyZmokQxo = KeyEvent_androidKt.m5580getKeyZmokQxo(keyEvent);
        int m5581getTypeZmokQxo = KeyEvent_androidKt.m5581getTypeZmokQxo(keyEvent);
        if (KeyEventType.m5573equalsimpl0(m5581getTypeZmokQxo, KeyEventType.INSTANCE.m5577getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(m5580getKeyZmokQxo);
        } else if (KeyEventType.m5573equalsimpl0(m5581getTypeZmokQxo, KeyEventType.INSTANCE.m5578getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(m5580getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(m5580getKeyZmokQxo);
            }
        }
        return true;
    }

    /* renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m4210traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        int i2;
        int size;
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (true) {
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        Modifier.Node node = parent;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (node instanceof Object) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node);
                            } else if ((node.getKindSet() & i) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i4 = size - 1;
                function1.invoke((Object) arrayList.get(size));
                if (i4 < 0) {
                    break;
                } else {
                    size = i4;
                }
            }
        }
        Modifier.Node node2 = delegatableNode.getNode();
        MutableVector mutableVector2 = null;
        while (node2 != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node2 instanceof Object) {
                function1.invoke(node2);
            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof DelegatingNode)) {
                int i5 = 0;
                for (Modifier.Node delegate2 = ((DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                    if ((delegate2.getKindSet() & i) != 0) {
                        i5++;
                        if (i5 == 1) {
                            node2 = delegate2;
                        } else {
                            if (mutableVector2 == null) {
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node2 != null) {
                                if (mutableVector2 != null) {
                                    mutableVector2.add(node2);
                                }
                                node2 = null;
                            }
                            if (mutableVector2 != null) {
                                mutableVector2.add(delegate2);
                            }
                        }
                    }
                }
                if (i5 == 1) {
                }
            }
            node2 = DelegatableNodeKt.pop(mutableVector2);
        }
        function0.invoke();
        Modifier.Node node3 = delegatableNode.getNode();
        MutableVector mutableVector3 = null;
        while (node3 != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node3 instanceof Object) {
                function12.invoke(node3);
            } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof DelegatingNode)) {
                int i6 = 0;
                for (Modifier.Node delegate3 = ((DelegatingNode) node3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                    if ((delegate3.getKindSet() & i) != 0) {
                        i6++;
                        if (i6 == 1) {
                            node3 = delegate3;
                        } else {
                            if (mutableVector3 == null) {
                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node3 != null) {
                                if (mutableVector3 != null) {
                                    mutableVector3.add(node3);
                                }
                                node3 = null;
                            }
                            if (mutableVector3 != null) {
                                mutableVector3.add(delegate3);
                            }
                        }
                    }
                }
                if (i6 == 1) {
                }
            }
            node3 = DelegatableNodeKt.pop(mutableVector3);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (i2 = 0; i2 < size2; i2++) {
                function12.invoke((Object) arrayList.get(i2));
            }
        }
    }

    /* renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m4209nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        Object obj = (T) node;
                        MutableVector mutableVector = null;
                        while (obj != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (obj instanceof Object) {
                                return (T) obj;
                            }
                            Object obj2 = obj;
                            if ((((Modifier.Node) obj).getKindSet() & i) != 0 && (obj instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate = obj.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            obj = (T) delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            Object obj3 = obj;
                                            if (obj != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(obj);
                                                }
                                                obj = (T) null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            obj = (T) DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int m6086constructorimpl = NodeKind.m6086constructorimpl(1024) | NodeKind.m6086constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & m6086constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & m6086constructorimpl) != 0) {
                    if ((NodeKind.m6086constructorimpl(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }
}
