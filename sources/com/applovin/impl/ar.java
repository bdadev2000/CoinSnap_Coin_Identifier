package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes3.dex */
public class ar {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f22955a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f22956b;

    /* renamed from: c, reason: collision with root package name */
    private final View f22957c;

    public ar(View view, com.applovin.impl.sdk.j jVar) {
        this.f22955a = jVar;
        this.f22956b = jVar.J();
        this.f22957c = view;
    }

    public long a(ne neVar) {
        long j2;
        if (com.applovin.impl.sdk.n.a()) {
            this.f22956b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point b2 = z3.b(this.f22957c.getContext());
        if (this.f22957c.isShown()) {
            j2 = 0;
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "View is hidden");
            }
            j2 = 2;
        }
        if (this.f22957c.getAlpha() < neVar.h0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "View is transparent");
            }
            j2 |= 4;
        }
        Animation animation = this.f22957c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "View is animating");
            }
            j2 |= 8;
        }
        if (this.f22957c.getParent() == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "No parent view found");
            }
            j2 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f22957c.getContext(), this.f22957c.getWidth());
        if (pxToDp < Math.min(neVar.n0(), b2.x)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j2 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f22957c.getContext(), this.f22957c.getHeight());
        if (pxToDp2 < neVar.j0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j2 |= 64;
        }
        Rect rect = new Rect(0, 0, b2.x, b2.y);
        int[] iArr = {-1, -1};
        this.f22957c.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        Rect rect2 = new Rect(i2, iArr[1], this.f22957c.getWidth() + i2, this.f22957c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j2 |= 128;
        }
        Activity b3 = this.f22955a.e().b();
        if (b3 != null && !zq.a(this.f22957c, b3)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22956b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j2 |= 256;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f22956b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j2));
        }
        return j2;
    }
}
