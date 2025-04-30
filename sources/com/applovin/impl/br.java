package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class br {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6933a;
    private final com.applovin.impl.sdk.t b;

    /* renamed from: c, reason: collision with root package name */
    private final View f6934c;

    public br(View view, com.applovin.impl.sdk.k kVar) {
        this.f6933a = kVar;
        this.b = kVar.L();
        this.f6934c = view;
    }

    public long a(ie ieVar) {
        long j7;
        if (com.applovin.impl.sdk.t.a()) {
            this.b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point b = x3.b(this.f6934c.getContext());
        if (!this.f6934c.isShown()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is hidden");
            }
            j7 = 2;
        } else {
            j7 = 0;
        }
        if (this.f6934c.getAlpha() < ieVar.c0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is transparent");
            }
            j7 |= 4;
        }
        Animation animation = this.f6934c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is animating");
            }
            j7 |= 8;
        }
        if (this.f6934c.getParent() == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "No parent view found");
            }
            j7 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f6934c.getContext(), this.f6934c.getWidth());
        if (pxToDp < Math.min(ieVar.i0(), b.x)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j7 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f6934c.getContext(), this.f6934c.getHeight());
        if (pxToDp2 < ieVar.e0()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j7 |= 64;
        }
        Rect rect = new Rect(0, 0, b.x, b.y);
        int[] iArr = {-1, -1};
        this.f6934c.getLocationOnScreen(iArr);
        int i9 = iArr[0];
        Rect rect2 = new Rect(i9, iArr[1], this.f6934c.getWidth() + i9, this.f6934c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j7 |= 128;
        }
        Activity b8 = this.f6933a.e().b();
        if (b8 != null && !ar.a(this.f6934c, b8)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j7 |= 256;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j7));
        }
        return j7;
    }
}
