package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import com.google.common.collect.r0;
import com.plantcare.ai.identifier.plantid.R;
import d0.h;
import f0.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l9.a;
import l9.j;
import l9.k;
import l9.l;
import l9.m;
import n9.h0;
import o9.n;
import o9.z;
import s7.f;
import s7.h2;
import s7.i0;
import s7.r;
import v8.u0;

@Deprecated
/* loaded from: classes3.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: b, reason: collision with root package name */
    public final l f11499b;

    /* renamed from: c, reason: collision with root package name */
    public final AspectRatioFrameLayout f11500c;

    /* renamed from: d, reason: collision with root package name */
    public final View f11501d;

    /* renamed from: f, reason: collision with root package name */
    public final View f11502f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11503g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f11504h;

    /* renamed from: i, reason: collision with root package name */
    public final SubtitleView f11505i;

    /* renamed from: j, reason: collision with root package name */
    public final View f11506j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f11507k;

    /* renamed from: l, reason: collision with root package name */
    public final k f11508l;

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout f11509m;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f11510n;

    /* renamed from: o, reason: collision with root package name */
    public h2 f11511o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11512p;

    /* renamed from: q, reason: collision with root package name */
    public j f11513q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11514r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f11515s;

    /* renamed from: t, reason: collision with root package name */
    public int f11516t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f11517v;

    /* renamed from: w, reason: collision with root package name */
    public int f11518w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11519x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11520y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11521z;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        boolean z17;
        int i17;
        boolean z18;
        l lVar = new l(this);
        this.f11499b = lVar;
        if (isInEditMode()) {
            this.f11500c = null;
            this.f11501d = null;
            this.f11502f = null;
            this.f11503g = false;
            this.f11504h = null;
            this.f11505i = null;
            this.f11506j = null;
            this.f11507k = null;
            this.f11508l = null;
            this.f11509m = null;
            this.f11510n = null;
            ImageView imageView = new ImageView(context);
            if (h0.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(h0.n(context, resources, 2131231173));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(h0.n(context, resources2, 2131231173));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i18 = R.layout.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m.f21245d, 0, 0);
            try {
                z13 = obtainStyledAttributes.hasValue(23);
                i12 = obtainStyledAttributes.getColor(23, 0);
                i18 = obtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                z14 = obtainStyledAttributes.getBoolean(28, true);
                i15 = obtainStyledAttributes.getResourceId(6, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(29, true);
                i13 = obtainStyledAttributes.getInt(24, 1);
                i11 = obtainStyledAttributes.getInt(14, 0);
                int i19 = obtainStyledAttributes.getInt(22, 5000);
                boolean z20 = obtainStyledAttributes.getBoolean(8, true);
                boolean z21 = obtainStyledAttributes.getBoolean(2, true);
                int integer = obtainStyledAttributes.getInteger(20, 0);
                this.u = obtainStyledAttributes.getBoolean(9, this.u);
                z10 = obtainStyledAttributes.getBoolean(7, true);
                obtainStyledAttributes.recycle();
                z12 = z20;
                i14 = integer;
                i10 = i19;
                z11 = z21;
                z15 = z19;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i10 = 5000;
            z10 = true;
            i11 = 0;
            i12 = 0;
            i13 = 1;
            i14 = 0;
            z11 = true;
            z12 = true;
            z13 = false;
            z14 = true;
            i15 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i18, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f11500c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i11);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f11501d = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i12);
        }
        if (aspectRatioFrameLayout != null && i13 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        this.f11502f = new SurfaceView(context);
                    } else {
                        try {
                            int i20 = n.f23244c;
                            this.f11502f = (View) n.class.getConstructor(Context.class).newInstance(context);
                        } catch (Exception e2) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                        }
                    }
                } else {
                    try {
                        int i21 = p9.k.f23543n;
                        this.f11502f = (View) p9.k.class.getConstructor(Context.class).newInstance(context);
                        z16 = true;
                        this.f11502f.setLayoutParams(layoutParams);
                        this.f11502f.setOnClickListener(lVar);
                        i16 = 0;
                        this.f11502f.setClickable(false);
                        aspectRatioFrameLayout.addView(this.f11502f, 0);
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                }
            } else {
                this.f11502f = new TextureView(context);
            }
            z16 = false;
            this.f11502f.setLayoutParams(layoutParams);
            this.f11502f.setOnClickListener(lVar);
            i16 = 0;
            this.f11502f.setClickable(false);
            aspectRatioFrameLayout.addView(this.f11502f, 0);
        } else {
            i16 = 0;
            this.f11502f = null;
            z16 = false;
        }
        this.f11503g = z16;
        this.f11509m = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f11510n = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f11504h = imageView2;
        if (z14 && imageView2 != null) {
            z17 = 1;
        } else {
            z17 = i16;
        }
        this.f11514r = z17;
        if (i15 != 0) {
            this.f11515s = h.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f11505i = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f11506j = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f11516t = i14;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f11507k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        k kVar = (k) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (kVar != null) {
            this.f11508l = kVar;
        } else if (findViewById3 != null) {
            k kVar2 = new k(context, attributeSet);
            this.f11508l = kVar2;
            kVar2.setId(R.id.exo_controller);
            kVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(kVar2, indexOfChild);
        } else {
            this.f11508l = null;
        }
        k kVar3 = this.f11508l;
        if (kVar3 != null) {
            i17 = i10;
        } else {
            i17 = i16;
        }
        this.f11518w = i17;
        this.f11521z = z12;
        this.f11519x = z11;
        this.f11520y = z10;
        if (z15 && kVar3 != null) {
            z18 = 1;
        } else {
            z18 = i16;
        }
        this.f11512p = z18;
        if (kVar3 != null) {
            kVar3.b();
            this.f11508l.f21215c.add(lVar);
        }
        if (z15) {
            setClickable(true);
        }
        j();
    }

    public static void a(TextureView textureView, int i10) {
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

    public final boolean b() {
        h2 h2Var = this.f11511o;
        return h2Var != null && ((i0) h2Var).C() && ((i0) this.f11511o).z();
    }

    public final void c(boolean z10) {
        boolean z11;
        if ((!b() || !this.f11520y) && m()) {
            k kVar = this.f11508l;
            if (kVar.d() && kVar.getShowTimeoutMs() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean e2 = e();
            if (z10 || z11 || e2) {
                f(e2);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f11500c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                ImageView imageView = this.f11504h;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        h2 h2Var = this.f11511o;
        if (h2Var != null && ((i0) h2Var).C()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z10 = false;
        } else {
            z10 = true;
        }
        k kVar = this.f11508l;
        if (z10 && m() && !kVar.d()) {
            c(true);
        } else {
            if (m() && kVar.a(keyEvent)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !super.dispatchKeyEvent(keyEvent)) {
                if (!z10 || !m()) {
                    return false;
                }
                c(true);
                return false;
            }
            c(true);
        }
        return true;
    }

    public final boolean e() {
        h2 h2Var = this.f11511o;
        if (h2Var == null) {
            return true;
        }
        int A = ((i0) h2Var).A();
        if (this.f11519x && (A == 1 || A == 4 || !((i0) this.f11511o).z())) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        int i10;
        if (!m()) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = this.f11518w;
        }
        k kVar = this.f11508l;
        kVar.setShowTimeoutMs(i10);
        if (!kVar.d()) {
            kVar.setVisibility(0);
            Iterator it = kVar.f21215c.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                kVar.getVisibility();
                l lVar = (l) jVar;
                lVar.getClass();
                lVar.f21242d.j();
            }
            kVar.g();
            kVar.f();
            kVar.i();
            kVar.j();
            kVar.k();
            boolean O = h0.O(kVar.I);
            View view = kVar.f21222h;
            View view2 = kVar.f21221g;
            if (O && view2 != null) {
                view2.requestFocus();
            } else if (!O && view != null) {
                view.requestFocus();
            }
            boolean O2 = h0.O(kVar.I);
            if (O2 && view2 != null) {
                view2.sendAccessibilityEvent(8);
            } else if (!O2 && view != null) {
                view.sendAccessibilityEvent(8);
            }
        }
        kVar.c();
    }

    public final void g() {
        if (m() && this.f11511o != null) {
            k kVar = this.f11508l;
            if (!kVar.d()) {
                c(true);
            } else if (this.f11521z) {
                kVar.b();
            }
        }
    }

    public List<c> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f11510n;
        if (frameLayout != null) {
            arrayList.add(new c(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        k kVar = this.f11508l;
        if (kVar != null) {
            arrayList.add(new c(kVar, 1, (Serializable) null));
        }
        return r0.i(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f11509m;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f11519x;
    }

    public boolean getControllerHideOnTouch() {
        return this.f11521z;
    }

    public int getControllerShowTimeoutMs() {
        return this.f11518w;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f11515s;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f11510n;
    }

    @Nullable
    public h2 getPlayer() {
        return this.f11511o;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f11500c;
        u0.p(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f11505i;
    }

    public boolean getUseArtwork() {
        return this.f11514r;
    }

    public boolean getUseController() {
        return this.f11512p;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f11502f;
    }

    public final void h() {
        z zVar;
        float f10;
        h2 h2Var = this.f11511o;
        if (h2Var != null) {
            i0 i0Var = (i0) h2Var;
            i0Var.S();
            zVar = i0Var.f24399d0;
        } else {
            zVar = z.f23275g;
        }
        int i10 = zVar.f23280b;
        float f11 = 0.0f;
        int i11 = zVar.f23281c;
        if (i11 != 0 && i10 != 0) {
            f10 = (i10 * zVar.f23283f) / i11;
        } else {
            f10 = 0.0f;
        }
        View view = this.f11502f;
        if (view instanceof TextureView) {
            int i12 = zVar.f23282d;
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            int i13 = this.A;
            l lVar = this.f11499b;
            if (i13 != 0) {
                view.removeOnLayoutChangeListener(lVar);
            }
            this.A = i12;
            if (i12 != 0) {
                view.addOnLayoutChangeListener(lVar);
            }
            a((TextureView) view, this.A);
        }
        if (!this.f11503g) {
            f11 = f10;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f11500c;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((s7.i0) r5.f11511o).z() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r5 = this;
            android.view.View r0 = r5.f11506j
            if (r0 == 0) goto L2d
            s7.h2 r1 = r5.f11511o
            r2 = 0
            if (r1 == 0) goto L24
            s7.i0 r1 = (s7.i0) r1
            int r1 = r1.A()
            r3 = 2
            if (r1 != r3) goto L24
            int r1 = r5.f11516t
            r4 = 1
            if (r1 == r3) goto L25
            if (r1 != r4) goto L24
            s7.h2 r1 = r5.f11511o
            s7.i0 r1 = (s7.i0) r1
            boolean r1 = r1.z()
            if (r1 == 0) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r2 = 8
        L2a:
            r0.setVisibility(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.i():void");
    }

    public final void j() {
        String str = null;
        k kVar = this.f11508l;
        if (kVar != null && this.f11512p) {
            if (kVar.getVisibility() == 0) {
                if (this.f11521z) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void k() {
        TextView textView = this.f11507k;
        if (textView != null) {
            CharSequence charSequence = this.f11517v;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            h2 h2Var = this.f11511o;
            if (h2Var != null) {
                i0 i0Var = (i0) h2Var;
                i0Var.S();
                r rVar = i0Var.f24403f0.f24269f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        h2 h2Var = this.f11511o;
        View view = this.f11501d;
        boolean z12 = false;
        ImageView imageView = this.f11504h;
        if (h2Var != null && ((f) h2Var).c(30)) {
            i0 i0Var = (i0) h2Var;
            i0Var.S();
            if (!i0Var.f24403f0.f24272i.f20527d.f24897b.isEmpty()) {
                if (z10 && !this.u && view != null) {
                    view.setVisibility(0);
                }
                i0Var.S();
                if (i0Var.f24403f0.f24272i.f20527d.a(2)) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.f11514r) {
                    u0.p(imageView);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i0Var.S();
                    byte[] bArr = i0Var.M.f24544l;
                    if (bArr != null) {
                        z12 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                    if (z12 || d(this.f11515s)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (!this.u) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final boolean m() {
        if (this.f11512p) {
            u0.p(this.f11508l);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m() && this.f11511o != null) {
            c(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setAspectRatioListener(@Nullable a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f11500c;
        u0.p(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f11519x = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f11520y = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        u0.p(this.f11508l);
        this.f11521z = z10;
        j();
    }

    public void setControllerShowTimeoutMs(int i10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        this.f11518w = i10;
        if (kVar.d()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(@Nullable j jVar) {
        k kVar = this.f11508l;
        u0.p(kVar);
        j jVar2 = this.f11513q;
        if (jVar2 == jVar) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f21215c;
        if (jVar2 != null) {
            copyOnWriteArrayList.remove(jVar2);
        }
        this.f11513q = jVar;
        if (jVar != null) {
            copyOnWriteArrayList.add(jVar);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        boolean z10;
        if (this.f11507k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        this.f11517v = charSequence;
        k();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f11515s != drawable) {
            this.f11515s = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(@Nullable n9.f fVar) {
        if (fVar != null) {
            k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.u != z10) {
            this.u = z10;
            l(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(@androidx.annotation.Nullable s7.h2 r12) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.setPlayer(s7.h2):void");
    }

    public void setRepeatToggleModes(int i10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        kVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f11500c;
        u0.p(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f11516t != i10) {
            this.f11516t = i10;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        kVar.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        kVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        kVar.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        kVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        kVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        k kVar = this.f11508l;
        u0.p(kVar);
        kVar.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f11501d;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        boolean z11;
        if (z10 && this.f11504h == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        u0.m(z11);
        if (this.f11514r != z10) {
            this.f11514r = z10;
            l(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11;
        boolean z12 = false;
        k kVar = this.f11508l;
        if (z10 && kVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        u0.m(z11);
        if (z10 || hasOnClickListeners()) {
            z12 = true;
        }
        setClickable(z12);
        if (this.f11512p == z10) {
            return;
        }
        this.f11512p = z10;
        if (m()) {
            kVar.setPlayer(this.f11511o);
        } else if (kVar != null) {
            kVar.b();
            kVar.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f11502f;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
