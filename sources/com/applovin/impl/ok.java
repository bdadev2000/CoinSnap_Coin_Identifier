package com.applovin.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.applovin.impl.ko;
import com.applovin.impl.ug;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class ok extends GLSurfaceView {

    /* renamed from: n */
    public static final /* synthetic */ int f6810n = 0;
    private final CopyOnWriteArrayList a;

    /* renamed from: b */
    private final SensorManager f6811b;

    /* renamed from: c */
    private final Sensor f6812c;

    /* renamed from: d */
    private final ug f6813d;

    /* renamed from: f */
    private final Handler f6814f;

    /* renamed from: g */
    private final ko f6815g;

    /* renamed from: h */
    private final zi f6816h;

    /* renamed from: i */
    private SurfaceTexture f6817i;

    /* renamed from: j */
    private Surface f6818j;

    /* renamed from: k */
    private boolean f6819k;

    /* renamed from: l */
    private boolean f6820l;

    /* renamed from: m */
    private boolean f6821m;

    /* loaded from: classes.dex */
    public interface b {
        void a(Surface surface);

        void b(Surface surface);
    }

    public ok(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void b(ok okVar, SurfaceTexture surfaceTexture) {
        okVar.a(surfaceTexture);
    }

    public t2 getCameraMotionListener() {
        return this.f6816h;
    }

    public vq getVideoFrameMetadataListener() {
        return this.f6816h;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f6818j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6814f.post(new nt(this, 12));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f6820l = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f6820l = true;
        b();
    }

    public void setDefaultStereoMode(int i10) {
        this.f6816h.a(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f6819k = z10;
        b();
    }

    /* loaded from: classes.dex */
    public final class a implements GLSurfaceView.Renderer, ko.a, ug.a {
        private final zi a;

        /* renamed from: d */
        private final float[] f6824d;

        /* renamed from: e */
        private final float[] f6825e;

        /* renamed from: f */
        private final float[] f6826f;

        /* renamed from: g */
        private float f6827g;

        /* renamed from: h */
        private float f6828h;

        /* renamed from: b */
        private final float[] f6822b = new float[16];

        /* renamed from: c */
        private final float[] f6823c = new float[16];

        /* renamed from: i */
        private final float[] f6829i = new float[16];

        /* renamed from: j */
        private final float[] f6830j = new float[16];

        public a(zi ziVar) {
            float[] fArr = new float[16];
            this.f6824d = fArr;
            float[] fArr2 = new float[16];
            this.f6825e = fArr2;
            float[] fArr3 = new float[16];
            this.f6826f = fArr3;
            this.a = ziVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f6828h = 3.1415927f;
        }

        private float a(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f6830j, 0, this.f6824d, 0, this.f6826f, 0);
                Matrix.multiplyMM(this.f6829i, 0, this.f6825e, 0, this.f6830j, 0);
            }
            Matrix.multiplyMM(this.f6823c, 0, this.f6822b, 0, this.f6829i, 0);
            this.a.a(this.f6823c, false);
        }

        @Override // com.applovin.impl.ko.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ok.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f6822b, 0, a(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            ok.this.b(this.a.b());
        }

        @Override // com.applovin.impl.ug.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f6824d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f6828h = -f10;
            a();
        }

        @Override // com.applovin.impl.ko.a
        public synchronized void a(PointF pointF) {
            this.f6827g = pointF.y;
            a();
            Matrix.setRotateM(this.f6826f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        private void a() {
            Matrix.setRotateM(this.f6825e, 0, -this.f6827g, (float) Math.cos(this.f6828h), (float) Math.sin(this.f6828h), 0.0f);
        }
    }

    public ok(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CopyOnWriteArrayList();
        this.f6814f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) a1.a(context.getSystemService("sensor"));
        this.f6811b = sensorManager;
        Sensor defaultSensor = yp.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f6812c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        zi ziVar = new zi();
        this.f6816h = ziVar;
        a aVar = new a(ziVar);
        ko koVar = new ko(context, aVar, 25.0f);
        this.f6815g = koVar;
        this.f6813d = new ug(((WindowManager) a1.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), koVar, aVar);
        this.f6819k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(koVar);
    }

    public void b(SurfaceTexture surfaceTexture) {
        this.f6814f.post(new rs(24, this, surfaceTexture));
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public /* synthetic */ void a() {
        Surface surface = this.f6818j;
        if (surface != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(surface);
            }
        }
        a(this.f6817i, surface);
        this.f6817i = null;
        this.f6818j = null;
    }

    public void b(b bVar) {
        this.a.remove(bVar);
    }

    private void b() {
        boolean z10 = this.f6819k && this.f6820l;
        Sensor sensor = this.f6812c;
        if (sensor == null || z10 == this.f6821m) {
            return;
        }
        if (z10) {
            this.f6811b.registerListener(this.f6813d, sensor, 0);
        } else {
            this.f6811b.unregisterListener(this.f6813d);
        }
        this.f6821m = z10;
    }

    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f6817i;
        Surface surface = this.f6818j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f6817i = surfaceTexture;
        this.f6818j = surface2;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(surface2);
        }
        a(surfaceTexture2, surface);
    }

    private static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
