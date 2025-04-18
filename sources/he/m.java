package he;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.DngCreator;
import android.hardware.camera2.TotalCaptureResult;
import android.location.Location;

/* loaded from: classes4.dex */
public final class m extends ie.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19060f;

    public /* synthetic */ m(Object obj, int i10) {
        this.f19059e = i10;
        this.f19060f = obj;
    }

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        switch (this.f19059e) {
            case 1:
                xe.d dVar = (xe.d) this.f19060f;
                if (((fe.k) dVar.a).f17855e == ge.k.DNG) {
                    DngCreator dngCreator = new DngCreator(sVar.X, totalCaptureResult);
                    dVar.f27638i = dngCreator;
                    int i11 = ((fe.k) dVar.a).f17852b;
                    int i12 = (i11 + 360) % 360;
                    if (i12 != 0) {
                        if (i12 != 90) {
                            if (i12 != 180) {
                                if (i12 == 270) {
                                    i10 = 8;
                                } else {
                                    throw new IllegalArgumentException(eb.j.i("Invalid orientation: ", i11));
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 6;
                        }
                    } else {
                        i10 = 1;
                    }
                    dngCreator.setOrientation(i10);
                    Location location = ((fe.k) dVar.a).a;
                    if (location != null) {
                        dVar.f27638i.setLocation(location);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // ie.e
    public final void g(s sVar, CaptureRequest captureRequest) {
        switch (this.f19059e) {
            case 1:
                super.g(sVar, captureRequest);
                if (captureRequest.getTag() == 2) {
                    xe.e.f27639d.a(1, "onCaptureStarted:", "Dispatching picture shutter.");
                    ((xe.d) this.f19060f).l(false);
                    k(Integer.MAX_VALUE);
                    return;
                }
                return;
            case 2:
                super.g(sVar, captureRequest);
                Object tag = sVar.Z.build().getTag();
                Object tag2 = captureRequest.getTag();
                if (tag == null) {
                    if (tag2 != null) {
                        return;
                    }
                } else if (!tag.equals(tag2)) {
                    return;
                }
                k(Integer.MAX_VALUE);
                return;
            default:
                super.g(sVar, captureRequest);
                return;
        }
    }

    @Override // ie.e
    public final void i(ie.b bVar) {
        int i10 = this.f19059e;
        Object obj = this.f19060f;
        switch (i10) {
            case 0:
                this.f19605c = bVar;
                s sVar = (s) bVar;
                ((s) obj).Y(sVar.Z);
                CaptureRequest.Builder builder = sVar.Z;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_LOCK;
                Boolean bool = Boolean.FALSE;
                builder.set(key, bool);
                sVar.Z.set(CaptureRequest.CONTROL_AWB_LOCK, bool);
                sVar.d0();
                k(Integer.MAX_VALUE);
                return;
            case 1:
                this.f19605c = bVar;
                xe.d dVar = (xe.d) obj;
                dVar.f27637h.addTarget(dVar.f27636g.getSurface());
                fe.k kVar = (fe.k) dVar.a;
                ge.k kVar2 = kVar.f17855e;
                ge.k kVar3 = ge.k.JPEG;
                CaptureRequest.Builder builder2 = dVar.f27637h;
                if (kVar2 == kVar3) {
                    builder2.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(kVar.f17852b));
                }
                builder2.setTag(2);
                try {
                    CaptureRequest.Builder builder3 = ((xe.d) obj).f27637h;
                    s sVar2 = (s) bVar;
                    if (sVar2.f19029d.f23631f == pe.f.PREVIEW && !sVar2.f()) {
                        sVar2.Y.capture(builder3.build(), sVar2.f19079i0, null);
                        return;
                    }
                    return;
                } catch (CameraAccessException e2) {
                    dVar.a = null;
                    dVar.f20055c = e2;
                    dVar.m();
                    k(Integer.MAX_VALUE);
                    return;
                }
            default:
                this.f19605c = bVar;
                return;
        }
    }
}
