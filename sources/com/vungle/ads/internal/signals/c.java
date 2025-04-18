package com.vungle.ads.internal.signals;

import bh.x3;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class c {
    public static final b Companion = new b(null);
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<m> signaledAd;
    private List<x3> unclosedAd;

    public c(int i10) {
        this.sessionCount = i10;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.sessionId = uuid;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ c copy$default(c cVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.sessionCount;
        }
        return cVar.copy(i10);
    }

    @SerialName("103")
    public static /* synthetic */ void getSessionCount$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_NOT_FOUND)
    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    @SerialName("104")
    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    @SerialName(MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE)
    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @SerialName("106")
    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    @SerialName("105")
    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0037  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.vungle.ads.internal.signals.c r9, kotlinx.serialization.encoding.CompositeEncoder r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.c.write$Self(com.vungle.ads.internal.signals.c, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int component1() {
        return this.sessionCount;
    }

    public final c copy(int i10) {
        return new c(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.sessionCount == ((c) obj).sessionCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<m> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<x3> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    public final void setSessionCreationTime(long j3) {
        this.sessionCreationTime = j3;
    }

    public final void setSessionDepthCounter(int i10) {
        this.sessionDepthCounter = i10;
    }

    public final void setSessionDuration(long j3) {
        this.sessionDuration = j3;
    }

    public final void setSignaledAd(List<m> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<x3> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.unclosedAd = list;
    }

    public String toString() {
        return a4.j.i(new StringBuilder("SessionData(sessionCount="), this.sessionCount, ')');
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ c(int i10, @SerialName("103") int i11, @SerialName("101") String str, @SerialName("100") long j3, @SerialName("106") List list, @SerialName("102") long j10, @SerialName("104") int i12, @SerialName("105") List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, a.INSTANCE.getDescriptor());
        }
        this.sessionCount = i11;
        if ((i10 & 2) == 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            this.sessionId = uuid;
        } else {
            this.sessionId = str;
        }
        if ((i10 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j3;
        }
        if ((i10 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i10 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j10;
        }
        if ((i10 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i12;
        }
        if ((i10 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
    }
}
