package com.glority.android.core.modules;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ChannelData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/glority/android/core/modules/ChannelData;", "", "channelTargetCode", "", "channelInterval", "activityChannelMark", "channelTimestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getActivityChannelMark", "()Ljava/lang/String;", "getChannelInterval", "getChannelTargetCode", "getChannelTimestamp", "()J", "setChannelTimestamp", "(J)V", "addChannel", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getValidTime", "hashCode", "", "toString", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final /* data */ class ChannelData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static long DEFAULT_VALID_TIME = 600000;
    private static final HashMap<String, ChannelData> channelInfos = new HashMap<>();
    private static boolean isNeedCheckValidTime;
    private static String utm_campaign;
    private static String utm_content;
    private static String utm_medium;
    private static String utm_source;
    private final String activityChannelMark;
    private final String channelInterval;
    private final String channelTargetCode;
    private long channelTimestamp;

    public static /* synthetic */ ChannelData copy$default(ChannelData channelData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelData.channelTargetCode;
        }
        if ((i & 2) != 0) {
            str2 = channelData.channelInterval;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = channelData.activityChannelMark;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = channelData.channelTimestamp;
        }
        return channelData.copy(str, str4, str5, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannelTargetCode() {
        return this.channelTargetCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChannelInterval() {
        return this.channelInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActivityChannelMark() {
        return this.activityChannelMark;
    }

    /* renamed from: component4, reason: from getter */
    public final long getChannelTimestamp() {
        return this.channelTimestamp;
    }

    public final ChannelData copy(String channelTargetCode, String channelInterval, String activityChannelMark, long channelTimestamp) {
        Intrinsics.checkNotNullParameter(activityChannelMark, "activityChannelMark");
        return new ChannelData(channelTargetCode, channelInterval, activityChannelMark, channelTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelData)) {
            return false;
        }
        ChannelData channelData = (ChannelData) other;
        return Intrinsics.areEqual(this.channelTargetCode, channelData.channelTargetCode) && Intrinsics.areEqual(this.channelInterval, channelData.channelInterval) && Intrinsics.areEqual(this.activityChannelMark, channelData.activityChannelMark) && this.channelTimestamp == channelData.channelTimestamp;
    }

    public int hashCode() {
        String str = this.channelTargetCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelInterval;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.activityChannelMark.hashCode()) * 31) + Long.hashCode(this.channelTimestamp);
    }

    public String toString() {
        return "ChannelData(channelTargetCode=" + ((Object) this.channelTargetCode) + ", channelInterval=" + ((Object) this.channelInterval) + ", activityChannelMark=" + this.activityChannelMark + ", channelTimestamp=" + this.channelTimestamp + ')';
    }

    public ChannelData(String str, String str2, String activityChannelMark, long j) {
        Intrinsics.checkNotNullParameter(activityChannelMark, "activityChannelMark");
        this.channelTargetCode = str;
        this.channelInterval = str2;
        this.activityChannelMark = activityChannelMark;
        this.channelTimestamp = j;
    }

    public final String getChannelTargetCode() {
        return this.channelTargetCode;
    }

    public final String getChannelInterval() {
        return this.channelInterval;
    }

    public final String getActivityChannelMark() {
        return this.activityChannelMark;
    }

    public final long getChannelTimestamp() {
        return this.channelTimestamp;
    }

    public final void setChannelTimestamp(long j) {
        this.channelTimestamp = j;
    }

    /* compiled from: ChannelData.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0007J\u001d\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0002\u0010$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006%"}, d2 = {"Lcom/glority/android/core/modules/ChannelData$Companion;", "", "()V", "DEFAULT_VALID_TIME", "", "channelInfos", "Ljava/util/HashMap;", "", "Lcom/glority/android/core/modules/ChannelData;", "Lkotlin/collections/HashMap;", "getChannelInfos", "()Ljava/util/HashMap;", "isNeedCheckValidTime", "", "()Z", "setNeedCheckValidTime", "(Z)V", "utm_campaign", "getUtm_campaign", "()Ljava/lang/String;", "setUtm_campaign", "(Ljava/lang/String;)V", "utm_content", "getUtm_content", "setUtm_content", "utm_medium", "getUtm_medium", "setUtm_medium", "utm_source", "getUtm_source", "setUtm_source", "getChannelByCode", "code", "isValid", "targetCode", "activityName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HashMap<String, ChannelData> getChannelInfos() {
            return ChannelData.channelInfos;
        }

        public final boolean isNeedCheckValidTime() {
            return ChannelData.isNeedCheckValidTime;
        }

        public final void setNeedCheckValidTime(boolean z) {
            ChannelData.isNeedCheckValidTime = z;
        }

        public final String getUtm_source() {
            return ChannelData.utm_source;
        }

        public final void setUtm_source(String str) {
            ChannelData.utm_source = str;
        }

        public final String getUtm_medium() {
            return ChannelData.utm_medium;
        }

        public final void setUtm_medium(String str) {
            ChannelData.utm_medium = str;
        }

        public final String getUtm_campaign() {
            return ChannelData.utm_campaign;
        }

        public final void setUtm_campaign(String str) {
            ChannelData.utm_campaign = str;
        }

        public final String getUtm_content() {
            return ChannelData.utm_content;
        }

        public final void setUtm_content(String str) {
            ChannelData.utm_content = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        
            if ((r2 == null ? null : java.lang.Boolean.valueOf(kotlin.text.StringsKt.startsWith$default(r2, r8, false, 2, (java.lang.Object) null))).booleanValue() != false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean isValid(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "targetCode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "activityName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.util.HashMap r0 = r6.getChannelInfos()
                java.lang.Object r7 = r0.get(r7)
                com.glority.android.core.modules.ChannelData r7 = (com.glority.android.core.modules.ChannelData) r7
                r0 = 0
                r1 = 0
                if (r7 != 0) goto L1b
            L19:
                r7 = r1
                goto L43
            L1b:
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r7.getChannelTimestamp()
                long r2 = r2 - r4
                long r4 = com.glority.android.core.modules.ChannelData.access$getValidTime(r7)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L19
                java.lang.String r2 = r7.getActivityChannelMark()
                if (r2 != 0) goto L34
                r8 = r1
                goto L3d
            L34:
                r3 = 2
                boolean r8 = kotlin.text.StringsKt.startsWith$default(r2, r8, r0, r3, r1)
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            L3d:
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L19
            L43:
                if (r7 == 0) goto L46
                r0 = 1
            L46:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.glority.android.core.modules.ChannelData.Companion.isValid(java.lang.String, java.lang.String):java.lang.Boolean");
        }

        public final String getChannelByCode(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            ChannelData channelData = getChannelInfos().get(code);
            if (channelData == null) {
                return null;
            }
            if (System.currentTimeMillis() - channelData.getChannelTimestamp() > channelData.getValidTime()) {
                channelData = null;
            }
            if (channelData == null) {
                return null;
            }
            return channelData.getActivityChannelMark();
        }
    }

    public final void addChannel() {
        String str = this.channelTargetCode;
        if (str == null) {
            return;
        }
        setChannelTimestamp(System.currentTimeMillis());
        channelInfos.put(str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getValidTime() {
        Long longOrNull;
        if (!isNeedCheckValidTime) {
            return Long.MAX_VALUE;
        }
        String str = this.channelInterval;
        Long l = null;
        if (str != null && (longOrNull = StringsKt.toLongOrNull(str)) != null) {
            l = Long.valueOf(longOrNull.longValue() * 1000);
        }
        return l == null ? DEFAULT_VALID_TIME : l.longValue();
    }
}
