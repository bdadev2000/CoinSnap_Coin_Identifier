package androidx.appcompat.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import com.cooldev.gba.emulator.gameboy.R;

@RestrictTo
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {

    /* renamed from: a, reason: collision with root package name */
    public ActionProvider f920a;

    /* renamed from: b, reason: collision with root package name */
    public final DataSetObserver f921b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f922c;
    public ListPopupWindow d;

    /* renamed from: f, reason: collision with root package name */
    public PopupWindow.OnDismissListener f923f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f924g;

    /* renamed from: h, reason: collision with root package name */
    public int f925h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f926i;

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean d() {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass5 extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class ActivityChooserViewAdapter extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public ActivityChooserModel f929a;

        /* renamed from: b, reason: collision with root package name */
        public int f930b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f931c;
        public boolean d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f932f;

        @Override // android.widget.Adapter
        public final int getCount() {
            int c2 = this.f929a.c();
            if (!this.f931c && this.f929a.d() != null) {
                c2--;
            }
            int min = Math.min(c2, this.f930b);
            return this.f932f ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f931c) {
                this.f929a.d();
            }
            ActivityChooserModel activityChooserModel = this.f929a;
            synchronized (activityChooserModel.f912a) {
                activityChooserModel.a();
                ((ActivityChooserModel.ActivityResolveInfo) activityChooserModel.f913b.get(i2)).getClass();
            }
            return null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i2) {
            return (this.f932f && i2 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.list_item) {
                    throw null;
                }
                throw null;
            }
            if (itemViewType != 1) {
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != 1) {
                throw null;
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    /* loaded from: classes.dex */
    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i2);
            if (itemViewType == 0) {
                throw null;
            }
            if (itemViewType != 1) {
                throw new IllegalArgumentException();
            }
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            throw null;
        }
    }

    @RestrictTo
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f933a = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArray = new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, f933a));
            setBackgroundDrawable(tintTypedArray.b(0));
            tintTypedArray.f();
        }
    }

    public ActivityChooserView() {
        super(null, null, 0);
        this.f921b = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.getClass();
                throw null;
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.getClass();
                throw null;
            }
        };
        this.f922c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        return;
                    }
                    activityChooserView.getListPopupWindow().show();
                    ActionProvider actionProvider = activityChooserView.f920a;
                    if (actionProvider == null || (subUiVisibilityListener = actionProvider.f18689a) == null) {
                        return;
                    }
                    subUiVisibilityListener.a(true);
                }
            }
        };
        this.f925h = 4;
        throw null;
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f922c);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().A.isShowing();
    }

    public final void c(int i2) {
        throw null;
    }

    @RestrictTo
    public ActivityChooserModel getDataModel() {
        throw null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.d == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.d = listPopupWindow;
            listPopupWindow.l(null);
            ListPopupWindow listPopupWindow2 = this.d;
            listPopupWindow2.f1150p = this;
            listPopupWindow2.f1158z = true;
            listPopupWindow2.A.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.d;
            listPopupWindow3.f1151q = null;
            listPopupWindow3.A.setOnDismissListener(null);
        }
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        throw null;
    }

    @RestrictTo
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        throw null;
    }

    public void setDefaultActionButtonContentDescription(int i2) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        getContext().getString(i2);
        throw null;
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        throw null;
    }

    public void setInitialActivityCount(int i2) {
        this.f925h = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f923f = onDismissListener;
    }

    @RestrictTo
    public void setProvider(ActionProvider actionProvider) {
        this.f920a = actionProvider;
    }
}
