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
import com.applovin.impl.AbstractC0669a1;
import com.applovin.impl.C0757t;
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

    /* renamed from: A, reason: collision with root package name */
    private boolean f6280A;

    /* renamed from: a, reason: collision with root package name */
    private final a f6281a;
    private final AspectRatioFrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    private final View f6282c;

    /* renamed from: d, reason: collision with root package name */
    private final View f6283d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6284f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f6285g;

    /* renamed from: h, reason: collision with root package name */
    private final SubtitleView f6286h;

    /* renamed from: i, reason: collision with root package name */
    private final View f6287i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f6288j;

    /* renamed from: k, reason: collision with root package name */
    private final d f6289k;
    private final FrameLayout l;
    private final FrameLayout m;

    /* renamed from: n, reason: collision with root package name */
    private nh f6290n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6291o;

    /* renamed from: p, reason: collision with root package name */
    private d.e f6292p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6293q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f6294r;

    /* renamed from: s, reason: collision with root package name */
    private int f6295s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6296t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f6297u;

    /* renamed from: v, reason: collision with root package name */
    private int f6298v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6299w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6300x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6301y;

    /* renamed from: z, reason: collision with root package name */
    private int f6302z;

    public e(Context context) {
        this(context, null);
    }

    private boolean a(int i9) {
        return i9 == 19 || i9 == 270 || i9 == 22 || i9 == 271 || i9 == 20 || i9 == 269 || i9 == 21 || i9 == 268 || i9 == 23;
    }

    private boolean m() {
        if (this.f6293q) {
            AbstractC0669a1.b(this.f6285g);
            return true;
        }
        return false;
    }

    private boolean n() {
        if (this.f6291o) {
            AbstractC0669a1.b(this.f6289k);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nh nhVar = this.f6290n;
        if (nhVar != null && nhVar.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean a6 = a(keyEvent.getKeyCode());
        if (a6 && n() && !this.f6289k.c()) {
            a(true);
            return true;
        }
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (a6 && n()) {
                a(true);
            }
            return false;
        }
        a(true);
        return true;
    }

    public List<C0757t> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            arrayList.add(new C0757t(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        d dVar = this.f6289k;
        if (dVar != null) {
            arrayList.add(new C0757t(dVar, 0));
        }
        return ab.a((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) AbstractC0669a1.a(this.l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f6299w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f6301y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f6298v;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f6294r;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.m;
    }

    @Nullable
    public nh getPlayer() {
        return this.f6290n;
    }

    public int getResizeMode() {
        AbstractC0669a1.b(this.b);
        return this.b.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f6286h;
    }

    public boolean getUseArtwork() {
        return this.f6293q;
    }

    public boolean getUseController() {
        return this.f6291o;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f6283d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n() || this.f6290n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || !this.f6280A) {
                return false;
            }
            this.f6280A = false;
            performClick();
            return true;
        }
        this.f6280A = true;
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (n() && this.f6290n != null) {
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
        AbstractC0669a1.b(this.b);
        this.b.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setControlDispatcher(r4Var);
    }

    public void setControllerAutoShow(boolean z8) {
        this.f6299w = z8;
    }

    public void setControllerHideDuringAds(boolean z8) {
        this.f6300x = z8;
    }

    public void setControllerHideOnTouch(boolean z8) {
        AbstractC0669a1.b(this.f6289k);
        this.f6301y = z8;
        j();
    }

    public void setControllerShowTimeoutMs(int i9) {
        AbstractC0669a1.b(this.f6289k);
        this.f6298v = i9;
        if (this.f6289k.c()) {
            f();
        }
    }

    public void setControllerVisibilityListener(@Nullable d.e eVar) {
        AbstractC0669a1.b(this.f6289k);
        d.e eVar2 = this.f6292p;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f6289k.b(eVar2);
        }
        this.f6292p = eVar;
        if (eVar != null) {
            this.f6289k.a(eVar);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        boolean z8;
        if (this.f6288j != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        this.f6297u = charSequence;
        l();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f6294r != drawable) {
            this.f6294r = drawable;
            c(false);
        }
    }

    public void setErrorMessageProvider(@Nullable r7 r7Var) {
        if (r7Var != null) {
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z8) {
        if (this.f6296t != z8) {
            this.f6296t = z8;
            c(false);
        }
    }

    public void setPlayer(@Nullable nh nhVar) {
        boolean z8;
        boolean z9;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        if (nhVar != null && nhVar.p() != Looper.getMainLooper()) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC0669a1.a(z9);
        nh nhVar2 = this.f6290n;
        if (nhVar2 == nhVar) {
            return;
        }
        if (nhVar2 != null) {
            nhVar2.a(this.f6281a);
            if (nhVar2.b(26)) {
                View view = this.f6283d;
                if (view instanceof TextureView) {
                    nhVar2.b((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    nhVar2.b((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f6286h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f6290n = nhVar;
        if (n()) {
            this.f6289k.setPlayer(nhVar);
        }
        i();
        l();
        c(true);
        if (nhVar != null) {
            if (nhVar.b(26)) {
                View view2 = this.f6283d;
                if (view2 instanceof TextureView) {
                    nhVar.a((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    nhVar.a((SurfaceView) view2);
                }
                h();
            }
            if (this.f6286h != null && nhVar.b(27)) {
                this.f6286h.setCues(nhVar.x());
            }
            nhVar.b(this.f6281a);
            a(false);
            return;
        }
        c();
    }

    public void setRepeatToggleModes(int i9) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setRepeatToggleModes(i9);
    }

    public void setResizeMode(int i9) {
        AbstractC0669a1.b(this.b);
        this.b.setResizeMode(i9);
    }

    public void setShowBuffering(int i9) {
        if (this.f6295s != i9) {
            this.f6295s = i9;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z8) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setShowFastForwardButton(z8);
    }

    public void setShowMultiWindowTimeBar(boolean z8) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setShowMultiWindowTimeBar(z8);
    }

    public void setShowNextButton(boolean z8) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setShowNextButton(z8);
    }

    public void setShowPreviousButton(boolean z8) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setShowPreviousButton(z8);
    }

    public void setShowRewindButton(boolean z8) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setShowRewindButton(z8);
    }

    public void setShowShuffleButton(boolean z8) {
        AbstractC0669a1.b(this.f6289k);
        this.f6289k.setShowShuffleButton(z8);
    }

    public void setShutterBackgroundColor(int i9) {
        View view = this.f6282c;
        if (view != null) {
            view.setBackgroundColor(i9);
        }
    }

    public void setUseArtwork(boolean z8) {
        boolean z9;
        if (z8 && this.f6285g == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC0669a1.b(z9);
        if (this.f6293q != z8) {
            this.f6293q = z8;
            c(false);
        }
    }

    public void setUseController(boolean z8) {
        boolean z9;
        if (z8 && this.f6289k == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC0669a1.b(z9);
        if (this.f6291o == z8) {
            return;
        }
        this.f6291o = z8;
        if (n()) {
            this.f6289k.setPlayer(this.f6290n);
        } else {
            d dVar = this.f6289k;
            if (dVar != null) {
                dVar.a();
                this.f6289k.setPlayer(null);
            }
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        View view = this.f6283d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i9);
        }
    }

    /* loaded from: classes.dex */
    public final class a implements nh.e, View.OnLayoutChangeListener, View.OnClickListener, d.e {

        /* renamed from: a, reason: collision with root package name */
        private final go.b f6303a = new go.b();
        private Object b;

        public a() {
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(nh.f fVar, nh.f fVar2, int i9) {
            if (e.this.d() && e.this.f6300x) {
                e.this.c();
            }
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void b(int i9) {
            e.this.i();
            e.this.l();
            e.this.k();
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i9) {
            e.this.j();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.g();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            e.b((TextureView) view, e.this.f6302z);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(qo qoVar, uo uoVar) {
            nh nhVar = (nh) AbstractC0669a1.a(e.this.f6290n);
            go n2 = nhVar.n();
            if (n2.c()) {
                this.b = null;
            } else if (!nhVar.k().a()) {
                this.b = n2.a(nhVar.v(), this.f6303a, true).b;
            } else {
                Object obj = this.b;
                if (obj != null) {
                    int a6 = n2.a(obj);
                    if (a6 != -1) {
                        if (nhVar.t() == n2.a(a6, this.f6303a).f7934c) {
                            return;
                        }
                    }
                    this.b = null;
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
            if (e.this.f6286h != null) {
                e.this.f6286h.setCues(list);
            }
        }

        @Override // com.applovin.impl.nh.e
        public void a() {
            if (e.this.f6282c != null) {
                e.this.f6282c.setVisibility(4);
            }
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(boolean z8, int i9) {
            e.this.i();
            e.this.k();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean a(qd qdVar) {
        byte[] bArr = qdVar.l;
        if (bArr == null) {
            return false;
        }
        return a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private void b(boolean z8) {
        if (n()) {
            this.f6289k.setShowTimeoutMs(z8 ? 0 : this.f6298v);
            this.f6289k.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        nh nhVar = this.f6290n;
        return nhVar != null && nhVar.d() && this.f6290n.l();
    }

    private boolean e() {
        nh nhVar = this.f6290n;
        if (nhVar == null) {
            return true;
        }
        int o3 = nhVar.o();
        return this.f6299w && (o3 == 1 || o3 == 4 || !this.f6290n.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (!n() || this.f6290n == null) {
            return false;
        }
        if (!this.f6289k.c()) {
            a(true);
        } else if (this.f6301y) {
            this.f6289k.a();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        nh nhVar = this.f6290n;
        yq z8 = nhVar != null ? nhVar.z() : yq.f12463f;
        int i9 = z8.f12465a;
        int i10 = z8.b;
        int i11 = z8.f12466c;
        float f9 = (i10 == 0 || i9 == 0) ? 0.0f : (i9 * z8.f12467d) / i10;
        View view = this.f6283d;
        if (view instanceof TextureView) {
            if (f9 > 0.0f && (i11 == 90 || i11 == 270)) {
                f9 = 1.0f / f9;
            }
            if (this.f6302z != 0) {
                view.removeOnLayoutChangeListener(this.f6281a);
            }
            this.f6302z = i11;
            if (i11 != 0) {
                this.f6283d.addOnLayoutChangeListener(this.f6281a);
            }
            b((TextureView) this.f6283d, this.f6302z);
        }
        a(this.b, this.f6284f ? 0.0f : f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.f6290n.l() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r4 = this;
            android.view.View r0 = r4.f6287i
            if (r0 == 0) goto L2b
            com.applovin.impl.nh r0 = r4.f6290n
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.o()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f6295s
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            com.applovin.impl.nh r0 = r4.f6290n
            boolean r0 = r0.l()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f6287i
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
        d dVar = this.f6289k;
        if (dVar != null && this.f6291o) {
            if (dVar.getVisibility() == 0) {
                setContentDescription(this.f6301y ? getResources().getString(R.string.al_exo_controls_hide) : null);
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
        if (d() && this.f6300x) {
            c();
        } else {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TextView textView = this.f6288j;
        if (textView != null) {
            CharSequence charSequence = this.f6297u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f6288j.setVisibility(0);
            } else {
                nh nhVar = this.f6290n;
                if (nhVar != null) {
                    nhVar.c();
                }
                this.f6288j.setVisibility(8);
            }
        }
    }

    public void c() {
        d dVar = this.f6289k;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void f() {
        b(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        boolean z15;
        a aVar = new a();
        this.f6281a = aVar;
        if (isInEditMode()) {
            this.b = null;
            this.f6282c = null;
            this.f6283d = null;
            this.f6284f = false;
            this.f6285g = null;
            this.f6286h = null;
            this.f6287i = null;
            this.f6288j = null;
            this.f6289k = null;
            this.l = null;
            this.m = null;
            ImageView imageView = new ImageView(context);
            if (yp.f12451a >= 23) {
                b(getResources(), imageView);
            } else {
                a(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinPlayerView, i9, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.AppLovinPlayerView_al_shutter_background_color);
                int color = obtainStyledAttributes.getColor(R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i17);
                boolean z16 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z17 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i18 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i19 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i20 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z18 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z19 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                i12 = obtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.f6296t = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.f6296t);
                boolean z20 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z11 = z17;
                i10 = i18;
                i13 = i19;
                z10 = z16;
                i15 = resourceId2;
                z12 = hasValue;
                i14 = color;
                z9 = z18;
                z8 = z19;
                i17 = resourceId;
                i11 = i20;
                z13 = z20;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i10 = 1;
            z8 = true;
            z9 = true;
            z10 = true;
            z11 = true;
            i11 = 5000;
            i12 = 0;
            i13 = 0;
            z12 = false;
            i14 = 0;
            i15 = 0;
            z13 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i13);
        }
        View findViewById = findViewById(R.id.al_exo_shutter);
        this.f6282c = findViewById;
        if (findViewById != null && z12) {
            findViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout != null && i10 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i10 == 2) {
                this.f6283d = new TextureView(context);
            } else if (i10 == 3) {
                try {
                    int i21 = ok.f9902n;
                    this.f6283d = (View) ok.class.getConstructor(Context.class).newInstance(context);
                    z15 = true;
                    this.f6283d.setLayoutParams(layoutParams);
                    this.f6283d.setOnClickListener(aVar);
                    this.f6283d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f6283d, 0);
                    z14 = z15;
                } catch (Exception e4) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e4);
                }
            } else if (i10 != 4) {
                this.f6283d = new SurfaceView(context);
            } else {
                try {
                    int i22 = sq.b;
                    this.f6283d = (View) sq.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e9) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e9);
                }
            }
            z15 = false;
            this.f6283d.setLayoutParams(layoutParams);
            this.f6283d.setOnClickListener(aVar);
            this.f6283d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f6283d, 0);
            z14 = z15;
        } else {
            this.f6283d = null;
            z14 = false;
        }
        this.f6284f = z14;
        this.l = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.m = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f6285g = imageView2;
        this.f6293q = z10 && imageView2 != null;
        if (i15 != 0) {
            this.f6294r = I.h.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.f6286h = subtitleView;
        if (subtitleView != null) {
            subtitleView.c();
            subtitleView.d();
        }
        View findViewById2 = findViewById(R.id.al_exo_buffering);
        this.f6287i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f6295s = i12;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.f6288j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        d dVar = (d) findViewById(R.id.al_exo_controller);
        View findViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (dVar != null) {
            this.f6289k = dVar;
            i16 = 0;
        } else if (findViewById3 != null) {
            i16 = 0;
            d dVar2 = new d(context, null, 0, attributeSet);
            this.f6289k = dVar2;
            dVar2.setId(R.id.al_exo_controller);
            dVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(dVar2, indexOfChild);
        } else {
            i16 = 0;
            this.f6289k = null;
        }
        d dVar3 = this.f6289k;
        this.f6298v = dVar3 != null ? i11 : i16;
        this.f6301y = z9;
        this.f6299w = z8;
        this.f6300x = z13;
        this.f6291o = (!z11 || dVar3 == null) ? i16 : 1;
        c();
        j();
        d dVar4 = this.f6289k;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z8) {
        nh nhVar = this.f6290n;
        if (nhVar != null && !nhVar.k().a()) {
            if (z8 && !this.f6296t) {
                a();
            }
            uo A8 = nhVar.A();
            for (int i9 = 0; i9 < A8.f11645a; i9++) {
                to a6 = A8.a(i9);
                if (a6 != null) {
                    for (int i10 = 0; i10 < a6.b(); i10++) {
                        if (df.e(a6.a(i10).m) == 2) {
                            b();
                            return;
                        }
                    }
                }
            }
            a();
            if (m() && (a(nhVar.C()) || a(this.f6294r))) {
                return;
            }
            b();
            return;
        }
        if (this.f6296t) {
            return;
        }
        b();
        a();
    }

    private void b() {
        ImageView imageView = this.f6285g;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f6285g.setVisibility(4);
        }
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, null));
    }

    public boolean a(KeyEvent keyEvent) {
        return n() && this.f6289k.a(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(TextureView textureView, int i9) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i9 != 0) {
            float f9 = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.postRotate(i9, f9, f10);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f9, f10);
        }
        textureView.setTransform(matrix);
    }

    public void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f9) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f9);
        }
    }

    private void a(boolean z8) {
        if (!(d() && this.f6300x) && n()) {
            boolean z9 = this.f6289k.c() && this.f6289k.getShowTimeoutMs() <= 0;
            boolean e4 = e();
            if (z8 || z9 || e4) {
                b(e4);
            }
        }
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.b, intrinsicWidth / intrinsicHeight);
                this.f6285g.setImageDrawable(drawable);
                this.f6285g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void a() {
        View view = this.f6282c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i9) {
        aspectRatioFrameLayout.setResizeMode(i9);
    }
}
