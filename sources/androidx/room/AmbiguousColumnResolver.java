package androidx.room;

import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;
import e0.w;
import java.util.List;

@RestrictTo
/* loaded from: classes3.dex */
public final class AmbiguousColumnResolver {

    /* loaded from: classes3.dex */
    public static final class Match {
    }

    /* loaded from: classes3.dex */
    public static final class ResultColumn {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ((ResultColumn) obj).getClass();
            return p0.a.g(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ResultColumn(name=null, index=0)";
        }
    }

    /* loaded from: classes3.dex */
    public static final class Solution implements Comparable<Solution> {
        public static final /* synthetic */ int d = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List f21179a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21180b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21181c;

        /* loaded from: classes3.dex */
        public static final class Companion {
        }

        static {
            new Solution(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, w.f30218a);
        }

        public Solution(int i2, int i3, List list) {
            p0.a.s(list, "matches");
            this.f21179a = list;
            this.f21180b = i2;
            this.f21181c = i3;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Solution solution) {
            Solution solution2 = solution;
            p0.a.s(solution2, "other");
            int E = p0.a.E(this.f21181c, solution2.f21181c);
            return E != 0 ? E : p0.a.E(this.f21180b, solution2.f21180b);
        }
    }
}
