package p9;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* renamed from: d, reason: collision with root package name */
    public final j f23557d;

    /* renamed from: g, reason: collision with root package name */
    public final GestureDetector f23559g;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f23555b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    public final PointF f23556c = new PointF();

    /* renamed from: f, reason: collision with root package name */
    public final float f23558f = 25.0f;

    /* renamed from: h, reason: collision with root package name */
    public volatile float f23560h = 3.1415927f;

    public l(Context context, j jVar) {
        this.f23557d = jVar;
        this.f23559g = new GestureDetector(context, this);
    }

    @Override // p9.c
    public final void a(float[] fArr, float f10) {
        this.f23560h = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f23555b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f23555b.x) / this.f23558f;
        float y4 = motionEvent2.getY();
        PointF pointF = this.f23555b;
        float f12 = (y4 - pointF.y) / this.f23558f;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f23560h;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f23556c;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = (cos * f12) + (sin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        j jVar = this.f23557d;
        PointF pointF3 = this.f23556c;
        synchronized (jVar) {
            float f14 = pointF3.y;
            jVar.f23538i = f14;
            Matrix.setRotateM(jVar.f23536g, 0, -f14, (float) Math.cos(jVar.f23539j), (float) Math.sin(jVar.f23539j), 0.0f);
            Matrix.setRotateM(jVar.f23537h, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f23557d.f23542m.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f23559g.onTouchEvent(motionEvent);
    }
}
