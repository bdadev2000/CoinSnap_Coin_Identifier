package r3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final char f23986b;

    /* renamed from: c, reason: collision with root package name */
    public final double f23987c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23988d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23989e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.a = arrayList;
        this.f23986b = c10;
        this.f23987c = d10;
        this.f23988d = str;
        this.f23989e = str2;
    }

    public final int hashCode() {
        return this.f23988d.hashCode() + vd.e.c(this.f23989e, this.f23986b * 31, 31);
    }
}
