package bh;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes4.dex */
public final class y implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Boolean.valueOf(((c) obj2).isRequired()), Boolean.valueOf(((c) obj).isRequired()));
    }
}
