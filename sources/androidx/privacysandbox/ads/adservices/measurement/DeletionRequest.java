package androidx.privacysandbox.ads.adservices.measurement;

import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.HashSet;
import p0.a;

@RequiresApi
/* loaded from: classes2.dex */
public final class DeletionRequest {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Builder {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface DeletionMode {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface MatchBehavior {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        deletionRequest.getClass();
        HashSet hashSet = new HashSet((Collection) null);
        deletionRequest.getClass();
        if (a.g(hashSet, new HashSet((Collection) null))) {
            HashSet hashSet2 = new HashSet((Collection) null);
            deletionRequest.getClass();
            if (a.g(hashSet2, new HashSet((Collection) null))) {
                deletionRequest.getClass();
                if (a.g(null, null)) {
                    deletionRequest.getClass();
                    if (a.g(null, null)) {
                        deletionRequest.getClass();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.m("DeletionRequest { DeletionMode=", "DELETION_MODE_ALL", ", MatchBehavior=", "MATCH_BEHAVIOR_DELETE", ", Start=null, End=null, DomainUris=null, OriginUris=null }");
    }
}
