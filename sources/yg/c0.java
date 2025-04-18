package yg;

import java.math.BigDecimal;

/* loaded from: classes4.dex */
public final class c0 extends l {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i10) {
        this.a = i10;
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        String c02;
        long j3;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                return pVar.t();
            case 1:
                q qVar = (q) pVar;
                int i10 = qVar.f28254i;
                if (i10 == 0) {
                    i10 = qVar.W();
                }
                if (i10 == 5) {
                    qVar.f28254i = 0;
                    int[] iArr = qVar.f28246f;
                    int i11 = qVar.f28243b - 1;
                    iArr[i11] = iArr[i11] + 1;
                    z10 = true;
                } else if (i10 == 6) {
                    qVar.f28254i = 0;
                    int[] iArr2 = qVar.f28246f;
                    int i12 = qVar.f28243b - 1;
                    iArr2[i12] = iArr2[i12] + 1;
                } else {
                    throw new androidx.fragment.app.z("Expected a boolean but was " + vd.e.k(qVar.u()) + " at path " + qVar.z());
                }
                return Boolean.valueOf(z10);
            case 2:
                return Byte.valueOf((byte) com.bumptech.glide.d.v(pVar, "a byte", -128, 255));
            case 3:
                String t5 = pVar.t();
                if (t5.length() <= 1) {
                    return Character.valueOf(t5.charAt(0));
                }
                throw new androidx.fragment.app.z(String.format("Expected %s but was %s at path %s", "a char", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.l("\"", t5, '\"'), pVar.z()));
            case 4:
                return Double.valueOf(pVar.q());
            case 5:
                float q10 = (float) pVar.q();
                pVar.getClass();
                if (!Float.isInfinite(q10)) {
                    return Float.valueOf(q10);
                }
                throw new androidx.fragment.app.z("JSON forbids NaN and infinities: " + q10 + " at path " + pVar.z());
            case 6:
                return Integer.valueOf(pVar.r());
            case 7:
                q qVar2 = (q) pVar;
                int i13 = qVar2.f28254i;
                if (i13 == 0) {
                    i13 = qVar2.W();
                }
                if (i13 == 16) {
                    qVar2.f28254i = 0;
                    int[] iArr3 = qVar2.f28246f;
                    int i14 = qVar2.f28243b - 1;
                    iArr3[i14] = iArr3[i14] + 1;
                    j3 = qVar2.f28255j;
                } else {
                    if (i13 == 17) {
                        qVar2.f28257l = qVar2.f28253h.readUtf8(qVar2.f28256k);
                    } else if (i13 != 9 && i13 != 8) {
                        if (i13 != 11) {
                            throw new androidx.fragment.app.z("Expected a long but was " + vd.e.k(qVar2.u()) + " at path " + qVar2.z());
                        }
                    } else {
                        if (i13 == 9) {
                            c02 = qVar2.c0(q.f28248n);
                        } else {
                            c02 = qVar2.c0(q.f28247m);
                        }
                        qVar2.f28257l = c02;
                        try {
                            long parseLong = Long.parseLong(c02);
                            qVar2.f28254i = 0;
                            int[] iArr4 = qVar2.f28246f;
                            int i15 = qVar2.f28243b - 1;
                            iArr4[i15] = iArr4[i15] + 1;
                            j3 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    qVar2.f28254i = 11;
                    try {
                        j3 = new BigDecimal(qVar2.f28257l).longValueExact();
                        qVar2.f28257l = null;
                        qVar2.f28254i = 0;
                        int[] iArr5 = qVar2.f28246f;
                        int i16 = qVar2.f28243b - 1;
                        iArr5[i16] = iArr5[i16] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new androidx.fragment.app.z("Expected a long but was " + qVar2.f28257l + " at path " + qVar2.z());
                    }
                }
                return Long.valueOf(j3);
            default:
                return Short.valueOf((short) com.bumptech.glide.d.v(pVar, "a short", -32768, 32767));
        }
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        String str;
        switch (this.a) {
            case 0:
                sVar.s((String) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                r rVar = (r) sVar;
                if (!rVar.f28265g) {
                    rVar.x();
                    rVar.t();
                    if (booleanValue) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    rVar.f28259i.writeUtf8(str);
                    int[] iArr = rVar.f28264f;
                    int i10 = rVar.f28261b - 1;
                    iArr[i10] = iArr[i10] + 1;
                    return;
                }
                throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + rVar.z());
            case 2:
                sVar.r(((Byte) obj).intValue() & 255);
                return;
            case 3:
                sVar.s(((Character) obj).toString());
                return;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                r rVar2 = (r) sVar;
                rVar2.getClass();
                if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
                    if (rVar2.f28265g) {
                        rVar2.f28265g = false;
                        rVar2.k(Double.toString(doubleValue));
                        return;
                    }
                    rVar2.x();
                    rVar2.t();
                    rVar2.f28259i.writeUtf8(Double.toString(doubleValue));
                    int[] iArr2 = rVar2.f28264f;
                    int i11 = rVar2.f28261b - 1;
                    iArr2[i11] = iArr2[i11] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
            case 5:
                Float f10 = (Float) obj;
                f10.getClass();
                r rVar3 = (r) sVar;
                rVar3.getClass();
                String obj2 = f10.toString();
                rVar3.getClass();
                if (!obj2.equals("-Infinity") && !obj2.equals("Infinity") && !obj2.equals("NaN")) {
                    if (rVar3.f28265g) {
                        rVar3.f28265g = false;
                        rVar3.k(obj2);
                        return;
                    }
                    rVar3.x();
                    rVar3.t();
                    rVar3.f28259i.writeUtf8(obj2);
                    int[] iArr3 = rVar3.f28264f;
                    int i12 = rVar3.f28261b - 1;
                    iArr3[i12] = iArr3[i12] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + f10);
            case 6:
                sVar.r(((Integer) obj).intValue());
                return;
            case 7:
                sVar.r(((Long) obj).longValue());
                return;
            default:
                sVar.r(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
