package c7;

import androidx.core.app.NotificationCompat;
import java.util.List;
import u7.C2824o;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class p1 {
    public static final o1 Companion = new o1(null);
    private final int adRefreshDuration;
    private final String adSize;
    private final boolean headerBidding;
    private final String identifier;
    private final Boolean incentivized;
    private final boolean isIncentivized;
    private final String placementAdType;
    private final String referenceId;
    private final List<String> supportedAdFormats;
    private final List<String> supportedTemplateTypes;
    private Long wakeupTime;

    public /* synthetic */ p1(int i9, String str, String str2, Boolean bool, List list, List list2, int i10, boolean z8, String str3, boolean z9, String str4, e8.g0 g0Var) {
        String str5;
        if (3 != (i9 & 3)) {
            e8.W.h(i9, 3, n1.INSTANCE.getDescriptor());
            throw null;
        }
        this.identifier = str;
        this.referenceId = str2;
        if ((i9 & 4) == 0) {
            this.incentivized = Boolean.FALSE;
        } else {
            this.incentivized = bool;
        }
        int i11 = i9 & 8;
        C2824o c2824o = C2824o.b;
        if (i11 == 0) {
            this.supportedTemplateTypes = c2824o;
        } else {
            this.supportedTemplateTypes = list;
        }
        if ((i9 & 16) == 0) {
            this.supportedAdFormats = c2824o;
        } else {
            this.supportedAdFormats = list2;
        }
        if ((i9 & 32) == 0) {
            this.adRefreshDuration = Integer.MIN_VALUE;
        } else {
            this.adRefreshDuration = i10;
        }
        if ((i9 & 64) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z8;
        }
        if ((i9 & 128) == 0) {
            this.adSize = null;
        } else {
            this.adSize = str3;
        }
        if ((i9 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            Boolean bool2 = this.incentivized;
            this.isIncentivized = bool2 != null ? bool2.booleanValue() : false;
        } else {
            this.isIncentivized = z9;
        }
        this.wakeupTime = null;
        if ((i9 & 512) != 0) {
            this.placementAdType = str4;
            return;
        }
        List<String> list3 = this.supportedTemplateTypes;
        if (list3.contains("banner")) {
            str5 = "TYPE_BANNER";
        } else if (list3.contains("mrec")) {
            str5 = "TYPE_MREC";
        } else if (list3.contains("native")) {
            str5 = "TYPE_NATIVE";
        } else {
            str5 = "TYPE_DEFAULT";
        }
        this.placementAdType = str5;
    }

    public static /* synthetic */ p1 copy$default(p1 p1Var, String str, String str2, Boolean bool, List list, List list2, int i9, boolean z8, String str3, int i10, Object obj) {
        String str4;
        String str5;
        Boolean bool2;
        List list3;
        List list4;
        int i11;
        boolean z9;
        String str6;
        if ((i10 & 1) != 0) {
            str4 = p1Var.identifier;
        } else {
            str4 = str;
        }
        if ((i10 & 2) != 0) {
            str5 = p1Var.referenceId;
        } else {
            str5 = str2;
        }
        if ((i10 & 4) != 0) {
            bool2 = p1Var.incentivized;
        } else {
            bool2 = bool;
        }
        if ((i10 & 8) != 0) {
            list3 = p1Var.supportedTemplateTypes;
        } else {
            list3 = list;
        }
        if ((i10 & 16) != 0) {
            list4 = p1Var.supportedAdFormats;
        } else {
            list4 = list2;
        }
        if ((i10 & 32) != 0) {
            i11 = p1Var.adRefreshDuration;
        } else {
            i11 = i9;
        }
        if ((i10 & 64) != 0) {
            z9 = p1Var.headerBidding;
        } else {
            z9 = z8;
        }
        if ((i10 & 128) != 0) {
            str6 = p1Var.adSize;
        } else {
            str6 = str3;
        }
        return p1Var.copy(str4, str5, bool2, list3, list4, i11, z9, str6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (r0 != r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(c7.p1 r5, d8.b r6, c8.g r7) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.p1.write$Self(c7.p1, d8.b, c8.g):void");
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.referenceId;
    }

    public final Boolean component3() {
        return this.incentivized;
    }

    public final List<String> component4() {
        return this.supportedTemplateTypes;
    }

    public final List<String> component5() {
        return this.supportedAdFormats;
    }

    public final int component6() {
        return this.adRefreshDuration;
    }

    public final boolean component7() {
        return this.headerBidding;
    }

    public final String component8() {
        return this.adSize;
    }

    public final p1 copy(String str, String str2, Boolean bool, List<String> list, List<String> list2, int i9, boolean z8, String str3) {
        G7.j.e(str, "identifier");
        G7.j.e(str2, "referenceId");
        G7.j.e(list, "supportedTemplateTypes");
        G7.j.e(list2, "supportedAdFormats");
        return new p1(str, str2, bool, list, list2, i9, z8, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (G7.j.a(this.identifier, p1Var.identifier) && G7.j.a(this.referenceId, p1Var.referenceId) && G7.j.a(this.incentivized, p1Var.incentivized) && G7.j.a(this.supportedTemplateTypes, p1Var.supportedTemplateTypes) && G7.j.a(this.supportedAdFormats, p1Var.supportedAdFormats) && this.adRefreshDuration == p1Var.adRefreshDuration && this.headerBidding == p1Var.headerBidding && G7.j.a(this.adSize, p1Var.adSize)) {
            return true;
        }
        return false;
    }

    public final int getAdRefreshDuration() {
        return this.adRefreshDuration;
    }

    public final String getAdSize() {
        return this.adSize;
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getIncentivized() {
        return this.incentivized;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final List<String> getSupportedAdFormats() {
        return this.supportedAdFormats;
    }

    public final List<String> getSupportedTemplateTypes() {
        return this.supportedTemplateTypes;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int b = AbstractC2914a.b(this.identifier.hashCode() * 31, 31, this.referenceId);
        Boolean bool = this.incentivized;
        int i9 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode2 = (Integer.hashCode(this.adRefreshDuration) + ((this.supportedAdFormats.hashCode() + ((this.supportedTemplateTypes.hashCode() + ((b + hashCode) * 31)) * 31)) * 31)) * 31;
        boolean z8 = this.headerBidding;
        int i10 = z8;
        if (z8 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        String str = this.adSize;
        if (str != null) {
            i9 = str.hashCode();
        }
        return i11 + i9;
    }

    public final boolean isBanner() {
        if (!G7.j.a(this.placementAdType, "TYPE_BANNER") && !isMREC()) {
            return false;
        }
        return true;
    }

    public final boolean isBannerNonMREC() {
        return G7.j.a(this.placementAdType, "TYPE_BANNER");
    }

    public final boolean isDefault() {
        return G7.j.a(this.placementAdType, "TYPE_DEFAULT");
    }

    public final boolean isIncentivized() {
        return this.isIncentivized;
    }

    public final boolean isInterstitial() {
        if (isDefault() && !this.isIncentivized) {
            return true;
        }
        return false;
    }

    public final boolean isMREC() {
        return G7.j.a(this.placementAdType, "TYPE_MREC");
    }

    public final boolean isNative() {
        return G7.j.a(this.placementAdType, "TYPE_NATIVE");
    }

    public final boolean isRewardedVideo() {
        if (isDefault() && this.isIncentivized) {
            return true;
        }
        return false;
    }

    public final void setWakeupTime(Long l) {
        this.wakeupTime = l;
    }

    public final void snooze(long j7) {
        this.wakeupTime = Long.valueOf((j7 * 1000) + System.currentTimeMillis());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Placement(identifier=");
        sb.append(this.identifier);
        sb.append(", referenceId=");
        sb.append(this.referenceId);
        sb.append(", incentivized=");
        sb.append(this.incentivized);
        sb.append(", supportedTemplateTypes=");
        sb.append(this.supportedTemplateTypes);
        sb.append(", supportedAdFormats=");
        sb.append(this.supportedAdFormats);
        sb.append(", adRefreshDuration=");
        sb.append(this.adRefreshDuration);
        sb.append(", headerBidding=");
        sb.append(this.headerBidding);
        sb.append(", adSize=");
        return com.applovin.impl.L.k(sb, this.adSize, ')');
    }

    public p1(String str, String str2, Boolean bool, List<String> list, List<String> list2, int i9, boolean z8, String str3) {
        String str4;
        G7.j.e(str, "identifier");
        G7.j.e(str2, "referenceId");
        G7.j.e(list, "supportedTemplateTypes");
        G7.j.e(list2, "supportedAdFormats");
        this.identifier = str;
        this.referenceId = str2;
        this.incentivized = bool;
        this.supportedTemplateTypes = list;
        this.supportedAdFormats = list2;
        this.adRefreshDuration = i9;
        this.headerBidding = z8;
        this.adSize = str3;
        this.isIncentivized = bool != null ? bool.booleanValue() : false;
        if (list.contains("banner")) {
            str4 = "TYPE_BANNER";
        } else if (list.contains("mrec")) {
            str4 = "TYPE_MREC";
        } else if (list.contains("native")) {
            str4 = "TYPE_NATIVE";
        } else {
            str4 = "TYPE_DEFAULT";
        }
        this.placementAdType = str4;
    }

    public static /* synthetic */ void getAdRefreshDuration$annotations() {
    }

    public static /* synthetic */ void getAdSize$annotations() {
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getIdentifier$annotations() {
    }

    public static /* synthetic */ void getIncentivized$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getSupportedAdFormats$annotations() {
    }

    public static /* synthetic */ void getSupportedTemplateTypes$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ p1(java.lang.String r12, java.lang.String r13, java.lang.Boolean r14, java.util.List r15, java.util.List r16, int r17, boolean r18, java.lang.String r19, int r20, G7.f r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 4
            if (r1 == 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5 = r1
            goto Lb
        La:
            r5 = r14
        Lb:
            r1 = r0 & 8
            u7.o r2 = u7.C2824o.b
            if (r1 == 0) goto L13
            r6 = r2
            goto L14
        L13:
            r6 = r15
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            r7 = r2
            goto L1c
        L1a:
            r7 = r16
        L1c:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r1
            goto L26
        L24:
            r8 = r17
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r1 = 0
            r9 = r1
            goto L2f
        L2d:
            r9 = r18
        L2f:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L36
            r0 = 0
            r10 = r0
            goto L38
        L36:
            r10 = r19
        L38:
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.p1.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.util.List, int, boolean, java.lang.String, int, G7.f):void");
    }
}
