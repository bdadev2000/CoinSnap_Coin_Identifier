package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p0.a;

/* loaded from: classes.dex */
public final class GetTopicsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f20864a;

    public GetTopicsResponse(List list) {
        a.s(list, "topics");
        this.f20864a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        List list = this.f20864a;
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (list.size() != getTopicsResponse.f20864a.size()) {
            return false;
        }
        return a.g(new HashSet(list), new HashSet(getTopicsResponse.f20864a));
    }

    public final int hashCode() {
        return Objects.hash(this.f20864a);
    }

    public final String toString() {
        return "Topics=" + this.f20864a;
    }
}
