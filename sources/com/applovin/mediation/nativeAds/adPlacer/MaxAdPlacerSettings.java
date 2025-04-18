package com.applovin.mediation.nativeAds.adPlacer;

import a4.j;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.t;
import java.util.Set;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private String f9570b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f9571c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    private int f9572d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f9573e = NotificationCompat.FLAG_LOCAL_ONLY;

    /* renamed from: f, reason: collision with root package name */
    private int f9574f = 4;

    public MaxAdPlacerSettings(String str) {
        this.a = str;
    }

    public void addFixedPosition(int i10) {
        this.f9571c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f9571c;
    }

    public int getMaxAdCount() {
        return this.f9573e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f9574f;
    }

    @Nullable
    public String getPlacement() {
        return this.f9570b;
    }

    public int getRepeatingInterval() {
        return this.f9572d;
    }

    public boolean hasValidPositioning() {
        return !this.f9571c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f9572d >= 2;
    }

    public void resetFixedPositions() {
        this.f9571c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f9573e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f9574f = i10;
    }

    public void setPlacement(@Nullable String str) {
        this.f9570b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f9572d = i10;
            t.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f9572d = 0;
        t.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb2.append(this.a);
        sb2.append("', fixedPositions=");
        sb2.append(this.f9571c);
        sb2.append(", repeatingInterval=");
        sb2.append(this.f9572d);
        sb2.append(", maxAdCount=");
        sb2.append(this.f9573e);
        sb2.append(", maxPreloadedAdCount=");
        return j.i(sb2, this.f9574f, AbstractJsonLexerKt.END_OBJ);
    }
}
