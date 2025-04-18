package com.applovin.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.xg;

/* loaded from: classes.dex */
final class jo extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, xg.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f24718c;
    private final float d;
    private final GestureDetector e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f24716a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f24717b = new PointF();

    /* renamed from: f, reason: collision with root package name */
    private volatile float f24719f = 3.1415927f;

    /* loaded from: classes.dex */
    public interface a {
        void a(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public jo(Context context, a aVar, float f2) {
        this.f24718c = aVar;
        this.d = f2;
        this.e = new GestureDetector(context, this);
    }

    @Override // com.applovin.impl.xg.a
    public void a(float[] fArr, float f2) {
        this.f24719f = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f24716a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = (motionEvent2.getX() - this.f24716a.x) / this.d;
        float y2 = motionEvent2.getY();
        PointF pointF = this.f24716a;
        float f4 = (y2 - pointF.y) / this.d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f24719f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f24717b;
        pointF2.x -= (cos * x) - (sin * f4);
        float f5 = (cos * f4) + (sin * x) + pointF2.y;
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        this.f24718c.a(this.f24717b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f24718c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}
