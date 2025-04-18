package l9;

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
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import n9.h0;
import s7.a2;
import s7.h2;
import s7.i0;
import s7.p0;
import s7.v2;
import s7.w2;
import s7.x2;
import v8.u0;

/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final String A;
    public final String B;
    public final Drawable C;
    public final Drawable D;
    public final float E;
    public final float F;
    public final String G;
    public final String H;
    public h2 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public long[] W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean[] f21212a0;

    /* renamed from: b, reason: collision with root package name */
    public final h f21213b;

    /* renamed from: b0, reason: collision with root package name */
    public final long[] f21214b0;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f21215c;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean[] f21216c0;

    /* renamed from: d, reason: collision with root package name */
    public final View f21217d;

    /* renamed from: d0, reason: collision with root package name */
    public long f21218d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f21219e0;

    /* renamed from: f, reason: collision with root package name */
    public final View f21220f;

    /* renamed from: g, reason: collision with root package name */
    public final View f21221g;

    /* renamed from: h, reason: collision with root package name */
    public final View f21222h;

    /* renamed from: i, reason: collision with root package name */
    public final View f21223i;

    /* renamed from: j, reason: collision with root package name */
    public final View f21224j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f21225k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f21226l;

    /* renamed from: m, reason: collision with root package name */
    public final View f21227m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f21228n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f21229o;

    /* renamed from: p, reason: collision with root package name */
    public final u f21230p;

    /* renamed from: q, reason: collision with root package name */
    public final StringBuilder f21231q;

    /* renamed from: r, reason: collision with root package name */
    public final Formatter f21232r;

    /* renamed from: s, reason: collision with root package name */
    public final v2 f21233s;

    /* renamed from: t, reason: collision with root package name */
    public final w2 f21234t;
    public final f u;

    /* renamed from: v, reason: collision with root package name */
    public final f f21235v;

    /* renamed from: w, reason: collision with root package name */
    public final Drawable f21236w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f21237x;

    /* renamed from: y, reason: collision with root package name */
    public final Drawable f21238y;

    /* renamed from: z, reason: collision with root package name */
    public final String f21239z;

    static {
        p0.a("goog.exo.ui");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v1, types: [l9.f] */
    /* JADX WARN: Type inference failed for: r7v2, types: [l9.f] */
    public k(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        final int i10 = 0;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = C.TIME_UNSET;
        final int i11 = 1;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        int i12 = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m.f21244c, 0, 0);
            try {
                this.N = obtainStyledAttributes.getInt(19, this.N);
                i12 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.P = obtainStyledAttributes.getInt(8, this.P);
                this.Q = obtainStyledAttributes.getBoolean(17, this.Q);
                this.R = obtainStyledAttributes.getBoolean(14, this.R);
                this.S = obtainStyledAttributes.getBoolean(16, this.S);
                this.T = obtainStyledAttributes.getBoolean(15, this.T);
                this.U = obtainStyledAttributes.getBoolean(18, this.U);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(20, this.O));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f21215c = new CopyOnWriteArrayList();
        this.f21233s = new v2();
        this.f21234t = new w2();
        StringBuilder sb2 = new StringBuilder();
        this.f21231q = sb2;
        this.f21232r = new Formatter(sb2, Locale.getDefault());
        this.W = new long[0];
        this.f21212a0 = new boolean[0];
        this.f21214b0 = new long[0];
        this.f21216c0 = new boolean[0];
        h hVar = new h(this);
        this.f21213b = hVar;
        this.u = new Runnable(this) { // from class: l9.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f21210c;

            {
                this.f21210c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i13 = i10;
                k kVar = this.f21210c;
                switch (i13) {
                    case 0:
                        kVar.h();
                        return;
                    default:
                        kVar.b();
                        return;
                }
            }
        };
        this.f21235v = new Runnable(this) { // from class: l9.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f21210c;

            {
                this.f21210c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i13 = i11;
                k kVar = this.f21210c;
                switch (i13) {
                    case 0:
                        kVar.h();
                        return;
                    default:
                        kVar.b();
                        return;
                }
            }
        };
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        u uVar = (u) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (uVar != null) {
            this.f21230p = uVar;
        } else if (findViewById != null) {
            e eVar = new e(context, attributeSet);
            eVar.setId(R.id.exo_progress);
            eVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(eVar, indexOfChild);
            this.f21230p = eVar;
        } else {
            this.f21230p = null;
        }
        this.f21228n = (TextView) findViewById(R.id.exo_duration);
        this.f21229o = (TextView) findViewById(R.id.exo_position);
        u uVar2 = this.f21230p;
        if (uVar2 != null) {
            ((e) uVar2).f21208z.add(hVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f21221g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(hVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f21222h = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(hVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f21217d = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(hVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f21220f = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(hVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f21224j = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(hVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f21223i = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(hVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f21225k = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(hVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f21226l = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(hVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.f21227m = findViewById8;
        setShowVrButton(false);
        e(false, false, findViewById8);
        Resources resources = context.getResources();
        this.E = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.F = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f21236w = h0.n(context, resources, R.drawable.exo_controls_repeat_off);
        this.f21237x = h0.n(context, resources, R.drawable.exo_controls_repeat_one);
        this.f21238y = h0.n(context, resources, R.drawable.exo_controls_repeat_all);
        this.C = h0.n(context, resources, R.drawable.exo_controls_shuffle_on);
        this.D = h0.n(context, resources, R.drawable.exo_controls_shuffle_off);
        this.f21239z = resources.getString(R.string.exo_controls_repeat_off_description);
        this.A = resources.getString(R.string.exo_controls_repeat_one_description);
        this.B = resources.getString(R.string.exo_controls_repeat_all_description);
        this.G = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.H = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f21219e0 = C.TIME_UNSET;
    }

    public final boolean a(KeyEvent keyEvent) {
        boolean z10;
        int keyCode = keyEvent.getKeyCode();
        h2 h2Var = this.I;
        if (h2Var != null) {
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (((i0) h2Var).A() != 4) {
                            s7.f fVar = (s7.f) h2Var;
                            i0 i0Var = (i0) fVar;
                            i0Var.S();
                            fVar.j(12, i0Var.f24420v);
                        }
                    } else if (keyCode == 89) {
                        s7.f fVar2 = (s7.f) h2Var;
                        i0 i0Var2 = (i0) fVar2;
                        i0Var2.S();
                        fVar2.j(11, -i0Var2.u);
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode != 79 && keyCode != 85) {
                            if (keyCode != 87) {
                                if (keyCode != 88) {
                                    if (keyCode != 126) {
                                        if (keyCode == 127) {
                                            h0.A(h2Var);
                                        }
                                    } else {
                                        h0.B(h2Var);
                                    }
                                } else {
                                    ((s7.f) h2Var).k();
                                }
                            } else {
                                ((s7.f) h2Var).i();
                            }
                        } else if (h0.O(h2Var)) {
                            h0.B(h2Var);
                        } else {
                            h0.A(h2Var);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (d()) {
            setVisibility(8);
            Iterator it = this.f21215c.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                getVisibility();
                l lVar = (l) jVar;
                lVar.getClass();
                lVar.f21242d.j();
            }
            removeCallbacks(this.u);
            removeCallbacks(this.f21235v);
            this.V = C.TIME_UNSET;
        }
    }

    public final void c() {
        f fVar = this.f21235v;
        removeCallbacks(fVar);
        if (this.N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j3 = this.N;
            this.V = uptimeMillis + j3;
            if (this.J) {
                postDelayed(fVar, j3);
                return;
            }
            return;
        }
        this.V = C.TIME_UNSET;
    }

    public final boolean d() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f21235v);
        } else if (motionEvent.getAction() == 1) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(boolean z10, boolean z11, View view) {
        float f10;
        int i10;
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        if (z11) {
            f10 = this.E;
        } else {
            f10 = this.F;
        }
        view.setAlpha(f10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    public final void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (d() && this.J) {
            h2 h2Var = this.I;
            if (h2Var != null) {
                s7.f fVar = (s7.f) h2Var;
                z10 = fVar.c(5);
                z12 = fVar.c(7);
                z13 = fVar.c(11);
                z14 = fVar.c(12);
                z11 = fVar.c(9);
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            e(this.S, z12, this.f21217d);
            e(this.Q, z13, this.f21224j);
            e(this.R, z14, this.f21223i);
            e(this.T, z11, this.f21220f);
            u uVar = this.f21230p;
            if (uVar != null) {
                ((e) uVar).setEnabled(z10);
            }
        }
    }

    public final void g() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        if (d() && this.J) {
            boolean O = h0.O(this.I);
            View view = this.f21221g;
            boolean z15 = true;
            int i11 = 0;
            if (view != null) {
                if (!O && view.isFocused()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z10 = z13 | false;
                if (h0.a < 21) {
                    z14 = z10;
                } else if (!O && g.a(view)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z11 = z14 | false;
                if (O) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                view.setVisibility(i10);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f21222h;
            if (view2 != null) {
                if (O && view2.isFocused()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 |= z12;
                if (h0.a < 21) {
                    z15 = z10;
                } else if (!O || !g.a(view2)) {
                    z15 = false;
                }
                z11 |= z15;
                if (O) {
                    i11 = 8;
                }
                view2.setVisibility(i11);
            }
            if (z10) {
                boolean O2 = h0.O(this.I);
                if (O2 && view != null) {
                    view.requestFocus();
                } else if (!O2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z11) {
                boolean O3 = h0.O(this.I);
                if (O3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else if (!O3 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    @Nullable
    public h2 getPlayer() {
        return this.I;
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
        View view = this.f21227m;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        long j3;
        long j10;
        boolean z10;
        int A;
        long j11;
        long Q;
        if (d() && this.J) {
            h2 h2Var = this.I;
            if (h2Var != null) {
                long j12 = this.f21218d0;
                i0 i0Var = (i0) h2Var;
                i0Var.S();
                j3 = i0Var.q(i0Var.f24403f0) + j12;
                long j13 = this.f21218d0;
                i0Var.S();
                if (i0Var.f24403f0.a.p()) {
                    Q = i0Var.f24407h0;
                } else {
                    a2 a2Var = i0Var.f24403f0;
                    if (a2Var.f24274k.f26320d != a2Var.f24265b.f26320d) {
                        Q = h0.Q(a2Var.a.m(i0Var.t(), i0Var.a).f24852p);
                    } else {
                        long j14 = a2Var.f24279p;
                        if (i0Var.f24403f0.f24274k.a()) {
                            a2 a2Var2 = i0Var.f24403f0;
                            v2 g10 = a2Var2.a.g(a2Var2.f24274k.a, i0Var.f24413n);
                            long d10 = g10.d(i0Var.f24403f0.f24274k.f26318b);
                            if (d10 == Long.MIN_VALUE) {
                                j14 = g10.f24788f;
                            } else {
                                j14 = d10;
                            }
                        }
                        a2 a2Var3 = i0Var.f24403f0;
                        x2 x2Var = a2Var3.a;
                        Object obj = a2Var3.f24274k.a;
                        v2 v2Var = i0Var.f24413n;
                        x2Var.g(obj, v2Var);
                        Q = h0.Q(j14 + v2Var.f24789g);
                    }
                }
                j10 = j13 + Q;
            } else {
                j3 = 0;
                j10 = 0;
            }
            boolean z11 = false;
            if (j3 != this.f21219e0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21219e0 = j3;
            TextView textView = this.f21229o;
            if (textView != null && !this.M && z10) {
                textView.setText(h0.w(this.f21231q, this.f21232r, j3));
            }
            u uVar = this.f21230p;
            if (uVar != null) {
                ((e) uVar).setPosition(j3);
                ((e) this.f21230p).setBufferedPosition(j10);
            }
            removeCallbacks(this.u);
            if (h2Var == null) {
                A = 1;
            } else {
                A = ((i0) h2Var).A();
            }
            long j15 = 1000;
            if (h2Var != null) {
                i0 i0Var2 = (i0) ((s7.f) h2Var);
                if (i0Var2.A() == 3 && i0Var2.z()) {
                    i0Var2.S();
                    if (i0Var2.f24403f0.f24276m == 0) {
                        z11 = true;
                    }
                }
                if (z11) {
                    u uVar2 = this.f21230p;
                    if (uVar2 != null) {
                        j11 = ((e) uVar2).getPreferredUpdateDelay();
                    } else {
                        j11 = 1000;
                    }
                    long min = Math.min(j11, 1000 - (j3 % 1000));
                    i0 i0Var3 = (i0) h2Var;
                    i0Var3.S();
                    float f10 = i0Var3.f24403f0.f24277n.f24302b;
                    if (f10 > 0.0f) {
                        j15 = ((float) min) / f10;
                    }
                    postDelayed(this.u, h0.i(j15, this.O, 1000L));
                    return;
                }
            }
            if (A != 4 && A != 1) {
                postDelayed(this.u, 1000L);
            }
        }
    }

    public final void i() {
        ImageView imageView;
        if (d() && this.J && (imageView = this.f21225k) != null) {
            if (this.P == 0) {
                e(false, false, imageView);
                return;
            }
            h2 h2Var = this.I;
            String str = this.f21239z;
            Drawable drawable = this.f21236w;
            if (h2Var == null) {
                e(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            e(true, true, imageView);
            i0 i0Var = (i0) h2Var;
            i0Var.S();
            int i10 = i0Var.D;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        imageView.setImageDrawable(this.f21238y);
                        imageView.setContentDescription(this.B);
                    }
                } else {
                    imageView.setImageDrawable(this.f21237x);
                    imageView.setContentDescription(this.A);
                }
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
            imageView.setVisibility(0);
        }
    }

    public final void j() {
        ImageView imageView;
        if (d() && this.J && (imageView = this.f21226l) != null) {
            h2 h2Var = this.I;
            if (!this.U) {
                e(false, false, imageView);
                return;
            }
            String str = this.H;
            Drawable drawable = this.D;
            if (h2Var == null) {
                e(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            e(true, true, imageView);
            i0 i0Var = (i0) h2Var;
            i0Var.S();
            if (i0Var.E) {
                drawable = this.C;
            }
            imageView.setImageDrawable(drawable);
            i0Var.S();
            if (i0Var.E) {
                str = this.G;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.k.k():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j3 = this.V;
        if (j3 != C.TIME_UNSET) {
            long uptimeMillis = j3 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.f21235v, uptimeMillis);
            }
        } else if (d()) {
            c();
        }
        g();
        f();
        i();
        j();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.u);
        removeCallbacks(this.f21235v);
    }

    public void setPlayer(@Nullable h2 h2Var) {
        boolean z10;
        boolean z11 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        if (h2Var != null) {
            if (((i0) h2Var).f24418s != Looper.getMainLooper()) {
                z11 = false;
            }
        }
        u0.d(z11);
        h2 h2Var2 = this.I;
        if (h2Var2 == h2Var) {
            return;
        }
        h hVar = this.f21213b;
        if (h2Var2 != null) {
            ((i0) h2Var2).H(hVar);
        }
        this.I = h2Var;
        if (h2Var != null) {
            hVar.getClass();
            ((i0) h2Var).f24411l.a(hVar);
        }
        g();
        f();
        i();
        j();
        k();
    }

    public void setProgressUpdateListener(@Nullable i iVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.P = i10;
        h2 h2Var = this.I;
        if (h2Var != null) {
            i0 i0Var = (i0) h2Var;
            i0Var.S();
            int i11 = i0Var.D;
            if (i10 == 0 && i11 != 0) {
                ((i0) this.I).M(0);
            } else if (i10 == 1 && i11 == 2) {
                ((i0) this.I).M(1);
            } else if (i10 == 2 && i11 == 1) {
                ((i0) this.I).M(2);
            }
        }
        i();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.R = z10;
        f();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.K = z10;
        k();
    }

    public void setShowNextButton(boolean z10) {
        this.T = z10;
        f();
    }

    public void setShowPreviousButton(boolean z10) {
        this.S = z10;
        f();
    }

    public void setShowRewindButton(boolean z10) {
        this.Q = z10;
        f();
    }

    public void setShowShuffleButton(boolean z10) {
        this.U = z10;
        j();
    }

    public void setShowTimeoutMs(int i10) {
        this.N = i10;
        if (d()) {
            c();
        }
    }

    public void setShowVrButton(boolean z10) {
        int i10;
        View view = this.f21227m;
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
        this.O = h0.h(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        boolean z10;
        View view = this.f21227m;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e(showVrButton, z10, view);
        }
    }
}
