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
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.a1;
import com.applovin.impl.yp;
import com.applovin.sdk.R;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import m3.o;

/* loaded from: classes.dex */
public class b extends View implements i {
    private final float A;
    private int B;
    private long C;
    private int D;
    private Rect E;
    private ValueAnimator F;
    private float G;
    private boolean H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long[] O;
    private boolean[] P;
    private final Rect a;

    /* renamed from: b */
    private final Rect f3445b;

    /* renamed from: c */
    private final Rect f3446c;

    /* renamed from: d */
    private final Rect f3447d;

    /* renamed from: f */
    private final Paint f3448f;

    /* renamed from: g */
    private final Paint f3449g;

    /* renamed from: h */
    private final Paint f3450h;

    /* renamed from: i */
    private final Paint f3451i;

    /* renamed from: j */
    private final Paint f3452j;

    /* renamed from: k */
    private final Paint f3453k;

    /* renamed from: l */
    private final Drawable f3454l;

    /* renamed from: m */
    private final int f3455m;

    /* renamed from: n */
    private final int f3456n;

    /* renamed from: o */
    private final int f3457o;

    /* renamed from: p */
    private final int f3458p;

    /* renamed from: q */
    private final int f3459q;

    /* renamed from: r */
    private final int f3460r;

    /* renamed from: s */
    private final int f3461s;

    /* renamed from: t */
    private final int f3462t;
    private final int u;

    /* renamed from: v */
    private final StringBuilder f3463v;

    /* renamed from: w */
    private final Formatter f3464w;

    /* renamed from: x */
    private final Runnable f3465x;

    /* renamed from: y */
    private final CopyOnWriteArraySet f3466y;

    /* renamed from: z */
    private final Point f3467z;

    public b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.a();
    }

    private void c(long j3) {
        if (this.J == j3) {
            return;
        }
        this.J = j3;
        Iterator it = this.f3466y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).b(this, j3);
        }
    }

    private long getPositionIncrement() {
        long j3 = this.C;
        if (j3 == C.TIME_UNSET) {
            long j10 = this.K;
            if (j10 == C.TIME_UNSET) {
                return 0L;
            }
            return j10 / this.B;
        }
        return j3;
    }

    private String getProgressText() {
        return yp.a(this.f3463v, this.f3464w, this.L);
    }

    private long getScrubberPosition() {
        if (this.f3445b.width() > 0 && this.K != C.TIME_UNSET) {
            return (this.f3447d.width() * this.K) / this.f3445b.width();
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
        int b3 = b(this.A, this.f3445b.width());
        if (b3 != 0) {
            long j3 = this.K;
            if (j3 != 0 && j3 != C.TIME_UNSET) {
                return j3 / b3;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3454l;
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
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.I && !z10) {
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
        if (this.K <= 0) {
            return;
        }
        if (yp.a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
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
            java.lang.Runnable r5 = r4.f3465x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f3465x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.I
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17 = i12 - i10;
        int i18 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        if (this.H) {
            i14 = 0;
        } else {
            i14 = this.f3462t;
        }
        if (this.f3457o == 1) {
            i15 = (i18 - getPaddingBottom()) - this.f3456n;
            int paddingBottom = i18 - getPaddingBottom();
            int i19 = this.f3455m;
            i16 = (paddingBottom - i19) - Math.max(i14 - (i19 / 2), 0);
        } else {
            i15 = (i18 - this.f3456n) / 2;
            i16 = (i18 - this.f3455m) / 2;
        }
        this.a.set(paddingLeft, i15, paddingRight, this.f3456n + i15);
        Rect rect = this.f3445b;
        Rect rect2 = this.a;
        rect.set(rect2.left + i14, i16, rect2.right - i14, this.f3455m + i16);
        if (yp.a >= 29) {
            a(i17, i18);
        }
        b();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f3456n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f3456n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        c();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f3454l;
        if (drawable != null && a(drawable, i10)) {
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
            long r2 = r7.K
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
            boolean r8 = r7.I
            if (r8 == 0) goto L76
            int r8 = r7.u
            if (r0 >= r8) goto L3a
            int r8 = r7.D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            r7.a(r8)
            goto L40
        L3a:
            r7.D = r2
            float r8 = (float) r2
            r7.a(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.c(r0)
            r7.b()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.I
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
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (a(-getPositionIncrement())) {
                a(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (a(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f3451i.setColor(i10);
        invalidate(this.a);
    }

    public void setBufferedColor(int i10) {
        this.f3449g.setColor(i10);
        invalidate(this.a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setBufferedPosition(long j3) {
        if (this.M == j3) {
            return;
        }
        this.M = j3;
        b();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setDuration(long j3) {
        if (this.K == j3) {
            return;
        }
        this.K = j3;
        if (this.I && j3 == C.TIME_UNSET) {
            a(true);
        }
        b();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.i
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.I && !z10) {
            a(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        this.B = i10;
        this.C = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j3) {
        boolean z10;
        if (j3 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        this.B = -1;
        this.C = j3;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f3452j.setColor(i10);
        invalidate(this.a);
    }

    public void setPlayedColor(int i10) {
        this.f3448f.setColor(i10);
        invalidate(this.a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setPosition(long j3) {
        if (this.L == j3) {
            return;
        }
        this.L = j3;
        setContentDescription(getProgressText());
        b();
    }

    public void setScrubberColor(int i10) {
        this.f3453k.setColor(i10);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i10) {
        this.f3450h.setColor(i10);
        invalidate(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    public b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        ?? r22;
        this.a = new Rect();
        this.f3445b = new Rect();
        this.f3446c = new Rect();
        this.f3447d = new Rect();
        Paint paint = new Paint();
        this.f3448f = paint;
        Paint paint2 = new Paint();
        this.f3449g = paint2;
        Paint paint3 = new Paint();
        this.f3450h = paint3;
        Paint paint4 = new Paint();
        this.f3451i = paint4;
        Paint paint5 = new Paint();
        this.f3452j = paint5;
        Paint paint6 = new Paint();
        this.f3453k = paint6;
        paint6.setAntiAlias(true);
        this.f3466y = new CopyOnWriteArraySet();
        this.f3467z = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A = f10;
        this.u = a(f10, -50);
        int a = a(f10, 4);
        int a10 = a(f10, 26);
        int a11 = a(f10, 4);
        int a12 = a(f10, 12);
        int a13 = a(f10, 0);
        int a14 = a(f10, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinDefaultTimeBar, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.f3454l = drawable;
                if (drawable != null) {
                    a(drawable);
                    a10 = Math.max(drawable.getMinimumHeight(), a10);
                }
                this.f3455m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, a);
                this.f3456n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a10);
                this.f3457o = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.f3458p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a11);
                this.f3459q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a12);
                this.f3460r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a13);
                this.f3461s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a14);
                int i12 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i13 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i14 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i15 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i16 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i17 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f3455m = a;
            this.f3456n = a10;
            this.f3457o = 0;
            this.f3458p = a11;
            this.f3459q = a12;
            this.f3460r = a13;
            this.f3461s = a14;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f3454l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f3463v = sb2;
        this.f3464w = new Formatter(sb2, Locale.getDefault());
        this.f3465x = new androidx.activity.d(this, 13);
        Drawable drawable2 = this.f3454l;
        if (drawable2 != null) {
            r22 = 1;
            this.f3462t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            r22 = 1;
            this.f3462t = (Math.max(this.f3460r, Math.max(this.f3459q, this.f3461s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new o(this, r22));
        this.K = C.TIME_UNSET;
        this.C = C.TIME_UNSET;
        this.B = 20;
        setFocusable((boolean) r22);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(r22);
        }
    }

    private static int a(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private static int b(float f10, int i10) {
        return (int) (i10 / f10);
    }

    public /* synthetic */ void a() {
        a(false);
    }

    private void b(long j3) {
        this.J = j3;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f3466y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, j3);
        }
    }

    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.a);
    }

    private void c() {
        Drawable drawable = this.f3454l;
        if (drawable != null && drawable.isStateful() && this.f3454l.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(i.a aVar) {
        a1.a(aVar);
        this.f3466y.add(aVar);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(long[] jArr, boolean[] zArr, int i10) {
        a1.a(i10 == 0 || !(jArr == null || zArr == null));
        this.N = i10;
        this.O = jArr;
        this.P = zArr;
        b();
    }

    private void b() {
        this.f3446c.set(this.f3445b);
        this.f3447d.set(this.f3445b);
        long j3 = this.I ? this.J : this.L;
        if (this.K > 0) {
            int width = (int) ((this.f3445b.width() * this.M) / this.K);
            Rect rect = this.f3446c;
            Rect rect2 = this.f3445b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f3445b.width() * j3) / this.K);
            Rect rect3 = this.f3447d;
            Rect rect4 = this.f3445b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f3446c;
            int i10 = this.f3445b.left;
            rect5.right = i10;
            this.f3447d.right = i10;
        }
        invalidate(this.a);
    }

    private void a(boolean z10) {
        removeCallbacks(this.f3465x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f3466y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, this.J, z10);
        }
    }

    private boolean a(long j3) {
        long j10 = this.K;
        if (j10 <= 0) {
            return false;
        }
        long j11 = this.I ? this.J : this.L;
        long b3 = yp.b(j11 + j3, 0L, j10);
        if (b3 == j11) {
            return false;
        }
        if (!this.I) {
            b(b3);
        } else {
            c(b3);
        }
        b();
        return true;
    }

    private void b(Canvas canvas) {
        int height = this.f3445b.height();
        int centerY = this.f3445b.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.K <= 0) {
            Rect rect = this.f3445b;
            canvas.drawRect(rect.left, centerY, rect.right, i10, this.f3450h);
            return;
        }
        Rect rect2 = this.f3446c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.f3445b.left, i12), this.f3447d.right);
        int i13 = this.f3445b.right;
        if (max < i13) {
            canvas.drawRect(max, centerY, i13, i10, this.f3450h);
        }
        int max2 = Math.max(i11, this.f3447d.right);
        if (i12 > max2) {
            canvas.drawRect(max2, centerY, i12, i10, this.f3449g);
        }
        if (this.f3447d.width() > 0) {
            Rect rect3 = this.f3447d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i10, this.f3448f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) a1.a(this.O);
        boolean[] zArr = (boolean[]) a1.a(this.P);
        int i14 = this.f3458p / 2;
        for (int i15 = 0; i15 < this.N; i15++) {
            int width = ((int) ((this.f3445b.width() * yp.b(jArr[i15], 0L, this.K)) / this.K)) - i14;
            Rect rect4 = this.f3445b;
            canvas.drawRect(Math.min(rect4.width() - this.f3458p, Math.max(0, width)) + rect4.left, centerY, r8 + this.f3458p, i10, zArr[i15] ? this.f3452j : this.f3451i);
        }
    }

    private void a(float f10) {
        Rect rect = this.f3447d;
        Rect rect2 = this.f3445b;
        rect.right = yp.a((int) f10, rect2.left, rect2.right);
    }

    private Point a(MotionEvent motionEvent) {
        this.f3467z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f3467z;
    }

    private boolean a(float f10, float f11) {
        return this.a.contains((int) f10, (int) f11);
    }

    private void a(Canvas canvas) {
        int i10;
        if (this.K <= 0) {
            return;
        }
        Rect rect = this.f3447d;
        int a = yp.a(rect.right, rect.left, this.f3445b.right);
        int centerY = this.f3447d.centerY();
        if (this.f3454l == null) {
            if (!this.I && !isFocused()) {
                i10 = isEnabled() ? this.f3459q : this.f3460r;
            } else {
                i10 = this.f3461s;
            }
            canvas.drawCircle(a, centerY, (int) ((i10 * this.G) / 2.0f), this.f3453k);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.f3454l.getIntrinsicHeight() * this.G)) / 2;
        this.f3454l.setBounds(a - intrinsicWidth, centerY - intrinsicHeight, a + intrinsicWidth, centerY + intrinsicHeight);
        this.f3454l.draw(canvas);
    }

    private void a(int i10, int i11) {
        Rect rect = this.E;
        if (rect != null && rect.width() == i10 && this.E.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private boolean a(Drawable drawable) {
        return yp.a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i10) {
        return yp.a >= 23 && drawable.setLayoutDirection(i10);
    }
}
