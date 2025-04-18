package androidx.appcompat.widget;

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
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class c4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: m, reason: collision with root package name */
    public static c4 f828m;

    /* renamed from: n, reason: collision with root package name */
    public static c4 f829n;

    /* renamed from: b, reason: collision with root package name */
    public final View f830b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f831c;

    /* renamed from: d, reason: collision with root package name */
    public final int f832d;

    /* renamed from: f, reason: collision with root package name */
    public final b4 f833f;

    /* renamed from: g, reason: collision with root package name */
    public final b4 f834g;

    /* renamed from: h, reason: collision with root package name */
    public int f835h;

    /* renamed from: i, reason: collision with root package name */
    public int f836i;

    /* renamed from: j, reason: collision with root package name */
    public ob.c f837j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f838k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f839l = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.b4] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.b4] */
    public c4(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f833f = new Runnable(this) { // from class: androidx.appcompat.widget.b4

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c4 f820c;

            {
                this.f820c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                c4 c4Var = this.f820c;
                switch (i11) {
                    case 0:
                        c4Var.c(false);
                        return;
                    default:
                        c4Var.a();
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f834g = new Runnable(this) { // from class: androidx.appcompat.widget.b4

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c4 f820c;

            {
                this.f820c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                c4 c4Var = this.f820c;
                switch (i112) {
                    case 0:
                        c4Var.c(false);
                        return;
                    default:
                        c4Var.a();
                        return;
                }
            }
        };
        this.f830b = view;
        this.f831c = charSequence;
        this.f832d = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(c4 c4Var) {
        c4 c4Var2 = f828m;
        if (c4Var2 != null) {
            c4Var2.f830b.removeCallbacks(c4Var2.f833f);
        }
        f828m = c4Var;
        if (c4Var != null) {
            c4Var.f830b.postDelayed(c4Var.f833f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z10;
        c4 c4Var = f829n;
        View view = this.f830b;
        if (c4Var == this) {
            f829n = null;
            ob.c cVar = this.f837j;
            if (cVar != null) {
                if (((View) cVar.f23292b).getParent() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((WindowManager) ((Context) cVar.a).getSystemService("window")).removeView((View) cVar.f23292b);
                }
                this.f837j = null;
                this.f839l = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f828m == this) {
            b(null);
        }
        view.removeCallbacks(this.f834g);
    }

    public final void c(boolean z10) {
        boolean z11;
        int height;
        int i10;
        int i11;
        int i12;
        long longPressTimeout;
        long j3;
        long j10;
        boolean z12;
        View view = this.f830b;
        if (!ViewCompat.isAttachedToWindow(view)) {
            return;
        }
        b(null);
        c4 c4Var = f829n;
        if (c4Var != null) {
            c4Var.a();
        }
        f829n = this;
        this.f838k = z10;
        ob.c cVar = new ob.c(view.getContext(), 1);
        this.f837j = cVar;
        int i13 = this.f835h;
        int i14 = this.f836i;
        boolean z13 = this.f838k;
        if (((View) cVar.f23292b).getParent() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (((View) cVar.f23292b).getParent() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ((WindowManager) ((Context) cVar.a).getSystemService("window")).removeView((View) cVar.f23292b);
            }
        }
        ((TextView) cVar.f23293c).setText(this.f831c);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) cVar.f23294d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) cVar.a).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i13 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) cVar.a).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i14 + dimensionPixelOffset2;
            i10 = i14 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = ((Context) cVar.a).getResources();
        if (z13) {
            i11 = R.dimen.tooltip_y_offset_touch;
        } else {
            i11 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) cVar.f23295e);
            Rect rect = (Rect) cVar.f23295e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = ((Context) cVar.a).getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i12 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i12 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                ((Rect) cVar.f23295e).set(0, i12, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) cVar.f23297g);
            view.getLocationOnScreen((int[]) cVar.f23296f);
            int[] iArr = (int[]) cVar.f23296f;
            int i15 = iArr[0];
            int[] iArr2 = (int[]) cVar.f23297g;
            int i16 = i15 - iArr2[0];
            iArr[0] = i16;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i16 + i13) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) cVar.f23292b).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) cVar.f23292b).getMeasuredHeight();
            int i17 = ((int[]) cVar.f23296f)[1];
            int i18 = ((i10 + i17) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (z13) {
                if (i18 >= 0) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i19;
                }
            } else if (measuredHeight + i19 <= ((Rect) cVar.f23295e).height()) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i18;
            }
        }
        ((WindowManager) ((Context) cVar.a).getSystemService("window")).addView((View) cVar.f23292b, (WindowManager.LayoutParams) cVar.f23294d);
        view.addOnAttachStateChangeListener(this);
        if (this.f838k) {
            j10 = 2500;
        } else {
            if ((ViewCompat.getWindowSystemUiVisibility(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 15000;
            }
            j10 = j3 - longPressTimeout;
        }
        b4 b4Var = this.f834g;
        view.removeCallbacks(b4Var);
        view.postDelayed(b4Var, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            ob.c r5 = r4.f837j
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f838k
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f830b
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.f839l = r3
            r4.a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            ob.c r5 = r4.f837j
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.f839l
            if (r1 != 0) goto L69
            int r1 = r4.f835h
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f832d
            if (r1 > r2) goto L69
            int r1 = r4.f836i
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f835h = r5
            r4.f836i = r6
            r4.f839l = r0
        L6f:
            if (r3 == 0) goto L74
            b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c4.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f835h = view.getWidth() / 2;
        this.f836i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
