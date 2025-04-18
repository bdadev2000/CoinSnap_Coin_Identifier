package u7;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25528c;

    public /* synthetic */ a(int i10, int i11, String str) {
        this.f25527b = i10;
        this.f25528c = i11;
        this.a = str;
    }

    public static a a(n9.x xVar) {
        String str;
        xVar.H(2);
        int v10 = xVar.v();
        int i10 = v10 >> 1;
        int v11 = ((xVar.v() >> 3) & 31) | ((v10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i10);
        if (v11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(v11);
        return new a(i10, v11, sb2.toString());
    }

    public a(String str, int i10, int i11) {
        this.a = str;
        this.f25527b = i10;
        this.f25528c = i11;
    }
}
