package dd;

import a4.j;
import androidx.core.app.NotificationCompat;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f16990g = new a(4201, 4096, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final a f16991h = new a(1033, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f16992i = new a(67, 64, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f16993j = new a(19, 16, 1);

    /* renamed from: k, reason: collision with root package name */
    public static final a f16994k = new a(285, NotificationCompat.FLAG_LOCAL_ONLY, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final a f16995l = new a(301, NotificationCompat.FLAG_LOCAL_ONLY, 1);
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16996b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16997c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16998d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16999e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17000f;

    public a(int i10, int i11, int i12) {
        this.f16999e = i10;
        this.f16998d = i11;
        this.f17000f = i12;
        this.a = new int[i11];
        this.f16996b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f16996b[this.a[i15]] = i15;
        }
        this.f16997c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    public final int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f16996b;
        return this.a[(iArr[i10] + iArr[i11]) % (this.f16998d - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f16999e));
        sb2.append(AbstractJsonLexerKt.COMMA);
        return j.i(sb2, this.f16998d, ')');
    }
}
