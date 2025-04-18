package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21041c;

    public /* synthetic */ b(Object obj, int i10) {
        this.f21040b = i10;
        this.f21041c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
        int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
        int i10 = this.f21040b;
        Object obj3 = this.f21041c;
        switch (i10) {
            case 0:
                nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
                return nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
            case 1:
                nullsLast$lambda$4$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt((Comparator) obj3, obj, obj2);
                return nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
            default:
                compareBy$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((Function1[]) obj3, obj, obj2);
                return compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        }
    }
}
