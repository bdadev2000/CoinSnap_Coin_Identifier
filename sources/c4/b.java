package c4;

import java.io.File;

/* loaded from: classes.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2582b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f2583c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f2584d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2585e;

    /* renamed from: f, reason: collision with root package name */
    public h3.a f2586f;

    /* renamed from: g, reason: collision with root package name */
    public long f2587g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f2588h;

    public b(d dVar, String str) {
        this.f2588h = dVar;
        this.a = str;
        int i10 = dVar.f2600i;
        this.f2582b = new long[i10];
        this.f2583c = new File[i10];
        this.f2584d = new File[i10];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < dVar.f2600i; i11++) {
            sb2.append(i11);
            File[] fileArr = this.f2583c;
            String sb3 = sb2.toString();
            File file = dVar.f2594b;
            fileArr[i11] = new File(file, sb3);
            sb2.append(".tmp");
            this.f2584d[i11] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j3 : this.f2582b) {
            sb2.append(' ');
            sb2.append(j3);
        }
        return sb2.toString();
    }
}
