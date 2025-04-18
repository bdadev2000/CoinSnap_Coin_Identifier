package androidx.webkit;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class UserAgentMetadata {

    /* loaded from: classes2.dex */
    public static final class BrandVersion {

        /* loaded from: classes2.dex */
        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandVersion)) {
                return false;
            }
            ((BrandVersion) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Objects.hash(null, null, null);
        }

        public final String toString() {
            return "null,null,null";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAgentMetadata)) {
            return false;
        }
        ((UserAgentMetadata) obj).getClass();
        return true;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(null, null, null, null, null, null, bool, 0, bool);
    }
}
