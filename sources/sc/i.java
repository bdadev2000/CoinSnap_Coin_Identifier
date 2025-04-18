package sc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {
    public final Boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f24964b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f24965c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f24966d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f24967e;

    public i(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.a = bool;
        this.f24964b = d10;
        this.f24965c = num;
        this.f24966d = num2;
        this.f24967e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.a, iVar.a) && Intrinsics.areEqual((Object) this.f24964b, (Object) iVar.f24964b) && Intrinsics.areEqual(this.f24965c, iVar.f24965c) && Intrinsics.areEqual(this.f24966d, iVar.f24966d) && Intrinsics.areEqual(this.f24967e, iVar.f24967e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f24964b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f24965c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24966d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f24967e;
        return hashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.a + ", sessionSamplingRate=" + this.f24964b + ", sessionRestartTimeout=" + this.f24965c + ", cacheDuration=" + this.f24966d + ", cacheUpdatedTime=" + this.f24967e + ')';
    }
}
