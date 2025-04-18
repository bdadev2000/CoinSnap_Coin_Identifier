package com.bytedance.adsdk.ugeno.qsH;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vd.e;

/* loaded from: classes.dex */
public class tN extends ViewGroup {
    int AlY;
    private int BPI;
    private EdgeEffect Bh;
    private int Bn;
    private boolean Cfr;
    private boolean Cqy;
    private final ArrayList<Sg> DSW;
    private vc EH;
    private Scroller GA;
    private float GS;
    private int Ga;
    private wN Hjb;
    private List<AlY> Jc;
    private boolean Ld;
    private int Ne;
    private final Rect NjR;
    private AlY RX;
    private float Sco;
    private VelocityTracker UI;
    private boolean UZM;
    private int VB;
    private int VOe;
    private int Wwa;
    private int YFl;
    private boolean YI;
    private ClassLoader YoT;
    private int ZU;
    private float aIu;
    private boolean bZ;
    private boolean dGX;
    private boolean dXO;

    /* renamed from: dd, reason: collision with root package name */
    private int f10281dd;
    private Parcelable eT;
    private boolean fIu;
    private int hQ;
    private EdgeEffect iY;

    /* renamed from: ib, reason: collision with root package name */
    private List<Object> f10282ib;
    private final Runnable in;
    private int ko;
    private Drawable lG;
    private int lL;
    private float lu;
    private int mB;
    private int mn;

    /* renamed from: nc, reason: collision with root package name */
    private int f10283nc;
    private boolean pDU;
    private int pq;
    private int qO;
    private final Sg qsH;
    private int rkt;
    com.bytedance.adsdk.ugeno.qsH.Sg tN;
    private AlY tQ;
    private float wXo;
    private float zB;
    private int zG;
    private ArrayList<View> zz;
    static final int[] Sg = {R.attr.layout_gravity};
    private static final Comparator<Sg> wN = new Comparator<Sg>() { // from class: com.bytedance.adsdk.ugeno.qsH.tN.1
        @Override // java.util.Comparator
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public int compare(Sg sg2, Sg sg3) {
            return sg2.Sg - sg3.Sg;
        }
    };

    /* renamed from: vc, reason: collision with root package name */
    private static final Interpolator f10280vc = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.qsH.tN.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final qsH Vmj = new qsH();

    /* loaded from: classes.dex */
    public interface AlY {
        void YFl(int i10, float f10, int i11);

        void qsH(int i10);
    }

    /* loaded from: classes.dex */
    public static class DSW extends com.bytedance.adsdk.ugeno.qsH.YFl {
        public static final Parcelable.Creator<DSW> CREATOR = new Parcelable.ClassLoaderCreator<DSW>() { // from class: com.bytedance.adsdk.ugeno.qsH.tN.DSW.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public DSW createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new DSW(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public DSW createFromParcel(Parcel parcel) {
                return new DSW(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public DSW[] newArray(int i10) {
                return new DSW[i10];
            }
        };
        ClassLoader AlY;
        int Sg;
        Parcelable tN;

        public DSW(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return e.g(sb2, this.Sg, "}");
        }

        @Override // com.bytedance.adsdk.ugeno.qsH.YFl, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Sg);
            parcel.writeParcelable(this.tN, i10);
        }

        public DSW(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.Sg = parcel.readInt();
            this.tN = parcel.readParcelable(classLoader);
            this.AlY = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public static class Sg {
        float AlY;
        int Sg;
        Object YFl;
        boolean tN;
        float wN;
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface YFl {
    }

    /* loaded from: classes.dex */
    public static class qsH implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0069tN c0069tN = (C0069tN) view.getLayoutParams();
            C0069tN c0069tN2 = (C0069tN) view2.getLayoutParams();
            boolean z10 = c0069tN.YFl;
            if (z10 != c0069tN2.YFl) {
                if (z10) {
                    return 1;
                }
                return -1;
            }
            return c0069tN.wN - c0069tN2.wN;
        }
    }

    /* loaded from: classes.dex */
    public class vc extends DataSetObserver {
        public vc() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            tN.this.Sg();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            tN.this.Sg();
        }
    }

    /* loaded from: classes.dex */
    public interface wN {
        void YFl(View view, float f10);
    }

    public tN(Context context) {
        super(context);
        this.DSW = new ArrayList<>();
        this.qsH = new Sg();
        this.NjR = new Rect();
        this.f10283nc = -1;
        this.eT = null;
        this.YoT = null;
        this.aIu = -3.4028235E38f;
        this.wXo = Float.MAX_VALUE;
        this.Ga = 1;
        this.mB = -1;
        this.dGX = true;
        this.Ld = false;
        this.in = new Runnable() { // from class: com.bytedance.adsdk.ugeno.qsH.tN.3
            @Override // java.lang.Runnable
            public void run() {
                tN.this.setScrollState(0);
                tN.this.tN();
            }
        };
        this.Bn = 0;
        YFl();
    }

    private boolean AlY(int i10) {
        if (this.DSW.size() == 0) {
            if (this.dGX) {
                return false;
            }
            this.Cqy = false;
            YFl(0, 0.0f, 0);
            if (this.Cqy) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        Sg NjR = NjR();
        int clientWidth = getClientWidth();
        int i11 = this.rkt;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = NjR.Sg;
        float f11 = ((i10 / f10) - NjR.wN) / (NjR.AlY + (i11 / f10));
        this.Cqy = false;
        YFl(i13, f11, (int) (i12 * f11));
        if (this.Cqy) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void DSW() {
        if (this.lL != 0) {
            ArrayList<View> arrayList = this.zz;
            if (arrayList == null) {
                this.zz = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.zz.add(getChildAt(i10));
            }
            Collections.sort(this.zz, Vmj);
        }
    }

    private Sg NjR() {
        float f10;
        float f11;
        int i10;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        if (clientWidth > 0) {
            f10 = getScrollX() / clientWidth;
        } else {
            f10 = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = this.rkt / clientWidth;
        } else {
            f11 = 0.0f;
        }
        int i11 = 0;
        boolean z10 = true;
        Sg sg2 = null;
        int i12 = -1;
        float f13 = 0.0f;
        while (i11 < this.DSW.size()) {
            Sg sg3 = this.DSW.get(i11);
            if (!z10 && sg3.Sg != (i10 = i12 + 1)) {
                sg3 = this.qsH;
                sg3.wN = f12 + f13 + f11;
                sg3.Sg = i10;
                sg3.AlY = this.tN.YFl(i10);
                i11--;
            }
            Sg sg4 = sg3;
            f12 = sg4.wN;
            float f14 = sg4.AlY + f12 + f11;
            if (!z10 && f10 < f12) {
                return sg2;
            }
            if (f10 >= f14 && i11 != this.DSW.size() - 1) {
                int i13 = sg4.Sg;
                float f15 = sg4.AlY;
                i11++;
                z10 = false;
                i12 = i13;
                f13 = f15;
                sg2 = sg4;
            } else {
                return sg4;
            }
        }
        return sg2;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void nc() {
        this.dXO = false;
        this.Cfr = false;
        VelocityTracker velocityTracker = this.UI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.UI = null;
        }
    }

    private boolean qsH() {
        this.mB = -1;
        nc();
        this.iY.onRelease();
        this.Bh.onRelease();
        if (!this.iY.isFinished() && !this.Bh.isFinished()) {
            return false;
        }
        return true;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.UZM != z10) {
            this.UZM = z10;
        }
    }

    private void vc() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0069tN) getChildAt(i10).getLayoutParams()).YFl) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void wN(int i10) {
        AlY alY = this.RX;
        if (alY != null) {
            alY.qsH(i10);
        }
        List<AlY> list = this.Jc;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                AlY alY2 = this.Jc.get(i11);
                if (alY2 != null) {
                    alY2.qsH(i10);
                }
            }
        }
        AlY alY3 = this.tQ;
        if (alY3 != null) {
            alY3.qsH(i10);
        }
    }

    public void Sg() {
        int YFl2 = this.tN.YFl();
        this.YFl = YFl2;
        boolean z10 = this.DSW.size() < (this.Ga * 2) + 1 && this.DSW.size() < YFl2;
        int i10 = this.AlY;
        int i11 = 0;
        while (i11 < this.DSW.size()) {
            Sg sg2 = this.DSW.get(i11);
            int YFl3 = this.tN.YFl(sg2.YFl);
            if (YFl3 != -1) {
                if (YFl3 == -2) {
                    this.DSW.remove(i11);
                    i11--;
                    this.tN.YFl((ViewGroup) this, sg2.Sg, sg2.YFl);
                    int i12 = this.AlY;
                    if (i12 == sg2.Sg) {
                        i10 = Math.max(0, Math.min(i12, YFl2 - 1));
                    }
                } else {
                    int i13 = sg2.Sg;
                    if (i13 != YFl3) {
                        if (i13 == this.AlY) {
                            i10 = YFl3;
                        }
                        sg2.Sg = YFl3;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        Collections.sort(this.DSW, wN);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                C0069tN c0069tN = (C0069tN) getChildAt(i14).getLayoutParams();
                if (!c0069tN.YFl) {
                    c0069tN.tN = 0.0f;
                }
            }
            YFl(i10, false, true);
            requestLayout();
        }
    }

    public void YFl() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.GA = new Scroller(context, f10280vc);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.mn = viewConfiguration.getScaledPagingTouchSlop();
        this.ZU = (int) (400.0f * f10);
        this.BPI = viewConfiguration.getScaledMaximumFlingVelocity();
        this.iY = new EdgeEffect(context);
        this.Bh = new EdgeEffect(context);
        this.zG = (int) (25.0f * f10);
        this.ko = (int) (2.0f * f10);
        this.hQ = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        Sg YFl2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (YFl2 = YFl(childAt)) != null && YFl2.Sg == this.AlY) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        Sg YFl2;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (YFl2 = YFl(childAt)) != null && YFl2.Sg == this.AlY) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0069tN c0069tN = (C0069tN) layoutParams;
        boolean tN = c0069tN.YFl | tN(view);
        c0069tN.YFl = tN;
        if (this.bZ) {
            if (!tN) {
                c0069tN.AlY = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.tN == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.aIu))) {
                return false;
            }
            return true;
        }
        if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.wXo))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0069tN) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.pDU = true;
        if (!this.GA.isFinished() && this.GA.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.GA.getCurrX();
            int currY = this.GA.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!AlY(currX)) {
                    this.GA.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        YFl(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || YFl(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Sg YFl2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (YFl2 = YFl(childAt)) != null && YFl2.Sg == this.AlY && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.qsH.Sg sg2;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (sg2 = this.tN) == null || sg2.YFl() <= 1)) {
            this.iY.finish();
            this.Bh.finish();
        } else {
            if (!this.iY.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.aIu * width);
                this.iY.setSize(height, width);
                z10 = false | this.iY.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.Bh.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.wXo + 1.0f)) * width2);
                this.Bh.setSize(height2, width2);
                z10 |= this.Bh.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.lG;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0069tN();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.qsH.Sg getAdapter() {
        return this.tN;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.lL == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0069tN) this.zz.get(i11).getLayoutParams()).f10284vc;
    }

    public int getCurrentItem() {
        return this.AlY;
    }

    public int getOffscreenPageLimit() {
        return this.Ga;
    }

    public int getPageMargin() {
        return this.rkt;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.dGX = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.in);
        Scroller scroller = this.GA;
        if (scroller != null && !scroller.isFinished()) {
            this.GA.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.rkt > 0 && this.lG != null && this.DSW.size() > 0 && this.tN != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f12 = this.rkt / width;
            int i11 = 0;
            Sg sg2 = this.DSW.get(0);
            float f13 = sg2.wN;
            int size = this.DSW.size();
            int i12 = sg2.Sg;
            int i13 = this.DSW.get(size - 1).Sg;
            while (i12 < i13) {
                while (true) {
                    i10 = sg2.Sg;
                    if (i12 <= i10 || i11 >= size) {
                        break;
                    }
                    i11++;
                    sg2 = this.DSW.get(i11);
                }
                if (i12 == i10) {
                    float f14 = sg2.wN;
                    float f15 = sg2.AlY;
                    f10 = (f14 + f15) * width;
                    f13 = f14 + f15 + f12;
                } else {
                    float YFl2 = this.tN.YFl(i12);
                    f10 = (f13 + YFl2) * width;
                    f13 = YFl2 + f12 + f13;
                }
                if (this.rkt + f10 > scrollX) {
                    f11 = f12;
                    this.lG.setBounds(Math.round(f10), this.Wwa, Math.round(this.rkt + f10), this.qO);
                    this.lG.draw(canvas);
                } else {
                    f11 = f12;
                }
                if (f10 <= scrollX + r2) {
                    i12++;
                    f12 = f11;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        float f10;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.dXO) {
                    return true;
                }
                if (this.Cfr) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        YFl(motionEvent);
                    }
                } else {
                    int i10 = this.mB;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.zB;
                        float abs = Math.abs(f11);
                        float y4 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y4 - this.lu);
                        if (f11 != 0.0f && !YFl(this.zB, f11) && YFl(this, false, (int) f11, (int) x10, (int) y4)) {
                            this.zB = x10;
                            this.Sco = y4;
                            this.Cfr = true;
                            return false;
                        }
                        int i11 = this.mn;
                        if (abs > i11 && abs * 0.5f > abs2) {
                            this.dXO = true;
                            tN(true);
                            setScrollState(1);
                            float f12 = this.GS;
                            float f13 = this.mn;
                            if (f11 > 0.0f) {
                                f10 = f12 + f13;
                            } else {
                                f10 = f12 - f13;
                            }
                            this.zB = f10;
                            this.Sco = y4;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i11) {
                            this.Cfr = true;
                        }
                        if (this.dXO && Sg(x10)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.GS = x11;
                this.zB = x11;
                float y10 = motionEvent.getY();
                this.lu = y10;
                this.Sco = y10;
                this.mB = motionEvent.getPointerId(0);
                this.Cfr = false;
                this.pDU = true;
                this.GA.computeScrollOffset();
                if (this.Bn == 2 && Math.abs(this.GA.getFinalX() - this.GA.getCurrX()) > this.ko) {
                    this.GA.abortAnimation();
                    this.YI = false;
                    tN();
                    this.dXO = true;
                    tN(true);
                    setScrollState(1);
                } else {
                    YFl(false);
                    this.dXO = false;
                }
            }
            if (this.UI == null) {
                this.UI = VelocityTracker.obtain();
            }
            this.UI.addMovement(motionEvent);
            return this.dXO;
        }
        qsH();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.qsH.tN.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C0069tN c0069tN;
        C0069tN c0069tN2;
        boolean z10;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.pq = Math.min(measuredWidth / 10, this.hQ);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0069tN2 = (C0069tN) childAt.getLayoutParams()) != null && c0069tN2.YFl) {
                int i15 = c0069tN2.Sg;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 != 48 && i17 != 80) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i16 != 3 && i16 != 5) {
                    z11 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else if (z11) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0069tN2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0069tN2).height;
                if (i20 != -2) {
                    if (i20 == -1) {
                        i20 = measuredHeight;
                    }
                } else {
                    i20 = measuredHeight;
                    i14 = i12;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.Ne = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.VOe = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.bZ = true;
        tN();
        this.bZ = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0069tN = (C0069tN) childAt2.getLayoutParams()) == null || !c0069tN.YFl)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0069tN.tN), 1073741824), this.VOe);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        Sg YFl2;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (YFl2 = YFl(childAt)) != null && YFl2.Sg == this.AlY && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DSW)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DSW dsw = (DSW) parcelable;
        super.onRestoreInstanceState(dsw.YFl());
        if (this.tN != null) {
            YFl(dsw.Sg, false, true);
            return;
        }
        this.f10283nc = dsw.Sg;
        this.eT = dsw.tN;
        this.YoT = dsw.AlY;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        DSW dsw = new DSW(super.onSaveInstanceState());
        dsw.Sg = this.AlY;
        com.bytedance.adsdk.ugeno.qsH.Sg sg2 = this.tN;
        if (sg2 != null) {
            dsw.tN = sg2.Sg();
        }
        return dsw;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.rkt;
            YFl(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.qsH.Sg sg2;
        int findPointerIndex;
        float f10;
        if (this.fIu) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (sg2 = this.tN) == null || sg2.YFl() == 0) {
            return false;
        }
        if (this.UI == null) {
            this.UI = VelocityTracker.obtain();
        }
        this.UI.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                YFl(motionEvent);
                                int findPointerIndex2 = motionEvent.findPointerIndex(this.mB);
                                if (findPointerIndex2 != -1) {
                                    this.zB = motionEvent.getX(findPointerIndex2);
                                }
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex != -1) {
                                this.zB = motionEvent.getX(actionIndex);
                                this.mB = motionEvent.getPointerId(actionIndex);
                            }
                        }
                    } else if (this.dXO) {
                        YFl(this.AlY, true, 0, false);
                        z10 = qsH();
                    }
                } else {
                    if (!this.dXO) {
                        int findPointerIndex3 = motionEvent.findPointerIndex(this.mB);
                        if (findPointerIndex3 == -1) {
                            z10 = qsH();
                        } else {
                            float x10 = motionEvent.getX(findPointerIndex3);
                            float abs = Math.abs(x10 - this.zB);
                            float y4 = motionEvent.getY(findPointerIndex3);
                            float abs2 = Math.abs(y4 - this.Sco);
                            if (abs > this.mn && abs > abs2) {
                                this.dXO = true;
                                tN(true);
                                float f11 = this.GS;
                                if (x10 - f11 > 0.0f) {
                                    f10 = f11 + this.mn;
                                } else {
                                    f10 = f11 - this.mn;
                                }
                                this.zB = f10;
                                this.Sco = y4;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.dXO && (findPointerIndex = motionEvent.findPointerIndex(this.mB)) != -1) {
                        z10 = false | Sg(motionEvent.getX(findPointerIndex));
                    }
                }
            } else if (this.dXO) {
                VelocityTracker velocityTracker = this.UI;
                velocityTracker.computeCurrentVelocity(1000, this.BPI);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mB);
                this.YI = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                Sg NjR = NjR();
                float f12 = clientWidth;
                int i10 = NjR.Sg;
                float f13 = ((scrollX / f12) - NjR.wN) / (NjR.AlY + (this.rkt / f12));
                int findPointerIndex4 = motionEvent.findPointerIndex(this.mB);
                if (findPointerIndex4 != -1) {
                    YFl(YFl(i10, f13, xVelocity, (int) (motionEvent.getX(findPointerIndex4) - this.GS)), true, true, xVelocity);
                    z10 = qsH();
                }
            }
        } else {
            this.GA.abortAnimation();
            this.YI = false;
            tN();
            float x11 = motionEvent.getX();
            this.GS = x11;
            this.zB = x11;
            float y10 = motionEvent.getY();
            this.lu = y10;
            this.Sco = y10;
            this.mB = motionEvent.getPointerId(0);
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.bZ) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.qsH.Sg sg2) {
        com.bytedance.adsdk.ugeno.qsH.Sg sg3 = this.tN;
        if (sg3 != null) {
            sg3.YFl((DataSetObserver) null);
            for (int i10 = 0; i10 < this.DSW.size(); i10++) {
                Sg sg4 = this.DSW.get(i10);
                this.tN.YFl((ViewGroup) this, sg4.Sg, sg4.YFl);
            }
            this.DSW.clear();
            vc();
            this.AlY = 0;
            scrollTo(0, 0);
        }
        this.tN = sg2;
        this.YFl = 0;
        if (sg2 != null) {
            if (this.EH == null) {
                this.EH = new vc();
            }
            this.tN.YFl((DataSetObserver) this.EH);
            this.YI = false;
            boolean z10 = this.dGX;
            this.dGX = true;
            this.YFl = this.tN.YFl();
            int i11 = this.f10283nc;
            if (i11 >= 0) {
                YFl(i11, false, true);
                this.f10283nc = -1;
                this.eT = null;
                this.YoT = null;
            } else if (!z10) {
                tN();
            } else {
                requestLayout();
            }
        }
        List<Object> list = this.f10282ib;
        if (list != null && !list.isEmpty()) {
            int size = this.f10282ib.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f10282ib.get(i12);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.YI = false;
        YFl(i10, !this.dGX, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.Ga) {
            this.Ga = i10;
            tN();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(AlY alY) {
        this.RX = alY;
    }

    public void setPageMargin(int i10) {
        int i11 = this.rkt;
        this.rkt = i10;
        int width = getWidth();
        YFl(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.lG = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        boolean z10;
        if (this.Bn == i10) {
            return;
        }
        this.Bn = i10;
        if (this.Hjb != null) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Sg(z10);
        }
        vc(i10);
    }

    public void setScroller(Scroller scroller) {
        this.GA = scroller;
    }

    public void tN() {
        YFl(this.AlY);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.lG;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.qsH.tN$tN, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0069tN extends ViewGroup.LayoutParams {
        boolean AlY;
        public int Sg;
        public boolean YFl;
        float tN;

        /* renamed from: vc, reason: collision with root package name */
        int f10284vc;
        int wN;

        public C0069tN() {
            super(-1, -1);
            this.tN = 0.0f;
        }

        public C0069tN(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.tN = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tN.Sg);
            this.Sg = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    private static boolean tN(View view) {
        return view.getClass().getAnnotation(YFl.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0069tN(getContext(), attributeSet);
    }

    private void tN(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void vc(int i10) {
        List<AlY> list = this.Jc;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.Jc.get(i11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r7 != 2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean tN(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L66
        Lb:
            if (r0 == 0) goto L66
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L66:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb1
            if (r3 == r0) goto Lb1
            if (r7 != r5) goto L96
            android.graphics.Rect r1 = r6.NjR
            android.graphics.Rect r1 = r6.YFl(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.NjR
            android.graphics.Rect r2 = r6.YFl(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L91
            if (r1 < r2) goto L91
            boolean r2 = r6.AlY()
            goto Lc4
        L91:
            boolean r2 = r3.requestFocus()
            goto Lc4
        L96:
            if (r7 != r4) goto Lc4
            android.graphics.Rect r1 = r6.NjR
            android.graphics.Rect r1 = r6.YFl(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.NjR
            android.graphics.Rect r2 = r6.YFl(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lac
            if (r1 <= r2) goto Lbb
        Lac:
            boolean r2 = r3.requestFocus()
            goto Lc4
        Lb1:
            if (r7 == r5) goto Lc0
            if (r7 != r1) goto Lb6
            goto Lc0
        Lb6:
            if (r7 == r4) goto Lbb
            r0 = 2
            if (r7 != r0) goto Lc4
        Lbb:
            boolean r2 = r6.wN()
            goto Lc4
        Lc0:
            boolean r2 = r6.AlY()
        Lc4:
            if (r2 == 0) goto Lcd
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.qsH.tN.tN(int):boolean");
    }

    public boolean wN() {
        com.bytedance.adsdk.ugeno.qsH.Sg sg2 = this.tN;
        if (sg2 == null || this.AlY >= sg2.YFl() - 1) {
            return false;
        }
        YFl(this.AlY + 1, true);
        return true;
    }

    public boolean AlY() {
        int i10 = this.AlY;
        if (i10 <= 0) {
            return false;
        }
        YFl(i10 - 1, true);
        return true;
    }

    public void YFl(int i10, boolean z10) {
        this.YI = false;
        YFl(i10, z10, false);
    }

    public void YFl(int i10, boolean z10, boolean z11) {
        YFl(i10, z10, z11, 0);
    }

    public void YFl(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.qsH.Sg sg2 = this.tN;
        if (sg2 != null && sg2.YFl() > 0) {
            if (!z11 && this.AlY == i10 && this.DSW.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.tN.YFl()) {
                i10 = this.tN.YFl() - 1;
            }
            int i12 = this.Ga;
            int i13 = this.AlY;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.DSW.size(); i14++) {
                    this.DSW.get(i14).tN = true;
                }
            }
            boolean z12 = this.AlY != i10;
            if (this.dGX) {
                this.AlY = i10;
                if (z12) {
                    wN(i10);
                }
                requestLayout();
                return;
            }
            YFl(i10);
            YFl(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public Sg Sg(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return YFl(view);
            }
        }
    }

    public Sg Sg(int i10) {
        for (int i11 = 0; i11 < this.DSW.size(); i11++) {
            Sg sg2 = this.DSW.get(i11);
            if (sg2.Sg == i10) {
                return sg2;
            }
        }
        return null;
    }

    private void Sg(int i10, float f10, int i11) {
        AlY alY = this.RX;
        if (alY != null) {
            alY.YFl(i10, f10, i11);
        }
        List<AlY> list = this.Jc;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                AlY alY2 = this.Jc.get(i12);
                if (alY2 != null) {
                    alY2.YFl(i10, f10, i11);
                }
            }
        }
        AlY alY3 = this.tQ;
        if (alY3 != null) {
            alY3.YFl(i10, f10, i11);
        }
    }

    private void YFl(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        Sg Sg2 = Sg(i10);
        if (Sg2 != null) {
            i12 = (int) (Math.max(this.aIu, Math.min(Sg2.wN, this.wXo)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            YFl(i12, 0, i11);
            if (z11) {
                wN(i10);
                return;
            }
            return;
        }
        if (z11) {
            wN(i10);
        }
        YFl(false);
        scrollTo(i12, 0);
        AlY(i12);
    }

    private void Sg(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f10281dd : 0, null);
        }
    }

    private boolean Sg(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.zB - f10;
        this.zB = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.aIu * clientWidth;
        float f13 = this.wXo * clientWidth;
        boolean z12 = false;
        Sg sg2 = this.DSW.get(0);
        ArrayList<Sg> arrayList = this.DSW;
        Sg sg3 = arrayList.get(arrayList.size() - 1);
        if (sg2.Sg != 0) {
            f12 = sg2.wN * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (sg3.Sg != this.tN.YFl() - 1) {
            f13 = sg3.wN * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.iY.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.Bh.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.zB = (scrollX - i10) + this.zB;
        scrollTo(i10, getScrollY());
        AlY(i10);
        return z12;
    }

    public void YFl(AlY alY) {
        if (this.Jc == null) {
            this.Jc = new ArrayList();
        }
        this.Jc.add(alY);
    }

    public void YFl(boolean z10, wN wNVar) {
        YFl(z10, wNVar, 2);
    }

    public void YFl(boolean z10, wN wNVar, int i10) {
        boolean z11 = wNVar != null;
        boolean z12 = z11 != (this.Hjb != null);
        this.Hjb = wNVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.lL = z10 ? 2 : 1;
            this.f10281dd = i10;
        } else {
            this.lL = 0;
        }
        if (z12) {
            tN();
        }
    }

    public float YFl(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public void YFl(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.GA;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.pDU ? this.GA.getCurrX() : this.GA.getStartX();
            this.GA.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            YFl(false);
            tN();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float YFl2 = (YFl(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11) + f11;
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(YFl2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i14) / ((this.tN.YFl(this.AlY) * f10) + this.rkt)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.pDU = false;
        this.GA.startScroll(i13, scrollY, i14, i15, min);
        postInvalidateOnAnimation();
    }

    public Sg YFl(int i10, int i11) {
        Sg sg2 = new Sg();
        sg2.Sg = i10;
        sg2.YFl = this.tN.YFl((ViewGroup) this, i10);
        sg2.AlY = this.tN.YFl(i10);
        if (i11 >= 0 && i11 < this.DSW.size()) {
            this.DSW.add(i11, sg2);
        } else {
            this.DSW.add(sg2);
        }
        return sg2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r5 == r6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(int r15) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.qsH.tN.YFl(int):void");
    }

    private void YFl(Sg sg2, int i10, Sg sg3) {
        int i11;
        int i12;
        Sg sg4;
        Sg sg5;
        int YFl2 = this.tN.YFl();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.rkt / clientWidth : 0.0f;
        if (sg3 != null) {
            int i13 = sg3.Sg;
            int i14 = sg2.Sg;
            if (i13 < i14) {
                float f11 = sg3.wN + sg3.AlY + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= sg2.Sg && i16 < this.DSW.size()) {
                    Sg sg6 = this.DSW.get(i16);
                    while (true) {
                        sg5 = sg6;
                        if (i15 <= sg5.Sg || i16 >= this.DSW.size() - 1) {
                            break;
                        }
                        i16++;
                        sg6 = this.DSW.get(i16);
                    }
                    while (i15 < sg5.Sg) {
                        f11 += this.tN.YFl(i15) + f10;
                        i15++;
                    }
                    sg5.wN = f11;
                    f11 += sg5.AlY + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.DSW.size() - 1;
                float f12 = sg3.wN;
                while (true) {
                    i13--;
                    if (i13 < sg2.Sg || size < 0) {
                        break;
                    }
                    Sg sg7 = this.DSW.get(size);
                    while (true) {
                        sg4 = sg7;
                        if (i13 >= sg4.Sg || size <= 0) {
                            break;
                        }
                        size--;
                        sg7 = this.DSW.get(size);
                    }
                    while (i13 > sg4.Sg) {
                        f12 -= this.tN.YFl(i13) + f10;
                        i13--;
                    }
                    f12 -= sg4.AlY + f10;
                    sg4.wN = f12;
                }
            }
        }
        int size2 = this.DSW.size();
        float f13 = sg2.wN;
        int i17 = sg2.Sg;
        int i18 = i17 - 1;
        this.aIu = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = YFl2 - 1;
        this.wXo = i17 == i19 ? (sg2.AlY + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            Sg sg8 = this.DSW.get(i20);
            while (true) {
                i12 = sg8.Sg;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.tN.YFl(i18) + f10;
                i18--;
            }
            f13 -= sg8.AlY + f10;
            sg8.wN = f13;
            if (i12 == 0) {
                this.aIu = f13;
            }
            i20--;
            i18--;
        }
        float f14 = sg2.wN + sg2.AlY + f10;
        int i21 = sg2.Sg + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            Sg sg9 = this.DSW.get(i22);
            while (true) {
                i11 = sg9.Sg;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.tN.YFl(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.wXo = (sg9.AlY + f14) - 1.0f;
            }
            sg9.wN = f14;
            f14 += sg9.AlY + f10;
            i22++;
            i21++;
        }
        this.Ld = false;
    }

    public Sg YFl(View view) {
        for (int i10 = 0; i10 < this.DSW.size(); i10++) {
            Sg sg2 = this.DSW.get(i10);
            if (this.tN.YFl(view, sg2.YFl)) {
                return sg2;
            }
        }
        return null;
    }

    private void YFl(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.DSW.isEmpty()) {
            if (!this.GA.isFinished()) {
                this.GA.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        Sg Sg2 = Sg(this.AlY);
        int min = (int) ((Sg2 != null ? Math.min(Sg2.wN, this.wXo) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            YFl(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.VB
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.qsH.tN$tN r9 = (com.bytedance.adsdk.ugeno.qsH.tN.C0069tN) r9
            boolean r10 = r9.YFl
            if (r10 == 0) goto L67
            int r9 = r9.Sg
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            r12.Sg(r13, r14, r15)
            com.bytedance.adsdk.ugeno.qsH.tN$wN r13 = r12.Hjb
            if (r13 == 0) goto L9d
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L79:
            if (r1 >= r14) goto L9d
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.qsH.tN$tN r0 = (com.bytedance.adsdk.ugeno.qsH.tN.C0069tN) r0
            boolean r0 = r0.YFl
            if (r0 != 0) goto L9a
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.qsH.tN$wN r3 = r12.Hjb
            r3.YFl(r15, r0)
        L9a:
            int r1 = r1 + 1
            goto L79
        L9d:
            r12.Cqy = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.qsH.tN.YFl(int, float, int):void");
    }

    private void YFl(boolean z10) {
        boolean z11 = this.Bn == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.GA.isFinished()) {
                this.GA.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.GA.getCurrX();
                int currY = this.GA.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        AlY(currX);
                    }
                }
            }
        }
        this.YI = false;
        for (int i10 = 0; i10 < this.DSW.size(); i10++) {
            Sg sg2 = this.DSW.get(i10);
            if (sg2.tN) {
                sg2.tN = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.in);
            } else {
                this.in.run();
            }
        }
    }

    private boolean YFl(float f10, float f11) {
        if (f10 >= this.pq || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.pq)) && f11 < 0.0f;
        }
        return true;
    }

    private int YFl(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.zG || Math.abs(i11) <= this.ZU) {
            i10 += (int) (f10 + (i10 >= this.AlY ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.DSW.size() <= 0) {
            return i10;
        }
        return Math.max(this.DSW.get(0).Sg, Math.min(i10, this.DSW.get(r4.size() - 1).Sg));
    }

    private void YFl(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mB) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.zB = motionEvent.getX(i10);
            this.mB = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.UI;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean YFl(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && YFl(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean YFl(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return AlY();
                }
                return tN(17);
            }
            if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return wN();
                }
                return tN(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return tN(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return tN(1);
                }
            }
        }
        return false;
    }

    private Rect YFl(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
