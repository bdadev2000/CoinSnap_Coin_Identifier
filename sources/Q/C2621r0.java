package q;

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
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: q.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2621r0 extends ListView {
    public final Rect b;

    /* renamed from: c, reason: collision with root package name */
    public int f22711c;

    /* renamed from: d, reason: collision with root package name */
    public int f22712d;

    /* renamed from: f, reason: collision with root package name */
    public int f22713f;

    /* renamed from: g, reason: collision with root package name */
    public int f22714g;

    /* renamed from: h, reason: collision with root package name */
    public int f22715h;

    /* renamed from: i, reason: collision with root package name */
    public C2618p0 f22716i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22717j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f22718k;
    public boolean l;
    public Z.g m;

    /* renamed from: n, reason: collision with root package name */
    public B3.k f22719n;

    public C2621r0(Context context, boolean z8) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.b = new Rect();
        this.f22711c = 0;
        this.f22712d = 0;
        this.f22713f = 0;
        this.f22714g = 0;
        this.f22718k = z8;
        setCacheColorHint(0);
    }

    public final int a(int i9, int i10) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            if (i14 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i9, makeMeasureSpec);
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C2621r0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f22719n != null) {
            return;
        }
        super.drawableStateChanged();
        C2618p0 c2618p0 = this.f22716i;
        if (c2618p0 != null) {
            c2618p0.f22703c = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f22718k && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f22718k && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f22718k && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f22718k && this.f22717j) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f22719n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f22719n == null) {
            B3.k kVar = new B3.k(this, 20);
            this.f22719n = kVar;
            post(kVar);
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
                    if (i9 >= 30 && AbstractC2614n0.f22694d) {
                        try {
                            AbstractC2614n0.f22692a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC2614n0.b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC2614n0.f22693c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e4) {
                            e4.printStackTrace();
                        } catch (InvocationTargetException e9) {
                            e9.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.l && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f22715h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B3.k kVar = this.f22719n;
        if (kVar != null) {
            C2621r0 c2621r0 = (C2621r0) kVar.f293c;
            c2621r0.f22719n = null;
            c2621r0.removeCallbacks(kVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z8) {
        this.f22717j = z8;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C2618p0 c2618p0;
        if (drawable != null) {
            c2618p0 = new C2618p0(drawable);
            c2618p0.f22703c = true;
        } else {
            c2618p0 = null;
        }
        this.f22716i = c2618p0;
        super.setSelector(c2618p0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f22711c = rect.left;
        this.f22712d = rect.top;
        this.f22713f = rect.right;
        this.f22714g = rect.bottom;
    }
}
