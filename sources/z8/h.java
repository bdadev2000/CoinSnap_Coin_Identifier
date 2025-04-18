package z8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28621b;

    /* renamed from: c, reason: collision with root package name */
    public final List f28622c;

    /* renamed from: d, reason: collision with root package name */
    public final List f28623d;

    public h(String str, long j3, ArrayList arrayList, List list) {
        this.a = str;
        this.f28621b = j3;
        this.f28622c = Collections.unmodifiableList(arrayList);
        this.f28623d = Collections.unmodifiableList(list);
    }
}
