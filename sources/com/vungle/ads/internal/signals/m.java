package com.vungle.ads.internal.signals;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
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

    public static /* synthetic */ m copy$default(m mVar, Long l10, long j3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = mVar.lastAdLoadTime;
        }
        if ((i10 & 2) != 0) {
            j3 = mVar.loadAdTime;
        }
        return mVar.copy(l10, j3);
    }

    @Transient
    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    @SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @Transient
    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    @Transient
    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    @Transient
    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    @SerialName("108")
    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    @SerialName("500")
    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    @SerialName("110")
    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    private final long getTimeDifference(Long l10, long j3) {
        if (l10 == null) {
            return -1L;
        }
        long longValue = j3 - l10.longValue();
        if (longValue < 0) {
            return -1L;
        }
        return longValue;
    }

    @SerialName("109")
    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }

    @JvmStatic
    public static final void write$Self(m self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z13 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.templateSignals != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.templateSignals);
        }
        output.encodeLongElement(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.eventId != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.eventId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeLongElement(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.screenOrientation != 0) {
            z13 = true;
        }
        if (z13) {
            output.encodeIntElement(serialDesc, 4, self.screenOrientation);
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

    public final m copy(Long l10, long j3) {
        return new m(l10, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.lastAdLoadTime, mVar.lastAdLoadTime) && this.loadAdTime == mVar.loadAdTime;
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
        Long l10 = this.lastAdLoadTime;
        return Long.hashCode(this.loadAdTime) + ((l10 == null ? 0 : l10.hashCode()) * 31);
    }

    public final void setAdAvailabilityCallbackTime(long j3) {
        this.adAvailabilityCallbackTime = j3;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j3) {
        this.playAdTime = j3;
    }

    public final void setScreenOrientation(int i10) {
        this.screenOrientation = i10;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j3) {
        this.timeBetweenAdAvailabilityAndPlayAd = j3;
    }

    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ m(int i10, @SerialName("500") String str, @SerialName("109") long j3, @SerialName("107") String str2, @SerialName("110") long j10, @SerialName("108") int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i10 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 2, k.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i10 & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j3;
        if ((i10 & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i10 & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j10;
        }
        if ((i10 & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i11;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public m(Long l10, long j3) {
        this.lastAdLoadTime = l10;
        this.loadAdTime = j3;
        this.timeSinceLastAdLoad = getTimeDifference(l10, j3);
    }

    public /* synthetic */ m(Long l10, long j3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : l10, (i10 & 2) != 0 ? 0L : j3);
    }
}
