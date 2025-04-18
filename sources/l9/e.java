package l9;

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
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import n9.h0;
import s7.h2;
import s7.i0;
import s7.x2;
import v8.u0;

/* loaded from: classes3.dex */
public final class e extends View implements u {
    public static final /* synthetic */ int P = 0;
    public final Point A;
    public final float B;
    public int C;
    public long D;
    public int E;
    public Rect F;
    public float G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f21186b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f21187c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f21188d;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f21189f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f21190g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f21191h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f21192i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f21193j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f21194k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f21195l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f21196m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21197n;

    /* renamed from: o, reason: collision with root package name */
    public final int f21198o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21199p;

    /* renamed from: q, reason: collision with root package name */
    public final int f21200q;

    /* renamed from: r, reason: collision with root package name */
    public final int f21201r;

    /* renamed from: s, reason: collision with root package name */
    public final int f21202s;

    /* renamed from: t, reason: collision with root package name */
    public final int f21203t;
    public final int u;

    /* renamed from: v, reason: collision with root package name */
    public final int f21204v;

    /* renamed from: w, reason: collision with root package name */
    public final StringBuilder f21205w;

    /* renamed from: x, reason: collision with root package name */
    public final Formatter f21206x;

    /* renamed from: y, reason: collision with root package name */
    public final k8.f f21207y;

    /* renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArraySet f21208z;

    public e(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        int i10;
        Paint paint;
        this.f21186b = new Rect();
        this.f21187c = new Rect();
        this.f21188d = new Rect();
        this.f21189f = new Rect();
        Paint paint2 = new Paint();
        this.f21190g = paint2;
        Paint paint3 = new Paint();
        this.f21191h = paint3;
        Paint paint4 = new Paint();
        this.f21192i = paint4;
        Paint paint5 = new Paint();
        this.f21193j = paint5;
        Paint paint6 = new Paint();
        this.f21194k = paint6;
        Paint paint7 = new Paint();
        this.f21195l = paint7;
        paint7.setAntiAlias(true);
        this.f21208z = new CopyOnWriteArraySet();
        this.A = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.B = f10;
        this.f21204v = a(f10, -50);
        int a = a(f10, 4);
        int a10 = a(f10, 26);
        int a11 = a(f10, 4);
        int a12 = a(f10, 12);
        int a13 = a(f10, 0);
        int a14 = a(f10, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m.f21243b, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f21196m = drawable;
                if (drawable != null) {
                    int i11 = h0.a;
                    if (i11 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        paint = paint5;
                        if (i11 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    } else {
                        paint = paint5;
                    }
                    a10 = Math.max(drawable.getMinimumHeight(), a10);
                } else {
                    paint = paint5;
                }
                this.f21197n = obtainStyledAttributes.getDimensionPixelSize(3, a);
                this.f21198o = obtainStyledAttributes.getDimensionPixelSize(12, a10);
                this.f21199p = obtainStyledAttributes.getInt(2, 0);
                this.f21200q = obtainStyledAttributes.getDimensionPixelSize(1, a11);
                this.f21201r = obtainStyledAttributes.getDimensionPixelSize(11, a12);
                this.f21202s = obtainStyledAttributes.getDimensionPixelSize(8, a13);
                this.f21203t = obtainStyledAttributes.getDimensionPixelSize(9, a14);
                int i12 = obtainStyledAttributes.getInt(6, -1);
                int i13 = obtainStyledAttributes.getInt(7, -1);
                int i14 = obtainStyledAttributes.getInt(4, -855638017);
                int i15 = obtainStyledAttributes.getInt(13, 872415231);
                int i16 = obtainStyledAttributes.getInt(0, -1291845888);
                int i17 = obtainStyledAttributes.getInt(5, 872414976);
                paint2.setColor(i12);
                paint7.setColor(i13);
                paint3.setColor(i14);
                paint4.setColor(i15);
                paint.setColor(i16);
                paint6.setColor(i17);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f21197n = a;
            this.f21198o = a10;
            this.f21199p = 0;
            this.f21200q = a11;
            this.f21201r = a12;
            this.f21202s = a13;
            this.f21203t = a14;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.f21196m = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f21205w = sb2;
        this.f21206x = new Formatter(sb2, Locale.getDefault());
        this.f21207y = new k8.f(this, 1);
        Drawable drawable2 = this.f21196m;
        if (drawable2 != null) {
            i10 = 2;
            this.u = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            i10 = 2;
            this.u = (Math.max(this.f21202s, Math.max(this.f21201r, this.f21203t)) + 1) / 2;
        }
        this.G = 1.0f;
        new ValueAnimator().addUpdateListener(new m3.o(this, i10));
        this.J = C.TIME_UNSET;
        this.D = C.TIME_UNSET;
        this.C = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j3 = this.D;
        if (j3 == C.TIME_UNSET) {
            long j10 = this.J;
            if (j10 == C.TIME_UNSET) {
                return 0L;
            }
            return j10 / this.C;
        }
        return j3;
    }

    private String getProgressText() {
        return h0.w(this.f21205w, this.f21206x, this.K);
    }

    private long getScrubberPosition() {
        if (this.f21187c.width() > 0 && this.J != C.TIME_UNSET) {
            return (this.f21189f.width() * this.J) / r0.width();
        }
        return 0L;
    }

    public final boolean b(long j3) {
        long j10;
        long j11 = this.J;
        if (j11 <= 0) {
            return false;
        }
        if (this.H) {
            j10 = this.I;
        } else {
            j10 = this.K;
        }
        long j12 = j10;
        long i10 = h0.i(j12 + j3, 0L, j11);
        if (i10 == j12) {
            return false;
        }
        if (!this.H) {
            c(i10);
        } else {
            f(i10);
        }
        e();
        return true;
    }

    public final void c(long j3) {
        this.I = j3;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f21208z.iterator();
        while (it.hasNext()) {
            k kVar = ((h) it.next()).f21211b;
            kVar.M = true;
            TextView textView = kVar.f21229o;
            if (textView != null) {
                textView.setText(h0.w(kVar.f21231q, kVar.f21232r, j3));
            }
        }
    }

    public final void d(boolean z10) {
        h2 h2Var;
        int t5;
        removeCallbacks(this.f21207y);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f21208z.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            long j3 = this.I;
            k kVar = hVar.f21211b;
            kVar.M = false;
            if (!z10 && (h2Var = kVar.I) != null) {
                i0 i0Var = (i0) h2Var;
                x2 x10 = i0Var.x();
                if (kVar.L && !x10.p()) {
                    int o10 = x10.o();
                    t5 = 0;
                    while (true) {
                        long Q = h0.Q(x10.m(t5, kVar.f21234t).f24852p);
                        if (j3 < Q) {
                            break;
                        }
                        if (t5 == o10 - 1) {
                            j3 = Q;
                            break;
                        } else {
                            j3 -= Q;
                            t5++;
                        }
                    }
                } else {
                    t5 = i0Var.t();
                }
                i0Var.g(t5, j3, false);
                kVar.h();
            }
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f21196m;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        long j3;
        Rect rect = this.f21188d;
        Rect rect2 = this.f21187c;
        rect.set(rect2);
        Rect rect3 = this.f21189f;
        rect3.set(rect2);
        if (this.H) {
            j3 = this.I;
        } else {
            j3 = this.K;
        }
        if (this.J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.L) / this.J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j3) / this.J)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f21186b);
    }

    public final void f(long j3) {
        if (this.I == j3) {
            return;
        }
        this.I = j3;
        Iterator it = this.f21208z.iterator();
        while (it.hasNext()) {
            k kVar = ((h) it.next()).f21211b;
            TextView textView = kVar.f21229o;
            if (textView != null) {
                textView.setText(h0.w(kVar.f21231q, kVar.f21232r, j3));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (this.f21187c.width() / this.B);
        if (width != 0) {
            long j3 = this.J;
            if (j3 != 0 && j3 != C.TIME_UNSET) {
                return j3 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21196m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i10;
        canvas.save();
        Rect rect = this.f21187c;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i11 = height + centerY;
        long j3 = this.J;
        Paint paint2 = this.f21192i;
        Rect rect2 = this.f21189f;
        if (j3 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i11, paint2);
        } else {
            Rect rect3 = this.f21188d;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int max = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (max < i14) {
                canvas.drawRect(max, centerY, i14, i11, paint2);
            }
            int max2 = Math.max(i12, rect2.right);
            if (i13 > max2) {
                canvas.drawRect(max2, centerY, i13, i11, this.f21191h);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i11, this.f21190g);
            }
            if (this.M != 0) {
                long[] jArr = this.N;
                jArr.getClass();
                boolean[] zArr = this.O;
                zArr.getClass();
                int i15 = this.f21200q;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.M) {
                    int min = Math.min(rect.width() - i15, Math.max(i17, ((int) ((rect.width() * h0.i(jArr[i18], 0L, this.J)) / this.J)) - i16)) + rect.left;
                    if (zArr[i18]) {
                        paint = this.f21194k;
                    } else {
                        paint = this.f21193j;
                    }
                    canvas.drawRect(min, centerY, min + i15, i11, paint);
                    i18++;
                    i17 = i17;
                    i15 = i15;
                }
            }
        }
        if (this.J > 0) {
            int h10 = h0.h(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f21196m;
            if (drawable == null) {
                if (!this.H && !isFocused()) {
                    if (isEnabled()) {
                        i10 = this.f21201r;
                    } else {
                        i10 = this.f21202s;
                    }
                } else {
                    i10 = this.f21203t;
                }
                canvas.drawCircle(h10, centerY2, (int) ((i10 * this.G) / 2.0f), this.f21195l);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.G)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.G)) / 2;
                drawable.setBounds(h10 - intrinsicWidth, centerY2 - intrinsicHeight, h10 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.H && !z10) {
            d(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (h0.a >= 21) {
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
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            k8.f r5 = r4.f21207y
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.H
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        Rect rect;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.f21199p;
        int i19 = this.f21197n;
        int i20 = this.f21198o;
        int i21 = this.u;
        if (i18 == 1) {
            i14 = (i17 - getPaddingBottom()) - i20;
            i15 = ((i17 - getPaddingBottom()) - i19) - Math.max(i21 - (i19 / 2), 0);
        } else {
            i14 = (i17 - i20) / 2;
            i15 = (i17 - i19) / 2;
        }
        Rect rect2 = this.f21186b;
        rect2.set(paddingLeft, i14, paddingRight, i20 + i14);
        this.f21187c.set(rect2.left + i21, i15, rect2.right - i21, i19 + i15);
        if (h0.a >= 29 && ((rect = this.F) == null || rect.width() != i16 || this.F.height() != i17)) {
            Rect rect3 = new Rect(0, 0, i16, i17);
            this.F = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f21198o;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.f21196m;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        boolean z10;
        Drawable drawable = this.f21196m;
        if (drawable != null) {
            if (h0.a >= 23 && drawable.setLayoutDirection(i10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.A
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f21189f
            android.graphics.Rect r5 = r9.f21187c
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.H
            if (r10 == 0) goto La1
            int r10 = r9.f21204v
            if (r0 >= r10) goto L52
            int r10 = r9.E
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = n9.h0.h(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.E = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = n9.h0.h(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.H
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f21186b
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = n9.h0.h(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f21193j.setColor(i10);
        invalidate(this.f21186b);
    }

    public void setBufferedColor(int i10) {
        this.f21191h.setColor(i10);
        invalidate(this.f21186b);
    }

    public void setBufferedPosition(long j3) {
        if (this.L == j3) {
            return;
        }
        this.L = j3;
        e();
    }

    public void setDuration(long j3) {
        if (this.J == j3) {
            return;
        }
        this.J = j3;
        if (this.H && j3 == C.TIME_UNSET) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.H && !z10) {
            d(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.C = i10;
        this.D = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j3) {
        boolean z10;
        if (j3 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.C = -1;
        this.D = j3;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f21194k.setColor(i10);
        invalidate(this.f21186b);
    }

    public void setPlayedColor(int i10) {
        this.f21190g.setColor(i10);
        invalidate(this.f21186b);
    }

    public void setPosition(long j3) {
        if (this.K == j3) {
            return;
        }
        this.K = j3;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i10) {
        this.f21195l.setColor(i10);
        invalidate(this.f21186b);
    }

    public void setUnplayedColor(int i10) {
        this.f21192i.setColor(i10);
        invalidate(this.f21186b);
    }
}
