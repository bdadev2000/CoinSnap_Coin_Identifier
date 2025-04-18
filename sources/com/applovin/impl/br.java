package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class br {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f3953b;

    /* renamed from: c, reason: collision with root package name */
    private final View f3954c;

    public br(View view, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f3953b = kVar.L();
        this.f3954c = view;
    }

    public long a(ie ieVar) {
        long j3;
        if (com.applovin.impl.sdk.t.a()) {
            this.f3953b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point b3 = x3.b(this.f3954c.getContext());
        if (!this.f3954c.isShown()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "View is hidden");
            }
            j3 = 2;
        } else {
            j3 = 0;
        }
        if (this.f3954c.getAlpha() < ieVar.c0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "View is transparent");
            }
            j3 |= 4;
        }
        Animation animation = this.f3954c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "View is animating");
            }
            j3 |= 8;
        }
        if (this.f3954c.getParent() == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "No parent view found");
            }
            j3 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f3954c.getContext(), this.f3954c.getWidth());
        if (pxToDp < Math.min(ieVar.i0(), b3.x)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j3 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f3954c.getContext(), this.f3954c.getHeight());
        if (pxToDp2 < ieVar.e0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j3 |= 64;
        }
        Rect rect = new Rect(0, 0, b3.x, b3.y);
        int[] iArr = {-1, -1};
        this.f3954c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f3954c.getWidth() + i10, this.f3954c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j3 |= 128;
        }
        Activity b10 = this.a.e().b();
        if (b10 != null && !ar.a(this.f3954c, b10)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3953b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j3 |= 256;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f3953b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j3));
        }
        return j3;
    }
}
