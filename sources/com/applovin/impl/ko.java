package com.applovin.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.ug;

/* loaded from: classes.dex */
final class ko extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ug.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f8734c;

    /* renamed from: d, reason: collision with root package name */
    private final float f8735d;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f8736e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f8733a = new PointF();
    private final PointF b = new PointF();

    /* renamed from: f, reason: collision with root package name */
    private volatile float f8737f = 3.1415927f;

    /* loaded from: classes.dex */
    public interface a {
        void a(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public ko(Context context, a aVar, float f9) {
        this.f8734c = aVar;
        this.f8735d = f9;
        this.f8736e = new GestureDetector(context, this);
    }

    @Override // com.applovin.impl.ug.a
    public void a(float[] fArr, float f9) {
        this.f8737f = -f9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f8733a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float x9 = (motionEvent2.getX() - this.f8733a.x) / this.f8735d;
        float y4 = motionEvent2.getY();
        PointF pointF = this.f8733a;
        float f11 = (y4 - pointF.y) / this.f8735d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d2 = this.f8737f;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        PointF pointF2 = this.b;
        pointF2.x -= (cos * x9) - (sin * f11);
        float f12 = (cos * f11) + (sin * x9) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        this.f8734c.a(this.b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f8734c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f8736e.onTouchEvent(motionEvent);
    }
}
