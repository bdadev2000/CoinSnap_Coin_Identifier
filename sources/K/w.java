package k;

import T.C0275i0;
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
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.AbstractC0408i;
import androidx.core.view.ViewCompat;
import com.facebook.internal.C1838g;
import j.AbstractC2379a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import p.C2529h;
import p.C2535n;
import p.InterfaceC2531j;
import p.MenuC2533l;
import q.C2597f;
import q.C2605j;
import q.C2624t;
import q.InterfaceC2602h0;
import q.InterfaceC2604i0;
import q.T0;
import q.Y0;
import q.g1;

/* loaded from: classes.dex */
public final class w extends AbstractC2422k implements InterfaceC2531j, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    public static final x.l f21342j0 = new x.l();

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f21343k0 = {R.attr.windowBackground};

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f21344l0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: B, reason: collision with root package name */
    public boolean f21346B;

    /* renamed from: C, reason: collision with root package name */
    public ViewGroup f21347C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f21348D;

    /* renamed from: E, reason: collision with root package name */
    public View f21349E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f21350F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21351G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f21352H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f21353I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f21354J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f21355K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f21356L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f21357M;

    /* renamed from: N, reason: collision with root package name */
    public v[] f21358N;
    public v O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f21359P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f21360Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f21361R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f21362S;

    /* renamed from: T, reason: collision with root package name */
    public Configuration f21363T;

    /* renamed from: U, reason: collision with root package name */
    public final int f21364U;

    /* renamed from: V, reason: collision with root package name */
    public int f21365V;

    /* renamed from: W, reason: collision with root package name */
    public int f21366W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f21367X;

    /* renamed from: Y, reason: collision with root package name */
    public t f21368Y;

    /* renamed from: Z, reason: collision with root package name */
    public t f21369Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f21370a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f21371b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f21373d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f21374e0;
    public Rect f0;

    /* renamed from: g0, reason: collision with root package name */
    public C2404A f21375g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f21376h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f21377i0;
    public final Object l;
    public final Context m;

    /* renamed from: n, reason: collision with root package name */
    public Window f21378n;

    /* renamed from: o, reason: collision with root package name */
    public s f21379o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2418g f21380p;

    /* renamed from: q, reason: collision with root package name */
    public C2411H f21381q;

    /* renamed from: r, reason: collision with root package name */
    public o.i f21382r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f21383s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC2602h0 f21384t;

    /* renamed from: u, reason: collision with root package name */
    public C2426o f21385u;

    /* renamed from: v, reason: collision with root package name */
    public C2424m f21386v;

    /* renamed from: w, reason: collision with root package name */
    public o.b f21387w;

    /* renamed from: x, reason: collision with root package name */
    public ActionBarContextView f21388x;

    /* renamed from: y, reason: collision with root package name */
    public PopupWindow f21389y;

    /* renamed from: z, reason: collision with root package name */
    public RunnableC2423l f21390z;

    /* renamed from: A, reason: collision with root package name */
    public C0275i0 f21345A = null;

    /* renamed from: c0, reason: collision with root package name */
    public final RunnableC2423l f21372c0 = new RunnableC2423l(this, 0);

    public w(Context context, Window window, InterfaceC2418g interfaceC2418g, Object obj) {
        AbstractActivityC2417f abstractActivityC2417f;
        this.f21364U = -100;
        this.m = context;
        this.f21380p = interfaceC2418g;
        this.l = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof AbstractActivityC2417f) {
                    abstractActivityC2417f = (AbstractActivityC2417f) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            abstractActivityC2417f = null;
            if (abstractActivityC2417f != null) {
                this.f21364U = ((w) abstractActivityC2417f.i()).f21364U;
            }
        }
        if (this.f21364U == -100) {
            x.l lVar = f21342j0;
            Integer num = (Integer) lVar.getOrDefault(this.l.getClass().getName(), null);
            if (num != null) {
                this.f21364U = num.intValue();
                lVar.remove(this.l.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        C2624t.c();
    }

    public static P.l p(Context context) {
        P.l lVar;
        P.l lVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (lVar = AbstractC2422k.f21311d) == null) {
            return null;
        }
        P.l b = q.b(context.getApplicationContext().getResources().getConfiguration());
        P.m mVar = lVar.f2264a;
        if (mVar.f2265a.isEmpty()) {
            lVar2 = P.l.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i9 = 0; i9 < b.f2264a.f2265a.size() + mVar.f2265a.size(); i9++) {
                if (i9 < mVar.f2265a.size()) {
                    locale = mVar.f2265a.get(i9);
                } else {
                    locale = b.f2264a.f2265a.get(i9 - mVar.f2265a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            lVar2 = new P.l(new P.m(P.k.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (!lVar2.f2264a.f2265a.isEmpty()) {
            return lVar2;
        }
        return b;
    }

    public static Configuration t(Context context, int i9, P.l lVar, Configuration configuration, boolean z8) {
        int i10;
        if (i9 != 1) {
            if (i9 != 2) {
                if (z8) {
                    i10 = 0;
                } else {
                    i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i10 = 32;
            }
        } else {
            i10 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (lVar != null) {
            q.d(configuration2, lVar);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.f21352H && this.f21381q == null) {
            Object obj = this.l;
            if (obj instanceof Activity) {
                this.f21381q = new C2411H((Activity) obj, this.f21353I);
            } else if (obj instanceof Dialog) {
                this.f21381q = new C2411H((Dialog) obj);
            }
            C2411H c2411h = this.f21381q;
            if (c2411h != null) {
                c2411h.B(this.f21373d0);
            }
        }
    }

    public final int B(Context context, int i9) {
        if (i9 == -100) {
            return -1;
        }
        if (i9 != -1) {
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 3) {
                        if (this.f21369Z == null) {
                            this.f21369Z = new t(this, context);
                        }
                        return this.f21369Z.e();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return y(context).e();
            }
        }
        return i9;
    }

    public final boolean C() {
        InterfaceC2604i0 interfaceC2604i0;
        T0 t02;
        C2535n c2535n;
        boolean z8 = this.f21359P;
        this.f21359P = false;
        v z9 = z(0);
        if (z9.m) {
            if (!z8) {
                s(z9, true);
            }
            return true;
        }
        o.b bVar = this.f21387w;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        A();
        C2411H c2411h = this.f21381q;
        if (c2411h == null || (interfaceC2604i0 = c2411h.f21243g) == null || (t02 = ((Y0) interfaceC2604i0).f22611a.f4290N) == null || t02.f22594c == null) {
            return false;
        }
        T0 t03 = ((Y0) interfaceC2604i0).f22611a.f4290N;
        if (t03 == null) {
            c2535n = null;
        } else {
            c2535n = t03.f22594c;
        }
        if (c2535n != null) {
            c2535n.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        if (r3.f22095h.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(k.v r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.D(k.v, android.view.KeyEvent):void");
    }

    public final boolean E(v vVar, int i9, KeyEvent keyEvent) {
        MenuC2533l menuC2533l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!vVar.f21338k && !F(vVar, keyEvent)) || (menuC2533l = vVar.f21335h) == null) {
            return false;
        }
        return menuC2533l.performShortcut(i9, keyEvent, 1);
    }

    public final boolean F(v vVar, KeyEvent keyEvent) {
        boolean z8;
        InterfaceC2602h0 interfaceC2602h0;
        InterfaceC2602h0 interfaceC2602h02;
        Resources.Theme theme;
        int i9;
        boolean z9;
        InterfaceC2602h0 interfaceC2602h03;
        InterfaceC2602h0 interfaceC2602h04;
        if (this.f21362S) {
            return false;
        }
        if (vVar.f21338k) {
            return true;
        }
        v vVar2 = this.O;
        if (vVar2 != null && vVar2 != vVar) {
            s(vVar2, false);
        }
        Window.Callback callback = this.f21378n.getCallback();
        int i10 = vVar.f21329a;
        if (callback != null) {
            vVar.f21334g = callback.onCreatePanelView(i10);
        }
        if (i10 != 0 && i10 != 108) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8 && (interfaceC2602h04 = this.f21384t) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2602h04;
            actionBarOverlayLayout.k();
            ((Y0) actionBarOverlayLayout.f4177g).l = true;
        }
        if (vVar.f21334g == null) {
            MenuC2533l menuC2533l = vVar.f21335h;
            if (menuC2533l == null || vVar.f21340o) {
                if (menuC2533l == null) {
                    Context context = this.m;
                    if ((i10 == 0 || i10 == 108) && this.f21384t != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.tools.arruler.photomeasure.camera.ruler.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.tools.arruler.photomeasure.camera.ruler.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.tools.arruler.photomeasure.camera.ruler.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            o.d dVar = new o.d(context, 0);
                            dVar.getTheme().setTo(theme);
                            context = dVar;
                        }
                    }
                    MenuC2533l menuC2533l2 = new MenuC2533l(context);
                    menuC2533l2.f22105g = this;
                    MenuC2533l menuC2533l3 = vVar.f21335h;
                    if (menuC2533l2 != menuC2533l3) {
                        if (menuC2533l3 != null) {
                            menuC2533l3.r(vVar.f21336i);
                        }
                        vVar.f21335h = menuC2533l2;
                        C2529h c2529h = vVar.f21336i;
                        if (c2529h != null) {
                            menuC2533l2.b(c2529h, menuC2533l2.b);
                        }
                    }
                    if (vVar.f21335h == null) {
                        return false;
                    }
                }
                if (z8 && (interfaceC2602h02 = this.f21384t) != null) {
                    if (this.f21385u == null) {
                        this.f21385u = new C2426o(this, 0);
                    }
                    ((ActionBarOverlayLayout) interfaceC2602h02).l(vVar.f21335h, this.f21385u);
                }
                vVar.f21335h.w();
                if (!callback.onCreatePanelMenu(i10, vVar.f21335h)) {
                    MenuC2533l menuC2533l4 = vVar.f21335h;
                    if (menuC2533l4 != null) {
                        if (menuC2533l4 != null) {
                            menuC2533l4.r(vVar.f21336i);
                        }
                        vVar.f21335h = null;
                    }
                    if (z8 && (interfaceC2602h0 = this.f21384t) != null) {
                        ((ActionBarOverlayLayout) interfaceC2602h0).l(null, this.f21385u);
                    }
                    return false;
                }
                vVar.f21340o = false;
            }
            vVar.f21335h.w();
            Bundle bundle = vVar.f21341p;
            if (bundle != null) {
                vVar.f21335h.s(bundle);
                vVar.f21341p = null;
            }
            if (!callback.onPreparePanel(0, vVar.f21334g, vVar.f21335h)) {
                if (z8 && (interfaceC2602h03 = this.f21384t) != null) {
                    ((ActionBarOverlayLayout) interfaceC2602h03).l(null, this.f21385u);
                }
                vVar.f21335h.v();
                return false;
            }
            if (keyEvent != null) {
                i9 = keyEvent.getDeviceId();
            } else {
                i9 = -1;
            }
            if (KeyCharacterMap.load(i9).getKeyboardType() != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            vVar.f21335h.setQwertyMode(z9);
            vVar.f21335h.v();
        }
        vVar.f21338k = true;
        vVar.l = false;
        this.O = vVar;
        return true;
    }

    public final void G() {
        if (!this.f21346B) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z8 = false;
            if (this.f21376h0 != null && (z(0).m || this.f21387w != null)) {
                z8 = true;
            }
            if (z8 && this.f21377i0 == null) {
                this.f21377i0 = r.b(this.f21376h0, this);
            } else if (!z8 && (onBackInvokedCallback = this.f21377i0) != null) {
                r.c(this.f21376h0, onBackInvokedCallback);
                this.f21377i0 = null;
            }
        }
    }

    @Override // k.AbstractC2422k
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.m);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof w)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p.InterfaceC2531j
    public final boolean b(MenuC2533l menuC2533l, MenuItem menuItem) {
        int i9;
        v vVar;
        Window.Callback callback = this.f21378n.getCallback();
        if (callback != null && !this.f21362S) {
            MenuC2533l k6 = menuC2533l.k();
            v[] vVarArr = this.f21358N;
            if (vVarArr != null) {
                i9 = vVarArr.length;
            } else {
                i9 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    vVar = vVarArr[i10];
                    if (vVar != null && vVar.f21335h == k6) {
                        break;
                    }
                    i10++;
                } else {
                    vVar = null;
                    break;
                }
            }
            if (vVar != null) {
                return callback.onMenuItemSelected(vVar.f21329a, menuItem);
            }
        }
        return false;
    }

    @Override // k.AbstractC2422k
    public final void c() {
        if (this.f21381q != null) {
            A();
            this.f21381q.getClass();
            this.f21371b0 |= 1;
            if (!this.f21370a0) {
                ViewCompat.postOnAnimation(this.f21378n.getDecorView(), this.f21372c0);
                this.f21370a0 = true;
            }
        }
    }

    @Override // k.AbstractC2422k
    public final void e() {
        String str;
        this.f21360Q = true;
        n(false, true);
        x();
        Object obj = this.l;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0408i.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C2411H c2411h = this.f21381q;
                if (c2411h == null) {
                    this.f21373d0 = true;
                } else {
                    c2411h.B(true);
                }
            }
            synchronized (AbstractC2422k.f21316j) {
                AbstractC2422k.h(this);
                AbstractC2422k.f21315i.add(new WeakReference(this));
            }
        }
        this.f21363T = new Configuration(this.m.getResources().getConfiguration());
        this.f21361R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // k.AbstractC2422k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.l
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = k.AbstractC2422k.f21316j
            monitor-enter(r0)
            k.AbstractC2422k.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f21370a0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f21378n
            android.view.View r0 = r0.getDecorView()
            k.l r1 = r3.f21372c0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f21362S = r0
            int r0 = r3.f21364U
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.l
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            x.l r0 = k.w.f21342j0
            java.lang.Object r1 = r3.l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f21364U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            x.l r0 = k.w.f21342j0
            java.lang.Object r1 = r3.l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            k.t r0 = r3.f21368Y
            if (r0 == 0) goto L63
            r0.c()
        L63:
            k.t r0 = r3.f21369Z
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.f():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // p.InterfaceC2531j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(p.MenuC2533l r6) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.g(p.l):void");
    }

    @Override // k.AbstractC2422k
    public final boolean i(int i9) {
        if (i9 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i9 = 108;
        } else if (i9 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i9 = 109;
        }
        if (this.f21356L && i9 == 108) {
            return false;
        }
        if (this.f21352H && i9 == 1) {
            this.f21352H = false;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 5) {
                    if (i9 != 10) {
                        if (i9 != 108) {
                            if (i9 != 109) {
                                return this.f21378n.requestFeature(i9);
                            }
                            G();
                            this.f21353I = true;
                            return true;
                        }
                        G();
                        this.f21352H = true;
                        return true;
                    }
                    G();
                    this.f21354J = true;
                    return true;
                }
                G();
                this.f21351G = true;
                return true;
            }
            G();
            this.f21350F = true;
            return true;
        }
        G();
        this.f21356L = true;
        return true;
    }

    @Override // k.AbstractC2422k
    public final void j(int i9) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f21347C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.m).inflate(i9, viewGroup);
        this.f21379o.a(this.f21378n.getCallback());
    }

    @Override // k.AbstractC2422k
    public final void k(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f21347C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f21379o.a(this.f21378n.getCallback());
    }

    @Override // k.AbstractC2422k
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f21347C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f21379o.a(this.f21378n.getCallback());
    }

    @Override // k.AbstractC2422k
    public final void m(CharSequence charSequence) {
        this.f21383s = charSequence;
        InterfaceC2602h0 interfaceC2602h0 = this.f21384t;
        if (interfaceC2602h0 != null) {
            interfaceC2602h0.setWindowTitle(charSequence);
            return;
        }
        C2411H c2411h = this.f21381q;
        if (c2411h != null) {
            Y0 y02 = (Y0) c2411h.f21243g;
            if (!y02.f22616g) {
                y02.f22617h = charSequence;
                if ((y02.b & 8) != 0) {
                    Toolbar toolbar = y02.f22611a;
                    toolbar.setTitle(charSequence);
                    if (y02.f22616g) {
                        ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.f21348D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.n(boolean, boolean):boolean");
    }

    public final void o(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f21378n == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof s)) {
                s sVar = new s(this, callback);
                this.f21379o = sVar;
                window.setCallback(sVar);
                int[] iArr = f21343k0;
                Context context = this.m;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C2624t a6 = C2624t.a();
                    synchronized (a6) {
                        drawable = a6.f22726a.f(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f21378n = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f21376h0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f21377i0) != null) {
                        r.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f21377i0 = null;
                    }
                    Object obj = this.l;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f21376h0 = r.a(activity);
                            H();
                            return;
                        }
                    }
                    this.f21376h0 = null;
                    H();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x010d, code lost:
    
        if (r12.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i9, v vVar, MenuC2533l menuC2533l) {
        if (menuC2533l == null) {
            if (vVar == null && i9 >= 0) {
                v[] vVarArr = this.f21358N;
                if (i9 < vVarArr.length) {
                    vVar = vVarArr[i9];
                }
            }
            if (vVar != null) {
                menuC2533l = vVar.f21335h;
            }
        }
        if ((vVar == null || vVar.m) && !this.f21362S) {
            s sVar = this.f21379o;
            Window.Callback callback = this.f21378n.getCallback();
            sVar.getClass();
            try {
                sVar.f21323f = true;
                callback.onPanelClosed(i9, menuC2533l);
            } finally {
                sVar.f21323f = false;
            }
        }
    }

    public final void r(MenuC2533l menuC2533l) {
        C2605j c2605j;
        if (this.f21357M) {
            return;
        }
        this.f21357M = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f21384t;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f4177g).f22611a.b;
        if (actionMenuView != null && (c2605j = actionMenuView.f4202v) != null) {
            c2605j.g();
            C2597f c2597f = c2605j.f22676v;
            if (c2597f != null && c2597f.b()) {
                c2597f.f22166j.dismiss();
            }
        }
        Window.Callback callback = this.f21378n.getCallback();
        if (callback != null && !this.f21362S) {
            callback.onPanelClosed(108, menuC2533l);
        }
        this.f21357M = false;
    }

    public final void s(v vVar, boolean z8) {
        u uVar;
        InterfaceC2602h0 interfaceC2602h0;
        C2605j c2605j;
        if (z8 && vVar.f21329a == 0 && (interfaceC2602h0 = this.f21384t) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2602h0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f4177g).f22611a.b;
            if (actionMenuView != null && (c2605j = actionMenuView.f4202v) != null && c2605j.k()) {
                r(vVar.f21335h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.m.getSystemService("window");
        if (windowManager != null && vVar.m && (uVar = vVar.f21332e) != null) {
            windowManager.removeView(uVar);
            if (z8) {
                q(vVar.f21329a, vVar, null);
            }
        }
        vVar.f21338k = false;
        vVar.l = false;
        vVar.m = false;
        vVar.f21333f = null;
        vVar.f21339n = true;
        if (this.O == vVar) {
            this.O = null;
        }
        if (vVar.f21329a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.g() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (r7.l() != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i9) {
        v z8 = z(i9);
        if (z8.f21335h != null) {
            Bundle bundle = new Bundle();
            z8.f21335h.t(bundle);
            if (bundle.size() > 0) {
                z8.f21341p = bundle;
            }
            z8.f21335h.w();
            z8.f21335h.clear();
        }
        z8.f21340o = true;
        z8.f21339n = true;
        if ((i9 == 108 || i9 == 0) && this.f21384t != null) {
            v z9 = z(0);
            z9.f21338k = false;
            F(z9, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f21346B) {
            int[] iArr = AbstractC2379a.f20950j;
            Context context2 = this.m;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
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
                this.f21355K = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                x();
                this.f21378n.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f21356L) {
                    if (this.f21355K) {
                        viewGroup = (ViewGroup) from.inflate(com.tools.arruler.photomeasure.camera.ruler.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f21353I = false;
                        this.f21352H = false;
                    } else if (this.f21352H) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.tools.arruler.photomeasure.camera.ruler.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new o.d(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.tools.arruler.photomeasure.camera.ruler.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        InterfaceC2602h0 interfaceC2602h0 = (InterfaceC2602h0) viewGroup.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.decor_content_parent);
                        this.f21384t = interfaceC2602h0;
                        interfaceC2602h0.setWindowCallback(this.f21378n.getCallback());
                        if (this.f21353I) {
                            ((ActionBarOverlayLayout) this.f21384t).j(109);
                        }
                        if (this.f21350F) {
                            ((ActionBarOverlayLayout) this.f21384t).j(2);
                        }
                        if (this.f21351G) {
                            ((ActionBarOverlayLayout) this.f21384t).j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.f21354J ? (ViewGroup) from.inflate(com.tools.arruler.photomeasure.camera.ruler.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.tools.arruler.photomeasure.camera.ruler.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new C2424m(this));
                    if (this.f21384t == null) {
                        this.f21348D = (TextView) viewGroup.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.title);
                    }
                    boolean z8 = g1.f22657a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e4) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e9) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f21378n.findViewById(R.id.content);
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
                    this.f21378n.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C1838g(this));
                    this.f21347C = viewGroup;
                    Object obj = this.l;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f21383s;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        InterfaceC2602h0 interfaceC2602h02 = this.f21384t;
                        if (interfaceC2602h02 != null) {
                            interfaceC2602h02.setWindowTitle(charSequence);
                        } else {
                            C2411H c2411h = this.f21381q;
                            if (c2411h != null) {
                                Y0 y02 = (Y0) c2411h.f21243g;
                                if (!y02.f22616g) {
                                    y02.f22617h = charSequence;
                                    if ((y02.b & 8) != 0) {
                                        Toolbar toolbar = y02.f22611a;
                                        toolbar.setTitle(charSequence);
                                        if (y02.f22616g) {
                                            ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.f21348D;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f21347C.findViewById(R.id.content);
                    View decorView = this.f21378n.getDecorView();
                    contentFrameLayout2.f4219i.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
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
                    this.f21346B = true;
                    v z9 = z(0);
                    if (!this.f21362S && z9.f21335h == null) {
                        this.f21371b0 |= 4096;
                        if (!this.f21370a0) {
                            ViewCompat.postOnAnimation(this.f21378n.getDecorView(), this.f21372c0);
                            this.f21370a0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f21352H + ", windowActionBarOverlay: " + this.f21353I + ", android:windowIsFloating: " + this.f21355K + ", windowActionModeOverlay: " + this.f21354J + ", windowNoTitle: " + this.f21356L + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void x() {
        if (this.f21378n == null) {
            Object obj = this.l;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.f21378n != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final U1.b y(Context context) {
        if (this.f21368Y == null) {
            if (C.c.f346g == null) {
                Context applicationContext = context.getApplicationContext();
                C.c.f346g = new C.c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f21368Y = new t(this, C.c.f346g);
        }
        return this.f21368Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [k.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k.v z(int r5) {
        /*
            r4 = this;
            k.v[] r0 = r4.f21358N
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            k.v[] r2 = new k.v[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.f21358N = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            k.v r2 = new k.v
            r2.<init>()
            r2.f21329a = r5
            r2.f21339n = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.w.z(int):k.v");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
