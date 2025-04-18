package o0;

import java.io.File;

/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f31186b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f31187c;
    public int d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f31188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File file) {
        super(file);
        p0.a.s(file, "rootDir");
        this.f31188f = fVar;
    }

    @Override // o0.g
    public final File a() {
        boolean z2 = this.e;
        File file = this.f31195a;
        f fVar = this.f31188f;
        if (!z2 && this.f31187c == null) {
            fVar.d.getClass();
            File[] listFiles = file.listFiles();
            this.f31187c = listFiles;
            if (listFiles == null) {
                fVar.d.getClass();
                this.e = true;
            }
        }
        File[] fileArr = this.f31187c;
        if (fileArr != null) {
            int i2 = this.d;
            p0.a.p(fileArr);
            if (i2 < fileArr.length) {
                File[] fileArr2 = this.f31187c;
                p0.a.p(fileArr2);
                int i3 = this.d;
                this.d = i3 + 1;
                return fileArr2[i3];
            }
        }
        if (this.f31186b) {
            fVar.d.getClass();
            return null;
        }
        this.f31186b = true;
        return file;
    }
}
