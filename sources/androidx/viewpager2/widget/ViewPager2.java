package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f21791a;

    /* renamed from: b, reason: collision with root package name */
    public int f21792b;

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f21793c;
    public int d;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends DataSetChangeObserver {
        @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            throw null;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends OnPageChangeCallback {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends OnPageChangeCallback {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass4 implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void b(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* loaded from: classes2.dex */
    public abstract class AccessibilityProvider {
    }

    /* loaded from: classes2.dex */
    public class BasicAccessibilityProvider extends AccessibilityProvider {
    }

    /* loaded from: classes2.dex */
    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i2, int i3, int i4) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3, Object obj) {
            onChanged();
        }
    }

    /* loaded from: classes2.dex */
    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, Bundle bundle) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            return false;
        }
    }

    @IntRange
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface OffscreenPageLimit {
    }

    /* loaded from: classes2.dex */
    public static abstract class OnPageChangeCallback {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    /* loaded from: classes2.dex */
    public class PageAwareAccessibilityProvider extends AccessibilityProvider {

        /* renamed from: androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements AccessibilityViewCommand {
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                ((ViewPager2) view).getCurrentItem();
                throw null;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass2 implements AccessibilityViewCommand {
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                ((ViewPager2) view).getCurrentItem();
                throw null;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass3 extends DataSetChangeObserver {
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void onChanged() {
                throw null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface PageTransformer {
    }

    /* loaded from: classes2.dex */
    public class PagerSnapHelperImpl extends PagerSnapHelper {
        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public class RecyclerViewImpl extends RecyclerView {
        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            throw null;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ScrollState {
    }

    /* loaded from: classes2.dex */
    public static class SmoothScrollToPosition implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        RecyclerView.Adapter adapter;
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).f21794a;
            throw null;
        }
        super.dispatchRestoreInstanceState(sparseArray);
        if (this.f21792b == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        if (this.f21793c != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).a();
            }
            this.f21793c = null;
        }
        this.f21791a = Math.max(0, Math.min(this.f21792b, adapter.getItemCount() - 1));
        this.f21792b = -1;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi
    public CharSequence getAccessibilityClassName() {
        throw null;
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        throw null;
    }

    public int getCurrentItem() {
        return this.f21791a;
    }

    public int getItemDecorationCount() {
        throw null;
    }

    public int getOffscreenPageLimit() {
        return this.d;
    }

    public int getOrientation() {
        throw null;
    }

    public int getPageSize() {
        if (getOrientation() == 0) {
            throw null;
        }
        throw null;
    }

    public int getScrollState() {
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(null, i2, i3);
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f21792b = savedState.f21795b;
        this.f21793c = savedState.f21796c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new View.BaseSavedState(super.onSaveInstanceState());
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        throw null;
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        throw null;
    }

    public void setCurrentItem(int i2) {
        throw null;
    }

    @Override // android.view.View
    @RequiresApi
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        throw null;
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.d = i2;
        throw null;
    }

    public void setOrientation(int i2) {
        throw null;
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer == null) {
            throw null;
        }
        throw null;
    }

    public void setUserInputEnabled(boolean z2) {
        throw null;
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public int f21794a;

        /* renamed from: b, reason: collision with root package name */
        public int f21795b;

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f21796c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f21794a);
            parcel.writeInt(this.f21795b);
            parcel.writeParcelable(this.f21796c, i2);
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ?? baseSavedState = new View.BaseSavedState(parcel, null);
                baseSavedState.f21794a = parcel.readInt();
                baseSavedState.f21795b = parcel.readInt();
                baseSavedState.f21796c = parcel.readParcelable(null);
                return baseSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, androidx.viewpager2.widget.ViewPager2$SavedState] */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                ?? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.f21794a = parcel.readInt();
                baseSavedState.f21795b = parcel.readInt();
                baseSavedState.f21796c = parcel.readParcelable(classLoader);
                return baseSavedState;
            }
        }
    }
}
