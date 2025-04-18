package a5;

import mb.e0;

/* loaded from: classes.dex */
public final class j {
    public final /* synthetic */ int a = 3;

    /* renamed from: b, reason: collision with root package name */
    public String f198b;

    /* renamed from: c, reason: collision with root package name */
    public String f199c;

    /* renamed from: d, reason: collision with root package name */
    public String f200d;

    public j(Object obj) {
    }

    public final e0 a() {
        String str;
        String str2;
        String str3 = this.f198b;
        if (str3 != null && (str = this.f199c) != null && (str2 = this.f200d) != null) {
            return new e0(str3, str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f198b == null) {
            sb2.append(" arch");
        }
        if (this.f199c == null) {
            sb2.append(" libraryName");
        }
        if (this.f200d == null) {
            sb2.append(" buildId");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("RequestLine{method='");
                sb2.append(this.f198b);
                sb2.append("', path='");
                sb2.append(this.f199c);
                sb2.append("', version='");
                return vd.e.h(sb2, this.f200d, "'}");
            default:
                return super.toString();
        }
    }

    public j(String str, String str2, String str3) {
        this.f198b = str;
        this.f199c = str2;
        this.f200d = str3;
    }
}
