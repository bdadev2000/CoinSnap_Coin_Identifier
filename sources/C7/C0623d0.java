package c7;

import e8.C2228c;
import e8.C2231f;
import java.util.List;

/* renamed from: c7.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0623d0 {
    public static final C0621c0 Companion = new C0621c0(null);
    private String adSize;
    private final Long adStartTime;
    private final String appId;
    private final Boolean isHeaderBidding;
    private final String placementReferenceId;
    private final List<String> placements;
    private final String user;

    public C0623d0() {
        this((List) null, (Boolean) null, (String) null, (Long) null, (String) null, (String) null, (String) null, 127, (G7.f) null);
    }

    public static /* synthetic */ C0623d0 copy$default(C0623d0 c0623d0, List list, Boolean bool, String str, Long l, String str2, String str3, String str4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            list = c0623d0.placements;
        }
        if ((i9 & 2) != 0) {
            bool = c0623d0.isHeaderBidding;
        }
        Boolean bool2 = bool;
        if ((i9 & 4) != 0) {
            str = c0623d0.adSize;
        }
        String str5 = str;
        if ((i9 & 8) != 0) {
            l = c0623d0.adStartTime;
        }
        Long l2 = l;
        if ((i9 & 16) != 0) {
            str2 = c0623d0.appId;
        }
        String str6 = str2;
        if ((i9 & 32) != 0) {
            str3 = c0623d0.placementReferenceId;
        }
        String str7 = str3;
        if ((i9 & 64) != 0) {
            str4 = c0623d0.user;
        }
        return c0623d0.copy(list, bool2, str5, l2, str6, str7, str4);
    }

    public static final void write$Self(C0623d0 c0623d0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0623d0, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0623d0.placements != null) {
            bVar.u(gVar, 0, new C2228c(e8.k0.f20172a, 0), c0623d0.placements);
        }
        if (bVar.o(gVar) || c0623d0.isHeaderBidding != null) {
            bVar.u(gVar, 1, C2231f.f20162a, c0623d0.isHeaderBidding);
        }
        if (bVar.o(gVar) || c0623d0.adSize != null) {
            bVar.u(gVar, 2, e8.k0.f20172a, c0623d0.adSize);
        }
        if (bVar.o(gVar) || c0623d0.adStartTime != null) {
            bVar.u(gVar, 3, e8.O.f20131a, c0623d0.adStartTime);
        }
        if (bVar.o(gVar) || c0623d0.appId != null) {
            bVar.u(gVar, 4, e8.k0.f20172a, c0623d0.appId);
        }
        if (bVar.o(gVar) || c0623d0.placementReferenceId != null) {
            bVar.u(gVar, 5, e8.k0.f20172a, c0623d0.placementReferenceId);
        }
        if (bVar.o(gVar) || c0623d0.user != null) {
            bVar.u(gVar, 6, e8.k0.f20172a, c0623d0.user);
        }
    }

    public final List<String> component1() {
        return this.placements;
    }

    public final Boolean component2() {
        return this.isHeaderBidding;
    }

    public final String component3() {
        return this.adSize;
    }

    public final Long component4() {
        return this.adStartTime;
    }

    public final String component5() {
        return this.appId;
    }

    public final String component6() {
        return this.placementReferenceId;
    }

    public final String component7() {
        return this.user;
    }

    public final C0623d0 copy(List<String> list, Boolean bool, String str, Long l, String str2, String str3, String str4) {
        return new C0623d0(list, bool, str, l, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0623d0)) {
            return false;
        }
        C0623d0 c0623d0 = (C0623d0) obj;
        if (G7.j.a(this.placements, c0623d0.placements) && G7.j.a(this.isHeaderBidding, c0623d0.isHeaderBidding) && G7.j.a(this.adSize, c0623d0.adSize) && G7.j.a(this.adStartTime, c0623d0.adStartTime) && G7.j.a(this.appId, c0623d0.appId) && G7.j.a(this.placementReferenceId, c0623d0.placementReferenceId) && G7.j.a(this.user, c0623d0.user)) {
            return true;
        }
        return false;
    }

    public final String getAdSize() {
        return this.adSize;
    }

    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getPlacementReferenceId() {
        return this.placementReferenceId;
    }

    public final List<String> getPlacements() {
        return this.placements;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        List<String> list = this.placements;
        int i9 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = hashCode * 31;
        Boolean bool = this.isHeaderBidding;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str = this.adSize;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Long l = this.adStartTime;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str2 = this.appId;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str3 = this.placementReferenceId;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str4 = this.user;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        return i15 + i9;
    }

    public final Boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final void setAdSize(String str) {
        this.adSize = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestParam(placements=");
        sb.append(this.placements);
        sb.append(", isHeaderBidding=");
        sb.append(this.isHeaderBidding);
        sb.append(", adSize=");
        sb.append(this.adSize);
        sb.append(", adStartTime=");
        sb.append(this.adStartTime);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", placementReferenceId=");
        sb.append(this.placementReferenceId);
        sb.append(", user=");
        return com.applovin.impl.L.k(sb, this.user, ')');
    }

    public /* synthetic */ C0623d0(int i9, List list, Boolean bool, String str, Long l, String str2, String str3, String str4, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i9 & 2) == 0) {
            this.isHeaderBidding = null;
        } else {
            this.isHeaderBidding = bool;
        }
        if ((i9 & 4) == 0) {
            this.adSize = null;
        } else {
            this.adSize = str;
        }
        if ((i9 & 8) == 0) {
            this.adStartTime = null;
        } else {
            this.adStartTime = l;
        }
        if ((i9 & 16) == 0) {
            this.appId = null;
        } else {
            this.appId = str2;
        }
        if ((i9 & 32) == 0) {
            this.placementReferenceId = null;
        } else {
            this.placementReferenceId = str3;
        }
        if ((i9 & 64) == 0) {
            this.user = null;
        } else {
            this.user = str4;
        }
    }

    public C0623d0(List<String> list, Boolean bool, String str, Long l, String str2, String str3, String str4) {
        this.placements = list;
        this.isHeaderBidding = bool;
        this.adSize = str;
        this.adStartTime = l;
        this.appId = str2;
        this.placementReferenceId = str3;
        this.user = str4;
    }

    public /* synthetic */ C0623d0(List list, Boolean bool, String str, Long l, String str2, String str3, String str4, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : list, (i9 & 2) != 0 ? null : bool, (i9 & 4) != 0 ? null : str, (i9 & 8) != 0 ? null : l, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : str3, (i9 & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ void getAdSize$annotations() {
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getPlacementReferenceId$annotations() {
    }

    public static /* synthetic */ void isHeaderBidding$annotations() {
    }
}
