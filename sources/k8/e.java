package k8;

import G7.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import w8.A;
import w8.C2912b;
import w8.p;
import w8.y;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f21503a;
    public final long[] b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21504c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21505d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21506e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21507f;

    /* renamed from: g, reason: collision with root package name */
    public H0.b f21508g;

    /* renamed from: h, reason: collision with root package name */
    public int f21509h;

    /* renamed from: i, reason: collision with root package name */
    public long f21510i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f21511j;

    public e(h hVar, String str) {
        j.e(hVar, "this$0");
        j.e(str, "key");
        this.f21511j = hVar;
        this.f21503a = str;
        this.b = new long[2];
        this.f21504c = new ArrayList();
        this.f21505d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i9 = 0; i9 < 2; i9++) {
            sb.append(i9);
            this.f21504c.add(new File(this.f21511j.f21522c, sb.toString()));
            sb.append(".tmp");
            this.f21505d.add(new File(this.f21511j.f21522c, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [k8.d] */
    public final f a() {
        byte[] bArr = j8.b.f21214a;
        if (!this.f21506e) {
            return null;
        }
        h hVar = this.f21511j;
        if (!hVar.f21530n && (this.f21508g != null || this.f21507f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        int i9 = 0;
        while (i9 < 2) {
            int i10 = i9 + 1;
            try {
                q8.a aVar = hVar.b;
                File file = (File) this.f21504c.get(i9);
                aVar.getClass();
                j.e(file, "file");
                Logger logger = p.f24030a;
                C2912b c2912b = new C2912b(new FileInputStream(file), A.f23999d);
                if (!hVar.f21530n) {
                    this.f21509h++;
                    c2912b = new d(c2912b, hVar, this);
                }
                arrayList.add(c2912b);
                i9 = i10;
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j8.b.c((y) it.next());
                }
                try {
                    hVar.p(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
        return new f(this.f21511j, this.f21503a, this.f21510i, arrayList, jArr);
    }
}
