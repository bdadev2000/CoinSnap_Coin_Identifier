package h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.f4;
import androidx.appcompat.widget.i3;
import androidx.appcompat.widget.q1;
import androidx.appcompat.widget.z3;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import n0.r1;
import n0.r2;

/* loaded from: classes.dex */
public final class g0 extends r implements k.m, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    public static final r.k f18567j0 = new r.k();

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f18568k0 = {R.attr.windowBackground};

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f18569l0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: m0, reason: collision with root package name */
    public static final boolean f18570m0 = true;
    public boolean B;
    public ViewGroup C;
    public TextView D;
    public View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public f0[] N;
    public f0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Configuration T;
    public final int U;
    public int V;
    public int W;
    public boolean X;
    public b0 Y;
    public b0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f18571a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f18572b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f18574d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f18575e0;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f18576f0;

    /* renamed from: g0, reason: collision with root package name */
    public l0 f18577g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f18578h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f18579i0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f18580l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f18581m;

    /* renamed from: n, reason: collision with root package name */
    public Window f18582n;

    /* renamed from: o, reason: collision with root package name */
    public a0 f18583o;

    /* renamed from: p, reason: collision with root package name */
    public final n f18584p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f18585q;

    /* renamed from: r, reason: collision with root package name */
    public j.k f18586r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f18587s;

    /* renamed from: t, reason: collision with root package name */
    public q1 f18588t;
    public f.a u;

    /* renamed from: v, reason: collision with root package name */
    public u f18589v;

    /* renamed from: w, reason: collision with root package name */
    public j.c f18590w;

    /* renamed from: x, reason: collision with root package name */
    public ActionBarContextView f18591x;

    /* renamed from: y, reason: collision with root package name */
    public PopupWindow f18592y;

    /* renamed from: z, reason: collision with root package name */
    public t f18593z;
    public r1 A = null;

    /* renamed from: c0, reason: collision with root package name */
    public final t f18573c0 = new t(this, 0);

    public g0(Context context, Window window, n nVar, Object obj) {
        m mVar;
        this.U = -100;
        this.f18581m = context;
        this.f18584p = nVar;
        this.f18580l = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof m) {
                    mVar = (m) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            mVar = null;
            if (mVar != null) {
                this.U = ((g0) mVar.k()).U;
            }
        }
        if (this.U == -100) {
            r.k kVar = f18567j0;
            Integer num = (Integer) kVar.getOrDefault(this.f18580l.getClass().getName(), null);
            if (num != null) {
                this.U = num.intValue();
                kVar.remove(this.f18580l.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        androidx.appcompat.widget.w.c();
    }

    public static j0.k q(Context context) {
        j0.k kVar;
        j0.k kVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (kVar = r.f18650d) == null) {
            return null;
        }
        j0.k b3 = x.b(context.getApplicationContext().getResources().getConfiguration());
        if (kVar.b()) {
            kVar2 = j0.k.f19714b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                j0.l lVar = kVar.a;
                if (i10 >= ((j0.m) b3.a).a.size() + ((j0.m) lVar).a.size()) {
                    break;
                }
                if (i10 < ((j0.m) lVar).a.size()) {
                    locale = ((j0.m) lVar).a.get(i10);
                } else {
                    locale = ((j0.m) b3.a).a.get(i10 - ((j0.m) lVar).a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            kVar2 = new j0.k(new j0.m(j0.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (!kVar2.b()) {
            return kVar2;
        }
        return b3;
    }

    public static Configuration u(Context context, int i10, j0.k kVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (kVar != null) {
            x.d(configuration2, kVar);
        }
        return configuration2;
    }

    public final f0 A(int i10) {
        f0[] f0VarArr = this.N;
        if (f0VarArr == null || f0VarArr.length <= i10) {
            f0[] f0VarArr2 = new f0[i10 + 1];
            if (f0VarArr != null) {
                System.arraycopy(f0VarArr, 0, f0VarArr2, 0, f0VarArr.length);
            }
            this.N = f0VarArr2;
            f0VarArr = f0VarArr2;
        }
        f0 f0Var = f0VarArr[i10];
        if (f0Var == null) {
            f0 f0Var2 = new f0(i10);
            f0VarArr[i10] = f0Var2;
            return f0Var2;
        }
        return f0Var;
    }

    public final Window.Callback B() {
        return this.f18582n.getCallback();
    }

    public final void C() {
        x();
        if (this.H && this.f18585q == null) {
            Object obj = this.f18580l;
            if (obj instanceof Activity) {
                this.f18585q = new w0(this.I, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.f18585q = new w0((Dialog) obj);
            }
            w0 w0Var = this.f18585q;
            if (w0Var != null) {
                w0Var.H(this.f18574d0);
            }
        }
    }

    public final int D(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.Z == null) {
                            this.Z = new b0(this, context);
                        }
                        return this.Z.d();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return z(context).d();
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E() {
        /*
            r5 = this;
            boolean r0 = r5.P
            r1 = 0
            r5.P = r1
            h.f0 r2 = r5.A(r1)
            boolean r3 = r2.f18563m
            r4 = 1
            if (r3 == 0) goto L14
            if (r0 != 0) goto L13
            r5.t(r2, r4)
        L13:
            return r4
        L14:
            j.c r0 = r5.f18590w
            if (r0 == 0) goto L1c
            r0.a()
            return r4
        L1c:
            r5.C()
            h.w0 r0 = r5.f18585q
            if (r0 == 0) goto L50
            androidx.appcompat.widget.r1 r0 = r0.f18682k
            if (r0 == 0) goto L4c
            r2 = r0
            androidx.appcompat.widget.z3 r2 = (androidx.appcompat.widget.z3) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            androidx.appcompat.widget.v3 r2 = r2.N
            if (r2 == 0) goto L36
            k.q r2 = r2.f1064c
            if (r2 == 0) goto L36
            r2 = r4
            goto L37
        L36:
            r2 = r1
        L37:
            if (r2 == 0) goto L4c
            androidx.appcompat.widget.z3 r0 = (androidx.appcompat.widget.z3) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.v3 r0 = r0.N
            if (r0 != 0) goto L43
            r0 = 0
            goto L45
        L43:
            k.q r0 = r0.f1064c
        L45:
            if (r0 == 0) goto L4a
            r0.collapseActionView()
        L4a:
            r0 = r4
            goto L4d
        L4c:
            r0 = r1
        L4d:
            if (r0 == 0) goto L50
            return r4
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.E():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (r2.f20117h.getCount() > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0154, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(h.f0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.F(h.f0, android.view.KeyEvent):void");
    }

    public final boolean G(f0 f0Var, int i10, KeyEvent keyEvent) {
        k.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!f0Var.f18561k && !H(f0Var, keyEvent)) || (oVar = f0Var.f18558h) == null) {
            return false;
        }
        return oVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean H(f0 f0Var, KeyEvent keyEvent) {
        boolean z10;
        q1 q1Var;
        q1 q1Var2;
        Resources.Theme theme;
        int i10;
        boolean z11;
        q1 q1Var3;
        q1 q1Var4;
        if (this.S) {
            return false;
        }
        int i11 = 1;
        if (f0Var.f18561k) {
            return true;
        }
        f0 f0Var2 = this.O;
        if (f0Var2 != null && f0Var2 != f0Var) {
            t(f0Var2, false);
        }
        Window.Callback B = B();
        int i12 = f0Var.a;
        if (B != null) {
            f0Var.f18557g = B.onCreatePanelView(i12);
        }
        if (i12 != 0 && i12 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (q1Var4 = this.f18588t) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) q1Var4;
            actionBarOverlayLayout.l();
            ((z3) actionBarOverlayLayout.f695g).f1114l = true;
        }
        if (f0Var.f18557g == null) {
            k.o oVar = f0Var.f18558h;
            if (oVar == null || f0Var.f18565o) {
                if (oVar == null) {
                    Context context = this.f18581m;
                    if ((i12 == 0 || i12 == 108) && this.f18588t != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.plantcare.ai.identifier.plantid.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.plantcare.ai.identifier.plantid.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.plantcare.ai.identifier.plantid.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            j.f fVar = new j.f(context, 0);
                            fVar.getTheme().setTo(theme);
                            context = fVar;
                        }
                    }
                    k.o oVar2 = new k.o(context);
                    oVar2.f20128e = this;
                    k.o oVar3 = f0Var.f18558h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(f0Var.f18559i);
                        }
                        f0Var.f18558h = oVar2;
                        k.k kVar = f0Var.f18559i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.a);
                        }
                    }
                    if (f0Var.f18558h == null) {
                        return false;
                    }
                }
                if (z10 && (q1Var2 = this.f18588t) != null) {
                    if (this.u == null) {
                        this.u = new f.a(this, i11);
                    }
                    ((ActionBarOverlayLayout) q1Var2).m(f0Var.f18558h, this.u);
                }
                f0Var.f18558h.w();
                if (!B.onCreatePanelMenu(i12, f0Var.f18558h)) {
                    k.o oVar4 = f0Var.f18558h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(f0Var.f18559i);
                        }
                        f0Var.f18558h = null;
                    }
                    if (z10 && (q1Var = this.f18588t) != null) {
                        ((ActionBarOverlayLayout) q1Var).m(null, this.u);
                    }
                    return false;
                }
                f0Var.f18565o = false;
            }
            f0Var.f18558h.w();
            Bundle bundle = f0Var.f18566p;
            if (bundle != null) {
                f0Var.f18558h.s(bundle);
                f0Var.f18566p = null;
            }
            if (!B.onPreparePanel(0, f0Var.f18557g, f0Var.f18558h)) {
                if (z10 && (q1Var3 = this.f18588t) != null) {
                    ((ActionBarOverlayLayout) q1Var3).m(null, this.u);
                }
                f0Var.f18558h.v();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            f0Var.f18558h.setQwertyMode(z11);
            f0Var.f18558h.v();
        }
        f0Var.f18561k = true;
        f0Var.f18562l = false;
        this.O = f0Var;
        return true;
    }

    public final void I() {
        if (!this.B) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f18578h0 != null && (A(0).f18563m || this.f18590w != null)) {
                z10 = true;
            }
            if (z10 && this.f18579i0 == null) {
                this.f18579i0 = z.b(this.f18578h0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f18579i0) != null) {
                z.c(this.f18578h0, onBackInvokedCallback);
            }
        }
    }

    public final int K(r2 r2Var, Rect rect) {
        int i10;
        boolean z10;
        int c10;
        int d10;
        boolean z11;
        int color;
        int i11 = 0;
        if (r2Var != null) {
            i10 = r2Var.e();
        } else if (rect != null) {
            i10 = rect.top;
        } else {
            i10 = 0;
        }
        ActionBarContextView actionBarContextView = this.f18591x;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f18591x.getLayoutParams();
            boolean z12 = true;
            if (this.f18591x.isShown()) {
                if (this.f18575e0 == null) {
                    this.f18575e0 = new Rect();
                    this.f18576f0 = new Rect();
                }
                Rect rect2 = this.f18575e0;
                Rect rect3 = this.f18576f0;
                if (r2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(r2Var.c(), r2Var.e(), r2Var.d(), r2Var.b());
                }
                ViewGroup viewGroup = this.C;
                Method method = f4.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                r2 rootWindowInsets = ViewCompat.getRootWindowInsets(this.C);
                if (rootWindowInsets == null) {
                    c10 = 0;
                } else {
                    c10 = rootWindowInsets.c();
                }
                if (rootWindowInsets == null) {
                    d10 = 0;
                } else {
                    d10 = rootWindowInsets.d();
                }
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z11 = true;
                }
                Context context = this.f18581m;
                if (i12 > 0 && this.E == null) {
                    View view = new View(context);
                    this.E = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c10;
                    layoutParams.rightMargin = d10;
                    this.C.addView(this.E, -1, layoutParams);
                } else {
                    View view2 = this.E;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != c10 || marginLayoutParams2.rightMargin != d10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = c10;
                            marginLayoutParams2.rightMargin = d10;
                            this.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.E;
                if (view3 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && view3.getVisibility() != 0) {
                    View view4 = this.E;
                    if ((ViewCompat.getWindowSystemUiVisibility(view4) & 8192) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        color = d0.h.getColor(context, com.plantcare.ai.identifier.plantid.R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = d0.h.getColor(context, com.plantcare.ai.identifier.plantid.R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(color);
                }
                if (!this.J && z10) {
                    i10 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                this.f18591x.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view5 = this.E;
        if (view5 != null) {
            if (!z10) {
                i11 = 8;
            }
            view5.setVisibility(i11);
        }
        return i10;
    }

    @Override // h.r
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ((ViewGroup) this.C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f18583o.a(this.f18582n.getCallback());
    }

    @Override // h.r
    public final void b() {
        LayoutInflater from = LayoutInflater.from(this.f18581m);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof g0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.r
    public final void c() {
        if (this.f18585q != null) {
            C();
            this.f18585q.getClass();
            this.f18572b0 |= 1;
            if (!this.f18571a0) {
                ViewCompat.postOnAnimation(this.f18582n.getDecorView(), this.f18573c0);
                this.f18571a0 = true;
            }
        }
    }

    @Override // k.m
    public final boolean e(k.o oVar, MenuItem menuItem) {
        int i10;
        int i11;
        f0 f0Var;
        Window.Callback B = B();
        if (B != null && !this.S) {
            k.o k10 = oVar.k();
            f0[] f0VarArr = this.N;
            if (f0VarArr != null) {
                i10 = f0VarArr.length;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    f0Var = f0VarArr[i11];
                    if (f0Var != null && f0Var.f18558h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    f0Var = null;
                    break;
                }
            }
            if (f0Var != null) {
                return B.onMenuItemSelected(f0Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // h.r
    public final void f(Bundle bundle) {
        String str;
        this.Q = true;
        o(false, true);
        y();
        Object obj = this.f18580l;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = com.bumptech.glide.c.B(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                w0 w0Var = this.f18585q;
                if (w0Var == null) {
                    this.f18574d0 = true;
                } else {
                    w0Var.H(true);
                }
            }
            synchronized (r.f18655j) {
                r.h(this);
                r.f18654i.add(new WeakReference(this));
            }
        }
        this.T = new Configuration(this.f18581m.getResources().getConfiguration());
        this.R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18580l
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.r.f18655j
            monitor-enter(r0)
            h.r.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f18571a0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f18582n
            android.view.View r0 = r0.getDecorView()
            h.t r1 = r3.f18573c0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.S = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f18580l
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            r.k r0 = h.g0.f18567j0
            java.lang.Object r1 = r3.f18580l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            r.k r0 = h.g0.f18567j0
            java.lang.Object r1 = r3.f18580l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            h.b0 r0 = r3.Y
            if (r0 == 0) goto L63
            r0.a()
        L63:
            h.b0 r0 = r3.Z
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.g():void");
    }

    @Override // h.r
    public final boolean i(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.L && i10 == 108) {
            return false;
        }
        if (this.H && i10 == 1) {
            this.H = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f18582n.requestFeature(i10);
                            }
                            I();
                            this.I = true;
                            return true;
                        }
                        I();
                        this.H = true;
                        return true;
                    }
                    I();
                    this.J = true;
                    return true;
                }
                I();
                this.G = true;
                return true;
            }
            I();
            this.F = true;
            return true;
        }
        I();
        this.L = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    @Override // k.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(k.o r6) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.j(k.o):void");
    }

    @Override // h.r
    public final void k(int i10) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f18581m).inflate(i10, viewGroup);
        this.f18583o.a(this.f18582n.getCallback());
    }

    @Override // h.r
    public final void l(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f18583o.a(this.f18582n.getCallback());
    }

    @Override // h.r
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f18583o.a(this.f18582n.getCallback());
    }

    @Override // h.r
    public final void n(CharSequence charSequence) {
        this.f18587s = charSequence;
        q1 q1Var = this.f18588t;
        if (q1Var != null) {
            q1Var.setWindowTitle(charSequence);
            return;
        }
        w0 w0Var = this.f18585q;
        if (w0Var != null) {
            w0Var.J(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.o(boolean, boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0112, code lost:
    
        if (r10.equals("ImageButton") == false) goto L80;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f18582n == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof a0)) {
                a0 a0Var = new a0(this, callback);
                this.f18583o = a0Var;
                window.setCallback(a0Var);
                int[] iArr = f18568k0;
                Context context = this.f18581m;
                i3 i3Var = new i3(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
                Drawable f10 = i3Var.f(0);
                if (f10 != null) {
                    window.setBackgroundDrawable(f10);
                }
                i3Var.o();
                this.f18582n = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f18578h0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f18579i0) != null) {
                        z.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f18579i0 = null;
                    }
                    Object obj = this.f18580l;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f18578h0 = z.a(activity);
                            J();
                            return;
                        }
                    }
                    this.f18578h0 = null;
                    J();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void r(int i10, f0 f0Var, k.o oVar) {
        if (oVar == null) {
            if (f0Var == null && i10 >= 0) {
                f0[] f0VarArr = this.N;
                if (i10 < f0VarArr.length) {
                    f0Var = f0VarArr[i10];
                }
            }
            if (f0Var != null) {
                oVar = f0Var.f18558h;
            }
        }
        if ((f0Var == null || f0Var.f18563m) && !this.S) {
            a0 a0Var = this.f18583o;
            Window.Callback callback = this.f18582n.getCallback();
            a0Var.getClass();
            try {
                a0Var.f18514f = true;
                callback.onPanelClosed(i10, oVar);
            } finally {
                a0Var.f18514f = false;
            }
        }
    }

    public final void s(k.o oVar) {
        androidx.appcompat.widget.m mVar;
        if (this.M) {
            return;
        }
        this.M = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18588t;
        actionBarOverlayLayout.l();
        ActionMenuView actionMenuView = ((z3) actionBarOverlayLayout.f695g).a.f772b;
        if (actionMenuView != null && (mVar = actionMenuView.f717v) != null) {
            mVar.j();
            androidx.appcompat.widget.h hVar = mVar.f934v;
            if (hVar != null && hVar.b()) {
                hVar.f20050j.dismiss();
            }
        }
        Window.Callback B = B();
        if (B != null && !this.S) {
            B.onPanelClosed(108, oVar);
        }
        this.M = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(h.f0 r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L35
            int r2 = r6.a
            if (r2 != 0) goto L35
            androidx.appcompat.widget.q1 r2 = r5.f18588t
            if (r2 == 0) goto L35
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.l()
            androidx.appcompat.widget.r1 r2 = r2.f695g
            androidx.appcompat.widget.z3 r2 = (androidx.appcompat.widget.z3) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f772b
            if (r2 == 0) goto L2c
            androidx.appcompat.widget.m r2 = r2.f717v
            if (r2 == 0) goto L27
            boolean r2 = r2.k()
            if (r2 == 0) goto L27
            r2 = r0
            goto L28
        L27:
            r2 = r1
        L28:
            if (r2 == 0) goto L2c
            r2 = r0
            goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 == 0) goto L35
            k.o r6 = r6.f18558h
            r5.s(r6)
            return
        L35:
            android.content.Context r2 = r5.f18581m
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L54
            boolean r4 = r6.f18563m
            if (r4 == 0) goto L54
            h.e0 r4 = r6.f18555e
            if (r4 == 0) goto L54
            r2.removeView(r4)
            if (r7 == 0) goto L54
            int r7 = r6.a
            r5.r(r7, r6, r3)
        L54:
            r6.f18561k = r1
            r6.f18562l = r1
            r6.f18563m = r1
            r6.f18556f = r3
            r6.f18564n = r0
            h.f0 r7 = r5.O
            if (r7 != r6) goto L64
            r5.O = r3
        L64:
            int r6 = r6.a
            if (r6 != 0) goto L6b
            r5.J()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.t(h.f0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ff, code lost:
    
        if (r7 != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i10) {
        f0 A = A(i10);
        if (A.f18558h != null) {
            Bundle bundle = new Bundle();
            A.f18558h.t(bundle);
            if (bundle.size() > 0) {
                A.f18566p = bundle;
            }
            A.f18558h.w();
            A.f18558h.clear();
        }
        A.f18565o = true;
        A.f18564n = true;
        if ((i10 == 108 || i10 == 0) && this.f18588t != null) {
            f0 A2 = A(0);
            A2.f18561k = false;
            H(A2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.B) {
            int[] iArr = g.a.f17887j;
            Context context2 = this.f18581m;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                int i10 = 1;
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    i(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    i(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    i(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    i(10);
                }
                this.K = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                y();
                this.f18582n.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.L) {
                    if (this.K) {
                        viewGroup = (ViewGroup) from.inflate(com.plantcare.ai.identifier.plantid.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.I = false;
                        this.H = false;
                    } else if (this.H) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.plantcare.ai.identifier.plantid.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new j.f(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.plantcare.ai.identifier.plantid.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        q1 q1Var = (q1) viewGroup.findViewById(com.plantcare.ai.identifier.plantid.R.id.decor_content_parent);
                        this.f18588t = q1Var;
                        q1Var.setWindowCallback(B());
                        if (this.I) {
                            ((ActionBarOverlayLayout) this.f18588t).k(109);
                        }
                        if (this.F) {
                            ((ActionBarOverlayLayout) this.f18588t).k(2);
                        }
                        if (this.G) {
                            ((ActionBarOverlayLayout) this.f18588t).k(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.J ? (ViewGroup) from.inflate(com.plantcare.ai.identifier.plantid.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.plantcare.ai.identifier.plantid.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new u(this));
                    if (this.f18588t == null) {
                        this.D = (TextView) viewGroup.findViewById(com.plantcare.ai.identifier.plantid.R.id.title);
                    }
                    Method method = f4.a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.plantcare.ai.identifier.plantid.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f18582n.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f18582n.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new kc.c(this, i10));
                    this.C = viewGroup;
                    Object obj = this.f18580l;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f18587s;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        q1 q1Var2 = this.f18588t;
                        if (q1Var2 != null) {
                            q1Var2.setWindowTitle(charSequence);
                        } else {
                            w0 w0Var = this.f18585q;
                            if (w0Var != null) {
                                w0Var.J(charSequence);
                            } else {
                                TextView textView = this.D;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.C.findViewById(R.id.content);
                    View decorView = this.f18582n.getDecorView();
                    contentFrameLayout2.f732i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (ViewCompat.isLaidOut(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.B = true;
                    f0 A = A(0);
                    if (!this.S && A.f18558h == null) {
                        this.f18572b0 |= 4096;
                        if (!this.f18571a0) {
                            ViewCompat.postOnAnimation(this.f18582n.getDecorView(), this.f18573c0);
                            this.f18571a0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void y() {
        if (this.f18582n == null) {
            Object obj = this.f18580l;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f18582n != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final d0 z(Context context) {
        if (this.Y == null) {
            if (c.f18521g == null) {
                Context applicationContext = context.getApplicationContext();
                c.f18521g = new c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Y = new b0(this, c.f18521g);
        }
        return this.Y;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
