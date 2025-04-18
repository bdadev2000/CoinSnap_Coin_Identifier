package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.oj;
import com.applovin.impl.x3;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3644b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3645c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f3646d;

    /* renamed from: e, reason: collision with root package name */
    private long f3647e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f3648f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3649g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f3650h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f3651i;

    /* loaded from: classes.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: classes.dex */
    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, oj ojVar, Context context, OnClickListener onClickListener) {
        this.a = ((Long) kVar.a(oj.f6795y0)).longValue();
        this.f3644b = ((Integer) kVar.a(oj.f6802z0)).intValue();
        this.f3645c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.E0)).intValue());
        this.f3646d = ClickRecognitionState.values()[((Integer) kVar.a(ojVar)).intValue()];
        this.f3650h = context;
        this.f3651i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f3651i.onClick(view, motionEvent);
        this.f3649g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f3649g && this.f3646d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f3649g && this.f3646d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f3646d == ClickRecognitionState.DISABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3647e;
                float a = a(this.f3648f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f3649g) {
                    long j3 = this.a;
                    if ((j3 < 0 || elapsedRealtime < j3) && ((i10 = this.f3644b) < 0 || a < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f3646d == ClickRecognitionState.ACTION_DOWN) {
            if (a(motionEvent)) {
                a(view, motionEvent);
            }
        } else {
            this.f3647e = SystemClock.elapsedRealtime();
            this.f3648f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f3649g = false;
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f11 * f11) + (f10 * f10)));
    }

    private float a(float f10) {
        return f10 / this.f3650h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f3645c <= 0) {
            return true;
        }
        Point b3 = x3.b(this.f3650h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f3645c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (b3.x - i10)) && rawY <= ((float) (b3.y - i10));
    }
}
