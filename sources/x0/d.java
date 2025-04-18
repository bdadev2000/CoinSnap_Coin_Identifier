package x0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.activity.i;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: v, reason: collision with root package name */
    public static final c f27307v = new c(0);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f27308b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f27310d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f27311e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f27312f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f27313g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f27314h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f27315i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f27316j;

    /* renamed from: k, reason: collision with root package name */
    public int f27317k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f27318l;

    /* renamed from: m, reason: collision with root package name */
    public final float f27319m;

    /* renamed from: n, reason: collision with root package name */
    public final float f27320n;

    /* renamed from: o, reason: collision with root package name */
    public final int f27321o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f27322p;

    /* renamed from: q, reason: collision with root package name */
    public final mi.a f27323q;

    /* renamed from: r, reason: collision with root package name */
    public View f27324r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27325s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f27326t;

    /* renamed from: c, reason: collision with root package name */
    public int f27309c = -1;
    public final i u = new i(this, 5);

    public d(Context context, ViewGroup viewGroup, mi.a aVar) {
        if (viewGroup != null) {
            if (aVar != null) {
                this.f27326t = viewGroup;
                this.f27323q = aVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f27321o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f27308b = viewConfiguration.getScaledTouchSlop();
                this.f27319m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f27320n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f27322p = new OverScroller(context, f27307v);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f27309c = -1;
        float[] fArr = this.f27310d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f27311e, 0.0f);
            Arrays.fill(this.f27312f, 0.0f);
            Arrays.fill(this.f27313g, 0.0f);
            Arrays.fill(this.f27314h, 0);
            Arrays.fill(this.f27315i, 0);
            Arrays.fill(this.f27316j, 0);
            this.f27317k = 0;
        }
        VelocityTracker velocityTracker = this.f27318l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27318l = null;
        }
    }

    public final void b(int i10, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f27326t;
        if (parent == viewGroup) {
            this.f27324r = view;
            this.f27309c = i10;
            this.f27323q.k(i10, view);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f10, int i10, float f11, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f27314h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f27316j[i10] & i11) == i11 || (this.f27315i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f27308b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f27323q.getClass();
        }
        if ((this.f27315i[i10] & i11) != 0 || abs <= this.f27308b) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        mi.a aVar = this.f27323q;
        if (aVar.h(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar.i() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f12 = (f11 * f11) + (f10 * f10);
            int i10 = this.f27308b;
            if (f12 <= i10 * i10) {
                return false;
            }
            return true;
        }
        if (z10) {
            if (Math.abs(f10) <= this.f27308b) {
                return false;
            }
            return true;
        }
        if (!z11 || Math.abs(f11) <= this.f27308b) {
            return false;
        }
        return true;
    }

    public final void e(int i10) {
        float[] fArr = this.f27310d;
        if (fArr != null) {
            int i11 = this.f27317k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i10] = 0.0f;
                this.f27311e[i10] = 0.0f;
                this.f27312f[i10] = 0.0f;
                this.f27313g[i10] = 0.0f;
                this.f27314h[i10] = 0;
                this.f27315i[i10] = 0;
                this.f27316j[i10] = 0;
                this.f27317k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width = this.f27326t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.f27322p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f27324r.getLeft();
            int top = currY - this.f27324r.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.f27324r, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.f27324r, top);
            }
            if (left != 0 || top != 0) {
                this.f27323q.m(this.f27324r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f27326t.post(this.u);
            }
        }
        if (this.a != 2) {
            return false;
        }
        return true;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f27326t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f27323q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f27324r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f27324r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f27322p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f27324r
            float r0 = r10.f27320n
            int r0 = (int) r0
            float r6 = r10.f27319m
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
            if (r7 >= r0) goto L3c
            goto L43
        L3c:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L42
            r14 = r6
            goto L44
        L42:
            int r11 = -r6
        L43:
            r14 = r11
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L5f
        L5d:
            float r11 = (float) r11
            float r6 = (float) r9
        L5f:
            float r11 = r11 / r6
            if (r14 == 0) goto L65
            float r0 = (float) r7
            float r6 = (float) r8
            goto L67
        L65:
            float r0 = (float) r0
            float r6 = (float) r9
        L67:
            float r0 = r0 / r6
            mi.a r6 = r10.f27323q
            int r12 = r6.h(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.i()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d.i(int, int, int, int):boolean");
    }

    public final boolean j(int i10) {
        boolean z10;
        if ((this.f27317k & (1 << i10)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f27318l == null) {
            this.f27318l = VelocityTracker.obtain();
        }
        this.f27318l.addMovement(motionEvent);
        int i11 = 0;
        mi.a aVar = this.f27323q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.a == 1 && pointerId == this.f27309c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.f27309c) {
                                                View h10 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f27324r;
                                                if (h10 == view && s(pointerId2, view)) {
                                                    i10 = this.f27309c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y4 = motionEvent.getY(actionIndex);
                        n(pointerId3, x10, y4);
                        if (this.a == 0) {
                            s(pointerId3, h((int) x10, (int) y4));
                            if ((this.f27314h[pointerId3] & 0) != 0) {
                                aVar.getClass();
                                return;
                            }
                            return;
                        }
                        int i12 = (int) x10;
                        int i13 = (int) y4;
                        View view2 = this.f27324r;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            s(pointerId3, this.f27324r);
                            return;
                        }
                        return;
                    }
                    if (this.a == 1) {
                        this.f27325s = true;
                        aVar.n(this.f27324r, 0.0f, 0.0f);
                        this.f27325s = false;
                        if (this.a == 1) {
                            p(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.a == 1) {
                    if (j(this.f27309c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f27309c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f27312f;
                        int i14 = this.f27309c;
                        int i15 = (int) (x11 - fArr[i14]);
                        int i16 = (int) (y10 - this.f27313g[i14]);
                        int left = this.f27324r.getLeft() + i15;
                        int top = this.f27324r.getTop() + i16;
                        int left2 = this.f27324r.getLeft();
                        int top2 = this.f27324r.getTop();
                        if (i15 != 0) {
                            left = aVar.d(this.f27324r, left);
                            ViewCompat.offsetLeftAndRight(this.f27324r, left - left2);
                        }
                        if (i16 != 0) {
                            top = aVar.e(this.f27324r, top);
                            ViewCompat.offsetTopAndBottom(this.f27324r, top - top2);
                        }
                        if (i15 != 0 || i16 != 0) {
                            aVar.m(this.f27324r, left, top);
                        }
                        o(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i11 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (j(pointerId4)) {
                        float x12 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f10 = x12 - this.f27310d[pointerId4];
                        float f11 = y11 - this.f27311e[pointerId4];
                        m(pointerId4, f10, f11);
                        if (this.a != 1) {
                            View h11 = h((int) x12, (int) y11);
                            if (d(h11, f10, f11) && s(pointerId4, h11)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                o(motionEvent);
                return;
            }
            if (this.a == 1) {
                l();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x13, (int) y12);
        n(pointerId5, x13, y12);
        s(pointerId5, h12);
        if ((this.f27314h[pointerId5] & 0) != 0) {
            aVar.getClass();
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f27318l;
        float f10 = this.f27319m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f27318l.getXVelocity(this.f27309c);
        float abs = Math.abs(xVelocity);
        float f11 = this.f27320n;
        float f12 = 0.0f;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            if (xVelocity > 0.0f) {
                xVelocity = f10;
            } else {
                xVelocity = -f10;
            }
        }
        float yVelocity = this.f27318l.getYVelocity(this.f27309c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f11) {
            if (abs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f27325s = true;
        this.f27323q.n(this.f27324r, xVelocity, f12);
        this.f27325s = false;
        if (this.a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void m(int i10, float f10, float f11) {
        boolean c10 = c(f10, i10, f11, 1);
        boolean z10 = c10;
        if (c(f11, i10, f10, 4)) {
            z10 = (c10 ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f10, i10, f11, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f11, i10, f10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f27315i;
            iArr[i10] = iArr[i10] | r02;
            this.f27323q.getClass();
        }
    }

    public final void n(int i10, float f10, float f11) {
        float[] fArr = this.f27310d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f27311e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f27312f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f27313g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f27314h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f27315i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f27316j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f27310d = fArr2;
            this.f27311e = fArr3;
            this.f27312f = fArr4;
            this.f27313g = fArr5;
            this.f27314h = iArr;
            this.f27315i = iArr2;
            this.f27316j = iArr3;
        }
        float[] fArr9 = this.f27310d;
        this.f27312f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f27311e;
        this.f27313g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f27314h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        ViewGroup viewGroup = this.f27326t;
        int left = viewGroup.getLeft();
        int i15 = this.f27321o;
        if (i13 < left + i15) {
            i11 = 1;
        }
        if (i14 < viewGroup.getTop() + i15) {
            i11 |= 4;
        }
        if (i13 > viewGroup.getRight() - i15) {
            i11 |= 2;
        }
        if (i14 > viewGroup.getBottom() - i15) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f27317k = (1 << i10) | this.f27317k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y4 = motionEvent.getY(i10);
                this.f27312f[pointerId] = x10;
                this.f27313g[pointerId] = y4;
            }
        }
    }

    public final void p(int i10) {
        this.f27326t.removeCallbacks(this.u);
        if (this.a != i10) {
            this.a = i10;
            this.f27323q.l(i10);
            if (this.a == 0) {
                this.f27324r = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f27325s) {
            return i(i10, i11, (int) this.f27318l.getXVelocity(this.f27309c), (int) this.f27318l.getYVelocity(this.f27309c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(int i10, View view) {
        if (view == this.f27324r && this.f27309c == i10) {
            return true;
        }
        if (view != null && this.f27323q.p(i10, view)) {
            this.f27309c = i10;
            b(i10, view);
            return true;
        }
        return false;
    }
}
