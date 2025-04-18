package z8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28583b;

    /* renamed from: c, reason: collision with root package name */
    public final List f28584c;

    /* renamed from: d, reason: collision with root package name */
    public final List f28585d;

    /* renamed from: e, reason: collision with root package name */
    public final List f28586e;

    /* renamed from: f, reason: collision with root package name */
    public final List f28587f;

    public a(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.a = i10;
        this.f28583b = i11;
        this.f28584c = Collections.unmodifiableList(arrayList);
        this.f28585d = Collections.unmodifiableList(list);
        this.f28586e = Collections.unmodifiableList(list2);
        this.f28587f = Collections.unmodifiableList(list3);
    }
}
