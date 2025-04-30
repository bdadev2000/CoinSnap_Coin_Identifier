package androidx.datastore.preferences.protobuf;

import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0426a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f4521o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f4522p = r0.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4523a;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4524c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4525d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0425a f4526e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4527f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4528g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f4529h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4530i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4531j;

    /* renamed from: k, reason: collision with root package name */
    public final T f4532k;
    public final G l;
    public final j0 m;

    /* renamed from: n, reason: collision with root package name */
    public final M f4533n;

    public Q(int[] iArr, Object[] objArr, int i9, int i10, AbstractC0425a abstractC0425a, boolean z8, int[] iArr2, int i11, int i12, T t9, G g9, j0 j0Var, C0439n c0439n, M m) {
        this.f4523a = iArr;
        this.b = objArr;
        this.f4524c = i9;
        this.f4525d = i10;
        this.f4527f = abstractC0425a instanceof AbstractC0446v;
        this.f4528g = z8;
        this.f4529h = iArr2;
        this.f4530i = i11;
        this.f4531j = i12;
        this.f4532k = t9;
        this.l = g9;
        this.m = j0Var;
        this.f4526e = abstractC0425a;
        this.f4533n = m;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Field ", str, " for ");
            n2.append(cls.getName());
            n2.append(" not found. Known fields are ");
            n2.append(Arrays.toString(declaredFields));
            throw new RuntimeException(n2.toString());
        }
    }

    public static int D(int i9) {
        return (i9 & 267386880) >>> 20;
    }

    public static void H(int i9, Object obj, J j7) {
        if (obj instanceof String) {
            ((C0435j) j7.f4515a).g0(i9, (String) obj);
        } else {
            j7.b(i9, (C0432g) obj);
        }
    }

    public static List l(Object obj, long j7) {
        return (List) r0.f4600d.i(obj, j7);
    }

    public static Q q(Z z8, T t9, G g9, j0 j0Var, C0439n c0439n, M m) {
        if (z8 instanceof Z) {
            return r(z8, t9, g9, j0Var, c0439n, m);
        }
        com.mbridge.msdk.foundation.entity.o.v(z8);
        throw null;
    }

    public static Q r(Z z8, T t9, G g9, j0 j0Var, C0439n c0439n, M m) {
        boolean z9;
        int i9;
        int charAt;
        int charAt2;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        char charAt10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        String str;
        char c9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Field A8;
        int i36;
        char charAt11;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        Field A9;
        Field A10;
        int i42;
        char charAt12;
        int i43;
        char charAt13;
        int i44;
        char charAt14;
        int i45;
        char charAt15;
        char charAt16;
        int i46 = 0;
        if (z8.d() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        String c10 = z8.c();
        int length = c10.length();
        int charAt17 = c10.charAt(0);
        if (charAt17 >= 55296) {
            int i47 = charAt17 & 8191;
            int i48 = 1;
            int i49 = 13;
            while (true) {
                i9 = i48 + 1;
                charAt16 = c10.charAt(i48);
                if (charAt16 < 55296) {
                    break;
                }
                i47 |= (charAt16 & 8191) << i49;
                i49 += 13;
                i48 = i9;
            }
            charAt17 = i47 | (charAt16 << i49);
        } else {
            i9 = 1;
        }
        int i50 = i9 + 1;
        int charAt18 = c10.charAt(i9);
        if (charAt18 >= 55296) {
            int i51 = charAt18 & 8191;
            int i52 = 13;
            while (true) {
                i45 = i50 + 1;
                charAt15 = c10.charAt(i50);
                if (charAt15 < 55296) {
                    break;
                }
                i51 |= (charAt15 & 8191) << i52;
                i52 += 13;
                i50 = i45;
            }
            charAt18 = i51 | (charAt15 << i52);
            i50 = i45;
        }
        if (charAt18 == 0) {
            i14 = 0;
            charAt = 0;
            charAt2 = 0;
            i13 = 0;
            i11 = 0;
            iArr = f4521o;
            i12 = 0;
        } else {
            int i53 = i50 + 1;
            int charAt19 = c10.charAt(i50);
            if (charAt19 >= 55296) {
                int i54 = charAt19 & 8191;
                int i55 = 13;
                while (true) {
                    i22 = i53 + 1;
                    charAt10 = c10.charAt(i53);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i54 |= (charAt10 & 8191) << i55;
                    i55 += 13;
                    i53 = i22;
                }
                charAt19 = i54 | (charAt10 << i55);
                i53 = i22;
            }
            int i56 = i53 + 1;
            int charAt20 = c10.charAt(i53);
            if (charAt20 >= 55296) {
                int i57 = charAt20 & 8191;
                int i58 = 13;
                while (true) {
                    i21 = i56 + 1;
                    charAt9 = c10.charAt(i56);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i57 |= (charAt9 & 8191) << i58;
                    i58 += 13;
                    i56 = i21;
                }
                charAt20 = i57 | (charAt9 << i58);
                i56 = i21;
            }
            int i59 = i56 + 1;
            charAt = c10.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i20 = i59 + 1;
                    charAt8 = c10.charAt(i59);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i60 |= (charAt8 & 8191) << i61;
                    i61 += 13;
                    i59 = i20;
                }
                charAt = i60 | (charAt8 << i61);
                i59 = i20;
            }
            int i62 = i59 + 1;
            charAt2 = c10.charAt(i59);
            if (charAt2 >= 55296) {
                int i63 = charAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i19 = i62 + 1;
                    charAt7 = c10.charAt(i62);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i63 |= (charAt7 & 8191) << i64;
                    i64 += 13;
                    i62 = i19;
                }
                charAt2 = i63 | (charAt7 << i64);
                i62 = i19;
            }
            int i65 = i62 + 1;
            int charAt21 = c10.charAt(i62);
            if (charAt21 >= 55296) {
                int i66 = charAt21 & 8191;
                int i67 = 13;
                while (true) {
                    i18 = i65 + 1;
                    charAt6 = c10.charAt(i65);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i66 |= (charAt6 & 8191) << i67;
                    i67 += 13;
                    i65 = i18;
                }
                charAt21 = i66 | (charAt6 << i67);
                i65 = i18;
            }
            int i68 = i65 + 1;
            int charAt22 = c10.charAt(i65);
            if (charAt22 >= 55296) {
                int i69 = charAt22 & 8191;
                int i70 = 13;
                while (true) {
                    i17 = i68 + 1;
                    charAt5 = c10.charAt(i68);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i69 |= (charAt5 & 8191) << i70;
                    i70 += 13;
                    i68 = i17;
                }
                charAt22 = i69 | (charAt5 << i70);
                i68 = i17;
            }
            int i71 = i68 + 1;
            int charAt23 = c10.charAt(i68);
            if (charAt23 >= 55296) {
                int i72 = charAt23 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i16 = i73 + 1;
                    charAt4 = c10.charAt(i73);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i72 |= (charAt4 & 8191) << i74;
                    i74 += 13;
                    i73 = i16;
                }
                charAt23 = i72 | (charAt4 << i74);
                i10 = i16;
            } else {
                i10 = i71;
            }
            int i75 = i10 + 1;
            int charAt24 = c10.charAt(i10);
            if (charAt24 >= 55296) {
                int i76 = charAt24 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i15 = i77 + 1;
                    charAt3 = c10.charAt(i77);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i76 |= (charAt3 & 8191) << i78;
                    i78 += 13;
                    i77 = i15;
                }
                charAt24 = i76 | (charAt3 << i78);
                i75 = i15;
            }
            int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
            i11 = (charAt19 * 2) + charAt20;
            i12 = charAt22;
            i13 = charAt24;
            i46 = charAt19;
            i50 = i75;
            int i79 = charAt21;
            iArr = iArr2;
            i14 = i79;
        }
        Unsafe unsafe = f4522p;
        Object[] b = z8.b();
        Class<?> cls = z8.a().getClass();
        int i80 = i50;
        int[] iArr3 = new int[i14 * 3];
        Object[] objArr = new Object[i14 * 2];
        int i81 = i13 + i12;
        int i82 = i13;
        int i83 = i80;
        int i84 = i81;
        int i85 = 0;
        int i86 = 0;
        while (i83 < length) {
            int i87 = i83 + 1;
            int charAt25 = c10.charAt(i83);
            if (charAt25 >= 55296) {
                int i88 = charAt25 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i44 = i89 + 1;
                    charAt14 = c10.charAt(i89);
                    i23 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i88 |= (charAt14 & 8191) << i90;
                    i90 += 13;
                    i89 = i44;
                    length = i23;
                }
                charAt25 = i88 | (charAt14 << i90);
                i24 = i44;
            } else {
                i23 = length;
                i24 = i87;
            }
            int i91 = i24 + 1;
            int charAt26 = c10.charAt(i24);
            if (charAt26 >= 55296) {
                int i92 = charAt26 & 8191;
                int i93 = i91;
                int i94 = 13;
                while (true) {
                    i43 = i93 + 1;
                    charAt13 = c10.charAt(i93);
                    i25 = i13;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i92 |= (charAt13 & 8191) << i94;
                    i94 += 13;
                    i93 = i43;
                    i13 = i25;
                }
                charAt26 = i92 | (charAt13 << i94);
                i26 = i43;
            } else {
                i25 = i13;
                i26 = i91;
            }
            int i95 = charAt26 & 255;
            boolean z10 = z9;
            if ((charAt26 & 1024) != 0) {
                iArr[i85] = i86;
                i85++;
            }
            if (i95 >= 51) {
                int i96 = i26 + 1;
                int charAt27 = c10.charAt(i26);
                if (charAt27 >= 55296) {
                    int i97 = charAt27 & 8191;
                    int i98 = i96;
                    int i99 = 13;
                    while (true) {
                        i42 = i98 + 1;
                        charAt12 = c10.charAt(i98);
                        i27 = charAt2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i97 |= (charAt12 & 8191) << i99;
                        i99 += 13;
                        i98 = i42;
                        charAt2 = i27;
                    }
                    charAt27 = i97 | (charAt12 << i99);
                    i40 = i42;
                } else {
                    i27 = charAt2;
                    i40 = i96;
                }
                int i100 = i95 - 51;
                int i101 = i40;
                if (i100 != 9 && i100 != 17) {
                    if (i100 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i86 / 3) * 2) + 1] = b[i11];
                        i11++;
                    }
                    i41 = 2;
                } else {
                    i41 = 2;
                    objArr[((i86 / 3) * 2) + 1] = b[i11];
                    i11++;
                }
                int i102 = charAt27 * i41;
                Object obj = b[i102];
                if (obj instanceof Field) {
                    A9 = (Field) obj;
                } else {
                    A9 = A(cls, (String) obj);
                    b[i102] = A9;
                }
                int i103 = charAt;
                int objectFieldOffset = (int) unsafe.objectFieldOffset(A9);
                int i104 = i102 + 1;
                Object obj2 = b[i104];
                if (obj2 instanceof Field) {
                    A10 = (Field) obj2;
                } else {
                    A10 = A(cls, (String) obj2);
                    b[i104] = A10;
                }
                i35 = objectFieldOffset;
                c9 = 2;
                i29 = charAt26;
                i34 = i11;
                str = c10;
                i32 = (int) unsafe.objectFieldOffset(A10);
                i33 = 0;
                i28 = i103;
                i31 = i101;
            } else {
                i27 = charAt2;
                int i105 = charAt;
                int i106 = i11 + 1;
                Field A11 = A(cls, (String) b[i11]);
                i28 = i105;
                if (i95 == 9 || i95 == 17) {
                    i29 = charAt26;
                    i30 = 1;
                    objArr[((i86 / 3) * 2) + 1] = A11.getType();
                } else {
                    if (i95 == 27 || i95 == 49) {
                        i29 = charAt26;
                        i30 = 1;
                        i37 = i11 + 2;
                        objArr[((i86 / 3) * 2) + 1] = b[i106];
                    } else if (i95 != 12 && i95 != 30 && i95 != 44) {
                        if (i95 == 50) {
                            int i107 = i82 + 1;
                            iArr[i82] = i86;
                            int i108 = (i86 / 3) * 2;
                            int i109 = i11 + 2;
                            objArr[i108] = b[i106];
                            if ((charAt26 & 2048) != 0) {
                                i106 = i11 + 3;
                                objArr[i108 + 1] = b[i109];
                                i29 = charAt26;
                                i82 = i107;
                                i30 = 1;
                            } else {
                                i82 = i107;
                                i106 = i109;
                            }
                        }
                        i29 = charAt26;
                        i30 = 1;
                    } else {
                        i29 = charAt26;
                        i30 = 1;
                        if ((charAt17 & 1) == 1) {
                            i37 = i11 + 2;
                            objArr[((i86 / 3) * 2) + 1] = b[i106];
                        }
                    }
                    i106 = i37;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(A11);
                if ((charAt17 & 1) == i30 && i95 <= 17) {
                    i31 = i26 + 1;
                    int charAt28 = c10.charAt(i26);
                    if (charAt28 >= 55296) {
                        int i110 = charAt28 & 8191;
                        int i111 = 13;
                        while (true) {
                            i36 = i31 + 1;
                            charAt11 = c10.charAt(i31);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i110 |= (charAt11 & 8191) << i111;
                            i111 += 13;
                            i31 = i36;
                        }
                        charAt28 = i110 | (charAt11 << i111);
                        i31 = i36;
                    }
                    c9 = 2;
                    int i112 = (charAt28 / 32) + (i46 * 2);
                    Object obj3 = b[i112];
                    if (obj3 instanceof Field) {
                        A8 = (Field) obj3;
                    } else {
                        A8 = A(cls, (String) obj3);
                        b[i112] = A8;
                    }
                    str = c10;
                    i32 = (int) unsafe.objectFieldOffset(A8);
                    i33 = charAt28 % 32;
                } else {
                    str = c10;
                    c9 = 2;
                    i31 = i26;
                    i32 = 0;
                    i33 = 0;
                }
                if (i95 >= 18 && i95 <= 49) {
                    iArr[i84] = objectFieldOffset2;
                    i84++;
                }
                i34 = i106;
                i35 = objectFieldOffset2;
            }
            int i113 = i86 + 1;
            iArr3[i86] = charAt25;
            int i114 = i86 + 2;
            int i115 = i34;
            int i116 = i29;
            int i117 = i46;
            if ((i116 & 512) != 0) {
                i38 = 536870912;
            } else {
                i38 = 0;
            }
            if ((i116 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                i39 = 268435456;
            } else {
                i39 = 0;
            }
            iArr3[i113] = i39 | i38 | (i95 << 20) | i35;
            i86 += 3;
            iArr3[i114] = i32 | (i33 << 20);
            i83 = i31;
            c10 = str;
            z9 = z10;
            i11 = i115;
            charAt = i28;
            length = i23;
            i13 = i25;
            i46 = i117;
            charAt2 = i27;
        }
        return new Q(iArr3, objArr, charAt, charAt2, z8.a(), z9, iArr, i13, i81, t9, g9, j0Var, c0439n, m);
    }

    public static long s(int i9) {
        return i9 & 1048575;
    }

    public static int t(Object obj, long j7) {
        return ((Integer) r0.f4600d.i(obj, j7)).intValue();
    }

    public static long u(Object obj, long j7) {
        return ((Long) r0.f4600d.i(obj, j7)).longValue();
    }

    public final void B(Object obj, int i9) {
        if (this.f4528g) {
            return;
        }
        int i10 = this.f4523a[i9 + 2];
        long j7 = i10 & 1048575;
        r0.p(obj, j7, r0.f4600d.g(obj, j7) | (1 << (i10 >>> 20)));
    }

    public final void C(Object obj, int i9, int i10) {
        r0.p(obj, this.f4523a[i10 + 2] & 1048575, i9);
    }

    public final int E(int i9) {
        return this.f4523a[i9 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0040. Please report as an issue. */
    public final void F(Object obj, J j7) {
        int i9;
        boolean z8;
        int[] iArr = this.f4523a;
        int length = iArr.length;
        Unsafe unsafe = f4522p;
        int i10 = -1;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int E8 = E(i12);
            int i13 = iArr[i12];
            int D8 = D(E8);
            if (!this.f4528g && D8 <= 17) {
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                if (i15 != i10) {
                    i11 = unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i9 = 1 << (i14 >>> 20);
            } else {
                i9 = 0;
            }
            long j9 = E8 & 1048575;
            switch (D8) {
                case 0:
                    if ((i9 & i11) != 0) {
                        j7.c(i13, r0.f4600d.e(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i9 & i11) != 0) {
                        j7.g(i13, r0.f4600d.f(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i9 & i11) != 0) {
                        j7.j(i13, unsafe.getLong(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i9 & i11) != 0) {
                        j7.q(i13, unsafe.getLong(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i9 & i11) != 0) {
                        j7.i(i13, unsafe.getInt(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i9 & i11) != 0) {
                        j7.f(i13, unsafe.getLong(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i9 & i11) != 0) {
                        j7.e(i13, unsafe.getInt(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i9 & i11) != 0) {
                        j7.a(i13, r0.f4600d.c(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i9 & i11) != 0) {
                        H(i13, unsafe.getObject(obj, j9), j7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i9 & i11) != 0) {
                        j7.k(i13, unsafe.getObject(obj, j9), g(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i9 & i11) != 0) {
                        j7.b(i13, (C0432g) unsafe.getObject(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i9 & i11) != 0) {
                        j7.p(i13, unsafe.getInt(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i9 & i11) != 0) {
                        j7.d(i13, unsafe.getInt(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i9 & i11) != 0) {
                        j7.l(i13, unsafe.getInt(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i9 & i11) != 0) {
                        j7.m(i13, unsafe.getLong(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i9 & i11) != 0) {
                        j7.n(i13, unsafe.getInt(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i9 & i11) != 0) {
                        j7.o(i13, unsafe.getLong(obj, j9));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i9 & i11) != 0) {
                        j7.h(i13, unsafe.getObject(obj, j9), g(i12));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    b0.F(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 19:
                    b0.J(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 20:
                    b0.M(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 21:
                    b0.U(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 22:
                    b0.L(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 23:
                    b0.I(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 24:
                    b0.H(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 25:
                    b0.D(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 26:
                    b0.S(iArr[i12], (List) unsafe.getObject(obj, j9), j7);
                    break;
                case 27:
                    b0.N(iArr[i12], (List) unsafe.getObject(obj, j9), j7, g(i12));
                    break;
                case 28:
                    b0.E(iArr[i12], (List) unsafe.getObject(obj, j9), j7);
                    break;
                case 29:
                    z8 = false;
                    b0.T(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    z8 = false;
                    b0.G(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 31:
                    z8 = false;
                    b0.O(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 32:
                    z8 = false;
                    b0.P(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 33:
                    z8 = false;
                    b0.Q(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 34:
                    z8 = false;
                    b0.R(iArr[i12], (List) unsafe.getObject(obj, j9), j7, false);
                    break;
                case 35:
                    b0.F(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 36:
                    b0.J(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 37:
                    b0.M(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    b0.U(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 39:
                    b0.L(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 40:
                    b0.I(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 41:
                    b0.H(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 42:
                    b0.D(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    b0.T(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 44:
                    b0.G(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 45:
                    b0.O(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    b0.P(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    b0.Q(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 48:
                    b0.R(iArr[i12], (List) unsafe.getObject(obj, j9), j7, true);
                    break;
                case 49:
                    b0.K(iArr[i12], (List) unsafe.getObject(obj, j9), j7, g(i12));
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    G(j7, i13, unsafe.getObject(obj, j9), i12);
                    break;
                case 51:
                    if (k(obj, i13, i12)) {
                        j7.c(i13, ((Double) r0.f4600d.i(obj, j9)).doubleValue());
                    }
                    break;
                case 52:
                    if (k(obj, i13, i12)) {
                        j7.g(i13, ((Float) r0.f4600d.i(obj, j9)).floatValue());
                    }
                    break;
                case 53:
                    if (k(obj, i13, i12)) {
                        j7.j(i13, u(obj, j9));
                    }
                    break;
                case 54:
                    if (k(obj, i13, i12)) {
                        j7.q(i13, u(obj, j9));
                    }
                    break;
                case 55:
                    if (k(obj, i13, i12)) {
                        j7.i(i13, t(obj, j9));
                    }
                    break;
                case 56:
                    if (k(obj, i13, i12)) {
                        j7.f(i13, u(obj, j9));
                    }
                    break;
                case 57:
                    if (k(obj, i13, i12)) {
                        j7.e(i13, t(obj, j9));
                    }
                    break;
                case 58:
                    if (k(obj, i13, i12)) {
                        j7.a(i13, ((Boolean) r0.f4600d.i(obj, j9)).booleanValue());
                    }
                    break;
                case 59:
                    if (k(obj, i13, i12)) {
                        H(i13, unsafe.getObject(obj, j9), j7);
                    }
                    break;
                case 60:
                    if (k(obj, i13, i12)) {
                        j7.k(i13, unsafe.getObject(obj, j9), g(i12));
                    }
                    break;
                case 61:
                    if (k(obj, i13, i12)) {
                        j7.b(i13, (C0432g) unsafe.getObject(obj, j9));
                    }
                    break;
                case 62:
                    if (k(obj, i13, i12)) {
                        j7.p(i13, t(obj, j9));
                    }
                    break;
                case 63:
                    if (k(obj, i13, i12)) {
                        j7.d(i13, t(obj, j9));
                    }
                    break;
                case 64:
                    if (k(obj, i13, i12)) {
                        j7.l(i13, t(obj, j9));
                    }
                    break;
                case 65:
                    if (k(obj, i13, i12)) {
                        j7.m(i13, u(obj, j9));
                    }
                    break;
                case 66:
                    if (k(obj, i13, i12)) {
                        j7.n(i13, t(obj, j9));
                    }
                    break;
                case 67:
                    if (k(obj, i13, i12)) {
                        j7.o(i13, u(obj, j9));
                    }
                    break;
                case 68:
                    if (k(obj, i13, i12)) {
                        j7.h(i13, unsafe.getObject(obj, j9), g(i12));
                    }
                    break;
            }
        }
        this.m.getClass();
        ((AbstractC0446v) obj).unknownFields.d(j7);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x013f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(androidx.datastore.preferences.protobuf.J r22, int r23, java.lang.Object r24, int r25) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.G(androidx.datastore.preferences.protobuf.J, int, java.lang.Object, int):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void a(Object obj, J j7) {
        j7.getClass();
        if (this.f4528g) {
            int[] iArr = this.f4523a;
            int length = iArr.length;
            for (int i9 = 0; i9 < length; i9 += 3) {
                int E8 = E(i9);
                int i10 = iArr[i9];
                switch (D(E8)) {
                    case 0:
                        if (j(obj, i9)) {
                            j7.c(i10, r0.f4600d.e(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (j(obj, i9)) {
                            j7.g(i10, r0.f4600d.f(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (j(obj, i9)) {
                            j7.j(i10, r0.f4600d.h(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (j(obj, i9)) {
                            j7.q(i10, r0.f4600d.h(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (j(obj, i9)) {
                            j7.i(i10, r0.f4600d.g(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (j(obj, i9)) {
                            j7.f(i10, r0.f4600d.h(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (j(obj, i9)) {
                            j7.e(i10, r0.f4600d.g(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (j(obj, i9)) {
                            j7.a(i10, r0.f4600d.c(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (j(obj, i9)) {
                            H(i10, r0.f4600d.i(obj, E8 & 1048575), j7);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (j(obj, i9)) {
                            j7.k(i10, r0.f4600d.i(obj, E8 & 1048575), g(i9));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (j(obj, i9)) {
                            j7.b(i10, (C0432g) r0.f4600d.i(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (j(obj, i9)) {
                            j7.p(i10, r0.f4600d.g(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (j(obj, i9)) {
                            j7.d(i10, r0.f4600d.g(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (j(obj, i9)) {
                            j7.l(i10, r0.f4600d.g(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (j(obj, i9)) {
                            j7.m(i10, r0.f4600d.h(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (j(obj, i9)) {
                            j7.n(i10, r0.f4600d.g(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (j(obj, i9)) {
                            j7.o(i10, r0.f4600d.h(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (j(obj, i9)) {
                            j7.h(i10, r0.f4600d.i(obj, E8 & 1048575), g(i9));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        b0.F(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 19:
                        b0.J(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 20:
                        b0.M(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 21:
                        b0.U(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 22:
                        b0.L(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 23:
                        b0.I(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 24:
                        b0.H(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 25:
                        b0.D(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 26:
                        b0.S(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7);
                        break;
                    case 27:
                        b0.N(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, g(i9));
                        break;
                    case 28:
                        b0.E(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7);
                        break;
                    case 29:
                        b0.T(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                        b0.G(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 31:
                        b0.O(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 32:
                        b0.P(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 33:
                        b0.Q(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 34:
                        b0.R(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, false);
                        break;
                    case 35:
                        b0.F(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 36:
                        b0.J(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 37:
                        b0.M(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        b0.U(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 39:
                        b0.L(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 40:
                        b0.I(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 41:
                        b0.H(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 42:
                        b0.D(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        b0.T(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 44:
                        b0.G(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 45:
                        b0.O(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        b0.P(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        b0.Q(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 48:
                        b0.R(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, true);
                        break;
                    case 49:
                        b0.K(iArr[i9], (List) r0.f4600d.i(obj, E8 & 1048575), j7, g(i9));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        G(j7, i10, r0.f4600d.i(obj, E8 & 1048575), i9);
                        break;
                    case 51:
                        if (k(obj, i10, i9)) {
                            j7.c(i10, ((Double) r0.f4600d.i(obj, E8 & 1048575)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (k(obj, i10, i9)) {
                            j7.g(i10, ((Float) r0.f4600d.i(obj, E8 & 1048575)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (k(obj, i10, i9)) {
                            j7.j(i10, u(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (k(obj, i10, i9)) {
                            j7.q(i10, u(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (k(obj, i10, i9)) {
                            j7.i(i10, t(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (k(obj, i10, i9)) {
                            j7.f(i10, u(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (k(obj, i10, i9)) {
                            j7.e(i10, t(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (k(obj, i10, i9)) {
                            j7.a(i10, ((Boolean) r0.f4600d.i(obj, E8 & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (k(obj, i10, i9)) {
                            H(i10, r0.f4600d.i(obj, E8 & 1048575), j7);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (k(obj, i10, i9)) {
                            j7.k(i10, r0.f4600d.i(obj, E8 & 1048575), g(i9));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (k(obj, i10, i9)) {
                            j7.b(i10, (C0432g) r0.f4600d.i(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (k(obj, i10, i9)) {
                            j7.p(i10, t(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (k(obj, i10, i9)) {
                            j7.d(i10, t(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (k(obj, i10, i9)) {
                            j7.l(i10, t(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (k(obj, i10, i9)) {
                            j7.m(i10, u(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (k(obj, i10, i9)) {
                            j7.n(i10, t(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (k(obj, i10, i9)) {
                            j7.o(i10, u(obj, E8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (k(obj, i10, i9)) {
                            j7.h(i10, r0.f4600d.i(obj, E8 & 1048575), g(i9));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.m.getClass();
            ((AbstractC0446v) obj).unknownFields.d(j7);
            return;
        }
        F(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void b(Object obj, J5.a aVar, C0438m c0438m) {
        c0438m.getClass();
        m(this.m, obj, aVar, c0438m);
    }

    public final boolean c(Object obj, Object obj2, int i9) {
        if (j(obj, i9) == j(obj2, i9)) {
            return true;
        }
        return false;
    }

    public final void d(int i9, Object obj, Object obj2) {
        int i10 = this.f4523a[i9];
        if (r0.f4600d.i(obj, E(i9) & 1048575) == null) {
            return;
        }
        e(i9);
    }

    public final void e(int i9) {
        com.mbridge.msdk.foundation.entity.o.v(this.b[((i9 / 3) * 2) + 1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.b0.C(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[LOOP:0: B:2:0x0005->B:86:0x01f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object f(int i9) {
        return this.b[(i9 / 3) * 2];
    }

    public final InterfaceC0426a0 g(int i9) {
        int i10 = (i9 / 3) * 2;
        Object[] objArr = this.b;
        InterfaceC0426a0 interfaceC0426a0 = (InterfaceC0426a0) objArr[i10];
        if (interfaceC0426a0 != null) {
            return interfaceC0426a0;
        }
        InterfaceC0426a0 a6 = X.f4537c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a6;
        return a6;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final int getSerializedSize(Object obj) {
        if (this.f4528g) {
            return i(obj);
        }
        return h(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0034. Please report as an issue. */
    public final int h(Object obj) {
        int i9;
        int v6;
        int I5;
        Unsafe unsafe = f4522p;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f4523a;
            if (i11 < iArr.length) {
                int E8 = E(i11);
                int i14 = iArr[i11];
                int D8 = D(E8);
                if (D8 <= 17) {
                    int i15 = iArr[i11 + 2];
                    int i16 = i15 & 1048575;
                    i9 = 1 << (i15 >>> 20);
                    if (i16 != i10) {
                        i13 = unsafe.getInt(obj, i16);
                        i10 = i16;
                    }
                } else {
                    i9 = 0;
                }
                long j7 = E8 & 1048575;
                switch (D8) {
                    case 0:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.v(i14);
                            i12 += v6;
                            break;
                        }
                    case 1:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.z(i14);
                            i12 += v6;
                            break;
                        }
                    case 2:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.D(i14, unsafe.getLong(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 3:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.N(i14, unsafe.getLong(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 4:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.B(i14, unsafe.getInt(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 5:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.y(i14);
                            i12 += v6;
                            break;
                        }
                    case 6:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.x(i14);
                            i12 += v6;
                            break;
                        }
                    case 7:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.s(i14);
                            i12 += v6;
                            break;
                        }
                    case 8:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j7);
                            if (object instanceof C0432g) {
                                I5 = C0435j.t(i14, (C0432g) object);
                            } else {
                                I5 = C0435j.I(i14, (String) object);
                            }
                            i12 = I5 + i12;
                            break;
                        }
                    case 9:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = b0.o(i14, unsafe.getObject(obj, j7), g(i11));
                            i12 += v6;
                            break;
                        }
                    case 10:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.t(i14, (C0432g) unsafe.getObject(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 11:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.L(i14, unsafe.getInt(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 12:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.w(i14, unsafe.getInt(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 13:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.E(i14);
                            i12 += v6;
                            break;
                        }
                    case 14:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.F(i14);
                            i12 += v6;
                            break;
                        }
                    case 15:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.G(i14, unsafe.getInt(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 16:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.H(i14, unsafe.getLong(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 17:
                        if ((i9 & i13) == 0) {
                            break;
                        } else {
                            v6 = C0435j.A(i14, (AbstractC0425a) unsafe.getObject(obj, j7), g(i11));
                            i12 += v6;
                            break;
                        }
                    case 18:
                        v6 = b0.h(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 19:
                        v6 = b0.f(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 20:
                        v6 = b0.m(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 21:
                        v6 = b0.x(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 22:
                        v6 = b0.k(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 23:
                        v6 = b0.h(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 24:
                        v6 = b0.f(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 25:
                        v6 = b0.a(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 26:
                        v6 = b0.u(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 27:
                        v6 = b0.p(i14, (List) unsafe.getObject(obj, j7), g(i11));
                        i12 += v6;
                        break;
                    case 28:
                        v6 = b0.c(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 29:
                        v6 = b0.v(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                        v6 = b0.d(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 31:
                        v6 = b0.f(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 32:
                        v6 = b0.h(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 33:
                        v6 = b0.q(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 34:
                        v6 = b0.s(i14, (List) unsafe.getObject(obj, j7));
                        i12 += v6;
                        break;
                    case 35:
                        int i17 = b0.i((List) unsafe.getObject(obj, j7));
                        if (i17 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(i17, C0435j.K(i14), i17, i12);
                            break;
                        }
                    case 36:
                        int g9 = b0.g((List) unsafe.getObject(obj, j7));
                        if (g9 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(g9, C0435j.K(i14), g9, i12);
                            break;
                        }
                    case 37:
                        int n2 = b0.n((List) unsafe.getObject(obj, j7));
                        if (n2 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(n2, C0435j.K(i14), n2, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        int y4 = b0.y((List) unsafe.getObject(obj, j7));
                        if (y4 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(y4, C0435j.K(i14), y4, i12);
                            break;
                        }
                    case 39:
                        int l = b0.l((List) unsafe.getObject(obj, j7));
                        if (l <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(l, C0435j.K(i14), l, i12);
                            break;
                        }
                    case 40:
                        int i18 = b0.i((List) unsafe.getObject(obj, j7));
                        if (i18 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(i18, C0435j.K(i14), i18, i12);
                            break;
                        }
                    case 41:
                        int g10 = b0.g((List) unsafe.getObject(obj, j7));
                        if (g10 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(g10, C0435j.K(i14), g10, i12);
                            break;
                        }
                    case 42:
                        int b = b0.b((List) unsafe.getObject(obj, j7));
                        if (b <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(b, C0435j.K(i14), b, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        int w2 = b0.w((List) unsafe.getObject(obj, j7));
                        if (w2 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(w2, C0435j.K(i14), w2, i12);
                            break;
                        }
                    case 44:
                        int e4 = b0.e((List) unsafe.getObject(obj, j7));
                        if (e4 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(e4, C0435j.K(i14), e4, i12);
                            break;
                        }
                    case 45:
                        int g11 = b0.g((List) unsafe.getObject(obj, j7));
                        if (g11 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(g11, C0435j.K(i14), g11, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        int i19 = b0.i((List) unsafe.getObject(obj, j7));
                        if (i19 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(i19, C0435j.K(i14), i19, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        int r9 = b0.r((List) unsafe.getObject(obj, j7));
                        if (r9 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(r9, C0435j.K(i14), r9, i12);
                            break;
                        }
                    case 48:
                        int t9 = b0.t((List) unsafe.getObject(obj, j7));
                        if (t9 <= 0) {
                            break;
                        } else {
                            i12 = Q7.n0.c(t9, C0435j.K(i14), t9, i12);
                            break;
                        }
                    case 49:
                        v6 = b0.j(i14, (List) unsafe.getObject(obj, j7), g(i11));
                        i12 += v6;
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        Object object2 = unsafe.getObject(obj, j7);
                        Object f9 = f(i11);
                        this.f4533n.getClass();
                        v6 = M.a(i14, object2, f9);
                        i12 += v6;
                        break;
                    case 51:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.v(i14);
                            i12 += v6;
                            break;
                        }
                    case 52:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.z(i14);
                            i12 += v6;
                            break;
                        }
                    case 53:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.D(i14, u(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 54:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.N(i14, u(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 55:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.B(i14, t(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 56:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.y(i14);
                            i12 += v6;
                            break;
                        }
                    case 57:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.x(i14);
                            i12 += v6;
                            break;
                        }
                    case 58:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.s(i14);
                            i12 += v6;
                            break;
                        }
                    case 59:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j7);
                            if (object3 instanceof C0432g) {
                                I5 = C0435j.t(i14, (C0432g) object3);
                            } else {
                                I5 = C0435j.I(i14, (String) object3);
                            }
                            i12 = I5 + i12;
                            break;
                        }
                    case 60:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = b0.o(i14, unsafe.getObject(obj, j7), g(i11));
                            i12 += v6;
                            break;
                        }
                    case 61:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.t(i14, (C0432g) unsafe.getObject(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 62:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.L(i14, t(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 63:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.w(i14, t(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 64:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.E(i14);
                            i12 += v6;
                            break;
                        }
                    case 65:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.F(i14);
                            i12 += v6;
                            break;
                        }
                    case 66:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.G(i14, t(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 67:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.H(i14, u(obj, j7));
                            i12 += v6;
                            break;
                        }
                    case 68:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            v6 = C0435j.A(i14, (AbstractC0425a) unsafe.getObject(obj, j7), g(i11));
                            i12 += v6;
                            break;
                        }
                }
                i11 += 3;
            } else {
                this.m.getClass();
                return ((AbstractC0446v) obj).unknownFields.a() + i12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.hashCode(java.lang.Object):int");
    }

    public final int i(Object obj) {
        int v6;
        Unsafe unsafe = f4522p;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4523a;
            if (i9 < iArr.length) {
                int E8 = E(i9);
                int D8 = D(E8);
                int i11 = iArr[i9];
                long j7 = E8 & 1048575;
                if (D8 >= EnumC0442q.f4593c.a() && D8 <= EnumC0442q.f4594d.a()) {
                    int i12 = iArr[i9 + 2];
                }
                switch (D8) {
                    case 0:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.v(i11);
                            break;
                        }
                    case 1:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.z(i11);
                            break;
                        }
                    case 2:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.D(i11, r0.j(obj, j7));
                            break;
                        }
                    case 3:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.N(i11, r0.j(obj, j7));
                            break;
                        }
                    case 4:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.B(i11, r0.i(obj, j7));
                            break;
                        }
                    case 5:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.y(i11);
                            break;
                        }
                    case 6:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.x(i11);
                            break;
                        }
                    case 7:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.s(i11);
                            break;
                        }
                    case 8:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            Object k6 = r0.k(obj, j7);
                            if (k6 instanceof C0432g) {
                                v6 = C0435j.t(i11, (C0432g) k6);
                                break;
                            } else {
                                v6 = C0435j.I(i11, (String) k6);
                                break;
                            }
                        }
                    case 9:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = b0.o(i11, r0.k(obj, j7), g(i9));
                            break;
                        }
                    case 10:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.t(i11, (C0432g) r0.k(obj, j7));
                            break;
                        }
                    case 11:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.L(i11, r0.i(obj, j7));
                            break;
                        }
                    case 12:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.w(i11, r0.i(obj, j7));
                            break;
                        }
                    case 13:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.E(i11);
                            break;
                        }
                    case 14:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.F(i11);
                            break;
                        }
                    case 15:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.G(i11, r0.i(obj, j7));
                            break;
                        }
                    case 16:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.H(i11, r0.j(obj, j7));
                            break;
                        }
                    case 17:
                        if (!j(obj, i9)) {
                            break;
                        } else {
                            v6 = C0435j.A(i11, (AbstractC0425a) r0.k(obj, j7), g(i9));
                            break;
                        }
                    case 18:
                        v6 = b0.h(i11, l(obj, j7));
                        break;
                    case 19:
                        v6 = b0.f(i11, l(obj, j7));
                        break;
                    case 20:
                        v6 = b0.m(i11, l(obj, j7));
                        break;
                    case 21:
                        v6 = b0.x(i11, l(obj, j7));
                        break;
                    case 22:
                        v6 = b0.k(i11, l(obj, j7));
                        break;
                    case 23:
                        v6 = b0.h(i11, l(obj, j7));
                        break;
                    case 24:
                        v6 = b0.f(i11, l(obj, j7));
                        break;
                    case 25:
                        v6 = b0.a(i11, l(obj, j7));
                        break;
                    case 26:
                        v6 = b0.u(i11, l(obj, j7));
                        break;
                    case 27:
                        v6 = b0.p(i11, l(obj, j7), g(i9));
                        break;
                    case 28:
                        v6 = b0.c(i11, l(obj, j7));
                        break;
                    case 29:
                        v6 = b0.v(i11, l(obj, j7));
                        break;
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                        v6 = b0.d(i11, l(obj, j7));
                        break;
                    case 31:
                        v6 = b0.f(i11, l(obj, j7));
                        break;
                    case 32:
                        v6 = b0.h(i11, l(obj, j7));
                        break;
                    case 33:
                        v6 = b0.q(i11, l(obj, j7));
                        break;
                    case 34:
                        v6 = b0.s(i11, l(obj, j7));
                        break;
                    case 35:
                        int i13 = b0.i((List) unsafe.getObject(obj, j7));
                        if (i13 > 0) {
                            i10 = Q7.n0.c(i13, C0435j.K(i11), i13, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        int g9 = b0.g((List) unsafe.getObject(obj, j7));
                        if (g9 > 0) {
                            i10 = Q7.n0.c(g9, C0435j.K(i11), g9, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        int n2 = b0.n((List) unsafe.getObject(obj, j7));
                        if (n2 > 0) {
                            i10 = Q7.n0.c(n2, C0435j.K(i11), n2, i10);
                            break;
                        } else {
                            continue;
                        }
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        int y4 = b0.y((List) unsafe.getObject(obj, j7));
                        if (y4 > 0) {
                            i10 = Q7.n0.c(y4, C0435j.K(i11), y4, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        int l = b0.l((List) unsafe.getObject(obj, j7));
                        if (l > 0) {
                            i10 = Q7.n0.c(l, C0435j.K(i11), l, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        int i14 = b0.i((List) unsafe.getObject(obj, j7));
                        if (i14 > 0) {
                            i10 = Q7.n0.c(i14, C0435j.K(i11), i14, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        int g10 = b0.g((List) unsafe.getObject(obj, j7));
                        if (g10 > 0) {
                            i10 = Q7.n0.c(g10, C0435j.K(i11), g10, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        int b = b0.b((List) unsafe.getObject(obj, j7));
                        if (b > 0) {
                            i10 = Q7.n0.c(b, C0435j.K(i11), b, i10);
                            break;
                        } else {
                            continue;
                        }
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        int w2 = b0.w((List) unsafe.getObject(obj, j7));
                        if (w2 > 0) {
                            i10 = Q7.n0.c(w2, C0435j.K(i11), w2, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        int e4 = b0.e((List) unsafe.getObject(obj, j7));
                        if (e4 > 0) {
                            i10 = Q7.n0.c(e4, C0435j.K(i11), e4, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        int g11 = b0.g((List) unsafe.getObject(obj, j7));
                        if (g11 > 0) {
                            i10 = Q7.n0.c(g11, C0435j.K(i11), g11, i10);
                            break;
                        } else {
                            continue;
                        }
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        int i15 = b0.i((List) unsafe.getObject(obj, j7));
                        if (i15 > 0) {
                            i10 = Q7.n0.c(i15, C0435j.K(i11), i15, i10);
                            break;
                        } else {
                            continue;
                        }
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        int r9 = b0.r((List) unsafe.getObject(obj, j7));
                        if (r9 > 0) {
                            i10 = Q7.n0.c(r9, C0435j.K(i11), r9, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        int t9 = b0.t((List) unsafe.getObject(obj, j7));
                        if (t9 > 0) {
                            i10 = Q7.n0.c(t9, C0435j.K(i11), t9, i10);
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        v6 = b0.j(i11, l(obj, j7), g(i9));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        Object k7 = r0.k(obj, j7);
                        Object f9 = f(i9);
                        this.f4533n.getClass();
                        v6 = M.a(i11, k7, f9);
                        break;
                    case 51:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.v(i11);
                            break;
                        }
                    case 52:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.z(i11);
                            break;
                        }
                    case 53:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.D(i11, u(obj, j7));
                            break;
                        }
                    case 54:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.N(i11, u(obj, j7));
                            break;
                        }
                    case 55:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.B(i11, t(obj, j7));
                            break;
                        }
                    case 56:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.y(i11);
                            break;
                        }
                    case 57:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.x(i11);
                            break;
                        }
                    case 58:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.s(i11);
                            break;
                        }
                    case 59:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            Object k9 = r0.k(obj, j7);
                            if (k9 instanceof C0432g) {
                                v6 = C0435j.t(i11, (C0432g) k9);
                                break;
                            } else {
                                v6 = C0435j.I(i11, (String) k9);
                                break;
                            }
                        }
                    case 60:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = b0.o(i11, r0.k(obj, j7), g(i9));
                            break;
                        }
                    case 61:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.t(i11, (C0432g) r0.k(obj, j7));
                            break;
                        }
                    case 62:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.L(i11, t(obj, j7));
                            break;
                        }
                    case 63:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.w(i11, t(obj, j7));
                            break;
                        }
                    case 64:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.E(i11);
                            break;
                        }
                    case 65:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.F(i11);
                            break;
                        }
                    case 66:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.G(i11, t(obj, j7));
                            break;
                        }
                    case 67:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.H(i11, u(obj, j7));
                            break;
                        }
                    case 68:
                        if (!k(obj, i11, i9)) {
                            break;
                        } else {
                            v6 = C0435j.A(i11, (AbstractC0425a) r0.k(obj, j7), g(i9));
                            break;
                        }
                }
                i10 = v6 + i10;
                i9 += 3;
            } else {
                this.m.getClass();
                return ((AbstractC0446v) obj).unknownFields.a() + i10;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final boolean isInitialized(Object obj) {
        int i9;
        boolean z8;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z9 = true;
            if (i11 >= this.f4530i) {
                return true;
            }
            int i13 = this.f4529h[i11];
            int[] iArr = this.f4523a;
            int i14 = iArr[i13];
            int E8 = E(i13);
            boolean z10 = this.f4528g;
            if (!z10) {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                i9 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i12 = f4522p.getInt(obj, i16);
                    i10 = i16;
                }
            } else {
                i9 = 0;
            }
            if ((268435456 & E8) != 0) {
                if (z10) {
                    z8 = j(obj, i13);
                } else if ((i12 & i9) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    return false;
                }
            }
            int D8 = D(E8);
            if (D8 != 9 && D8 != 17) {
                if (D8 != 27) {
                    if (D8 != 60 && D8 != 68) {
                        if (D8 != 49) {
                            if (D8 != 50) {
                                continue;
                            } else {
                                Object i17 = r0.f4600d.i(obj, E8 & 1048575);
                                this.f4533n.getClass();
                                L l = (L) i17;
                                if (!l.isEmpty() && ((z0) ((K) f(i13)).f4516a.f3335c).b == A0.MESSAGE) {
                                    InterfaceC0426a0 interfaceC0426a0 = null;
                                    for (Object obj2 : l.values()) {
                                        if (interfaceC0426a0 == null) {
                                            interfaceC0426a0 = X.f4537c.a(obj2.getClass());
                                        }
                                        if (!interfaceC0426a0.isInitialized(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (k(obj, i14, i13)) {
                        if (!g(i13).isInitialized(r0.f4600d.i(obj, E8 & 1048575))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) r0.f4600d.i(obj, E8 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC0426a0 g9 = g(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!g9.isInitialized(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else {
                if (z10) {
                    z9 = j(obj, i13);
                } else if ((i9 & i12) == 0) {
                    z9 = false;
                }
                if (z9) {
                    if (!g(i13).isInitialized(r0.f4600d.i(obj, E8 & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
            i11++;
        }
    }

    public final boolean j(Object obj, int i9) {
        if (this.f4528g) {
            int E8 = E(i9);
            long j7 = E8 & 1048575;
            switch (D(E8)) {
                case 0:
                    if (r0.f4600d.e(obj, j7) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (r0.f4600d.f(obj, j7) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (r0.f4600d.h(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (r0.f4600d.h(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (r0.f4600d.g(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (r0.f4600d.h(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (r0.f4600d.g(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return r0.f4600d.c(obj, j7);
                case 8:
                    Object i10 = r0.f4600d.i(obj, j7);
                    if (i10 instanceof String) {
                        return !((String) i10).isEmpty();
                    }
                    if (i10 instanceof C0432g) {
                        return !C0432g.f4560d.equals(i10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (r0.f4600d.i(obj, j7) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !C0432g.f4560d.equals(r0.f4600d.i(obj, j7));
                case 11:
                    if (r0.f4600d.g(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (r0.f4600d.g(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (r0.f4600d.g(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (r0.f4600d.h(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (r0.f4600d.g(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (r0.f4600d.h(obj, j7) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (r0.f4600d.i(obj, j7) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((r0.f4600d.g(obj, r8 & 1048575) & (1 << (this.f4523a[i9 + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean k(Object obj, int i9, int i10) {
        if (r0.f4600d.g(obj, this.f4523a[i10 + 2] & 1048575) == i9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0073. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05f1 A[Catch: all -> 0x024d, TryCatch #3 {all -> 0x024d, blocks: (B:56:0x05ec, B:58:0x05f1, B:60:0x05f8, B:62:0x05ff, B:86:0x0248, B:89:0x0250, B:90:0x0260, B:91:0x0270, B:92:0x0280, B:93:0x0290, B:94:0x02a6, B:95:0x02b6, B:96:0x02c6, B:97:0x02d6, B:98:0x02e6, B:99:0x02f6, B:100:0x0306, B:101:0x0316, B:102:0x0326, B:103:0x0336, B:104:0x0346, B:105:0x0356, B:106:0x0366, B:107:0x0376, B:108:0x038c, B:109:0x039c, B:110:0x03ac, B:111:0x03c0, B:112:0x03c8, B:113:0x03d8, B:114:0x03e8, B:115:0x03f8, B:116:0x0408, B:117:0x0418, B:118:0x0428, B:119:0x0438, B:120:0x0448, B:122:0x0451, B:123:0x046e, B:124:0x0482, B:125:0x0495, B:126:0x04a8, B:127:0x04bb, B:128:0x04ce, B:129:0x04e4, B:130:0x04f7, B:131:0x050a, B:133:0x0513, B:134:0x0530, B:135:0x0544, B:136:0x054f, B:137:0x0564, B:138:0x0577, B:139:0x058a, B:140:0x059d, B:141:0x05b0, B:142:0x05c2, B:143:0x05d6), top: B:55:0x05ec }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0605 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(androidx.datastore.preferences.protobuf.j0 r18, java.lang.Object r19, J5.a r20, androidx.datastore.preferences.protobuf.C0438m r21) {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.m(androidx.datastore.preferences.protobuf.j0, java.lang.Object, J5.a, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void makeImmutable(Object obj) {
        int[] iArr;
        int i9;
        int i10 = this.f4530i;
        while (true) {
            iArr = this.f4529h;
            i9 = this.f4531j;
            if (i10 >= i9) {
                break;
            }
            long E8 = E(iArr[i10]) & 1048575;
            Object i11 = r0.f4600d.i(obj, E8);
            if (i11 != null) {
                this.f4533n.getClass();
                ((L) i11).b = false;
                r0.r(obj, E8, i11);
            }
            i10++;
        }
        int length = iArr.length;
        while (i9 < length) {
            this.l.a(obj, iArr[i9]);
            i9++;
        }
        this.m.getClass();
        ((AbstractC0446v) obj).unknownFields.f4580e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final void mergeFrom(Object obj, Object obj2) {
        obj2.getClass();
        int i9 = 0;
        while (true) {
            int[] iArr = this.f4523a;
            if (i9 < iArr.length) {
                int E8 = E(i9);
                long j7 = 1048575 & E8;
                int i10 = iArr[i9];
                switch (D(E8)) {
                    case 0:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            q0 q0Var = r0.f4600d;
                            q0Var.m(obj, j7, q0Var.e(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 1:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            q0 q0Var2 = r0.f4600d;
                            q0Var2.n(obj, j7, q0Var2.f(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 2:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.q(obj, j7, r0.f4600d.h(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 3:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.q(obj, j7, r0.f4600d.h(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 4:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.p(obj, j7, r0.f4600d.g(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 5:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.q(obj, j7, r0.f4600d.h(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 6:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.p(obj, j7, r0.f4600d.g(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 7:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            q0 q0Var3 = r0.f4600d;
                            q0Var3.k(obj, j7, q0Var3.c(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 8:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.r(obj, j7, r0.f4600d.i(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 9:
                        o(obj, obj2, i9);
                        break;
                    case 10:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.r(obj, j7, r0.f4600d.i(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 11:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.p(obj, j7, r0.f4600d.g(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 12:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.p(obj, j7, r0.f4600d.g(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 13:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.p(obj, j7, r0.f4600d.g(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 14:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.q(obj, j7, r0.f4600d.h(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 15:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.p(obj, j7, r0.f4600d.g(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 16:
                        if (!j(obj2, i9)) {
                            break;
                        } else {
                            r0.q(obj, j7, r0.f4600d.h(obj2, j7));
                            B(obj, i9);
                            break;
                        }
                    case 17:
                        o(obj, obj2, i9);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    case 44:
                    case 45:
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    case 48:
                    case 49:
                        this.l.b(obj, obj2, j7);
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        Class cls = b0.f4545a;
                        q0 q0Var4 = r0.f4600d;
                        Object i11 = q0Var4.i(obj, j7);
                        Object i12 = q0Var4.i(obj2, j7);
                        this.f4533n.getClass();
                        r0.r(obj, j7, M.b(i11, i12));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!k(obj2, i10, i9)) {
                            break;
                        } else {
                            r0.r(obj, j7, r0.f4600d.i(obj2, j7));
                            C(obj, i10, i9);
                            break;
                        }
                    case 60:
                        p(obj, obj2, i9);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!k(obj2, i10, i9)) {
                            break;
                        } else {
                            r0.r(obj, j7, r0.f4600d.i(obj2, j7));
                            C(obj, i10, i9);
                            break;
                        }
                    case 68:
                        p(obj, obj2, i9);
                        break;
                }
                i9 += 3;
            } else {
                if (!this.f4528g) {
                    b0.B(this.m, obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    public final void n(Object obj, int i9, Object obj2, C0438m c0438m, J5.a aVar) {
        long E8 = E(i9) & 1048575;
        Object i10 = r0.f4600d.i(obj, E8);
        M m = this.f4533n;
        if (i10 == null) {
            m.getClass();
            i10 = L.f4518c.b();
            r0.r(obj, E8, i10);
        } else {
            m.getClass();
            if (!((L) i10).b) {
                L b = L.f4518c.b();
                M.b(b, i10);
                r0.r(obj, E8, b);
                i10 = b;
            }
        }
        m.getClass();
        aVar.B((L) i10, ((K) obj2).f4516a, c0438m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0426a0
    public final Object newInstance() {
        this.f4532k.getClass();
        return ((AbstractC0446v) this.f4526e).d(4);
    }

    public final void o(Object obj, Object obj2, int i9) {
        long E8 = E(i9) & 1048575;
        if (!j(obj2, i9)) {
            return;
        }
        q0 q0Var = r0.f4600d;
        Object i10 = q0Var.i(obj, E8);
        Object i11 = q0Var.i(obj2, E8);
        if (i10 != null && i11 != null) {
            r0.r(obj, E8, AbstractC0449y.c(i10, i11));
            B(obj, i9);
        } else if (i11 != null) {
            r0.r(obj, E8, i11);
            B(obj, i9);
        }
    }

    public final void p(Object obj, Object obj2, int i9) {
        int E8 = E(i9);
        int i10 = this.f4523a[i9];
        long j7 = E8 & 1048575;
        if (!k(obj2, i10, i9)) {
            return;
        }
        q0 q0Var = r0.f4600d;
        Object i11 = q0Var.i(obj, j7);
        Object i12 = q0Var.i(obj2, j7);
        if (i11 != null && i12 != null) {
            r0.r(obj, j7, AbstractC0449y.c(i11, i12));
            C(obj, i10, i9);
        } else if (i12 != null) {
            r0.r(obj, j7, i12);
            C(obj, i10, i9);
        }
    }

    public final int v(int i9) {
        if (i9 < this.f4524c || i9 > this.f4525d) {
            return -1;
        }
        int[] iArr = this.f4523a;
        int length = (iArr.length / 3) - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i9 == i13) {
                return i12;
            }
            if (i9 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final void w(Object obj, long j7, J5.a aVar, InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        aVar.w(this.l.c(obj, j7), interfaceC0426a0, c0438m);
    }

    public final void x(Object obj, int i9, J5.a aVar, InterfaceC0426a0 interfaceC0426a0, C0438m c0438m) {
        aVar.E(this.l.c(obj, i9 & 1048575), interfaceC0426a0, c0438m);
    }

    public final void y(Object obj, int i9, J5.a aVar) {
        boolean z8;
        if ((536870912 & i9) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            r0.r(obj, i9 & 1048575, aVar.R());
        } else if (this.f4527f) {
            r0.r(obj, i9 & 1048575, aVar.N());
        } else {
            r0.r(obj, i9 & 1048575, aVar.h());
        }
    }

    public final void z(Object obj, int i9, J5.a aVar) {
        boolean z8;
        if ((536870912 & i9) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        G g9 = this.l;
        if (z8) {
            aVar.Q(g9.c(obj, i9 & 1048575));
        } else {
            aVar.O(g9.c(obj, i9 & 1048575));
        }
    }
}
