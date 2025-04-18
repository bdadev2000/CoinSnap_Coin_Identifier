package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.widget.PopupWindowCompat;
import com.cooldev.gba.emulator.gameboy.R;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {
    public static final Method B;
    public static final Method C;
    public final PopupWindow A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1137a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f1138b;

    /* renamed from: c, reason: collision with root package name */
    public DropDownListView f1139c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public int f1140f;

    /* renamed from: g, reason: collision with root package name */
    public int f1141g;

    /* renamed from: h, reason: collision with root package name */
    public int f1142h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1143i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1144j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1145k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1146l;

    /* renamed from: m, reason: collision with root package name */
    public int f1147m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1148n;

    /* renamed from: o, reason: collision with root package name */
    public DataSetObserver f1149o;

    /* renamed from: p, reason: collision with root package name */
    public View f1150p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemClickListener f1151q;

    /* renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f1152r;

    /* renamed from: s, reason: collision with root package name */
    public final ResizePopupRunnable f1153s;

    /* renamed from: t, reason: collision with root package name */
    public final PopupTouchInterceptor f1154t;

    /* renamed from: u, reason: collision with root package name */
    public final PopupScrollListener f1155u;

    /* renamed from: v, reason: collision with root package name */
    public final ListSelectorHider f1156v;
    public final Handler w;
    public final Rect x;

    /* renamed from: y, reason: collision with root package name */
    public Rect f1157y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1158z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final /* bridge */ /* synthetic */ ShowableListMenu b() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api24Impl {
        @DoNotInline
        public static int a(PopupWindow popupWindow, View view, int i2, boolean z2) {
            return popupWindow.getMaxAvailableHeight(view, i2, z2);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api29Impl {
        @DoNotInline
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        public static void b(PopupWindow popupWindow, boolean z2) {
            popupWindow.setIsClippedToScreen(z2);
        }
    }

    /* loaded from: classes.dex */
    public class ListSelectorHider implements Runnable {
        public ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f1139c;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.A.isShowing()) {
                listPopupWindow.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (listPopupWindow.A.getInputMethodMode() == 2 || listPopupWindow.A.getContentView() == null) {
                    return;
                }
                Handler handler = listPopupWindow.w;
                ResizePopupRunnable resizePopupRunnable = listPopupWindow.f1153s;
                handler.removeCallbacks(resizePopupRunnable);
                resizePopupRunnable.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public class PopupTouchInterceptor implements View.OnTouchListener {
        public PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (action == 0 && (popupWindow = listPopupWindow.A) != null && popupWindow.isShowing() && x >= 0 && x < listPopupWindow.A.getWidth() && y2 >= 0 && y2 < listPopupWindow.A.getHeight()) {
                listPopupWindow.w.postDelayed(listPopupWindow.f1153s, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            listPopupWindow.w.removeCallbacks(listPopupWindow.f1153s);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class ResizePopupRunnable implements Runnable {
        public ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            DropDownListView dropDownListView = listPopupWindow.f1139c;
            if (dropDownListView == null || !dropDownListView.isAttachedToWindow() || listPopupWindow.f1139c.getCount() <= listPopupWindow.f1139c.getChildCount() || listPopupWindow.f1139c.getChildCount() > listPopupWindow.f1148n) {
                return;
            }
            listPopupWindow.A.setInputMethodMode(2);
            listPopupWindow.show();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle, 0);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        return this.A.isShowing();
    }

    public final int b() {
        return this.f1141g;
    }

    public final void d(int i2) {
        this.f1141g = i2;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        PopupWindow popupWindow = this.A;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f1139c = null;
        this.w.removeCallbacks(this.f1153s);
    }

    public final Drawable f() {
        return this.A.getBackground();
    }

    public final void h(int i2) {
        this.f1142h = i2;
        this.f1144j = true;
    }

    public final int k() {
        if (this.f1144j) {
            return this.f1142h;
        }
        return 0;
    }

    public void l(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1149o;
        if (dataSetObserver == null) {
            this.f1149o = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.f1138b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1138b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1149o);
        }
        DropDownListView dropDownListView = this.f1139c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f1138b);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView n() {
        return this.f1139c;
    }

    public DropDownListView o(Context context, boolean z2) {
        return new DropDownListView(context, z2);
    }

    public final void p(int i2) {
        Drawable background = this.A.getBackground();
        if (background == null) {
            this.f1140f = i2;
            return;
        }
        Rect rect = this.x;
        background.getPadding(rect);
        this.f1140f = rect.left + rect.right + i2;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        int i2;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.f1139c;
        PopupWindow popupWindow = this.A;
        Context context = this.f1137a;
        if (dropDownListView2 == null) {
            DropDownListView o2 = o(context, !this.f1158z);
            this.f1139c = o2;
            o2.setAdapter(this.f1138b);
            this.f1139c.setOnItemClickListener(this.f1151q);
            this.f1139c.setFocusable(true);
            this.f1139c.setFocusableInTouchMode(true);
            this.f1139c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view, int i3, long j2) {
                    DropDownListView dropDownListView3;
                    if (i3 == -1 || (dropDownListView3 = ListPopupWindow.this.f1139c) == null) {
                        return;
                    }
                    dropDownListView3.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.f1139c.setOnScrollListener(this.f1155u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1152r;
            if (onItemSelectedListener != null) {
                this.f1139c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f1139c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.x;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f1144j) {
                this.f1142h = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int a2 = Api24Impl.a(popupWindow, this.f1150p, this.f1142h, popupWindow.getInputMethodMode() == 2);
        int i4 = this.d;
        if (i4 == -1) {
            paddingBottom = a2 + i2;
        } else {
            int i5 = this.f1140f;
            int a3 = this.f1139c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f1139c.getPaddingBottom() + this.f1139c.getPaddingTop() + i2 : 0);
        }
        boolean z2 = this.A.getInputMethodMode() == 2;
        PopupWindowCompat.b(popupWindow, this.f1143i);
        if (popupWindow.isShowing()) {
            if (this.f1150p.isAttachedToWindow()) {
                int i6 = this.f1140f;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.f1150p.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.f1140f == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f1140f == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view = this.f1150p;
                int i7 = this.f1141g;
                int i8 = this.f1142h;
                if (i6 < 0) {
                    i6 = -1;
                }
                popupWindow.update(view, i7, i8, i6, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i9 = this.f1140f;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = this.f1150p.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        popupWindow.setWidth(i9);
        popupWindow.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = B;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Api29Impl.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f1154t);
        if (this.f1146l) {
            PopupWindowCompat.a(popupWindow, this.f1145k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = C;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.f1157y);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            Api29Impl.a(popupWindow, this.f1157y);
        }
        popupWindow.showAsDropDown(this.f1150p, this.f1141g, this.f1142h, this.f1147m);
        this.f1139c.setSelection(-1);
        if ((!this.f1158z || this.f1139c.isInTouchMode()) && (dropDownListView = this.f1139c) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.f1158z) {
            return;
        }
        this.w.post(this.f1156v);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.f1140f = -2;
        this.f1143i = 1002;
        this.f1147m = 0;
        this.f1148n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1153s = new ResizePopupRunnable();
        this.f1154t = new PopupTouchInterceptor();
        this.f1155u = new PopupScrollListener();
        this.f1156v = new ListSelectorHider();
        this.x = new Rect();
        this.f1137a = context;
        this.w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.f324p, i2, i3);
        this.f1141g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1142h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1144j = true;
        }
        obtainStyledAttributes.recycle();
        PopupWindow popupWindow = new PopupWindow(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.f328t, i2, i3);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes2);
        if (obtainStyledAttributes2.hasValue(2)) {
            PopupWindowCompat.a(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable(tintTypedArray.b(0));
        tintTypedArray.f();
        this.A = popupWindow;
        popupWindow.setInputMethodMode(1);
    }
}
