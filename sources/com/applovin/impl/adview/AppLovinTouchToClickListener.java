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

    /* renamed from: a, reason: collision with root package name */
    private final long f6626a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6627c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f6628d;

    /* renamed from: e, reason: collision with root package name */
    private long f6629e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f6630f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6631g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f6632h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f6633i;

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
        this.f6626a = ((Long) kVar.a(oj.f9888y0)).longValue();
        this.b = ((Integer) kVar.a(oj.f9894z0)).intValue();
        this.f6627c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f9578E0)).intValue());
        this.f6628d = ClickRecognitionState.values()[((Integer) kVar.a(ojVar)).intValue()];
        this.f6632h = context;
        this.f6633i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f6633i.onClick(view, motionEvent);
        this.f6631g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f6631g && this.f6628d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f6631g && this.f6628d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f6628d == ClickRecognitionState.DISABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6629e;
                float a6 = a(this.f6630f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f6631g) {
                    long j7 = this.f6626a;
                    if ((j7 < 0 || elapsedRealtime < j7) && ((i9 = this.b) < 0 || a6 < i9)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f6628d == ClickRecognitionState.ACTION_DOWN) {
            if (a(motionEvent)) {
                a(view, motionEvent);
            }
        } else {
            this.f6629e = SystemClock.elapsedRealtime();
            this.f6630f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f6631g = false;
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f9 = pointF.x - pointF2.x;
        float f10 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f9 * f9)));
    }

    private float a(float f9) {
        return f9 / this.f6632h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f6627c <= 0) {
            return true;
        }
        Point b = x3.b(this.f6632h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i9 = this.f6627c;
        float f9 = i9;
        return rawX >= f9 && rawY >= f9 && rawX <= ((float) (b.x - i9)) && rawY <= ((float) (b.y - i9));
    }
}
