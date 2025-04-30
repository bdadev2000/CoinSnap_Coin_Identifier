package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0425a f4542a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f4543c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4544d;

    public Z(AbstractC0425a abstractC0425a, String str, Object[] objArr) {
        this.f4542a = abstractC0425a;
        this.b = str;
        this.f4543c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4544d = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i9 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f4544d = i9 | (charAt2 << i11);
                return;
            }
        }
    }

    public final AbstractC0425a a() {
        return this.f4542a;
    }

    public final Object[] b() {
        return this.f4543c;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        if ((this.f4544d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}
