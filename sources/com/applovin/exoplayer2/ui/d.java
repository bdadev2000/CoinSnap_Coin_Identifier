package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.b1;
import com.applovin.impl.f8;
import com.applovin.impl.fo;
import com.applovin.impl.qh;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.u5;
import com.applovin.impl.ui;
import com.applovin.impl.xp;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class d extends FrameLayout {
    private final String A;
    private final Drawable B;
    private final Drawable C;
    private final float D;
    private final float E;
    private final String F;
    private final String G;
    private qh H;
    private t4 I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;

    /* renamed from: a, reason: collision with root package name */
    private final c f22560a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean[] f22561a0;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f22562b;

    /* renamed from: b0, reason: collision with root package name */
    private long[] f22563b0;

    /* renamed from: c, reason: collision with root package name */
    private final View f22564c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean[] f22565c0;
    private final View d;

    /* renamed from: d0, reason: collision with root package name */
    private long f22566d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f22567e0;

    /* renamed from: f, reason: collision with root package name */
    private final View f22568f;

    /* renamed from: f0, reason: collision with root package name */
    private long f22569f0;

    /* renamed from: g, reason: collision with root package name */
    private final View f22570g;

    /* renamed from: h, reason: collision with root package name */
    private final View f22571h;

    /* renamed from: i, reason: collision with root package name */
    private final View f22572i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageView f22573j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f22574k;

    /* renamed from: l, reason: collision with root package name */
    private final View f22575l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f22576m;

    /* renamed from: n, reason: collision with root package name */
    private final TextView f22577n;

    /* renamed from: o, reason: collision with root package name */
    private final i f22578o;

    /* renamed from: p, reason: collision with root package name */
    private final StringBuilder f22579p;

    /* renamed from: q, reason: collision with root package name */
    private final Formatter f22580q;

    /* renamed from: r, reason: collision with root package name */
    private final fo.b f22581r;

    /* renamed from: s, reason: collision with root package name */
    private final fo.d f22582s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f22583t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f22584u;

    /* renamed from: v, reason: collision with root package name */
    private final Drawable f22585v;
    private final Drawable w;
    private final Drawable x;

    /* renamed from: y, reason: collision with root package name */
    private final String f22586y;

    /* renamed from: z, reason: collision with root package name */
    private final String f22587z;

    /* loaded from: classes2.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0070d {
    }

    /* loaded from: classes2.dex */
    public interface e {
        void d(int i2);
    }

    static {
        f8.a("goog.exo.ui");
    }

    public d(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        super(context, attributeSet, i2);
        int i3 = R.layout.applovin_exo_player_control_view;
        this.N = 5000;
        final int i4 = 0;
        this.P = 0;
        this.O = 200;
        this.V = -9223372036854775807L;
        final int i5 = 1;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i2, 0);
            try {
                this.N = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                i3 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, i3);
                this.P = a(obtainStyledAttributes, this.P);
                this.Q = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.Q);
                this.R = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.R);
                this.S = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.S);
                this.T = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_next_button, this.T);
                this.U = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f22562b = new CopyOnWriteArrayList();
        this.f22581r = new fo.b();
        this.f22582s = new fo.d();
        StringBuilder sb = new StringBuilder();
        this.f22579p = sb;
        this.f22580q = new Formatter(sb, Locale.getDefault());
        this.W = new long[0];
        this.f22561a0 = new boolean[0];
        this.f22563b0 = new long[0];
        this.f22565c0 = new boolean[0];
        c cVar = new c();
        this.f22560a = cVar;
        this.I = new u5();
        this.f22583t = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f22656b;

            {
                this.f22656b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i4;
                d dVar = this.f22656b;
                switch (i6) {
                    case 0:
                        dVar.k();
                        return;
                    default:
                        dVar.a();
                        return;
                }
            }
        };
        this.f22584u = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f22656b;

            {
                this.f22656b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i5;
                d dVar = this.f22656b;
                switch (i6) {
                    case 0:
                        dVar.k();
                        return;
                    default:
                        dVar.a();
                        return;
                }
            }
        };
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(Opcodes.ASM4);
        i iVar = (i) findViewById(R.id.al_exo_progress);
        View findViewById = findViewById(R.id.al_exo_progress_placeholder);
        if (iVar != null) {
            this.f22578o = iVar;
        } else if (findViewById != null) {
            com.applovin.exoplayer2.ui.b bVar = new com.applovin.exoplayer2.ui.b(context, null, 0, attributeSet2);
            bVar.setId(R.id.al_exo_progress);
            bVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bVar, indexOfChild);
            this.f22578o = bVar;
        } else {
            this.f22578o = null;
        }
        this.f22576m = (TextView) findViewById(R.id.al_exo_duration);
        this.f22577n = (TextView) findViewById(R.id.al_exo_position);
        i iVar2 = this.f22578o;
        if (iVar2 != null) {
            iVar2.a(cVar);
        }
        View findViewById2 = findViewById(R.id.al_exo_play);
        this.f22568f = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(R.id.al_exo_pause);
        this.f22570g = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        View findViewById4 = findViewById(R.id.al_exo_prev);
        this.f22564c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(cVar);
        }
        View findViewById5 = findViewById(R.id.al_exo_next);
        this.d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(R.id.al_exo_rew);
        this.f22572i = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(R.id.al_exo_ffwd);
        this.f22571h = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.f22573j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.f22574k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View findViewById8 = findViewById(R.id.al_exo_vr);
        this.f22575l = findViewById8;
        setShowVrButton(false);
        a(false, false, findViewById8);
        Resources resources = context.getResources();
        this.D = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f22585v = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.w = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.x = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.C = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.f22586y = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.f22587z = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.A = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.F = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.G = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    private static boolean a(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/exoplayer2/ui/d;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, motionEvent);
        return safedk_d_dispatchTouchEvent_280e23bdf651700784aba6a85dc5a60e(motionEvent);
    }

    @Nullable
    public qh getPlayer() {
        return this.H;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.f22575l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j2 = this.V;
        if (j2 != -9223372036854775807L) {
            long uptimeMillis = j2 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.f22584u, uptimeMillis);
            }
        } else if (c()) {
            b();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.f22583t);
        removeCallbacks(this.f22584u);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean safedk_d_dispatchTouchEvent_280e23bdf651700784aba6a85dc5a60e(MotionEvent p02) {
        if (p02.getAction() == 0) {
            removeCallbacks(this.f22584u);
        } else if (p02.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(p02);
    }

    @Deprecated
    public void setControlDispatcher(t4 t4Var) {
        if (this.I != t4Var) {
            this.I = t4Var;
            i();
        }
    }

    public void setPlayer(@Nullable qh qhVar) {
        b1.b(Looper.myLooper() == Looper.getMainLooper());
        b1.a(qhVar == null || qhVar.p() == Looper.getMainLooper());
        qh qhVar2 = this.H;
        if (qhVar2 == qhVar) {
            return;
        }
        if (qhVar2 != null) {
            qhVar2.a(this.f22560a);
        }
        this.H = qhVar;
        if (qhVar != null) {
            qhVar.b(this.f22560a);
        }
        h();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC0070d interfaceC0070d) {
    }

    public void setRepeatToggleModes(int i2) {
        this.P = i2;
        qh qhVar = this.H;
        if (qhVar != null) {
            int m2 = qhVar.m();
            if (i2 == 0 && m2 != 0) {
                this.I.a(this.H, 0);
            } else if (i2 == 1 && m2 == 2) {
                this.I.a(this.H, 1);
            } else if (i2 == 2 && m2 == 1) {
                this.I.a(this.H, 2);
            }
        }
        l();
    }

    public void setShowFastForwardButton(boolean z2) {
        this.R = z2;
        i();
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        this.K = z2;
        n();
    }

    public void setShowNextButton(boolean z2) {
        this.T = z2;
        i();
    }

    public void setShowPreviousButton(boolean z2) {
        this.S = z2;
        i();
    }

    public void setShowRewindButton(boolean z2) {
        this.Q = z2;
        i();
    }

    public void setShowShuffleButton(boolean z2) {
        this.U = z2;
        m();
    }

    public void setShowTimeoutMs(int i2) {
        this.N = i2;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z2) {
        View view = this.f22575l;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.O = xp.a(i2, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f22575l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a(getShowVrButton(), onClickListener != null, this.f22575l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(qh qhVar) {
        int o2 = qhVar.o();
        if (o2 == 1) {
            this.I.b(qhVar);
        } else if (o2 == 4) {
            a(qhVar, qhVar.t(), -9223372036854775807L);
        }
        this.I.b(qhVar, true);
    }

    private void c(qh qhVar) {
        int o2 = qhVar.o();
        if (o2 != 1 && o2 != 4 && qhVar.l()) {
            a(qhVar);
        } else {
            b(qhVar);
        }
    }

    private void d() {
        View view;
        View view2;
        boolean f2 = f();
        if (!f2 && (view2 = this.f22568f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!f2 || (view = this.f22570g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void e() {
        View view;
        View view2;
        boolean f2 = f();
        if (!f2 && (view2 = this.f22568f) != null) {
            view2.requestFocus();
        } else {
            if (!f2 || (view = this.f22570g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private boolean f() {
        qh qhVar = this.H;
        return (qhVar == null || qhVar.o() == 4 || this.H.o() == 1 || !this.H.l()) ? false : true;
    }

    private void h() {
        j();
        i();
        l();
        m();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (c() && this.J) {
            qh qhVar = this.H;
            boolean z6 = false;
            if (qhVar != null) {
                boolean b2 = qhVar.b(4);
                boolean b3 = qhVar.b(6);
                z5 = qhVar.b(10) && this.I.b();
                if (qhVar.b(11) && this.I.a()) {
                    z6 = true;
                }
                z3 = qhVar.b(8);
                z2 = z6;
                z6 = b3;
                z4 = b2;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            a(this.S, z6, this.f22564c);
            a(this.Q, z5, this.f22572i);
            a(this.R, z2, this.f22571h);
            a(this.T, z3, this.d);
            i iVar = this.f22578o;
            if (iVar != null) {
                iVar.setEnabled(z4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean z2;
        boolean z3;
        if (c() && this.J) {
            boolean f2 = f();
            View view = this.f22568f;
            boolean z4 = true;
            if (view != null) {
                z2 = f2 && view.isFocused();
                if (xp.f27962a < 21) {
                    z3 = z2;
                } else {
                    z3 = f2 && b.a(this.f22568f);
                }
                this.f22568f.setVisibility(f2 ? 8 : 0);
            } else {
                z2 = false;
                z3 = false;
            }
            View view2 = this.f22570g;
            if (view2 != null) {
                z2 |= !f2 && view2.isFocused();
                if (xp.f27962a < 21) {
                    z4 = z2;
                } else if (f2 || !b.a(this.f22570g)) {
                    z4 = false;
                }
                z3 |= z4;
                this.f22570g.setVisibility(f2 ? 0 : 8);
            }
            if (z2) {
                e();
            }
            if (z3) {
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long j2;
        long j3;
        if (c() && this.J) {
            qh qhVar = this.H;
            if (qhVar != null) {
                j2 = qhVar.g() + this.f22566d0;
                j3 = qhVar.s() + this.f22566d0;
            } else {
                j2 = 0;
                j3 = 0;
            }
            boolean z2 = j2 != this.f22567e0;
            this.f22567e0 = j2;
            this.f22569f0 = j3;
            TextView textView = this.f22577n;
            if (textView != null && !this.M && z2) {
                textView.setText(xp.a(this.f22579p, this.f22580q, j2));
            }
            i iVar = this.f22578o;
            if (iVar != null) {
                iVar.setPosition(j2);
                this.f22578o.setBufferedPosition(j3);
            }
            removeCallbacks(this.f22583t);
            int o2 = qhVar == null ? 1 : qhVar.o();
            if (qhVar == null || !qhVar.isPlaying()) {
                if (o2 == 4 || o2 == 1) {
                    return;
                }
                postDelayed(this.f22583t, 1000L);
                return;
            }
            i iVar2 = this.f22578o;
            long min = Math.min(iVar2 != null ? iVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j2 % 1000));
            postDelayed(this.f22583t, xp.b(qhVar.a().f26059a > 0.0f ? ((float) min) / r0 : 1000L, this.O, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.f22573j) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            qh qhVar = this.H;
            if (qhVar == null) {
                a(true, false, (View) imageView);
                this.f22573j.setImageDrawable(this.f22585v);
                this.f22573j.setContentDescription(this.f22586y);
                return;
            }
            a(true, true, (View) imageView);
            int m2 = qhVar.m();
            if (m2 == 0) {
                this.f22573j.setImageDrawable(this.f22585v);
                this.f22573j.setContentDescription(this.f22586y);
            } else if (m2 == 1) {
                this.f22573j.setImageDrawable(this.w);
                this.f22573j.setContentDescription(this.f22587z);
            } else if (m2 == 2) {
                this.f22573j.setImageDrawable(this.x);
                this.f22573j.setContentDescription(this.A);
            }
            this.f22573j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.f22574k) != null) {
            qh qhVar = this.H;
            if (!this.U) {
                a(false, false, (View) imageView);
                return;
            }
            if (qhVar == null) {
                a(true, false, (View) imageView);
                this.f22574k.setImageDrawable(this.C);
                this.f22574k.setContentDescription(this.G);
            } else {
                a(true, true, (View) imageView);
                this.f22574k.setImageDrawable(qhVar.r() ? this.B : this.C);
                this.f22574k.setContentDescription(qhVar.r() ? this.F : this.G);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        long j2;
        int i2;
        fo.d dVar;
        qh qhVar = this.H;
        if (qhVar == null) {
            return;
        }
        boolean z2 = true;
        this.L = this.K && a(qhVar.n(), this.f22582s);
        long j3 = 0;
        this.f22566d0 = 0L;
        fo n2 = qhVar.n();
        if (n2.c()) {
            j2 = 0;
            i2 = 0;
        } else {
            int t2 = qhVar.t();
            boolean z3 = this.L;
            int i3 = z3 ? 0 : t2;
            int b2 = z3 ? n2.b() - 1 : t2;
            long j4 = 0;
            i2 = 0;
            while (true) {
                if (i3 > b2) {
                    break;
                }
                if (i3 == t2) {
                    this.f22566d0 = t2.b(j4);
                }
                n2.a(i3, this.f22582s);
                fo.d dVar2 = this.f22582s;
                if (dVar2.f23973o == -9223372036854775807L) {
                    b1.b(this.L ^ z2);
                    break;
                }
                int i4 = dVar2.f23974p;
                while (true) {
                    dVar = this.f22582s;
                    if (i4 <= dVar.f23975q) {
                        n2.a(i4, this.f22581r);
                        int f2 = this.f22581r.f();
                        int a2 = this.f22581r.a();
                        while (f2 < a2) {
                            long b3 = this.f22581r.b(f2);
                            if (b3 == Long.MIN_VALUE) {
                                long j5 = this.f22581r.d;
                                if (j5 == -9223372036854775807L) {
                                    f2++;
                                    j3 = 0;
                                } else {
                                    b3 = j5;
                                }
                            }
                            long e2 = this.f22581r.e() + b3;
                            if (e2 >= j3) {
                                long[] jArr = this.W;
                                if (i2 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.W = Arrays.copyOf(jArr, length);
                                    this.f22561a0 = Arrays.copyOf(this.f22561a0, length);
                                }
                                this.W[i2] = t2.b(e2 + j4);
                                this.f22561a0[i2] = this.f22581r.e(f2);
                                i2++;
                            }
                            f2++;
                            j3 = 0;
                        }
                        i4++;
                        j3 = 0;
                    }
                }
                j4 += dVar.f23973o;
                i3++;
                z2 = true;
                j3 = 0;
            }
            j2 = j4;
        }
        long b4 = t2.b(j2);
        TextView textView = this.f22576m;
        if (textView != null) {
            textView.setText(xp.a(this.f22579p, this.f22580q, b4));
        }
        i iVar = this.f22578o;
        if (iVar != null) {
            iVar.setDuration(b4);
            int length2 = this.f22563b0.length;
            int i5 = i2 + length2;
            long[] jArr2 = this.W;
            if (i5 > jArr2.length) {
                this.W = Arrays.copyOf(jArr2, i5);
                this.f22561a0 = Arrays.copyOf(this.f22561a0, i5);
            }
            System.arraycopy(this.f22563b0, 0, this.W, i2, length2);
            System.arraycopy(this.f22565c0, 0, this.f22561a0, i2, length2);
            this.f22578o.a(this.W, this.f22561a0, i5);
        }
        k();
    }

    public void g() {
        if (!c()) {
            setVisibility(0);
            Iterator it = this.f22562b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            h();
            e();
            d();
        }
        b();
    }

    private static boolean a(fo foVar, fo.d dVar) {
        if (foVar.b() > 100) {
            return false;
        }
        int b2 = foVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (foVar.a(i2, dVar).f23973o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(qh qhVar) {
        this.I.b(qhVar, false);
    }

    public void b(e eVar) {
        this.f22562b.remove(eVar);
    }

    private boolean a(qh qhVar, int i2, long j2) {
        return this.I.a(qhVar, i2, j2);
    }

    private void b() {
        removeCallbacks(this.f22584u);
        if (this.N <= 0) {
            this.V = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = this.N;
        this.V = uptimeMillis + j2;
        if (this.J) {
            postDelayed(this.f22584u, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(qh qhVar, long j2) {
        int t2;
        fo n2 = qhVar.n();
        if (this.L && !n2.c()) {
            int b2 = n2.b();
            t2 = 0;
            while (true) {
                long d = n2.a(t2, this.f22582s).d();
                if (j2 < d) {
                    break;
                }
                if (t2 == b2 - 1) {
                    j2 = d;
                    break;
                } else {
                    j2 -= d;
                    t2++;
                }
            }
        } else {
            t2 = qhVar.t();
        }
        a(qhVar, t2, j2);
        k();
    }

    /* loaded from: classes2.dex */
    public final class c implements qh.e, i.a, View.OnClickListener {
        private c() {
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(qh qhVar, qh.d dVar) {
            if (dVar.a(4, 5)) {
                d.this.j();
            }
            if (dVar.a(4, 5, 7)) {
                d.this.k();
            }
            if (dVar.a(8)) {
                d.this.l();
            }
            if (dVar.a(9)) {
                d.this.m();
            }
            if (dVar.a(8, 9, 11, 0, 13)) {
                d.this.i();
            }
            if (dVar.a(11, 0)) {
                d.this.n();
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void b(i iVar, long j2) {
            if (d.this.f22577n != null) {
                d.this.f22577n.setText(xp.a(d.this.f22579p, d.this.f22580q, j2));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qh qhVar = d.this.H;
            if (qhVar == null) {
                return;
            }
            if (d.this.d == view) {
                d.this.I.a(qhVar);
                return;
            }
            if (d.this.f22564c == view) {
                d.this.I.e(qhVar);
                return;
            }
            if (d.this.f22571h == view) {
                if (qhVar.o() != 4) {
                    d.this.I.d(qhVar);
                    return;
                }
                return;
            }
            if (d.this.f22572i == view) {
                d.this.I.c(qhVar);
                return;
            }
            if (d.this.f22568f == view) {
                d.this.b(qhVar);
                return;
            }
            if (d.this.f22570g == view) {
                d.this.a(qhVar);
            } else if (d.this.f22573j == view) {
                d.this.I.a(qhVar, ui.a(qhVar.m(), d.this.P));
            } else if (d.this.f22574k == view) {
                d.this.I.a(qhVar, !qhVar.r());
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j2) {
            d.this.M = true;
            if (d.this.f22577n != null) {
                d.this.f22577n.setText(xp.a(d.this.f22579p, d.this.f22580q, j2));
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j2, boolean z2) {
            d.this.M = false;
            if (z2 || d.this.H == null) {
                return;
            }
            d dVar = d.this;
            dVar.a(dVar.H, j2);
        }
    }

    public void a(e eVar) {
        b1.a(eVar);
        this.f22562b.add(eVar);
    }

    public void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.f22562b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            removeCallbacks(this.f22583t);
            removeCallbacks(this.f22584u);
            this.V = -9223372036854775807L;
        }
    }

    private void a(boolean z2, boolean z3, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z3);
        view.setAlpha(z3 ? this.D : this.E);
        view.setVisibility(z2 ? 0 : 8);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        qh qhVar = this.H;
        if (qhVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (qhVar.o() == 4) {
                return true;
            }
            this.I.d(qhVar);
            return true;
        }
        if (keyCode == 89) {
            this.I.c(qhVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            c(qhVar);
            return true;
        }
        if (keyCode == 87) {
            this.I.a(qhVar);
            return true;
        }
        if (keyCode == 88) {
            this.I.e(qhVar);
            return true;
        }
        if (keyCode == 126) {
            b(qhVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        a(qhVar);
        return true;
    }

    private static int a(TypedArray typedArray, int i2) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i2);
    }
}
