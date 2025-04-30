package l8;

import G7.j;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21639a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public b f21640c;

    /* renamed from: d, reason: collision with root package name */
    public long f21641d;

    public a(String str, boolean z8) {
        j.e(str, "name");
        this.f21639a = str;
        this.b = z8;
        this.f21641d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f21639a;
    }
}
