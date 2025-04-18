package androidx.datastore.preferences.protobuf;

import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class b1 implements k1 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f1332o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f1333p = b2.p();
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1335c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1336d;

    /* renamed from: e, reason: collision with root package name */
    public final b f1337e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1338f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1339g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f1340h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1341i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1342j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f1343k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f1344l;

    /* renamed from: m, reason: collision with root package name */
    public final t1 f1345m;

    /* renamed from: n, reason: collision with root package name */
    public final w0 f1346n;

    public b1(int[] iArr, Object[] objArr, int i10, int i11, b bVar, boolean z10, int[] iArr2, int i12, int i13, d1 d1Var, p0 p0Var, t1 t1Var, v vVar, w0 w0Var) {
        this.a = iArr;
        this.f1334b = objArr;
        this.f1335c = i10;
        this.f1336d = i11;
        this.f1338f = bVar instanceof e0;
        this.f1339g = z10;
        this.f1340h = iArr2;
        this.f1341i = i12;
        this.f1342j = i13;
        this.f1343k = d1Var;
        this.f1344l = p0Var;
        this.f1345m = t1Var;
        this.f1337e = bVar;
        this.f1346n = w0Var;
    }

    public static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder o10 = a4.j.o("Field ", str, " for ");
            o10.append(cls.getName());
            o10.append(" not found. Known fields are ");
            o10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(o10.toString());
        }
    }

    public static void J(int i10, Object obj, fb.c cVar) {
        if (obj instanceof String) {
            ((r) cVar.f17773c).x0(i10, (String) obj);
        } else {
            cVar.y(i10, (k) obj);
        }
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof e0) {
            return ((e0) obj).j();
        }
        return true;
    }

    public static List l(Object obj, long j3) {
        return (List) b2.o(obj, j3);
    }

    public static b1 r(y0 y0Var, d1 d1Var, p0 p0Var, t1 t1Var, v vVar, w0 w0Var) {
        if (y0Var instanceof j1) {
            return s((j1) y0Var, d1Var, p0Var, t1Var, vVar, w0Var);
        }
        a4.j.t(y0Var);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.b1 s(androidx.datastore.preferences.protobuf.j1 r34, androidx.datastore.preferences.protobuf.d1 r35, androidx.datastore.preferences.protobuf.p0 r36, androidx.datastore.preferences.protobuf.t1 r37, androidx.datastore.preferences.protobuf.v r38, androidx.datastore.preferences.protobuf.w0 r39) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b1.s(androidx.datastore.preferences.protobuf.j1, androidx.datastore.preferences.protobuf.d1, androidx.datastore.preferences.protobuf.p0, androidx.datastore.preferences.protobuf.t1, androidx.datastore.preferences.protobuf.v, androidx.datastore.preferences.protobuf.w0):androidx.datastore.preferences.protobuf.b1");
    }

    public static long t(int i10) {
        return i10 & 1048575;
    }

    public static int u(Object obj, long j3) {
        return ((Integer) b2.o(obj, j3)).intValue();
    }

    public static long v(Object obj, long j3) {
        return ((Long) b2.o(obj, j3)).longValue();
    }

    public final void A(Object obj, int i10, o oVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0 p0Var = this.f1344l;
        if (z10) {
            oVar.z(p0Var.c(obj, i10 & 1048575), true);
        } else {
            oVar.z(p0Var.c(obj, i10 & 1048575), false);
        }
    }

    public final void C(Object obj, int i10) {
        int i11 = this.a[i10 + 2];
        long j3 = 1048575 & i11;
        if (j3 == 1048575) {
            return;
        }
        b2.t(obj, j3, (1 << (i11 >>> 20)) | b2.m(obj, j3));
    }

    public final void D(Object obj, int i10, int i11) {
        b2.t(obj, this.a[i11 + 2] & 1048575, i10);
    }

    public final void E(Object obj, int i10, b bVar) {
        f1333p.putObject(obj, G(i10) & 1048575, bVar);
        C(obj, i10);
    }

    public final void F(Object obj, int i10, int i11, b bVar) {
        f1333p.putObject(obj, G(i11) & 1048575, bVar);
        D(obj, i10, i11);
    }

    public final int G(int i10) {
        return this.a[i10 + 1];
    }

    public final void H(Object obj, fb.c cVar) {
        int i10;
        int[] iArr = this.a;
        int length = iArr.length;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int G = G(i13);
            int i15 = iArr[i13];
            int i16 = (267386880 & G) >>> 20;
            Unsafe unsafe = f1333p;
            if (i16 <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                if (i18 != i12) {
                    i14 = unsafe.getInt(obj, i18);
                    i12 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i10;
            long j3 = G & i11;
            switch (i16) {
                case 0:
                    if ((i14 & i19) == 0) {
                        break;
                    } else {
                        cVar.z(i15, b2.k(obj, j3));
                        continue;
                    }
                case 1:
                    if ((i14 & i19) != 0) {
                        cVar.D(i15, b2.l(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i14 & i19) != 0) {
                        cVar.G(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i14 & i19) != 0) {
                        cVar.N(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i14 & i19) != 0) {
                        cVar.F(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i14 & i19) != 0) {
                        cVar.C(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i14 & i19) != 0) {
                        cVar.B(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i14 & i19) != 0) {
                        cVar.x(i15, b2.g(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i14 & i19) != 0) {
                        J(i15, unsafe.getObject(obj, j3), cVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if ((i14 & i19) != 0) {
                        cVar.H(i15, f(i13), unsafe.getObject(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i14 & i19) != 0) {
                        cVar.y(i15, (k) unsafe.getObject(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i14 & i19) != 0) {
                        cVar.M(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i14 & i19) != 0) {
                        cVar.A(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i14 & i19) != 0) {
                        cVar.I(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i14 & i19) != 0) {
                        cVar.J(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i14 & i19) != 0) {
                        cVar.K(i15, unsafe.getInt(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i14 & i19) != 0) {
                        cVar.L(i15, unsafe.getLong(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i14 & i19) != 0) {
                        cVar.E(i15, f(i13), unsafe.getObject(obj, j3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    l1.F(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 19:
                    l1.J(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 20:
                    l1.M(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 21:
                    l1.U(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 22:
                    l1.L(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 23:
                    l1.I(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 24:
                    l1.H(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 25:
                    l1.D(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    continue;
                case 26:
                    l1.S(iArr[i13], (List) unsafe.getObject(obj, j3), cVar);
                    break;
                case 27:
                    l1.N(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, f(i13));
                    break;
                case 28:
                    l1.E(iArr[i13], (List) unsafe.getObject(obj, j3), cVar);
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    l1.T(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    break;
                case 30:
                    l1.G(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    l1.O(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    break;
                case 32:
                    l1.P(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    break;
                case 33:
                    l1.Q(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    l1.R(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, false);
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    l1.F(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case 36:
                    l1.J(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    l1.M(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    l1.U(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    l1.L(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    l1.I(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    l1.H(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    l1.D(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    l1.T(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    l1.G(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    l1.O(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    l1.P(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    l1.Q(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case 48:
                    l1.R(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, true);
                    break;
                case 49:
                    l1.K(iArr[i13], (List) unsafe.getObject(obj, j3), cVar, f(i13));
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    I(cVar, i15, unsafe.getObject(obj, j3), i13);
                    break;
                case 51:
                    if (k(obj, i15, i13)) {
                        cVar.z(i15, ((Double) b2.o(obj, j3)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (k(obj, i15, i13)) {
                        cVar.D(i15, ((Float) b2.o(obj, j3)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (k(obj, i15, i13)) {
                        cVar.G(i15, v(obj, j3));
                        break;
                    }
                    break;
                case 54:
                    if (k(obj, i15, i13)) {
                        cVar.N(i15, v(obj, j3));
                        break;
                    }
                    break;
                case 55:
                    if (k(obj, i15, i13)) {
                        cVar.F(i15, u(obj, j3));
                        break;
                    }
                    break;
                case 56:
                    if (k(obj, i15, i13)) {
                        cVar.C(i15, v(obj, j3));
                        break;
                    }
                    break;
                case 57:
                    if (k(obj, i15, i13)) {
                        cVar.B(i15, u(obj, j3));
                        break;
                    }
                    break;
                case 58:
                    if (k(obj, i15, i13)) {
                        cVar.x(i15, ((Boolean) b2.o(obj, j3)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (k(obj, i15, i13)) {
                        J(i15, unsafe.getObject(obj, j3), cVar);
                        break;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (k(obj, i15, i13)) {
                        cVar.H(i15, f(i13), unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (k(obj, i15, i13)) {
                        cVar.y(i15, (k) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 62:
                    if (k(obj, i15, i13)) {
                        cVar.M(i15, u(obj, j3));
                        break;
                    }
                    break;
                case 63:
                    if (k(obj, i15, i13)) {
                        cVar.A(i15, u(obj, j3));
                        break;
                    }
                    break;
                case 64:
                    if (k(obj, i15, i13)) {
                        cVar.I(i15, u(obj, j3));
                        break;
                    }
                    break;
                case 65:
                    if (k(obj, i15, i13)) {
                        cVar.J(i15, v(obj, j3));
                        break;
                    }
                    break;
                case 66:
                    if (k(obj, i15, i13)) {
                        cVar.K(i15, u(obj, j3));
                        break;
                    }
                    break;
                case 67:
                    if (k(obj, i15, i13)) {
                        cVar.L(i15, v(obj, j3));
                        break;
                    }
                    break;
                case 68:
                    if (k(obj, i15, i13)) {
                        cVar.E(i15, f(i13), unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        this.f1345m.getClass();
        ((e0) obj).unknownFields.d(cVar);
    }

    public final void I(fb.c cVar, int i10, Object obj, int i11) {
        if (obj != null) {
            Object obj2 = this.f1334b[(i11 / 3) * 2];
            this.f1346n.getClass();
            ic.t tVar = ((u0) obj2).a;
            ((r) cVar.f17773c).getClass();
            for (Map.Entry entry : ((v0) obj).entrySet()) {
                ((r) cVar.f17773c).z0(i10, 2);
                ((r) cVar.f17773c).B0(u0.a(tVar, entry.getKey(), entry.getValue()));
                r rVar = (r) cVar.f17773c;
                Object key = entry.getKey();
                Object value = entry.getValue();
                x.b(rVar, (j2) tVar.a, 1, key);
                x.b(rVar, (j2) tVar.f19575c, 2, value);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final void a(Object obj, fb.c cVar) {
        cVar.getClass();
        if (this.f1339g) {
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int G = G(i10);
                int i11 = iArr[i10];
                switch ((267386880 & G) >>> 20) {
                    case 0:
                        if (i(obj, i10)) {
                            cVar.z(i11, b2.k(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (i(obj, i10)) {
                            cVar.D(i11, b2.l(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (i(obj, i10)) {
                            cVar.G(i11, b2.n(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (i(obj, i10)) {
                            cVar.N(i11, b2.n(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (i(obj, i10)) {
                            cVar.F(i11, b2.m(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (i(obj, i10)) {
                            cVar.C(i11, b2.n(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (i(obj, i10)) {
                            cVar.B(i11, b2.m(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (i(obj, i10)) {
                            cVar.x(i11, b2.g(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (i(obj, i10)) {
                            J(i11, b2.o(obj, G & 1048575), cVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (i(obj, i10)) {
                            cVar.H(i11, f(i10), b2.o(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (i(obj, i10)) {
                            cVar.y(i11, (k) b2.o(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (i(obj, i10)) {
                            cVar.M(i11, b2.m(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (i(obj, i10)) {
                            cVar.A(i11, b2.m(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (i(obj, i10)) {
                            cVar.I(i11, b2.m(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (i(obj, i10)) {
                            cVar.J(i11, b2.n(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (i(obj, i10)) {
                            cVar.K(i11, b2.m(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (i(obj, i10)) {
                            cVar.L(i11, b2.n(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (i(obj, i10)) {
                            cVar.E(i11, f(i10), b2.o(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        l1.F(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 19:
                        l1.J(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 20:
                        l1.M(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 21:
                        l1.U(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 22:
                        l1.L(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 23:
                        l1.I(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 24:
                        l1.H(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 25:
                        l1.D(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 26:
                        l1.S(i11, (List) b2.o(obj, G & 1048575), cVar);
                        break;
                    case 27:
                        l1.N(i11, (List) b2.o(obj, G & 1048575), cVar, f(i10));
                        break;
                    case 28:
                        l1.E(i11, (List) b2.o(obj, G & 1048575), cVar);
                        break;
                    case NOTIFICATION_REDIRECT_VALUE:
                        l1.T(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 30:
                        l1.G(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case TEMPLATE_HTML_SIZE_VALUE:
                        l1.O(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 32:
                        l1.P(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case 33:
                        l1.Q(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        l1.R(i11, (List) b2.o(obj, G & 1048575), cVar, false);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        l1.F(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case 36:
                        l1.J(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        l1.M(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        l1.U(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        l1.L(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                        l1.I(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        l1.H(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        l1.D(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        l1.T(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        l1.G(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        l1.O(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        l1.P(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        l1.Q(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case 48:
                        l1.R(i11, (List) b2.o(obj, G & 1048575), cVar, true);
                        break;
                    case 49:
                        l1.K(i11, (List) b2.o(obj, G & 1048575), cVar, f(i10));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        I(cVar, i11, b2.o(obj, G & 1048575), i10);
                        break;
                    case 51:
                        if (k(obj, i11, i10)) {
                            cVar.z(i11, ((Double) b2.o(obj, G & 1048575)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (k(obj, i11, i10)) {
                            cVar.D(i11, ((Float) b2.o(obj, G & 1048575)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (k(obj, i11, i10)) {
                            cVar.G(i11, v(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (k(obj, i11, i10)) {
                            cVar.N(i11, v(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (k(obj, i11, i10)) {
                            cVar.F(i11, u(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (k(obj, i11, i10)) {
                            cVar.C(i11, v(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (k(obj, i11, i10)) {
                            cVar.B(i11, u(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (k(obj, i11, i10)) {
                            cVar.x(i11, ((Boolean) b2.o(obj, G & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (k(obj, i11, i10)) {
                            J(i11, b2.o(obj, G & 1048575), cVar);
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (k(obj, i11, i10)) {
                            cVar.H(i11, f(i10), b2.o(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (k(obj, i11, i10)) {
                            cVar.y(i11, (k) b2.o(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (k(obj, i11, i10)) {
                            cVar.M(i11, u(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (k(obj, i11, i10)) {
                            cVar.A(i11, u(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (k(obj, i11, i10)) {
                            cVar.I(i11, u(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (k(obj, i11, i10)) {
                            cVar.J(i11, v(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (k(obj, i11, i10)) {
                            cVar.K(i11, u(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (k(obj, i11, i10)) {
                            cVar.L(i11, v(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (k(obj, i11, i10)) {
                            cVar.E(i11, f(i10), b2.o(obj, G & 1048575));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f1345m.getClass();
            ((e0) obj).unknownFields.d(cVar);
            return;
        }
        H(obj, cVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0064. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.k1
    public final void b(Object obj, o oVar, u uVar) {
        uVar.getClass();
        if (j(obj)) {
            t1 t1Var = this.f1345m;
            int[] iArr = this.f1340h;
            int i10 = this.f1342j;
            int i11 = this.f1341i;
            s1 s1Var = null;
            while (true) {
                try {
                    int d10 = oVar.d();
                    int w10 = w(d10);
                    if (w10 < 0) {
                        if (d10 == Integer.MAX_VALUE) {
                            while (i11 < i10) {
                                d(obj, iArr[i11], s1Var);
                                i11++;
                            }
                            if (s1Var == null) {
                                return;
                            }
                        } else {
                            t1Var.getClass();
                            if (s1Var == null) {
                                s1Var = t1.a(obj);
                            }
                            if (!t1.c(s1Var, oVar)) {
                                while (i11 < i10) {
                                    d(obj, iArr[i11], s1Var);
                                    i11++;
                                }
                                if (s1Var == null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        int G = G(w10);
                        int i12 = (267386880 & G) >>> 20;
                        p0 p0Var = this.f1344l;
                        switch (i12) {
                            case 0:
                                oVar.E(1);
                                b2.f1348c.m(obj, 1048575 & G, ((n) oVar.f1447d).h());
                                C(obj, w10);
                            case 1:
                                oVar.E(5);
                                b2.f1348c.n(obj, 1048575 & G, ((n) oVar.f1447d).l());
                                C(obj, w10);
                            case 2:
                                b2.u(obj, 1048575 & G, oVar.t());
                                C(obj, w10);
                            case 3:
                                oVar.E(0);
                                b2.u(obj, 1048575 & G, ((n) oVar.f1447d).w());
                                C(obj, w10);
                            case 4:
                                oVar.E(0);
                                b2.t(obj, 1048575 & G, ((n) oVar.f1447d).m());
                                C(obj, w10);
                            case 5:
                                b2.u(obj, 1048575 & G, oVar.p());
                                C(obj, w10);
                            case 6:
                                b2.t(obj, 1048575 & G, oVar.n());
                                C(obj, w10);
                            case 7:
                                oVar.E(0);
                                b2.f1348c.k(obj, 1048575 & G, ((n) oVar.f1447d).f());
                                C(obj, w10);
                            case 8:
                                z(obj, G, oVar);
                                C(obj, w10);
                            case 9:
                                b bVar = (b) p(obj, w10);
                                k1 f10 = f(w10);
                                oVar.E(2);
                                oVar.g(bVar, f10, uVar);
                                E(obj, w10, bVar);
                            case 10:
                                b2.v(obj, 1048575 & G, oVar.i());
                                C(obj, w10);
                            case 11:
                                b2.t(obj, 1048575 & G, oVar.A());
                                C(obj, w10);
                            case 12:
                                oVar.E(0);
                                int i13 = ((n) oVar.f1447d).i();
                                e(w10);
                                b2.t(obj, t(G), i13);
                                C(obj, w10);
                            case 13:
                                oVar.E(5);
                                b2.t(obj, 1048575 & G, ((n) oVar.f1447d).o());
                                C(obj, w10);
                            case 14:
                                oVar.E(1);
                                b2.u(obj, 1048575 & G, ((n) oVar.f1447d).p());
                                C(obj, w10);
                            case 15:
                                oVar.E(0);
                                b2.t(obj, 1048575 & G, ((n) oVar.f1447d).q());
                                C(obj, w10);
                            case 16:
                                oVar.E(0);
                                b2.u(obj, 1048575 & G, ((n) oVar.f1447d).r());
                                C(obj, w10);
                            case 17:
                                b bVar2 = (b) p(obj, w10);
                                k1 f11 = f(w10);
                                oVar.E(3);
                                oVar.f(bVar2, f11, uVar);
                                E(obj, w10, bVar2);
                            case 18:
                                oVar.k(p0Var.c(obj, 1048575 & G));
                            case 19:
                                oVar.r(p0Var.c(obj, 1048575 & G));
                            case 20:
                                oVar.u(p0Var.c(obj, 1048575 & G));
                            case 21:
                                oVar.C(p0Var.c(obj, 1048575 & G));
                            case 22:
                                oVar.s(p0Var.c(obj, 1048575 & G));
                            case 23:
                                oVar.q(p0Var.c(obj, 1048575 & G));
                            case 24:
                                oVar.o(p0Var.c(obj, 1048575 & G));
                            case 25:
                                oVar.h(p0Var.c(obj, 1048575 & G));
                            case 26:
                                A(obj, G, oVar);
                            case 27:
                                y(obj, G, oVar, f(w10), uVar);
                            case 28:
                                oVar.j(p0Var.c(obj, 1048575 & G));
                            case NOTIFICATION_REDIRECT_VALUE:
                                oVar.B(p0Var.c(obj, 1048575 & G));
                            case 30:
                                List c10 = p0Var.c(obj, 1048575 & G);
                                oVar.l(c10);
                                e(w10);
                                l1.z(obj, d10, c10, s1Var, t1Var);
                            case TEMPLATE_HTML_SIZE_VALUE:
                                oVar.v(p0Var.c(obj, 1048575 & G));
                            case 32:
                                oVar.w(p0Var.c(obj, 1048575 & G));
                            case 33:
                                oVar.x(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                                oVar.y(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                                oVar.k(p0Var.c(obj, 1048575 & G));
                            case 36:
                                oVar.r(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                                oVar.u(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                                oVar.C(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                                oVar.s(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                                oVar.q(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                                oVar.o(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                                oVar.h(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                oVar.B(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                                List c11 = p0Var.c(obj, 1048575 & G);
                                oVar.l(c11);
                                e(w10);
                                l1.z(obj, d10, c11, s1Var, t1Var);
                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                                oVar.v(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                oVar.w(p0Var.c(obj, 1048575 & G));
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                oVar.x(p0Var.c(obj, 1048575 & G));
                            case 48:
                                oVar.y(p0Var.c(obj, 1048575 & G));
                            case 49:
                                x(obj, 1048575 & G, oVar, f(w10), uVar);
                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                m(obj, w10, this.f1334b[(w10 / 3) * 2], uVar, oVar);
                            case 51:
                                oVar.E(1);
                                b2.v(obj, 1048575 & G, Double.valueOf(((n) oVar.f1447d).h()));
                                D(obj, d10, w10);
                            case 52:
                                oVar.E(5);
                                b2.v(obj, 1048575 & G, Float.valueOf(((n) oVar.f1447d).l()));
                                D(obj, d10, w10);
                            case 53:
                                b2.v(obj, 1048575 & G, Long.valueOf(oVar.t()));
                                D(obj, d10, w10);
                            case 54:
                                oVar.E(0);
                                b2.v(obj, 1048575 & G, Long.valueOf(((n) oVar.f1447d).w()));
                                D(obj, d10, w10);
                            case 55:
                                oVar.E(0);
                                b2.v(obj, 1048575 & G, Integer.valueOf(((n) oVar.f1447d).m()));
                                D(obj, d10, w10);
                            case 56:
                                b2.v(obj, 1048575 & G, Long.valueOf(oVar.p()));
                                D(obj, d10, w10);
                            case 57:
                                b2.v(obj, 1048575 & G, Integer.valueOf(oVar.n()));
                                D(obj, d10, w10);
                            case 58:
                                oVar.E(0);
                                b2.v(obj, 1048575 & G, Boolean.valueOf(((n) oVar.f1447d).f()));
                                D(obj, d10, w10);
                            case 59:
                                z(obj, G, oVar);
                                D(obj, d10, w10);
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                b bVar3 = (b) q(obj, d10, w10);
                                k1 f12 = f(w10);
                                oVar.E(2);
                                oVar.g(bVar3, f12, uVar);
                                F(obj, d10, w10, bVar3);
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                b2.v(obj, 1048575 & G, oVar.i());
                                D(obj, d10, w10);
                            case 62:
                                b2.v(obj, 1048575 & G, Integer.valueOf(oVar.A()));
                                D(obj, d10, w10);
                            case 63:
                                oVar.E(0);
                                int i14 = ((n) oVar.f1447d).i();
                                e(w10);
                                b2.v(obj, t(G), Integer.valueOf(i14));
                                D(obj, d10, w10);
                            case 64:
                                long t5 = t(G);
                                oVar.E(5);
                                b2.v(obj, t5, Integer.valueOf(((n) oVar.f1447d).o()));
                                D(obj, d10, w10);
                            case 65:
                                long t10 = t(G);
                                oVar.E(1);
                                b2.v(obj, t10, Long.valueOf(((n) oVar.f1447d).p()));
                                D(obj, d10, w10);
                            case 66:
                                long t11 = t(G);
                                oVar.E(0);
                                b2.v(obj, t11, Integer.valueOf(((n) oVar.f1447d).q()));
                                D(obj, d10, w10);
                            case 67:
                                long t12 = t(G);
                                oVar.E(0);
                                b2.v(obj, t12, Long.valueOf(((n) oVar.f1447d).r()));
                                D(obj, d10, w10);
                            case 68:
                                b bVar4 = (b) q(obj, d10, w10);
                                k1 f13 = f(w10);
                                oVar.E(3);
                                oVar.f(bVar4, f13, uVar);
                                F(obj, d10, w10, bVar4);
                            default:
                                if (s1Var == null) {
                                    try {
                                        t1Var.getClass();
                                        s1Var = t1.a(obj);
                                    } catch (i0 unused) {
                                        t1Var.getClass();
                                        if (s1Var == null) {
                                            s1Var = t1.a(obj);
                                        }
                                        if (!t1.c(s1Var, oVar)) {
                                            while (i11 < i10) {
                                                d(obj, iArr[i11], s1Var);
                                                i11++;
                                            }
                                            if (s1Var == null) {
                                                return;
                                            }
                                            t1Var.getClass();
                                            t1.d(obj, s1Var);
                                            return;
                                        }
                                    }
                                }
                                t1Var.getClass();
                                if (!t1.c(s1Var, oVar)) {
                                    while (i11 < i10) {
                                        d(obj, iArr[i11], s1Var);
                                        i11++;
                                    }
                                    if (s1Var == null) {
                                        return;
                                    }
                                }
                        }
                    }
                } catch (Throwable th2) {
                    while (i11 < i10) {
                        d(obj, iArr[i11], s1Var);
                        i11++;
                    }
                    if (s1Var != null) {
                        t1Var.getClass();
                        t1.d(obj, s1Var);
                    }
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException(eb.j.j("Mutating immutable message: ", obj));
        }
    }

    public final boolean c(Object obj, Object obj2, int i10) {
        return i(obj, i10) == i(obj2, i10);
    }

    public final void d(Object obj, int i10, Object obj2) {
        int i11 = this.a[i10];
        if (b2.o(obj, G(i10) & 1048575) == null) {
            return;
        }
        e(i10);
    }

    public final void e(int i10) {
        a4.j.t(this.f1334b[((i10 / 3) * 2) + 1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (androidx.datastore.preferences.protobuf.l1.C(androidx.datastore.preferences.protobuf.b2.o(r11, r7), androidx.datastore.preferences.protobuf.b2.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (androidx.datastore.preferences.protobuf.l1.C(androidx.datastore.preferences.protobuf.b2.o(r11, r7), androidx.datastore.preferences.protobuf.b2.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.n(r11, r7) == androidx.datastore.preferences.protobuf.b2.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.m(r11, r7) == androidx.datastore.preferences.protobuf.b2.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.n(r11, r7) == androidx.datastore.preferences.protobuf.b2.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.m(r11, r7) == androidx.datastore.preferences.protobuf.b2.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.m(r11, r7) == androidx.datastore.preferences.protobuf.b2.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.m(r11, r7) == androidx.datastore.preferences.protobuf.b2.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        if (androidx.datastore.preferences.protobuf.l1.C(androidx.datastore.preferences.protobuf.b2.o(r11, r7), androidx.datastore.preferences.protobuf.b2.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        if (androidx.datastore.preferences.protobuf.l1.C(androidx.datastore.preferences.protobuf.b2.o(r11, r7), androidx.datastore.preferences.protobuf.b2.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (androidx.datastore.preferences.protobuf.l1.C(androidx.datastore.preferences.protobuf.b2.o(r11, r7), androidx.datastore.preferences.protobuf.b2.o(r12, r7)) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.g(r11, r7) == androidx.datastore.preferences.protobuf.b2.g(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.m(r11, r7) == androidx.datastore.preferences.protobuf.b2.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.n(r11, r7) == androidx.datastore.preferences.protobuf.b2.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.m(r11, r7) == androidx.datastore.preferences.protobuf.b2.m(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.n(r11, r7) == androidx.datastore.preferences.protobuf.b2.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
    
        if (androidx.datastore.preferences.protobuf.b2.n(r11, r7) == androidx.datastore.preferences.protobuf.b2.n(r12, r7)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:
    
        if (java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.b2.l(r11, r7)) == java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.b2.l(r12, r7))) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        if (java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.b2.k(r11, r7)) == java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.b2.k(r12, r7))) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc A[LOOP:0: B:2:0x0005->B:89:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b1.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final k1 f(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f1334b;
        k1 k1Var = (k1) objArr[i11];
        if (k1Var != null) {
            return k1Var;
        }
        k1 a = h1.f1372c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a;
        return a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0035. Please report as an issue. */
    public final int g(Object obj) {
        int i10;
        int P;
        int c02;
        int i11;
        int e02;
        int g02;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i13 < iArr.length) {
                int G = G(i13);
                int i16 = iArr[i13];
                int i17 = (267386880 & G) >>> 20;
                Unsafe unsafe = f1333p;
                if (i17 <= 17) {
                    int i18 = iArr[i13 + 2];
                    int i19 = i18 & 1048575;
                    i10 = 1 << (i18 >>> 20);
                    if (i19 != i12) {
                        i15 = unsafe.getInt(obj, i19);
                        i12 = i19;
                    }
                } else {
                    i10 = 0;
                }
                long j3 = G & 1048575;
                switch (i17) {
                    case 0:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.P(i16);
                            i14 += P;
                            break;
                        }
                    case 1:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.T(i16);
                            i14 += P;
                            break;
                        }
                    case 2:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.X(i16, unsafe.getLong(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 3:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.h0(i16, unsafe.getLong(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 4:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.V(i16, unsafe.getInt(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 5:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.S(i16);
                            i14 += P;
                            break;
                        }
                    case 6:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.R(i16);
                            i14 += P;
                            break;
                        }
                    case 7:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.N(i16);
                            i14 += P;
                            break;
                        }
                    case 8:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j3);
                            if (object instanceof k) {
                                c02 = r.O(i16, (k) object);
                            } else {
                                c02 = r.c0(i16, (String) object);
                            }
                            i14 += c02;
                            break;
                        }
                    case 9:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = l1.o(i16, f(i13), unsafe.getObject(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 10:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.O(i16, (k) unsafe.getObject(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 11:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.f0(i16, unsafe.getInt(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 12:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.Q(i16, unsafe.getInt(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 13:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.Y(i16);
                            i14 += P;
                            break;
                        }
                    case 14:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.Z(i16);
                            i14 += P;
                            break;
                        }
                    case 15:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.a0(i16, unsafe.getInt(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 16:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.b0(i16, unsafe.getLong(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 17:
                        if ((i10 & i15) == 0) {
                            break;
                        } else {
                            P = r.U(i16, (b) unsafe.getObject(obj, j3), f(i13));
                            i14 += P;
                            break;
                        }
                    case 18:
                        P = l1.h(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 19:
                        P = l1.f(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 20:
                        P = l1.m(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 21:
                        P = l1.x(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 22:
                        P = l1.k(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 23:
                        P = l1.h(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 24:
                        P = l1.f(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 25:
                        P = l1.a(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 26:
                        P = l1.u(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 27:
                        P = l1.p(i16, (List) unsafe.getObject(obj, j3), f(i13));
                        i14 += P;
                        break;
                    case 28:
                        P = l1.c(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case NOTIFICATION_REDIRECT_VALUE:
                        P = l1.v(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 30:
                        P = l1.d(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case TEMPLATE_HTML_SIZE_VALUE:
                        P = l1.f(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 32:
                        P = l1.h(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case 33:
                        P = l1.q(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        P = l1.s(i16, (List) unsafe.getObject(obj, j3));
                        i14 += P;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        i11 = l1.i((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case 36:
                        i11 = l1.g((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        i11 = l1.n((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        i11 = l1.y((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        i11 = l1.l((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                        i11 = l1.i((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        i11 = l1.g((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        i11 = l1.b((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        i11 = l1.w((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        i11 = l1.e((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        i11 = l1.g((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        i11 = l1.i((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        i11 = l1.r((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case 48:
                        i11 = l1.t((List) unsafe.getObject(obj, j3));
                        if (i11 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i16);
                            g02 = r.g0(i11);
                            i14 = a4.j.a(g02, e02, i11, i14);
                            break;
                        }
                    case 49:
                        P = l1.j(i16, (List) unsafe.getObject(obj, j3), f(i13));
                        i14 += P;
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        Object object2 = unsafe.getObject(obj, j3);
                        Object obj2 = this.f1334b[(i13 / 3) * 2];
                        this.f1346n.getClass();
                        P = w0.a(i16, object2, obj2);
                        i14 += P;
                        break;
                    case 51:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.P(i16);
                            i14 += P;
                            break;
                        }
                    case 52:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.T(i16);
                            i14 += P;
                            break;
                        }
                    case 53:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.X(i16, v(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 54:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.h0(i16, v(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 55:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.V(i16, u(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 56:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.S(i16);
                            i14 += P;
                            break;
                        }
                    case 57:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.R(i16);
                            i14 += P;
                            break;
                        }
                    case 58:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.N(i16);
                            i14 += P;
                            break;
                        }
                    case 59:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j3);
                            if (object3 instanceof k) {
                                c02 = r.O(i16, (k) object3);
                            } else {
                                c02 = r.c0(i16, (String) object3);
                            }
                            i14 += c02;
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = l1.o(i16, f(i13), unsafe.getObject(obj, j3));
                            i14 += P;
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.O(i16, (k) unsafe.getObject(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 62:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.f0(i16, u(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 63:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.Q(i16, u(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 64:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.Y(i16);
                            i14 += P;
                            break;
                        }
                    case 65:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.Z(i16);
                            i14 += P;
                            break;
                        }
                    case 66:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.a0(i16, u(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 67:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.b0(i16, v(obj, j3));
                            i14 += P;
                            break;
                        }
                    case 68:
                        if (!k(obj, i16, i13)) {
                            break;
                        } else {
                            P = r.U(i16, (b) unsafe.getObject(obj, j3), f(i13));
                            i14 += P;
                            break;
                        }
                }
                i13 += 3;
            } else {
                this.f1345m.getClass();
                return ((e0) obj).unknownFields.b() + i14;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final int getSerializedSize(Object obj) {
        return this.f1339g ? h(obj) : g(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    public final int h(Object obj) {
        int P;
        int c02;
        int i10;
        int e02;
        int g02;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i11 < iArr.length) {
                int G = G(i11);
                int i13 = (267386880 & G) >>> 20;
                int i14 = iArr[i11];
                long j3 = G & 1048575;
                if (i13 >= y.f1481c.a() && i13 <= y.f1482d.a()) {
                    int i15 = iArr[i11 + 2];
                }
                Unsafe unsafe = f1333p;
                switch (i13) {
                    case 0:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.P(i14);
                            i12 += P;
                            break;
                        }
                    case 1:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.T(i14);
                            i12 += P;
                            break;
                        }
                    case 2:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.X(i14, b2.n(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 3:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.h0(i14, b2.n(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 4:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.V(i14, b2.m(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 5:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.S(i14);
                            i12 += P;
                            break;
                        }
                    case 6:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.R(i14);
                            i12 += P;
                            break;
                        }
                    case 7:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.N(i14);
                            i12 += P;
                            break;
                        }
                    case 8:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            Object o10 = b2.o(obj, j3);
                            if (o10 instanceof k) {
                                c02 = r.O(i14, (k) o10);
                            } else {
                                c02 = r.c0(i14, (String) o10);
                            }
                            i12 = c02 + i12;
                            break;
                        }
                    case 9:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = l1.o(i14, f(i11), b2.o(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 10:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.O(i14, (k) b2.o(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 11:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.f0(i14, b2.m(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 12:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.Q(i14, b2.m(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 13:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.Y(i14);
                            i12 += P;
                            break;
                        }
                    case 14:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.Z(i14);
                            i12 += P;
                            break;
                        }
                    case 15:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.a0(i14, b2.m(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 16:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.b0(i14, b2.n(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 17:
                        if (!i(obj, i11)) {
                            break;
                        } else {
                            P = r.U(i14, (b) b2.o(obj, j3), f(i11));
                            i12 += P;
                            break;
                        }
                    case 18:
                        P = l1.h(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 19:
                        P = l1.f(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 20:
                        P = l1.m(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 21:
                        P = l1.x(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 22:
                        P = l1.k(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 23:
                        P = l1.h(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 24:
                        P = l1.f(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 25:
                        P = l1.a(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 26:
                        P = l1.u(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 27:
                        P = l1.p(i14, l(obj, j3), f(i11));
                        i12 += P;
                        break;
                    case 28:
                        P = l1.c(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case NOTIFICATION_REDIRECT_VALUE:
                        P = l1.v(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 30:
                        P = l1.d(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case TEMPLATE_HTML_SIZE_VALUE:
                        P = l1.f(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 32:
                        P = l1.h(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case 33:
                        P = l1.q(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        P = l1.s(i14, l(obj, j3));
                        i12 += P;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        i10 = l1.i((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case 36:
                        i10 = l1.g((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        i10 = l1.n((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        i10 = l1.y((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        i10 = l1.l((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                        i10 = l1.i((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        i10 = l1.g((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        i10 = l1.b((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        i10 = l1.w((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        i10 = l1.e((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        i10 = l1.g((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        i10 = l1.i((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        i10 = l1.r((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case 48:
                        i10 = l1.t((List) unsafe.getObject(obj, j3));
                        if (i10 <= 0) {
                            break;
                        } else {
                            e02 = r.e0(i14);
                            g02 = r.g0(i10);
                            i12 = a4.j.a(g02, e02, i10, i12);
                            break;
                        }
                    case 49:
                        P = l1.j(i14, l(obj, j3), f(i11));
                        i12 += P;
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        Object o11 = b2.o(obj, j3);
                        Object obj2 = this.f1334b[(i11 / 3) * 2];
                        this.f1346n.getClass();
                        P = w0.a(i14, o11, obj2);
                        i12 += P;
                        break;
                    case 51:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.P(i14);
                            i12 += P;
                            break;
                        }
                    case 52:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.T(i14);
                            i12 += P;
                            break;
                        }
                    case 53:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.X(i14, v(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 54:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.h0(i14, v(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 55:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.V(i14, u(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 56:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.S(i14);
                            i12 += P;
                            break;
                        }
                    case 57:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.R(i14);
                            i12 += P;
                            break;
                        }
                    case 58:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.N(i14);
                            i12 += P;
                            break;
                        }
                    case 59:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            Object o12 = b2.o(obj, j3);
                            if (o12 instanceof k) {
                                c02 = r.O(i14, (k) o12);
                            } else {
                                c02 = r.c0(i14, (String) o12);
                            }
                            i12 = c02 + i12;
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = l1.o(i14, f(i11), b2.o(obj, j3));
                            i12 += P;
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.O(i14, (k) b2.o(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 62:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.f0(i14, u(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 63:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.Q(i14, u(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 64:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.Y(i14);
                            i12 += P;
                            break;
                        }
                    case 65:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.Z(i14);
                            i12 += P;
                            break;
                        }
                    case 66:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.a0(i14, u(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 67:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.b0(i14, v(obj, j3));
                            i12 += P;
                            break;
                        }
                    case 68:
                        if (!k(obj, i14, i11)) {
                            break;
                        } else {
                            P = r.U(i14, (b) b2.o(obj, j3), f(i11));
                            i12 += P;
                            break;
                        }
                }
                i11 += 3;
            } else {
                this.f1345m.getClass();
                return ((e0) obj).unknownFields.b() + i12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f2, code lost:
    
        if (r4 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (r4 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f5, code lost:
    
        r8 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01f6, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b1.hashCode(java.lang.Object):int");
    }

    public final boolean i(Object obj, int i10) {
        boolean equals;
        int i11 = this.a[i10 + 2];
        long j3 = i11 & 1048575;
        if (j3 == 1048575) {
            int G = G(i10);
            long j10 = G & 1048575;
            switch ((G & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(b2.k(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(b2.l(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (b2.n(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (b2.n(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (b2.m(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (b2.n(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (b2.m(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return b2.g(obj, j10);
                case 8:
                    Object o10 = b2.o(obj, j10);
                    if (o10 instanceof String) {
                        equals = ((String) o10).isEmpty();
                        break;
                    } else if (o10 instanceof k) {
                        equals = k.f1389c.equals(o10);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (b2.o(obj, j10) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = k.f1389c.equals(b2.o(obj, j10));
                    break;
                case 11:
                    if (b2.m(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (b2.m(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (b2.m(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (b2.n(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (b2.m(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (b2.n(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (b2.o(obj, j10) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((b2.m(obj, j3) & (1 << (i11 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final boolean isInitialized(Object obj) {
        boolean z10;
        boolean z11;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= this.f1341i) {
                return true;
            }
            int i13 = this.f1340h[i11];
            int[] iArr = this.a;
            int i14 = iArr[i13];
            int G = G(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i12 = f1333p.getInt(obj, i16);
                }
                i10 = i16;
            }
            if ((268435456 & G) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i10 == 1048575) {
                    z11 = i(obj, i13);
                } else if ((i12 & i17) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
            }
            int i18 = (267386880 & G) >>> 20;
            if (i18 != 9 && i18 != 17) {
                if (i18 != 27) {
                    if (i18 != 60 && i18 != 68) {
                        if (i18 != 49) {
                            if (i18 != 50) {
                                continue;
                            } else {
                                Object o10 = b2.o(obj, G & 1048575);
                                this.f1346n.getClass();
                                v0 v0Var = (v0) o10;
                                if (!v0Var.isEmpty()) {
                                    if (((j2) ((u0) this.f1334b[(i13 / 3) * 2]).a.f19575c).f1387b == k2.MESSAGE) {
                                        Iterator it = v0Var.values().iterator();
                                        k1 k1Var = null;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (k1Var == null) {
                                                k1Var = h1.f1372c.a(next.getClass());
                                            }
                                            if (!k1Var.isInitialized(next)) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!z12) {
                                    return false;
                                }
                            }
                        }
                    } else if (k(obj, i14, i13) && !f(i13).isInitialized(b2.o(obj, G & 1048575))) {
                        return false;
                    }
                }
                List list = (List) b2.o(obj, G & 1048575);
                if (!list.isEmpty()) {
                    k1 f10 = f(i13);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            break;
                        }
                        if (!f10.isInitialized(list.get(i19))) {
                            z12 = false;
                            break;
                        }
                        i19++;
                    }
                }
                if (!z12) {
                    return false;
                }
            } else {
                if (i10 == 1048575) {
                    z12 = i(obj, i13);
                } else if ((i17 & i12) == 0) {
                    z12 = false;
                }
                if (z12 && !f(i13).isInitialized(b2.o(obj, G & 1048575))) {
                    return false;
                }
            }
            i11++;
        }
    }

    public final boolean k(Object obj, int i10, int i11) {
        if (b2.m(obj, this.a[i11 + 2] & 1048575) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        r9.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r8, int r9, java.lang.Object r10, androidx.datastore.preferences.protobuf.u r11, androidx.datastore.preferences.protobuf.o r12) {
        /*
            r7 = this;
            int r9 = r7.G(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.b2.o(r8, r0)
            r2 = 1
            androidx.datastore.preferences.protobuf.w0 r3 = r7.f1346n
            if (r9 != 0) goto L1f
            r3.getClass()
            androidx.datastore.preferences.protobuf.v0 r9 = androidx.datastore.preferences.protobuf.v0.f1473c
            androidx.datastore.preferences.protobuf.v0 r9 = r9.b()
            androidx.datastore.preferences.protobuf.b2.v(r8, r0, r9)
            goto L37
        L1f:
            r3.getClass()
            r4 = r9
            androidx.datastore.preferences.protobuf.v0 r4 = (androidx.datastore.preferences.protobuf.v0) r4
            boolean r4 = r4.f1474b
            r4 = r4 ^ r2
            if (r4 == 0) goto L37
            androidx.datastore.preferences.protobuf.v0 r4 = androidx.datastore.preferences.protobuf.v0.f1473c
            androidx.datastore.preferences.protobuf.v0 r4 = r4.b()
            androidx.datastore.preferences.protobuf.w0.b(r4, r9)
            androidx.datastore.preferences.protobuf.b2.v(r8, r0, r4)
            r9 = r4
        L37:
            r3.getClass()
            androidx.datastore.preferences.protobuf.v0 r9 = (androidx.datastore.preferences.protobuf.v0) r9
            androidx.datastore.preferences.protobuf.u0 r10 = (androidx.datastore.preferences.protobuf.u0) r10
            ic.t r8 = r10.a
            r10 = 2
            r12.E(r10)
            java.lang.Object r0 = r12.f1447d
            androidx.datastore.preferences.protobuf.n r0 = (androidx.datastore.preferences.protobuf.n) r0
            int r0 = r0.v()
            java.lang.Object r1 = r12.f1447d
            androidx.datastore.preferences.protobuf.n r1 = (androidx.datastore.preferences.protobuf.n) r1
            int r0 = r1.e(r0)
            java.lang.Object r1 = r8.f19574b
            java.lang.Object r3 = r8.f19576d
        L58:
            int r4 = r12.d()     // Catch: java.lang.Throwable -> Lb0
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto La5
            java.lang.Object r5 = r12.f1447d     // Catch: java.lang.Throwable -> Lb0
            androidx.datastore.preferences.protobuf.n r5 = (androidx.datastore.preferences.protobuf.n) r5     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L6c
            goto La5
        L6c:
            java.lang.String r5 = "Unable to parse map entry."
            if (r4 == r2) goto L8e
            if (r4 == r10) goto L7f
            boolean r4 = r12.F()     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            if (r4 == 0) goto L79
            goto L58
        L79:
            androidx.datastore.preferences.protobuf.j0 r4 = new androidx.datastore.preferences.protobuf.j0     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            r4.<init>(r5)     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            throw r4     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
        L7f:
            java.lang.Object r4 = r8.f19575c     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            androidx.datastore.preferences.protobuf.j2 r4 = (androidx.datastore.preferences.protobuf.j2) r4     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            java.lang.Object r6 = r8.f19576d     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            java.lang.Class r6 = r6.getClass()     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            java.lang.Object r3 = r12.m(r4, r6, r11)     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            goto L58
        L8e:
            java.lang.Object r4 = r8.a     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            androidx.datastore.preferences.protobuf.j2 r4 = (androidx.datastore.preferences.protobuf.j2) r4     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            r6 = 0
            java.lang.Object r1 = r12.m(r4, r6, r6)     // Catch: androidx.datastore.preferences.protobuf.i0 -> L98 java.lang.Throwable -> Lb0
            goto L58
        L98:
            boolean r4 = r12.F()     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L9f
            goto L58
        L9f:
            androidx.datastore.preferences.protobuf.j0 r8 = new androidx.datastore.preferences.protobuf.j0     // Catch: java.lang.Throwable -> Lb0
            r8.<init>(r5)     // Catch: java.lang.Throwable -> Lb0
            throw r8     // Catch: java.lang.Throwable -> Lb0
        La5:
            r9.put(r1, r3)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r8 = r12.f1447d
            androidx.datastore.preferences.protobuf.n r8 = (androidx.datastore.preferences.protobuf.n) r8
            r8.d(r0)
            return
        Lb0:
            r8 = move-exception
            java.lang.Object r9 = r12.f1447d
            androidx.datastore.preferences.protobuf.n r9 = (androidx.datastore.preferences.protobuf.n) r9
            r9.d(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b1.m(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.u, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final void makeImmutable(Object obj) {
        if (!j(obj)) {
            return;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            e0Var.d();
            e0Var.c();
            e0Var.k();
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int G = G(i10);
            long j3 = 1048575 & G;
            int i11 = (G & 267386880) >>> 20;
            Unsafe unsafe = f1333p;
            if (i11 != 9) {
                if (i11 != 60 && i11 != 68) {
                    switch (i11) {
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
                        case NOTIFICATION_REDIRECT_VALUE:
                        case 30:
                        case TEMPLATE_HTML_SIZE_VALUE:
                        case 32:
                        case 33:
                        case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        case 36:
                        case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                        case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        case 48:
                        case 49:
                            this.f1344l.a(obj, j3);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            Object object = unsafe.getObject(obj, j3);
                            if (object != null) {
                                this.f1346n.getClass();
                                w0.c(object);
                                unsafe.putObject(obj, j3, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (k(obj, iArr[i10], i10)) {
                    f(i10).makeImmutable(unsafe.getObject(obj, j3));
                }
            }
            if (i(obj, i10)) {
                f(i10).makeImmutable(unsafe.getObject(obj, j3));
            }
        }
        this.f1345m.getClass();
        t1.b(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final void mergeFrom(Object obj, Object obj2) {
        if (j(obj)) {
            obj2.getClass();
            int i10 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i10 < iArr.length) {
                    int G = G(i10);
                    long j3 = 1048575 & G;
                    int i11 = iArr[i10];
                    switch ((G & 267386880) >>> 20) {
                        case 0:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.f1348c.m(obj, j3, b2.k(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 1:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.f1348c.n(obj, j3, b2.l(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 2:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.u(obj, j3, b2.n(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 3:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.u(obj, j3, b2.n(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 4:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.t(obj, j3, b2.m(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 5:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.u(obj, j3, b2.n(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 6:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.t(obj, j3, b2.m(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 7:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.f1348c.k(obj, j3, b2.g(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 8:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.v(obj, j3, b2.o(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 9:
                            n(obj, obj2, i10);
                            break;
                        case 10:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.v(obj, j3, b2.o(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 11:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.t(obj, j3, b2.m(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 12:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.t(obj, j3, b2.m(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 13:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.t(obj, j3, b2.m(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 14:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.u(obj, j3, b2.n(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 15:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.t(obj, j3, b2.m(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 16:
                            if (!i(obj2, i10)) {
                                break;
                            } else {
                                b2.u(obj, j3, b2.n(obj2, j3));
                                C(obj, i10);
                                break;
                            }
                        case 17:
                            n(obj, obj2, i10);
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
                        case NOTIFICATION_REDIRECT_VALUE:
                        case 30:
                        case TEMPLATE_HTML_SIZE_VALUE:
                        case 32:
                        case 33:
                        case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        case 36:
                        case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                        case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        case 48:
                        case 49:
                            this.f1344l.b(obj, obj2, j3);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            Class cls = l1.a;
                            Object o10 = b2.o(obj, j3);
                            Object o11 = b2.o(obj2, j3);
                            this.f1346n.getClass();
                            b2.v(obj, j3, w0.b(o10, o11));
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
                            if (!k(obj2, i11, i10)) {
                                break;
                            } else {
                                b2.v(obj, j3, b2.o(obj2, j3));
                                D(obj, i11, i10);
                                break;
                            }
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            o(obj, obj2, i10);
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!k(obj2, i11, i10)) {
                                break;
                            } else {
                                b2.v(obj, j3, b2.o(obj2, j3));
                                D(obj, i11, i10);
                                break;
                            }
                        case 68:
                            o(obj, obj2, i10);
                            break;
                    }
                    i10 += 3;
                } else {
                    l1.B(this.f1345m, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(eb.j.j("Mutating immutable message: ", obj));
        }
    }

    public final void n(Object obj, Object obj2, int i10) {
        if (!i(obj2, i10)) {
            return;
        }
        long G = G(i10) & 1048575;
        Unsafe unsafe = f1333p;
        Object object = unsafe.getObject(obj2, G);
        if (object != null) {
            k1 f10 = f(i10);
            if (!i(obj, i10)) {
                if (!j(object)) {
                    unsafe.putObject(obj, G, object);
                } else {
                    e0 newInstance = f10.newInstance();
                    f10.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, G, newInstance);
                }
                C(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, G);
            if (!j(object2)) {
                e0 newInstance2 = f10.newInstance();
                f10.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, G, newInstance2);
                object2 = newInstance2;
            }
            f10.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i10] + " is present but null: " + obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    public final e0 newInstance() {
        this.f1343k.getClass();
        return (e0) ((e0) this.f1337e).f();
    }

    public final void o(Object obj, Object obj2, int i10) {
        int[] iArr = this.a;
        int i11 = iArr[i10];
        if (!k(obj2, i11, i10)) {
            return;
        }
        long G = G(i10) & 1048575;
        Unsafe unsafe = f1333p;
        Object object = unsafe.getObject(obj2, G);
        if (object != null) {
            k1 f10 = f(i10);
            if (!k(obj, i11, i10)) {
                if (!j(object)) {
                    unsafe.putObject(obj, G, object);
                } else {
                    e0 newInstance = f10.newInstance();
                    f10.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, G, newInstance);
                }
                D(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, G);
            if (!j(object2)) {
                e0 newInstance2 = f10.newInstance();
                f10.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, G, newInstance2);
                object2 = newInstance2;
            }
            f10.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
    }

    public final Object p(Object obj, int i10) {
        k1 f10 = f(i10);
        long G = G(i10) & 1048575;
        if (!i(obj, i10)) {
            return f10.newInstance();
        }
        Object object = f1333p.getObject(obj, G);
        if (j(object)) {
            return object;
        }
        e0 newInstance = f10.newInstance();
        if (object != null) {
            f10.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public final Object q(Object obj, int i10, int i11) {
        k1 f10 = f(i11);
        if (!k(obj, i10, i11)) {
            return f10.newInstance();
        }
        Object object = f1333p.getObject(obj, G(i11) & 1048575);
        if (j(object)) {
            return object;
        }
        e0 newInstance = f10.newInstance();
        if (object != null) {
            f10.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public final int w(int i10) {
        if (i10 < this.f1335c || i10 > this.f1336d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final void x(Object obj, long j3, o oVar, k1 k1Var, u uVar) {
        int u;
        List c10 = this.f1344l.c(obj, j3);
        int i10 = oVar.a;
        if ((i10 & 7) != 3) {
            int i11 = j0.f1378c;
            throw new i0();
        }
        do {
            e0 newInstance = k1Var.newInstance();
            oVar.f(newInstance, k1Var, uVar);
            k1Var.makeImmutable(newInstance);
            c10.add(newInstance);
            if (!((n) oVar.f1447d).c() && oVar.f1446c == 0) {
                u = ((n) oVar.f1447d).u();
            } else {
                return;
            }
        } while (u == i10);
        oVar.f1446c = u;
    }

    public final void y(Object obj, int i10, o oVar, k1 k1Var, u uVar) {
        int u;
        List c10 = this.f1344l.c(obj, i10 & 1048575);
        int i11 = oVar.a;
        if ((i11 & 7) != 2) {
            int i12 = j0.f1378c;
            throw new i0();
        }
        do {
            e0 newInstance = k1Var.newInstance();
            oVar.g(newInstance, k1Var, uVar);
            k1Var.makeImmutable(newInstance);
            c10.add(newInstance);
            if (!((n) oVar.f1447d).c() && oVar.f1446c == 0) {
                u = ((n) oVar.f1447d).u();
            } else {
                return;
            }
        } while (u == i11);
        oVar.f1446c = u;
    }

    public final void z(Object obj, int i10, o oVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            oVar.E(2);
            b2.v(obj, i10 & 1048575, ((n) oVar.f1447d).t());
        } else if (this.f1338f) {
            oVar.E(2);
            b2.v(obj, i10 & 1048575, ((n) oVar.f1447d).s());
        } else {
            b2.v(obj, i10 & 1048575, oVar.i());
        }
    }
}
