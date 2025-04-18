package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class j1 implements y0 {
    public final b a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1380b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1381c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1382d;

    public j1(e0 e0Var, String str, Object[] objArr) {
        this.a = e0Var;
        this.f1380b = str;
        this.f1381c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f1382d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.f1382d = i10 | (charAt2 << i12);
                return;
            }
        }
    }

    public final b a() {
        return this.a;
    }

    public final Object[] b() {
        return this.f1381c;
    }

    public final String c() {
        return this.f1380b;
    }

    public final int d() {
        return (this.f1382d & 1) == 1 ? 1 : 2;
    }
}
