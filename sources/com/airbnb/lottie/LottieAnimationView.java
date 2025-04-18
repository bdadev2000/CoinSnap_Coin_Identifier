package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.v;
import com.airbnb.lottie.LottieAnimationView;
import com.plantcare.ai.identifier.plantid.R;
import h.c;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import m3.a;
import m3.a0;
import m3.b;
import m3.b0;
import m3.d0;
import m3.e;
import m3.e0;
import m3.f;
import m3.f0;
import m3.g0;
import m3.h;
import m3.h0;
import m3.i;
import m3.i0;
import m3.j;
import m3.k;
import m3.n;
import m3.w;
import m3.x;
import m3.z;
import y3.d;
import y3.g;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: q, reason: collision with root package name */
    public static final e f2919q = new z() { // from class: m3.e
        @Override // m3.z
        public final void onResult(Object obj) {
            boolean z10;
            Throwable th2 = (Throwable) obj;
            e eVar = LottieAnimationView.f2919q;
            y3.g gVar = y3.h.a;
            if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                y3.b.c("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final i f2920b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2921c;

    /* renamed from: d, reason: collision with root package name */
    public z f2922d;

    /* renamed from: f, reason: collision with root package name */
    public int f2923f;

    /* renamed from: g, reason: collision with root package name */
    public final x f2924g;

    /* renamed from: h, reason: collision with root package name */
    public String f2925h;

    /* renamed from: i, reason: collision with root package name */
    public int f2926i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2927j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2928k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2929l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f2930m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f2931n;

    /* renamed from: o, reason: collision with root package name */
    public d0 f2932o;

    /* renamed from: p, reason: collision with root package name */
    public j f2933p;

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.f2920b = new i(this, 1);
        this.f2921c = new i(this, 0);
        this.f2923f = 0;
        x xVar = new x();
        this.f2924g = xVar;
        this.f2927j = false;
        this.f2928k = false;
        this.f2929l = true;
        HashSet hashSet = new HashSet();
        this.f2930m = hashSet;
        this.f2931n = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f0.a, R.attr.lottieAnimationViewStyle, 0);
        this.f2929l = obtainStyledAttributes.getBoolean(2, true);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        boolean hasValue2 = obtainStyledAttributes.hasValue(9);
        boolean hasValue3 = obtainStyledAttributes.hasValue(19);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(8, 0));
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.f2928k = true;
        }
        if (obtainStyledAttributes.getBoolean(12, false)) {
            xVar.f21593c.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(17)) {
            setRepeatMode(obtainStyledAttributes.getInt(17, 1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setRepeatCount(obtainStyledAttributes.getInt(16, -1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            setSpeed(obtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(4, true));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(3, false));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(11));
        boolean hasValue4 = obtainStyledAttributes.hasValue(13);
        float f10 = obtainStyledAttributes.getFloat(13, 0.0f);
        if (hasValue4) {
            hashSet.add(h.SET_PROGRESS);
        }
        xVar.u(f10);
        boolean z10 = obtainStyledAttributes.getBoolean(7, false);
        if (xVar.f21603n != z10) {
            xVar.f21603n = z10;
            if (xVar.f21592b != null) {
                xVar.c();
            }
        }
        if (obtainStyledAttributes.hasValue(5)) {
            xVar.a(new r3.e("**"), a0.K, new c(new h0(d0.h.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(5, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            int i10 = obtainStyledAttributes.getInt(15, 0);
            setRenderMode(g0.values()[i10 >= g0.values().length ? 0 : i10]);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(a.values()[i11 >= g0.values().length ? 0 : i11]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(10, false));
        if (obtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(20, false));
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        g gVar = y3.h.a;
        xVar.f21594d = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f).booleanValue();
    }

    private void setCompositionTask(d0 d0Var) {
        Throwable th2;
        Object obj;
        b0 b0Var = d0Var.f21527d;
        if (b0Var != null && b0Var.a == this.f2933p) {
            return;
        }
        this.f2930m.add(h.SET_ANIMATION);
        this.f2933p = null;
        this.f2924g.d();
        c();
        i iVar = this.f2920b;
        synchronized (d0Var) {
            b0 b0Var2 = d0Var.f21527d;
            if (b0Var2 != null && (obj = b0Var2.a) != null) {
                iVar.onResult(obj);
            }
            d0Var.a.add(iVar);
        }
        i iVar2 = this.f2921c;
        synchronized (d0Var) {
            b0 b0Var3 = d0Var.f21527d;
            if (b0Var3 != null && (th2 = b0Var3.f21521b) != null) {
                iVar2.onResult(th2);
            }
            d0Var.f21525b.add(iVar2);
        }
        this.f2932o = d0Var;
    }

    public final void c() {
        d0 d0Var = this.f2932o;
        if (d0Var != null) {
            i iVar = this.f2920b;
            synchronized (d0Var) {
                d0Var.a.remove(iVar);
            }
            d0 d0Var2 = this.f2932o;
            i iVar2 = this.f2921c;
            synchronized (d0Var2) {
                d0Var2.f21525b.remove(iVar2);
            }
        }
    }

    public a getAsyncUpdates() {
        a aVar = this.f2924g.L;
        if (aVar == null) {
            return a.AUTOMATIC;
        }
        return aVar;
    }

    public boolean getAsyncUpdatesEnabled() {
        a aVar = this.f2924g.L;
        if (aVar == null) {
            aVar = a.AUTOMATIC;
        }
        if (aVar == a.ENABLED) {
            return true;
        }
        return false;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f2924g.f21610v;
    }

    public boolean getClipToCompositionBounds() {
        return this.f2924g.f21605p;
    }

    @Nullable
    public j getComposition() {
        return this.f2933p;
    }

    public long getDuration() {
        if (this.f2933p != null) {
            return r0.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f2924g.f21593c.f27901j;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f2924g.f21599j;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f2924g.f21604o;
    }

    public float getMaxFrame() {
        return this.f2924g.f21593c.e();
    }

    public float getMinFrame() {
        return this.f2924g.f21593c.f();
    }

    @Nullable
    public e0 getPerformanceTracker() {
        j jVar = this.f2924g.f21592b;
        if (jVar != null) {
            return jVar.a;
        }
        return null;
    }

    public float getProgress() {
        return this.f2924g.f21593c.d();
    }

    public g0 getRenderMode() {
        if (this.f2924g.f21612x) {
            return g0.SOFTWARE;
        }
        return g0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f2924g.f21593c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f2924g.f21593c.getRepeatMode();
    }

    public float getSpeed() {
        return this.f2924g.f21593c.f27897f;
    }

    @Override // android.view.View
    public final void invalidate() {
        g0 g0Var;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof x) {
            boolean z10 = ((x) drawable).f21612x;
            g0 g0Var2 = g0.SOFTWARE;
            if (z10) {
                g0Var = g0Var2;
            } else {
                g0Var = g0.HARDWARE;
            }
            if (g0Var == g0Var2) {
                this.f2924g.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        x xVar = this.f2924g;
        if (drawable2 == xVar) {
            super.invalidateDrawable(xVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f2928k) {
            this.f2924g.j();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof m3.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m3.g gVar = (m3.g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f2925h = gVar.f21532b;
        HashSet hashSet = this.f2930m;
        h hVar = h.SET_ANIMATION;
        if (!hashSet.contains(hVar) && !TextUtils.isEmpty(this.f2925h)) {
            setAnimation(this.f2925h);
        }
        this.f2926i = gVar.f21533c;
        if (!hashSet.contains(hVar) && (i10 = this.f2926i) != 0) {
            setAnimation(i10);
        }
        boolean contains = hashSet.contains(h.SET_PROGRESS);
        x xVar = this.f2924g;
        if (!contains) {
            xVar.u(gVar.f21534d);
        }
        h hVar2 = h.PLAY_OPTION;
        if (!hashSet.contains(hVar2) && gVar.f21535f) {
            hashSet.add(hVar2);
            xVar.j();
        }
        if (!hashSet.contains(h.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(gVar.f21536g);
        }
        if (!hashSet.contains(h.SET_REPEAT_MODE)) {
            setRepeatMode(gVar.f21537h);
        }
        if (!hashSet.contains(h.SET_REPEAT_COUNT)) {
            setRepeatCount(gVar.f21538i);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        m3.g gVar = new m3.g(super.onSaveInstanceState());
        gVar.f21532b = this.f2925h;
        gVar.f21533c = this.f2926i;
        x xVar = this.f2924g;
        gVar.f21534d = xVar.f21593c.d();
        boolean isVisible = xVar.isVisible();
        d dVar = xVar.f21593c;
        if (isVisible) {
            z10 = dVar.f27906o;
        } else {
            int i10 = xVar.R;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        gVar.f21535f = z10;
        gVar.f21536g = xVar.f21599j;
        gVar.f21537h = dVar.getRepeatMode();
        gVar.f21538i = dVar.getRepeatCount();
        return gVar;
    }

    public void setAnimation(final int i10) {
        d0 a;
        d0 d0Var;
        this.f2926i = i10;
        final String str = null;
        this.f2925h = null;
        if (isInEditMode()) {
            d0Var = new d0(new Callable() { // from class: m3.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z10 = lottieAnimationView.f2929l;
                    int i11 = i10;
                    if (z10) {
                        Context context = lottieAnimationView.getContext();
                        return n.e(context, i11, n.j(context, i11));
                    }
                    return n.e(lottieAnimationView.getContext(), i11, null);
                }
            }, true);
        } else {
            if (this.f2929l) {
                Context context = getContext();
                final String j3 = n.j(context, i10);
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                a = n.a(j3, new Callable() { // from class: m3.m
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        return n.e(context2, i10, j3);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap hashMap = n.a;
                final WeakReference weakReference2 = new WeakReference(context2);
                final Context applicationContext2 = context2.getApplicationContext();
                a = n.a(null, new Callable() { // from class: m3.m
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context22 = (Context) weakReference2.get();
                        if (context22 == null) {
                            context22 = applicationContext2;
                        }
                        return n.e(context22, i10, str);
                    }
                }, null);
            }
            d0Var = a;
        }
        setCompositionTask(d0Var);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(n.a(null, new f(1, byteArrayInputStream, null), new androidx.activity.d(byteArrayInputStream, 10)));
    }

    public void setAnimationFromUrl(String str) {
        d0 a;
        int i10 = 0;
        Object obj = null;
        if (this.f2929l) {
            Context context = getContext();
            HashMap hashMap = n.a;
            String e2 = vd.e.e("url_", str);
            a = n.a(e2, new k(i10, context, str, e2), null);
        } else {
            a = n.a(null, new k(i10, getContext(), str, obj), null);
        }
        setCompositionTask(a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f2924g.u = z10;
    }

    public void setAsyncUpdates(a aVar) {
        this.f2924g.L = aVar;
    }

    public void setCacheComposition(boolean z10) {
        this.f2929l = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        x xVar = this.f2924g;
        if (z10 != xVar.f21610v) {
            xVar.f21610v = z10;
            xVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z10) {
        x xVar = this.f2924g;
        if (z10 != xVar.f21605p) {
            xVar.f21605p = z10;
            u3.c cVar = xVar.f21606q;
            if (cVar != null) {
                cVar.I = z10;
            }
            xVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull j jVar) {
        boolean z10;
        x xVar = this.f2924g;
        xVar.setCallback(this);
        this.f2933p = jVar;
        boolean z11 = true;
        this.f2927j = true;
        j jVar2 = xVar.f21592b;
        d dVar = xVar.f21593c;
        boolean z12 = false;
        if (jVar2 == jVar) {
            z11 = false;
        } else {
            xVar.K = true;
            xVar.d();
            xVar.f21592b = jVar;
            xVar.c();
            if (dVar.f27905n == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f27905n = jVar;
            if (z10) {
                dVar.t(Math.max(dVar.f27903l, jVar.f21561l), Math.min(dVar.f27904m, jVar.f21562m));
            } else {
                dVar.t((int) jVar.f21561l, (int) jVar.f21562m);
            }
            float f10 = dVar.f27901j;
            dVar.f27901j = 0.0f;
            dVar.f27900i = 0.0f;
            dVar.r((int) f10);
            dVar.j();
            xVar.u(dVar.getAnimatedFraction());
            ArrayList arrayList = xVar.f21597h;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (wVar != null) {
                    wVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            jVar.a.a = xVar.f21608s;
            xVar.e();
            Drawable.Callback callback = xVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(xVar);
            }
        }
        this.f2927j = false;
        if (getDrawable() == xVar && !z11) {
            return;
        }
        if (!z11) {
            if (dVar != null) {
                z12 = dVar.f27906o;
            }
            setImageDrawable(null);
            setImageDrawable(xVar);
            if (z12) {
                xVar.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.f2931n.iterator();
        if (!it2.hasNext()) {
            return;
        }
        a4.j.t(it2.next());
        throw null;
    }

    public void setDefaultFontFileExtension(String str) {
        x xVar = this.f2924g;
        xVar.f21602m = str;
        v h10 = xVar.h();
        if (h10 != null) {
            h10.f1061f = str;
        }
    }

    public void setFailureListener(@Nullable z zVar) {
        this.f2922d = zVar;
    }

    public void setFallbackResource(int i10) {
        this.f2923f = i10;
    }

    public void setFontAssetDelegate(b bVar) {
        v vVar = this.f2924g.f21600k;
        if (vVar != null) {
            vVar.f1060e = bVar;
        }
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        x xVar = this.f2924g;
        if (map != xVar.f21601l) {
            xVar.f21601l = map;
            xVar.invalidateSelf();
        }
    }

    public void setFrame(int i10) {
        this.f2924g.m(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f2924g.f21595f = z10;
    }

    public void setImageAssetDelegate(m3.c cVar) {
        q3.a aVar = this.f2924g.f21598i;
    }

    public void setImageAssetsFolder(String str) {
        this.f2924g.f21599j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        c();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f2924g.f21604o = z10;
    }

    public void setMaxFrame(int i10) {
        this.f2924g.n(i10);
    }

    public void setMaxProgress(float f10) {
        this.f2924g.p(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f2924g.q(str);
    }

    public void setMinFrame(int i10) {
        this.f2924g.r(i10);
    }

    public void setMinProgress(float f10) {
        this.f2924g.t(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        x xVar = this.f2924g;
        if (xVar.f21609t != z10) {
            xVar.f21609t = z10;
            u3.c cVar = xVar.f21606q;
            if (cVar != null) {
                cVar.p(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        x xVar = this.f2924g;
        xVar.f21608s = z10;
        j jVar = xVar.f21592b;
        if (jVar != null) {
            jVar.a.a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f2930m.add(h.SET_PROGRESS);
        this.f2924g.u(f10);
    }

    public void setRenderMode(g0 g0Var) {
        x xVar = this.f2924g;
        xVar.f21611w = g0Var;
        xVar.e();
    }

    public void setRepeatCount(int i10) {
        this.f2930m.add(h.SET_REPEAT_COUNT);
        this.f2924g.f21593c.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f2930m.add(h.SET_REPEAT_MODE);
        this.f2924g.f21593c.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f2924g.f21596g = z10;
    }

    public void setSpeed(float f10) {
        this.f2924g.f21593c.f27897f = f10;
    }

    public void setTextDelegate(i0 i0Var) {
        this.f2924g.getClass();
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f2924g.f21593c.f27907p = z10;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        x xVar;
        boolean z10;
        boolean z11 = this.f2927j;
        boolean z12 = false;
        if (!z11 && drawable == (xVar = this.f2924g)) {
            d dVar = xVar.f21593c;
            if (dVar == null) {
                z10 = false;
            } else {
                z10 = dVar.f27906o;
            }
            if (z10) {
                this.f2928k = false;
                xVar.i();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z11 && (drawable instanceof x)) {
            x xVar2 = (x) drawable;
            d dVar2 = xVar2.f21593c;
            if (dVar2 != null) {
                z12 = dVar2.f27906o;
            }
            if (z12) {
                xVar2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f2924g.o(str);
    }

    public void setMinFrame(String str) {
        this.f2924g.s(str);
    }

    public void setAnimation(String str) {
        d0 a;
        d0 d0Var;
        this.f2925h = str;
        int i10 = 0;
        this.f2926i = 0;
        int i11 = 1;
        if (isInEditMode()) {
            d0Var = new d0(new f(i10, this, str), true);
        } else {
            Object obj = null;
            if (this.f2929l) {
                Context context = getContext();
                HashMap hashMap = n.a;
                String e2 = vd.e.e("asset_", str);
                a = n.a(e2, new k(i11, context.getApplicationContext(), str, e2), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = n.a;
                a = n.a(null, new k(i11, context2.getApplicationContext(), str, obj), null);
            }
            d0Var = a;
        }
        setCompositionTask(d0Var);
    }
}
