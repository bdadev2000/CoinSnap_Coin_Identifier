package F0;

import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1049a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1050c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1051d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1052e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1053f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1054g;

    public a(int i9, String str, String str2, String str3, boolean z8, int i10) {
        this.f1049a = str;
        this.b = str2;
        this.f1051d = z8;
        this.f1052e = i9;
        int i11 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i11 = 3;
            } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (!upperCase.contains("BLOB")) {
                    i11 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            } else {
                i11 = 2;
            }
        }
        this.f1050c = i11;
        this.f1053f = str3;
        this.f1054g = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1052e != aVar.f1052e || !this.f1049a.equals(aVar.f1049a) || this.f1051d != aVar.f1051d) {
            return false;
        }
        String str = this.f1053f;
        int i9 = this.f1054g;
        int i10 = aVar.f1054g;
        String str2 = aVar.f1053f;
        if (i9 == 1 && i10 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i9 == 2 && i10 == 1 && str2 != null && !str2.equals(str)) {
            return false;
        }
        if ((i9 == 0 || i9 != i10 || (str == null ? str2 == null : str.equals(str2))) && this.f1050c == aVar.f1050c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = ((this.f1049a.hashCode() * 31) + this.f1050c) * 31;
        if (this.f1051d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((hashCode + i9) * 31) + this.f1052e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f1049a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.f1050c);
        sb.append("', notNull=");
        sb.append(this.f1051d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f1052e);
        sb.append(", defaultValue='");
        return AbstractC2914a.h(sb, this.f1053f, "'}");
    }
}
