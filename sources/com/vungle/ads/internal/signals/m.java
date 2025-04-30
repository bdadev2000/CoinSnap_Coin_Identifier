package com.vungle.ads.internal.signals;

import Q7.n0;
import e8.W;
import e8.g0;
import e8.k0;

/* loaded from: classes3.dex */
public final class m {
    public static final l Companion = new l(null);
    private long adAvailabilityCallbackTime;
    private String eventId;
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    public m() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ m copy$default(m mVar, Long l, long j7, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            l = mVar.lastAdLoadTime;
        }
        if ((i9 & 2) != 0) {
            j7 = mVar.loadAdTime;
        }
        return mVar.copy(l, j7);
    }

    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    private final long getTimeDifference(Long l, long j7) {
        if (l == null) {
            return -1L;
        }
        long longValue = j7 - l.longValue();
        if (longValue < 0) {
            return -1L;
        }
        return longValue;
    }

    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }

    public static final void write$Self(m mVar, d8.b bVar, c8.g gVar) {
        G7.j.e(mVar, "self");
        if (n0.u(bVar, "output", gVar, "serialDesc", gVar) || mVar.templateSignals != null) {
            bVar.u(gVar, 0, k0.f20172a, mVar.templateSignals);
        }
        bVar.z(gVar, 1, mVar.timeSinceLastAdLoad);
        if (bVar.o(gVar) || mVar.eventId != null) {
            bVar.u(gVar, 2, k0.f20172a, mVar.eventId);
        }
        if (bVar.o(gVar) || mVar.timeBetweenAdAvailabilityAndPlayAd != 0) {
            bVar.z(gVar, 3, mVar.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (bVar.o(gVar) || mVar.screenOrientation != 0) {
            bVar.C(4, mVar.screenOrientation, gVar);
        }
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    public final Long component1() {
        return this.lastAdLoadTime;
    }

    public final long component2() {
        return this.loadAdTime;
    }

    public final m copy(Long l, long j7) {
        return new m(l, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return G7.j.a(this.lastAdLoadTime, mVar.lastAdLoadTime) && this.loadAdTime == mVar.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public int hashCode() {
        Long l = this.lastAdLoadTime;
        return Long.hashCode(this.loadAdTime) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final void setAdAvailabilityCallbackTime(long j7) {
        this.adAvailabilityCallbackTime = j7;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j7) {
        this.playAdTime = j7;
    }

    public final void setScreenOrientation(int i9) {
        this.screenOrientation = i9;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j7) {
        this.timeBetweenAdAvailabilityAndPlayAd = j7;
    }

    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    public /* synthetic */ m(int i9, String str, long j7, String str2, long j9, int i10, g0 g0Var) {
        if (2 == (i9 & 2)) {
            this.lastAdLoadTime = 0L;
            this.loadAdTime = 0L;
            if ((i9 & 1) == 0) {
                this.templateSignals = null;
            } else {
                this.templateSignals = str;
            }
            this.timeSinceLastAdLoad = j7;
            if ((i9 & 4) == 0) {
                this.eventId = null;
            } else {
                this.eventId = str2;
            }
            if ((i9 & 8) == 0) {
                this.timeBetweenAdAvailabilityAndPlayAd = 0L;
            } else {
                this.timeBetweenAdAvailabilityAndPlayAd = j9;
            }
            if ((i9 & 16) == 0) {
                this.screenOrientation = 0;
            } else {
                this.screenOrientation = i10;
            }
            this.adAvailabilityCallbackTime = 0L;
            this.playAdTime = 0L;
            this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
            return;
        }
        W.h(i9, 2, k.INSTANCE.getDescriptor());
        throw null;
    }

    public m(Long l, long j7) {
        this.lastAdLoadTime = l;
        this.loadAdTime = j7;
        this.timeSinceLastAdLoad = getTimeDifference(l, j7);
    }

    public /* synthetic */ m(Long l, long j7, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? 0L : l, (i9 & 2) != 0 ? 0L : j7);
    }
}
