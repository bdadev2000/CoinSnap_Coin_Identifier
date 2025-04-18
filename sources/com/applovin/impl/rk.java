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
import com.applovin.impl.jo;
import com.applovin.impl.xg;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class rk extends GLSurfaceView {

    /* renamed from: n */
    public static final /* synthetic */ int f26323n = 0;

    /* renamed from: a */
    private final CopyOnWriteArrayList f26324a;

    /* renamed from: b */
    private final SensorManager f26325b;

    /* renamed from: c */
    private final Sensor f26326c;
    private final xg d;

    /* renamed from: f */
    private final Handler f26327f;

    /* renamed from: g */
    private final jo f26328g;

    /* renamed from: h */
    private final dj f26329h;

    /* renamed from: i */
    private SurfaceTexture f26330i;

    /* renamed from: j */
    private Surface f26331j;

    /* renamed from: k */
    private boolean f26332k;

    /* renamed from: l */
    private boolean f26333l;

    /* renamed from: m */
    private boolean f26334m;

    /* loaded from: classes2.dex */
    public interface b {
        void a(Surface surface);

        void b(Surface surface);
    }

    public rk(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void b(rk rkVar, SurfaceTexture surfaceTexture) {
        rkVar.a(surfaceTexture);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public v2 getCameraMotionListener() {
        return this.f26329h;
    }

    public uq getVideoFrameMetadataListener() {
        return this.f26329h;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f26331j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26327f.post(new mt(this, 14));
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f26333l = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f26333l = true;
        b();
    }

    public void setDefaultStereoMode(int i2) {
        this.f26329h.a(i2);
    }

    public void setUseSensorRotation(boolean z2) {
        this.f26332k = z2;
        b();
    }

    /* loaded from: classes2.dex */
    public final class a implements GLSurfaceView.Renderer, jo.a, xg.a {

        /* renamed from: a */
        private final dj f26335a;
        private final float[] d;
        private final float[] e;

        /* renamed from: f */
        private final float[] f26338f;

        /* renamed from: g */
        private float f26339g;

        /* renamed from: h */
        private float f26340h;

        /* renamed from: b */
        private final float[] f26336b = new float[16];

        /* renamed from: c */
        private final float[] f26337c = new float[16];

        /* renamed from: i */
        private final float[] f26341i = new float[16];

        /* renamed from: j */
        private final float[] f26342j = new float[16];

        public a(dj djVar) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f26338f = fArr3;
            this.f26335a = djVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f26340h = 3.1415927f;
        }

        private float a(float f2) {
            if (f2 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
            }
            return 90.0f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f26342j, 0, this.d, 0, this.f26338f, 0);
                Matrix.multiplyMM(this.f26341i, 0, this.e, 0, this.f26342j, 0);
            }
            Matrix.multiplyMM(this.f26337c, 0, this.f26336b, 0, this.f26341i, 0);
            this.f26335a.a(this.f26337c, false);
        }

        @Override // com.applovin.impl.jo.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return rk.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f2 = i2 / i3;
            Matrix.perspectiveM(this.f26336b, 0, a(f2), f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            rk.this.b(this.f26335a.b());
        }

        @Override // com.applovin.impl.xg.a
        public synchronized void a(float[] fArr, float f2) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f26340h = -f2;
            a();
        }

        @Override // com.applovin.impl.jo.a
        public synchronized void a(PointF pointF) {
            this.f26339g = pointF.y;
            a();
            Matrix.setRotateM(this.f26338f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        private void a() {
            Matrix.setRotateM(this.e, 0, -this.f26339g, (float) Math.cos(this.f26340h), (float) Math.sin(this.f26340h), 0.0f);
        }
    }

    public rk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26324a = new CopyOnWriteArrayList();
        this.f26327f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) b1.a(context.getSystemService("sensor"));
        this.f26325b = sensorManager;
        Sensor defaultSensor = xp.f27962a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f26326c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        dj djVar = new dj();
        this.f26329h = djVar;
        a aVar = new a(djVar);
        jo joVar = new jo(context, aVar, 25.0f);
        this.f26328g = joVar;
        this.d = new xg(((WindowManager) b1.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), joVar, aVar);
        this.f26332k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(joVar);
    }

    public void b(SurfaceTexture surfaceTexture) {
        this.f26327f.post(new ms(25, this, surfaceTexture));
    }

    public void a(b bVar) {
        this.f26324a.add(bVar);
    }

    public /* synthetic */ void a() {
        Surface surface = this.f26331j;
        if (surface != null) {
            Iterator it = this.f26324a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(surface);
            }
        }
        a(this.f26330i, surface);
        this.f26330i = null;
        this.f26331j = null;
    }

    public void b(b bVar) {
        this.f26324a.remove(bVar);
    }

    private void b() {
        boolean z2 = this.f26332k && this.f26333l;
        Sensor sensor = this.f26326c;
        if (sensor == null || z2 == this.f26334m) {
            return;
        }
        if (z2) {
            this.f26325b.registerListener(this.d, sensor, 0);
        } else {
            this.f26325b.unregisterListener(this.d);
        }
        this.f26334m = z2;
    }

    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f26330i;
        Surface surface = this.f26331j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f26330i = surfaceTexture;
        this.f26331j = surface2;
        Iterator it = this.f26324a.iterator();
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
