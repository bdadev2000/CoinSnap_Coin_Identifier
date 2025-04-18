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
    private final a f5755c;

    /* renamed from: d, reason: collision with root package name */
    private final float f5756d;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f5757e;
    private final PointF a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f5754b = new PointF();

    /* renamed from: f, reason: collision with root package name */
    private volatile float f5758f = 3.1415927f;

    /* loaded from: classes.dex */
    public interface a {
        void a(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public ko(Context context, a aVar, float f10) {
        this.f5755c = aVar;
        this.f5756d = f10;
        this.f5757e = new GestureDetector(context, this);
    }

    @Override // com.applovin.impl.ug.a
    public void a(float[] fArr, float f10) {
        this.f5758f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.a.x) / this.f5756d;
        float y4 = motionEvent2.getY();
        PointF pointF = this.a;
        float f12 = (y4 - pointF.y) / this.f5756d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f5758f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f5754b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = (cos * f12) + (sin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f5755c.a(this.f5754b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f5755c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f5757e.onTouchEvent(motionEvent);
    }
}
