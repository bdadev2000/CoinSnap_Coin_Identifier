package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import e0.u;
import java.util.ArrayList;
import java.util.List;

@Immutable
/* loaded from: classes4.dex */
public final class LinearGradient extends ShaderBrush {

    /* renamed from: c, reason: collision with root package name */
    public final List f14996c;
    public final List d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14997f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14998g;

    public LinearGradient(List list, ArrayList arrayList, long j2, long j3, int i2) {
        this.f14996c = list;
        this.d = arrayList;
        this.e = j2;
        this.f14997f = j3;
        this.f14998g = i2;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j2) {
        long j3 = this.e;
        float d = Offset.g(j3) == Float.POSITIVE_INFINITY ? Size.d(j2) : Offset.g(j3);
        float b2 = Offset.h(j3) == Float.POSITIVE_INFINITY ? Size.b(j2) : Offset.h(j3);
        long j4 = this.f14997f;
        float d2 = Offset.g(j4) == Float.POSITIVE_INFINITY ? Size.d(j2) : Offset.g(j4);
        float b3 = Offset.h(j4) == Float.POSITIVE_INFINITY ? Size.b(j2) : Offset.h(j4);
        long a2 = OffsetKt.a(d, b2);
        long a3 = OffsetKt.a(d2, b3);
        List list = this.f14996c;
        List list2 = this.d;
        AndroidShader_androidKt.a(list, list2);
        float g2 = Offset.g(a2);
        float h2 = Offset.h(a2);
        float g3 = Offset.g(a3);
        float h3 = Offset.h(a3);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.j(((Color) list.get(i2)).f14964a);
        }
        return new android.graphics.LinearGradient(g2, h2, g3, h3, iArr, list2 != null ? u.X0(list2) : null, AndroidTileMode_androidKt.a(this.f14998g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return p0.a.g(this.f14996c, linearGradient.f14996c) && p0.a.g(this.d, linearGradient.d) && Offset.d(this.e, linearGradient.e) && Offset.d(this.f14997f, linearGradient.f14997f) && TileMode.a(this.f14998g, linearGradient.f14998g);
    }

    public final int hashCode() {
        int hashCode = this.f14996c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.f14998g) + android.support.v4.media.d.d(this.f14997f, android.support.v4.media.d.d(this.e, (hashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        long j2 = this.e;
        String str2 = "";
        if (OffsetKt.b(j2)) {
            str = "start=" + ((Object) Offset.m(j2)) + ", ";
        } else {
            str = "";
        }
        long j3 = this.f14997f;
        if (OffsetKt.b(j3)) {
            str2 = "end=" + ((Object) Offset.m(j3)) + ", ";
        }
        return "LinearGradient(colors=" + this.f14996c + ", stops=" + this.d + ", " + str + str2 + "tileMode=" + ((Object) TileMode.b(this.f14998g)) + ')';
    }
}
