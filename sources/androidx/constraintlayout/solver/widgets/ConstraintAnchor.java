package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import com.facebook.internal.security.CertificateUtil;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ConstraintAnchor {

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintWidget f17998b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f17999c;
    public ConstraintAnchor d;

    /* renamed from: g, reason: collision with root package name */
    public SolverVariable f18001g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f17997a = null;
    public int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f18000f = -1;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18002a;

        static {
            int[] iArr = new int[Type.values().length];
            f18002a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18002a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18002a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18002a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18002a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18002a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18002a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18002a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18002a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f18003a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f18004b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f18005c;
        public static final Type d;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f18006f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f18007g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f18008h;

        /* renamed from: i, reason: collision with root package name */
        public static final Type f18009i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ Type[] f18010j;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type] */
        static {
            ?? r02 = new Enum("NONE", 0);
            ?? r1 = new Enum("LEFT", 1);
            f18003a = r1;
            ?? r2 = new Enum("TOP", 2);
            f18004b = r2;
            ?? r3 = new Enum("RIGHT", 3);
            f18005c = r3;
            ?? r4 = new Enum("BOTTOM", 4);
            d = r4;
            ?? r5 = new Enum("BASELINE", 5);
            f18006f = r5;
            ?? r6 = new Enum("CENTER", 6);
            f18007g = r6;
            ?? r7 = new Enum("CENTER_X", 7);
            f18008h = r7;
            ?? r8 = new Enum("CENTER_Y", 8);
            f18009i = r8;
            f18010j = new Type[]{r02, r1, r2, r3, r4, r5, r6, r7, r8};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f18010j.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f17998b = constraintWidget;
        this.f17999c = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i2) {
        b(constraintAnchor, i2, -1, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z2) {
        if (constraintAnchor == null) {
            h();
            return true;
        }
        if (!z2 && !g(constraintAnchor)) {
            return false;
        }
        this.d = constraintAnchor;
        if (constraintAnchor.f17997a == null) {
            constraintAnchor.f17997a = new HashSet();
        }
        this.d.f17997a.add(this);
        if (i2 > 0) {
            this.e = i2;
        } else {
            this.e = 0;
        }
        this.f18000f = i3;
        return true;
    }

    public final int c() {
        ConstraintAnchor constraintAnchor;
        if (this.f17998b.X == 8) {
            return 0;
        }
        int i2 = this.f18000f;
        return (i2 <= -1 || (constraintAnchor = this.d) == null || constraintAnchor.f17998b.X != 8) ? this.e : i2;
    }

    public final ConstraintAnchor d() {
        Type type = this.f17999c;
        int ordinal = type.ordinal();
        ConstraintWidget constraintWidget = this.f17998b;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.A;
            case 2:
                return constraintWidget.B;
            case 3:
                return constraintWidget.f18036y;
            case 4:
                return constraintWidget.f18037z;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f17997a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.d != null;
    }

    public final boolean g(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = Type.f18006f;
        Type type2 = this.f17999c;
        ConstraintWidget constraintWidget = constraintAnchor.f17998b;
        Type type3 = constraintAnchor.f17999c;
        if (type3 == type2) {
            return type2 != type || (constraintWidget.w && this.f17998b.w);
        }
        int ordinal = type2.ordinal();
        Type type4 = Type.f18008h;
        Type type5 = Type.f18009i;
        switch (ordinal) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = type3 == Type.f18003a || type3 == Type.f18005c;
                if (constraintWidget instanceof Guideline) {
                    return z2 || type3 == type4;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = type3 == Type.f18004b || type3 == Type.d;
                if (constraintWidget instanceof Guideline) {
                    return z3 || type3 == type5;
                }
                return z3;
            case 6:
                return (type3 == type || type3 == type4 || type3 == type5) ? false : true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public final void h() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.d;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f17997a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f18000f = -1;
    }

    public final void i() {
        SolverVariable solverVariable = this.f18001g;
        if (solverVariable == null) {
            this.f18001g = new SolverVariable(SolverVariable.Type.f17956a);
        } else {
            solverVariable.c();
        }
    }

    public final String toString() {
        return this.f17998b.Y + CertificateUtil.DELIMITER + this.f17999c.toString();
    }
}
