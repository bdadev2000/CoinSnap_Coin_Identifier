package c6;

/* loaded from: classes3.dex */
public final class n {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2669b;

    public n(String str, boolean z10) {
        this.a = str;
        this.f2669b = z10;
    }

    public final String toString() {
        String str;
        if (this.f2669b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        String str2 = this.a;
        if (str2 != null) {
            return str + '(' + ((Object) str2) + ')';
        }
        return str;
    }
}
