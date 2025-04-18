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
import com.applovin.impl.a1;
import com.applovin.impl.d8;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.pi;
import com.applovin.impl.r2;
import com.applovin.impl.r4;
import com.applovin.impl.s5;
import com.applovin.impl.yp;
import com.applovin.sdk.R;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d extends FrameLayout {
    private final String A;
    private final Drawable B;
    private final Drawable C;
    private final float D;
    private final float E;
    private final String F;
    private final String G;
    private nh H;
    private r4 I;
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
    private final c a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean[] f3468a0;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f3469b;

    /* renamed from: b0, reason: collision with root package name */
    private long[] f3470b0;

    /* renamed from: c, reason: collision with root package name */
    private final View f3471c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean[] f3472c0;

    /* renamed from: d, reason: collision with root package name */
    private final View f3473d;

    /* renamed from: d0, reason: collision with root package name */
    private long f3474d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f3475e0;

    /* renamed from: f, reason: collision with root package name */
    private final View f3476f;

    /* renamed from: f0, reason: collision with root package name */
    private long f3477f0;

    /* renamed from: g, reason: collision with root package name */
    private final View f3478g;

    /* renamed from: h, reason: collision with root package name */
    private final View f3479h;

    /* renamed from: i, reason: collision with root package name */
    private final View f3480i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageView f3481j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f3482k;

    /* renamed from: l, reason: collision with root package name */
    private final View f3483l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f3484m;

    /* renamed from: n, reason: collision with root package name */
    private final TextView f3485n;

    /* renamed from: o, reason: collision with root package name */
    private final i f3486o;

    /* renamed from: p, reason: collision with root package name */
    private final StringBuilder f3487p;

    /* renamed from: q, reason: collision with root package name */
    private final Formatter f3488q;

    /* renamed from: r, reason: collision with root package name */
    private final go.b f3489r;

    /* renamed from: s, reason: collision with root package name */
    private final go.d f3490s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f3491t;
    private final Runnable u;

    /* renamed from: v, reason: collision with root package name */
    private final Drawable f3492v;

    /* renamed from: w, reason: collision with root package name */
    private final Drawable f3493w;

    /* renamed from: x, reason: collision with root package name */
    private final Drawable f3494x;

    /* renamed from: y, reason: collision with root package name */
    private final String f3495y;

    /* renamed from: z, reason: collision with root package name */
    private final String f3496z;

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0009d {
    }

    /* loaded from: classes.dex */
    public interface e {
        void d(int i10);
    }

    static {
        d8.a("goog.exo.ui");
    }

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11 = R.layout.applovin_exo_player_control_view;
        this.N = 5000;
        final int i12 = 0;
        this.P = 0;
        this.O = 200;
        this.V = C.TIME_UNSET;
        final int i13 = 1;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i10, 0);
            try {
                this.N = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                i11 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, i11);
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
        this.f3469b = new CopyOnWriteArrayList();
        this.f3489r = new go.b();
        this.f3490s = new go.d();
        StringBuilder sb2 = new StringBuilder();
        this.f3487p = sb2;
        this.f3488q = new Formatter(sb2, Locale.getDefault());
        this.W = new long[0];
        this.f3468a0 = new boolean[0];
        this.f3470b0 = new long[0];
        this.f3472c0 = new boolean[0];
        c cVar = new c();
        this.a = cVar;
        this.I = new s5();
        this.f3491t = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f3560c;

            {
                this.f3560c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i14 = i12;
                d dVar = this.f3560c;
                switch (i14) {
                    case 0:
                        dVar.k();
                        return;
                    default:
                        dVar.a();
                        return;
                }
            }
        };
        this.u = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f3560c;

            {
                this.f3560c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i14 = i13;
                d dVar = this.f3560c;
                switch (i14) {
                    case 0:
                        dVar.k();
                        return;
                    default:
                        dVar.a();
                        return;
                }
            }
        };
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        i iVar = (i) findViewById(R.id.al_exo_progress);
        View findViewById = findViewById(R.id.al_exo_progress_placeholder);
        if (iVar != null) {
            this.f3486o = iVar;
        } else if (findViewById != null) {
            com.applovin.exoplayer2.ui.b bVar = new com.applovin.exoplayer2.ui.b(context, null, 0, attributeSet2);
            bVar.setId(R.id.al_exo_progress);
            bVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bVar, indexOfChild);
            this.f3486o = bVar;
        } else {
            this.f3486o = null;
        }
        this.f3484m = (TextView) findViewById(R.id.al_exo_duration);
        this.f3485n = (TextView) findViewById(R.id.al_exo_position);
        i iVar2 = this.f3486o;
        if (iVar2 != null) {
            iVar2.a(cVar);
        }
        View findViewById2 = findViewById(R.id.al_exo_play);
        this.f3476f = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(R.id.al_exo_pause);
        this.f3478g = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        View findViewById4 = findViewById(R.id.al_exo_prev);
        this.f3471c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(cVar);
        }
        View findViewById5 = findViewById(R.id.al_exo_next);
        this.f3473d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(R.id.al_exo_rew);
        this.f3480i = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(R.id.al_exo_ffwd);
        this.f3479h = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.f3481j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.f3482k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View findViewById8 = findViewById(R.id.al_exo_vr);
        this.f3483l = findViewById8;
        setShowVrButton(false);
        a(false, false, findViewById8);
        Resources resources = context.getResources();
        this.D = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f3492v = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.f3493w = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.f3494x = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.C = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.f3495y = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.f3496z = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.A = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.F = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.G = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    private static boolean a(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.u);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public nh getPlayer() {
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
        View view = this.f3483l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j3 = this.V;
        if (j3 != C.TIME_UNSET) {
            long uptimeMillis = j3 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.u, uptimeMillis);
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
        removeCallbacks(this.f3491t);
        removeCallbacks(this.u);
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        if (this.I != r4Var) {
            this.I = r4Var;
            i();
        }
    }

    public void setPlayer(@Nullable nh nhVar) {
        boolean z10;
        boolean z11 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        if (nhVar != null && nhVar.p() != Looper.getMainLooper()) {
            z11 = false;
        }
        a1.a(z11);
        nh nhVar2 = this.H;
        if (nhVar2 == nhVar) {
            return;
        }
        if (nhVar2 != null) {
            nhVar2.a(this.a);
        }
        this.H = nhVar;
        if (nhVar != null) {
            nhVar.b(this.a);
        }
        h();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC0009d interfaceC0009d) {
    }

    public void setRepeatToggleModes(int i10) {
        this.P = i10;
        nh nhVar = this.H;
        if (nhVar != null) {
            int m10 = nhVar.m();
            if (i10 == 0 && m10 != 0) {
                this.I.a(this.H, 0);
            } else if (i10 == 1 && m10 == 2) {
                this.I.a(this.H, 1);
            } else if (i10 == 2 && m10 == 1) {
                this.I.a(this.H, 2);
            }
        }
        l();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.R = z10;
        i();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.K = z10;
        n();
    }

    public void setShowNextButton(boolean z10) {
        this.T = z10;
        i();
    }

    public void setShowPreviousButton(boolean z10) {
        this.S = z10;
        i();
    }

    public void setShowRewindButton(boolean z10) {
        this.Q = z10;
        i();
    }

    public void setShowShuffleButton(boolean z10) {
        this.U = z10;
        m();
    }

    public void setShowTimeoutMs(int i10) {
        this.N = i10;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z10) {
        int i10;
        View view = this.f3483l;
        if (view != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.O = yp.a(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        boolean z10;
        View view = this.f3483l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            a(showVrButton, z10, this.f3483l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(nh nhVar) {
        int o10 = nhVar.o();
        if (o10 == 1) {
            this.I.b(nhVar);
        } else if (o10 == 4) {
            a(nhVar, nhVar.t(), C.TIME_UNSET);
        }
        this.I.b(nhVar, true);
    }

    private void c(nh nhVar) {
        int o10 = nhVar.o();
        if (o10 != 1 && o10 != 4 && nhVar.l()) {
            a(nhVar);
        } else {
            b(nhVar);
        }
    }

    private void d() {
        View view;
        View view2;
        boolean f10 = f();
        if (!f10 && (view2 = this.f3476f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!f10 || (view = this.f3478g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void e() {
        View view;
        View view2;
        boolean f10 = f();
        if (!f10 && (view2 = this.f3476f) != null) {
            view2.requestFocus();
        } else {
            if (!f10 || (view = this.f3478g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private boolean f() {
        nh nhVar = this.H;
        return (nhVar == null || nhVar.o() == 4 || this.H.o() == 1 || !this.H.l()) ? false : true;
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (c() && this.J) {
            nh nhVar = this.H;
            boolean z14 = false;
            if (nhVar != null) {
                boolean b3 = nhVar.b(4);
                boolean b10 = nhVar.b(6);
                z13 = nhVar.b(10) && this.I.b();
                if (nhVar.b(11) && this.I.a()) {
                    z14 = true;
                }
                z11 = nhVar.b(8);
                z10 = z14;
                z14 = b10;
                z12 = b3;
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            a(this.S, z14, this.f3471c);
            a(this.Q, z13, this.f3480i);
            a(this.R, z10, this.f3479h);
            a(this.T, z11, this.f3473d);
            i iVar = this.f3486o;
            if (iVar != null) {
                iVar.setEnabled(z12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean z10;
        boolean z11;
        if (c() && this.J) {
            boolean f10 = f();
            View view = this.f3476f;
            boolean z12 = true;
            if (view != null) {
                z10 = f10 && view.isFocused();
                if (yp.a < 21) {
                    z11 = z10;
                } else {
                    z11 = f10 && b.a(this.f3476f);
                }
                this.f3476f.setVisibility(f10 ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f3478g;
            if (view2 != null) {
                z10 |= !f10 && view2.isFocused();
                if (yp.a < 21) {
                    z12 = z10;
                } else if (f10 || !b.a(this.f3478g)) {
                    z12 = false;
                }
                z11 |= z12;
                this.f3478g.setVisibility(f10 ? 0 : 8);
            }
            if (z10) {
                e();
            }
            if (z11) {
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long j3;
        long j10;
        if (c() && this.J) {
            nh nhVar = this.H;
            if (nhVar != null) {
                j3 = nhVar.g() + this.f3474d0;
                j10 = nhVar.s() + this.f3474d0;
            } else {
                j3 = 0;
                j10 = 0;
            }
            boolean z10 = j3 != this.f3475e0;
            this.f3475e0 = j3;
            this.f3477f0 = j10;
            TextView textView = this.f3485n;
            if (textView != null && !this.M && z10) {
                textView.setText(yp.a(this.f3487p, this.f3488q, j3));
            }
            i iVar = this.f3486o;
            if (iVar != null) {
                iVar.setPosition(j3);
                this.f3486o.setBufferedPosition(j10);
            }
            removeCallbacks(this.f3491t);
            int o10 = nhVar == null ? 1 : nhVar.o();
            if (nhVar == null || !nhVar.isPlaying()) {
                if (o10 == 4 || o10 == 1) {
                    return;
                }
                postDelayed(this.f3491t, 1000L);
                return;
            }
            i iVar2 = this.f3486o;
            long min = Math.min(iVar2 != null ? iVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j3 % 1000));
            postDelayed(this.f3491t, yp.b(nhVar.a().a > 0.0f ? ((float) min) / r0 : 1000L, this.O, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.f3481j) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            nh nhVar = this.H;
            if (nhVar == null) {
                a(true, false, (View) imageView);
                this.f3481j.setImageDrawable(this.f3492v);
                this.f3481j.setContentDescription(this.f3495y);
                return;
            }
            a(true, true, (View) imageView);
            int m10 = nhVar.m();
            if (m10 == 0) {
                this.f3481j.setImageDrawable(this.f3492v);
                this.f3481j.setContentDescription(this.f3495y);
            } else if (m10 == 1) {
                this.f3481j.setImageDrawable(this.f3493w);
                this.f3481j.setContentDescription(this.f3496z);
            } else if (m10 == 2) {
                this.f3481j.setImageDrawable(this.f3494x);
                this.f3481j.setContentDescription(this.A);
            }
            this.f3481j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        ImageView imageView;
        String str;
        if (c() && this.J && (imageView = this.f3482k) != null) {
            nh nhVar = this.H;
            if (!this.U) {
                a(false, false, (View) imageView);
                return;
            }
            if (nhVar == null) {
                a(true, false, (View) imageView);
                this.f3482k.setImageDrawable(this.C);
                this.f3482k.setContentDescription(this.G);
                return;
            }
            a(true, true, (View) imageView);
            this.f3482k.setImageDrawable(nhVar.r() ? this.B : this.C);
            ImageView imageView2 = this.f3482k;
            if (nhVar.r()) {
                str = this.F;
            } else {
                str = this.G;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        long j3;
        int i10;
        go.d dVar;
        nh nhVar = this.H;
        if (nhVar == null) {
            return;
        }
        boolean z10 = true;
        this.L = this.K && a(nhVar.n(), this.f3490s);
        long j10 = 0;
        this.f3474d0 = 0L;
        go n10 = nhVar.n();
        if (n10.c()) {
            j3 = 0;
            i10 = 0;
        } else {
            int t5 = nhVar.t();
            boolean z11 = this.L;
            int i11 = z11 ? 0 : t5;
            int b3 = z11 ? n10.b() - 1 : t5;
            long j11 = 0;
            i10 = 0;
            while (true) {
                if (i11 > b3) {
                    break;
                }
                if (i11 == t5) {
                    this.f3474d0 = r2.b(j11);
                }
                n10.a(i11, this.f3490s);
                go.d dVar2 = this.f3490s;
                if (dVar2.f4982o == C.TIME_UNSET) {
                    a1.b(this.L ^ z10);
                    break;
                }
                int i12 = dVar2.f4983p;
                while (true) {
                    dVar = this.f3490s;
                    if (i12 <= dVar.f4984q) {
                        n10.a(i12, this.f3489r);
                        int f10 = this.f3489r.f();
                        int a10 = this.f3489r.a();
                        while (f10 < a10) {
                            long b10 = this.f3489r.b(f10);
                            if (b10 == Long.MIN_VALUE) {
                                long j12 = this.f3489r.f4959d;
                                if (j12 == C.TIME_UNSET) {
                                    f10++;
                                    j10 = 0;
                                } else {
                                    b10 = j12;
                                }
                            }
                            long e2 = this.f3489r.e() + b10;
                            if (e2 >= j10) {
                                long[] jArr = this.W;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.W = Arrays.copyOf(jArr, length);
                                    this.f3468a0 = Arrays.copyOf(this.f3468a0, length);
                                }
                                this.W[i10] = r2.b(e2 + j11);
                                this.f3468a0[i10] = this.f3489r.e(f10);
                                i10++;
                            }
                            f10++;
                            j10 = 0;
                        }
                        i12++;
                        j10 = 0;
                    }
                }
                j11 += dVar.f4982o;
                i11++;
                z10 = true;
                j10 = 0;
            }
            j3 = j11;
        }
        long b11 = r2.b(j3);
        TextView textView = this.f3484m;
        if (textView != null) {
            textView.setText(yp.a(this.f3487p, this.f3488q, b11));
        }
        i iVar = this.f3486o;
        if (iVar != null) {
            iVar.setDuration(b11);
            int length2 = this.f3470b0.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.W;
            if (i13 > jArr2.length) {
                this.W = Arrays.copyOf(jArr2, i13);
                this.f3468a0 = Arrays.copyOf(this.f3468a0, i13);
            }
            System.arraycopy(this.f3470b0, 0, this.W, i10, length2);
            System.arraycopy(this.f3472c0, 0, this.f3468a0, i10, length2);
            this.f3486o.a(this.W, this.f3468a0, i13);
        }
        k();
    }

    public void g() {
        if (!c()) {
            setVisibility(0);
            Iterator it = this.f3469b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            h();
            e();
            d();
        }
        b();
    }

    private static boolean a(go goVar, go.d dVar) {
        if (goVar.b() > 100) {
            return false;
        }
        int b3 = goVar.b();
        for (int i10 = 0; i10 < b3; i10++) {
            if (goVar.a(i10, dVar).f4982o == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(nh nhVar) {
        this.I.b(nhVar, false);
    }

    public void b(e eVar) {
        this.f3469b.remove(eVar);
    }

    private boolean a(nh nhVar, int i10, long j3) {
        return this.I.a(nhVar, i10, j3);
    }

    private void b() {
        removeCallbacks(this.u);
        if (this.N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j3 = this.N;
            this.V = uptimeMillis + j3;
            if (this.J) {
                postDelayed(this.u, j3);
                return;
            }
            return;
        }
        this.V = C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(nh nhVar, long j3) {
        int t5;
        go n10 = nhVar.n();
        if (this.L && !n10.c()) {
            int b3 = n10.b();
            t5 = 0;
            while (true) {
                long d10 = n10.a(t5, this.f3490s).d();
                if (j3 < d10) {
                    break;
                }
                if (t5 == b3 - 1) {
                    j3 = d10;
                    break;
                } else {
                    j3 -= d10;
                    t5++;
                }
            }
        } else {
            t5 = nhVar.t();
        }
        a(nhVar, t5, j3);
        k();
    }

    /* loaded from: classes.dex */
    public final class c implements nh.e, i.a, View.OnClickListener {
        private c() {
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(nh nhVar, nh.d dVar) {
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
        public void b(i iVar, long j3) {
            if (d.this.f3485n != null) {
                d.this.f3485n.setText(yp.a(d.this.f3487p, d.this.f3488q, j3));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            nh nhVar = d.this.H;
            if (nhVar == null) {
                return;
            }
            if (d.this.f3473d == view) {
                d.this.I.a(nhVar);
                return;
            }
            if (d.this.f3471c == view) {
                d.this.I.e(nhVar);
                return;
            }
            if (d.this.f3479h == view) {
                if (nhVar.o() != 4) {
                    d.this.I.d(nhVar);
                    return;
                }
                return;
            }
            if (d.this.f3480i == view) {
                d.this.I.c(nhVar);
                return;
            }
            if (d.this.f3476f == view) {
                d.this.b(nhVar);
                return;
            }
            if (d.this.f3478g == view) {
                d.this.a(nhVar);
            } else if (d.this.f3481j == view) {
                d.this.I.a(nhVar, pi.a(nhVar.m(), d.this.P));
            } else if (d.this.f3482k == view) {
                d.this.I.a(nhVar, !nhVar.r());
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j3) {
            d.this.M = true;
            if (d.this.f3485n != null) {
                d.this.f3485n.setText(yp.a(d.this.f3487p, d.this.f3488q, j3));
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j3, boolean z10) {
            d.this.M = false;
            if (z10 || d.this.H == null) {
                return;
            }
            d dVar = d.this;
            dVar.a(dVar.H, j3);
        }
    }

    public void a(e eVar) {
        a1.a(eVar);
        this.f3469b.add(eVar);
    }

    public void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.f3469b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            removeCallbacks(this.f3491t);
            removeCallbacks(this.u);
            this.V = C.TIME_UNSET;
        }
    }

    private void a(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.D : this.E);
        view.setVisibility(z10 ? 0 : 8);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        nh nhVar = this.H;
        if (nhVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (nhVar.o() == 4) {
                return true;
            }
            this.I.d(nhVar);
            return true;
        }
        if (keyCode == 89) {
            this.I.c(nhVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            c(nhVar);
            return true;
        }
        if (keyCode == 87) {
            this.I.a(nhVar);
            return true;
        }
        if (keyCode == 88) {
            this.I.e(nhVar);
            return true;
        }
        if (keyCode == 126) {
            b(nhVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        a(nhVar);
        return true;
    }

    private static int a(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i10);
    }
}
