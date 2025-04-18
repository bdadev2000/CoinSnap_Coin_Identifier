package me;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import fe.c;

/* loaded from: classes4.dex */
public final class a implements ve.b {

    /* renamed from: c, reason: collision with root package name */
    public static final c f22224c = new c(a.class.getSimpleName());
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final ze.b f22225b;

    public a(ne.a aVar, ze.b bVar) {
        this.a = -aVar.c(2, 3, 1);
        this.f22225b = bVar;
    }

    @Override // ve.b
    public final PointF a(PointF pointF) {
        PointF pointF2 = new PointF();
        float f10 = pointF.x;
        ze.b bVar = this.f22225b;
        pointF2.x = ((f10 / bVar.f28749b) * 2000.0f) - 1000.0f;
        pointF2.y = ((pointF.y / bVar.f28750c) * 2000.0f) - 1000.0f;
        PointF pointF3 = new PointF();
        double d10 = (this.a * 3.141592653589793d) / 180.0d;
        pointF3.x = (float) ((Math.cos(d10) * pointF2.x) - (Math.sin(d10) * pointF2.y));
        pointF3.y = (float) ((Math.cos(d10) * pointF2.y) + (Math.sin(d10) * pointF2.x));
        f22224c.a(1, "scaled:", pointF2, "rotated:", pointF3);
        return pointF3;
    }

    @Override // ve.b
    public final Object b(int i10, RectF rectF) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new Camera.Area(rect, i10);
    }
}
