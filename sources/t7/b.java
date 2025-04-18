package t7;

import java.util.Arrays;
import s7.x2;
import v8.u0;
import v8.z;

/* loaded from: classes3.dex */
public final class b {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f25287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25288c;

    /* renamed from: d, reason: collision with root package name */
    public final z f25289d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25290e;

    /* renamed from: f, reason: collision with root package name */
    public final x2 f25291f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25292g;

    /* renamed from: h, reason: collision with root package name */
    public final z f25293h;

    /* renamed from: i, reason: collision with root package name */
    public final long f25294i;

    /* renamed from: j, reason: collision with root package name */
    public final long f25295j;

    public b(long j3, x2 x2Var, int i10, z zVar, long j10, x2 x2Var2, int i11, z zVar2, long j11, long j12) {
        this.a = j3;
        this.f25287b = x2Var;
        this.f25288c = i10;
        this.f25289d = zVar;
        this.f25290e = j10;
        this.f25291f = x2Var2;
        this.f25292g = i11;
        this.f25293h = zVar2;
        this.f25294i = j11;
        this.f25295j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.f25288c == bVar.f25288c && this.f25290e == bVar.f25290e && this.f25292g == bVar.f25292g && this.f25294i == bVar.f25294i && this.f25295j == bVar.f25295j && u0.t(this.f25287b, bVar.f25287b) && u0.t(this.f25289d, bVar.f25289d) && u0.t(this.f25291f, bVar.f25291f) && u0.t(this.f25293h, bVar.f25293h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.f25287b, Integer.valueOf(this.f25288c), this.f25289d, Long.valueOf(this.f25290e), this.f25291f, Integer.valueOf(this.f25292g), this.f25293h, Long.valueOf(this.f25294i), Long.valueOf(this.f25295j)});
    }
}
