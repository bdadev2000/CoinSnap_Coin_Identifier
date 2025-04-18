package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.a1;
import com.applovin.impl.ab;
import com.applovin.impl.df;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.ok;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.r4;
import com.applovin.impl.r7;
import com.applovin.impl.sq;
import com.applovin.impl.t;
import com.applovin.impl.to;
import com.applovin.impl.uo;
import com.applovin.impl.yp;
import com.applovin.impl.yq;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class e extends FrameLayout {
    private boolean A;
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f3497b;

    /* renamed from: c, reason: collision with root package name */
    private final View f3498c;

    /* renamed from: d, reason: collision with root package name */
    private final View f3499d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3500f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f3501g;

    /* renamed from: h, reason: collision with root package name */
    private final SubtitleView f3502h;

    /* renamed from: i, reason: collision with root package name */
    private final View f3503i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f3504j;

    /* renamed from: k, reason: collision with root package name */
    private final d f3505k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f3506l;

    /* renamed from: m, reason: collision with root package name */
    private final FrameLayout f3507m;

    /* renamed from: n, reason: collision with root package name */
    private nh f3508n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3509o;

    /* renamed from: p, reason: collision with root package name */
    private d.e f3510p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3511q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f3512r;

    /* renamed from: s, reason: collision with root package name */
    private int f3513s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3514t;
    private CharSequence u;

    /* renamed from: v, reason: collision with root package name */
    private int f3515v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3516w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f3517x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f3518y;

    /* renamed from: z, reason: collision with root package name */
    private int f3519z;

    public e(Context context) {
        this(context, null);
    }

    private boolean a(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean m() {
        if (this.f3511q) {
            a1.b(this.f3501g);
            return true;
        }
        return false;
    }

    private boolean n() {
        if (this.f3509o) {
            a1.b(this.f3505k);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nh nhVar = this.f3508n;
        if (nhVar != null && nhVar.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean a10 = a(keyEvent.getKeyCode());
        if (a10 && n() && !this.f3505k.c()) {
            a(true);
            return true;
        }
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (a10 && n()) {
                a(true);
            }
            return false;
        }
        a(true);
        return true;
    }

    public List<t> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f3507m;
        if (frameLayout != null) {
            arrayList.add(new t(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        d dVar = this.f3505k;
        if (dVar != null) {
            arrayList.add(new t(dVar, 0));
        }
        return ab.a((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) a1.a(this.f3506l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f3516w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f3518y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f3515v;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f3512r;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f3507m;
    }

    @Nullable
    public nh getPlayer() {
        return this.f3508n;
    }

    public int getResizeMode() {
        a1.b(this.f3497b);
        return this.f3497b.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f3502h;
    }

    public boolean getUseArtwork() {
        return this.f3511q;
    }

    public boolean getUseController() {
        return this.f3509o;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f3499d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n() || this.f3508n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || !this.A) {
                return false;
            }
            this.A = false;
            performClick();
            return true;
        }
        this.A = true;
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (n() && this.f3508n != null) {
            a(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return g();
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.b bVar) {
        a1.b(this.f3497b);
        this.f3497b.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        a1.b(this.f3505k);
        this.f3505k.setControlDispatcher(r4Var);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f3516w = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f3517x = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        a1.b(this.f3505k);
        this.f3518y = z10;
        j();
    }

    public void setControllerShowTimeoutMs(int i10) {
        a1.b(this.f3505k);
        this.f3515v = i10;
        if (this.f3505k.c()) {
            f();
        }
    }

    public void setControllerVisibilityListener(@Nullable d.e eVar) {
        a1.b(this.f3505k);
        d.e eVar2 = this.f3510p;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f3505k.b(eVar2);
        }
        this.f3510p = eVar;
        if (eVar != null) {
            this.f3505k.a(eVar);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        boolean z10;
        if (this.f3504j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        this.u = charSequence;
        l();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f3512r != drawable) {
            this.f3512r = drawable;
            c(false);
        }
    }

    public void setErrorMessageProvider(@Nullable r7 r7Var) {
        if (r7Var != null) {
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f3514t != z10) {
            this.f3514t = z10;
            c(false);
        }
    }

    public void setPlayer(@Nullable nh nhVar) {
        boolean z10;
        boolean z11;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        if (nhVar != null && nhVar.p() != Looper.getMainLooper()) {
            z11 = false;
        } else {
            z11 = true;
        }
        a1.a(z11);
        nh nhVar2 = this.f3508n;
        if (nhVar2 == nhVar) {
            return;
        }
        if (nhVar2 != null) {
            nhVar2.a(this.a);
            if (nhVar2.b(26)) {
                View view = this.f3499d;
                if (view instanceof TextureView) {
                    nhVar2.b((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    nhVar2.b((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f3502h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f3508n = nhVar;
        if (n()) {
            this.f3505k.setPlayer(nhVar);
        }
        i();
        l();
        c(true);
        if (nhVar != null) {
            if (nhVar.b(26)) {
                View view2 = this.f3499d;
                if (view2 instanceof TextureView) {
                    nhVar.a((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    nhVar.a((SurfaceView) view2);
                }
                h();
            }
            if (this.f3502h != null && nhVar.b(27)) {
                this.f3502h.setCues(nhVar.x());
            }
            nhVar.b(this.a);
            a(false);
            return;
        }
        c();
    }

    public void setRepeatToggleModes(int i10) {
        a1.b(this.f3505k);
        this.f3505k.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        a1.b(this.f3497b);
        this.f3497b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f3513s != i10) {
            this.f3513s = i10;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        a1.b(this.f3505k);
        this.f3505k.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        a1.b(this.f3505k);
        this.f3505k.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        a1.b(this.f3505k);
        this.f3505k.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        a1.b(this.f3505k);
        this.f3505k.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        a1.b(this.f3505k);
        this.f3505k.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        a1.b(this.f3505k);
        this.f3505k.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f3498c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        boolean z11;
        if (z10 && this.f3501g == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        a1.b(z11);
        if (this.f3511q != z10) {
            this.f3511q = z10;
            c(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11;
        if (z10 && this.f3505k == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        a1.b(z11);
        if (this.f3509o == z10) {
            return;
        }
        this.f3509o = z10;
        if (n()) {
            this.f3505k.setPlayer(this.f3508n);
        } else {
            d dVar = this.f3505k;
            if (dVar != null) {
                dVar.a();
                this.f3505k.setPlayer(null);
            }
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f3499d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    /* loaded from: classes.dex */
    public final class a implements nh.e, View.OnLayoutChangeListener, View.OnClickListener, d.e {
        private final go.b a = new go.b();

        /* renamed from: b, reason: collision with root package name */
        private Object f3520b;

        public a() {
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(nh.f fVar, nh.f fVar2, int i10) {
            if (e.this.d() && e.this.f3517x) {
                e.this.c();
            }
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void b(int i10) {
            e.this.i();
            e.this.l();
            e.this.k();
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i10) {
            e.this.j();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.g();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            e.b((TextureView) view, e.this.f3519z);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(qo qoVar, uo uoVar) {
            nh nhVar = (nh) a1.a(e.this.f3508n);
            go n10 = nhVar.n();
            if (n10.c()) {
                this.f3520b = null;
            } else if (!nhVar.k().a()) {
                this.f3520b = n10.a(nhVar.v(), this.a, true).f4957b;
            } else {
                Object obj = this.f3520b;
                if (obj != null) {
                    int a = n10.a(obj);
                    if (a != -1) {
                        if (nhVar.t() == n10.a(a, this.a).f4958c) {
                            return;
                        }
                    }
                    this.f3520b = null;
                }
            }
            e.this.c(false);
        }

        @Override // com.applovin.impl.nh.e
        public void a(yq yqVar) {
            e.this.h();
        }

        @Override // com.applovin.impl.nh.e
        public void a(List list) {
            if (e.this.f3502h != null) {
                e.this.f3502h.setCues(list);
            }
        }

        @Override // com.applovin.impl.nh.e
        public void a() {
            if (e.this.f3498c != null) {
                e.this.f3498c.setVisibility(4);
            }
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(boolean z10, int i10) {
            e.this.i();
            e.this.k();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean a(qd qdVar) {
        byte[] bArr = qdVar.f7151l;
        if (bArr == null) {
            return false;
        }
        return a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private void b(boolean z10) {
        if (n()) {
            this.f3505k.setShowTimeoutMs(z10 ? 0 : this.f3515v);
            this.f3505k.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        nh nhVar = this.f3508n;
        return nhVar != null && nhVar.d() && this.f3508n.l();
    }

    private boolean e() {
        nh nhVar = this.f3508n;
        if (nhVar == null) {
            return true;
        }
        int o10 = nhVar.o();
        return this.f3516w && (o10 == 1 || o10 == 4 || !this.f3508n.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (!n() || this.f3508n == null) {
            return false;
        }
        if (!this.f3505k.c()) {
            a(true);
        } else if (this.f3518y) {
            this.f3505k.a();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        nh nhVar = this.f3508n;
        yq z10 = nhVar != null ? nhVar.z() : yq.f9267f;
        int i10 = z10.a;
        int i11 = z10.f9269b;
        int i12 = z10.f9270c;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * z10.f9271d) / i11;
        View view = this.f3499d;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.f3519z != 0) {
                view.removeOnLayoutChangeListener(this.a);
            }
            this.f3519z = i12;
            if (i12 != 0) {
                this.f3499d.addOnLayoutChangeListener(this.a);
            }
            b((TextureView) this.f3499d, this.f3519z);
        }
        a(this.f3497b, this.f3500f ? 0.0f : f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.f3508n.l() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r4 = this;
            android.view.View r0 = r4.f3503i
            if (r0 == 0) goto L2b
            com.applovin.impl.nh r0 = r4.f3508n
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.o()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f3513s
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            com.applovin.impl.nh r0 = r4.f3508n
            boolean r0 = r0.l()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f3503i
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.e.i():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        d dVar = this.f3505k;
        if (dVar != null && this.f3509o) {
            if (dVar.getVisibility() == 0) {
                setContentDescription(this.f3518y ? getResources().getString(R.string.al_exo_controls_hide) : null);
                return;
            } else {
                setContentDescription(getResources().getString(R.string.al_exo_controls_show));
                return;
            }
        }
        setContentDescription(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (d() && this.f3517x) {
            c();
        } else {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TextView textView = this.f3504j;
        if (textView != null) {
            CharSequence charSequence = this.u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f3504j.setVisibility(0);
            } else {
                nh nhVar = this.f3508n;
                if (nhVar != null) {
                    nhVar.c();
                }
                this.f3504j.setVisibility(8);
            }
        }
    }

    public void c() {
        d dVar = this.f3505k;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void f() {
        b(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        int i17;
        boolean z18;
        a aVar = new a();
        this.a = aVar;
        if (isInEditMode()) {
            this.f3497b = null;
            this.f3498c = null;
            this.f3499d = null;
            this.f3500f = false;
            this.f3501g = null;
            this.f3502h = null;
            this.f3503i = null;
            this.f3504j = null;
            this.f3505k = null;
            this.f3506l = null;
            this.f3507m = null;
            ImageView imageView = new ImageView(context);
            if (yp.a >= 23) {
                b(getResources(), imageView);
            } else {
                a(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i18 = R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinPlayerView, i10, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.AppLovinPlayerView_al_shutter_background_color);
                int color = obtainStyledAttributes.getColor(R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i18);
                boolean z19 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z20 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i19 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i20 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i21 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z21 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z22 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                i13 = obtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.f3514t = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.f3514t);
                boolean z23 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z12 = z21;
                z10 = z22;
                i12 = i20;
                z15 = z20;
                i16 = resourceId2;
                z14 = z19;
                i15 = color;
                z13 = hasValue;
                i14 = i19;
                i18 = resourceId;
                i11 = i21;
                z11 = z23;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            i13 = 0;
            z11 = true;
            z12 = true;
            i14 = 1;
            z13 = false;
            i15 = 0;
            z14 = true;
            i16 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i18, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.f3497b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i12);
        }
        View findViewById = findViewById(R.id.al_exo_shutter);
        this.f3498c = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout != null && i14 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                z16 = true;
                this.f3499d = new TextureView(context);
            } else if (i14 != 3) {
                if (i14 != 4) {
                    this.f3499d = new SurfaceView(context);
                } else {
                    try {
                        int i22 = sq.f8071b;
                        this.f3499d = (View) sq.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                z16 = true;
            } else {
                try {
                    int i23 = ok.f6810n;
                    z16 = true;
                    this.f3499d = (View) ok.class.getConstructor(Context.class).newInstance(context);
                    z18 = true;
                    this.f3499d.setLayoutParams(layoutParams);
                    this.f3499d.setOnClickListener(aVar);
                    this.f3499d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f3499d, 0);
                    z17 = z18;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            }
            z18 = false;
            this.f3499d.setLayoutParams(layoutParams);
            this.f3499d.setOnClickListener(aVar);
            this.f3499d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f3499d, 0);
            z17 = z18;
        } else {
            z16 = true;
            this.f3499d = null;
            z17 = false;
        }
        this.f3500f = z17;
        this.f3506l = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.f3507m = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f3501g = imageView2;
        this.f3511q = (!z14 || imageView2 == null) ? false : z16;
        if (i16 != 0) {
            this.f3512r = d0.h.getDrawable(getContext(), i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.f3502h = subtitleView;
        if (subtitleView != null) {
            subtitleView.c();
            subtitleView.d();
        }
        View findViewById2 = findViewById(R.id.al_exo_buffering);
        this.f3503i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f3513s = i13;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.f3504j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        d dVar = (d) findViewById(R.id.al_exo_controller);
        View findViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (dVar != null) {
            this.f3505k = dVar;
            i17 = 0;
        } else if (findViewById3 != null) {
            i17 = 0;
            d dVar2 = new d(context, null, 0, attributeSet);
            this.f3505k = dVar2;
            dVar2.setId(R.id.al_exo_controller);
            dVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(dVar2, indexOfChild);
        } else {
            i17 = 0;
            this.f3505k = null;
        }
        d dVar3 = this.f3505k;
        this.f3515v = dVar3 != null ? i11 : i17;
        this.f3518y = z12;
        this.f3516w = z10;
        this.f3517x = z11;
        this.f3509o = (!z15 || dVar3 == null) ? i17 : z16;
        c();
        j();
        d dVar4 = this.f3505k;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z10) {
        nh nhVar = this.f3508n;
        if (nhVar != null && !nhVar.k().a()) {
            if (z10 && !this.f3514t) {
                a();
            }
            uo A = nhVar.A();
            for (int i10 = 0; i10 < A.a; i10++) {
                to a10 = A.a(i10);
                if (a10 != null) {
                    for (int i11 = 0; i11 < a10.b(); i11++) {
                        if (df.e(a10.a(i11).f4228m) == 2) {
                            b();
                            return;
                        }
                    }
                }
            }
            a();
            if (m() && (a(nhVar.C()) || a(this.f3512r))) {
                return;
            }
            b();
            return;
        }
        if (this.f3514t) {
            return;
        }
        b();
        a();
    }

    private void b() {
        ImageView imageView = this.f3501g;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f3501g.setVisibility(4);
        }
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, null));
    }

    public boolean a(KeyEvent keyEvent) {
        return n() && this.f3505k.a(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    private void a(boolean z10) {
        if (!(d() && this.f3517x) && n()) {
            boolean z11 = this.f3505k.c() && this.f3505k.getShowTimeoutMs() <= 0;
            boolean e2 = e();
            if (z10 || z11 || e2) {
                b(e2);
            }
        }
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.f3497b, intrinsicWidth / intrinsicHeight);
                this.f3501g.setImageDrawable(drawable);
                this.f3501g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void a() {
        View view = this.f3498c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }
}
