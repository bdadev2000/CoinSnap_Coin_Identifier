package me;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import eb.j;
import fe.c;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b implements ve.b {

    /* renamed from: g, reason: collision with root package name */
    public static final c f22226g = new c(b.class.getSimpleName());
    public final ne.a a;

    /* renamed from: b, reason: collision with root package name */
    public final ze.b f22227b;

    /* renamed from: c, reason: collision with root package name */
    public final ze.b f22228c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22229d;

    /* renamed from: e, reason: collision with root package name */
    public final CameraCharacteristics f22230e;

    /* renamed from: f, reason: collision with root package name */
    public final CaptureRequest.Builder f22231f;

    public b(ne.a aVar, ze.b bVar, ze.b bVar2, boolean z10, CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder) {
        this.a = aVar;
        this.f22227b = bVar;
        this.f22228c = bVar2;
        this.f22229d = z10;
        this.f22230e = cameraCharacteristics;
        this.f22231f = builder;
    }

    @Override // ve.b
    public final PointF a(PointF pointF) {
        boolean z10;
        int width;
        int height;
        float f10;
        float f11;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        ze.b bVar = this.f22227b;
        int i10 = bVar.f28749b;
        HashMap hashMap = ze.a.f28746d;
        ze.b bVar2 = this.f22228c;
        ze.a a = ze.a.a(bVar2.f28749b, bVar2.f28750c);
        int i11 = bVar.f28749b;
        int i12 = bVar.f28750c;
        ze.a a10 = ze.a.a(i11, i12);
        if (this.f22229d) {
            if (a.c() > a10.c()) {
                float c10 = a.c() / a10.c();
                float f12 = i11;
                pointF2.x = (((c10 - 1.0f) * f12) / 2.0f) + pointF2.x;
                i10 = Math.round(f12 * c10);
            } else {
                float c11 = a10.c() / a.c();
                float f13 = i12;
                pointF2.y = (((c11 - 1.0f) * f13) / 2.0f) + pointF2.y;
                i12 = Math.round(f13 * c11);
            }
        }
        float f14 = pointF2.x;
        int i13 = bVar2.f28749b;
        pointF2.x = (i13 / i10) * f14;
        float f15 = pointF2.y;
        int i14 = bVar2.f28750c;
        pointF2.y = (i14 / i12) * f15;
        int c12 = this.a.c(2, 3, 1);
        if (c12 % 180 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f16 = pointF2.x;
        float f17 = pointF2.y;
        if (c12 == 0) {
            pointF2.x = f16;
            pointF2.y = f17;
        } else if (c12 == 90) {
            pointF2.x = f17;
            pointF2.y = i13 - f16;
        } else if (c12 == 180) {
            pointF2.x = i13 - f16;
            pointF2.y = i14 - f17;
        } else if (c12 == 270) {
            pointF2.x = i14 - f17;
            pointF2.y = f16;
        } else {
            throw new IllegalStateException(j.i("Unexpected angle ", c12));
        }
        if (z10) {
            bVar2 = bVar2.a();
        }
        CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
        CaptureRequest.Builder builder = this.f22231f;
        Rect rect = (Rect) builder.get(key);
        int i15 = bVar2.f28749b;
        if (rect == null) {
            width = i15;
        } else {
            width = rect.width();
        }
        int i16 = bVar2.f28750c;
        if (rect == null) {
            height = i16;
        } else {
            height = rect.height();
        }
        pointF2.x = ((width - i15) / 2.0f) + pointF2.x;
        pointF2.y = ((height - i16) / 2.0f) + pointF2.y;
        Rect rect2 = (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION);
        float f18 = pointF2.x;
        if (rect2 == null) {
            f10 = 0.0f;
        } else {
            f10 = rect2.left;
        }
        pointF2.x = f18 + f10;
        float f19 = pointF2.y;
        if (rect2 == null) {
            f11 = 0.0f;
        } else {
            f11 = rect2.top;
        }
        pointF2.y = f19 + f11;
        Rect rect3 = (Rect) this.f22230e.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect3 == null) {
            rect3 = new Rect(0, 0, width, height);
        }
        int width2 = rect3.width();
        int height2 = rect3.height();
        c cVar = f22226g;
        cVar.a(1, "input:", pointF, "output (before clipping):", pointF2);
        if (pointF2.x < 0.0f) {
            pointF2.x = 0.0f;
        }
        if (pointF2.y < 0.0f) {
            pointF2.y = 0.0f;
        }
        float f20 = width2;
        if (pointF2.x > f20) {
            pointF2.x = f20;
        }
        float f21 = height2;
        if (pointF2.y > f21) {
            pointF2.y = f21;
        }
        cVar.a(1, "input:", pointF, "output (after clipping):", pointF2);
        return pointF2;
    }

    @Override // ve.b
    public final Object b(int i10, RectF rectF) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new MeteringRectangle(rect, i10);
    }
}
