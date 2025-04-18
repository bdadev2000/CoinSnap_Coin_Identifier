package com.applovin.mediation.nativeAds.adPlacer;

import android.support.v4.media.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.n;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f28464a;

    /* renamed from: b, reason: collision with root package name */
    private String f28465b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f28466c = new TreeSet();
    private int d = 0;
    private int e = 256;

    /* renamed from: f, reason: collision with root package name */
    private int f28467f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f28464a = str;
    }

    public void addFixedPosition(int i2) {
        this.f28466c.add(Integer.valueOf(i2));
    }

    public String getAdUnitId() {
        return this.f28464a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f28466c;
    }

    public int getMaxAdCount() {
        return this.e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f28467f;
    }

    @Nullable
    public String getPlacement() {
        return this.f28465b;
    }

    public int getRepeatingInterval() {
        return this.d;
    }

    public boolean hasValidPositioning() {
        return !this.f28466c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.d >= 2;
    }

    public void resetFixedPositions() {
        this.f28466c.clear();
    }

    public void setMaxAdCount(int i2) {
        this.e = i2;
    }

    public void setMaxPreloadedAdCount(int i2) {
        this.f28467f = i2;
    }

    public void setPlacement(@Nullable String str) {
        this.f28465b = str;
    }

    public void setRepeatingInterval(int i2) {
        if (i2 >= 2) {
            this.d = i2;
            n.g("MaxAdPlacerSettings", "Repeating interval set to " + i2);
            return;
        }
        this.d = 0;
        n.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i2 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb.append(this.f28464a);
        sb.append("', fixedPositions=");
        sb.append(this.f28466c);
        sb.append(", repeatingInterval=");
        sb.append(this.d);
        sb.append(", maxAdCount=");
        sb.append(this.e);
        sb.append(", maxPreloadedAdCount=");
        return d.o(sb, this.f28467f, '}');
    }
}
