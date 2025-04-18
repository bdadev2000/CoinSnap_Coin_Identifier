package com.plantcare.ai.identifier.plantid.domains;

import a4.j;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.plantcare.ai.identifier.plantid.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import vd.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BM\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001b¨\u0006*"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/IapDomain;", "", "", "isTypeSubYear", "", "toString", "", "hashCode", "other", "equals", "idSub", "Ljava/lang/String;", "getIdSub", "()Ljava/lang/String;", "setIdSub", "(Ljava/lang/String;)V", "subName", "getSubName", "setSubName", BidResponsed.KEY_PRICE, "getPrice", "setPrice", "numberOfScans", "I", "getNumberOfScans", "()I", "setNumberOfScans", "(I)V", "typeSub", "getTypeSub", "setTypeSub", "isShowTagBestChoice", "Z", "()Z", "setShowTagBestChoice", "(Z)V", "subNameRes", "getSubNameRes", "setSubNameRes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZI)V", "Companion", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class IapDomain {
    private String idSub;
    private boolean isShowTagBestChoice;
    private int numberOfScans;
    private String price;
    private String subName;
    private int subNameRes;
    private int typeSub;

    public IapDomain(String idSub, String subName, String price, int i10, int i11, boolean z10, int i12) {
        Intrinsics.checkNotNullParameter(idSub, "idSub");
        Intrinsics.checkNotNullParameter(subName, "subName");
        Intrinsics.checkNotNullParameter(price, "price");
        this.idSub = idSub;
        this.subName = subName;
        this.price = price;
        this.numberOfScans = i10;
        this.typeSub = i11;
        this.isShowTagBestChoice = z10;
        this.subNameRes = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IapDomain)) {
            return false;
        }
        IapDomain iapDomain = (IapDomain) other;
        return Intrinsics.areEqual(this.idSub, iapDomain.idSub) && Intrinsics.areEqual(this.subName, iapDomain.subName) && Intrinsics.areEqual(this.price, iapDomain.price) && this.numberOfScans == iapDomain.numberOfScans && this.typeSub == iapDomain.typeSub && this.isShowTagBestChoice == iapDomain.isShowTagBestChoice && this.subNameRes == iapDomain.subNameRes;
    }

    public final String getIdSub() {
        return this.idSub;
    }

    public final int getNumberOfScans() {
        return this.numberOfScans;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getSubNameRes() {
        return this.subNameRes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int e2 = a.e(this.typeSub, a.e(this.numberOfScans, e.c(this.price, e.c(this.subName, this.idSub.hashCode() * 31, 31), 31), 31), 31);
        boolean z10 = this.isShowTagBestChoice;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return Integer.hashCode(this.subNameRes) + ((e2 + i10) * 31);
    }

    /* renamed from: isShowTagBestChoice, reason: from getter */
    public final boolean getIsShowTagBestChoice() {
        return this.isShowTagBestChoice;
    }

    public final boolean isTypeSubYear() {
        return this.typeSub == 0;
    }

    public final void setPrice(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IapDomain(idSub=");
        sb2.append(this.idSub);
        sb2.append(", subName=");
        sb2.append(this.subName);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", numberOfScans=");
        sb2.append(this.numberOfScans);
        sb2.append(", typeSub=");
        sb2.append(this.typeSub);
        sb2.append(", isShowTagBestChoice=");
        sb2.append(this.isShowTagBestChoice);
        sb2.append(", subNameRes=");
        return j.i(sb2, this.subNameRes, ')');
    }

    public /* synthetic */ IapDomain(String str, String str2, String str3, int i10, int i11, boolean z10, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) == 0 ? str3 : "", (i13 & 8) != 0 ? 0 : i10, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? false : z10, (i13 & 64) != 0 ? R.string.number_scans_res : i12);
    }
}
