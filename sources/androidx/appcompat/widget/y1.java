package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.plantcare.ai.identifier.plantid.R;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class y1 extends ListView {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1087b;

    /* renamed from: c, reason: collision with root package name */
    public int f1088c;

    /* renamed from: d, reason: collision with root package name */
    public int f1089d;

    /* renamed from: f, reason: collision with root package name */
    public int f1090f;

    /* renamed from: g, reason: collision with root package name */
    public int f1091g;

    /* renamed from: h, reason: collision with root package name */
    public int f1092h;

    /* renamed from: i, reason: collision with root package name */
    public w1 f1093i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1094j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1095k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1096l;

    /* renamed from: m, reason: collision with root package name */
    public t0.g f1097m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.activity.i f1098n;

    public y1(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1087b = new Rect();
        this.f1088c = 0;
        this.f1089d = 0;
        this.f1090f = 0;
        this.f1091g = 0;
        this.f1095k = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            if (i15 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0145 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1087b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1098n != null) {
            return;
        }
        super.drawableStateChanged();
        w1 w1Var = this.f1093i;
        if (w1Var != null) {
            w1Var.f1072c = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f1096l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1095k || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1095k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1095k || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1095k && this.f1094j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1098n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 2;
        if (actionMasked == 10 && this.f1098n == null) {
            androidx.activity.i iVar = new androidx.activity.i(this, i11);
            this.f1098n = iVar;
            post(iVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 >= 30 && u1.f1049d) {
                        try {
                            u1.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            u1.f1047b.invoke(this, Integer.valueOf(pointToPosition));
                            u1.f1048c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1096l && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1092h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.i iVar = this.f1098n;
        if (iVar != null) {
            y1 y1Var = (y1) iVar.f574c;
            y1Var.f1098n = null;
            y1Var.removeCallbacks(iVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1094j = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        w1 w1Var;
        if (drawable != null) {
            w1Var = new w1(drawable);
        } else {
            w1Var = null;
        }
        this.f1093i = w1Var;
        super.setSelector(w1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1088c = rect.left;
        this.f1089d = rect.top;
        this.f1090f = rect.right;
        this.f1091g = rect.bottom;
    }
}
