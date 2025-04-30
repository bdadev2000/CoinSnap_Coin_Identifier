package q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes.dex */
public final class b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static b1 m;

    /* renamed from: n, reason: collision with root package name */
    public static b1 f22627n;
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f22628c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22629d;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f22630f;

    /* renamed from: g, reason: collision with root package name */
    public final a1 f22631g;

    /* renamed from: h, reason: collision with root package name */
    public int f22632h;

    /* renamed from: i, reason: collision with root package name */
    public int f22633i;

    /* renamed from: j, reason: collision with root package name */
    public c1 f22634j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22635k;
    public boolean l = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [q.a1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q.a1] */
    public b1(View view, CharSequence charSequence) {
        final int i9 = 0;
        this.f22630f = new Runnable(this) { // from class: q.a1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b1 f22625c;

            {
                this.f22625c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.f22625c.c(false);
                        return;
                    default:
                        this.f22625c.a();
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f22631g = new Runnable(this) { // from class: q.a1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b1 f22625c;

            {
                this.f22625c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f22625c.c(false);
                        return;
                    default:
                        this.f22625c.a();
                        return;
                }
            }
        };
        this.b = view;
        this.f22628c = charSequence;
        this.f22629d = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(b1 b1Var) {
        b1 b1Var2 = m;
        if (b1Var2 != null) {
            b1Var2.b.removeCallbacks(b1Var2.f22630f);
        }
        m = b1Var;
        if (b1Var != null) {
            b1Var.b.postDelayed(b1Var.f22630f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        b1 b1Var = f22627n;
        View view = this.b;
        if (b1Var == this) {
            f22627n = null;
            c1 c1Var = this.f22634j;
            if (c1Var != null) {
                View view2 = (View) c1Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1Var.f22636a).getSystemService("window")).removeView(view2);
                }
                this.f22634j = null;
                this.l = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (m == this) {
            b(null);
        }
        view.removeCallbacks(this.f22631g);
    }

    public final void c(boolean z8) {
        int height;
        int i9;
        int i10;
        String str;
        int i11;
        String str2;
        int i12;
        long longPressTimeout;
        long j7;
        long j9;
        View view = this.b;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        b1 b1Var = f22627n;
        if (b1Var != null) {
            b1Var.a();
        }
        f22627n = this;
        this.f22635k = z8;
        c1 c1Var = new c1(view.getContext());
        this.f22634j = c1Var;
        int i13 = this.f22632h;
        int i14 = this.f22633i;
        boolean z9 = this.f22635k;
        View view2 = (View) c1Var.b;
        ViewParent parent = view2.getParent();
        Context context = (Context) c1Var.f22636a;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context.getSystemService("window")).removeView(view2);
        }
        ((TextView) c1Var.f22637c).setText(this.f22628c);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c1Var.f22638d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i13 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i14 + dimensionPixelOffset2;
            i9 = i14 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z9) {
            i10 = R.dimen.tooltip_y_offset_touch;
        } else {
            i10 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = (Rect) c1Var.f22639e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i11 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i12 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i12 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i11 = 0;
                rect.set(0, i12, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = (int[]) c1Var.f22641g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) c1Var.f22640f;
            view.getLocationOnScreen(iArr2);
            int i15 = iArr2[i11] - iArr[i11];
            iArr2[i11] = i15;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i15 + i13) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i16 = iArr2[1];
            int i17 = ((i9 + i16) - dimensionPixelOffset3) - measuredHeight;
            int i18 = i16 + height + dimensionPixelOffset3;
            if (z9) {
                if (i17 >= 0) {
                    layoutParams.y = i17;
                } else {
                    layoutParams.y = i18;
                }
            } else if (measuredHeight + i18 <= rect.height()) {
                layoutParams.y = i18;
            } else {
                layoutParams.y = i17;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f22635k) {
            j9 = 2500;
        } else {
            if ((ViewCompat.getWindowSystemUiVisibility(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j7 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j7 = 15000;
            }
            j9 = j7 - longPressTimeout;
        }
        a1 a1Var = this.f22631g;
        view.removeCallbacks(a1Var);
        view.postDelayed(a1Var, j9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f22633i) <= r2) goto L29;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            q.c1 r4 = r3.f22634j
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f22635k
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.b
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.l = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            q.c1 r4 = r3.f22634j
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.l
            if (r1 != 0) goto L66
            int r1 = r3.f22632h
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f22629d
            if (r1 > r2) goto L66
            int r1 = r3.f22633i
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f22632h = r4
            r3.f22633i = r5
            r3.l = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f22632h = view.getWidth() / 2;
        this.f22633i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
