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
    public static final /* synthetic */ int f9902n = 0;

    /* renamed from: a */
    private final CopyOnWriteArrayList f9903a;
    private final SensorManager b;

    /* renamed from: c */
    private final Sensor f9904c;

    /* renamed from: d */
    private final ug f9905d;

    /* renamed from: f */
    private final Handler f9906f;

    /* renamed from: g */
    private final ko f9907g;

    /* renamed from: h */
    private final zi f9908h;

    /* renamed from: i */
    private SurfaceTexture f9909i;

    /* renamed from: j */
    private Surface f9910j;

    /* renamed from: k */
    private boolean f9911k;
    private boolean l;
    private boolean m;

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

    public InterfaceC0760t2 getCameraMotionListener() {
        return this.f9908h;
    }

    public vq getVideoFrameMetadataListener() {
        return this.f9908h;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f9910j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9906f.post(new F0(this, 12));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.l = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.l = true;
        b();
    }

    public void setDefaultStereoMode(int i9) {
        this.f9908h.a(i9);
    }

    public void setUseSensorRotation(boolean z8) {
        this.f9911k = z8;
        b();
    }

    /* loaded from: classes.dex */
    public final class a implements GLSurfaceView.Renderer, ko.a, ug.a {

        /* renamed from: a */
        private final zi f9912a;

        /* renamed from: d */
        private final float[] f9914d;

        /* renamed from: e */
        private final float[] f9915e;

        /* renamed from: f */
        private final float[] f9916f;

        /* renamed from: g */
        private float f9917g;

        /* renamed from: h */
        private float f9918h;
        private final float[] b = new float[16];

        /* renamed from: c */
        private final float[] f9913c = new float[16];

        /* renamed from: i */
        private final float[] f9919i = new float[16];

        /* renamed from: j */
        private final float[] f9920j = new float[16];

        public a(zi ziVar) {
            float[] fArr = new float[16];
            this.f9914d = fArr;
            float[] fArr2 = new float[16];
            this.f9915e = fArr2;
            float[] fArr3 = new float[16];
            this.f9916f = fArr3;
            this.f9912a = ziVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f9918h = 3.1415927f;
        }

        private float a(float f9) {
            if (f9 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f9)) * 2.0d);
            }
            return 90.0f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f9920j, 0, this.f9914d, 0, this.f9916f, 0);
                Matrix.multiplyMM(this.f9919i, 0, this.f9915e, 0, this.f9920j, 0);
            }
            Matrix.multiplyMM(this.f9913c, 0, this.b, 0, this.f9919i, 0);
            this.f9912a.a(this.f9913c, false);
        }

        @Override // com.applovin.impl.ko.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ok.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i9, int i10) {
            GLES20.glViewport(0, 0, i9, i10);
            float f9 = i9 / i10;
            Matrix.perspectiveM(this.b, 0, a(f9), f9, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            ok.this.b(this.f9912a.b());
        }

        @Override // com.applovin.impl.ug.a
        public synchronized void a(float[] fArr, float f9) {
            float[] fArr2 = this.f9914d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f9918h = -f9;
            a();
        }

        @Override // com.applovin.impl.ko.a
        public synchronized void a(PointF pointF) {
            this.f9917g = pointF.y;
            a();
            Matrix.setRotateM(this.f9916f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        private void a() {
            Matrix.setRotateM(this.f9915e, 0, -this.f9917g, (float) Math.cos(this.f9918h), (float) Math.sin(this.f9918h), 0.0f);
        }
    }

    public ok(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9903a = new CopyOnWriteArrayList();
        this.f9906f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) AbstractC0669a1.a(context.getSystemService("sensor"));
        this.b = sensorManager;
        Sensor defaultSensor = yp.f12451a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f9904c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        zi ziVar = new zi();
        this.f9908h = ziVar;
        a aVar = new a(ziVar);
        ko koVar = new ko(context, aVar, 25.0f);
        this.f9907g = koVar;
        this.f9905d = new ug(((WindowManager) AbstractC0669a1.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), koVar, aVar);
        this.f9911k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(koVar);
    }

    public void b(SurfaceTexture surfaceTexture) {
        this.f9906f.post(new F(24, this, surfaceTexture));
    }

    public void a(b bVar) {
        this.f9903a.add(bVar);
    }

    public /* synthetic */ void a() {
        Surface surface = this.f9910j;
        if (surface != null) {
            Iterator it = this.f9903a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(surface);
            }
        }
        a(this.f9909i, surface);
        this.f9909i = null;
        this.f9910j = null;
    }

    public void b(b bVar) {
        this.f9903a.remove(bVar);
    }

    private void b() {
        boolean z8 = this.f9911k && this.l;
        Sensor sensor = this.f9904c;
        if (sensor == null || z8 == this.m) {
            return;
        }
        if (z8) {
            this.b.registerListener(this.f9905d, sensor, 0);
        } else {
            this.b.unregisterListener(this.f9905d);
        }
        this.m = z8;
    }

    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f9909i;
        Surface surface = this.f9910j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f9909i = surfaceTexture;
        this.f9910j = surface2;
        Iterator it = this.f9903a.iterator();
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
