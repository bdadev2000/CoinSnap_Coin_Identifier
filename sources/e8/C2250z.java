package e8;

import androidx.fragment.app.C0477n;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import t7.AbstractC2712a;
import t7.C2724m;
import u7.AbstractC2815f;

/* renamed from: e8.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2250z implements a8.b {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f20207a;
    public final C2724m b;

    public C2250z(String str, Enum[] enumArr) {
        this.f20207a = enumArr;
        this.b = AbstractC2712a.d(new C0477n(1, this, str));
    }

    @Override // a8.b
    public final Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        int t9 = cVar.t(getDescriptor());
        Enum[] enumArr = this.f20207a;
        if (t9 >= 0 && t9 < enumArr.length) {
            return enumArr[t9];
        }
        throw new IllegalArgumentException(t9 + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        return (c8.g) this.b.getValue();
    }

    @Override // a8.b
    public final void serialize(d8.d dVar, Object obj) {
        Enum r52 = (Enum) obj;
        G7.j.e(dVar, "encoder");
        G7.j.e(r52, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Enum[] enumArr = this.f20207a;
        int A8 = AbstractC2815f.A(enumArr, r52);
        if (A8 != -1) {
            dVar.D(getDescriptor(), A8);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r52);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(enumArr);
        G7.j.d(arrays, "toString(this)");
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
