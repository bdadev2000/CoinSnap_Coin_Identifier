package L1;

import java.io.File;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1687a;
    public final long[] b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f1688c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f1689d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1690e;

    /* renamed from: f, reason: collision with root package name */
    public H0.b f1691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f1692g;

    public b(c cVar, String str) {
        this.f1692g = cVar;
        this.f1687a = str;
        int i9 = cVar.f1698i;
        this.b = new long[i9];
        this.f1688c = new File[i9];
        this.f1689d = new File[i9];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i10 = 0; i10 < cVar.f1698i; i10++) {
            sb.append(i10);
            File[] fileArr = this.f1688c;
            String sb2 = sb.toString();
            File file = cVar.b;
            fileArr[i10] = new File(file, sb2);
            sb.append(".tmp");
            this.f1689d[i10] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j7 : this.b) {
            sb.append(' ');
            sb.append(j7);
        }
        return sb.toString();
    }
}
