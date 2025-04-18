package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class OrientationHelper {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.LayoutManager f21052a;

    /* renamed from: b, reason: collision with root package name */
    public int f21053b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f21054c = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.OrientationHelper$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int b(View view) {
            return this.f21052a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int c(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f21052a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f21052a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            return this.f21052a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f() {
            return this.f21052a.getWidth();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g() {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            return layoutManager.getWidth() - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.f21052a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            return this.f21052a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.f21052a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.f21052a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            return (layoutManager.getWidth() - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n(View view) {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            Rect rect = this.f21054c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int o(View view) {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            Rect rect = this.f21054c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void p(int i2) {
            this.f21052a.offsetChildrenHorizontal(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.OrientationHelper$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int b(View view) {
            return this.f21052a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int c(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f21052a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f21052a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int e(View view) {
            return this.f21052a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int f() {
            return this.f21052a.getHeight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int g() {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            return layoutManager.getHeight() - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int h() {
            return this.f21052a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int i() {
            return this.f21052a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int j() {
            return this.f21052a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int k() {
            return this.f21052a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int l() {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            return (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int n(View view) {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            Rect rect = this.f21054c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int o(View view) {
            RecyclerView.LayoutManager layoutManager = this.f21052a;
            Rect rect = this.f21054c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void p(int i2) {
            this.f21052a.offsetChildrenVertical(i2);
        }
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.f21052a = layoutManager;
    }

    public static OrientationHelper a(RecyclerView.LayoutManager layoutManager, int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        return new OrientationHelper(layoutManager);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f21053b) {
            return 0;
        }
        return l() - this.f21053b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i2);
}
