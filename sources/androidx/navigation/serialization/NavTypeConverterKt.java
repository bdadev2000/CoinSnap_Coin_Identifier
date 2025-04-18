package androidx.navigation.serialization;

import java.util.regex.Pattern;
import l1.f;
import l1.k;
import p0.a;
import z0.m;

/* loaded from: classes3.dex */
public final class NavTypeConverterKt {

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[10] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[4] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[7] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public static final Class a(f fVar) {
        String k12 = m.k1(fVar.g(), "?", "");
        try {
            return Class.forName(k12);
        } catch (ClassNotFoundException unused) {
            if (!m.M0(k12, ".", false)) {
                throw new IllegalArgumentException("Cannot find class with name \"" + fVar.g() + "\". Ensure that the serialName for this argument is the default fully qualified name");
            }
            Pattern compile = Pattern.compile("(\\.+)(?!.*\\.)");
            a.r(compile, "compile(...)");
            String replaceAll = compile.matcher(k12).replaceAll("\\$");
            a.r(replaceAll, "replaceAll(...)");
            return Class.forName(replaceAll);
        }
    }

    public static final InternalType b(f fVar) {
        String k12 = m.k1(fVar.g(), "?", "");
        if (a.g(fVar.c(), k.f31046b)) {
            return fVar.b() ? InternalType.f20779v : InternalType.f20778u;
        }
        if (a.g(k12, "kotlin.Int")) {
            return fVar.b() ? InternalType.f20761b : InternalType.f20760a;
        }
        if (a.g(k12, "kotlin.Boolean")) {
            return fVar.b() ? InternalType.d : InternalType.f20762c;
        }
        boolean g2 = a.g(k12, "kotlin.Double");
        InternalType internalType = InternalType.f20763f;
        if (g2) {
            if (fVar.b()) {
                return InternalType.f20764g;
            }
        } else if (!a.g(k12, "kotlin.Double")) {
            return a.g(k12, "kotlin.Float") ? fVar.b() ? InternalType.f20766i : InternalType.f20765h : a.g(k12, "kotlin.Long") ? fVar.b() ? InternalType.f20768k : InternalType.f20767j : a.g(k12, "kotlin.String") ? fVar.b() ? InternalType.f20770m : InternalType.f20769l : a.g(k12, "kotlin.IntArray") ? InternalType.f20771n : a.g(k12, "kotlin.DoubleArray") ? InternalType.f20773p : a.g(k12, "kotlin.BooleanArray") ? InternalType.f20772o : a.g(k12, "kotlin.FloatArray") ? InternalType.f20774q : a.g(k12, "kotlin.LongArray") ? InternalType.f20775r : a.g(k12, "kotlin.Array") ? InternalType.f20776s : m.q1(k12, "kotlin.collections.ArrayList", false) ? InternalType.f20777t : InternalType.w;
        }
        return internalType;
    }
}
