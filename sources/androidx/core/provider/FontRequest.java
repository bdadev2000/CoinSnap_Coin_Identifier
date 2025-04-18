package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* loaded from: classes2.dex */
public final class FontRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f18625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18626b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18627c;
    public final List d;
    public final String e;

    public FontRequest(String str, String str2, String str3, List list) {
        str.getClass();
        this.f18625a = str;
        str2.getClass();
        this.f18626b = str2;
        this.f18627c = str3;
        list.getClass();
        this.d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f18625a + ", mProviderPackage: " + this.f18626b + ", mQuery: " + this.f18627c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
