package com.otaliastudios.cameraview;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.media.MediaActionSound;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.t0;
import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.y1;
import com.google.common.collect.c1;
import fe.c;
import ge.d;
import ge.f;
import ge.h;
import ge.j;
import ge.k;
import ge.l;
import ge.m;
import ge.n;
import he.s;
import he.t;
import he.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qe.a;
import s7.s2;
import se.g;
import se.i;
import ue.b;
import we.e;
import y7.q;

/* loaded from: classes4.dex */
public class CameraView extends FrameLayout implements u {
    public static final c E = new c("CameraView");
    public b A;
    public boolean B;
    public boolean C;
    public e D;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16475b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16476c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16477d;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f16478f;

    /* renamed from: g, reason: collision with root package name */
    public l f16479g;

    /* renamed from: h, reason: collision with root package name */
    public ge.e f16480h;

    /* renamed from: i, reason: collision with root package name */
    public a f16481i;

    /* renamed from: j, reason: collision with root package name */
    public int f16482j;

    /* renamed from: k, reason: collision with root package name */
    public int f16483k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f16484l;

    /* renamed from: m, reason: collision with root package name */
    public ThreadPoolExecutor f16485m;

    /* renamed from: n, reason: collision with root package name */
    public c1 f16486n;

    /* renamed from: o, reason: collision with root package name */
    public ye.b f16487o;

    /* renamed from: p, reason: collision with root package name */
    public s2 f16488p;

    /* renamed from: q, reason: collision with root package name */
    public v f16489q;

    /* renamed from: r, reason: collision with root package name */
    public ze.b f16490r;

    /* renamed from: s, reason: collision with root package name */
    public MediaActionSound f16491s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f16492t;
    public final CopyOnWriteArrayList u;

    /* renamed from: v, reason: collision with root package name */
    public p f16493v;

    /* renamed from: w, reason: collision with root package name */
    public se.e f16494w;

    /* renamed from: x, reason: collision with root package name */
    public i f16495x;

    /* renamed from: y, reason: collision with root package name */
    public g f16496y;

    /* renamed from: z, reason: collision with root package name */
    public te.e f16497z;

    public CameraView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        l lVar;
        ge.e eVar;
        h hVar;
        f fVar;
        ge.g gVar;
        j jVar;
        n nVar;
        ge.i iVar;
        ge.a aVar;
        ge.b bVar;
        k kVar;
        m mVar;
        this.f16478f = new HashMap(4);
        this.f16492t = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        boolean isInEditMode = isInEditMode();
        this.C = isInEditMode;
        if (!isInEditMode) {
            setWillNotDraw(false);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fe.l.a, 0, 0);
            d dVar = new d(context, obtainStyledAttributes);
            boolean z10 = obtainStyledAttributes.getBoolean(37, true);
            boolean z11 = obtainStyledAttributes.getBoolean(44, true);
            this.B = obtainStyledAttributes.getBoolean(7, false);
            this.f16477d = obtainStyledAttributes.getBoolean(41, true);
            l[] values = l.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    lVar = values[i10];
                    if (lVar.f18445b == dVar.a) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    lVar = l.GL_SURFACE;
                    break;
                }
            }
            this.f16479g = lVar;
            ge.e[] values2 = ge.e.values();
            int length2 = values2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    eVar = values2[i11];
                    if (eVar.f18416b == dVar.f18411k) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    eVar = ge.e.CAMERA1;
                    break;
                }
            }
            this.f16480h = eVar;
            int color = obtainStyledAttributes.getColor(22, te.e.f25385h);
            long j3 = obtainStyledAttributes.getFloat(48, 0.0f);
            int integer = obtainStyledAttributes.getInteger(47, 0);
            int integer2 = obtainStyledAttributes.getInteger(45, 0);
            int integer3 = obtainStyledAttributes.getInteger(1, 0);
            float f10 = obtainStyledAttributes.getFloat(39, 0.0f);
            boolean z12 = obtainStyledAttributes.getBoolean(40, false);
            long integer4 = obtainStyledAttributes.getInteger(4, 3000);
            boolean z13 = obtainStyledAttributes.getBoolean(26, true);
            boolean z14 = obtainStyledAttributes.getBoolean(36, false);
            int integer5 = obtainStyledAttributes.getInteger(43, 0);
            int integer6 = obtainStyledAttributes.getInteger(42, 0);
            int integer7 = obtainStyledAttributes.getInteger(14, 0);
            int integer8 = obtainStyledAttributes.getInteger(13, 0);
            int integer9 = obtainStyledAttributes.getInteger(12, 0);
            int integer10 = obtainStyledAttributes.getInteger(15, 2);
            int integer11 = obtainStyledAttributes.getInteger(11, 1);
            boolean z15 = obtainStyledAttributes.getBoolean(5, false);
            qa.a aVar2 = new qa.a(obtainStyledAttributes);
            y1 y1Var = new y1(obtainStyledAttributes);
            q qVar = new q(obtainStyledAttributes);
            hb.d dVar2 = new hb.d(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            this.f16486n = new c1(this);
            this.f16484l = new Handler(Looper.getMainLooper());
            this.f16494w = new se.e(this.f16486n);
            this.f16495x = new i(this.f16486n);
            this.f16496y = new g(this.f16486n);
            this.f16497z = new te.e(context);
            this.D = new e(context);
            this.A = new b(context);
            addView(this.f16497z);
            addView(this.A);
            addView(this.D);
            d();
            setPlaySounds(z10);
            setUseDeviceOrientation(z11);
            h[] values3 = h.values();
            int length3 = values3.length;
            int i12 = 0;
            while (true) {
                if (i12 < length3) {
                    hVar = values3[i12];
                    h[] hVarArr = values3;
                    int i13 = length3;
                    if (hVar.f18430b == dVar.f18404d) {
                        break;
                    }
                    i12++;
                    values3 = hVarArr;
                    length3 = i13;
                } else {
                    hVar = h.OFF;
                    break;
                }
            }
            setGrid(hVar);
            setGridColor(color);
            setDrawHardwareOverlays(z15);
            f[] values4 = f.values();
            int length4 = values4.length;
            int i14 = 0;
            while (true) {
                if (i14 < length4) {
                    fVar = values4[i14];
                    if (fVar.f18420b == dVar.f18402b) {
                        break;
                    } else {
                        i14++;
                    }
                } else {
                    fVar = null;
                    break;
                }
            }
            setFacing(fVar);
            ge.g[] values5 = ge.g.values();
            int length5 = values5.length;
            int i15 = 0;
            while (true) {
                if (i15 < length5) {
                    gVar = values5[i15];
                    if (gVar.f18426b == dVar.f18403c) {
                        break;
                    } else {
                        i15++;
                    }
                } else {
                    gVar = ge.g.OFF;
                    break;
                }
            }
            setFlash(gVar);
            j[] values6 = j.values();
            int length6 = values6.length;
            int i16 = 0;
            while (true) {
                if (i16 < length6) {
                    jVar = values6[i16];
                    if (jVar.f18438b == dVar.f18406f) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    jVar = j.PICTURE;
                    break;
                }
            }
            setMode(jVar);
            n[] values7 = n.values();
            int length7 = values7.length;
            int i17 = 0;
            while (true) {
                if (i17 < length7) {
                    nVar = values7[i17];
                    if (nVar.f18455b == dVar.f18405e) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    nVar = n.AUTO;
                    break;
                }
            }
            setWhiteBalance(nVar);
            ge.i[] values8 = ge.i.values();
            int length8 = values8.length;
            int i18 = 0;
            while (true) {
                if (i18 < length8) {
                    iVar = values8[i18];
                    if (iVar.f18434b == dVar.f18407g) {
                        break;
                    } else {
                        i18++;
                    }
                } else {
                    iVar = ge.i.OFF;
                    break;
                }
            }
            setHdr(iVar);
            ge.a[] values9 = ge.a.values();
            int length9 = values9.length;
            int i19 = 0;
            while (true) {
                if (i19 < length9) {
                    aVar = values9[i19];
                    if (aVar.f18398b == dVar.f18408h) {
                        break;
                    } else {
                        i19++;
                    }
                } else {
                    aVar = ge.a.ON;
                    break;
                }
            }
            setAudio(aVar);
            setAudioBitRate(integer3);
            ge.b[] values10 = ge.b.values();
            int length10 = values10.length;
            int i20 = 0;
            while (true) {
                if (i20 < length10) {
                    bVar = values10[i20];
                    if (bVar.f18401b == dVar.f18410j) {
                        break;
                    } else {
                        i20++;
                    }
                } else {
                    bVar = ge.b.DEVICE_DEFAULT;
                    break;
                }
            }
            setAudioCodec(bVar);
            setPictureSize((ze.c) aVar2.f23736c);
            setPictureMetering(z13);
            setPictureSnapshotMetering(z14);
            k[] values11 = k.values();
            int length11 = values11.length;
            int i21 = 0;
            while (true) {
                if (i21 < length11) {
                    kVar = values11[i21];
                    if (kVar.f18442b == dVar.f18412l) {
                        break;
                    } else {
                        i21++;
                    }
                } else {
                    kVar = k.JPEG;
                    break;
                }
            }
            setPictureFormat(kVar);
            setVideoSize((ze.c) aVar2.f23737d);
            m[] values12 = m.values();
            int length12 = values12.length;
            int i22 = 0;
            while (true) {
                if (i22 < length12) {
                    mVar = values12[i22];
                    if (mVar.f18448b == dVar.f18409i) {
                        break;
                    } else {
                        i22++;
                    }
                } else {
                    mVar = m.DEVICE_DEFAULT;
                    break;
                }
            }
            setVideoCodec(mVar);
            setVideoMaxSize(j3);
            setVideoMaxDuration(integer);
            setVideoBitRate(integer2);
            setAutoFocusResetDelay(integer4);
            setPreviewFrameRateExact(z12);
            setPreviewFrameRate(f10);
            setSnapshotMaxWidth(integer5);
            setSnapshotMaxHeight(integer6);
            setFrameProcessingMaxWidth(integer7);
            setFrameProcessingMaxHeight(integer8);
            setFrameProcessingFormat(integer9);
            setFrameProcessingPoolSize(integer10);
            setFrameProcessingExecutors(integer11);
            f(se.a.TAP, y1.c(y1Var.a));
            f(se.a.LONG_TAP, y1.c(y1Var.f2084b));
            f(se.a.PINCH, y1.c(y1Var.f2085c));
            f(se.a.SCROLL_HORIZONTAL, y1.c(y1Var.f2086d));
            f(se.a.SCROLL_VERTICAL, y1.c(y1Var.f2087e));
            a4.j.t(qVar.f27991b);
            setAutoFocusMarker(null);
            setFilter((a) dVar2.f19011c);
            this.f16488p = new s2(context, this.f16486n);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!this.C) {
            this.D.getClass();
            if (layoutParams instanceof we.d) {
                this.D.addView(view, layoutParams);
                return;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final boolean c(ge.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        ge.a aVar2 = ge.a.ON;
        ge.a aVar3 = ge.a.STEREO;
        ge.a aVar4 = ge.a.MONO;
        if (aVar == aVar2 || aVar == aVar4 || aVar == aVar3) {
            try {
                for (String str : getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 4096).requestedPermissions) {
                    if (!str.equals("android.permission.RECORD_AUDIO")) {
                    }
                }
                throw new IllegalStateException(E.a(3, "Permission error: when audio is enabled (Audio.ON) the RECORD_AUDIO permission should be added to the app manifest file."));
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        Context context = getContext();
        if (aVar != aVar2 && aVar != aVar4 && aVar != aVar3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (context.checkSelfPermission("android.permission.CAMERA") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && context.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 && !z12) {
            return true;
        }
        if (this.f16477d) {
            Activity activity = null;
            for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                if (context2 instanceof Activity) {
                    activity = (Activity) context2;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add("android.permission.CAMERA");
            }
            if (z12) {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
            if (activity != null) {
                activity.requestPermissions((String[]) arrayList.toArray(new String[0]), 16);
            }
        }
        return false;
    }

    @g0(androidx.lifecycle.n.ON_PAUSE)
    public void close() {
        if (this.C) {
            return;
        }
        s2 s2Var = this.f16488p;
        if (s2Var.f24754e) {
            s2Var.f24754e = false;
            ((OrientationEventListener) s2Var.f24756g).disable();
            ((DisplayManager) s2Var.f24751b.getSystemService("display")).unregisterDisplayListener((DisplayManager.DisplayListener) s2Var.f24757h);
            s2Var.f24753d = -1;
            s2Var.f24752c = -1;
        }
        this.f16489q.F(false);
        ye.b bVar = this.f16487o;
        if (bVar != null) {
            bVar.i();
        }
    }

    public final void d() {
        v gVar;
        Object[] objArr = {"doInstantiateEngine:", "instantiating. engine:", this.f16480h};
        c cVar = E;
        cVar.a(2, objArr);
        ge.e eVar = this.f16480h;
        c1 c1Var = this.f16486n;
        if (this.B && eVar == ge.e.CAMERA2) {
            gVar = new s(c1Var);
        } else {
            this.f16480h = ge.e.CAMERA1;
            gVar = new he.g(c1Var);
        }
        this.f16489q = gVar;
        cVar.a(2, "doInstantiateEngine:", "instantiated. engine:", gVar.getClass().getSimpleName());
        this.f16489q.T = this.D;
    }

    @g0(androidx.lifecycle.n.ON_DESTROY)
    public void destroy() {
        boolean z10;
        if (this.C) {
            return;
        }
        this.f16492t.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        copyOnWriteArrayList.clear();
        if (z10) {
            this.f16489q.t(false);
        }
        this.f16489q.d(0, true);
        ye.b bVar = this.f16487o;
        if (bVar != null) {
            bVar.h();
        }
    }

    public final boolean e() {
        boolean z10;
        boolean z11;
        pe.j jVar = this.f16489q.f19029d;
        if (jVar.f23631f.f23619b >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (jVar.f23632g.f23619b >= 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    public final void f(se.a aVar, se.b bVar) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        se.b bVar2 = se.b.NONE;
        if (bVar != bVar2 && bVar.f25006c != aVar.f25002b) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            HashMap hashMap = this.f16478f;
            hashMap.put(aVar, bVar);
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3 || ordinal == 4) {
                        g gVar = this.f16496y;
                        if (hashMap.get(se.a.SCROLL_HORIZONTAL) == bVar2 && hashMap.get(se.a.SCROLL_VERTICAL) == bVar2) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        gVar.a = z13;
                    }
                } else {
                    i iVar = this.f16495x;
                    if (hashMap.get(se.a.TAP) == bVar2 && hashMap.get(se.a.LONG_TAP) == bVar2) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    iVar.a = z12;
                }
            } else {
                se.e eVar = this.f16494w;
                if (hashMap.get(se.a.PINCH) != bVar2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                eVar.a = z11;
            }
            this.f16483k = 0;
            for (se.b bVar3 : hashMap.values()) {
                int i11 = this.f16483k;
                if (bVar3 == bVar2) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                this.f16483k = i11 + i10;
            }
            return;
        }
        f(aVar, bVar2);
    }

    public final void g(t0 t0Var, oe.a aVar) {
        se.a aVar2 = (se.a) t0Var.f1249b;
        se.b bVar = (se.b) this.f16478f.get(aVar2);
        PointF[] pointFArr = (PointF[]) t0Var.f1250c;
        int ordinal = bVar.ordinal();
        pe.f fVar = pe.f.BIND;
        float f10 = 0.0f;
        int i10 = 1;
        int i11 = 0;
        switch (ordinal) {
            case 1:
                int width = getWidth();
                int height = getHeight();
                ze.b bVar2 = new ze.b(width, height);
                PointF pointF = pointFArr[0];
                float f11 = height;
                float f12 = pointF.x;
                float f13 = (width * 0.05f) / 2.0f;
                float f14 = pointF.y;
                float f15 = (0.05f * f11) / 2.0f;
                RectF rectF = new RectF(f12 - f13, f14 - f15, f12 + f13, f14 + f15);
                ArrayList arrayList = new ArrayList();
                PointF pointF2 = new PointF(rectF.centerX(), rectF.centerY());
                float width2 = rectF.width();
                float height2 = rectF.height();
                arrayList.add(new ve.a(1000, rectF));
                float f16 = pointF2.x;
                float f17 = (width2 * 1.5f) / 2.0f;
                float f18 = pointF2.y;
                float f19 = (height2 * 1.5f) / 2.0f;
                arrayList.add(new ve.a(Math.round(1000 * 0.1f), new RectF(f16 - f17, f18 - f19, f16 + f17, f18 + f19)));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ve.a aVar3 = (ve.a) it.next();
                    aVar3.getClass();
                    RectF rectF2 = new RectF(f10, f10, bVar2.f28749b, f11);
                    RectF rectF3 = new RectF();
                    float f20 = rectF2.left;
                    RectF rectF4 = aVar3.f26519b;
                    rectF3.set(Math.max(f20, rectF4.left), Math.max(rectF2.top, rectF4.top), Math.min(rectF2.right, rectF4.right), Math.min(rectF2.bottom, rectF4.bottom));
                    arrayList2.add(new ve.a(aVar3.f26520c, rectF3));
                    f10 = 0.0f;
                }
                this.f16489q.C(aVar2, new androidx.viewpager2.adapter.c(arrayList2), pointFArr[0]);
                return;
            case 2:
                fe.k kVar = new fe.k();
                v vVar = this.f16489q;
                vVar.f19029d.e("take picture", fVar, new he.u(vVar, kVar, vVar.f19103x, i11));
                return;
            case 3:
                fe.k kVar2 = new fe.k();
                v vVar2 = this.f16489q;
                vVar2.f19029d.e("take picture snapshot", fVar, new he.u(vVar2, kVar2, vVar2.f19104y, i10));
                return;
            case 4:
                float f21 = this.f16489q.u;
                float c10 = t0Var.c(f21, 0.0f, 1.0f);
                if (c10 != f21) {
                    this.f16489q.A(c10, pointFArr, true);
                    return;
                }
                return;
            case 5:
                float f22 = this.f16489q.f19101v;
                float f23 = aVar.f17830m;
                float f24 = aVar.f17831n;
                float c11 = t0Var.c(f22, f23, f24);
                if (c11 != f22) {
                    this.f16489q.q(c11, new float[]{f23, f24}, pointFArr, true);
                    return;
                }
                return;
            case 6:
                getFilter();
                return;
            case 7:
                getFilter();
                return;
            default:
                return;
        }
    }

    @NonNull
    public ge.a getAudio() {
        return this.f16489q.I;
    }

    public int getAudioBitRate() {
        return this.f16489q.M;
    }

    @NonNull
    public ge.b getAudioCodec() {
        return this.f16489q.f19097q;
    }

    public long getAutoFocusResetDelay() {
        return this.f16489q.N;
    }

    @Nullable
    public fe.d getCameraOptions() {
        return this.f16489q.f19087g;
    }

    public boolean getDrawHardwareOverlays() {
        return this.D.getHardwareCanvasEnabled();
    }

    @NonNull
    public ge.e getEngine() {
        return this.f16480h;
    }

    public float getExposureCorrection() {
        return this.f16489q.f19101v;
    }

    @NonNull
    public f getFacing() {
        return this.f16489q.G;
    }

    @NonNull
    public a getFilter() {
        Object obj = this.f16487o;
        if (obj == null) {
            return this.f16481i;
        }
        if (obj instanceof ye.c) {
            return ((ye.g) ((ye.c) obj)).f28195q;
        }
        throw new RuntimeException("Filters are only supported by the GL_SURFACE preview. Current:" + this.f16479g);
    }

    @NonNull
    public ge.g getFlash() {
        return this.f16489q.f19094n;
    }

    public int getFrameProcessingExecutors() {
        return this.f16482j;
    }

    public int getFrameProcessingFormat() {
        return this.f16489q.f19092l;
    }

    public int getFrameProcessingMaxHeight() {
        return this.f16489q.R;
    }

    public int getFrameProcessingMaxWidth() {
        return this.f16489q.Q;
    }

    public int getFrameProcessingPoolSize() {
        return this.f16489q.S;
    }

    @NonNull
    public h getGrid() {
        return this.f16497z.getGridMode();
    }

    public int getGridColor() {
        return this.f16497z.getGridColor();
    }

    @NonNull
    public ge.i getHdr() {
        return this.f16489q.f19098r;
    }

    @Nullable
    public Location getLocation() {
        return this.f16489q.f19100t;
    }

    @NonNull
    public j getMode() {
        return this.f16489q.H;
    }

    @NonNull
    public k getPictureFormat() {
        return this.f16489q.f19099s;
    }

    public boolean getPictureMetering() {
        return this.f16489q.f19103x;
    }

    @Nullable
    public ze.b getPictureSize() {
        return this.f16489q.M();
    }

    public boolean getPictureSnapshotMetering() {
        return this.f16489q.f19104y;
    }

    public boolean getPlaySounds() {
        return this.f16475b;
    }

    @NonNull
    public l getPreview() {
        return this.f16479g;
    }

    public float getPreviewFrameRate() {
        return this.f16489q.f19105z;
    }

    public boolean getPreviewFrameRateExact() {
        return this.f16489q.A;
    }

    public int getSnapshotMaxHeight() {
        return this.f16489q.P;
    }

    public int getSnapshotMaxWidth() {
        return this.f16489q.O;
    }

    @Nullable
    public ze.b getSnapshotSize() {
        ze.b bVar = null;
        if (getWidth() != 0 && getHeight() != 0) {
            ze.b P = this.f16489q.P(3);
            if (P == null) {
                return null;
            }
            Rect q10 = com.bumptech.glide.e.q(P, ze.a.a(getWidth(), getHeight()));
            bVar = new ze.b(q10.width(), q10.height());
            if (this.f16489q.C.b(3, 4)) {
                return bVar.a();
            }
        }
        return bVar;
    }

    public boolean getUseDeviceOrientation() {
        return this.f16476c;
    }

    public int getVideoBitRate() {
        return this.f16489q.L;
    }

    @NonNull
    public m getVideoCodec() {
        return this.f16489q.f19096p;
    }

    public int getVideoMaxDuration() {
        return this.f16489q.K;
    }

    public long getVideoMaxSize() {
        return this.f16489q.J;
    }

    @Nullable
    public ze.b getVideoSize() {
        v vVar = this.f16489q;
        ze.b bVar = vVar.f19089i;
        if (bVar != null && vVar.H != j.PICTURE) {
            if (vVar.C.b(2, 4)) {
                return bVar.a();
            }
            return bVar;
        }
        return null;
    }

    @NonNull
    public n getWhiteBalance() {
        return this.f16489q.f19095o;
    }

    public float getZoom() {
        return this.f16489q.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ye.b jVar;
        super.onAttachedToWindow();
        if (!this.C && this.f16487o == null) {
            Object[] objArr = {"doInstantiateEngine:", "instantiating. preview:", this.f16479g};
            c cVar = E;
            cVar.a(2, objArr);
            l lVar = this.f16479g;
            Context context = getContext();
            int ordinal = lVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && isHardwareAccelerated()) {
                    jVar = new ye.l(context, this);
                } else {
                    this.f16479g = l.GL_SURFACE;
                    jVar = new ye.g(context, this);
                }
            } else {
                jVar = new ye.j(context, this);
            }
            this.f16487o = jVar;
            cVar.a(2, "doInstantiateEngine:", "instantiated. preview:", jVar.getClass().getSimpleName());
            v vVar = this.f16489q;
            ye.b bVar = this.f16487o;
            ye.b bVar2 = vVar.f19086f;
            if (bVar2 != null) {
                bVar2.m(null);
            }
            vVar.f19086f = bVar;
            bVar.m(vVar);
            a aVar = this.f16481i;
            if (aVar != null) {
                setFilter(aVar);
                this.f16481i = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f16490r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f16483k > 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        if (this.C) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
            return;
        }
        ze.b e2 = this.f16489q.e(3);
        this.f16490r = e2;
        c cVar = E;
        if (e2 == null) {
            cVar.a(2, "onMeasure:", "surface is not ready. Calling default behavior.");
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ze.b bVar = this.f16490r;
        float f10 = bVar.f28749b;
        float f11 = bVar.f28750c;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.f16487o.n()) {
            if (mode == 1073741824) {
                mode = Integer.MIN_VALUE;
            }
            if (mode2 == 1073741824) {
                mode2 = Integer.MIN_VALUE;
            }
        } else {
            if (mode == Integer.MIN_VALUE && layoutParams.width == -1) {
                mode = 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE && layoutParams.height == -1) {
                mode2 = 1073741824;
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = "onMeasure:";
        StringBuilder m10 = a4.j.m("requested dimensions are (", size, "[");
        if (mode == Integer.MIN_VALUE) {
            str = "AT_MOST";
        } else if (mode == 0) {
            str = "UNSPECIFIED";
        } else if (mode == 1073741824) {
            str = "EXACTLY";
        } else {
            str = null;
        }
        m10.append(str);
        m10.append("]x");
        m10.append(size2);
        m10.append("[");
        if (mode2 == Integer.MIN_VALUE) {
            str2 = "AT_MOST";
        } else if (mode2 == 0) {
            str2 = "UNSPECIFIED";
        } else if (mode2 == 1073741824) {
            str2 = "EXACTLY";
        } else {
            str2 = null;
        }
        objArr[1] = vd.e.h(m10, str2, "])");
        cVar.a(1, objArr);
        cVar.a(1, "onMeasure:", "previewSize is", "(" + f10 + "x" + f11 + ")");
        if (mode == 1073741824 && mode2 == 1073741824) {
            cVar.a(1, "onMeasure:", "both are MATCH_PARENT or fixed value. We adapt.", "This means CROP_CENTER.", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("(", size, "x", size2, ")"));
            super.onMeasure(i10, i11);
            return;
        }
        if (mode == 0 && mode2 == 0) {
            cVar.a(1, "onMeasure:", "both are completely free.", "We respect that and extend to the whole preview size.", "(" + f10 + "x" + f11 + ")");
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
            return;
        }
        float f12 = f11 / f10;
        if (mode != 0 && mode2 != 0) {
            if (mode != 1073741824 && mode2 != 1073741824) {
                float f13 = size2;
                float f14 = size;
                if (f13 / f14 >= f12) {
                    size2 = Math.round(f14 * f12);
                } else {
                    size = Math.round(f13 / f12);
                }
                cVar.a(1, "onMeasure:", "both dimension were AT_MOST.", "We fit the preview aspect ratio.", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("(", size, "x", size2, ")"));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            }
            if (mode == Integer.MIN_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                size = Math.min(Math.round(size2 / f12), size);
            } else {
                size2 = Math.min(Math.round(size * f12), size2);
            }
            cVar.a(1, "onMeasure:", "one dimension was EXACTLY, another AT_MOST.", "We have TRIED to fit the aspect ratio, but it's not guaranteed.", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("(", size, "x", size2, ")"));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        if (mode == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            size = Math.round(size2 / f12);
        } else {
            size2 = Math.round(size * f12);
        }
        cVar.a(1, "onMeasure:", "one dimension was free, we adapted it to fit the ratio.", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("(", size, "x", size2, ")"));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean g10;
        boolean g11;
        boolean g12;
        if (!e()) {
            return true;
        }
        oe.a aVar = this.f16489q.f19087g;
        if (aVar != null) {
            se.e eVar = this.f16494w;
            if (!eVar.a) {
                g10 = false;
            } else {
                g10 = eVar.g(motionEvent);
            }
            c cVar = E;
            if (g10) {
                cVar.a(1, "onTouchEvent", "pinch!");
                g(this.f16494w, aVar);
            } else {
                g gVar = this.f16496y;
                if (!gVar.a) {
                    g11 = false;
                } else {
                    g11 = gVar.g(motionEvent);
                }
                if (g11) {
                    cVar.a(1, "onTouchEvent", "scroll!");
                    g(this.f16496y, aVar);
                } else {
                    i iVar = this.f16495x;
                    if (!iVar.a) {
                        g12 = false;
                    } else {
                        g12 = iVar.g(motionEvent);
                    }
                    if (g12) {
                        cVar.a(1, "onTouchEvent", "tap!");
                        g(this.f16495x, aVar);
                    }
                }
            }
            return true;
        }
        throw new IllegalStateException("Options should not be null here.");
    }

    @g0(androidx.lifecycle.n.ON_RESUME)
    public void open() {
        if (this.C) {
            return;
        }
        ye.b bVar = this.f16487o;
        if (bVar != null) {
            bVar.j();
        }
        if (c(getAudio())) {
            s2 s2Var = this.f16488p;
            if (!s2Var.f24754e) {
                s2Var.f24754e = true;
                s2Var.f24753d = s2Var.a();
                ((DisplayManager) s2Var.f24751b.getSystemService("display")).registerDisplayListener((DisplayManager.DisplayListener) s2Var.f24757h, s2Var.a);
                ((OrientationEventListener) s2Var.f24756g).enable();
            }
            ne.a aVar = this.f16489q.C;
            int i10 = this.f16488p.f24753d;
            aVar.getClass();
            ne.a.e(i10);
            aVar.f22749c = i10;
            aVar.d();
            this.f16489q.B();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!this.C && layoutParams != null) {
            this.D.getClass();
            if (layoutParams instanceof we.d) {
                this.D.removeView(view);
                return;
            }
        }
        super.removeView(view);
    }

    public void set(@NonNull ge.c cVar) {
        if (cVar instanceof ge.a) {
            setAudio((ge.a) cVar);
            return;
        }
        if (cVar instanceof f) {
            setFacing((f) cVar);
            return;
        }
        if (cVar instanceof ge.g) {
            setFlash((ge.g) cVar);
            return;
        }
        if (cVar instanceof h) {
            setGrid((h) cVar);
            return;
        }
        if (cVar instanceof ge.i) {
            setHdr((ge.i) cVar);
            return;
        }
        if (cVar instanceof j) {
            setMode((j) cVar);
            return;
        }
        if (cVar instanceof n) {
            setWhiteBalance((n) cVar);
            return;
        }
        if (cVar instanceof m) {
            setVideoCodec((m) cVar);
            return;
        }
        if (cVar instanceof ge.b) {
            setAudioCodec((ge.b) cVar);
            return;
        }
        if (cVar instanceof l) {
            setPreview((l) cVar);
        } else if (cVar instanceof ge.e) {
            setEngine((ge.e) cVar);
        } else if (cVar instanceof k) {
            setPictureFormat((k) cVar);
        }
    }

    public void setAudio(@NonNull ge.a aVar) {
        boolean z10;
        if (aVar != getAudio()) {
            v vVar = this.f16489q;
            if (vVar.f19029d.f23631f == pe.f.OFF && !vVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (c(aVar)) {
                    this.f16489q.U(aVar);
                    return;
                } else {
                    close();
                    return;
                }
            }
        }
        this.f16489q.U(aVar);
    }

    public void setAudioBitRate(int i10) {
        this.f16489q.M = i10;
    }

    public void setAudioCodec(@NonNull ge.b bVar) {
        this.f16489q.f19097q = bVar;
    }

    public void setAutoFocusMarker(@Nullable ue.a aVar) {
        b bVar = this.A;
        HashMap hashMap = bVar.f25798b;
        View view = (View) hashMap.get(1);
        if (view != null) {
            bVar.removeView(view);
        }
        if (aVar != null) {
            bVar.getContext();
            View a = aVar.a();
            if (a != null) {
                hashMap.put(1, a);
                bVar.addView(a);
            }
        }
    }

    public void setAutoFocusResetDelay(long j3) {
        this.f16489q.N = j3;
    }

    public void setDrawHardwareOverlays(boolean z10) {
        this.D.setHardwareCanvasEnabled(z10);
    }

    public void setEngine(@NonNull ge.e eVar) {
        boolean z10;
        v vVar = this.f16489q;
        if (vVar.f19029d.f23631f == pe.f.OFF && !vVar.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.f16480h = eVar;
        v vVar2 = this.f16489q;
        d();
        ye.b bVar = this.f16487o;
        if (bVar != null) {
            v vVar3 = this.f16489q;
            ye.b bVar2 = vVar3.f19086f;
            if (bVar2 != null) {
                bVar2.m(null);
            }
            vVar3.f19086f = bVar;
            bVar.m(vVar3);
        }
        setFacing(vVar2.G);
        setFlash(vVar2.f19094n);
        setMode(vVar2.H);
        setWhiteBalance(vVar2.f19095o);
        setHdr(vVar2.f19098r);
        setAudio(vVar2.I);
        setAudioBitRate(vVar2.M);
        setAudioCodec(vVar2.f19097q);
        setPictureSize(vVar2.E);
        setPictureFormat(vVar2.f19099s);
        setVideoSize(vVar2.F);
        setVideoCodec(vVar2.f19096p);
        setVideoMaxSize(vVar2.J);
        setVideoMaxDuration(vVar2.K);
        setVideoBitRate(vVar2.L);
        setAutoFocusResetDelay(vVar2.N);
        setPreviewFrameRate(vVar2.f19105z);
        setPreviewFrameRateExact(vVar2.A);
        setSnapshotMaxWidth(vVar2.O);
        setSnapshotMaxHeight(vVar2.P);
        setFrameProcessingMaxWidth(vVar2.Q);
        setFrameProcessingMaxHeight(vVar2.R);
        setFrameProcessingFormat(0);
        setFrameProcessingPoolSize(vVar2.S);
        this.f16489q.t(!this.u.isEmpty());
    }

    public void setExperimental(boolean z10) {
        this.B = z10;
    }

    public void setExposureCorrection(float f10) {
        fe.d cameraOptions = getCameraOptions();
        if (cameraOptions != null) {
            float f11 = cameraOptions.f17830m;
            float f12 = cameraOptions.f17831n;
            if (f10 < f11) {
                f10 = f11;
            }
            if (f10 > f12) {
                f10 = f12;
            }
            this.f16489q.q(f10, new float[]{f11, f12}, null, false);
        }
    }

    public void setFacing(@NonNull f fVar) {
        v vVar = this.f16489q;
        f fVar2 = vVar.G;
        if (fVar != fVar2) {
            vVar.G = fVar;
            vVar.f19029d.e("facing", pe.f.ENGINE, new k0.a(16, vVar, fVar, fVar2));
        }
    }

    public void setFilter(@NonNull a aVar) {
        boolean z10;
        Object obj = this.f16487o;
        if (obj == null) {
            this.f16481i = aVar;
            return;
        }
        boolean z11 = obj instanceof ye.c;
        if (!(aVar instanceof qe.b) && !z11) {
            throw new RuntimeException("Filters are only supported by the GL_SURFACE preview. Current preview:" + this.f16479g);
        }
        if (z11) {
            ye.g gVar = (ye.g) ((ye.c) obj);
            gVar.f28195q = aVar;
            int i10 = gVar.f28178d;
            if (i10 > 0 && gVar.f28179e > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = gVar.f28179e;
                qe.b bVar = (qe.b) aVar;
                bVar.getClass();
                bVar.f23899c = new ze.b(i10, i11);
            }
            ((GLSurfaceView) gVar.f28176b).queueEvent(new he.c(11, gVar, aVar));
        }
    }

    public void setFlash(@NonNull ge.g gVar) {
        this.f16489q.r(gVar);
    }

    public void setFrameProcessingExecutors(int i10) {
        if (i10 >= 1) {
            this.f16482j = i10;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 4L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new l.c(this));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f16485m = threadPoolExecutor;
            return;
        }
        throw new IllegalArgumentException(eb.j.i("Need at least 1 executor, got ", i10));
    }

    public void setFrameProcessingFormat(int i10) {
        this.f16489q.s(i10);
    }

    public void setFrameProcessingMaxHeight(int i10) {
        this.f16489q.R = i10;
    }

    public void setFrameProcessingMaxWidth(int i10) {
        this.f16489q.Q = i10;
    }

    public void setFrameProcessingPoolSize(int i10) {
        this.f16489q.S = i10;
    }

    public void setGrid(@NonNull h hVar) {
        this.f16497z.setGridMode(hVar);
    }

    public void setGridColor(int i10) {
        this.f16497z.setGridColor(i10);
    }

    public void setHdr(@NonNull ge.i iVar) {
        this.f16489q.u(iVar);
    }

    public void setLifecycleOwner(@Nullable androidx.lifecycle.v vVar) {
        if (vVar == null) {
            p pVar = this.f16493v;
            if (pVar != null) {
                pVar.b(this);
                this.f16493v = null;
                return;
            }
            return;
        }
        p pVar2 = this.f16493v;
        if (pVar2 != null) {
            pVar2.b(this);
            this.f16493v = null;
        }
        p lifecycle = vVar.getLifecycle();
        this.f16493v = lifecycle;
        lifecycle.a(this);
    }

    public void setLocation(@Nullable Location location) {
        this.f16489q.v(location);
    }

    public void setMode(@NonNull j jVar) {
        v vVar = this.f16489q;
        if (jVar != vVar.H) {
            vVar.H = jVar;
            vVar.f19029d.e("mode", pe.f.ENGINE, new t(vVar, 0));
        }
    }

    public void setPictureFormat(@NonNull k kVar) {
        this.f16489q.w(kVar);
    }

    public void setPictureMetering(boolean z10) {
        this.f16489q.f19103x = z10;
    }

    public void setPictureSize(@NonNull ze.c cVar) {
        this.f16489q.E = cVar;
    }

    public void setPictureSnapshotMetering(boolean z10) {
        this.f16489q.f19104y = z10;
    }

    public void setPlaySounds(boolean z10) {
        this.f16475b = z10;
        this.f16489q.x(z10);
    }

    public void setPreview(@NonNull l lVar) {
        boolean z10;
        ye.b bVar;
        boolean z11 = true;
        if (lVar != this.f16479g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f16479g = lVar;
            if (getWindowToken() == null) {
                z11 = false;
            }
            if (!z11 && (bVar = this.f16487o) != null) {
                bVar.h();
                this.f16487o = null;
            }
        }
    }

    public void setPreviewFrameRate(float f10) {
        this.f16489q.y(f10);
    }

    public void setPreviewFrameRateExact(boolean z10) {
        this.f16489q.A = z10;
    }

    public void setPreviewStreamSize(@NonNull ze.c cVar) {
        this.f16489q.D = cVar;
    }

    public void setRequestPermissions(boolean z10) {
        this.f16477d = z10;
    }

    public void setSnapshotMaxHeight(int i10) {
        this.f16489q.P = i10;
    }

    public void setSnapshotMaxWidth(int i10) {
        this.f16489q.O = i10;
    }

    public void setUseDeviceOrientation(boolean z10) {
        this.f16476c = z10;
    }

    public void setVideoBitRate(int i10) {
        this.f16489q.L = i10;
    }

    public void setVideoCodec(@NonNull m mVar) {
        this.f16489q.f19096p = mVar;
    }

    public void setVideoMaxDuration(int i10) {
        this.f16489q.K = i10;
    }

    public void setVideoMaxSize(long j3) {
        this.f16489q.J = j3;
    }

    public void setVideoSize(@NonNull ze.c cVar) {
        this.f16489q.F = cVar;
    }

    public void setWhiteBalance(@NonNull n nVar) {
        this.f16489q.z(nVar);
    }

    public void setZoom(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        this.f16489q.A(f10, null, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (!this.C) {
            e eVar = this.D;
            if (attributeSet == null) {
                eVar.getClass();
            } else {
                TypedArray obtainStyledAttributes = eVar.getContext().obtainStyledAttributes(attributeSet, fe.l.f17856b);
                r1 = obtainStyledAttributes.hasValue(1) || obtainStyledAttributes.hasValue(0) || obtainStyledAttributes.hasValue(2);
                obtainStyledAttributes.recycle();
            }
            if (r1) {
                e eVar2 = this.D;
                eVar2.getClass();
                return new we.d(eVar2.getContext(), attributeSet);
            }
        }
        return super.generateLayoutParams(attributeSet);
    }
}
