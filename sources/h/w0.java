package h;

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
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.z3;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class w0 extends p6.a implements androidx.appcompat.widget.f {
    public static final AccelerateInterpolator E = new AccelerateInterpolator();
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public boolean A;
    public final u0 B;
    public final u0 C;
    public final kc.c D;

    /* renamed from: f, reason: collision with root package name */
    public Context f18677f;

    /* renamed from: g, reason: collision with root package name */
    public Context f18678g;

    /* renamed from: h, reason: collision with root package name */
    public final Activity f18679h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarOverlayLayout f18680i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarContainer f18681j;

    /* renamed from: k, reason: collision with root package name */
    public r1 f18682k;

    /* renamed from: l, reason: collision with root package name */
    public ActionBarContextView f18683l;

    /* renamed from: m, reason: collision with root package name */
    public final View f18684m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18685n;

    /* renamed from: o, reason: collision with root package name */
    public v0 f18686o;

    /* renamed from: p, reason: collision with root package name */
    public v0 f18687p;

    /* renamed from: q, reason: collision with root package name */
    public j.b f18688q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18689r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f18690s;

    /* renamed from: t, reason: collision with root package name */
    public int f18691t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18692v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18693w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18694x;

    /* renamed from: y, reason: collision with root package name */
    public j.m f18695y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18696z;

    public w0(boolean z10, Activity activity) {
        new ArrayList();
        this.f18690s = new ArrayList();
        this.f18691t = 0;
        this.u = true;
        this.f18694x = true;
        this.B = new u0(this, 0);
        this.C = new u0(this, 1);
        this.D = new kc.c(this, 2);
        this.f18679h = activity;
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (z10) {
            return;
        }
        this.f18684m = decorView.findViewById(R.id.content);
    }

    public final void E(boolean z10) {
        n0.r1 l10;
        n0.r1 r1Var;
        long j3;
        if (z10) {
            if (!this.f18693w) {
                this.f18693w = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f18680i;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                K(false);
            }
        } else if (this.f18693w) {
            this.f18693w = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18680i;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            K(false);
        }
        if (ViewCompat.isLaidOut(this.f18681j)) {
            if (z10) {
                z3 z3Var = (z3) this.f18682k;
                l10 = ViewCompat.animate(z3Var.a);
                l10.a(0.0f);
                l10.c(100L);
                l10.d(new j.l(z3Var, 4));
                r1Var = this.f18683l.l(0, 200L);
            } else {
                z3 z3Var2 = (z3) this.f18682k;
                n0.r1 animate = ViewCompat.animate(z3Var2.a);
                animate.a(1.0f);
                animate.c(200L);
                animate.d(new j.l(z3Var2, 0));
                l10 = this.f18683l.l(8, 100L);
                r1Var = animate;
            }
            j.m mVar = new j.m();
            ArrayList arrayList = mVar.a;
            arrayList.add(l10);
            View view = (View) l10.a.get();
            if (view != null) {
                j3 = view.animate().getDuration();
            } else {
                j3 = 0;
            }
            View view2 = (View) r1Var.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j3);
            }
            arrayList.add(r1Var);
            mVar.b();
            return;
        }
        if (z10) {
            ((z3) this.f18682k).a.setVisibility(4);
            this.f18683l.setVisibility(0);
        } else {
            ((z3) this.f18682k).a.setVisibility(0);
            this.f18683l.setVisibility(8);
        }
    }

    public final Context F() {
        if (this.f18678g == null) {
            TypedValue typedValue = new TypedValue();
            this.f18677f.getTheme().resolveAttribute(com.plantcare.ai.identifier.plantid.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f18678g = new ContextThemeWrapper(this.f18677f, i10);
            } else {
                this.f18678g = this.f18677f;
            }
        }
        return this.f18678g;
    }

    public final void G(View view) {
        String str;
        r1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.plantcare.ai.identifier.plantid.R.id.decor_content_parent);
        this.f18680i = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.plantcare.ai.identifier.plantid.R.id.action_bar);
        if (findViewById instanceof r1) {
            wrapper = (r1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = AbstractJsonLexerKt.NULL;
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f18682k = wrapper;
        this.f18683l = (ActionBarContextView) view.findViewById(com.plantcare.ai.identifier.plantid.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.plantcare.ai.identifier.plantid.R.id.action_bar_container);
        this.f18681j = actionBarContainer;
        r1 r1Var = this.f18682k;
        if (r1Var != null && this.f18683l != null && actionBarContainer != null) {
            Context context = ((z3) r1Var).a.getContext();
            this.f18677f = context;
            if ((((z3) this.f18682k).f1104b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f18685n = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f18682k.getClass();
            I(context.getResources().getBoolean(com.plantcare.ai.identifier.plantid.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f18677f.obtainStyledAttributes(null, g.a.a, com.plantcare.ai.identifier.plantid.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18680i;
                if (actionBarOverlayLayout2.f698j) {
                    this.A = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ViewCompat.setElevation(this.f18681j, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(w0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void H(boolean z10) {
        int i10;
        if (!this.f18685n) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            z3 z3Var = (z3) this.f18682k;
            int i11 = z3Var.f1104b;
            this.f18685n = true;
            z3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void I(boolean z10) {
        if (!z10) {
            ((z3) this.f18682k).getClass();
            this.f18681j.setTabContainer(null);
        } else {
            this.f18681j.setTabContainer(null);
            ((z3) this.f18682k).getClass();
        }
        this.f18682k.getClass();
        ((z3) this.f18682k).a.setCollapsible(false);
        this.f18680i.setHasNonEmbeddedTabs(false);
    }

    public final void J(CharSequence charSequence) {
        z3 z3Var = (z3) this.f18682k;
        if (!z3Var.f1109g) {
            z3Var.f1110h = charSequence;
            if ((z3Var.f1104b & 8) != 0) {
                Toolbar toolbar = z3Var.a;
                toolbar.setTitle(charSequence);
                if (z3Var.f1109g) {
                    ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void K(boolean z10) {
        boolean z11;
        boolean z12 = this.f18692v;
        if (this.f18693w || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f18684m;
        final kc.c cVar = this.D;
        if (z11) {
            if (!this.f18694x) {
                this.f18694x = true;
                j.m mVar = this.f18695y;
                if (mVar != null) {
                    mVar.a();
                }
                this.f18681j.setVisibility(0);
                int i10 = this.f18691t;
                u0 u0Var = this.C;
                if (i10 == 0 && (this.f18696z || z10)) {
                    this.f18681j.setTranslationY(0.0f);
                    float f10 = -this.f18681j.getHeight();
                    if (z10) {
                        this.f18681j.getLocationInWindow(new int[]{0, 0});
                        f10 -= r12[1];
                    }
                    this.f18681j.setTranslationY(f10);
                    j.m mVar2 = new j.m();
                    n0.r1 animate = ViewCompat.animate(this.f18681j);
                    animate.e(0.0f);
                    final View view2 = (View) animate.a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: n0.p1
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) ((h.w0) kc.c.this.f20640c).f18681j.getParent()).invalidate();
                                }
                            };
                        }
                        view2.animate().setUpdateListener(animatorUpdateListener);
                    }
                    boolean z13 = mVar2.f19707e;
                    ArrayList arrayList = mVar2.a;
                    if (!z13) {
                        arrayList.add(animate);
                    }
                    if (this.u && view != null) {
                        view.setTranslationY(f10);
                        n0.r1 animate2 = ViewCompat.animate(view);
                        animate2.e(0.0f);
                        if (!mVar2.f19707e) {
                            arrayList.add(animate2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = F;
                    boolean z14 = mVar2.f19707e;
                    if (!z14) {
                        mVar2.f19705c = decelerateInterpolator;
                    }
                    if (!z14) {
                        mVar2.f19704b = 250L;
                    }
                    if (!z14) {
                        mVar2.f19706d = u0Var;
                    }
                    this.f18695y = mVar2;
                    mVar2.b();
                } else {
                    this.f18681j.setAlpha(1.0f);
                    this.f18681j.setTranslationY(0.0f);
                    if (this.u && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    u0Var.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f18680i;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f18694x) {
            this.f18694x = false;
            j.m mVar3 = this.f18695y;
            if (mVar3 != null) {
                mVar3.a();
            }
            int i11 = this.f18691t;
            u0 u0Var2 = this.B;
            if (i11 == 0 && (this.f18696z || z10)) {
                this.f18681j.setAlpha(1.0f);
                this.f18681j.setTransitioning(true);
                j.m mVar4 = new j.m();
                float f11 = -this.f18681j.getHeight();
                if (z10) {
                    this.f18681j.getLocationInWindow(new int[]{0, 0});
                    f11 -= r12[1];
                }
                n0.r1 animate3 = ViewCompat.animate(this.f18681j);
                animate3.e(f11);
                final View view3 = (View) animate3.a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: n0.p1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) ((h.w0) kc.c.this.f20640c).f18681j.getParent()).invalidate();
                            }
                        };
                    }
                    view3.animate().setUpdateListener(animatorUpdateListener);
                }
                boolean z15 = mVar4.f19707e;
                ArrayList arrayList2 = mVar4.a;
                if (!z15) {
                    arrayList2.add(animate3);
                }
                if (this.u && view != null) {
                    n0.r1 animate4 = ViewCompat.animate(view);
                    animate4.e(f11);
                    if (!mVar4.f19707e) {
                        arrayList2.add(animate4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = E;
                boolean z16 = mVar4.f19707e;
                if (!z16) {
                    mVar4.f19705c = accelerateInterpolator;
                }
                if (!z16) {
                    mVar4.f19704b = 250L;
                }
                if (!z16) {
                    mVar4.f19706d = u0Var2;
                }
                this.f18695y = mVar4;
                mVar4.b();
                return;
            }
            u0Var2.c();
        }
    }

    public w0(Dialog dialog) {
        new ArrayList();
        this.f18690s = new ArrayList();
        this.f18691t = 0;
        this.u = true;
        this.f18694x = true;
        this.B = new u0(this, 0);
        this.C = new u0(this, 1);
        this.D = new kc.c(this, 2);
        G(dialog.getWindow().getDecorView());
    }
}
