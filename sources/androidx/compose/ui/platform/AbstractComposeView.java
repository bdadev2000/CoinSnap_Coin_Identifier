package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f16176a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f16177b;

    /* renamed from: c, reason: collision with root package name */
    public Composition f16178c;
    public CompositionContext d;

    /* renamed from: f, reason: collision with root package name */
    public q0.a f16179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16180g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16181h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16182i;

    public /* synthetic */ AbstractComposeView(Context context) {
        this(context, null, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.d != compositionContext) {
            this.d = compositionContext;
            if (compositionContext != null) {
                this.f16176a = null;
            }
            Composition composition = this.f16178c;
            if (composition != null) {
                composition.dispose();
                this.f16178c = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f16177b != iBinder) {
            this.f16177b = iBinder;
            this.f16176a = null;
        }
    }

    public abstract void a(Composer composer, int i2);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i2, layoutParams);
    }

    public final void b() {
        if (this.f16181h) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        e();
    }

    public final void d() {
        Composition composition = this.f16178c;
        if (composition != null) {
            composition.dispose();
        }
        this.f16178c = null;
        requestLayout();
    }

    public final void e() {
        if (this.f16178c == null) {
            try {
                this.f16181h = true;
                CompositionContext h2 = h();
                AbstractComposeView$ensureCompositionCreated$1 abstractComposeView$ensureCompositionCreated$1 = new AbstractComposeView$ensureCompositionCreated$1(this);
                Object obj = ComposableLambdaKt.f14482a;
                this.f16178c = Wrapper_androidKt.a(this, h2, new ComposableLambdaImpl(-656146368, abstractComposeView$ensureCompositionCreated$1, true));
            } finally {
                this.f16181h = false;
            }
        }
    }

    public void f(int i2, int i3, int i4, int i5, boolean z2) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i4 - i2) - getPaddingRight(), (i5 - i3) - getPaddingBottom());
        }
    }

    public void g(int i2, int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i2, i3);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i3)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        return this.f16178c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f16180g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.CompositionContext] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.CompositionContext] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.runtime.Recomposer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.CompositionContext] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.CompositionContext h() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractComposeView.h():androidx.compose.runtime.CompositionContext");
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f16182i || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        f(i2, i3, i4, i5, z2);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        e();
        g(i2, i3);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i2);
    }

    public final void setParentCompositionContext(@Nullable CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.f16180g = z2;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z2);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z2) {
        super.setTransitionGroup(z2);
        this.f16182i = true;
    }

    public final void setViewCompositionStrategy(@NotNull ViewCompositionStrategy viewCompositionStrategy) {
        q0.a aVar = this.f16179f;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f16179f = viewCompositionStrategy.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setClipChildren(false);
        setClipToPadding(false);
        this.f16179f = ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f16608b.a(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        b();
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        b();
        return super.addViewInLayout(view, i2, layoutParams, z2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        b();
        super.addView(view, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i2, layoutParams);
    }
}
