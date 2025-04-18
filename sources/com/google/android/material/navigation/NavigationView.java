package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.compose.material.ripple.a;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.j;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final DrawerLayout.DrawerListener backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;

    @Px
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;

    @Px
    private final int drawerLayoutCornerSizeBackAnimationMax;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @NonNull
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_NavigationView;

    /* renamed from: com.google.android.material.navigation.NavigationView$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends DrawerLayout.SimpleDrawerListener {
        public AnonymousClass1() {
        }

        public void onDrawerClosed(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.backOrchestrator.stopListeningForBackCallbacks();
                NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
            }
        }

        public void onDrawerOpened(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                Objects.requireNonNull(materialBackOrchestrator);
                view.post(new a(materialBackOrchestrator, 28));
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements MenuBuilder.Callback {
        public AnonymousClass2() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
            return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements ViewTreeObserver.OnGlobalLayoutListener {
        public AnonymousClass3() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onGlobalLayout() {
            /*
                r6 = this;
                com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                int[] r1 = com.google.android.material.navigation.NavigationView.access$200(r0)
                r0.getLocationOnScreen(r1)
                com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                r1 = 1
                r0 = r0[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r0 = r1
                goto L18
            L17:
                r0 = r2
            L18:
                com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                com.google.android.material.internal.NavigationMenuPresenter r3 = com.google.android.material.navigation.NavigationView.access$300(r3)
                r3.setBehindStatusBar(r0)
                com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                if (r0 == 0) goto L2d
                boolean r0 = r3.isTopInsetScrimEnabled()
                if (r0 == 0) goto L2d
                r0 = r1
                goto L2e
            L2d:
                r0 = r2
            L2e:
                r3.setDrawTopInsetForeground(r0)
                com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                r0 = r0[r2]
                if (r0 == 0) goto L4f
                com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                r0 = r0[r2]
                com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                int r3 = r3.getWidth()
                int r3 = r3 + r0
                if (r3 != 0) goto L4d
                goto L4f
            L4d:
                r0 = r2
                goto L50
            L4f:
                r0 = r1
            L50:
                com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                r3.setDrawLeftInsetForeground(r0)
                com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                android.content.Context r0 = r0.getContext()
                android.app.Activity r0 = com.google.android.material.internal.ContextUtils.getActivity(r0)
                if (r0 == 0) goto Lca
                android.graphics.Rect r3 = com.google.android.material.internal.WindowUtils.getCurrentWindowBounds(r0)
                int r4 = r3.height()
                com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                int r5 = r5.getHeight()
                int r4 = r4 - r5
                com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                int[] r5 = com.google.android.material.navigation.NavigationView.access$200(r5)
                r5 = r5[r1]
                if (r4 != r5) goto L7c
                r4 = r1
                goto L7d
            L7c:
                r4 = r2
            L7d:
                android.view.Window r0 = r0.getWindow()
                int r0 = r0.getNavigationBarColor()
                int r0 = android.graphics.Color.alpha(r0)
                if (r0 == 0) goto L8d
                r0 = r1
                goto L8e
            L8d:
                r0 = r2
            L8e:
                com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                if (r4 == 0) goto L9c
                if (r0 == 0) goto L9c
                boolean r0 = r5.isBottomInsetScrimEnabled()
                if (r0 == 0) goto L9c
                r0 = r1
                goto L9d
            L9c:
                r0 = r2
            L9d:
                r5.setDrawBottomInsetForeground(r0)
                int r0 = r3.width()
                com.google.android.material.navigation.NavigationView r4 = com.google.android.material.navigation.NavigationView.this
                int[] r4 = com.google.android.material.navigation.NavigationView.access$200(r4)
                r4 = r4[r2]
                if (r0 == r4) goto Lc5
                int r0 = r3.width()
                com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                int r3 = r3.getWidth()
                int r0 = r0 - r3
                com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                int[] r3 = com.google.android.material.navigation.NavigationView.access$200(r3)
                r3 = r3[r2]
                if (r0 != r3) goto Lc4
                goto Lc5
            Lc4:
                r1 = r2
            Lc5:
                com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                r0.setDrawRightInsetForeground(r1)
            Lca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.AnonymousClass3.onGlobalLayout():void");
        }
    }

    /* loaded from: classes.dex */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private ColorStateList createDefaultColorStateList(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    @NonNull
    private Drawable createDefaultItemBackground(@NonNull TintTypedArray tintTypedArray) {
        return createDefaultItemDrawable(tintTypedArray, MaterialResources.getColorStateList(getContext(), tintTypedArray, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    @NonNull
    private Drawable createDefaultItemDrawable(@NonNull TintTypedArray tintTypedArray, @Nullable ColorStateList colorStateList) {
        int resourceId = tintTypedArray.f1237b.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0);
        int i2 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay;
        TypedArray typedArray = tintTypedArray.f1237b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), resourceId, typedArray.getResourceId(i2, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull TintTypedArray tintTypedArray) {
        if (!tintTypedArray.f1237b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance)) {
            if (!tintTypedArray.f1237b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private void maybeUpdateCornerSizeForDrawerLayout(@Px int i2, @Px int i3) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                int i4 = ((DrawerLayout.LayoutParams) getLayoutParams()).f19455a;
                WeakHashMap weakHashMap = ViewCompat.f18740a;
                boolean z2 = Gravity.getAbsoluteGravity(i4, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z2) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel build = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(build);
                this.shapeableDelegate.onShapeAppearanceChanged(this, build);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i2, i3));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    @CanIgnoreReturnValue
    private Pair<DrawerLayout, DrawerLayout.LayoutParams> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            public AnonymousClass3() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r1 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r0.getLocationOnScreen(r1)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r1 = 1
                    r0 = r0[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r0 = r1
                    goto L18
                L17:
                    r0 = r2
                L18:
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    com.google.android.material.internal.NavigationMenuPresenter r3 = com.google.android.material.navigation.NavigationView.access$300(r3)
                    r3.setBehindStatusBar(r0)
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    if (r0 == 0) goto L2d
                    boolean r0 = r3.isTopInsetScrimEnabled()
                    if (r0 == 0) goto L2d
                    r0 = r1
                    goto L2e
                L2d:
                    r0 = r2
                L2e:
                    r3.setDrawTopInsetForeground(r0)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r0 = r0[r2]
                    if (r0 == 0) goto L4f
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r0 = r0[r2]
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int r3 = r3.getWidth()
                    int r3 = r3 + r0
                    if (r3 != 0) goto L4d
                    goto L4f
                L4d:
                    r0 = r2
                    goto L50
                L4f:
                    r0 = r1
                L50:
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    r3.setDrawLeftInsetForeground(r0)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    android.content.Context r0 = r0.getContext()
                    android.app.Activity r0 = com.google.android.material.internal.ContextUtils.getActivity(r0)
                    if (r0 == 0) goto Lca
                    android.graphics.Rect r3 = com.google.android.material.internal.WindowUtils.getCurrentWindowBounds(r0)
                    int r4 = r3.height()
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    int r5 = r5.getHeight()
                    int r4 = r4 - r5
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    int[] r5 = com.google.android.material.navigation.NavigationView.access$200(r5)
                    r5 = r5[r1]
                    if (r4 != r5) goto L7c
                    r4 = r1
                    goto L7d
                L7c:
                    r4 = r2
                L7d:
                    android.view.Window r0 = r0.getWindow()
                    int r0 = r0.getNavigationBarColor()
                    int r0 = android.graphics.Color.alpha(r0)
                    if (r0 == 0) goto L8d
                    r0 = r1
                    goto L8e
                L8d:
                    r0 = r2
                L8e:
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    if (r4 == 0) goto L9c
                    if (r0 == 0) goto L9c
                    boolean r0 = r5.isBottomInsetScrimEnabled()
                    if (r0 == 0) goto L9c
                    r0 = r1
                    goto L9d
                L9c:
                    r0 = r2
                L9d:
                    r5.setDrawBottomInsetForeground(r0)
                    int r0 = r3.width()
                    com.google.android.material.navigation.NavigationView r4 = com.google.android.material.navigation.NavigationView.this
                    int[] r4 = com.google.android.material.navigation.NavigationView.access$200(r4)
                    r4 = r4[r2]
                    if (r0 == r4) goto Lc5
                    int r0 = r3.width()
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int r3 = r3.getWidth()
                    int r0 = r0 - r3
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int[] r3 = com.google.android.material.navigation.NavigationView.access$200(r3)
                    r3 = r3[r2]
                    if (r0 != r3) goto Lc4
                    goto Lc5
                Lc4:
                    r1 = r2
                Lc5:
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    r0.setDrawRightInsetForeground(r1)
                Lca:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.AnonymousClass3.onGlobalLayout():void");
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new j(this, 14));
    }

    @VisibleForTesting
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    @Px
    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i2) {
        return this.presenter.getHeaderView(i2);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> requireDrawerLayoutParent = requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout) requireDrawerLayoutParent.first;
        BackEventCompat onHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, ((DrawerLayout.LayoutParams) requireDrawerLayoutParent.second).f19455a, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    public View inflateHeaderView(@LayoutRes int i2) {
        return this.presenter.inflateHeaderView(i2);
    }

    public void inflateMenu(int i2) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i2, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            DrawerLayout.DrawerListener drawerListener = this.backDrawerListener;
            if (drawerListener == null) {
                drawerLayout.getClass();
            } else {
                ArrayList arrayList = drawerLayout.f19449k;
                if (arrayList != null) {
                    arrayList.remove(drawerListener);
                }
            }
            DrawerLayout.DrawerListener drawerListener2 = this.backDrawerListener;
            if (drawerListener2 != null) {
                if (drawerLayout.f19449k == null) {
                    drawerLayout.f19449k = new ArrayList();
                }
                drawerLayout.f19449k.add(drawerListener2);
            }
            if (DrawerLayout.i(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            DrawerLayout.DrawerListener drawerListener = this.backDrawerListener;
            if (drawerListener == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.f19449k;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(drawerListener);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.presenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.maxWidth), Ints.MAX_POWER_OF_TWO);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, Ints.MAX_POWER_OF_TWO);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        maybeUpdateCornerSizeForDrawerLayout(i2, i3);
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.bottomInsetScrimEnabled = z2;
    }

    public void setCheckedItem(@IdRes int i2) {
        MenuItem findItem = this.menu.findItem(i2);
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(@Px int i2) {
        this.presenter.setDividerInsetEnd(i2);
    }

    public void setDividerInsetStart(@Px int i2) {
        this.presenter.setDividerInsetStart(i2);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        MaterialShapeUtils.setElevation(this, f2);
    }

    @RestrictTo
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z2) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z2);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i2) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setItemHorizontalPadding(@Dimension int i2) {
        this.presenter.setItemHorizontalPadding(i2);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i2) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(@Dimension int i2) {
        this.presenter.setItemIconPadding(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconSize(@Dimension int i2) {
        this.presenter.setItemIconSize(i2);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i2) {
        this.presenter.setItemMaxLines(i2);
    }

    public void setItemTextAppearance(@StyleRes int i2) {
        this.presenter.setItemTextAppearance(i2);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z2);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@Px int i2) {
        this.presenter.setItemVerticalPadding(i2);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i2) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i2));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i2);
        }
    }

    public void setSubheaderInsetEnd(@Px int i2) {
        this.presenter.setSubheaderInsetEnd(i2);
    }

    public void setSubheaderInsetStart(@Px int i2) {
        this.presenter.setSubheaderInsetStart(i2);
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.topInsetScrimEnabled = z2;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        this.sideContainerBackHelper.updateBackProgress(backEventCompat, ((DrawerLayout.LayoutParams) requireDrawerLayoutParent().second).f19455a);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(backEventCompat.f135c));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        @Nullable
        public Bundle menuState;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r18, @androidx.annotation.Nullable android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
