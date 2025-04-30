package c0;

import B3.k;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.G;
import java.util.Arrays;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585d {

    /* renamed from: v, reason: collision with root package name */
    public static final G f5358v = new G(2);

    /* renamed from: a, reason: collision with root package name */
    public int f5359a;
    public final int b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f5361d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f5362e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f5363f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f5364g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f5365h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f5366i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f5367j;

    /* renamed from: k, reason: collision with root package name */
    public int f5368k;
    public VelocityTracker l;
    public final float m;

    /* renamed from: n, reason: collision with root package name */
    public final float f5369n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5370o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f5371p;

    /* renamed from: q, reason: collision with root package name */
    public final y8.a f5372q;

    /* renamed from: r, reason: collision with root package name */
    public View f5373r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5374s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f5375t;

    /* renamed from: c, reason: collision with root package name */
    public int f5360c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final k f5376u = new k(this, 11);

    public C0585d(Context context, ViewGroup viewGroup, y8.a aVar) {
        if (viewGroup != null) {
            if (aVar != null) {
                this.f5375t = viewGroup;
                this.f5372q = aVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f5370o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.b = viewConfiguration.getScaledTouchSlop();
                this.m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f5369n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f5371p = new OverScroller(context, f5358v);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f5360c = -1;
        float[] fArr = this.f5361d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f5362e, 0.0f);
            Arrays.fill(this.f5363f, 0.0f);
            Arrays.fill(this.f5364g, 0.0f);
            Arrays.fill(this.f5365h, 0);
            Arrays.fill(this.f5366i, 0);
            Arrays.fill(this.f5367j, 0);
            this.f5368k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i9) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f5375t;
        if (parent == viewGroup) {
            this.f5373r = view;
            this.f5360c = i9;
            this.f5372q.r(view, i9);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(View view, float f9, float f10) {
        boolean z8;
        boolean z9;
        if (view == null) {
            return false;
        }
        y8.a aVar = this.f5372q;
        if (aVar.o(view) > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (aVar.p() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && z9) {
            float f11 = (f10 * f10) + (f9 * f9);
            int i9 = this.b;
            if (f11 <= i9 * i9) {
                return false;
            }
            return true;
        }
        if (z8) {
            if (Math.abs(f9) <= this.b) {
                return false;
            }
            return true;
        }
        if (!z9 || Math.abs(f10) <= this.b) {
            return false;
        }
        return true;
    }

    public final void d(int i9) {
        float[] fArr = this.f5361d;
        if (fArr != null) {
            int i10 = this.f5368k;
            int i11 = 1 << i9;
            if ((i10 & i11) != 0) {
                fArr[i9] = 0.0f;
                this.f5362e[i9] = 0.0f;
                this.f5363f[i9] = 0.0f;
                this.f5364g[i9] = 0.0f;
                this.f5365h[i9] = 0;
                this.f5366i[i9] = 0;
                this.f5367j[i9] = 0;
                this.f5368k = (~i11) & i10;
            }
        }
    }

    public final int e(int i9, int i10, int i11) {
        int abs;
        if (i9 == 0) {
            return 0;
        }
        float width = this.f5375t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i9) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i10);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i9) / i11) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.f5359a == 2) {
            OverScroller overScroller = this.f5371p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f5373r.getLeft();
            int top = currY - this.f5373r.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.f5373r, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.f5373r, top);
            }
            if (left != 0 || top != 0) {
                this.f5372q.t(this.f5373r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f5375t.post(this.f5376u);
            }
        }
        if (this.f5359a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i9, int i10) {
        ViewGroup viewGroup = this.f5375t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f5372q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f5373r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f5373r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f5371p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.n(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f5373r
            float r0 = r10.f5369n
            int r0 = (int) r0
            float r6 = r10.m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
        L3b:
            r14 = r11
            goto L45
        L3d:
            if (r7 <= r6) goto L45
            if (r14 <= 0) goto L43
            r14 = r6
            goto L45
        L43:
            int r11 = -r6
            goto L3b
        L45:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5f
            float r11 = (float) r6
            float r6 = (float) r8
        L5d:
            float r11 = r11 / r6
            goto L62
        L5f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5d
        L62:
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
        L66:
            float r0 = r0 / r6
            goto L6b
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L66
        L6b:
            y8.a r6 = r10.f5372q
            int r12 = r6.o(r12)
            int r12 = r10.e(r4, r13, r12)
            int r13 = r6.p()
            int r13 = r10.e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.n(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0585d.h(int, int, int, int):boolean");
    }

    public final boolean i(int i9) {
        if ((this.f5368k & (1 << i9)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i9 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i9;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                y8.a aVar = this.f5372q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f5359a == 1 && pointerId == this.f5360c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i10 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i10);
                                            if (pointerId2 != this.f5360c) {
                                                View g9 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                                                View view = this.f5373r;
                                                if (g9 == view && q(view, pointerId2)) {
                                                    i9 = this.f5360c;
                                                    break;
                                                }
                                            }
                                            i10++;
                                        } else {
                                            i9 = -1;
                                            break;
                                        }
                                    }
                                    if (i9 == -1) {
                                        k();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x9 = motionEvent.getX(actionIndex);
                        float y4 = motionEvent.getY(actionIndex);
                        l(pointerId3, x9, y4);
                        if (this.f5359a == 0) {
                            q(g((int) x9, (int) y4), pointerId3);
                            int i11 = this.f5365h[pointerId3];
                            return;
                        }
                        int i12 = (int) x9;
                        int i13 = (int) y4;
                        View view2 = this.f5373r;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            i10 = 1;
                        }
                        if (i10 != 0) {
                            q(this.f5373r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f5359a == 1) {
                        this.f5374s = true;
                        aVar.u(this.f5373r, 0.0f, 0.0f);
                        this.f5374s = false;
                        if (this.f5359a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.f5359a == 1) {
                    if (i(this.f5360c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5360c);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y6 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f5363f;
                        int i14 = this.f5360c;
                        int i15 = (int) (x10 - fArr[i14]);
                        int i16 = (int) (y6 - this.f5364g[i14]);
                        int left = this.f5373r.getLeft() + i15;
                        int top = this.f5373r.getTop() + i16;
                        int left2 = this.f5373r.getLeft();
                        int top2 = this.f5373r.getTop();
                        if (i15 != 0) {
                            left = aVar.d(this.f5373r, left);
                            ViewCompat.offsetLeftAndRight(this.f5373r, left - left2);
                        }
                        if (i16 != 0) {
                            top = aVar.e(this.f5373r, top);
                            ViewCompat.offsetTopAndBottom(this.f5373r, top - top2);
                        }
                        if (i15 != 0 || i16 != 0) {
                            aVar.t(this.f5373r, left, top);
                        }
                        m(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i10 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (i(pointerId4)) {
                        float x11 = motionEvent.getX(i10);
                        float y9 = motionEvent.getY(i10);
                        float f9 = x11 - this.f5361d[pointerId4];
                        float f10 = y9 - this.f5362e[pointerId4];
                        Math.abs(f9);
                        Math.abs(f10);
                        int i17 = this.f5365h[pointerId4];
                        Math.abs(f10);
                        Math.abs(f9);
                        int i18 = this.f5365h[pointerId4];
                        Math.abs(f9);
                        Math.abs(f10);
                        int i19 = this.f5365h[pointerId4];
                        Math.abs(f10);
                        Math.abs(f9);
                        int i20 = this.f5365h[pointerId4];
                        if (this.f5359a != 1) {
                            View g10 = g((int) x11, (int) y9);
                            if (c(g10, f9, f10) && q(g10, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                m(motionEvent);
                return;
            }
            if (this.f5359a == 1) {
                k();
            }
            a();
            return;
        }
        float x12 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g11 = g((int) x12, (int) y10);
        l(pointerId5, x12, y10);
        q(g11, pointerId5);
        int i21 = this.f5365h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.l;
        float f9 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f9);
        float xVelocity = this.l.getXVelocity(this.f5360c);
        float f10 = this.f5369n;
        float abs = Math.abs(xVelocity);
        float f11 = 0.0f;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f9) {
            if (xVelocity > 0.0f) {
                xVelocity = f9;
            } else {
                xVelocity = -f9;
            }
        }
        float yVelocity = this.l.getYVelocity(this.f5360c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f10) {
            if (abs2 > f9) {
                if (yVelocity <= 0.0f) {
                    f9 = -f9;
                }
                f11 = f9;
            } else {
                f11 = yVelocity;
            }
        }
        this.f5374s = true;
        this.f5372q.u(this.f5373r, xVelocity, f11);
        this.f5374s = false;
        if (this.f5359a == 1) {
            n(0);
        }
    }

    public final void l(int i9, float f9, float f10) {
        float[] fArr = this.f5361d;
        int i10 = 0;
        if (fArr == null || fArr.length <= i9) {
            int i11 = i9 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5362e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5363f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5364g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5365h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5366i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5367j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5361d = fArr2;
            this.f5362e = fArr3;
            this.f5363f = fArr4;
            this.f5364g = fArr5;
            this.f5365h = iArr;
            this.f5366i = iArr2;
            this.f5367j = iArr3;
        }
        float[] fArr9 = this.f5361d;
        this.f5363f[i9] = f9;
        fArr9[i9] = f9;
        float[] fArr10 = this.f5362e;
        this.f5364g[i9] = f10;
        fArr10[i9] = f10;
        int[] iArr7 = this.f5365h;
        int i12 = (int) f9;
        int i13 = (int) f10;
        ViewGroup viewGroup = this.f5375t;
        int left = viewGroup.getLeft();
        int i14 = this.f5370o;
        if (i12 < left + i14) {
            i10 = 1;
        }
        if (i13 < viewGroup.getTop() + i14) {
            i10 |= 4;
        }
        if (i12 > viewGroup.getRight() - i14) {
            i10 |= 2;
        }
        if (i13 > viewGroup.getBottom() - i14) {
            i10 |= 8;
        }
        iArr7[i9] = i10;
        this.f5368k = (1 << i9) | this.f5368k;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            int pointerId = motionEvent.getPointerId(i9);
            if (i(pointerId)) {
                float x9 = motionEvent.getX(i9);
                float y4 = motionEvent.getY(i9);
                this.f5363f[pointerId] = x9;
                this.f5364g[pointerId] = y4;
            }
        }
    }

    public final void n(int i9) {
        this.f5375t.removeCallbacks(this.f5376u);
        if (this.f5359a != i9) {
            this.f5359a = i9;
            this.f5372q.s(i9);
            if (this.f5359a == 0) {
                this.f5373r = null;
            }
        }
    }

    public final boolean o(int i9, int i10) {
        if (this.f5374s) {
            return h(i9, i10, (int) this.l.getXVelocity(this.f5360c), (int) this.l.getYVelocity(this.f5360c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0585d.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i9) {
        if (view == this.f5373r && this.f5360c == i9) {
            return true;
        }
        if (view != null && this.f5372q.y(view, i9)) {
            this.f5360c = i9;
            b(view, i9);
            return true;
        }
        return false;
    }
}
