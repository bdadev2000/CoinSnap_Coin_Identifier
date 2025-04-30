package com.airbnb.lottie;

import A1.e;
import D1.c;
import E1.d;
import H1.g;
import H1.i;
import U4.CallableC0313i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.vungle.ads.L;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import v1.AbstractC2838D;
import v1.AbstractC2841b;
import v1.C2836B;
import v1.C2837C;
import v1.C2843d;
import v1.C2845f;
import v1.EnumC2839E;
import v1.EnumC2840a;
import v1.EnumC2846g;
import v1.F;
import v1.G;
import v1.InterfaceC2842c;
import v1.h;
import v1.j;
import v1.m;
import v1.q;
import v1.u;
import v1.v;
import v1.x;
import v1.y;
import v1.z;
import x0.AbstractC2914a;
import z1.a;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: p, reason: collision with root package name */
    public static final C2843d f5597p = new Object();
    public final h b;

    /* renamed from: c, reason: collision with root package name */
    public final h f5598c;

    /* renamed from: d, reason: collision with root package name */
    public x f5599d;

    /* renamed from: f, reason: collision with root package name */
    public int f5600f;

    /* renamed from: g, reason: collision with root package name */
    public final v f5601g;

    /* renamed from: h, reason: collision with root package name */
    public String f5602h;

    /* renamed from: i, reason: collision with root package name */
    public int f5603i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5604j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5605k;
    public boolean l;
    public final HashSet m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f5606n;

    /* renamed from: o, reason: collision with root package name */
    public C2836B f5607o;

    /* JADX WARN: Type inference failed for: r3v33, types: [v1.F, android.graphics.PorterDuffColorFilter] */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.b = new h(this, 1);
        this.f5598c = new h(this, 0);
        this.f5600f = 0;
        v vVar = new v();
        this.f5601g = vVar;
        this.f5604j = false;
        this.f5605k = false;
        this.l = true;
        HashSet hashSet = new HashSet();
        this.m = hashSet;
        this.f5606n = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2838D.f23464a, R.attr.lottieAnimationViewStyle, 0);
        this.l = obtainStyledAttributes.getBoolean(2, true);
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
            this.f5605k = true;
        }
        if (obtainStyledAttributes.getBoolean(12, false)) {
            vVar.f23541c.setRepeatCount(-1);
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
        float f9 = obtainStyledAttributes.getFloat(13, 0.0f);
        if (hasValue4) {
            hashSet.add(EnumC2846g.f23477c);
        }
        vVar.s(f9);
        boolean z8 = obtainStyledAttributes.getBoolean(7, false);
        if (vVar.f23549n != z8) {
            vVar.f23549n = z8;
            if (vVar.b != null) {
                vVar.c();
            }
        }
        if (obtainStyledAttributes.hasValue(5)) {
            vVar.a(new e("**"), y.f23572F, new d((F) new PorterDuffColorFilter(I.h.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            int i9 = obtainStyledAttributes.getInt(15, 0);
            setRenderMode(EnumC2839E.values()[i9 >= EnumC2839E.values().length ? 0 : i9]);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int i10 = obtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(EnumC2840a.values()[i10 >= EnumC2839E.values().length ? 0 : i10]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(10, false));
        if (obtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(20, false));
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        H1.h hVar = i.f1367a;
        vVar.f23542d = Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    private void setCompositionTask(C2836B c2836b) {
        z zVar = c2836b.f23461d;
        v vVar = this.f5601g;
        if (zVar != null && vVar == getDrawable() && vVar.b == zVar.f23601a) {
            return;
        }
        this.m.add(EnumC2846g.b);
        this.f5601g.d();
        b();
        c2836b.b(this.b);
        c2836b.a(this.f5598c);
        this.f5607o = c2836b;
    }

    public final void b() {
        C2836B c2836b = this.f5607o;
        if (c2836b != null) {
            h hVar = this.b;
            synchronized (c2836b) {
                c2836b.f23459a.remove(hVar);
            }
            C2836B c2836b2 = this.f5607o;
            h hVar2 = this.f5598c;
            synchronized (c2836b2) {
                c2836b2.b.remove(hVar2);
            }
        }
    }

    public EnumC2840a getAsyncUpdates() {
        EnumC2840a enumC2840a = this.f5601g.f23535L;
        if (enumC2840a == null) {
            return EnumC2840a.b;
        }
        return enumC2840a;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC2840a enumC2840a = this.f5601g.f23535L;
        if (enumC2840a == null) {
            enumC2840a = EnumC2840a.b;
        }
        if (enumC2840a == EnumC2840a.f23468c) {
            return true;
        }
        return false;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f5601g.f23557v;
    }

    public boolean getClipToCompositionBounds() {
        return this.f5601g.f23551p;
    }

    @Nullable
    public v1.i getComposition() {
        Drawable drawable = getDrawable();
        v vVar = this.f5601g;
        if (drawable == vVar) {
            return vVar.b;
        }
        return null;
    }

    public long getDuration() {
        if (getComposition() != null) {
            return r0.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f5601g.f23541c.f1359j;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f5601g.f23547j;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f5601g.f23550o;
    }

    public float getMaxFrame() {
        return this.f5601g.f23541c.b();
    }

    public float getMinFrame() {
        return this.f5601g.f23541c.c();
    }

    @Nullable
    public C2837C getPerformanceTracker() {
        v1.i iVar = this.f5601g.b;
        if (iVar != null) {
            return iVar.f23484a;
        }
        return null;
    }

    public float getProgress() {
        return this.f5601g.f23541c.a();
    }

    public EnumC2839E getRenderMode() {
        if (this.f5601g.f23559x) {
            return EnumC2839E.f23466d;
        }
        return EnumC2839E.f23465c;
    }

    public int getRepeatCount() {
        return this.f5601g.f23541c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f5601g.f23541c.getRepeatMode();
    }

    public float getSpeed() {
        return this.f5601g.f23541c.f1355f;
    }

    @Override // android.view.View
    public final void invalidate() {
        EnumC2839E enumC2839E;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            boolean z8 = ((v) drawable).f23559x;
            EnumC2839E enumC2839E2 = EnumC2839E.f23466d;
            if (z8) {
                enumC2839E = enumC2839E2;
            } else {
                enumC2839E = EnumC2839E.f23465c;
            }
            if (enumC2839E == enumC2839E2) {
                this.f5601g.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.f5601g;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f5605k) {
            this.f5601g.j();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i9;
        if (!(parcelable instanceof C2845f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2845f c2845f = (C2845f) parcelable;
        super.onRestoreInstanceState(c2845f.getSuperState());
        this.f5602h = c2845f.b;
        HashSet hashSet = this.m;
        EnumC2846g enumC2846g = EnumC2846g.b;
        if (!hashSet.contains(enumC2846g) && !TextUtils.isEmpty(this.f5602h)) {
            setAnimation(this.f5602h);
        }
        this.f5603i = c2845f.f23471c;
        if (!hashSet.contains(enumC2846g) && (i9 = this.f5603i) != 0) {
            setAnimation(i9);
        }
        boolean contains = hashSet.contains(EnumC2846g.f23477c);
        v vVar = this.f5601g;
        if (!contains) {
            vVar.s(c2845f.f23472d);
        }
        EnumC2846g enumC2846g2 = EnumC2846g.f23481h;
        if (!hashSet.contains(enumC2846g2) && c2845f.f23473f) {
            hashSet.add(enumC2846g2);
            vVar.j();
        }
        if (!hashSet.contains(EnumC2846g.f23480g)) {
            setImageAssetsFolder(c2845f.f23474g);
        }
        if (!hashSet.contains(EnumC2846g.f23478d)) {
            setRepeatMode(c2845f.f23475h);
        }
        if (!hashSet.contains(EnumC2846g.f23479f)) {
            setRepeatCount(c2845f.f23476i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, v1.f] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.b = this.f5602h;
        baseSavedState.f23471c = this.f5603i;
        v vVar = this.f5601g;
        baseSavedState.f23472d = vVar.f23541c.a();
        boolean isVisible = vVar.isVisible();
        H1.e eVar = vVar.f23541c;
        if (isVisible) {
            z8 = eVar.f1362o;
        } else {
            int i9 = vVar.f23540R;
            if (i9 != 2 && i9 != 3) {
                z8 = false;
            } else {
                z8 = true;
            }
        }
        baseSavedState.f23473f = z8;
        baseSavedState.f23474g = vVar.f23547j;
        baseSavedState.f23475h = eVar.getRepeatMode();
        baseSavedState.f23476i = eVar.getRepeatCount();
        return baseSavedState;
    }

    public void setAnimation(final int i9) {
        C2836B a6;
        C2836B c2836b;
        this.f5603i = i9;
        final String str = null;
        this.f5602h = null;
        if (isInEditMode()) {
            c2836b = new C2836B(new Callable() { // from class: v1.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z8 = lottieAnimationView.l;
                    int i10 = i9;
                    if (z8) {
                        Context context = lottieAnimationView.getContext();
                        return m.e(context, i10, m.j(context, i10));
                    }
                    return m.e(lottieAnimationView.getContext(), i10, null);
                }
            }, true);
        } else {
            if (this.l) {
                Context context = getContext();
                final String j7 = m.j(context, i9);
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                a6 = m.a(j7, new Callable() { // from class: v1.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        return m.e(context2, i9, j7);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap hashMap = m.f23505a;
                final WeakReference weakReference2 = new WeakReference(context2);
                final Context applicationContext2 = context2.getApplicationContext();
                a6 = m.a(null, new Callable() { // from class: v1.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context22 = (Context) weakReference2.get();
                        if (context22 == null) {
                            context22 = applicationContext2;
                        }
                        return m.e(context22, i9, str);
                    }
                }, null);
            }
            c2836b = a6;
        }
        setCompositionTask(c2836b);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(m.a(null, new CallableC0313i(byteArrayInputStream), new L(byteArrayInputStream, 10)));
    }

    public void setAnimationFromUrl(String str) {
        C2836B a6;
        int i9 = 0;
        Object obj = null;
        if (this.l) {
            Context context = getContext();
            HashMap hashMap = m.f23505a;
            String d2 = AbstractC2914a.d("url_", str);
            a6 = m.a(d2, new j(context, str, d2, i9), null);
        } else {
            a6 = m.a(null, new j(getContext(), str, obj, i9), null);
        }
        setCompositionTask(a6);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.f5601g.f23556u = z8;
    }

    public void setAsyncUpdates(EnumC2840a enumC2840a) {
        this.f5601g.f23535L = enumC2840a;
    }

    public void setCacheComposition(boolean z8) {
        this.l = z8;
    }

    public void setClipTextToBoundingBox(boolean z8) {
        v vVar = this.f5601g;
        if (z8 != vVar.f23557v) {
            vVar.f23557v = z8;
            vVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z8) {
        v vVar = this.f5601g;
        if (z8 != vVar.f23551p) {
            vVar.f23551p = z8;
            c cVar = vVar.f23552q;
            if (cVar != null) {
                cVar.f670I = z8;
            }
            vVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull v1.i iVar) {
        boolean z8;
        v vVar = this.f5601g;
        vVar.setCallback(this);
        boolean z9 = true;
        this.f5604j = true;
        v1.i iVar2 = vVar.b;
        boolean z10 = false;
        H1.e eVar = vVar.f23541c;
        if (iVar2 == iVar) {
            z9 = false;
        } else {
            vVar.f23534K = true;
            vVar.d();
            vVar.b = iVar;
            vVar.c();
            if (eVar.f1361n == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            eVar.f1361n = iVar;
            if (z8) {
                eVar.i(Math.max(eVar.l, iVar.l), Math.min(eVar.m, iVar.m));
            } else {
                eVar.i((int) iVar.l, (int) iVar.m);
            }
            float f9 = eVar.f1359j;
            eVar.f1359j = 0.0f;
            eVar.f1358i = 0.0f;
            eVar.h((int) f9);
            eVar.f();
            vVar.s(eVar.getAnimatedFraction());
            ArrayList arrayList = vVar.f23545h;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar != null) {
                    uVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            iVar.f23484a.f23462a = vVar.f23554s;
            vVar.e();
            Drawable.Callback callback = vVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(vVar);
            }
        }
        if (this.f5605k) {
            vVar.j();
        }
        this.f5604j = false;
        if (getDrawable() == vVar && !z9) {
            return;
        }
        if (!z9) {
            if (eVar != null) {
                z10 = eVar.f1362o;
            }
            setImageDrawable(null);
            setImageDrawable(vVar);
            if (z10) {
                vVar.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.f5606n.iterator();
        if (!it2.hasNext()) {
            return;
        }
        o.v(it2.next());
        throw null;
    }

    public void setDefaultFontFileExtension(String str) {
        v vVar = this.f5601g;
        vVar.m = str;
        F1.i h6 = vVar.h();
        if (h6 != null) {
            h6.f1088h = str;
        }
    }

    public void setFailureListener(@Nullable x xVar) {
        this.f5599d = xVar;
    }

    public void setFallbackResource(int i9) {
        this.f5600f = i9;
    }

    public void setFontAssetDelegate(AbstractC2841b abstractC2841b) {
        F1.i iVar = this.f5601g.f23548k;
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        v vVar = this.f5601g;
        if (map != vVar.l) {
            vVar.l = map;
            vVar.invalidateSelf();
        }
    }

    public void setFrame(int i9) {
        this.f5601g.m(i9);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.f5601g.f23543f = z8;
    }

    public void setImageAssetDelegate(InterfaceC2842c interfaceC2842c) {
        a aVar = this.f5601g.f23546i;
    }

    public void setImageAssetsFolder(String str) {
        this.f5601g.f23547j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f5603i = 0;
        this.f5602h = null;
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f5603i = 0;
        this.f5602h = null;
        b();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i9) {
        this.f5603i = 0;
        this.f5602h = null;
        b();
        super.setImageResource(i9);
    }

    public void setMaintainOriginalImageBounds(boolean z8) {
        this.f5601g.f23550o = z8;
    }

    public void setMaxFrame(int i9) {
        this.f5601g.n(i9);
    }

    public void setMaxProgress(float f9) {
        v vVar = this.f5601g;
        v1.i iVar = vVar.b;
        if (iVar == null) {
            vVar.f23545h.add(new q(vVar, f9, 0));
            return;
        }
        float e4 = g.e(iVar.l, iVar.m, f9);
        H1.e eVar = vVar.f23541c;
        eVar.i(eVar.l, e4);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5601g.p(str);
    }

    public void setMinFrame(int i9) {
        this.f5601g.q(i9);
    }

    public void setMinProgress(float f9) {
        v vVar = this.f5601g;
        v1.i iVar = vVar.b;
        if (iVar == null) {
            vVar.f23545h.add(new q(vVar, f9, 1));
        } else {
            vVar.q((int) g.e(iVar.l, iVar.m, f9));
        }
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        v vVar = this.f5601g;
        if (vVar.f23555t != z8) {
            vVar.f23555t = z8;
            c cVar = vVar.f23552q;
            if (cVar != null) {
                cVar.r(z8);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        v vVar = this.f5601g;
        vVar.f23554s = z8;
        v1.i iVar = vVar.b;
        if (iVar != null) {
            iVar.f23484a.f23462a = z8;
        }
    }

    public void setProgress(float f9) {
        this.m.add(EnumC2846g.f23477c);
        this.f5601g.s(f9);
    }

    public void setRenderMode(EnumC2839E enumC2839E) {
        v vVar = this.f5601g;
        vVar.f23558w = enumC2839E;
        vVar.e();
    }

    public void setRepeatCount(int i9) {
        this.m.add(EnumC2846g.f23479f);
        this.f5601g.f23541c.setRepeatCount(i9);
    }

    public void setRepeatMode(int i9) {
        this.m.add(EnumC2846g.f23478d);
        this.f5601g.f23541c.setRepeatMode(i9);
    }

    public void setSafeMode(boolean z8) {
        this.f5601g.f23544g = z8;
    }

    public void setSpeed(float f9) {
        this.f5601g.f23541c.f1355f = f9;
    }

    public void setTextDelegate(G g9) {
        this.f5601g.getClass();
    }

    public void setUseCompositionFrameRate(boolean z8) {
        this.f5601g.f23541c.f1363p = z8;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        v vVar;
        boolean z8;
        boolean z9 = this.f5604j;
        boolean z10 = false;
        if (!z9 && drawable == (vVar = this.f5601g)) {
            H1.e eVar = vVar.f23541c;
            if (eVar == null) {
                z8 = false;
            } else {
                z8 = eVar.f1362o;
            }
            if (z8) {
                this.f5605k = false;
                vVar.i();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z9 && (drawable instanceof v)) {
            v vVar2 = (v) drawable;
            H1.e eVar2 = vVar2.f23541c;
            if (eVar2 != null) {
                z10 = eVar2.f1362o;
            }
            if (z10) {
                vVar2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f5601g.o(str);
    }

    public void setMinFrame(String str) {
        this.f5601g.r(str);
    }

    public void setAnimation(String str) {
        C2836B a6;
        C2836B c2836b;
        int i9 = 1;
        this.f5602h = str;
        this.f5603i = 0;
        if (isInEditMode()) {
            c2836b = new C2836B(new CallableC0313i(5, this, str), true);
        } else {
            Object obj = null;
            if (this.l) {
                Context context = getContext();
                HashMap hashMap = m.f23505a;
                String d2 = AbstractC2914a.d("asset_", str);
                a6 = m.a(d2, new j(context.getApplicationContext(), str, d2, i9), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = m.f23505a;
                a6 = m.a(null, new j(context2.getApplicationContext(), str, obj, i9), null);
            }
            c2836b = a6;
        }
        setCompositionTask(c2836b);
    }
}
