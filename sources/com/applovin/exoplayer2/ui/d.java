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
import com.applovin.impl.AbstractC0669a1;
import com.applovin.impl.AbstractC0744r2;
import com.applovin.impl.d8;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.pi;
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

    /* renamed from: A, reason: collision with root package name */
    private final String f6230A;

    /* renamed from: B, reason: collision with root package name */
    private final Drawable f6231B;

    /* renamed from: C, reason: collision with root package name */
    private final Drawable f6232C;

    /* renamed from: D, reason: collision with root package name */
    private final float f6233D;

    /* renamed from: E, reason: collision with root package name */
    private final float f6234E;

    /* renamed from: F, reason: collision with root package name */
    private final String f6235F;

    /* renamed from: G, reason: collision with root package name */
    private final String f6236G;

    /* renamed from: H, reason: collision with root package name */
    private nh f6237H;

    /* renamed from: I, reason: collision with root package name */
    private r4 f6238I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f6239J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6240K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f6241L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f6242M;

    /* renamed from: N, reason: collision with root package name */
    private int f6243N;
    private int O;

    /* renamed from: P, reason: collision with root package name */
    private int f6244P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f6245Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f6246R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f6247S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f6248T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f6249U;

    /* renamed from: V, reason: collision with root package name */
    private long f6250V;

    /* renamed from: W, reason: collision with root package name */
    private long[] f6251W;

    /* renamed from: a, reason: collision with root package name */
    private final c f6252a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean[] f6253a0;
    private final CopyOnWriteArrayList b;

    /* renamed from: b0, reason: collision with root package name */
    private long[] f6254b0;

    /* renamed from: c, reason: collision with root package name */
    private final View f6255c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean[] f6256c0;

    /* renamed from: d, reason: collision with root package name */
    private final View f6257d;

    /* renamed from: d0, reason: collision with root package name */
    private long f6258d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f6259e0;

    /* renamed from: f, reason: collision with root package name */
    private final View f6260f;
    private long f0;

    /* renamed from: g, reason: collision with root package name */
    private final View f6261g;

    /* renamed from: h, reason: collision with root package name */
    private final View f6262h;

    /* renamed from: i, reason: collision with root package name */
    private final View f6263i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageView f6264j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f6265k;
    private final View l;
    private final TextView m;

    /* renamed from: n, reason: collision with root package name */
    private final TextView f6266n;

    /* renamed from: o, reason: collision with root package name */
    private final i f6267o;

    /* renamed from: p, reason: collision with root package name */
    private final StringBuilder f6268p;

    /* renamed from: q, reason: collision with root package name */
    private final Formatter f6269q;

    /* renamed from: r, reason: collision with root package name */
    private final go.b f6270r;

    /* renamed from: s, reason: collision with root package name */
    private final go.d f6271s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f6272t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f6273u;

    /* renamed from: v, reason: collision with root package name */
    private final Drawable f6274v;

    /* renamed from: w, reason: collision with root package name */
    private final Drawable f6275w;

    /* renamed from: x, reason: collision with root package name */
    private final Drawable f6276x;

    /* renamed from: y, reason: collision with root package name */
    private final String f6277y;

    /* renamed from: z, reason: collision with root package name */
    private final String f6278z;

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
        void d(int i9);
    }

    static {
        d8.a("goog.exo.ui");
    }

    public d(Context context, AttributeSet attributeSet, int i9, AttributeSet attributeSet2) {
        super(context, attributeSet, i9);
        int i10 = R.layout.applovin_exo_player_control_view;
        this.f6243N = 5000;
        this.f6244P = 0;
        this.O = 200;
        this.f6250V = C.TIME_UNSET;
        this.f6245Q = true;
        this.f6246R = true;
        this.f6247S = true;
        this.f6248T = true;
        this.f6249U = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i9, 0);
            try {
                this.f6243N = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.f6243N);
                i10 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, i10);
                this.f6244P = a(obtainStyledAttributes, this.f6244P);
                this.f6245Q = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.f6245Q);
                this.f6246R = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.f6246R);
                this.f6247S = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.f6247S);
                this.f6248T = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_next_button, this.f6248T);
                this.f6249U = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.f6249U);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.b = new CopyOnWriteArrayList();
        this.f6270r = new go.b();
        this.f6271s = new go.d();
        StringBuilder sb = new StringBuilder();
        this.f6268p = sb;
        this.f6269q = new Formatter(sb, Locale.getDefault());
        this.f6251W = new long[0];
        this.f6253a0 = new boolean[0];
        this.f6254b0 = new long[0];
        this.f6256c0 = new boolean[0];
        c cVar = new c();
        this.f6252a = cVar;
        this.f6238I = new s5();
        final int i11 = 0;
        this.f6272t = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f6354c;

            {
                this.f6354c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f6354c.k();
                        return;
                    default:
                        this.f6354c.a();
                        return;
                }
            }
        };
        final int i12 = 1;
        this.f6273u = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f6354c;

            {
                this.f6354c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f6354c.k();
                        return;
                    default:
                        this.f6354c.a();
                        return;
                }
            }
        };
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        i iVar = (i) findViewById(R.id.al_exo_progress);
        View findViewById = findViewById(R.id.al_exo_progress_placeholder);
        if (iVar != null) {
            this.f6267o = iVar;
        } else if (findViewById != null) {
            com.applovin.exoplayer2.ui.b bVar = new com.applovin.exoplayer2.ui.b(context, null, 0, attributeSet2);
            bVar.setId(R.id.al_exo_progress);
            bVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bVar, indexOfChild);
            this.f6267o = bVar;
        } else {
            this.f6267o = null;
        }
        this.m = (TextView) findViewById(R.id.al_exo_duration);
        this.f6266n = (TextView) findViewById(R.id.al_exo_position);
        i iVar2 = this.f6267o;
        if (iVar2 != null) {
            iVar2.a(cVar);
        }
        View findViewById2 = findViewById(R.id.al_exo_play);
        this.f6260f = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(R.id.al_exo_pause);
        this.f6261g = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        View findViewById4 = findViewById(R.id.al_exo_prev);
        this.f6255c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(cVar);
        }
        View findViewById5 = findViewById(R.id.al_exo_next);
        this.f6257d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(R.id.al_exo_rew);
        this.f6263i = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(R.id.al_exo_ffwd);
        this.f6262h = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.f6264j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.f6265k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View findViewById8 = findViewById(R.id.al_exo_vr);
        this.l = findViewById8;
        setShowVrButton(false);
        a(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f6233D = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f6234E = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f6274v = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.f6275w = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.f6276x = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.f6231B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.f6232C = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.f6277y = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.f6278z = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.f6230A = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.f6235F = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.f6236G = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    private static boolean a(int i9) {
        return i9 == 90 || i9 == 89 || i9 == 85 || i9 == 79 || i9 == 126 || i9 == 127 || i9 == 87 || i9 == 88;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f6273u);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public nh getPlayer() {
        return this.f6237H;
    }

    public int getRepeatToggleModes() {
        return this.f6244P;
    }

    public boolean getShowShuffleButton() {
        return this.f6249U;
    }

    public int getShowTimeoutMs() {
        return this.f6243N;
    }

    public boolean getShowVrButton() {
        View view = this.l;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6239J = true;
        long j7 = this.f6250V;
        if (j7 != C.TIME_UNSET) {
            long uptimeMillis = j7 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.f6273u, uptimeMillis);
            }
        } else if (c()) {
            b();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6239J = false;
        removeCallbacks(this.f6272t);
        removeCallbacks(this.f6273u);
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        if (this.f6238I != r4Var) {
            this.f6238I = r4Var;
            i();
        }
    }

    public void setPlayer(@Nullable nh nhVar) {
        boolean z8;
        boolean z9 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        if (nhVar == null || nhVar.p() == Looper.getMainLooper()) {
            z9 = true;
        }
        AbstractC0669a1.a(z9);
        nh nhVar2 = this.f6237H;
        if (nhVar2 == nhVar) {
            return;
        }
        if (nhVar2 != null) {
            nhVar2.a(this.f6252a);
        }
        this.f6237H = nhVar;
        if (nhVar != null) {
            nhVar.b(this.f6252a);
        }
        h();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC0009d interfaceC0009d) {
    }

    public void setRepeatToggleModes(int i9) {
        this.f6244P = i9;
        nh nhVar = this.f6237H;
        if (nhVar != null) {
            int m = nhVar.m();
            if (i9 == 0 && m != 0) {
                this.f6238I.a(this.f6237H, 0);
            } else if (i9 == 1 && m == 2) {
                this.f6238I.a(this.f6237H, 1);
            } else if (i9 == 2 && m == 1) {
                this.f6238I.a(this.f6237H, 2);
            }
        }
        l();
    }

    public void setShowFastForwardButton(boolean z8) {
        this.f6246R = z8;
        i();
    }

    public void setShowMultiWindowTimeBar(boolean z8) {
        this.f6240K = z8;
        n();
    }

    public void setShowNextButton(boolean z8) {
        this.f6248T = z8;
        i();
    }

    public void setShowPreviousButton(boolean z8) {
        this.f6247S = z8;
        i();
    }

    public void setShowRewindButton(boolean z8) {
        this.f6245Q = z8;
        i();
    }

    public void setShowShuffleButton(boolean z8) {
        this.f6249U = z8;
        m();
    }

    public void setShowTimeoutMs(int i9) {
        this.f6243N = i9;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z8) {
        int i9;
        View view = this.l;
        if (view != null) {
            if (z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            view.setVisibility(i9);
        }
    }

    public void setTimeBarMinUpdateInterval(int i9) {
        this.O = yp.a(i9, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        boolean z8;
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            a(showVrButton, z8, this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(nh nhVar) {
        int o3 = nhVar.o();
        if (o3 == 1) {
            this.f6238I.b(nhVar);
        } else if (o3 == 4) {
            a(nhVar, nhVar.t(), C.TIME_UNSET);
        }
        this.f6238I.b(nhVar, true);
    }

    private void c(nh nhVar) {
        int o3 = nhVar.o();
        if (o3 != 1 && o3 != 4 && nhVar.l()) {
            a(nhVar);
        } else {
            b(nhVar);
        }
    }

    private void d() {
        View view;
        View view2;
        boolean f9 = f();
        if (!f9 && (view2 = this.f6260f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!f9 || (view = this.f6261g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void e() {
        View view;
        View view2;
        boolean f9 = f();
        if (!f9 && (view2 = this.f6260f) != null) {
            view2.requestFocus();
        } else {
            if (!f9 || (view = this.f6261g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private boolean f() {
        nh nhVar = this.f6237H;
        return (nhVar == null || nhVar.o() == 4 || this.f6237H.o() == 1 || !this.f6237H.l()) ? false : true;
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
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (c() && this.f6239J) {
            nh nhVar = this.f6237H;
            boolean z12 = false;
            if (nhVar != null) {
                boolean b8 = nhVar.b(4);
                boolean b9 = nhVar.b(6);
                z11 = nhVar.b(10) && this.f6238I.b();
                if (nhVar.b(11) && this.f6238I.a()) {
                    z12 = true;
                }
                z9 = nhVar.b(8);
                z8 = z12;
                z12 = b9;
                z10 = b8;
            } else {
                z8 = false;
                z9 = false;
                z10 = false;
                z11 = false;
            }
            a(this.f6247S, z12, this.f6255c);
            a(this.f6245Q, z11, this.f6263i);
            a(this.f6246R, z8, this.f6262h);
            a(this.f6248T, z9, this.f6257d);
            i iVar = this.f6267o;
            if (iVar != null) {
                iVar.setEnabled(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean z8;
        boolean z9;
        if (c() && this.f6239J) {
            boolean f9 = f();
            View view = this.f6260f;
            boolean z10 = true;
            if (view != null) {
                z8 = f9 && view.isFocused();
                if (yp.f12451a < 21) {
                    z9 = z8;
                } else {
                    z9 = f9 && b.a(this.f6260f);
                }
                this.f6260f.setVisibility(f9 ? 8 : 0);
            } else {
                z8 = false;
                z9 = false;
            }
            View view2 = this.f6261g;
            if (view2 != null) {
                z8 |= !f9 && view2.isFocused();
                if (yp.f12451a < 21) {
                    z10 = z8;
                } else if (f9 || !b.a(this.f6261g)) {
                    z10 = false;
                }
                z9 |= z10;
                this.f6261g.setVisibility(f9 ? 0 : 8);
            }
            if (z8) {
                e();
            }
            if (z9) {
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long j7;
        long j9;
        if (c() && this.f6239J) {
            nh nhVar = this.f6237H;
            if (nhVar != null) {
                j7 = nhVar.g() + this.f6258d0;
                j9 = nhVar.s() + this.f6258d0;
            } else {
                j7 = 0;
                j9 = 0;
            }
            boolean z8 = j7 != this.f6259e0;
            this.f6259e0 = j7;
            this.f0 = j9;
            TextView textView = this.f6266n;
            if (textView != null && !this.f6242M && z8) {
                textView.setText(yp.a(this.f6268p, this.f6269q, j7));
            }
            i iVar = this.f6267o;
            if (iVar != null) {
                iVar.setPosition(j7);
                this.f6267o.setBufferedPosition(j9);
            }
            removeCallbacks(this.f6272t);
            int o3 = nhVar == null ? 1 : nhVar.o();
            if (nhVar == null || !nhVar.isPlaying()) {
                if (o3 == 4 || o3 == 1) {
                    return;
                }
                postDelayed(this.f6272t, 1000L);
                return;
            }
            i iVar2 = this.f6267o;
            long min = Math.min(iVar2 != null ? iVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j7 % 1000));
            postDelayed(this.f6272t, yp.b(nhVar.a().f9208a > 0.0f ? ((float) min) / r0 : 1000L, this.O, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ImageView imageView;
        if (c() && this.f6239J && (imageView = this.f6264j) != null) {
            if (this.f6244P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            nh nhVar = this.f6237H;
            if (nhVar == null) {
                a(true, false, (View) imageView);
                this.f6264j.setImageDrawable(this.f6274v);
                this.f6264j.setContentDescription(this.f6277y);
                return;
            }
            a(true, true, (View) imageView);
            int m = nhVar.m();
            if (m == 0) {
                this.f6264j.setImageDrawable(this.f6274v);
                this.f6264j.setContentDescription(this.f6277y);
            } else if (m == 1) {
                this.f6264j.setImageDrawable(this.f6275w);
                this.f6264j.setContentDescription(this.f6278z);
            } else if (m == 2) {
                this.f6264j.setImageDrawable(this.f6276x);
                this.f6264j.setContentDescription(this.f6230A);
            }
            this.f6264j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        ImageView imageView;
        String str;
        if (c() && this.f6239J && (imageView = this.f6265k) != null) {
            nh nhVar = this.f6237H;
            if (!this.f6249U) {
                a(false, false, (View) imageView);
                return;
            }
            if (nhVar == null) {
                a(true, false, (View) imageView);
                this.f6265k.setImageDrawable(this.f6232C);
                this.f6265k.setContentDescription(this.f6236G);
                return;
            }
            a(true, true, (View) imageView);
            this.f6265k.setImageDrawable(nhVar.r() ? this.f6231B : this.f6232C);
            ImageView imageView2 = this.f6265k;
            if (nhVar.r()) {
                str = this.f6235F;
            } else {
                str = this.f6236G;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        long j7;
        int i9;
        go.d dVar;
        nh nhVar = this.f6237H;
        if (nhVar == null) {
            return;
        }
        boolean z8 = true;
        this.f6241L = this.f6240K && a(nhVar.n(), this.f6271s);
        long j9 = 0;
        this.f6258d0 = 0L;
        go n2 = nhVar.n();
        if (n2.c()) {
            j7 = 0;
            i9 = 0;
        } else {
            int t9 = nhVar.t();
            boolean z9 = this.f6241L;
            int i10 = z9 ? 0 : t9;
            int b8 = z9 ? n2.b() - 1 : t9;
            long j10 = 0;
            i9 = 0;
            while (true) {
                if (i10 > b8) {
                    break;
                }
                if (i10 == t9) {
                    this.f6258d0 = AbstractC0744r2.b(j10);
                }
                n2.a(i10, this.f6271s);
                go.d dVar2 = this.f6271s;
                if (dVar2.f7957o == C.TIME_UNSET) {
                    AbstractC0669a1.b(this.f6241L ^ z8);
                    break;
                }
                int i11 = dVar2.f7958p;
                while (true) {
                    dVar = this.f6271s;
                    if (i11 <= dVar.f7959q) {
                        n2.a(i11, this.f6270r);
                        int f9 = this.f6270r.f();
                        int a6 = this.f6270r.a();
                        while (f9 < a6) {
                            long b9 = this.f6270r.b(f9);
                            if (b9 == Long.MIN_VALUE) {
                                long j11 = this.f6270r.f7935d;
                                if (j11 == C.TIME_UNSET) {
                                    f9++;
                                    j9 = 0;
                                } else {
                                    b9 = j11;
                                }
                            }
                            long e4 = this.f6270r.e() + b9;
                            if (e4 >= j9) {
                                long[] jArr = this.f6251W;
                                if (i9 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f6251W = Arrays.copyOf(jArr, length);
                                    this.f6253a0 = Arrays.copyOf(this.f6253a0, length);
                                }
                                this.f6251W[i9] = AbstractC0744r2.b(e4 + j10);
                                this.f6253a0[i9] = this.f6270r.e(f9);
                                i9++;
                            }
                            f9++;
                            j9 = 0;
                        }
                        i11++;
                        j9 = 0;
                    }
                }
                j10 += dVar.f7957o;
                i10++;
                z8 = true;
                j9 = 0;
            }
            j7 = j10;
        }
        long b10 = AbstractC0744r2.b(j7);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(yp.a(this.f6268p, this.f6269q, b10));
        }
        i iVar = this.f6267o;
        if (iVar != null) {
            iVar.setDuration(b10);
            int length2 = this.f6254b0.length;
            int i12 = i9 + length2;
            long[] jArr2 = this.f6251W;
            if (i12 > jArr2.length) {
                this.f6251W = Arrays.copyOf(jArr2, i12);
                this.f6253a0 = Arrays.copyOf(this.f6253a0, i12);
            }
            System.arraycopy(this.f6254b0, 0, this.f6251W, i9, length2);
            System.arraycopy(this.f6256c0, 0, this.f6253a0, i9, length2);
            this.f6267o.a(this.f6251W, this.f6253a0, i12);
        }
        k();
    }

    public void g() {
        if (!c()) {
            setVisibility(0);
            Iterator it = this.b.iterator();
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
        int b8 = goVar.b();
        for (int i9 = 0; i9 < b8; i9++) {
            if (goVar.a(i9, dVar).f7957o == C.TIME_UNSET) {
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
        this.f6238I.b(nhVar, false);
    }

    public void b(e eVar) {
        this.b.remove(eVar);
    }

    private boolean a(nh nhVar, int i9, long j7) {
        return this.f6238I.a(nhVar, i9, j7);
    }

    private void b() {
        removeCallbacks(this.f6273u);
        if (this.f6243N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j7 = this.f6243N;
            this.f6250V = uptimeMillis + j7;
            if (this.f6239J) {
                postDelayed(this.f6273u, j7);
                return;
            }
            return;
        }
        this.f6250V = C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(nh nhVar, long j7) {
        int t9;
        go n2 = nhVar.n();
        if (this.f6241L && !n2.c()) {
            int b8 = n2.b();
            t9 = 0;
            while (true) {
                long d2 = n2.a(t9, this.f6271s).d();
                if (j7 < d2) {
                    break;
                }
                if (t9 == b8 - 1) {
                    j7 = d2;
                    break;
                } else {
                    j7 -= d2;
                    t9++;
                }
            }
        } else {
            t9 = nhVar.t();
        }
        a(nhVar, t9, j7);
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
        public void b(i iVar, long j7) {
            if (d.this.f6266n != null) {
                d.this.f6266n.setText(yp.a(d.this.f6268p, d.this.f6269q, j7));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            nh nhVar = d.this.f6237H;
            if (nhVar == null) {
                return;
            }
            if (d.this.f6257d == view) {
                d.this.f6238I.a(nhVar);
                return;
            }
            if (d.this.f6255c == view) {
                d.this.f6238I.e(nhVar);
                return;
            }
            if (d.this.f6262h == view) {
                if (nhVar.o() != 4) {
                    d.this.f6238I.d(nhVar);
                    return;
                }
                return;
            }
            if (d.this.f6263i == view) {
                d.this.f6238I.c(nhVar);
                return;
            }
            if (d.this.f6260f == view) {
                d.this.b(nhVar);
                return;
            }
            if (d.this.f6261g == view) {
                d.this.a(nhVar);
            } else if (d.this.f6264j == view) {
                d.this.f6238I.a(nhVar, pi.a(nhVar.m(), d.this.f6244P));
            } else if (d.this.f6265k == view) {
                d.this.f6238I.a(nhVar, !nhVar.r());
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j7) {
            d.this.f6242M = true;
            if (d.this.f6266n != null) {
                d.this.f6266n.setText(yp.a(d.this.f6268p, d.this.f6269q, j7));
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j7, boolean z8) {
            d.this.f6242M = false;
            if (z8 || d.this.f6237H == null) {
                return;
            }
            d dVar = d.this;
            dVar.a(dVar.f6237H, j7);
        }
    }

    public void a(e eVar) {
        AbstractC0669a1.a(eVar);
        this.b.add(eVar);
    }

    public void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            removeCallbacks(this.f6272t);
            removeCallbacks(this.f6273u);
            this.f6250V = C.TIME_UNSET;
        }
    }

    private void a(boolean z8, boolean z9, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z9);
        view.setAlpha(z9 ? this.f6233D : this.f6234E);
        view.setVisibility(z8 ? 0 : 8);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        nh nhVar = this.f6237H;
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
            this.f6238I.d(nhVar);
            return true;
        }
        if (keyCode == 89) {
            this.f6238I.c(nhVar);
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
            this.f6238I.a(nhVar);
            return true;
        }
        if (keyCode == 88) {
            this.f6238I.e(nhVar);
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

    private static int a(TypedArray typedArray, int i9) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i9);
    }
}
