package A1;

import java.util.ArrayList;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f17a;
    public final char b;

    /* renamed from: c, reason: collision with root package name */
    public final double f18c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20e;

    public d(ArrayList arrayList, char c9, double d2, String str, String str2) {
        this.f17a = arrayList;
        this.b = c9;
        this.f18c = d2;
        this.f19d = str;
        this.f20e = str2;
    }

    public static int a(char c9, String str, String str2) {
        return str2.hashCode() + AbstractC2914a.b(c9 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.b, this.f20e, this.f19d);
    }
}
