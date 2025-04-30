package k;

import T.C0275i0;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.facebook.internal.C1838g;
import j.AbstractC2379a;
import java.util.ArrayList;
import k.C2411H;
import q.InterfaceC2591c;
import q.InterfaceC2604i0;
import q.Y0;

/* renamed from: k.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2411H extends android.support.v4.media.session.a implements InterfaceC2591c {

    /* renamed from: A, reason: collision with root package name */
    public static final AccelerateInterpolator f21237A = new AccelerateInterpolator();

    /* renamed from: B, reason: collision with root package name */
    public static final DecelerateInterpolator f21238B = new DecelerateInterpolator();
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public Context f21239c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f21240d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarOverlayLayout f21241e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f21242f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2604i0 f21243g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContextView f21244h;

    /* renamed from: i, reason: collision with root package name */
    public final View f21245i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21246j;

    /* renamed from: k, reason: collision with root package name */
    public C2410G f21247k;
    public C2410G l;
    public o.a m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21248n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f21249o;

    /* renamed from: p, reason: collision with root package name */
    public int f21250p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21251q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21252r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21253s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21254t;

    /* renamed from: u, reason: collision with root package name */
    public o.k f21255u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21256v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21257w;

    /* renamed from: x, reason: collision with root package name */
    public final C2409F f21258x;

    /* renamed from: y, reason: collision with root package name */
    public final C2409F f21259y;

    /* renamed from: z, reason: collision with root package name */
    public final C1838g f21260z;

    public C2411H(Activity activity, boolean z8) {
        new ArrayList();
        this.f21249o = new ArrayList();
        this.f21250p = 0;
        this.f21251q = true;
        this.f21254t = true;
        this.f21258x = new C2409F(this, 0);
        this.f21259y = new C2409F(this, 1);
        this.f21260z = new C1838g(this);
        this.f21240d = activity;
        View decorView = activity.getWindow().getDecorView();
        A(decorView);
        if (z8) {
            return;
        }
        this.f21245i = decorView.findViewById(R.id.content);
    }

    public final void A(View view) {
        String str;
        InterfaceC2604i0 wrapper;
        boolean z8;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.decor_content_parent);
        this.f21241e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.action_bar);
        if (findViewById instanceof InterfaceC2604i0) {
            wrapper = (InterfaceC2604i0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f21243g = wrapper;
        this.f21244h = (ActionBarContextView) view.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.action_bar_container);
        this.f21242f = actionBarContainer;
        InterfaceC2604i0 interfaceC2604i0 = this.f21243g;
        if (interfaceC2604i0 != null && this.f21244h != null && actionBarContainer != null) {
            Context context = ((Y0) interfaceC2604i0).f22611a.getContext();
            this.b = context;
            if ((((Y0) this.f21243g).b & 4) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                this.f21246j = true;
            }
            int i9 = context.getApplicationInfo().targetSdkVersion;
            this.f21243g.getClass();
            C(context.getResources().getBoolean(com.tools.arruler.photomeasure.camera.ruler.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(null, AbstractC2379a.f20942a, com.tools.arruler.photomeasure.camera.ruler.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f21241e;
                if (actionBarOverlayLayout2.f4179i) {
                    this.f21257w = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ViewCompat.setElevation(this.f21242f, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C2411H.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void B(boolean z8) {
        int i9;
        if (!this.f21246j) {
            if (z8) {
                i9 = 4;
            } else {
                i9 = 0;
            }
            Y0 y02 = (Y0) this.f21243g;
            int i10 = y02.b;
            this.f21246j = true;
            y02.a((i9 & 4) | (i10 & (-5)));
        }
    }

    public final void C(boolean z8) {
        if (!z8) {
            ((Y0) this.f21243g).getClass();
            this.f21242f.setTabContainer(null);
        } else {
            this.f21242f.setTabContainer(null);
            ((Y0) this.f21243g).getClass();
        }
        this.f21243g.getClass();
        ((Y0) this.f21243g).f22611a.setCollapsible(false);
        this.f21241e.setHasNonEmbeddedTabs(false);
    }

    public final void D(boolean z8) {
        boolean z9;
        boolean z10 = this.f21252r;
        if (this.f21253s || !z10) {
            z9 = true;
        } else {
            z9 = false;
        }
        View view = this.f21245i;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        final C1838g c1838g = this.f21260z;
        if (z9) {
            if (!this.f21254t) {
                this.f21254t = true;
                o.k kVar = this.f21255u;
                if (kVar != null) {
                    kVar.a();
                }
                this.f21242f.setVisibility(0);
                int i9 = this.f21250p;
                C2409F c2409f = this.f21259y;
                if (i9 == 0 && (this.f21256v || z8)) {
                    this.f21242f.setTranslationY(0.0f);
                    float f9 = -this.f21242f.getHeight();
                    if (z8) {
                        this.f21242f.getLocationInWindow(new int[]{0, 0});
                        f9 -= r12[1];
                    }
                    this.f21242f.setTranslationY(f9);
                    o.k kVar2 = new o.k();
                    C0275i0 animate = ViewCompat.animate(this.f21242f);
                    animate.e(0.0f);
                    final View view2 = (View) animate.f2900a.get();
                    if (view2 != null) {
                        if (c1838g != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: T.h0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) ((C2411H) C1838g.this.b).f21242f.getParent()).invalidate();
                                }
                            };
                        }
                        view2.animate().setUpdateListener(animatorUpdateListener);
                    }
                    boolean z11 = kVar2.f21925e;
                    ArrayList arrayList = kVar2.f21922a;
                    if (!z11) {
                        arrayList.add(animate);
                    }
                    if (this.f21251q && view != null) {
                        view.setTranslationY(f9);
                        C0275i0 animate2 = ViewCompat.animate(view);
                        animate2.e(0.0f);
                        if (!kVar2.f21925e) {
                            arrayList.add(animate2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f21238B;
                    boolean z12 = kVar2.f21925e;
                    if (!z12) {
                        kVar2.f21923c = decelerateInterpolator;
                    }
                    if (!z12) {
                        kVar2.b = 250L;
                    }
                    if (!z12) {
                        kVar2.f21924d = c2409f;
                    }
                    this.f21255u = kVar2;
                    kVar2.b();
                } else {
                    this.f21242f.setAlpha(1.0f);
                    this.f21242f.setTranslationY(0.0f);
                    if (this.f21251q && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    c2409f.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f21241e;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f21254t) {
            this.f21254t = false;
            o.k kVar3 = this.f21255u;
            if (kVar3 != null) {
                kVar3.a();
            }
            int i10 = this.f21250p;
            C2409F c2409f2 = this.f21258x;
            if (i10 == 0 && (this.f21256v || z8)) {
                this.f21242f.setAlpha(1.0f);
                this.f21242f.setTransitioning(true);
                o.k kVar4 = new o.k();
                float f10 = -this.f21242f.getHeight();
                if (z8) {
                    this.f21242f.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                C0275i0 animate3 = ViewCompat.animate(this.f21242f);
                animate3.e(f10);
                final View view3 = (View) animate3.f2900a.get();
                if (view3 != null) {
                    if (c1838g != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: T.h0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) ((C2411H) C1838g.this.b).f21242f.getParent()).invalidate();
                            }
                        };
                    }
                    view3.animate().setUpdateListener(animatorUpdateListener);
                }
                boolean z13 = kVar4.f21925e;
                ArrayList arrayList2 = kVar4.f21922a;
                if (!z13) {
                    arrayList2.add(animate3);
                }
                if (this.f21251q && view != null) {
                    C0275i0 animate4 = ViewCompat.animate(view);
                    animate4.e(f10);
                    if (!kVar4.f21925e) {
                        arrayList2.add(animate4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f21237A;
                boolean z14 = kVar4.f21925e;
                if (!z14) {
                    kVar4.f21923c = accelerateInterpolator;
                }
                if (!z14) {
                    kVar4.b = 250L;
                }
                if (!z14) {
                    kVar4.f21924d = c2409f2;
                }
                this.f21255u = kVar4;
                kVar4.b();
                return;
            }
            c2409f2.c();
        }
    }

    public final void y(boolean z8) {
        C0275i0 i9;
        C0275i0 c0275i0;
        long j7;
        if (z8) {
            if (!this.f21253s) {
                this.f21253s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f21241e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                D(false);
            }
        } else if (this.f21253s) {
            this.f21253s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f21241e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            D(false);
        }
        if (this.f21242f.isLaidOut()) {
            if (z8) {
                Y0 y02 = (Y0) this.f21243g;
                i9 = ViewCompat.animate(y02.f22611a);
                i9.a(0.0f);
                i9.c(100L);
                i9.d(new o.j(y02, 4));
                c0275i0 = this.f21244h.i(0, 200L);
            } else {
                Y0 y03 = (Y0) this.f21243g;
                C0275i0 animate = ViewCompat.animate(y03.f22611a);
                animate.a(1.0f);
                animate.c(200L);
                animate.d(new o.j(y03, 0));
                i9 = this.f21244h.i(8, 100L);
                c0275i0 = animate;
            }
            o.k kVar = new o.k();
            ArrayList arrayList = kVar.f21922a;
            arrayList.add(i9);
            View view = (View) i9.f2900a.get();
            if (view != null) {
                j7 = view.animate().getDuration();
            } else {
                j7 = 0;
            }
            View view2 = (View) c0275i0.f2900a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j7);
            }
            arrayList.add(c0275i0);
            kVar.b();
            return;
        }
        if (z8) {
            ((Y0) this.f21243g).f22611a.setVisibility(4);
            this.f21244h.setVisibility(0);
        } else {
            ((Y0) this.f21243g).f22611a.setVisibility(0);
            this.f21244h.setVisibility(8);
        }
    }

    public final Context z() {
        if (this.f21239c == null) {
            TypedValue typedValue = new TypedValue();
            this.b.getTheme().resolveAttribute(com.tools.arruler.photomeasure.camera.ruler.R.attr.actionBarWidgetTheme, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                this.f21239c = new ContextThemeWrapper(this.b, i9);
            } else {
                this.f21239c = this.b;
            }
        }
        return this.f21239c;
    }

    public C2411H(Dialog dialog) {
        new ArrayList();
        this.f21249o = new ArrayList();
        this.f21250p = 0;
        this.f21251q = true;
        this.f21254t = true;
        this.f21258x = new C2409F(this, 0);
        this.f21259y = new C2409F(this, 1);
        this.f21260z = new C1838g(this);
        A(dialog.getWindow().getDecorView());
    }
}
