package he;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.location.Location;
import android.view.SurfaceHolder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class g extends v implements Camera.PreviewCallback, Camera.ErrorCallback, re.a {
    public static final /* synthetic */ int X = 0;
    public final ke.a U;
    public Camera V;
    public int W;

    public g(c1 c1Var) {
        super(c1Var);
        if (ke.a.a == null) {
            ke.a.a = new ke.a();
        }
        this.U = ke.a.a;
    }

    @Override // he.a0
    public final void A(float f10, PointF[] pointFArr, boolean z10) {
        float f11 = this.u;
        this.u = f10;
        pe.j jVar = this.f19029d;
        jVar.c(20, "zoom");
        jVar.e("zoom", pe.f.ENGINE, new d(this, f11, z10, pointFArr));
    }

    @Override // he.a0
    public final void C(se.a aVar, androidx.viewpager2.adapter.c cVar, PointF pointF) {
        this.f19029d.e("auto focus", pe.f.BIND, new k.g(3, this, cVar, aVar, pointF));
    }

    @Override // he.v
    public final ArrayList N() {
        fe.c cVar = a0.f19026e;
        try {
            List<Camera.Size> supportedPreviewSizes = this.V.getParameters().getSupportedPreviewSizes();
            ArrayList arrayList = new ArrayList(supportedPreviewSizes.size());
            for (Camera.Size size : supportedPreviewSizes) {
                ze.b bVar = new ze.b(size.width, size.height);
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
            cVar.a(1, "getPreviewStreamAvailableSizes:", arrayList);
            return arrayList;
        } catch (Exception e2) {
            cVar.a(3, "getPreviewStreamAvailableSizes:", "Failed to compute preview size. Camera params is empty");
            throw new fe.a(e2, 2);
        }
    }

    @Override // he.v
    public final re.d Q(int i10) {
        return new re.b(i10, this);
    }

    @Override // he.v
    public final void R() {
        a0.f19026e.a(1, "RESTART PREVIEW:", "scheduled. State:", this.f19029d.f23631f);
        H(false);
        E();
    }

    @Override // he.v
    public final void S(fe.k kVar, boolean z10) {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onTakePicture:", "executing.");
        kVar.f17852b = this.C.c(2, 4, 2);
        kVar.f17853c = M();
        xe.c cVar2 = new xe.c(kVar, this, this.V);
        this.f19088h = cVar2;
        cVar2.q();
        cVar.a(1, "onTakePicture:", "executed.");
    }

    @Override // he.v
    public final void T(fe.k kVar, ze.a aVar, boolean z10) {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onTakePictureSnapshot:", "executing.");
        kVar.f17853c = P(4);
        boolean z11 = this.f19086f instanceof ye.h;
        ne.a aVar2 = this.C;
        if (z11) {
            kVar.f17852b = aVar2.c(3, 4, 1);
            this.f19088h = new xe.o(kVar, this, (ye.h) this.f19086f, aVar, this.T);
        } else {
            kVar.f17852b = aVar2.c(2, 4, 2);
            this.f19088h = new xe.i(kVar, this, this.V, aVar);
        }
        this.f19088h.q();
        cVar.a(1, "onTakePictureSnapshot:", "executed.");
    }

    public final void V(Camera.Parameters parameters) {
        boolean z10;
        if (this.H == ge.j.VIDEO) {
            z10 = true;
        } else {
            z10 = false;
        }
        parameters.setRecordingHint(z10);
        W(parameters);
        Y(parameters, ge.g.OFF);
        a0(parameters);
        d0(parameters, ge.n.AUTO);
        Z(parameters, ge.i.OFF);
        e0(parameters, 0.0f);
        X(parameters, 0.0f);
        b0(this.f19102w);
        c0(parameters, 0.0f);
    }

    public final void W(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (this.H == ge.j.VIDEO && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            return;
        }
        if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("infinity")) {
            parameters.setFocusMode("infinity");
        } else if (supportedFocusModes.contains("fixed")) {
            parameters.setFocusMode("fixed");
        }
    }

    public final boolean X(Camera.Parameters parameters, float f10) {
        oe.a aVar = this.f19087g;
        if (aVar.f17829l) {
            float f11 = aVar.f17831n;
            float f12 = aVar.f17830m;
            float f13 = this.f19101v;
            if (f13 < f12) {
                f11 = f12;
            } else if (f13 <= f11) {
                f11 = f13;
            }
            this.f19101v = f11;
            parameters.setExposureCompensation((int) (f11 / parameters.getExposureCompensationStep()));
            return true;
        }
        this.f19101v = f10;
        return false;
    }

    public final boolean Y(Camera.Parameters parameters, ge.g gVar) {
        if (this.f19087g.a(this.f19094n)) {
            ge.g gVar2 = this.f19094n;
            this.U.getClass();
            parameters.setFlashMode((String) ke.a.f20678b.get(gVar2));
            return true;
        }
        this.f19094n = gVar;
        return false;
    }

    public final boolean Z(Camera.Parameters parameters, ge.i iVar) {
        if (this.f19087g.a(this.f19098r)) {
            ge.i iVar2 = this.f19098r;
            this.U.getClass();
            parameters.setSceneMode((String) ke.a.f20681e.get(iVar2));
            return true;
        }
        this.f19098r = iVar;
        return false;
    }

    public final void a0(Camera.Parameters parameters) {
        Location location = this.f19100t;
        if (location != null) {
            parameters.setGpsLatitude(location.getLatitude());
            parameters.setGpsLongitude(this.f19100t.getLongitude());
            parameters.setGpsAltitude(this.f19100t.getAltitude());
            parameters.setGpsTimestamp(this.f19100t.getTime());
            parameters.setGpsProcessingMethod(this.f19100t.getProvider());
        }
    }

    public final boolean b0(boolean z10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.W, cameraInfo);
        if (cameraInfo.canDisableShutterSound) {
            try {
                return this.V.enableShutterSound(this.f19102w);
            } catch (RuntimeException unused) {
                return false;
            }
        }
        if (this.f19102w) {
            return true;
        }
        this.f19102w = z10;
        return false;
    }

    @Override // he.a0
    public final boolean c(ge.f fVar) {
        this.U.getClass();
        int intValue = ((Integer) ke.a.f20680d.get(fVar)).intValue();
        a0.f19026e.a(1, "collectCameraInfo", "Facing:", fVar, "Internal:", Integer.valueOf(intValue), "Cameras:", Integer.valueOf(Camera.getNumberOfCameras()));
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            Camera.getCameraInfo(i10, cameraInfo);
            if (cameraInfo.facing == intValue) {
                int i11 = cameraInfo.orientation;
                ne.a aVar = this.C;
                aVar.getClass();
                ne.a.e(i11);
                aVar.a = fVar;
                aVar.f22748b = i11;
                if (fVar == ge.f.FRONT) {
                    aVar.f22748b = ((360 - i11) + 360) % 360;
                }
                aVar.d();
                this.W = i10;
                return true;
            }
        }
        return false;
    }

    public final boolean c0(Camera.Parameters parameters, float f10) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int i10 = 0;
        int i11 = 1;
        if (this.A && this.f19105z != 0.0f) {
            Collections.sort(supportedPreviewFpsRange, new a(i11));
        } else {
            Collections.sort(supportedPreviewFpsRange, new a(i10));
        }
        float f11 = this.f19105z;
        if (f11 == 0.0f) {
            for (int[] iArr : supportedPreviewFpsRange) {
                int i12 = iArr[0];
                float f12 = i12 / 1000.0f;
                int i13 = iArr[1];
                float f13 = i13 / 1000.0f;
                if ((f12 <= 30.0f && 30.0f <= f13) || (f12 <= 24.0f && 24.0f <= f13)) {
                    parameters.setPreviewFpsRange(i12, i13);
                    return true;
                }
            }
        } else {
            float min = Math.min(f11, this.f19087g.f17834q);
            this.f19105z = min;
            this.f19105z = Math.max(min, this.f19087g.f17833p);
            for (int[] iArr2 : supportedPreviewFpsRange) {
                float f14 = iArr2[0] / 1000.0f;
                float f15 = iArr2[1] / 1000.0f;
                float round = Math.round(this.f19105z);
                if (f14 <= round && round <= f15) {
                    parameters.setPreviewFpsRange(iArr2[0], iArr2[1]);
                    return true;
                }
            }
        }
        this.f19105z = f10;
        return false;
    }

    public final boolean d0(Camera.Parameters parameters, ge.n nVar) {
        if (this.f19087g.a(this.f19095o)) {
            ge.n nVar2 = this.f19095o;
            this.U.getClass();
            parameters.setWhiteBalance((String) ke.a.f20679c.get(nVar2));
            parameters.remove("auto-whitebalance-lock");
            return true;
        }
        this.f19095o = nVar;
        return false;
    }

    public final boolean e0(Camera.Parameters parameters, float f10) {
        if (this.f19087g.f17828k) {
            parameters.setZoom((int) (this.u * parameters.getMaxZoom()));
            this.V.setParameters(parameters);
            return true;
        }
        this.u = f10;
        return false;
    }

    public final void f0(byte[] bArr) {
        boolean z10;
        pe.j jVar = this.f19029d;
        boolean z11 = false;
        if (jVar.f23631f.f23619b >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (jVar.f23632g.f23619b >= 1) {
                z11 = true;
            }
            if (z11) {
                this.V.addCallbackBuffer(bArr);
            }
        }
    }

    @Override // he.a0
    public final Task g() {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStartBind:", "Started");
        try {
            if (this.f19086f.e() == SurfaceHolder.class) {
                this.V.setPreviewDisplay((SurfaceHolder) this.f19086f.d());
            } else if (this.f19086f.e() == SurfaceTexture.class) {
                this.V.setPreviewTexture((SurfaceTexture) this.f19086f.d());
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
            this.f19089i = I(this.H);
            this.f19090j = J();
            cVar.a(1, "onStartBind:", "Returning");
            return Tasks.forResult(null);
        } catch (IOException e2) {
            cVar.a(3, "onStartBind:", "Failed to bind.", e2);
            throw new fe.a(e2, 2);
        }
    }

    @Override // he.a0
    public final Task h() {
        ne.a aVar = this.C;
        fe.c cVar = a0.f19026e;
        try {
            Camera open = Camera.open(this.W);
            this.V = open;
            if (open != null) {
                open.setErrorCallback(this);
                cVar.a(1, "onStartEngine:", "Applying default parameters.");
                try {
                    Camera.Parameters parameters = this.V.getParameters();
                    this.f19087g = new oe.a(parameters, this.W, aVar.b(2, 3));
                    V(parameters);
                    this.V.setParameters(parameters);
                    try {
                        this.V.setDisplayOrientation(aVar.c(2, 3, 1));
                        cVar.a(1, "onStartEngine:", "Ended");
                        return Tasks.forResult(this.f19087g);
                    } catch (Exception unused) {
                        cVar.a(3, "onStartEngine:", "Failed to connect. Can't set display orientation, maybe preview already exists?");
                        throw new fe.a(1);
                    }
                } catch (Exception e2) {
                    cVar.a(3, "onStartEngine:", "Failed to connect. Problem with camera params");
                    throw new fe.a(e2, 1);
                }
            }
            cVar.a(3, "onStartEngine:", "Failed to connect. Camera is null, maybe in use by another app or already released?");
            throw new fe.a(1);
        } catch (Exception e10) {
            cVar.a(3, "onStartEngine:", "Failed to connect. Maybe in use by another app?");
            throw new fe.a(e10, 1);
        }
    }

    @Override // he.a0
    public final Task i() {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStartPreview", "Dispatching onCameraPreviewStreamSizeChanged.");
        ((c1) this.f19028c).q();
        ze.b e2 = e(3);
        if (e2 != null) {
            this.f19086f.l(e2.f28749b, e2.f28750c);
            this.f19086f.k(0);
            try {
                Camera.Parameters parameters = this.V.getParameters();
                parameters.setPreviewFormat(17);
                ze.b bVar = this.f19090j;
                parameters.setPreviewSize(bVar.f28749b, bVar.f28750c);
                ge.j jVar = this.H;
                ge.j jVar2 = ge.j.PICTURE;
                if (jVar == jVar2) {
                    ze.b bVar2 = this.f19089i;
                    parameters.setPictureSize(bVar2.f28749b, bVar2.f28750c);
                } else {
                    ze.b I = I(jVar2);
                    parameters.setPictureSize(I.f28749b, I.f28750c);
                }
                try {
                    this.V.setParameters(parameters);
                    this.V.setPreviewCallbackWithBuffer(null);
                    this.V.setPreviewCallbackWithBuffer(this);
                    K().d(17, this.f19090j, this.C);
                    cVar.a(1, "onStartPreview", "Starting preview with startPreview().");
                    try {
                        this.V.startPreview();
                        cVar.a(1, "onStartPreview", "Started preview.");
                        return Tasks.forResult(null);
                    } catch (Exception e10) {
                        cVar.a(3, "onStartPreview", "Failed to start preview.", e10);
                        throw new fe.a(e10, 2);
                    }
                } catch (Exception e11) {
                    cVar.a(3, "onStartPreview:", "Failed to set params for camera. Maybe incorrect parameter put in params?");
                    throw new fe.a(e11, 2);
                }
            } catch (Exception e12) {
                cVar.a(3, "onStartPreview:", "Failed to get params from camera. Maybe low level problem with camera or camera has already released?");
                throw new fe.a(e12, 2);
            }
        }
        throw new IllegalStateException("previewStreamSize should not be null at this point.");
    }

    @Override // he.a0
    public final Task j() {
        this.f19090j = null;
        this.f19089i = null;
        try {
            if (this.f19086f.e() == SurfaceHolder.class) {
                this.V.setPreviewDisplay(null);
            } else if (this.f19086f.e() == SurfaceTexture.class) {
                this.V.setPreviewTexture(null);
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
        } catch (IOException e2) {
            a0.f19026e.a(3, "onStopBind", "Could not release surface", e2);
        }
        return Tasks.forResult(null);
    }

    @Override // he.a0
    public final Task k() {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStopEngine:", "About to clean up.");
        pe.j jVar = this.f19029d;
        jVar.c(0, "focus reset");
        jVar.c(0, "focus end");
        if (this.V != null) {
            try {
                cVar.a(1, "onStopEngine:", "Clean up.", "Releasing camera.");
                this.V.release();
                cVar.a(1, "onStopEngine:", "Clean up.", "Released camera.");
            } catch (Exception e2) {
                cVar.a(2, "onStopEngine:", "Clean up.", "Exception while releasing camera.", e2);
            }
            this.V = null;
            this.f19087g = null;
        }
        this.f19087g = null;
        this.V = null;
        cVar.a(2, "onStopEngine:", "Clean up.", "Returning.");
        return Tasks.forResult(null);
    }

    @Override // he.a0
    public final Task l() {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStopPreview:", "Started.");
        this.f19088h = null;
        K().c();
        cVar.a(1, "onStopPreview:", "Releasing preview buffers.");
        this.V.setPreviewCallbackWithBuffer(null);
        try {
            cVar.a(1, "onStopPreview:", "Stopping preview.");
            this.V.stopPreview();
            cVar.a(1, "onStopPreview:", "Stopped preview.");
        } catch (Exception e2) {
            cVar.a(3, "stopPreview", "Could not stop preview", e2);
        }
        return Tasks.forResult(null);
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i10, Camera camera) {
        int i11 = 0;
        RuntimeException runtimeException = new RuntimeException(a0.f19026e.a(3, "Internal Camera1 error.", Integer.valueOf(i10)));
        if (i10 == 1 || i10 == 2 || i10 == 100) {
            i11 = 3;
        }
        throw new fe.a(runtimeException, i11);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        re.c a;
        if (bArr != null && (a = K().a(System.currentTimeMillis(), bArr)) != null) {
            ((c1) this.f19028c).g(a);
        }
    }

    @Override // he.a0
    public final void q(float f10, float[] fArr, PointF[] pointFArr, boolean z10) {
        float f11 = this.f19101v;
        this.f19101v = f10;
        pe.j jVar = this.f19029d;
        jVar.c(20, "exposure correction");
        jVar.e("exposure correction", pe.f.ENGINE, new e(this, f11, z10, fArr, pointFArr));
    }

    @Override // he.a0
    public final void r(ge.g gVar) {
        ge.g gVar2 = this.f19094n;
        this.f19094n = gVar;
        this.f19029d.e("flash (" + gVar + ")", pe.f.ENGINE, new androidx.appcompat.widget.j(28, this, gVar2));
    }

    @Override // he.a0
    public final void s(int i10) {
        this.f19092l = 17;
    }

    @Override // he.a0
    public final void t(boolean z10) {
        this.f19093m = z10;
    }

    @Override // he.a0
    public final void u(ge.i iVar) {
        ge.i iVar2 = this.f19098r;
        this.f19098r = iVar;
        this.f19029d.e("hdr (" + iVar + ")", pe.f.ENGINE, new c(1, this, iVar2));
    }

    @Override // he.a0
    public final void v(Location location) {
        Location location2 = this.f19100t;
        this.f19100t = location;
        this.f19029d.e("location", pe.f.ENGINE, new androidx.appcompat.widget.j(29, this, location2));
    }

    @Override // he.a0
    public final void w(ge.k kVar) {
        if (kVar == ge.k.JPEG) {
            this.f19099s = kVar;
        } else {
            throw new UnsupportedOperationException("Unsupported picture format: " + kVar);
        }
    }

    @Override // he.a0
    public final void x(boolean z10) {
        boolean z11 = this.f19102w;
        this.f19102w = z10;
        this.f19029d.e("play sounds (" + z10 + ")", pe.f.ENGINE, new com.bumptech.glide.manager.q(2, this, z11));
    }

    @Override // he.a0
    public final void y(float f10) {
        this.f19105z = f10;
        this.f19029d.e("preview fps (" + f10 + ")", pe.f.ENGINE, new f(this, f10, 0));
    }

    @Override // he.a0
    public final void z(ge.n nVar) {
        ge.n nVar2 = this.f19095o;
        this.f19095o = nVar;
        this.f19029d.e("white balance (" + nVar + ")", pe.f.ENGINE, new c(0, this, nVar2));
    }
}
