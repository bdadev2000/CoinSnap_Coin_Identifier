package com.glority.android.picturexx.extensions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionCountrySummaryListExt.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "summaries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCountryCode", "()Ljava/lang/String;", "getSummaries", "()Ljava/util/List;", "count", "", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class CollectionCountrySummaryWrapper {
    public static final int $stable = 8;
    private final String countryCode;
    private final List<CollectionCountrySummary> summaries;

    /* renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<CollectionCountrySummary> component2() {
        return this.summaries;
    }

    public final CollectionCountrySummaryWrapper copy(String countryCode, List<CollectionCountrySummary> summaries) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(summaries, "summaries");
        return new CollectionCountrySummaryWrapper(countryCode, summaries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionCountrySummaryWrapper)) {
            return false;
        }
        CollectionCountrySummaryWrapper collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) other;
        return Intrinsics.areEqual(this.countryCode, collectionCountrySummaryWrapper.countryCode) && Intrinsics.areEqual(this.summaries, collectionCountrySummaryWrapper.summaries);
    }

    public int hashCode() {
        return (this.countryCode.hashCode() * 31) + this.summaries.hashCode();
    }

    public String toString() {
        return "CollectionCountrySummaryWrapper(countryCode=" + this.countryCode + ", summaries=" + this.summaries + ")";
    }

    public CollectionCountrySummaryWrapper(String countryCode, List<CollectionCountrySummary> summaries) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(summaries, "summaries");
        this.countryCode = countryCode;
        this.summaries = summaries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectionCountrySummaryWrapper copy$default(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collectionCountrySummaryWrapper.countryCode;
        }
        if ((i & 2) != 0) {
            list = collectionCountrySummaryWrapper.summaries;
        }
        return collectionCountrySummaryWrapper.copy(str, list);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<CollectionCountrySummary> getSummaries() {
        return this.summaries;
    }

    public final int getCount() {
        Iterator<T> it = this.summaries.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((CollectionCountrySummary) it.next()).getTotalCount();
        }
        return i;
    }
}
