package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class i1 implements s7.i {

    /* renamed from: h, reason: collision with root package name */
    public static final String f26160h = n9.h0.E(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f26161i = n9.h0.E(1);

    /* renamed from: j, reason: collision with root package name */
    public static final nb.a f26162j = new nb.a(29);

    /* renamed from: b, reason: collision with root package name */
    public final int f26163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26164c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26165d;

    /* renamed from: f, reason: collision with root package name */
    public final s7.r0[] f26166f;

    /* renamed from: g, reason: collision with root package name */
    public int f26167g;

    public i1(String str, s7.r0... r0VarArr) {
        boolean z10;
        if (r0VarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.f26164c = str;
        this.f26166f = r0VarArr;
        this.f26163b = r0VarArr.length;
        int h10 = n9.q.h(r0VarArr[0].f24723n);
        this.f26165d = h10 == -1 ? n9.q.h(r0VarArr[0].f24722m) : h10;
        String str2 = r0VarArr[0].f24714d;
        str2 = (str2 == null || str2.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str2;
        int i10 = r0VarArr[0].f24716g | JsonLexerKt.BATCH_SIZE;
        for (int i11 = 1; i11 < r0VarArr.length; i11++) {
            String str3 = r0VarArr[i11].f24714d;
            if (!str2.equals((str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3)) {
                a("languages", r0VarArr[0].f24714d, r0VarArr[i11].f24714d, i11);
                return;
            } else {
                if (i10 != (r0VarArr[i11].f24716g | JsonLexerKt.BATCH_SIZE)) {
                    a("role flags", Integer.toBinaryString(r0VarArr[0].f24716g), Integer.toBinaryString(r0VarArr[i11].f24716g), i11);
                    return;
                }
            }
        }
    }

    public static void a(String str, String str2, String str3, int i10) {
        StringBuilder p10 = a4.j.p("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        p10.append(str3);
        p10.append("' (track ");
        p10.append(i10);
        p10.append(")");
        n9.o.d("TrackGroup", "", new IllegalStateException(p10.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f26164c.equals(i1Var.f26164c) && Arrays.equals(this.f26166f, i1Var.f26166f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26167g == 0) {
            this.f26167g = vd.e.c(this.f26164c, 527, 31) + Arrays.hashCode(this.f26166f);
        }
        return this.f26167g;
    }
}
