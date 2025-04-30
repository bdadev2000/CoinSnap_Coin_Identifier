package E5;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f1030g = new a(4201, 4096, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final a f1031h = new a(1033, 1024, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f1032i = new a(67, 64, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f1033j = new a(19, 16, 1);

    /* renamed from: k, reason: collision with root package name */
    public static final a f1034k = new a(285, NotificationCompat.FLAG_LOCAL_ONLY, 0);
    public static final a l = new a(301, NotificationCompat.FLAG_LOCAL_ONLY, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1035a;
    public final int[] b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1036c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1037d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1038e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1039f;

    public a(int i9, int i10, int i11) {
        this.f1038e = i9;
        this.f1037d = i10;
        this.f1039f = i11;
        this.f1035a = new int[i10];
        this.b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f1035a[i13] = i12;
            i12 <<= 1;
            if (i12 >= i10) {
                i12 = (i12 ^ i9) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.b[this.f1035a[i14]] = i14;
        }
        this.f1036c = new b(this, new int[]{0});
    }

    public final int a(int i9, int i10) {
        if (i9 != 0 && i10 != 0) {
            int[] iArr = this.b;
            return this.f1035a[(iArr[i9] + iArr[i10]) % (this.f1037d - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f1038e));
        sb.append(',');
        return o.l(sb, this.f1037d, ')');
    }
}
