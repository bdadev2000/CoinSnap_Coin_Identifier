package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.cooldev.gba.emulator.gameboy.R;
import com.google.common.primitives.Ints;
import e0.x;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope {
    public static final /* synthetic */ int x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final NestedScrollDispatcher f17508a;

    /* renamed from: b, reason: collision with root package name */
    public final View f17509b;

    /* renamed from: c, reason: collision with root package name */
    public final Owner f17510c;
    public q0.a d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17511f;

    /* renamed from: g, reason: collision with root package name */
    public q0.a f17512g;

    /* renamed from: h, reason: collision with root package name */
    public q0.a f17513h;

    /* renamed from: i, reason: collision with root package name */
    public Modifier f17514i;

    /* renamed from: j, reason: collision with root package name */
    public l f17515j;

    /* renamed from: k, reason: collision with root package name */
    public Density f17516k;

    /* renamed from: l, reason: collision with root package name */
    public l f17517l;

    /* renamed from: m, reason: collision with root package name */
    public LifecycleOwner f17518m;

    /* renamed from: n, reason: collision with root package name */
    public SavedStateRegistryOwner f17519n;

    /* renamed from: o, reason: collision with root package name */
    public final q0.a f17520o;

    /* renamed from: p, reason: collision with root package name */
    public final q0.a f17521p;

    /* renamed from: q, reason: collision with root package name */
    public l f17522q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f17523r;

    /* renamed from: s, reason: collision with root package name */
    public int f17524s;

    /* renamed from: t, reason: collision with root package name */
    public int f17525t;

    /* renamed from: u, reason: collision with root package name */
    public final NestedScrollingParentHelper f17526u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17527v;
    public final LayoutNode w;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.core.view.NestedScrollingParentHelper, java.lang.Object] */
    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i2, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.f17508a = nestedScrollDispatcher;
        this.f17509b = view;
        this.f17510c = owner;
        if (compositionContext != null) {
            LinkedHashMap linkedHashMap = WindowRecomposer_androidKt.f16660a;
            setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.d = AndroidViewHolder$update$1.f17556a;
        this.f17512g = AndroidViewHolder$reset$1.f17553a;
        this.f17513h = AndroidViewHolder$release$1.f17552a;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        this.f17514i = companion;
        this.f17516k = DensityKt.b();
        this.f17520o = new AndroidViewHolder$runUpdate$1(this);
        this.f17521p = new AndroidViewHolder$runInvalidate$1(this);
        this.f17523r = new int[2];
        this.f17524s = Integer.MIN_VALUE;
        this.f17525t = Integer.MIN_VALUE;
        this.f17526u = new Object();
        final LayoutNode layoutNode = new LayoutNode(false, 3, 0);
        layoutNode.f15951m = this;
        Modifier a2 = OnGloballyPositionedModifierKt.a(DrawModifierKt.b(PointerInteropFilter_androidKt.a(SemanticsModifierKt.b(NestedScrollModifierKt.a(companion, AndroidViewHolder_androidKt.f17557a, nestedScrollDispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.f17540a), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode));
        layoutNode.f15943c = i2;
        layoutNode.j(this.f17514i.T0(a2));
        this.f17515j = new AndroidViewHolder$layoutNode$1$1(layoutNode, a2);
        layoutNode.k(this.f17516k);
        this.f17517l = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.I = new AndroidViewHolder$layoutNode$1$3(this, layoutNode);
        layoutNode.J = new AndroidViewHolder$layoutNode$1$4(this);
        layoutNode.i(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                p0.a.p(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.d(androidViewHolder, 0, i3, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                p0.a.p(layoutParams);
                androidViewHolder.measure(makeMeasureSpec, AndroidViewHolder.d(androidViewHolder, 0, i3, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int childCount = androidViewHolder.getChildCount();
                x xVar = x.f30219a;
                if (childCount == 0) {
                    return measureScope.T(Constraints.k(j2), Constraints.j(j2), xVar, AndroidViewHolder$layoutNode$1$5$measure$1.f17537a);
                }
                if (Constraints.k(j2) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumWidth(Constraints.k(j2));
                }
                if (Constraints.j(j2) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumHeight(Constraints.j(j2));
                }
                int k2 = Constraints.k(j2);
                int i3 = Constraints.i(j2);
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                p0.a.p(layoutParams);
                int d = AndroidViewHolder.d(androidViewHolder, k2, i3, layoutParams.width);
                int j3 = Constraints.j(j2);
                int h2 = Constraints.h(j2);
                ViewGroup.LayoutParams layoutParams2 = androidViewHolder.getLayoutParams();
                p0.a.p(layoutParams2);
                androidViewHolder.measure(d, AndroidViewHolder.d(androidViewHolder, j3, h2, layoutParams2.height));
                return measureScope.T(androidViewHolder.getMeasuredWidth(), androidViewHolder.getMeasuredHeight(), xVar, new AndroidViewHolder$layoutNode$1$5$measure$2(androidViewHolder, layoutNode));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                p0.a.p(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.d(androidViewHolder, 0, i3, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                p0.a.p(layoutParams);
                androidViewHolder.measure(makeMeasureSpec, AndroidViewHolder.d(androidViewHolder, 0, i3, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }
        });
        this.w = layoutNode;
    }

    public static final int d(AndroidViewHolder androidViewHolder, int i2, int i3, int i4) {
        androidViewHolder.getClass();
        return (i4 >= 0 || i2 == i3) ? View.MeasureSpec.makeMeasureSpec(p0.a.A(i4, i2, i3), Ints.MAX_POWER_OF_TWO) : (i4 != -2 || i3 == Integer.MAX_VALUE) ? (i4 != -1 || i3 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i3, Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return this.f17510c.getSnapshotObserver();
        }
        InlineClassHelperKt.b("Expected AndroidViewHolder to be attached when observing reads.");
        throw null;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean Y0() {
        return isAttachedToWindow();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void a() {
        this.f17513h.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void c() {
        this.f17512g.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void f() {
        View view = this.f17509b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f17512g.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f17523r;
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], getWidth() + i2, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final Density getDensity() {
        return this.f17516k;
    }

    @Nullable
    public final View getInteropView() {
        return this.f17509b;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.w;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f17509b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.f17518m;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.f17514i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f17526u;
        return nestedScrollingParentHelper.f18724b | nestedScrollingParentHelper.f18723a;
    }

    @Nullable
    public final l getOnDensityChanged$ui_release() {
        return this.f17517l;
    }

    @Nullable
    public final l getOnModifierChanged$ui_release() {
        return this.f17515j;
    }

    @Nullable
    public final l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f17522q;
    }

    @NotNull
    public final q0.a getRelease() {
        return this.f17513h;
    }

    @NotNull
    public final q0.a getReset() {
        return this.f17512g;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.f17519n;
    }

    @NotNull
    public final q0.a getUpdate() {
        return this.d;
    }

    @NotNull
    public final View getView() {
        return this.f17509b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f17527v) {
            this.w.H();
            return null;
        }
        this.f17509b.postOnAnimation(new a(this.f17521p, 1));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f17509b.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AndroidViewHolder$runUpdate$1) this.f17520o).invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f17527v) {
            this.w.H();
        } else {
            this.f17509b.postOnAnimation(new a(this.f17521p, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f16155a.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.f17509b.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        View view = this.f17509b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f17524s = i2;
        this.f17525t = i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        e.v(this.f17508a.c(), null, 0, new AndroidViewHolder$onNestedFling$1(z2, this, VelocityKt.a(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        e.v(this.f17508a.c(), null, 0, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.a(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        if (isNestedScrollingEnabled()) {
            float f2 = i2;
            float f3 = -1;
            long a2 = OffsetKt.a(f2 * f3, i3 * f3);
            int i5 = i4 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = this.f17508a.f15519a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f14699n) {
                nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.b(nestedScrollNode);
            }
            long g02 = nestedScrollNode2 != null ? nestedScrollNode2.g0(i5, a2) : 0L;
            iArr[0] = NestedScrollInteropConnectionKt.b(Offset.g(g02));
            iArr[1] = NestedScrollInteropConnectionKt.b(Offset.h(g02));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            float f2 = i2;
            float f3 = -1;
            long a2 = OffsetKt.a(f2 * f3, i3 * f3);
            long a3 = OffsetKt.a(i4 * f3, i5 * f3);
            int i7 = i6 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = this.f17508a.f15519a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f14699n) {
                nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.b(nestedScrollNode);
            }
            NestedScrollNode nestedScrollNode3 = nestedScrollNode2;
            long E0 = nestedScrollNode3 != null ? nestedScrollNode3.E0(i7, a2, a3) : 0L;
            iArr[0] = NestedScrollInteropConnectionKt.b(Offset.g(E0));
            iArr[1] = NestedScrollInteropConnectionKt.b(Offset.h(E0));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f17526u;
        if (i3 == 1) {
            nestedScrollingParentHelper.f18724b = i2;
        } else {
            nestedScrollingParentHelper.f18723a = i2;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        return ((i2 & 2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f17526u;
        if (i2 == 1) {
            nestedScrollingParentHelper.f18724b = 0;
        } else {
            nestedScrollingParentHelper.f18723a = 0;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        l lVar = this.f17522q;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void setDensity(@NotNull Density density) {
        if (density != this.f17516k) {
            this.f17516k = density;
            l lVar = this.f17517l;
            if (lVar != null) {
                lVar.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.f17518m) {
            this.f17518m = lifecycleOwner;
            ViewTreeLifecycleOwner.b(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier modifier) {
        if (modifier != this.f17514i) {
            this.f17514i = modifier;
            l lVar = this.f17515j;
            if (lVar != null) {
                lVar.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable l lVar) {
        this.f17517l = lVar;
    }

    public final void setOnModifierChanged$ui_release(@Nullable l lVar) {
        this.f17515j = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable l lVar) {
        this.f17522q = lVar;
    }

    public final void setRelease(@NotNull q0.a aVar) {
        this.f17513h = aVar;
    }

    public final void setReset(@NotNull q0.a aVar) {
        this.f17512g = aVar;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.f17519n) {
            this.f17519n = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.b(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@NotNull q0.a aVar) {
        this.d = aVar;
        this.f17511f = true;
        ((AndroidViewHolder$runUpdate$1) this.f17520o).invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        if (isNestedScrollingEnabled()) {
            float f2 = i2;
            float f3 = -1;
            long a2 = OffsetKt.a(f2 * f3, i3 * f3);
            long a3 = OffsetKt.a(i4 * f3, i5 * f3);
            int i7 = i6 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = this.f17508a.f15519a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f14699n) {
                nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.b(nestedScrollNode);
            }
            NestedScrollNode nestedScrollNode3 = nestedScrollNode2;
            if (nestedScrollNode3 != null) {
                nestedScrollNode3.E0(i7, a2, a3);
            }
        }
    }
}
