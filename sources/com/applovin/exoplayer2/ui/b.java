package com.applovin.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.AbstractC0669a1;
import com.applovin.impl.yp;
import com.applovin.sdk.R;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class b extends View implements i {

    /* renamed from: A */
    private final float f6193A;

    /* renamed from: B */
    private int f6194B;

    /* renamed from: C */
    private long f6195C;

    /* renamed from: D */
    private int f6196D;

    /* renamed from: E */
    private Rect f6197E;

    /* renamed from: F */
    private ValueAnimator f6198F;

    /* renamed from: G */
    private float f6199G;

    /* renamed from: H */
    private boolean f6200H;

    /* renamed from: I */
    private boolean f6201I;

    /* renamed from: J */
    private long f6202J;

    /* renamed from: K */
    private long f6203K;

    /* renamed from: L */
    private long f6204L;

    /* renamed from: M */
    private long f6205M;

    /* renamed from: N */
    private int f6206N;
    private long[] O;

    /* renamed from: P */
    private boolean[] f6207P;

    /* renamed from: a */
    private final Rect f6208a;
    private final Rect b;

    /* renamed from: c */
    private final Rect f6209c;

    /* renamed from: d */
    private final Rect f6210d;

    /* renamed from: f */
    private final Paint f6211f;

    /* renamed from: g */
    private final Paint f6212g;

    /* renamed from: h */
    private final Paint f6213h;

    /* renamed from: i */
    private final Paint f6214i;

    /* renamed from: j */
    private final Paint f6215j;

    /* renamed from: k */
    private final Paint f6216k;
    private final Drawable l;
    private final int m;

    /* renamed from: n */
    private final int f6217n;

    /* renamed from: o */
    private final int f6218o;

    /* renamed from: p */
    private final int f6219p;

    /* renamed from: q */
    private final int f6220q;

    /* renamed from: r */
    private final int f6221r;

    /* renamed from: s */
    private final int f6222s;

    /* renamed from: t */
    private final int f6223t;

    /* renamed from: u */
    private final int f6224u;

    /* renamed from: v */
    private final StringBuilder f6225v;

    /* renamed from: w */
    private final Formatter f6226w;

    /* renamed from: x */
    private final Runnable f6227x;

    /* renamed from: y */
    private final CopyOnWriteArraySet f6228y;

    /* renamed from: z */
    private final Point f6229z;

    public b(Context context, AttributeSet attributeSet, int i9, AttributeSet attributeSet2) {
        this(context, attributeSet, i9, attributeSet2, 0);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.a();
    }

    private void c(long j7) {
        if (this.f6202J == j7) {
            return;
        }
        this.f6202J = j7;
        Iterator it = this.f6228y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).b(this, j7);
        }
    }

    private long getPositionIncrement() {
        long j7 = this.f6195C;
        if (j7 == C.TIME_UNSET) {
            long j9 = this.f6203K;
            if (j9 == C.TIME_UNSET) {
                return 0L;
            }
            return j9 / this.f6194B;
        }
        return j7;
    }

    private String getProgressText() {
        return yp.a(this.f6225v, this.f6226w, this.f6204L);
    }

    private long getScrubberPosition() {
        if (this.b.width() > 0 && this.f6203K != C.TIME_UNSET) {
            return (this.f6210d.width() * this.f6203K) / this.b.width();
        }
        return 0L;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public long getPreferredUpdateDelay() {
        int b = b(this.f6193A, this.b.width());
        if (b != 0) {
            long j7 = this.f6203K;
            if (j7 != 0 && j7 != C.TIME_UNSET) {
                return j7 / b;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        b(canvas);
        a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z8, int i9, Rect rect) {
        super.onFocusChanged(z8, i9, rect);
        if (this.f6201I && !z8) {
            a(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f6203K <= 0) {
            return;
        }
        if (yp.f12451a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(FragmentTransaction.TRANSIT_EXIT_MASK);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.a(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f6227x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f6227x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f6201I
            if (r0 == 0) goto L30
            r5 = 0
            r4.a(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = i11 - i9;
        int i17 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        if (this.f6200H) {
            i13 = 0;
        } else {
            i13 = this.f6223t;
        }
        if (this.f6218o == 1) {
            i14 = (i17 - getPaddingBottom()) - this.f6217n;
            int paddingBottom = i17 - getPaddingBottom();
            int i18 = this.m;
            i15 = (paddingBottom - i18) - Math.max(i13 - (i18 / 2), 0);
        } else {
            i14 = (i17 - this.f6217n) / 2;
            i15 = (i17 - this.m) / 2;
        }
        this.f6208a.set(paddingLeft, i14, paddingRight, this.f6217n + i14);
        Rect rect = this.b;
        Rect rect2 = this.f6208a;
        rect.set(rect2.left + i13, i15, rect2.right - i13, this.m + i15);
        if (yp.f12451a >= 29) {
            a(i16, i17);
        }
        b();
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 0) {
            size = this.f6217n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f6217n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i9), size);
        c();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i9) {
        Drawable drawable = this.l;
        if (drawable != null && a(drawable, i9)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 != 3) goto L69;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.f6203K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.a(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.f6201I
            if (r8 == 0) goto L76
            int r8 = r7.f6224u
            if (r0 >= r8) goto L3a
            int r8 = r7.f6196D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            r7.a(r8)
            goto L40
        L3a:
            r7.f6196D = r2
            float r8 = (float) r2
            r7.a(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.c(r0)
            r7.b()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f6201I
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.a(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.a(r8, r0)
            if (r0 == 0) goto L76
            r7.a(r8)
            long r0 = r7.getScrubberPosition()
            r7.b(r0)
            r7.b()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (super.performAccessibilityAction(i9, bundle)) {
            return true;
        }
        if (this.f6203K <= 0) {
            return false;
        }
        if (i9 == 8192) {
            if (a(-getPositionIncrement())) {
                a(false);
            }
        } else {
            if (i9 != 4096) {
                return false;
            }
            if (a(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i9) {
        this.f6214i.setColor(i9);
        invalidate(this.f6208a);
    }

    public void setBufferedColor(int i9) {
        this.f6212g.setColor(i9);
        invalidate(this.f6208a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setBufferedPosition(long j7) {
        if (this.f6205M == j7) {
            return;
        }
        this.f6205M = j7;
        b();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setDuration(long j7) {
        if (this.f6203K == j7) {
            return;
        }
        this.f6203K = j7;
        if (this.f6201I && j7 == C.TIME_UNSET) {
            a(true);
        }
        b();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.i
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        if (this.f6201I && !z8) {
            a(true);
        }
    }

    public void setKeyCountIncrement(int i9) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        this.f6194B = i9;
        this.f6195C = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j7) {
        boolean z8;
        if (j7 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        this.f6194B = -1;
        this.f6195C = j7;
    }

    public void setPlayedAdMarkerColor(int i9) {
        this.f6215j.setColor(i9);
        invalidate(this.f6208a);
    }

    public void setPlayedColor(int i9) {
        this.f6211f.setColor(i9);
        invalidate(this.f6208a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setPosition(long j7) {
        if (this.f6204L == j7) {
            return;
        }
        this.f6204L = j7;
        setContentDescription(getProgressText());
        b();
    }

    public void setScrubberColor(int i9) {
        this.f6216k.setColor(i9);
        invalidate(this.f6208a);
    }

    public void setUnplayedColor(int i9) {
        this.f6213h.setColor(i9);
        invalidate(this.f6208a);
    }

    public b(Context context, AttributeSet attributeSet, int i9, AttributeSet attributeSet2, int i10) {
        super(context, attributeSet, i9);
        this.f6208a = new Rect();
        this.b = new Rect();
        this.f6209c = new Rect();
        this.f6210d = new Rect();
        Paint paint = new Paint();
        this.f6211f = paint;
        Paint paint2 = new Paint();
        this.f6212g = paint2;
        Paint paint3 = new Paint();
        this.f6213h = paint3;
        Paint paint4 = new Paint();
        this.f6214i = paint4;
        Paint paint5 = new Paint();
        this.f6215j = paint5;
        Paint paint6 = new Paint();
        this.f6216k = paint6;
        paint6.setAntiAlias(true);
        this.f6228y = new CopyOnWriteArraySet();
        this.f6229z = new Point();
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f6193A = f9;
        this.f6224u = a(f9, -50);
        int a6 = a(f9, 4);
        int a9 = a(f9, 26);
        int a10 = a(f9, 4);
        int a11 = a(f9, 12);
        int a12 = a(f9, 0);
        int a13 = a(f9, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinDefaultTimeBar, i9, i10);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.l = drawable;
                if (drawable != null) {
                    a(drawable);
                    a9 = Math.max(drawable.getMinimumHeight(), a9);
                }
                this.m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, a6);
                this.f6217n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a9);
                this.f6218o = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.f6219p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a10);
                this.f6220q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a11);
                this.f6221r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a12);
                this.f6222s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a13);
                int i11 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i12 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i13 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i14 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i15 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i16 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i11);
                paint6.setColor(i12);
                paint2.setColor(i13);
                paint3.setColor(i14);
                paint4.setColor(i15);
                paint5.setColor(i16);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.m = a6;
            this.f6217n = a9;
            this.f6218o = 0;
            this.f6219p = a10;
            this.f6220q = a11;
            this.f6221r = a12;
            this.f6222s = a13;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f6225v = sb;
        this.f6226w = new Formatter(sb, Locale.getDefault());
        this.f6227x = new D3.b(this, 19);
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            this.f6223t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f6223t = (Math.max(this.f6221r, Math.max(this.f6220q, this.f6222s)) + 1) / 2;
        }
        this.f6199G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f6198F = valueAnimator;
        valueAnimator.addUpdateListener(new U3.h(this, 1));
        this.f6203K = C.TIME_UNSET;
        this.f6195C = C.TIME_UNSET;
        this.f6194B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int a(float f9, int i9) {
        return (int) ((i9 * f9) + 0.5f);
    }

    private static int b(float f9, int i9) {
        return (int) (i9 / f9);
    }

    public /* synthetic */ void a() {
        a(false);
    }

    private void b(long j7) {
        this.f6202J = j7;
        this.f6201I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f6228y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, j7);
        }
    }

    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.f6199G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f6208a);
    }

    private void c() {
        Drawable drawable = this.l;
        if (drawable != null && drawable.isStateful() && this.l.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(i.a aVar) {
        AbstractC0669a1.a(aVar);
        this.f6228y.add(aVar);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(long[] jArr, boolean[] zArr, int i9) {
        AbstractC0669a1.a(i9 == 0 || !(jArr == null || zArr == null));
        this.f6206N = i9;
        this.O = jArr;
        this.f6207P = zArr;
        b();
    }

    private void b() {
        this.f6209c.set(this.b);
        this.f6210d.set(this.b);
        long j7 = this.f6201I ? this.f6202J : this.f6204L;
        if (this.f6203K > 0) {
            int width = (int) ((this.b.width() * this.f6205M) / this.f6203K);
            Rect rect = this.f6209c;
            Rect rect2 = this.b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.b.width() * j7) / this.f6203K);
            Rect rect3 = this.f6210d;
            Rect rect4 = this.b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f6209c;
            int i9 = this.b.left;
            rect5.right = i9;
            this.f6210d.right = i9;
        }
        invalidate(this.f6208a);
    }

    private void a(boolean z8) {
        removeCallbacks(this.f6227x);
        this.f6201I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f6228y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, this.f6202J, z8);
        }
    }

    private boolean a(long j7) {
        long j9 = this.f6203K;
        if (j9 <= 0) {
            return false;
        }
        long j10 = this.f6201I ? this.f6202J : this.f6204L;
        long b = yp.b(j10 + j7, 0L, j9);
        if (b == j10) {
            return false;
        }
        if (!this.f6201I) {
            b(b);
        } else {
            c(b);
        }
        b();
        return true;
    }

    private void b(Canvas canvas) {
        int height = this.b.height();
        int centerY = this.b.centerY() - (height / 2);
        int i9 = height + centerY;
        if (this.f6203K <= 0) {
            Rect rect = this.b;
            canvas.drawRect(rect.left, centerY, rect.right, i9, this.f6213h);
            return;
        }
        Rect rect2 = this.f6209c;
        int i10 = rect2.left;
        int i11 = rect2.right;
        int max = Math.max(Math.max(this.b.left, i11), this.f6210d.right);
        int i12 = this.b.right;
        if (max < i12) {
            canvas.drawRect(max, centerY, i12, i9, this.f6213h);
        }
        int max2 = Math.max(i10, this.f6210d.right);
        if (i11 > max2) {
            canvas.drawRect(max2, centerY, i11, i9, this.f6212g);
        }
        if (this.f6210d.width() > 0) {
            Rect rect3 = this.f6210d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i9, this.f6211f);
        }
        if (this.f6206N == 0) {
            return;
        }
        long[] jArr = (long[]) AbstractC0669a1.a(this.O);
        boolean[] zArr = (boolean[]) AbstractC0669a1.a(this.f6207P);
        int i13 = this.f6219p / 2;
        for (int i14 = 0; i14 < this.f6206N; i14++) {
            int width = ((int) ((this.b.width() * yp.b(jArr[i14], 0L, this.f6203K)) / this.f6203K)) - i13;
            Rect rect4 = this.b;
            canvas.drawRect(Math.min(rect4.width() - this.f6219p, Math.max(0, width)) + rect4.left, centerY, r8 + this.f6219p, i9, zArr[i14] ? this.f6215j : this.f6214i);
        }
    }

    private void a(float f9) {
        Rect rect = this.f6210d;
        Rect rect2 = this.b;
        rect.right = yp.a((int) f9, rect2.left, rect2.right);
    }

    private Point a(MotionEvent motionEvent) {
        this.f6229z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f6229z;
    }

    private boolean a(float f9, float f10) {
        return this.f6208a.contains((int) f9, (int) f10);
    }

    private void a(Canvas canvas) {
        int i9;
        if (this.f6203K <= 0) {
            return;
        }
        Rect rect = this.f6210d;
        int a6 = yp.a(rect.right, rect.left, this.b.right);
        int centerY = this.f6210d.centerY();
        if (this.l == null) {
            if (!this.f6201I && !isFocused()) {
                i9 = isEnabled() ? this.f6220q : this.f6221r;
            } else {
                i9 = this.f6222s;
            }
            canvas.drawCircle(a6, centerY, (int) ((i9 * this.f6199G) / 2.0f), this.f6216k);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f6199G)) / 2;
        int intrinsicHeight = ((int) (this.l.getIntrinsicHeight() * this.f6199G)) / 2;
        this.l.setBounds(a6 - intrinsicWidth, centerY - intrinsicHeight, a6 + intrinsicWidth, centerY + intrinsicHeight);
        this.l.draw(canvas);
    }

    private void a(int i9, int i10) {
        Rect rect = this.f6197E;
        if (rect != null && rect.width() == i9 && this.f6197E.height() == i10) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i9, i10);
        this.f6197E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private boolean a(Drawable drawable) {
        return yp.f12451a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i9) {
        return yp.f12451a >= 23 && drawable.setLayoutDirection(i9);
    }
}
