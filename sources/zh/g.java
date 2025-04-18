package zh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import ki.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f28787b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28788c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f28789d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28790e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28791f;

    /* renamed from: g, reason: collision with root package name */
    public h3.a f28792g;

    /* renamed from: h, reason: collision with root package name */
    public int f28793h;

    /* renamed from: i, reason: collision with root package name */
    public long f28794i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f28795j;

    public g(j this$0, String key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f28795j = this$0;
        this.a = key;
        this.f28787b = new long[this$0.f28808f];
        this.f28788c = new ArrayList();
        this.f28789d = new ArrayList();
        StringBuilder sb2 = new StringBuilder(key);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < this$0.f28808f; i10++) {
            sb2.append(i10);
            this.f28788c.add(new File(this.f28795j.f28806c, sb2.toString()));
            sb2.append(".tmp");
            this.f28789d.add(new File(this.f28795j.f28806c, sb2.toString()));
            sb2.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [zh.f] */
    public final h a() {
        byte[] bArr = xh.b.a;
        if (!this.f28790e) {
            return null;
        }
        j jVar = this.f28795j;
        if (!jVar.f28818p && (this.f28792g != null || this.f28791f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f28787b.clone();
        try {
            int i10 = jVar.f28808f;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                fi.b bVar = jVar.f28805b;
                File file = (File) this.f28788c.get(i11);
                ((fi.a) bVar).getClass();
                Intrinsics.checkNotNullParameter(file, "file");
                ki.d M = a6.k.M(file);
                if (!jVar.f28818p) {
                    this.f28793h++;
                    M = new f(M, jVar, this);
                }
                arrayList.add(M);
                i11 = i12;
            }
            return new h(this.f28795j, this.a, this.f28794i, arrayList, jArr);
        } catch (FileNotFoundException unused) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xh.b.c((k0) it.next());
            }
            try {
                jVar.w(this);
            } catch (IOException unused2) {
            }
            return null;
        }
    }
}
