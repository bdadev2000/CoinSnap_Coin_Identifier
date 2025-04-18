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
import androidx.core.content.ContextCompat;
import com.applovin.exoplayer2.ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.Cif;
import com.applovin.impl.b1;
import com.applovin.impl.eb;
import com.applovin.impl.fo;
import com.applovin.impl.po;
import com.applovin.impl.qh;
import com.applovin.impl.rk;
import com.applovin.impl.rq;
import com.applovin.impl.so;
import com.applovin.impl.t;
import com.applovin.impl.t4;
import com.applovin.impl.t7;
import com.applovin.impl.to;
import com.applovin.impl.vd;
import com.applovin.impl.xp;
import com.applovin.impl.xq;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class e extends FrameLayout {
    private boolean A;

    /* renamed from: a, reason: collision with root package name */
    private final a f22589a;

    /* renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f22590b;

    /* renamed from: c, reason: collision with root package name */
    private final View f22591c;
    private final View d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22592f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f22593g;

    /* renamed from: h, reason: collision with root package name */
    private final SubtitleView f22594h;

    /* renamed from: i, reason: collision with root package name */
    private final View f22595i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f22596j;

    /* renamed from: k, reason: collision with root package name */
    private final d f22597k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f22598l;

    /* renamed from: m, reason: collision with root package name */
    private final FrameLayout f22599m;

    /* renamed from: n, reason: collision with root package name */
    private qh f22600n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22601o;

    /* renamed from: p, reason: collision with root package name */
    private d.e f22602p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22603q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f22604r;

    /* renamed from: s, reason: collision with root package name */
    private int f22605s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22606t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f22607u;

    /* renamed from: v, reason: collision with root package name */
    private int f22608v;
    private boolean w;
    private boolean x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22609y;

    /* renamed from: z, reason: collision with root package name */
    private int f22610z;

    public e(Context context) {
        this(context, null);
    }

    private boolean a(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    private boolean m() {
        if (!this.f22603q) {
            return false;
        }
        b1.b(this.f22593g);
        return true;
    }

    private boolean n() {
        if (!this.f22601o) {
            return false;
        }
        b1.b(this.f22597k);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        qh qhVar = this.f22600n;
        if (qhVar != null && qhVar.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean a2 = a(keyEvent.getKeyCode());
        if (a2 && n() && !this.f22597k.c()) {
            a(true);
            return true;
        }
        if (a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
            return true;
        }
        if (a2 && n()) {
            a(true);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public List<t> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f22599m;
        if (frameLayout != null) {
            arrayList.add(new t(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        d dVar = this.f22597k;
        if (dVar != null) {
            arrayList.add(new t(dVar, 0));
        }
        return eb.a((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) b1.a(this.f22598l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f22609y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f22608v;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f22604r;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f22599m;
    }

    @Nullable
    public qh getPlayer() {
        return this.f22600n;
    }

    public int getResizeMode() {
        b1.b(this.f22590b);
        return this.f22590b.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f22594h;
    }

    public boolean getUseArtwork() {
        return this.f22603q;
    }

    public boolean getUseController() {
        return this.f22601o;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n() || this.f22600n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        }
        if (action != 1 || !this.A) {
            return false;
        }
        this.A = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!n() || this.f22600n == null) {
            return false;
        }
        a(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return g();
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.b bVar) {
        b1.b(this.f22590b);
        this.f22590b.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(t4 t4Var) {
        b1.b(this.f22597k);
        this.f22597k.setControlDispatcher(t4Var);
    }

    public void setControllerAutoShow(boolean z2) {
        this.w = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.x = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        b1.b(this.f22597k);
        this.f22609y = z2;
        j();
    }

    public void setControllerShowTimeoutMs(int i2) {
        b1.b(this.f22597k);
        this.f22608v = i2;
        if (this.f22597k.c()) {
            f();
        }
    }

    public void setControllerVisibilityListener(@Nullable d.e eVar) {
        b1.b(this.f22597k);
        d.e eVar2 = this.f22602p;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f22597k.b(eVar2);
        }
        this.f22602p = eVar;
        if (eVar != null) {
            this.f22597k.a(eVar);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        b1.b(this.f22596j != null);
        this.f22607u = charSequence;
        l();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f22604r != drawable) {
            this.f22604r = drawable;
            c(false);
        }
    }

    public void setErrorMessageProvider(@Nullable t7 t7Var) {
        if (t7Var != null) {
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.f22606t != z2) {
            this.f22606t = z2;
            c(false);
        }
    }

    public void setPlayer(@Nullable qh qhVar) {
        b1.b(Looper.myLooper() == Looper.getMainLooper());
        b1.a(qhVar == null || qhVar.p() == Looper.getMainLooper());
        qh qhVar2 = this.f22600n;
        if (qhVar2 == qhVar) {
            return;
        }
        if (qhVar2 != null) {
            qhVar2.a(this.f22589a);
            if (qhVar2.b(26)) {
                View view = this.d;
                if (view instanceof TextureView) {
                    qhVar2.b((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    qhVar2.b((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f22594h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f22600n = qhVar;
        if (n()) {
            this.f22597k.setPlayer(qhVar);
        }
        i();
        l();
        c(true);
        if (qhVar == null) {
            c();
            return;
        }
        if (qhVar.b(26)) {
            View view2 = this.d;
            if (view2 instanceof TextureView) {
                qhVar.a((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                qhVar.a((SurfaceView) view2);
            }
            h();
        }
        if (this.f22594h != null && qhVar.b(27)) {
            this.f22594h.setCues(qhVar.x());
        }
        qhVar.b(this.f22589a);
        a(false);
    }

    public void setRepeatToggleModes(int i2) {
        b1.b(this.f22597k);
        this.f22597k.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        b1.b(this.f22590b);
        this.f22590b.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.f22605s != i2) {
            this.f22605s = i2;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z2) {
        b1.b(this.f22597k);
        this.f22597k.setShowFastForwardButton(z2);
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        b1.b(this.f22597k);
        this.f22597k.setShowMultiWindowTimeBar(z2);
    }

    public void setShowNextButton(boolean z2) {
        b1.b(this.f22597k);
        this.f22597k.setShowNextButton(z2);
    }

    public void setShowPreviousButton(boolean z2) {
        b1.b(this.f22597k);
        this.f22597k.setShowPreviousButton(z2);
    }

    public void setShowRewindButton(boolean z2) {
        b1.b(this.f22597k);
        this.f22597k.setShowRewindButton(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        b1.b(this.f22597k);
        this.f22597k.setShowShuffleButton(z2);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f22591c;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z2) {
        b1.b((z2 && this.f22593g == null) ? false : true);
        if (this.f22603q != z2) {
            this.f22603q = z2;
            c(false);
        }
    }

    public void setUseController(boolean z2) {
        b1.b((z2 && this.f22597k == null) ? false : true);
        if (this.f22601o == z2) {
            return;
        }
        this.f22601o = z2;
        if (n()) {
            this.f22597k.setPlayer(this.f22600n);
        } else {
            d dVar = this.f22597k;
            if (dVar != null) {
                dVar.a();
                this.f22597k.setPlayer(null);
            }
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    /* loaded from: classes2.dex */
    public final class a implements qh.e, View.OnLayoutChangeListener, View.OnClickListener, d.e {

        /* renamed from: a, reason: collision with root package name */
        private final fo.b f22611a = new fo.b();

        /* renamed from: b, reason: collision with root package name */
        private Object f22612b;

        public a() {
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(qh.f fVar, qh.f fVar2, int i2) {
            if (e.this.d() && e.this.x) {
                e.this.c();
            }
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void b(int i2) {
            e.this.i();
            e.this.l();
            e.this.k();
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i2) {
            e.this.j();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.g();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            e.b((TextureView) view, e.this.f22610z);
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(po poVar, to toVar) {
            qh qhVar = (qh) b1.a(e.this.f22600n);
            fo n2 = qhVar.n();
            if (n2.c()) {
                this.f22612b = null;
            } else if (qhVar.k().a()) {
                Object obj = this.f22612b;
                if (obj != null) {
                    int a2 = n2.a(obj);
                    if (a2 != -1) {
                        if (qhVar.t() == n2.a(a2, this.f22611a).f23950c) {
                            return;
                        }
                    }
                    this.f22612b = null;
                }
            } else {
                this.f22612b = n2.a(qhVar.v(), this.f22611a, true).f23949b;
            }
            e.this.c(false);
        }

        @Override // com.applovin.impl.qh.e
        public void a(xq xqVar) {
            e.this.h();
        }

        @Override // com.applovin.impl.qh.e
        public void a(List list) {
            if (e.this.f22594h != null) {
                e.this.f22594h.setCues(list);
            }
        }

        @Override // com.applovin.impl.qh.e
        public void a() {
            if (e.this.f22591c != null) {
                e.this.f22591c.setVisibility(4);
            }
        }

        @Override // com.applovin.impl.qh.e, com.applovin.impl.qh.c
        public void a(boolean z2, int i2) {
            e.this.i();
            e.this.k();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean a(vd vdVar) {
        byte[] bArr = vdVar.f27536l;
        if (bArr == null) {
            return false;
        }
        return a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private void b(boolean z2) {
        if (n()) {
            this.f22597k.setShowTimeoutMs(z2 ? 0 : this.f22608v);
            this.f22597k.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        qh qhVar = this.f22600n;
        return qhVar != null && qhVar.d() && this.f22600n.l();
    }

    private boolean e() {
        qh qhVar = this.f22600n;
        if (qhVar == null) {
            return true;
        }
        int o2 = qhVar.o();
        return this.w && (o2 == 1 || o2 == 4 || !this.f22600n.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (!n() || this.f22600n == null) {
            return false;
        }
        if (!this.f22597k.c()) {
            a(true);
        } else if (this.f22609y) {
            this.f22597k.a();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        qh qhVar = this.f22600n;
        xq z2 = qhVar != null ? qhVar.z() : xq.f27975f;
        int i2 = z2.f27977a;
        int i3 = z2.f27978b;
        int i4 = z2.f27979c;
        float f2 = (i3 == 0 || i2 == 0) ? 0.0f : (i2 * z2.d) / i3;
        View view = this.d;
        if (view instanceof TextureView) {
            if (f2 > 0.0f && (i4 == 90 || i4 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.f22610z != 0) {
                view.removeOnLayoutChangeListener(this.f22589a);
            }
            this.f22610z = i4;
            if (i4 != 0) {
                this.d.addOnLayoutChangeListener(this.f22589a);
            }
            b((TextureView) this.d, this.f22610z);
        }
        a(this.f22590b, this.f22592f ? 0.0f : f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.f22600n.l() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r4 = this;
            android.view.View r0 = r4.f22595i
            if (r0 == 0) goto L2b
            com.applovin.impl.qh r0 = r4.f22600n
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.o()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f22605s
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            com.applovin.impl.qh r0 = r4.f22600n
            boolean r0 = r0.l()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f22595i
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
        d dVar = this.f22597k;
        if (dVar != null && this.f22601o) {
            if (dVar.getVisibility() == 0) {
                setContentDescription(this.f22609y ? getResources().getString(R.string.al_exo_controls_hide) : null);
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
        if (d() && this.x) {
            c();
        } else {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TextView textView = this.f22596j;
        if (textView != null) {
            CharSequence charSequence = this.f22607u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f22596j.setVisibility(0);
            } else {
                qh qhVar = this.f22600n;
                if (qhVar != null) {
                    qhVar.c();
                }
                this.f22596j.setVisibility(8);
            }
        }
    }

    public void c() {
        d dVar = this.f22597k;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void f() {
        b(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        boolean z10;
        a aVar = new a();
        this.f22589a = aVar;
        if (isInEditMode()) {
            this.f22590b = null;
            this.f22591c = null;
            this.d = null;
            this.f22592f = false;
            this.f22593g = null;
            this.f22594h = null;
            this.f22595i = null;
            this.f22596j = null;
            this.f22597k = null;
            this.f22598l = null;
            this.f22599m = null;
            ImageView imageView = new ImageView(context);
            if (xp.f27962a >= 23) {
                b(getResources(), imageView);
            } else {
                a(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i10 = R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinPlayerView, i2, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.AppLovinPlayerView_al_shutter_background_color);
                int color = obtainStyledAttributes.getColor(R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i10);
                boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z12 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i11 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i12 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i13 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z13 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z14 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                i5 = obtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.f22606t = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.f22606t);
                boolean z15 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z4 = z13;
                z2 = z14;
                i4 = i12;
                z7 = z12;
                i8 = resourceId2;
                z6 = z11;
                i7 = color;
                z5 = hasValue;
                i6 = i11;
                i10 = resourceId;
                i3 = i13;
                z3 = z15;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i3 = 5000;
            z2 = true;
            i4 = 0;
            i5 = 0;
            z3 = true;
            z4 = true;
            i6 = 1;
            z5 = false;
            i7 = 0;
            z6 = true;
            i8 = 0;
            z7 = true;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(Opcodes.ASM4);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.f22590b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i4);
        }
        View findViewById = findViewById(R.id.al_exo_shutter);
        this.f22591c = findViewById;
        if (findViewById != null && z5) {
            findViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout == null || i6 == 0) {
            z8 = true;
            this.d = null;
            z9 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i6 == 2) {
                z8 = true;
                this.d = new TextureView(context);
            } else if (i6 != 3) {
                if (i6 != 4) {
                    this.d = new SurfaceView(context);
                } else {
                    try {
                        int i14 = rq.f26365b;
                        this.d = (View) rq.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                }
                z8 = true;
            } else {
                try {
                    int i15 = rk.f26323n;
                    z8 = true;
                    this.d = (View) rk.class.getConstructor(Context.class).newInstance(context);
                    z10 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(aVar);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                    z9 = z10;
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z10 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(aVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
            z9 = z10;
        }
        this.f22592f = z9;
        this.f22598l = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.f22599m = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f22593g = imageView2;
        this.f22603q = (!z6 || imageView2 == null) ? false : z8;
        if (i8 != 0) {
            this.f22604r = ContextCompat.getDrawable(getContext(), i8);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.f22594h = subtitleView;
        if (subtitleView != null) {
            subtitleView.c();
            subtitleView.d();
        }
        View findViewById2 = findViewById(R.id.al_exo_buffering);
        this.f22595i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f22605s = i5;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.f22596j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        d dVar = (d) findViewById(R.id.al_exo_controller);
        View findViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (dVar != null) {
            this.f22597k = dVar;
            i9 = 0;
        } else if (findViewById3 != null) {
            i9 = 0;
            d dVar2 = new d(context, null, 0, attributeSet);
            this.f22597k = dVar2;
            dVar2.setId(R.id.al_exo_controller);
            dVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(dVar2, indexOfChild);
        } else {
            i9 = 0;
            this.f22597k = null;
        }
        d dVar3 = this.f22597k;
        this.f22608v = dVar3 != null ? i3 : i9;
        this.f22609y = z4;
        this.w = z2;
        this.x = z3;
        this.f22601o = (!z7 || dVar3 == null) ? i9 : z8;
        c();
        j();
        d dVar4 = this.f22597k;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z2) {
        qh qhVar = this.f22600n;
        if (qhVar == null || qhVar.k().a()) {
            if (this.f22606t) {
                return;
            }
            b();
            a();
            return;
        }
        if (z2 && !this.f22606t) {
            a();
        }
        to A = qhVar.A();
        for (int i2 = 0; i2 < A.f27200a; i2++) {
            so a2 = A.a(i2);
            if (a2 != null) {
                for (int i3 = 0; i3 < a2.b(); i3++) {
                    if (Cif.e(a2.a(i3).f23840m) == 2) {
                        b();
                        return;
                    }
                }
            }
        }
        a();
        if (m() && (a(qhVar.C()) || a(this.f22604r))) {
            return;
        }
        b();
    }

    private void b() {
        ImageView imageView = this.f22593g;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.f22593g.setVisibility(4);
        }
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i2 != 0) {
            float f2 = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate(i2, f2, f3);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        }
        textureView.setTransform(matrix);
    }

    public boolean a(KeyEvent keyEvent) {
        return n() && this.f22597k.a(keyEvent);
    }

    public void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f2) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    private void a(boolean z2) {
        if (!(d() && this.x) && n()) {
            boolean z3 = this.f22597k.c() && this.f22597k.getShowTimeoutMs() <= 0;
            boolean e = e();
            if (z2 || z3 || e) {
                b(e);
            }
        }
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.f22590b, intrinsicWidth / intrinsicHeight);
                this.f22593g.setImageDrawable(drawable);
                this.f22593g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void a() {
        View view = this.f22591c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
        aspectRatioFrameLayout.setResizeMode(i2);
    }
}
