package com.duylt.lib.wheel_picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.plantcare.ai.identifier.plantid.R;
import d0.h;
import f0.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import u5.a;
import u5.c;
import va.b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0002J\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0002J\u0017\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010&J\u0006\u0010)\u001a\u00020\u001cJ\u0006\u0010*\u001a\u00020\u001cJ\b\u0010+\u001a\u00020\u0002H\u0002J\b\u0010,\u001a\u00020\u0002H\u0002¨\u0006-"}, d2 = {"Lcom/duylt/lib/wheel_picker/WheelPicker;", "Landroid/view/View;", "", "getSuggestedMinimumWidth", "getSuggestedMinimumHeight", "", "getBottomFadingEdgeStrength", "getTopFadingEdgeStrength", "Lu5/b;", "onValueChangeListener", "", "setOnValueChangedListener", "Lu5/a;", "onScrollListener", "setOnScrollListener", "resourceId", "setUnselectedTextColor", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "", "wrap", "setWrapSelectorWheel", "getWrapSelectorWheel", "count", "setWheelItemCount", "colorId", "setSelectedTextColor", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setValue", AppLovinMediationProvider.MAX, "setMaxValue", "getMaxValue", "min", "setMinValue", "minValid", "setMinValidValue", "(Ljava/lang/Integer;)V", "maxValid", "setMaxValidValue", "getMinValue", "getCurrentItem", "getItemHeight", "getGapHeight", "wheel_picker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WheelPicker extends View {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public b F;
    public final boolean G;
    public final float H;
    public int I;

    /* renamed from: b, reason: collision with root package name */
    public final float f10844b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10845c;

    /* renamed from: d, reason: collision with root package name */
    public int f10846d;

    /* renamed from: f, reason: collision with root package name */
    public int f10847f;

    /* renamed from: g, reason: collision with root package name */
    public int f10848g;

    /* renamed from: h, reason: collision with root package name */
    public int f10849h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f10850i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f10851j;

    /* renamed from: k, reason: collision with root package name */
    public int f10852k;

    /* renamed from: l, reason: collision with root package name */
    public int f10853l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f10854m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f10855n;

    /* renamed from: o, reason: collision with root package name */
    public int f10856o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10857p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f10858q;

    /* renamed from: r, reason: collision with root package name */
    public final int f10859r;

    /* renamed from: s, reason: collision with root package name */
    public final OverScroller f10860s;

    /* renamed from: t, reason: collision with root package name */
    public VelocityTracker f10861t;
    public final int u;

    /* renamed from: v, reason: collision with root package name */
    public final int f10862v;

    /* renamed from: w, reason: collision with root package name */
    public final int f10863w;

    /* renamed from: x, reason: collision with root package name */
    public float f10864x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10865y;

    /* renamed from: z, reason: collision with root package name */
    public int f10866z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        Typeface typeface;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10844b = 0.9f;
        this.f10845c = 300;
        Paint paint = new Paint();
        this.f10858q = paint;
        this.A = Integer.MIN_VALUE;
        this.G = true;
        this.H = 0.3f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i10 = obtainStyledAttributes.getInt(11, 3) + 2;
        this.f10846d = i10;
        this.f10852k = (i10 - 1) / 2;
        int i11 = i10 - 2;
        this.f10847f = i11;
        this.f10853l = (i11 - 1) / 2;
        this.f10854m = new ArrayList(this.f10846d);
        this.f10855n = new ArrayList(this.f10846d);
        this.f10848g = obtainStyledAttributes.getInt(4, Integer.MIN_VALUE);
        this.f10849h = obtainStyledAttributes.getInt(2, Integer.MAX_VALUE);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f10850i = Integer.valueOf(obtainStyledAttributes.getInt(3, 0));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.f10851j = Integer.valueOf(obtainStyledAttributes.getInt(5, 0));
        }
        this.f10857p = obtainStyledAttributes.getBoolean(12, false);
        this.H = obtainStyledAttributes.getFloat(7, 0.3f);
        this.f10860s = new OverScroller(context, new DecelerateInterpolator(2.5f));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.f10862v = viewConfiguration.getScaledMaximumFlingVelocity() / 4;
        this.f10863w = viewConfiguration.getScaledMinimumFlingVelocity();
        obtainStyledAttributes.getColor(6, context.getColor(R.color.txt_dark));
        obtainStyledAttributes.getColor(8, context.getColor(R.color.txt_description));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, 80);
        this.f10859r = dimensionPixelSize;
        int i12 = obtainStyledAttributes.getInt(0, 1);
        if (i12 != 0) {
            if (i12 != 1 && i12 == 2) {
                str = "RIGHT";
            } else {
                str = "CENTER";
            }
        } else {
            str = "LEFT";
        }
        this.G = obtainStyledAttributes.getBoolean(1, true);
        int i13 = obtainStyledAttributes.getInt(10, 0);
        paint.setAntiAlias(true);
        paint.setAntiAlias(true);
        paint.setTextSize(dimensionPixelSize);
        paint.setTextAlign(Paint.Align.valueOf(str));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    ThreadLocal threadLocal = q.a;
                    if (context.isRestricted()) {
                        typeface = null;
                    } else {
                        typeface = q.a(context, R.font.nunito_semi_bold, new TypedValue(), 0, null, false, false);
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
        } else {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        obtainStyledAttributes.recycle();
        e();
    }

    public static int a(int i10, int i11, int i12) {
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(View.MeasureSpec.getMode(i12));
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                return size;
            }
            if (i11 != -2 && i11 != -1) {
                i10 = i11;
            }
            return i10;
        }
        if (i11 != -2) {
            if (i11 != -1) {
                return Math.min(i11, size);
            }
            return size;
        }
        return Math.min(i10, size);
    }

    private final int getGapHeight() {
        int itemHeight = getItemHeight();
        Paint.FontMetricsInt fontMetricsInt = this.f10858q.getFontMetricsInt();
        return itemHeight - Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
    }

    private final int getItemHeight() {
        return getHeight() / (this.f10846d - 2);
    }

    public static void h(WheelPicker wheelPicker, sf.b bVar) {
        wheelPicker.F = bVar;
        Intrinsics.checkNotNull(bVar);
        wheelPicker.f10850i = Integer.MAX_VALUE;
        wheelPicker.f10851j = Integer.MIN_VALUE;
        wheelPicker.e();
        wheelPicker.invalidate();
    }

    public final String b(int i10) {
        b bVar = this.F;
        if (bVar != null) {
            Intrinsics.checkNotNull(bVar);
            return bVar.o(i10);
        }
        if (!this.f10857p) {
            if (i10 > this.f10849h || i10 < this.f10848g) {
                return "";
            }
            return String.valueOf(i10);
        }
        return String.valueOf(c(i10));
    }

    public final int c(int i10) {
        int i11 = this.f10849h;
        if (i10 > i11) {
            int i12 = this.f10848g;
            return (((i10 - i11) % ((i11 - i12) + 1)) + i12) - 1;
        }
        int i13 = this.f10848g;
        if (i10 < i13) {
            return (i11 - ((i13 - i10) % ((i11 - i13) + 1))) + 1;
        }
        return i10;
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        OverScroller overScroller = this.f10860s;
        Intrinsics.checkNotNull(overScroller);
        if (overScroller.computeScrollOffset()) {
            Intrinsics.checkNotNull(overScroller);
            int currX = overScroller.getCurrX();
            Intrinsics.checkNotNull(overScroller);
            int currY = overScroller.getCurrY();
            if (this.E == 0) {
                Intrinsics.checkNotNull(overScroller);
                this.E = overScroller.getStartY();
            }
            scrollBy(currX, currY - this.E);
            this.E = currY;
            invalidate();
            return;
        }
        if (!this.f10865y) {
            this.E = 0;
            int i10 = this.A - this.f10866z;
            int abs = Math.abs(i10);
            int i11 = this.C;
            if (abs > i11 / 2) {
                if (i10 > 0) {
                    i11 = -i11;
                }
                i10 += i11;
            }
            int i12 = i10;
            if (i12 != 0) {
                Intrinsics.checkNotNull(overScroller);
                overScroller.startScroll(getScrollX(), getScrollY(), 0, i12, 800);
                postInvalidateOnAnimation();
            }
            if (this.I != 0) {
                this.I = 0;
            }
        }
    }

    public final void d() {
        this.C = getItemHeight();
        Paint.FontMetricsInt fontMetricsInt = this.f10858q.getFontMetricsInt();
        this.D = Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
        this.B = getGapHeight();
        int i10 = this.C;
        int i11 = (((this.D + i10) / 2) + (this.f10853l * i10)) - (i10 * this.f10852k);
        this.A = i11;
        this.f10866z = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f10854m
            r0.clear()
            java.util.ArrayList r0 = r5.f10855n
            r0.clear()
            java.lang.Integer r0 = r5.f10851j
            r1 = 0
            if (r0 == 0) goto L31
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.intValue()
            int r2 = r5.f10848g
            if (r0 >= r2) goto L1b
            goto L31
        L1b:
            java.lang.Integer r0 = r5.f10851j
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.intValue()
            if (r0 > 0) goto L27
            goto L35
        L27:
            java.lang.Integer r0 = r5.f10851j
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.intValue()
            goto L36
        L31:
            int r0 = r5.f10848g
            if (r0 > 0) goto L36
        L35:
            r0 = r1
        L36:
            r5.f10856o = r0
            int r0 = r5.f10846d
        L3a:
            if (r1 >= r0) goto L64
            int r2 = r5.f10856o
            int r3 = r5.f10852k
            int r3 = r1 - r3
            int r3 = r3 + r2
            boolean r2 = r5.f10857p
            if (r2 == 0) goto L4b
            int r3 = r5.c(r3)
        L4b:
            java.util.ArrayList r2 = r5.f10854m
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.add(r4)
            java.util.ArrayList r2 = r5.f10855n
            boolean r3 = r5.f(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L3a
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.duylt.lib.wheel_picker.WheelPicker.e():void");
    }

    public final boolean f(int i10) {
        Integer num = this.f10851j;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            if (i10 < num.intValue()) {
                return false;
            }
        }
        Integer num2 = this.f10850i;
        if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            if (i10 > num2.intValue()) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (this.f10856o == i10) {
            return;
        }
        this.f10856o = i10;
        this.f10854m.clear();
        int i11 = this.f10846d;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = (i12 - this.f10852k) + this.f10856o;
            if (this.f10857p) {
                i13 = c(i13);
            }
            this.f10854m.add(Integer.valueOf(i13));
        }
        invalidate();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return this.f10844b;
    }

    public final String getCurrentItem() {
        return b(this.f10856o);
    }

    public final String getMaxValue() {
        b bVar = this.F;
        if (bVar != null) {
            Intrinsics.checkNotNull(bVar);
            return bVar.o(this.f10849h);
        }
        return String.valueOf(this.f10849h);
    }

    public final String getMinValue() {
        b bVar = this.F;
        if (bVar != null) {
            Intrinsics.checkNotNull(bVar);
            return bVar.o(this.f10848g);
        }
        return String.valueOf(this.f10848g);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int suggestedMinimumWidth = super.getSuggestedMinimumWidth();
        if (this.f10847f > 0) {
            Paint.FontMetricsInt fontMetricsInt = this.f10858q.getFontMetricsInt();
            return Math.max(suggestedMinimumWidth, (fontMetricsInt.descent - fontMetricsInt.ascent) * this.f10847f);
        }
        return suggestedMinimumWidth;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int measureText;
        boolean z10;
        int suggestedMinimumHeight = super.getSuggestedMinimumHeight();
        if (this.f10847f > 0) {
            Paint paint = this.f10858q;
            float f10 = this.f10859r;
            paint.setTextSize(1.3f * f10);
            b bVar = this.F;
            if (bVar != null) {
                Intrinsics.checkNotNull(bVar);
                if ("00".length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    b bVar2 = this.F;
                    Intrinsics.checkNotNull(bVar2);
                    bVar2.getClass();
                    measureText = (int) paint.measureText("00");
                    paint.setTextSize(f10 * 1.0f);
                } else {
                    measureText = (int) paint.measureText("0000");
                    paint.setTextSize(f10 * 1.0f);
                }
            } else {
                measureText = (int) paint.measureText(String.valueOf(this.f10848g));
                int measureText2 = (int) paint.measureText(String.valueOf(this.f10849h));
                paint.setTextSize(f10 * 1.0f);
                if (measureText <= measureText2) {
                    measureText = measureText2;
                }
            }
            return Math.max(suggestedMinimumHeight, measureText);
        }
        return suggestedMinimumHeight;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return this.f10844b;
    }

    /* renamed from: getWrapSelectorWheel, reason: from getter */
    public final boolean getF10857p() {
        return this.f10857p;
    }

    public final int i(int i10) {
        int i11;
        if (!this.f10857p) {
            Integer num = this.f10850i;
            if (num != null || i10 <= (i11 = this.f10849h)) {
                if (num != null) {
                    Intrinsics.checkNotNull(num);
                    if (i10 > num.intValue()) {
                        Integer num2 = this.f10850i;
                        Intrinsics.checkNotNull(num2);
                        return num2.intValue();
                    }
                }
                Integer num3 = this.f10851j;
                if (num3 != null || i10 >= (i11 = this.f10848g)) {
                    if (num3 != null) {
                        Intrinsics.checkNotNull(num3);
                        if (i10 < num3.intValue()) {
                            Integer num4 = this.f10851j;
                            Intrinsics.checkNotNull(num4);
                            return num4.intValue();
                        }
                        return i10;
                    }
                    return i10;
                }
            }
            return i11;
        }
        return c(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.duylt.lib.wheel_picker.WheelPicker.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            d();
            boolean z11 = this.G;
            setVerticalFadingEdgeEnabled(z11);
            if (z11) {
                setFadingEdgeLength(((getBottom() - getTop()) - this.f10859r) / 2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int a = a(getSuggestedMinimumWidth(), layoutParams.width, i10);
        int a10 = a(getSuggestedMinimumHeight(), layoutParams.height, i11);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + a, getPaddingBottom() + getPaddingTop() + a10);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Integer num;
        int i10;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f10861t == null) {
            this.f10861t = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f10861t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        int actionMasked = event.getActionMasked();
        OverScroller overScroller = this.f10860s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        if (this.f10865y) {
                            this.f10865y = false;
                        }
                        VelocityTracker velocityTracker2 = this.f10861t;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        this.f10861t = null;
                    }
                } else {
                    float y4 = event.getY() - this.f10864x;
                    if (!this.f10865y) {
                        float abs = Math.abs(y4);
                        float f10 = this.u;
                        if (abs > f10) {
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            if (y4 > 0.0f) {
                                y4 -= f10;
                            } else {
                                y4 += f10;
                            }
                            if (this.I != 1) {
                                this.I = 1;
                            }
                            this.f10865y = true;
                        }
                    }
                    if (this.f10865y) {
                        scrollBy(0, (int) y4);
                        invalidate();
                        this.f10864x = event.getY();
                    }
                }
            } else if (this.f10865y) {
                this.f10865y = false;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f10861t;
                if (velocityTracker3 != null) {
                    velocityTracker3.computeCurrentVelocity(1000, this.f10862v);
                }
                VelocityTracker velocityTracker4 = this.f10861t;
                if (velocityTracker4 != null) {
                    num = Integer.valueOf((int) velocityTracker4.getYVelocity());
                } else {
                    num = null;
                }
                Intrinsics.checkNotNull(num);
                if (Math.abs(num.intValue()) > this.f10863w) {
                    this.E = 0;
                    if (overScroller != null) {
                        i10 = 2;
                        overScroller.fling(getScrollX(), getScrollY(), 0, num.intValue(), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, (int) (getItemHeight() * 0.7d));
                    } else {
                        i10 = 2;
                    }
                    postInvalidateOnAnimation();
                    if (this.I != i10) {
                        this.I = i10;
                    }
                }
                VelocityTracker velocityTracker5 = this.f10861t;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                }
                this.f10861t = null;
            } else {
                int y10 = (((int) event.getY()) / this.C) - this.f10853l;
                this.E = 0;
                Intrinsics.checkNotNull(overScroller);
                overScroller.startScroll(0, 0, 0, y10 * (-this.C), this.f10845c);
                invalidate();
            }
        } else {
            Intrinsics.checkNotNull(overScroller);
            if (!overScroller.isFinished()) {
                Intrinsics.checkNotNull(overScroller);
                overScroller.forceFinished(true);
            }
            this.f10864x = event.getY();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r0 <= r3.intValue()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r0 >= r3.intValue()) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void scrollBy(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.duylt.lib.wheel_picker.WheelPicker.scrollBy(int, int):void");
    }

    public final void setMaxValidValue(Integer maxValid) {
        this.f10850i = maxValid;
    }

    public final void setMaxValue(int max) {
        this.f10849h = max;
    }

    public final void setMinValidValue(Integer minValid) {
        this.f10851j = minValid;
    }

    public final void setMinValue(int min) {
        this.f10848g = min;
    }

    public final void setOnScrollListener(a onScrollListener) {
        Intrinsics.checkNotNullParameter(onScrollListener, "onScrollListener");
    }

    public final void setOnValueChangedListener(u5.b onValueChangeListener) {
        Intrinsics.checkNotNullParameter(onValueChangeListener, "onValueChangeListener");
    }

    public final void setSelectedTextColor(int colorId) {
        h.getColor(getContext(), colorId);
        invalidate();
    }

    public final void setTypeface(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f10858q.setTypeface(typeface);
    }

    public final void setUnselectedTextColor(int resourceId) {
    }

    public final void setValue(String value) {
        int i10;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "value");
        b bVar = this.F;
        int i11 = 0;
        if (bVar != null) {
            Intrinsics.checkNotNull(bVar);
            switch (((sf.b) bVar).f25019i) {
                case 0:
                    Intrinsics.checkNotNullParameter(value, "vale");
                    break;
                default:
                    Intrinsics.checkNotNullParameter(value, "vale");
                    break;
            }
            i10 = i(0);
        } else {
            try {
                i11 = i(Integer.parseInt(value));
            } catch (NumberFormatException unused) {
            }
            i10 = i11;
        }
        g(i10);
    }

    public final void setWheelItemCount(int count) {
        int i10 = count + 2;
        this.f10846d = i10;
        this.f10852k = (i10 - 1) / 2;
        int i11 = i10 - 2;
        this.f10847f = i11;
        this.f10853l = (i11 - 1) / 2;
        this.f10854m = new ArrayList(this.f10846d);
        this.f10855n = new ArrayList(this.f10846d);
        e();
        d();
        invalidate();
        invalidate();
    }

    public final void setWrapSelectorWheel(boolean wrap) {
        this.f10857p = wrap;
        invalidate();
    }
}
