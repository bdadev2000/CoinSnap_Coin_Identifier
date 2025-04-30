package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.t;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f12747a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f12748c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    private int f12749d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f12750e = NotificationCompat.FLAG_LOCAL_ONLY;

    /* renamed from: f, reason: collision with root package name */
    private int f12751f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f12747a = str;
    }

    public void addFixedPosition(int i9) {
        this.f12748c.add(Integer.valueOf(i9));
    }

    public String getAdUnitId() {
        return this.f12747a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f12748c;
    }

    public int getMaxAdCount() {
        return this.f12750e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f12751f;
    }

    @Nullable
    public String getPlacement() {
        return this.b;
    }

    public int getRepeatingInterval() {
        return this.f12749d;
    }

    public boolean hasValidPositioning() {
        if (this.f12748c.isEmpty() && !isRepeatingEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isRepeatingEnabled() {
        if (this.f12749d >= 2) {
            return true;
        }
        return false;
    }

    public void resetFixedPositions() {
        this.f12748c.clear();
    }

    public void setMaxAdCount(int i9) {
        this.f12750e = i9;
    }

    public void setMaxPreloadedAdCount(int i9) {
        this.f12751f = i9;
    }

    public void setPlacement(@Nullable String str) {
        this.b = str;
    }

    public void setRepeatingInterval(int i9) {
        if (i9 >= 2) {
            this.f12749d = i9;
            t.g("MaxAdPlacerSettings", "Repeating interval set to " + i9);
            return;
        }
        this.f12749d = 0;
        t.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i9 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb.append(this.f12747a);
        sb.append("', fixedPositions=");
        sb.append(this.f12748c);
        sb.append(", repeatingInterval=");
        sb.append(this.f12749d);
        sb.append(", maxAdCount=");
        sb.append(this.f12750e);
        sb.append(", maxPreloadedAdCount=");
        return o.l(sb, this.f12751f, '}');
    }
}
