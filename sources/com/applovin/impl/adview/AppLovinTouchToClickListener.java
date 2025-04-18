package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.sj;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes2.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f22735a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22736b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22737c;
    private final ClickRecognitionState d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f22738f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22739g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f22740h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f22741i;

    /* loaded from: classes2.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: classes2.dex */
    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.j jVar, sj sjVar, Context context, OnClickListener onClickListener) {
        this.f22735a = ((Long) jVar.a(sj.B0)).longValue();
        this.f22736b = ((Integer) jVar.a(sj.C0)).intValue();
        this.f22737c = AppLovinSdkUtils.dpToPx(context, ((Integer) jVar.a(sj.H0)).intValue());
        this.d = ClickRecognitionState.values()[((Integer) jVar.a(sjVar)).intValue()];
        this.f22740h = context;
        this.f22741i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f22741i.onClick(view, motionEvent);
        this.f22739g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f22739g && this.d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f22739g && this.d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.d == ClickRecognitionState.DISABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
                float a2 = a(this.f22738f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f22739g) {
                    long j2 = this.f22735a;
                    if ((j2 < 0 || elapsedRealtime < j2) && ((i2 = this.f22736b) < 0 || a2 < i2)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.d != ClickRecognitionState.ACTION_DOWN) {
            this.e = SystemClock.elapsedRealtime();
            this.f22738f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f22739g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f2 = pointF.x - pointF2.x;
        float f3 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f3 * f3) + (f2 * f2)));
    }

    private float a(float f2) {
        return f2 / this.f22740h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f22737c <= 0) {
            return true;
        }
        Point b2 = z3.b(this.f22740h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i2 = this.f22737c;
        float f2 = i2;
        return rawX >= f2 && rawY >= f2 && rawX <= ((float) (b2.x - i2)) && rawY <= ((float) (b2.y - i2));
    }
}
