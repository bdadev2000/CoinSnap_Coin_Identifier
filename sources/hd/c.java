package hd;

import androidx.recyclerview.widget.s0;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c[] f19022d = a();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final s0[] f19023b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19024c;

    public c(int i10, s0... s0VarArr) {
        this.a = i10;
        this.f19023b = s0VarArr;
        s0 s0Var = s0VarArr[0];
        int i11 = s0Var.f2031b;
        int i12 = 0;
        for (ef.b bVar : (ef.b[]) s0Var.f2032c) {
            i12 += (bVar.f17350b + i11) * bVar.a;
        }
        this.f19024c = i12;
    }

    public static c[] a() {
        int i10 = 4;
        int i11 = 1;
        ef.b[] bVarArr = {new ef.b(i11, 19)};
        int i12 = 16;
        ef.b[] bVarArr2 = {new ef.b(i11, i12)};
        int i13 = 10;
        int i14 = 13;
        int i15 = 2;
        int i16 = 17;
        int i17 = 3;
        s0[] s0VarArr = {new s0(7, bVarArr), new s0(i13, bVarArr2), new s0(i14, new ef.b[]{new ef.b(i11, i14)}), new s0(i16, new ef.b[]{new ef.b(i11, 9)})};
        int i18 = 28;
        int i19 = 22;
        s0[] s0VarArr2 = {new s0(i13, new ef.b[]{new ef.b(i11, 34)}), new s0(i12, new ef.b[]{new ef.b(i11, i18)}), new s0(i19, new ef.b[]{new ef.b(i11, i19)}), new s0(i18, new ef.b[]{new ef.b(i11, i12)})};
        int i20 = 26;
        int i21 = 18;
        s0[] s0VarArr3 = {new s0(15, new ef.b[]{new ef.b(i11, 55)}), new s0(i20, new ef.b[]{new ef.b(i11, 44)}), new s0(i21, new ef.b[]{new ef.b(i15, i16)}), new s0(i19, new ef.b[]{new ef.b(i15, i14)})};
        int i22 = 24;
        s0[] s0VarArr4 = {new s0(20, new ef.b[]{new ef.b(i11, 80)}), new s0(i21, new ef.b[]{new ef.b(i15, 32)}), new s0(i20, new ef.b[]{new ef.b(i15, i22)}), new s0(i12, new ef.b[]{new ef.b(i10, 9)})};
        s0[] s0VarArr5 = {new s0(i20, new ef.b[]{new ef.b(i11, 108)}), new s0(i22, new ef.b[]{new ef.b(i15, 43)}), new s0(i21, new ef.b[]{new ef.b(i15, 15), new ef.b(i15, i12)}), new s0(22, new ef.b[]{new ef.b(i15, 11), new ef.b(i15, 12)})};
        s0[] s0VarArr6 = {new s0(i21, new ef.b[]{new ef.b(i15, 68)}), new s0(i12, new ef.b[]{new ef.b(i10, 27)}), new s0(i22, new ef.b[]{new ef.b(i10, 19)}), new s0(28, new ef.b[]{new ef.b(i10, 15)})};
        int i23 = 14;
        s0[] s0VarArr7 = {new s0(20, new ef.b[]{new ef.b(i15, 78)}), new s0(i21, new ef.b[]{new ef.b(i10, 31)}), new s0(i21, new ef.b[]{new ef.b(i15, i23), new ef.b(i10, 15)}), new s0(26, new ef.b[]{new ef.b(i10, 13), new ef.b(i11, i23)})};
        int i24 = 22;
        s0[] s0VarArr8 = {new s0(i22, new ef.b[]{new ef.b(i15, 97)}), new s0(i24, new ef.b[]{new ef.b(i15, 38), new ef.b(i15, 39)}), new s0(i24, new ef.b[]{new ef.b(i10, i21), new ef.b(i15, 19)}), new s0(26, new ef.b[]{new ef.b(i10, i23), new ef.b(i15, 15)})};
        int i25 = 30;
        s0[] s0VarArr9 = {new s0(i25, new ef.b[]{new ef.b(i15, 116)}), new s0(22, new ef.b[]{new ef.b(i17, 36), new ef.b(i15, 37)}), new s0(20, new ef.b[]{new ef.b(i10, 16), new ef.b(i10, 17)}), new s0(i22, new ef.b[]{new ef.b(i10, 12), new ef.b(i10, 13)})};
        int i26 = 6;
        s0[] s0VarArr10 = {new s0(i21, new ef.b[]{new ef.b(i15, 68), new ef.b(i15, 69)}), new s0(26, new ef.b[]{new ef.b(i10, 43), new ef.b(i11, 44)}), new s0(i22, new ef.b[]{new ef.b(i26, 19), new ef.b(i15, 20)}), new s0(28, new ef.b[]{new ef.b(i26, 15), new ef.b(i15, 16)})};
        s0[] s0VarArr11 = {new s0(20, new ef.b[]{new ef.b(i10, 81)}), new s0(i25, new ef.b[]{new ef.b(i11, 50), new ef.b(i10, 51)}), new s0(28, new ef.b[]{new ef.b(i10, 22), new ef.b(i10, 23)}), new s0(i22, new ef.b[]{new ef.b(i17, 12), new ef.b(8, 13)})};
        s0[] s0VarArr12 = {new s0(i22, new ef.b[]{new ef.b(i15, 92), new ef.b(i15, 93)}), new s0(22, new ef.b[]{new ef.b(6, 36), new ef.b(i15, 37)}), new s0(26, new ef.b[]{new ef.b(i10, 20), new ef.b(6, 21)}), new s0(28, new ef.b[]{new ef.b(7, i23), new ef.b(i10, 15)})};
        int i27 = 12;
        s0[] s0VarArr13 = {new s0(26, new ef.b[]{new ef.b(i10, 107)}), new s0(22, new ef.b[]{new ef.b(8, 37), new ef.b(i11, 38)}), new s0(i22, new ef.b[]{new ef.b(8, 20), new ef.b(i10, 21)}), new s0(22, new ef.b[]{new ef.b(i27, 11), new ef.b(i10, i27)})};
        int i28 = 5;
        int i29 = 11;
        s0[] s0VarArr14 = {new s0(i25, new ef.b[]{new ef.b(i17, 115), new ef.b(i11, 116)}), new s0(i22, new ef.b[]{new ef.b(i10, 40), new ef.b(i28, 41)}), new s0(20, new ef.b[]{new ef.b(i29, 16), new ef.b(i28, 17)}), new s0(i22, new ef.b[]{new ef.b(i29, 12), new ef.b(i28, 13)})};
        ef.b[] bVarArr3 = {new ef.b(5, 87), new ef.b(i11, 88)};
        int i30 = 5;
        ef.b[] bVarArr4 = {new ef.b(i30, 41), new ef.b(i30, 42)};
        int i31 = 7;
        s0[] s0VarArr15 = {new s0(22, bVarArr3), new s0(i22, bVarArr4), new s0(30, new ef.b[]{new ef.b(i30, i22), new ef.b(i31, 25)}), new s0(i22, new ef.b[]{new ef.b(11, 12), new ef.b(i31, 13)})};
        int i32 = 46;
        int i33 = 15;
        s0[] s0VarArr16 = {new s0(i22, new ef.b[]{new ef.b(5, 98), new ef.b(i11, 99)}), new s0(28, new ef.b[]{new ef.b(7, 45), new ef.b(i17, i32)}), new s0(i22, new ef.b[]{new ef.b(i33, 19), new ef.b(i15, 20)}), new s0(30, new ef.b[]{new ef.b(i17, i33), new ef.b(13, 16)})};
        int i34 = 28;
        int i35 = 15;
        s0[] s0VarArr17 = {new s0(i34, new ef.b[]{new ef.b(i11, 107), new ef.b(5, 108)}), new s0(i34, new ef.b[]{new ef.b(10, i32), new ef.b(i11, 47)}), new s0(i34, new ef.b[]{new ef.b(i11, 22), new ef.b(i35, 23)}), new s0(i34, new ef.b[]{new ef.b(i15, i23), new ef.b(17, i35)})};
        int i36 = 28;
        s0[] s0VarArr18 = {new s0(30, new ef.b[]{new ef.b(5, 120), new ef.b(i11, 121)}), new s0(26, new ef.b[]{new ef.b(9, 43), new ef.b(i10, 44)}), new s0(i36, new ef.b[]{new ef.b(17, 22), new ef.b(i11, 23)}), new s0(i36, new ef.b[]{new ef.b(i15, i23), new ef.b(19, 15)})};
        int i37 = 26;
        s0[] s0VarArr19 = {new s0(28, new ef.b[]{new ef.b(i17, 113), new ef.b(i10, 114)}), new s0(i37, new ef.b[]{new ef.b(i17, 44), new ef.b(11, 45)}), new s0(i37, new ef.b[]{new ef.b(17, 21), new ef.b(i10, 22)}), new s0(i37, new ef.b[]{new ef.b(9, 13), new ef.b(16, i23)})};
        int i38 = 15;
        s0[] s0VarArr20 = {new s0(28, new ef.b[]{new ef.b(i17, 107), new ef.b(5, 108)}), new s0(26, new ef.b[]{new ef.b(i17, 41), new ef.b(13, 42)}), new s0(30, new ef.b[]{new ef.b(i38, 24), new ef.b(5, 25)}), new s0(28, new ef.b[]{new ef.b(i38, i38), new ef.b(10, 16)})};
        int i39 = 17;
        int i40 = 6;
        s0[] s0VarArr21 = {new s0(28, new ef.b[]{new ef.b(i10, 116), new ef.b(i10, 117)}), new s0(26, new ef.b[]{new ef.b(i39, 42)}), new s0(28, new ef.b[]{new ef.b(i39, 22), new ef.b(i40, 23)}), new s0(30, new ef.b[]{new ef.b(19, 16), new ef.b(i40, 17)})};
        int i41 = 28;
        s0[] s0VarArr22 = {new s0(i41, new ef.b[]{new ef.b(i15, 111), new ef.b(7, 112)}), new s0(i41, new ef.b[]{new ef.b(17, i32)}), new s0(30, new ef.b[]{new ef.b(7, 24), new ef.b(16, 25)}), new s0(24, new ef.b[]{new ef.b(34, 13)})};
        int i42 = 30;
        int i43 = 16;
        s0[] s0VarArr23 = {new s0(30, new ef.b[]{new ef.b(i10, 121), new ef.b(5, 122)}), new s0(28, new ef.b[]{new ef.b(i10, 47), new ef.b(i23, 48)}), new s0(i42, new ef.b[]{new ef.b(11, 24), new ef.b(i23, 25)}), new s0(i42, new ef.b[]{new ef.b(i43, 15), new ef.b(i23, i43)})};
        int i44 = 16;
        int i45 = 30;
        s0[] s0VarArr24 = {new s0(30, new ef.b[]{new ef.b(6, 117), new ef.b(i10, 118)}), new s0(28, new ef.b[]{new ef.b(6, 45), new ef.b(i23, i32)}), new s0(i45, new ef.b[]{new ef.b(11, 24), new ef.b(i44, 25)}), new s0(i45, new ef.b[]{new ef.b(i45, i44), new ef.b(i15, 17)})};
        int i46 = 22;
        int i47 = 30;
        s0[] s0VarArr25 = {new s0(26, new ef.b[]{new ef.b(8, 106), new ef.b(i10, 107)}), new s0(28, new ef.b[]{new ef.b(8, 47), new ef.b(13, 48)}), new s0(i47, new ef.b[]{new ef.b(7, 24), new ef.b(i46, 25)}), new s0(i47, new ef.b[]{new ef.b(i46, 15), new ef.b(13, 16)})};
        int i48 = 28;
        s0[] s0VarArr26 = {new s0(i48, new ef.b[]{new ef.b(10, 114), new ef.b(i15, 115)}), new s0(i48, new ef.b[]{new ef.b(19, i32), new ef.b(i10, 47)}), new s0(i48, new ef.b[]{new ef.b(i48, 22), new ef.b(6, 23)}), new s0(30, new ef.b[]{new ef.b(33, 16), new ef.b(i10, 17)})};
        int i49 = 30;
        s0[] s0VarArr27 = {new s0(30, new ef.b[]{new ef.b(8, 122), new ef.b(i10, 123)}), new s0(28, new ef.b[]{new ef.b(22, 45), new ef.b(i17, i32)}), new s0(i49, new ef.b[]{new ef.b(8, 23), new ef.b(26, 24)}), new s0(i49, new ef.b[]{new ef.b(12, 15), new ef.b(28, 16)})};
        int i50 = 30;
        s0[] s0VarArr28 = {new s0(30, new ef.b[]{new ef.b(i17, 117), new ef.b(10, 118)}), new s0(28, new ef.b[]{new ef.b(i17, 45), new ef.b(23, i32)}), new s0(i50, new ef.b[]{new ef.b(i10, 24), new ef.b(31, 25)}), new s0(i50, new ef.b[]{new ef.b(11, 15), new ef.b(31, 16)})};
        int i51 = 7;
        int i52 = 30;
        s0[] s0VarArr29 = {new s0(30, new ef.b[]{new ef.b(i51, 116), new ef.b(i51, 117)}), new s0(28, new ef.b[]{new ef.b(21, 45), new ef.b(7, i32)}), new s0(i52, new ef.b[]{new ef.b(i11, 23), new ef.b(37, 24)}), new s0(i52, new ef.b[]{new ef.b(19, 15), new ef.b(26, 16)})};
        int i53 = 10;
        ef.b[] bVarArr5 = {new ef.b(5, 115), new ef.b(i53, 116)};
        ef.b[] bVarArr6 = {new ef.b(19, 47), new ef.b(i53, 48)};
        int i54 = 15;
        int i55 = 25;
        int i56 = 30;
        s0[] s0VarArr30 = {new s0(30, bVarArr5), new s0(28, bVarArr6), new s0(i56, new ef.b[]{new ef.b(i54, 24), new ef.b(i55, i55)}), new s0(i56, new ef.b[]{new ef.b(23, i54), new ef.b(i55, 16)})};
        int i57 = 30;
        s0[] s0VarArr31 = {new s0(30, new ef.b[]{new ef.b(13, 115), new ef.b(i17, 116)}), new s0(28, new ef.b[]{new ef.b(i15, i32), new ef.b(29, 47)}), new s0(i57, new ef.b[]{new ef.b(42, 24), new ef.b(i11, 25)}), new s0(i57, new ef.b[]{new ef.b(23, 15), new ef.b(28, 16)})};
        int i58 = 10;
        int i59 = 30;
        s0[] s0VarArr32 = {new s0(i57, new ef.b[]{new ef.b(17, 115)}), new s0(28, new ef.b[]{new ef.b(i58, i32), new ef.b(23, 47)}), new s0(i59, new ef.b[]{new ef.b(i58, 24), new ef.b(35, 25)}), new s0(i59, new ef.b[]{new ef.b(19, 15), new ef.b(35, 16)})};
        int i60 = 30;
        s0[] s0VarArr33 = {new s0(30, new ef.b[]{new ef.b(17, 115), new ef.b(i11, 116)}), new s0(28, new ef.b[]{new ef.b(14, i32), new ef.b(21, 47)}), new s0(i60, new ef.b[]{new ef.b(29, 24), new ef.b(19, 25)}), new s0(i60, new ef.b[]{new ef.b(11, 15), new ef.b(i32, 16)})};
        int i61 = 30;
        s0[] s0VarArr34 = {new s0(30, new ef.b[]{new ef.b(13, 115), new ef.b(6, 116)}), new s0(28, new ef.b[]{new ef.b(14, i32), new ef.b(23, 47)}), new s0(i61, new ef.b[]{new ef.b(44, 24), new ef.b(7, 25)}), new s0(i61, new ef.b[]{new ef.b(59, 16), new ef.b(i11, 17)})};
        int i62 = 30;
        s0[] s0VarArr35 = {new s0(30, new ef.b[]{new ef.b(12, 121), new ef.b(7, 122)}), new s0(28, new ef.b[]{new ef.b(12, 47), new ef.b(26, 48)}), new s0(i62, new ef.b[]{new ef.b(39, 24), new ef.b(14, 25)}), new s0(i62, new ef.b[]{new ef.b(22, 15), new ef.b(41, 16)})};
        int i63 = 6;
        int i64 = 30;
        s0[] s0VarArr36 = {new s0(30, new ef.b[]{new ef.b(i63, 121), new ef.b(14, 122)}), new s0(28, new ef.b[]{new ef.b(i63, 47), new ef.b(34, 48)}), new s0(i64, new ef.b[]{new ef.b(i32, 24), new ef.b(10, 25)}), new s0(i64, new ef.b[]{new ef.b(i15, 15), new ef.b(64, 16)})};
        int i65 = 24;
        int i66 = 30;
        s0[] s0VarArr37 = {new s0(30, new ef.b[]{new ef.b(17, 122), new ef.b(i10, 123)}), new s0(28, new ef.b[]{new ef.b(29, i32), new ef.b(14, 47)}), new s0(i66, new ef.b[]{new ef.b(49, i65), new ef.b(10, 25)}), new s0(i66, new ef.b[]{new ef.b(i65, 15), new ef.b(i32, 16)})};
        s0[] s0VarArr38 = {new s0(30, new ef.b[]{new ef.b(i10, 122), new ef.b(18, 123)}), new s0(28, new ef.b[]{new ef.b(13, i32), new ef.b(32, 47)}), new s0(30, new ef.b[]{new ef.b(48, 24), new ef.b(14, 25)}), new s0(30, new ef.b[]{new ef.b(42, 15), new ef.b(32, 16)})};
        int i67 = 30;
        s0[] s0VarArr39 = {new s0(30, new ef.b[]{new ef.b(20, 117), new ef.b(i10, 118)}), new s0(28, new ef.b[]{new ef.b(40, 47), new ef.b(7, 48)}), new s0(i67, new ef.b[]{new ef.b(43, 24), new ef.b(22, 25)}), new s0(i67, new ef.b[]{new ef.b(10, 15), new ef.b(67, 16)})};
        int i68 = 34;
        int i69 = 30;
        return new c[]{new c(1, s0VarArr), new c(2, s0VarArr2), new c(3, s0VarArr3), new c(4, s0VarArr4), new c(5, s0VarArr5), new c(6, s0VarArr6), new c(7, s0VarArr7), new c(8, s0VarArr8), new c(9, s0VarArr9), new c(10, s0VarArr10), new c(11, s0VarArr11), new c(12, s0VarArr12), new c(13, s0VarArr13), new c(14, s0VarArr14), new c(15, s0VarArr15), new c(16, s0VarArr16), new c(17, s0VarArr17), new c(18, s0VarArr18), new c(19, s0VarArr19), new c(20, s0VarArr20), new c(21, s0VarArr21), new c(22, s0VarArr22), new c(23, s0VarArr23), new c(24, s0VarArr24), new c(25, s0VarArr25), new c(26, s0VarArr26), new c(27, s0VarArr27), new c(28, s0VarArr28), new c(29, s0VarArr29), new c(30, s0VarArr30), new c(31, s0VarArr31), new c(32, s0VarArr32), new c(33, s0VarArr33), new c(34, s0VarArr34), new c(35, s0VarArr35), new c(36, s0VarArr36), new c(37, s0VarArr37), new c(38, s0VarArr38), new c(39, s0VarArr39), new c(40, new s0(30, new ef.b[]{new ef.b(19, 118), new ef.b(6, 119)}), new s0(28, new ef.b[]{new ef.b(18, 47), new ef.b(31, 48)}), new s0(i69, new ef.b[]{new ef.b(i68, 24), new ef.b(i68, 25)}), new s0(i69, new ef.b[]{new ef.b(20, 15), new ef.b(61, 16)}))};
    }

    public static c b(int i10) {
        if (i10 > 0 && i10 <= 40) {
            return f19022d[i10 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
