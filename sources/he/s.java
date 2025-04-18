package he;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.location.Location;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class s extends v implements ImageReader.OnImageAvailableListener, ie.b {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f19070j0 = 0;
    public final CameraManager U;
    public String V;
    public CameraDevice W;
    public CameraCharacteristics X;
    public CameraCaptureSession Y;
    public CaptureRequest.Builder Z;

    /* renamed from: a0, reason: collision with root package name */
    public TotalCaptureResult f19071a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ke.b f19072b0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageReader f19073c0;

    /* renamed from: d0, reason: collision with root package name */
    public Surface f19074d0;

    /* renamed from: e0, reason: collision with root package name */
    public Surface f19075e0;

    /* renamed from: f0, reason: collision with root package name */
    public ImageReader f19076f0;

    /* renamed from: g0, reason: collision with root package name */
    public final CopyOnWriteArrayList f19077g0;

    /* renamed from: h0, reason: collision with root package name */
    public le.g f19078h0;

    /* renamed from: i0, reason: collision with root package name */
    public final l f19079i0;

    public s(c1 c1Var) {
        super(c1Var);
        if (ke.b.a == null) {
            ke.b.a = new ke.b();
        }
        this.f19072b0 = ke.b.a;
        this.f19077g0 = new CopyOnWriteArrayList();
        this.f19079i0 = new l(this);
        this.U = (CameraManager) ((CameraView) ((c1) this.f19028c).f11925d).getContext().getSystemService("camera");
        new ie.g().l(this);
    }

    public static void V(s sVar) {
        sVar.getClass();
        new ie.h(Arrays.asList(new m(sVar, 0), new je.c(1))).l(sVar);
    }

    public static fe.a h0(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        int i10 = 1;
        if (reason != 1) {
            if (reason != 2 && reason != 3) {
                if (reason != 4 && reason != 5) {
                    i10 = 0;
                }
            } else {
                i10 = 3;
            }
        }
        return new fe.a(cameraAccessException, i10);
    }

    @Override // he.a0
    public final void A(float f10, PointF[] pointFArr, boolean z10) {
        float f11 = this.u;
        this.u = f10;
        pe.j jVar = this.f19029d;
        jVar.c(20, "zoom");
        jVar.e("zoom", pe.f.ENGINE, new i(this, f11, z10, f10, pointFArr));
    }

    @Override // he.a0
    public final void C(se.a aVar, androidx.viewpager2.adapter.c cVar, PointF pointF) {
        this.f19029d.e("autofocus (" + aVar + ")", pe.f.PREVIEW, new k.g(4, this, aVar, pointF, cVar));
    }

    @Override // he.v
    public final ArrayList N() {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.U.getCameraCharacteristics(this.V).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.f19086f.e());
                ArrayList arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    ze.b bVar = new ze.b(size.getWidth(), size.getHeight());
                    if (!arrayList.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            }
            throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
        } catch (CameraAccessException e2) {
            throw h0(e2);
        }
    }

    @Override // he.v
    public final re.d Q(int i10) {
        return new re.e(i10);
    }

    @Override // he.v
    public final void R() {
        a0.f19026e.a(1, "onPreviewStreamSizeChanged:", "Calling restartBind().");
        p();
    }

    @Override // he.v
    public final void S(fe.k kVar, boolean z10) {
        fe.c cVar = a0.f19026e;
        int i10 = 1;
        if (z10) {
            cVar.a(1, "onTakePicture:", "doMetering is true. Delaying.");
            ie.i iVar = new ie.i(2500L, i0(null));
            iVar.b(new r(i10, this, kVar));
            iVar.l(this);
            return;
        }
        cVar.a(1, "onTakePicture:", "doMetering is false. Performing.");
        kVar.f17852b = this.C.c(2, 4, 2);
        kVar.f17853c = M();
        try {
            CaptureRequest.Builder createCaptureRequest = this.W.createCaptureRequest(2);
            X(createCaptureRequest, this.Z);
            xe.d dVar = new xe.d(kVar, this, createCaptureRequest, this.f19076f0);
            this.f19088h = dVar;
            dVar.q();
        } catch (CameraAccessException e2) {
            throw h0(e2);
        }
    }

    @Override // he.v
    public final void T(fe.k kVar, ze.a aVar, boolean z10) {
        fe.c cVar = a0.f19026e;
        int i10 = 0;
        if (z10) {
            cVar.a(1, "onTakePictureSnapshot:", "doMetering is true. Delaying.");
            ie.i iVar = new ie.i(2500L, i0(null));
            iVar.b(new r(i10, this, kVar));
            iVar.l(this);
            return;
        }
        cVar.a(1, "onTakePictureSnapshot:", "doMetering is false. Performing.");
        if (this.f19086f instanceof ye.h) {
            kVar.f17853c = P(4);
            kVar.f17852b = this.C.c(3, 4, 1);
            xe.l lVar = new xe.l(kVar, this, (ye.h) this.f19086f, aVar);
            this.f19088h = lVar;
            lVar.q();
            return;
        }
        throw new RuntimeException("takePictureSnapshot with Camera2 is only supported with Preview.GL_SURFACE");
    }

    public final void W(Surface... surfaceArr) {
        this.Z.addTarget(this.f19075e0);
        Surface surface = this.f19074d0;
        if (surface != null) {
            this.Z.addTarget(surface);
        }
        for (Surface surface2 : surfaceArr) {
            if (surface2 != null) {
                this.Z.addTarget(surface2);
            } else {
                throw new IllegalArgumentException("Should not add a null surface.");
            }
        }
    }

    public final void X(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        a0.f19026e.a(1, "applyAllParameters:", "called for tag", builder.build().getTag());
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        Y(builder);
        a0(builder, ge.g.OFF);
        Location location = this.f19100t;
        if (location != null) {
            builder.set(CaptureRequest.JPEG_GPS_LOCATION, location);
        }
        f0(builder, ge.n.AUTO);
        b0(builder, ge.i.OFF);
        g0(builder, 0.0f);
        Z(builder, 0.0f);
        c0(builder, 0.0f);
        if (builder2 != null) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
            builder.set(key, (MeteringRectangle[]) builder2.get(key));
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_REGIONS;
            builder.set(key2, (MeteringRectangle[]) builder2.get(key2));
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_REGIONS;
            builder.set(key3, (MeteringRectangle[]) builder2.get(key3));
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_AF_MODE;
            builder.set(key4, (Integer) builder2.get(key4));
        }
    }

    public final void Y(CaptureRequest.Builder builder) {
        int[] iArr = (int[]) n0(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0]);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (this.H == ge.j.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            return;
        }
        if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            return;
        }
        if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else if (arrayList.contains(0)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(0.0f));
        }
    }

    public final boolean Z(CaptureRequest.Builder builder, float f10) {
        if (this.f19087g.f17829l) {
            Rational rational = (Rational) n0(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, new Rational(1, 1));
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(Math.round(rational.floatValue() * this.f19101v)));
            return true;
        }
        this.f19101v = f10;
        return false;
    }

    @Override // he.v, xe.f
    public final void a(fe.k kVar, Exception exc) {
        boolean z10;
        boolean z11 = this.f19088h instanceof xe.d;
        super.a(kVar, exc);
        if ((z11 && this.f19103x) || (!z11 && this.f19104y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f19029d.e("reset metering after picture", pe.f.PREVIEW, new h(this, 2));
        }
    }

    public final boolean a0(CaptureRequest.Builder builder, ge.g gVar) {
        if (this.f19087g.a(this.f19094n)) {
            int[] iArr = (int[]) n0(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, new int[0]);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                arrayList.add(Integer.valueOf(i10));
            }
            ge.g gVar2 = this.f19094n;
            this.f19072b0.getClass();
            ArrayList arrayList2 = new ArrayList();
            int ordinal = gVar2.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            arrayList2.add(new Pair(1, 2));
                            arrayList2.add(new Pair(0, 2));
                        }
                    } else {
                        arrayList2.add(new Pair(2, 0));
                        arrayList2.add(new Pair(4, 0));
                    }
                } else {
                    arrayList2.add(new Pair(3, 0));
                }
            } else {
                arrayList2.add(new Pair(1, 0));
                arrayList2.add(new Pair(0, 0));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (arrayList.contains(pair.first)) {
                    Object[] objArr = {"applyFlash: setting CONTROL_AE_MODE to", pair.first};
                    fe.c cVar = a0.f19026e;
                    cVar.a(1, objArr);
                    cVar.a(1, "applyFlash: setting FLASH_MODE to", pair.second);
                    builder.set(CaptureRequest.CONTROL_AE_MODE, (Integer) pair.first);
                    builder.set(CaptureRequest.FLASH_MODE, (Integer) pair.second);
                    return true;
                }
            }
        }
        this.f19094n = gVar;
        return false;
    }

    public final boolean b0(CaptureRequest.Builder builder, ge.i iVar) {
        if (this.f19087g.a(this.f19098r)) {
            ge.i iVar2 = this.f19098r;
            this.f19072b0.getClass();
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(((Integer) ke.b.f20684d.get(iVar2)).intValue()));
            return true;
        }
        this.f19098r = iVar;
        return false;
    }

    @Override // he.a0
    public final boolean c(ge.f fVar) {
        CameraCharacteristics cameraCharacteristics;
        Object obj;
        CameraManager cameraManager = this.U;
        this.f19072b0.getClass();
        int intValue = ((Integer) ke.b.f20682b.get(fVar)).intValue();
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            a0.f19026e.a(1, "collectCameraInfo", "Facing:", fVar, "Internal:", Integer.valueOf(intValue), "Cameras:", Integer.valueOf(cameraIdList.length));
            for (String str : cameraIdList) {
                try {
                    cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    obj = -99;
                    Object obj2 = cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                } catch (CameraAccessException unused) {
                }
                if (intValue == ((Integer) obj).intValue()) {
                    this.V = str;
                    Object obj3 = 0;
                    Object obj4 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    if (obj4 != null) {
                        obj3 = obj4;
                    }
                    int intValue2 = ((Integer) obj3).intValue();
                    ne.a aVar = this.C;
                    aVar.getClass();
                    ne.a.e(intValue2);
                    aVar.a = fVar;
                    aVar.f22748b = intValue2;
                    if (fVar == ge.f.FRONT) {
                        aVar.f22748b = ((360 - intValue2) + 360) % 360;
                    }
                    aVar.d();
                    return true;
                }
                continue;
            }
            return false;
        } catch (CameraAccessException e2) {
            throw h0(e2);
        }
    }

    public final boolean c0(CaptureRequest.Builder builder, float f10) {
        boolean z10;
        Range[] rangeArr = (Range[]) n0(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES, new Range[0]);
        if (this.A && this.f19105z != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Arrays.sort(rangeArr, new k(z10));
        float f11 = this.f19105z;
        if (f11 == 0.0f) {
            Iterator it = k0(rangeArr).iterator();
            while (it.hasNext()) {
                Range range = (Range) it.next();
                if (range.contains((Range) 30) || range.contains((Range) 24)) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                    return true;
                }
            }
        } else {
            float min = Math.min(f11, this.f19087g.f17834q);
            this.f19105z = min;
            this.f19105z = Math.max(min, this.f19087g.f17833p);
            Iterator it2 = k0(rangeArr).iterator();
            while (it2.hasNext()) {
                Range range2 = (Range) it2.next();
                if (range2.contains((Range) Integer.valueOf(Math.round(this.f19105z)))) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
                    return true;
                }
            }
        }
        this.f19105z = f10;
        return false;
    }

    public final void d0() {
        e0(3, true);
    }

    public final void e0(int i10, boolean z10) {
        pe.j jVar = this.f19029d;
        if ((jVar.f23631f == pe.f.PREVIEW && !f()) || !z10) {
            try {
                this.Y.setRepeatingRequest(this.Z.build(), this.f19079i0, null);
            } catch (CameraAccessException e2) {
                throw new fe.a(e2, i10);
            } catch (IllegalStateException e10) {
                a0.f19026e.a(3, "applyRepeatingRequestBuilder: session is invalid!", e10, "checkStarted:", Boolean.valueOf(z10), "currentThread:", Thread.currentThread().getName(), "state:", jVar.f23631f, "targetState:", jVar.f23632g);
                throw new fe.a(3);
            }
        }
    }

    public final boolean f0(CaptureRequest.Builder builder, ge.n nVar) {
        if (this.f19087g.a(this.f19095o)) {
            ge.n nVar2 = this.f19095o;
            this.f19072b0.getClass();
            builder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(((Integer) ke.b.f20683c.get(nVar2)).intValue()));
            return true;
        }
        this.f19095o = nVar;
        return false;
    }

    @Override // he.a0
    public final Task g() {
        Handler handler;
        int i10;
        int i11 = 0;
        int i12 = 1;
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStartBind:", "Started");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f19089i = I(this.H);
        this.f19090j = J();
        ArrayList arrayList = new ArrayList();
        Class e2 = this.f19086f.e();
        Object d10 = this.f19086f.d();
        if (e2 == SurfaceHolder.class) {
            try {
                cVar.a(1, "onStartBind:", "Waiting on UI thread...");
                Tasks.await(Tasks.call(new o(i11, this, d10)));
                this.f19075e0 = ((SurfaceHolder) d10).getSurface();
            } catch (InterruptedException | ExecutionException e10) {
                throw new fe.a(e10, 1);
            }
        } else if (e2 == SurfaceTexture.class) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) d10;
            ze.b bVar = this.f19090j;
            surfaceTexture.setDefaultBufferSize(bVar.f28749b, bVar.f28750c);
            this.f19075e0 = new Surface(surfaceTexture);
        } else {
            throw new RuntimeException("Unknown CameraPreview output class.");
        }
        arrayList.add(this.f19075e0);
        if (this.H == ge.j.PICTURE) {
            int ordinal = this.f19099s.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i10 = 32;
                } else {
                    throw new IllegalArgumentException("Unknown format:" + this.f19099s);
                }
            } else {
                i10 = NotificationCompat.FLAG_LOCAL_ONLY;
            }
            ze.b bVar2 = this.f19089i;
            ImageReader newInstance = ImageReader.newInstance(bVar2.f28749b, bVar2.f28750c, i10, 2);
            this.f19076f0 = newInstance;
            arrayList.add(newInstance.getSurface());
        }
        if (this.f19093m) {
            List l02 = l0();
            boolean b3 = this.C.b(2, 3);
            ArrayList arrayList2 = (ArrayList) l02;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ze.b bVar3 = (ze.b) it.next();
                if (b3) {
                    bVar3 = bVar3.a();
                }
                arrayList3.add(bVar3);
            }
            ze.b bVar4 = this.f19090j;
            ze.a a = ze.a.a(bVar4.f28749b, bVar4.f28750c);
            if (b3) {
                a = ze.a.a(a.f28748c, a.f28747b);
            }
            int i13 = this.Q;
            int i14 = this.R;
            if (i13 <= 0 || i13 == Integer.MAX_VALUE) {
                i13 = 640;
            }
            if (i14 <= 0 || i14 == Integer.MAX_VALUE) {
                i14 = 640;
            }
            cVar.a(1, "computeFrameProcessingSize:", "targetRatio:", a, "targetMaxSize:", new ze.b(i13, i14));
            ze.e f10 = com.bumptech.glide.e.f(a);
            ze.e e11 = com.bumptech.glide.e.e(com.bumptech.glide.e.H(i14), com.bumptech.glide.e.I(i13), com.bumptech.glide.e.g());
            ze.b bVar5 = (ze.b) new ze.e(new ze.c[]{com.bumptech.glide.e.e(f10, e11), e11, com.bumptech.glide.e.T()}, i12).a(arrayList3).get(0);
            if (arrayList3.contains(bVar5)) {
                if (b3) {
                    bVar5 = bVar5.a();
                }
                cVar.a(1, "computeFrameProcessingSize:", "result:", bVar5, "flip:", Boolean.valueOf(b3));
                this.f19091k = bVar5;
                ImageReader newInstance2 = ImageReader.newInstance(bVar5.f28749b, bVar5.f28750c, this.f19092l, this.S + 1);
                this.f19073c0 = newInstance2;
                handler = null;
                newInstance2.setOnImageAvailableListener(this, null);
                Surface surface = this.f19073c0.getSurface();
                this.f19074d0 = surface;
                arrayList.add(surface);
            } else {
                throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
            }
        } else {
            handler = null;
            this.f19073c0 = null;
            this.f19091k = null;
            this.f19074d0 = null;
        }
        try {
            this.W.createCaptureSession(arrayList, new p(this, taskCompletionSource), handler);
            return taskCompletionSource.getTask();
        } catch (CameraAccessException e12) {
            throw h0(e12);
        }
    }

    public final boolean g0(CaptureRequest.Builder builder, float f10) {
        if (this.f19087g.f17828k) {
            float floatValue = ((Float) n0(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(1.0f))).floatValue();
            float f11 = floatValue - 1.0f;
            float f12 = (this.u * f11) + 1.0f;
            Rect rect = (Rect) n0(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE, new Rect());
            int width = (int) (rect.width() / floatValue);
            int width2 = rect.width() - width;
            int height = rect.height() - ((int) (rect.height() / floatValue));
            float f13 = f12 - 1.0f;
            int i10 = (int) (((width2 * f13) / f11) / 2.0f);
            int i11 = (int) (((height * f13) / f11) / 2.0f);
            builder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i10, i11, rect.width() - i10, rect.height() - i11));
            return true;
        }
        this.u = f10;
        return false;
    }

    @Override // he.a0
    public final Task h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            this.U.openCamera(this.V, new n(this, taskCompletionSource), (Handler) null);
            return taskCompletionSource.getTask();
        } catch (CameraAccessException e2) {
            throw h0(e2);
        }
    }

    @Override // he.a0
    public final Task i() {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStartPreview:", "Dispatching onCameraPreviewStreamSizeChanged.");
        ((c1) this.f19028c).q();
        ze.b e2 = e(3);
        if (e2 != null) {
            this.f19086f.l(e2.f28749b, e2.f28750c);
            ye.b bVar = this.f19086f;
            ne.a aVar = this.C;
            bVar.k(aVar.c(1, 3, 1));
            if (this.f19093m) {
                L().d(this.f19092l, this.f19091k, aVar);
            }
            cVar.a(1, "onStartPreview:", "Starting preview.");
            W(new Surface[0]);
            e0(2, false);
            cVar.a(1, "onStartPreview:", "Started preview.");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            new q(this, taskCompletionSource).l(this);
            return taskCompletionSource.getTask();
        }
        throw new IllegalStateException("previewStreamSize should not be null at this point.");
    }

    public final le.g i0(androidx.viewpager2.adapter.c cVar) {
        le.g gVar = this.f19078h0;
        if (gVar != null) {
            gVar.a(this);
        }
        CaptureRequest.Builder builder = this.Z;
        boolean z10 = false;
        int[] iArr = (int[]) n0(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0]);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else if (this.H == ge.j.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        } else if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
        if (cVar == null) {
            z10 = true;
        }
        le.g gVar2 = new le.g(this, cVar, z10);
        this.f19078h0 = gVar2;
        return gVar2;
    }

    @Override // he.a0
    public final Task j() {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStopBind:", "About to clean up.");
        this.f19074d0 = null;
        this.f19075e0 = null;
        this.f19090j = null;
        this.f19089i = null;
        this.f19091k = null;
        ImageReader imageReader = this.f19073c0;
        if (imageReader != null) {
            imageReader.close();
            this.f19073c0 = null;
        }
        ImageReader imageReader2 = this.f19076f0;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f19076f0 = null;
        }
        this.Y.close();
        this.Y = null;
        cVar.a(1, "onStopBind:", "Returning.");
        return Tasks.forResult(null);
    }

    public final CaptureRequest.Builder j0(int i10) {
        CaptureRequest.Builder builder = this.Z;
        CaptureRequest.Builder createCaptureRequest = this.W.createCaptureRequest(i10);
        this.Z = createCaptureRequest;
        createCaptureRequest.setTag(Integer.valueOf(i10));
        X(this.Z, builder);
        return this.Z;
    }

    @Override // he.a0
    public final Task k() {
        fe.c cVar = a0.f19026e;
        try {
            cVar.a(1, "onStopEngine:", "Clean up.", "Releasing camera.");
            this.W.close();
            cVar.a(1, "onStopEngine:", "Clean up.", "Released camera.");
        } catch (Exception e2) {
            cVar.a(2, "onStopEngine:", "Clean up.", "Exception while releasing camera.", e2);
        }
        this.W = null;
        cVar.a(1, "onStopEngine:", "Aborting actions.");
        Iterator it = this.f19077g0.iterator();
        while (it.hasNext()) {
            ((ie.e) it.next()).a(this);
        }
        this.X = null;
        this.f19087g = null;
        this.Z = null;
        cVar.a(2, "onStopEngine:", "Returning.");
        return Tasks.forResult(null);
    }

    public final ArrayList k0(Range[] rangeArr) {
        ArrayList arrayList = new ArrayList();
        int round = Math.round(this.f19087g.f17833p);
        int round2 = Math.round(this.f19087g.f17834q);
        for (Range range : rangeArr) {
            if (range.contains((Range) Integer.valueOf(round)) || range.contains((Range) Integer.valueOf(round2))) {
                fe.c cVar = te.c.a;
                String str = Build.MODEL;
                boolean z10 = true;
                String str2 = Build.MANUFACTURER;
                Object[] objArr = {"Build.MODEL:", str, "Build.BRAND:", Build.BRAND, "Build.MANUFACTURER:", str2};
                fe.c cVar2 = te.c.a;
                cVar2.a(1, objArr);
                List list = (List) te.c.f25380b.get(str2 + " " + str);
                if (list != null && list.contains(range)) {
                    cVar2.a(1, "Dropping range:", range);
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(range);
                }
            }
        }
        return arrayList;
    }

    @Override // he.a0
    public final Task l() {
        fe.c cVar = a0.f19026e;
        cVar.a(1, "onStopPreview:", "Started.");
        this.f19088h = null;
        if (this.f19093m) {
            L().c();
        }
        this.Z.removeTarget(this.f19075e0);
        Surface surface = this.f19074d0;
        if (surface != null) {
            this.Z.removeTarget(surface);
        }
        this.f19071a0 = null;
        cVar.a(1, "onStopPreview:", "Returning.");
        return Tasks.forResult(null);
    }

    public final List l0() {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.U.getCameraCharacteristics(this.V).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.f19092l);
                ArrayList arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    ze.b bVar = new ze.b(size.getWidth(), size.getHeight());
                    if (!arrayList.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            }
            throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
        } catch (CameraAccessException e2) {
            throw h0(e2);
        }
    }

    public final void m0() {
        if (((Integer) this.Z.build().getTag()).intValue() != 1) {
            try {
                j0(1);
                W(new Surface[0]);
                d0();
            } catch (CameraAccessException e2) {
                throw h0(e2);
            }
        }
    }

    public final Object n0(CameraCharacteristics.Key key, Object obj) {
        Object obj2 = this.X.get(key);
        if (obj2 != null) {
            return obj2;
        }
        return obj;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        fe.c cVar = a0.f19026e;
        cVar.a(0, "onImageAvailable:", "trying to acquire Image.");
        try {
            image = imageReader.acquireLatestImage();
        } catch (Exception unused) {
            image = null;
        }
        if (image == null) {
            cVar.a(2, "onImageAvailable:", "failed to acquire Image!");
            return;
        }
        if (this.f19029d.f23631f == pe.f.PREVIEW && !f()) {
            re.c a = L().a(System.currentTimeMillis(), image);
            if (a != null) {
                cVar.a(0, "onImageAvailable:", "Image acquired, dispatching.");
                ((c1) this.f19028c).g(a);
                return;
            } else {
                cVar.a(1, "onImageAvailable:", "Image acquired, but no free frames. DROPPING.");
                return;
            }
        }
        cVar.a(1, "onImageAvailable:", "Image acquired in wrong state. Closing it now.");
        image.close();
    }

    @Override // he.a0
    public final void q(float f10, float[] fArr, PointF[] pointFArr, boolean z10) {
        float f11 = this.f19101v;
        this.f19101v = f10;
        pe.j jVar = this.f19029d;
        jVar.c(20, "exposure correction");
        jVar.e("exposure correction", pe.f.ENGINE, new j(this, f11, z10, f10, fArr, pointFArr));
    }

    @Override // he.a0
    public final void r(ge.g gVar) {
        ge.g gVar2 = this.f19094n;
        this.f19094n = gVar;
        this.f19029d.e("flash (" + gVar + ")", pe.f.ENGINE, new k0.a(15, this, gVar2, gVar));
    }

    @Override // he.a0
    public final void s(int i10) {
        if (this.f19092l == 0) {
            this.f19092l = 35;
        }
        String i11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("frame processing format (", i10, ")");
        j2.r rVar = new j2.r(i10, 5, this);
        pe.j jVar = this.f19029d;
        jVar.getClass();
        jVar.b(0L, i11, new o(1, jVar, rVar), true);
    }

    @Override // he.a0
    public final void t(boolean z10) {
        com.bumptech.glide.manager.q qVar = new com.bumptech.glide.manager.q(3, this, z10);
        pe.j jVar = this.f19029d;
        jVar.getClass();
        jVar.b(0L, "has frame processors (" + z10 + ")", new o(1, jVar, qVar), true);
    }

    @Override // he.a0
    public final void u(ge.i iVar) {
        ge.i iVar2 = this.f19098r;
        this.f19098r = iVar;
        this.f19029d.e("hdr (" + iVar + ")", pe.f.ENGINE, new c(4, this, iVar2));
    }

    @Override // he.a0
    public final void v(Location location) {
        Location location2 = this.f19100t;
        this.f19100t = location;
        this.f19029d.e("location", pe.f.ENGINE, new c(2, this, location2));
    }

    @Override // he.a0
    public final void w(ge.k kVar) {
        if (kVar != this.f19099s) {
            this.f19099s = kVar;
            this.f19029d.e("picture format (" + kVar + ")", pe.f.ENGINE, new h(this, 1));
        }
    }

    @Override // he.a0
    public final void x(boolean z10) {
        this.f19102w = z10;
        Tasks.forResult(null);
    }

    @Override // he.a0
    public final void y(float f10) {
        float f11 = this.f19105z;
        this.f19105z = f10;
        this.f19029d.e("preview fps (" + f10 + ")", pe.f.ENGINE, new f(this, f11, 1));
    }

    @Override // he.a0
    public final void z(ge.n nVar) {
        ge.n nVar2 = this.f19095o;
        this.f19095o = nVar;
        this.f19029d.e("white balance (" + nVar + ")", pe.f.ENGINE, new c(3, this, nVar2));
    }
}
