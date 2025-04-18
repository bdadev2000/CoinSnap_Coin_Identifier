package wh;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f27133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27134d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Object obj, Object obj2, int i10) {
        super(0);
        this.f27132b = i10;
        this.f27133c = nVar;
        this.f27134d = obj;
        this.f27135f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List invoke() {
        int collectionSizeOrDefault;
        int i10 = this.f27132b;
        Object obj = this.f27135f;
        Object obj2 = this.f27134d;
        n nVar = this.f27133c;
        switch (i10) {
            case 0:
                com.facebook.internal.i iVar = nVar.f27145b;
                List k10 = iVar == null ? null : iVar.k((List) obj2, (String) obj);
                if (k10 == null) {
                    k10 = (List) obj2;
                }
                List list = k10;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            default:
                com.facebook.internal.i iVar2 = nVar.f27145b;
                Intrinsics.checkNotNull(iVar2);
                return iVar2.k(((y) obj2).a(), ((a) obj).f27007i.f27035d);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f27132b) {
            case 0:
                return invoke();
            default:
                return invoke();
        }
    }
}
