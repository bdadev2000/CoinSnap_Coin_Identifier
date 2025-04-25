package com.glority.android.membership.memo19162.utils;

import com.glority.android.core.data.LogEventArguments;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemberShipUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lcom/glority/android/membership/memo19162/utils/VipInfo;", "", "isVip", "", "isTrial", "vipLevel", "", LogEventArguments.ARG_SKU, "startAt", "Ljava/util/Date;", "expiredAt", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "()Z", "getVipLevel", "()Ljava/lang/String;", "getSku", "getStartAt", "()Ljava/util/Date;", "getExpiredAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes3.dex */
public final /* data */ class VipInfo {
    private final Date expiredAt;
    private final boolean isTrial;
    private final boolean isVip;
    private final String sku;
    private final Date startAt;
    private final String vipLevel;

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVip() {
        return this.isVip;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVipLevel() {
        return this.vipLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getStartAt() {
        return this.startAt;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getExpiredAt() {
        return this.expiredAt;
    }

    public final VipInfo copy(boolean isVip, boolean isTrial, String vipLevel, String sku, Date startAt, Date expiredAt) {
        return new VipInfo(isVip, isTrial, vipLevel, sku, startAt, expiredAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipInfo)) {
            return false;
        }
        VipInfo vipInfo = (VipInfo) other;
        return this.isVip == vipInfo.isVip && this.isTrial == vipInfo.isTrial && Intrinsics.areEqual(this.vipLevel, vipInfo.vipLevel) && Intrinsics.areEqual(this.sku, vipInfo.sku) && Intrinsics.areEqual(this.startAt, vipInfo.startAt) && Intrinsics.areEqual(this.expiredAt, vipInfo.expiredAt);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.isVip) * 31) + Boolean.hashCode(this.isTrial)) * 31;
        String str = this.vipLevel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sku;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.startAt;
        int hashCode4 = (hashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expiredAt;
        return hashCode4 + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        return "VipInfo(isVip=" + this.isVip + ", isTrial=" + this.isTrial + ", vipLevel=" + this.vipLevel + ", sku=" + this.sku + ", startAt=" + this.startAt + ", expiredAt=" + this.expiredAt + ")";
    }

    public VipInfo(boolean z, boolean z2, String str, String str2, Date date, Date date2) {
        this.isVip = z;
        this.isTrial = z2;
        this.vipLevel = str;
        this.sku = str2;
        this.startAt = date;
        this.expiredAt = date2;
    }

    public static /* synthetic */ VipInfo copy$default(VipInfo vipInfo, boolean z, boolean z2, String str, String str2, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vipInfo.isVip;
        }
        if ((i & 2) != 0) {
            z2 = vipInfo.isTrial;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = vipInfo.vipLevel;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = vipInfo.sku;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            date = vipInfo.startAt;
        }
        Date date3 = date;
        if ((i & 32) != 0) {
            date2 = vipInfo.expiredAt;
        }
        return vipInfo.copy(z, z3, str3, str4, date3, date2);
    }

    public /* synthetic */ VipInfo(boolean z, boolean z2, String str, String str2, Date date, Date date2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, str, str2, date, date2);
    }

    public final boolean isVip() {
        return this.isVip;
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public final String getVipLevel() {
        return this.vipLevel;
    }

    public final String getSku() {
        return this.sku;
    }

    public final Date getStartAt() {
        return this.startAt;
    }

    public final Date getExpiredAt() {
        return this.expiredAt;
    }
}
