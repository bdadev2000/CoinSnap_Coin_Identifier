package p9;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;
import n9.h0;
import o9.p;

/* loaded from: classes3.dex */
public final class k extends GLSurfaceView {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23543n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f23544b;

    /* renamed from: c, reason: collision with root package name */
    public final SensorManager f23545c;

    /* renamed from: d, reason: collision with root package name */
    public final Sensor f23546d;

    /* renamed from: f, reason: collision with root package name */
    public final d f23547f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f23548g;

    /* renamed from: h, reason: collision with root package name */
    public final i f23549h;

    /* renamed from: i, reason: collision with root package name */
    public SurfaceTexture f23550i;

    /* renamed from: j, reason: collision with root package name */
    public Surface f23551j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23552k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23553l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23554m;

    public k(Context context) {
        super(context, null);
        this.f23544b = new CopyOnWriteArrayList();
        this.f23548g = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f23545c = sensorManager;
        Sensor defaultSensor = h0.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f23546d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f23549h = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f23547f = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f23552k = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z10;
        if (this.f23552k && this.f23553l) {
            z10 = true;
        } else {
            z10 = false;
        }
        Sensor sensor = this.f23546d;
        if (sensor != null && z10 != this.f23554m) {
            d dVar = this.f23547f;
            SensorManager sensorManager = this.f23545c;
            if (z10) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.f23554m = z10;
        }
    }

    public a getCameraMotionListener() {
        return this.f23549h;
    }

    public p getVideoFrameMetadataListener() {
        return this.f23549h;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f23551j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23548g.post(new k8.f(this, 2));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f23553l = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f23553l = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f23549h.f23529m = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f23552k = z10;
        a();
    }
}
