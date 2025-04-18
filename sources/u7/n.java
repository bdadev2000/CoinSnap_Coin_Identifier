package u7;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f25592e = new n(-1, -1, -1);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25594c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25595d;

    public n(int i10, int i11, int i12) {
        int i13;
        this.a = i10;
        this.f25593b = i11;
        this.f25594c = i12;
        if (n9.h0.F(i12)) {
            i13 = n9.h0.t(i12, i11);
        } else {
            i13 = -1;
        }
        this.f25595d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a && this.f25593b == nVar.f25593b && this.f25594c == nVar.f25594c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.f25593b), Integer.valueOf(this.f25594c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.a);
        sb2.append(", channelCount=");
        sb2.append(this.f25593b);
        sb2.append(", encoding=");
        return a4.j.i(sb2, this.f25594c, AbstractJsonLexerKt.END_LIST);
    }
}
