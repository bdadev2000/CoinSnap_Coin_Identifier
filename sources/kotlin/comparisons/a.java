package kotlin.comparisons;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparator f21038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Comparator f21039d;

    public /* synthetic */ a(Comparator comparator, Comparator comparator2, int i10) {
        this.f21037b = i10;
        this.f21038c = comparator;
        this.f21039d = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f21037b;
        Comparator comparator = this.f21039d;
        Comparator comparator2 = this.f21038c;
        switch (i10) {
            case 0:
                return ComparisonsKt__ComparisonsKt.d(comparator2, comparator, obj, obj2);
            default:
                return ComparisonsKt__ComparisonsKt.a(comparator2, comparator, obj, obj2);
        }
    }
}
