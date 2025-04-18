package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.o;
import e0.q;
import e0.u;
import e0.w;
import java.util.Arrays;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class Operations extends OperationsDebugStringFormattable {

    /* renamed from: b, reason: collision with root package name */
    public int f14131b;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f14133f;

    /* renamed from: g, reason: collision with root package name */
    public int f14134g;

    /* renamed from: h, reason: collision with root package name */
    public int f14135h;

    /* renamed from: a, reason: collision with root package name */
    public Operation[] f14130a = new Operation[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f14132c = new int[16];
    public Object[] e = new Object[16];

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public final class OpIterator implements OperationArgContainer {

        /* renamed from: a, reason: collision with root package name */
        public int f14136a;

        /* renamed from: b, reason: collision with root package name */
        public int f14137b;

        /* renamed from: c, reason: collision with root package name */
        public int f14138c;

        public OpIterator() {
        }

        public final int a(int i2) {
            return Operations.this.f14132c[this.f14137b + i2];
        }

        public final Object b(int i2) {
            return Operations.this.e[this.f14138c + i2];
        }

        public final boolean c() {
            int i2 = this.f14136a;
            Operations operations = Operations.this;
            if (i2 >= operations.f14131b) {
                return false;
            }
            Operation operation = operations.f14130a[i2];
            a.p(operation);
            this.f14137b += operation.f14093a;
            this.f14138c += operation.f14094b;
            int i3 = this.f14136a + 1;
            this.f14136a = i3;
            return i3 < operations.f14131b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class WriteScope {
        public static final void a(Operations operations, int i2, int i3) {
            int i4 = 1 << i2;
            int i5 = operations.f14134g;
            if ((i5 & i4) == 0) {
                operations.f14134g = i4 | i5;
                operations.f14132c[(operations.d - operations.h().f14093a) + i2] = i3;
            } else {
                PreconditionsKt.b("Already pushed argument " + operations.h().c(i2));
                throw null;
            }
        }

        public static final void b(Operations operations, int i2, Object obj) {
            int i3 = 1 << i2;
            int i4 = operations.f14135h;
            if ((i4 & i3) == 0) {
                operations.f14135h = i3 | i4;
                operations.e[(operations.f14133f - operations.h().f14094b) + i2] = obj;
            } else {
                PreconditionsKt.b("Already pushed argument " + operations.h().d(i2));
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WriteScope)) {
                return false;
            }
            ((WriteScope) obj).getClass();
            return a.g(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WriteScope(stack=null)";
        }
    }

    public static final int b(Operations operations, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i2);
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String a(String str) {
        char c2;
        String sb;
        char c3;
        char c4;
        StringBuilder sb2 = new StringBuilder();
        if (g()) {
            OpIterator opIterator = new OpIterator();
            int i2 = 1;
            while (true) {
                sb2.append(str);
                int i3 = i2 + 1;
                sb2.append(i2);
                sb2.append(". ");
                Operation operation = Operations.this.f14130a[opIterator.f14136a];
                a.p(operation);
                int i4 = operation.f14094b;
                int i5 = operation.f14093a;
                if (i5 == 0 && i4 == 0) {
                    sb = operation.b();
                    c2 = '\n';
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(operation.b());
                    sb3.append('(');
                    String str2 = str + "    ";
                    boolean z2 = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        String c5 = operation.c(i6);
                        if (z2) {
                            c4 = '\n';
                            z2 = false;
                        } else {
                            sb3.append(", ");
                            c4 = '\n';
                        }
                        sb3.append(c4);
                        sb3.append(str2);
                        sb3.append(c5);
                        sb3.append(" = ");
                        sb3.append(opIterator.a(i6));
                    }
                    for (int i7 = 0; i7 < i4; i7++) {
                        String d = operation.d(i7);
                        if (z2) {
                            c3 = '\n';
                            z2 = false;
                        } else {
                            sb3.append(", ");
                            c3 = '\n';
                        }
                        sb3.append(c3);
                        sb3.append(str2);
                        sb3.append(d);
                        sb3.append(" = ");
                        sb3.append(e(opIterator.b(i7), str2));
                    }
                    c2 = '\n';
                    sb3.append('\n');
                    sb3.append(str);
                    sb3.append(")");
                    sb = sb3.toString();
                    a.r(sb, "StringBuilder().apply(builderAction).toString()");
                }
                sb2.append(sb);
                sb2.append(c2);
                if (!opIterator.c()) {
                    break;
                }
                i2 = i3;
            }
        }
        String sb4 = sb2.toString();
        a.r(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public final void c() {
        this.f14131b = 0;
        this.d = 0;
        q.W(0, this.f14133f, this.e);
        this.f14133f = 0;
    }

    public final void d(Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (g()) {
            OpIterator opIterator = new OpIterator();
            do {
                Operation operation = Operations.this.f14130a[opIterator.f14136a];
                a.p(operation);
                operation.a(opIterator, applier, slotWriter, rememberManager);
            } while (opIterator.c());
        }
        c();
    }

    public final String e(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        boolean z2 = obj instanceof Object[];
        Iterable iterable = w.f30218a;
        if (z2) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 0) {
                iterable = new o(objArr, 0);
            }
            return k(iterable, str);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr.length != 0) {
                iterable = new o(iArr, 1);
            }
            return k(iterable, str);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length != 0) {
                iterable = new o(jArr, 2);
            }
            return k(iterable, str);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length != 0) {
                iterable = new o(fArr, 3);
            }
            return k(iterable, str);
        }
        if (!(obj instanceof double[])) {
            return obj instanceof Iterable ? k((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).a(str) : obj.toString();
        }
        double[] dArr = (double[]) obj;
        if (dArr.length != 0) {
            iterable = new o(dArr, 4);
        }
        return k(iterable, str);
    }

    public final boolean f() {
        return this.f14131b == 0;
    }

    public final boolean g() {
        return this.f14131b != 0;
    }

    public final Operation h() {
        Operation operation = this.f14130a[this.f14131b - 1];
        a.p(operation);
        return operation;
    }

    public final void i(Operation operation) {
        int i2 = operation.f14093a;
        int i3 = operation.f14094b;
        if (i2 == 0 && i3 == 0) {
            j(operation);
            return;
        }
        PreconditionsKt.a("Cannot push " + operation + " without arguments because it expects " + i2 + " ints and " + i3 + " objects.");
        throw null;
    }

    public final void j(Operation operation) {
        this.f14134g = 0;
        this.f14135h = 0;
        int i2 = this.f14131b;
        Operation[] operationArr = this.f14130a;
        if (i2 == operationArr.length) {
            Object[] copyOf = Arrays.copyOf(operationArr, i2 + (i2 > 1024 ? 1024 : i2));
            a.r(copyOf, "copyOf(this, newSize)");
            this.f14130a = (Operation[]) copyOf;
        }
        int i3 = this.d;
        int i4 = operation.f14093a;
        int i5 = i3 + i4;
        int[] iArr = this.f14132c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = length + (length > 1024 ? 1024 : length);
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i5);
            a.r(copyOf2, "copyOf(this, newSize)");
            this.f14132c = copyOf2;
        }
        int i7 = this.f14133f;
        int i8 = operation.f14094b;
        int i9 = i7 + i8;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i9 > length2) {
            int i10 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i10 >= i9) {
                i9 = i10;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i9);
            a.r(copyOf3, "copyOf(this, newSize)");
            this.e = copyOf3;
        }
        Operation[] operationArr2 = this.f14130a;
        int i11 = this.f14131b;
        this.f14131b = i11 + 1;
        operationArr2[i11] = operation;
        this.d += i4;
        this.f14133f += i8;
    }

    public final String k(Iterable iterable, String str) {
        return u.K0(iterable, ", ", "[", "]", new Operations$toCollectionString$1(this, str), 24);
    }

    public final String toString() {
        return super.toString();
    }
}
