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
import androidx.annotation.ColorInt;
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.b1;
import com.applovin.impl.xp;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
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

    /* renamed from: a */
    private final Rect f22538a;

    /* renamed from: b */
    private final Rect f22539b;

    /* renamed from: c */
    private final Rect f22540c;
    private final Rect d;

    /* renamed from: f */
    private final Paint f22541f;

    /* renamed from: g */
    private final Paint f22542g;

    /* renamed from: h */
    private final Paint f22543h;

    /* renamed from: i */
    private final Paint f22544i;

    /* renamed from: j */
    private final Paint f22545j;

    /* renamed from: k */
    private final Paint f22546k;

    /* renamed from: l */
    private final Drawable f22547l;

    /* renamed from: m */
    private final int f22548m;

    /* renamed from: n */
    private final int f22549n;

    /* renamed from: o */
    private final int f22550o;

    /* renamed from: p */
    private final int f22551p;

    /* renamed from: q */
    private final int f22552q;

    /* renamed from: r */
    private final int f22553r;

    /* renamed from: s */
    private final int f22554s;

    /* renamed from: t */
    private final int f22555t;

    /* renamed from: u */
    private final int f22556u;

    /* renamed from: v */
    private final StringBuilder f22557v;
    private final Formatter w;
    private final Runnable x;

    /* renamed from: y */
    private final CopyOnWriteArraySet f22558y;

    /* renamed from: z */
    private final Point f22559z;

    public b(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        this(context, attributeSet, i2, attributeSet2, 0);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.a();
    }

    private void c(long j2) {
        if (this.J == j2) {
            return;
        }
        this.J = j2;
        Iterator it = this.f22558y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).b(this, j2);
        }
    }

    private long getPositionIncrement() {
        long j2 = this.C;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = this.K;
        if (j3 == -9223372036854775807L) {
            return 0L;
        }
        return j3 / this.B;
    }

    private String getProgressText() {
        return xp.a(this.f22557v, this.w, this.L);
    }

    private long getScrubberPosition() {
        if (this.f22539b.width() <= 0 || this.K == -9223372036854775807L) {
            return 0L;
        }
        return (this.d.width() * this.K) / this.f22539b.width();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public long getPreferredUpdateDelay() {
        int b2 = b(this.A, this.f22539b.width());
        if (b2 != 0) {
            long j2 = this.K;
            if (j2 != 0 && j2 != -9223372036854775807L) {
                return j2 / b2;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22547l;
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
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (!this.I || z2) {
            return;
        }
        a(false);
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
        if (xp.f27962a >= 21) {
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
            java.lang.Runnable r5 = r4.x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.x
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
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        int i10 = this.H ? 0 : this.f22555t;
        if (this.f22550o == 1) {
            i6 = (i9 - getPaddingBottom()) - this.f22549n;
            int paddingBottom = i9 - getPaddingBottom();
            int i11 = this.f22548m;
            i7 = (paddingBottom - i11) - Math.max(i10 - (i11 / 2), 0);
        } else {
            i6 = (i9 - this.f22549n) / 2;
            i7 = (i9 - this.f22548m) / 2;
        }
        this.f22538a.set(paddingLeft, i6, paddingRight, this.f22549n + i6);
        Rect rect = this.f22539b;
        Rect rect2 = this.f22538a;
        rect.set(rect2.left + i10, i7, rect2.right - i10, this.f22548m + i7);
        if (xp.f27962a >= 29) {
            a(i8, i9);
        }
        b();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.f22549n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f22549n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        c();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.f22547l;
        if (drawable == null || !a(drawable, i2)) {
            return;
        }
        invalidate();
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
            int r8 = r7.f22556u
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
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i2 == 8192) {
            if (a(-getPositionIncrement())) {
                a(false);
            }
        } else {
            if (i2 != 4096) {
                return false;
            }
            if (a(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i2) {
        this.f22544i.setColor(i2);
        invalidate(this.f22538a);
    }

    public void setBufferedColor(@ColorInt int i2) {
        this.f22542g.setColor(i2);
        invalidate(this.f22538a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setBufferedPosition(long j2) {
        if (this.M == j2) {
            return;
        }
        this.M = j2;
        b();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setDuration(long j2) {
        if (this.K == j2) {
            return;
        }
        this.K = j2;
        if (this.I && j2 == -9223372036854775807L) {
            a(true);
        }
        b();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.i
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!this.I || z2) {
            return;
        }
        a(true);
    }

    public void setKeyCountIncrement(int i2) {
        b1.a(i2 > 0);
        this.B = i2;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j2) {
        b1.a(j2 > 0);
        this.B = -1;
        this.C = j2;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i2) {
        this.f22545j.setColor(i2);
        invalidate(this.f22538a);
    }

    public void setPlayedColor(@ColorInt int i2) {
        this.f22541f.setColor(i2);
        invalidate(this.f22538a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setPosition(long j2) {
        if (this.L == j2) {
            return;
        }
        this.L = j2;
        setContentDescription(getProgressText());
        b();
    }

    public void setScrubberColor(@ColorInt int i2) {
        this.f22546k.setColor(i2);
        invalidate(this.f22538a);
    }

    public void setUnplayedColor(@ColorInt int i2) {
        this.f22543h.setColor(i2);
        invalidate(this.f22538a);
    }

    public b(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2, int i3) {
        super(context, attributeSet, i2);
        this.f22538a = new Rect();
        this.f22539b = new Rect();
        this.f22540c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.f22541f = paint;
        Paint paint2 = new Paint();
        this.f22542g = paint2;
        Paint paint3 = new Paint();
        this.f22543h = paint3;
        Paint paint4 = new Paint();
        this.f22544i = paint4;
        Paint paint5 = new Paint();
        this.f22545j = paint5;
        Paint paint6 = new Paint();
        this.f22546k = paint6;
        paint6.setAntiAlias(true);
        this.f22558y = new CopyOnWriteArraySet();
        this.f22559z = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.A = f2;
        this.f22556u = a(f2, -50);
        int a2 = a(f2, 4);
        int a3 = a(f2, 26);
        int a4 = a(f2, 4);
        int a5 = a(f2, 12);
        int a6 = a(f2, 0);
        int a7 = a(f2, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinDefaultTimeBar, i2, i3);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.f22547l = drawable;
                if (drawable != null) {
                    a(drawable);
                    a3 = Math.max(drawable.getMinimumHeight(), a3);
                }
                this.f22548m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, a2);
                this.f22549n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a3);
                this.f22550o = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.f22551p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a4);
                this.f22552q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a5);
                this.f22553r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a6);
                this.f22554s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a7);
                int i4 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i5 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i6 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i7 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i8 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i9 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f22548m = a2;
            this.f22549n = a3;
            this.f22550o = 0;
            this.f22551p = a4;
            this.f22552q = a5;
            this.f22553r = a6;
            this.f22554s = a7;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f22547l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f22557v = sb;
        this.w = new Formatter(sb, Locale.getDefault());
        this.x = new androidx.compose.material.ripple.a(this, 7);
        Drawable drawable2 = this.f22547l;
        if (drawable2 != null) {
            this.f22555t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22555t = (Math.max(this.f22553r, Math.max(this.f22552q, this.f22554s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new k(this, 0));
        this.K = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int a(float f2, int i2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    private static int b(float f2, int i2) {
        return (int) (i2 / f2);
    }

    public /* synthetic */ void a() {
        a(false);
    }

    private void b(long j2) {
        this.J = j2;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f22558y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, j2);
        }
    }

    private void c() {
        Drawable drawable = this.f22547l;
        if (drawable != null && drawable.isStateful() && this.f22547l.setState(getDrawableState())) {
            invalidate();
        }
    }

    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f22538a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(i.a aVar) {
        b1.a(aVar);
        this.f22558y.add(aVar);
    }

    private void b() {
        this.f22540c.set(this.f22539b);
        this.d.set(this.f22539b);
        long j2 = this.I ? this.J : this.L;
        if (this.K > 0) {
            int width = (int) ((this.f22539b.width() * this.M) / this.K);
            Rect rect = this.f22540c;
            Rect rect2 = this.f22539b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f22539b.width() * j2) / this.K);
            Rect rect3 = this.d;
            Rect rect4 = this.f22539b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f22540c;
            int i2 = this.f22539b.left;
            rect5.right = i2;
            this.d.right = i2;
        }
        invalidate(this.f22538a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(long[] jArr, boolean[] zArr, int i2) {
        b1.a(i2 == 0 || !(jArr == null || zArr == null));
        this.N = i2;
        this.O = jArr;
        this.P = zArr;
        b();
    }

    private void a(boolean z2) {
        removeCallbacks(this.x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f22558y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, this.J, z2);
        }
    }

    private boolean a(long j2) {
        long j3 = this.K;
        if (j3 <= 0) {
            return false;
        }
        long j4 = this.I ? this.J : this.L;
        long b2 = xp.b(j4 + j2, 0L, j3);
        if (b2 == j4) {
            return false;
        }
        if (!this.I) {
            b(b2);
        } else {
            c(b2);
        }
        b();
        return true;
    }

    private void b(Canvas canvas) {
        int height = this.f22539b.height();
        int centerY = this.f22539b.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.K <= 0) {
            Rect rect = this.f22539b;
            canvas.drawRect(rect.left, centerY, rect.right, i2, this.f22543h);
            return;
        }
        Rect rect2 = this.f22540c;
        int i3 = rect2.left;
        int i4 = rect2.right;
        int max = Math.max(Math.max(this.f22539b.left, i4), this.d.right);
        int i5 = this.f22539b.right;
        if (max < i5) {
            canvas.drawRect(max, centerY, i5, i2, this.f22543h);
        }
        int max2 = Math.max(i3, this.d.right);
        if (i4 > max2) {
            canvas.drawRect(max2, centerY, i4, i2, this.f22542g);
        }
        if (this.d.width() > 0) {
            Rect rect3 = this.d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i2, this.f22541f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) b1.a(this.O);
        boolean[] zArr = (boolean[]) b1.a(this.P);
        int i6 = this.f22551p / 2;
        for (int i7 = 0; i7 < this.N; i7++) {
            int width = ((int) ((this.f22539b.width() * xp.b(jArr[i7], 0L, this.K)) / this.K)) - i6;
            Rect rect4 = this.f22539b;
            canvas.drawRect(Math.min(rect4.width() - this.f22551p, Math.max(0, width)) + rect4.left, centerY, r8 + this.f22551p, i2, zArr[i7] ? this.f22545j : this.f22544i);
        }
    }

    private void a(float f2) {
        Rect rect = this.d;
        Rect rect2 = this.f22539b;
        rect.right = xp.a((int) f2, rect2.left, rect2.right);
    }

    private Point a(MotionEvent motionEvent) {
        this.f22559z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f22559z;
    }

    private boolean a(float f2, float f3) {
        return this.f22538a.contains((int) f2, (int) f3);
    }

    private void a(Canvas canvas) {
        int i2;
        if (this.K <= 0) {
            return;
        }
        Rect rect = this.d;
        int a2 = xp.a(rect.right, rect.left, this.f22539b.right);
        int centerY = this.d.centerY();
        if (this.f22547l == null) {
            if (this.I || isFocused()) {
                i2 = this.f22554s;
            } else {
                i2 = isEnabled() ? this.f22552q : this.f22553r;
            }
            canvas.drawCircle(a2, centerY, (int) ((i2 * this.G) / 2.0f), this.f22546k);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.f22547l.getIntrinsicHeight() * this.G)) / 2;
        this.f22547l.setBounds(a2 - intrinsicWidth, centerY - intrinsicHeight, a2 + intrinsicWidth, centerY + intrinsicHeight);
        this.f22547l.draw(canvas);
    }

    private void a(int i2, int i3) {
        Rect rect = this.E;
        if (rect != null && rect.width() == i2 && this.E.height() == i3) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i2, i3);
        this.E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private boolean a(Drawable drawable) {
        return xp.f27962a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i2) {
        return xp.f27962a >= 23 && drawable.setLayoutDirection(i2);
    }
}
