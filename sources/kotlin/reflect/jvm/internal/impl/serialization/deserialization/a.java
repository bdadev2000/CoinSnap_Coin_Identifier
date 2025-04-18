package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import android.view.View;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import n9.o;
import t.h;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String A(int i10) {
        return i10 == 1 ? "MERGE" : i10 == 2 ? "ADD" : i10 == 3 ? "SUBTRACT" : i10 == 4 ? "INTERSECT" : i10 == 5 ? "EXCLUDE_INTERSECTIONS" : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ String B(int i10) {
        return i10 == 1 ? "PRE_COMP" : i10 == 2 ? "SOLID" : i10 == 3 ? "IMAGE" : i10 == 4 ? "NULL" : i10 == 5 ? "SHAPE" : i10 == 6 ? "TEXT" : i10 == 7 ? "UNKNOWN" : AbstractJsonLexerKt.NULL;
    }

    public static int[] _values() {
        return h.c(18);
    }

    public static /* synthetic */ boolean a(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long b(int i10) {
        if (i10 == 1) {
            return 0L;
        }
        if (i10 == 2) {
            return 1L;
        }
        if (i10 == 3) {
            return 2L;
        }
        if (i10 == 4) {
            return 3L;
        }
        if (i10 == 5) {
            return 4L;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i10) {
        if (i10 == 1) {
            return "BASE";
        }
        if (i10 == 2) {
            return "REALTIME";
        }
        throw null;
    }

    public static int e(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static int f(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static Object g(CharSequence charSequence, int i10, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i10)));
    }

    public static String h(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String i(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String j(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static String k(String str, long j3) {
        return str + j3;
    }

    public static String l(String str, String str2, char c10) {
        return str + str2 + c10;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder o(String str, long j3, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j3);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder p(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(simpleTypeMarker);
        sb2.append(str2);
        return sb2;
    }

    public static Iterator q(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    public static KotlinNothingValueException r() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void t(View view) {
        if (view != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void u(Object obj) {
        throw new ClassCastException();
    }

    public static void v(String str, int i10, String str2) {
        o.f(str2, str + i10);
    }

    public static /* synthetic */ void w(CoroutineContext.Element element) {
        if (element != null) {
            throw new ClassCastException();
        }
    }

    public static boolean x(Flags.BooleanFlagField booleanFlagField, int i10, String str) {
        Boolean bool = booleanFlagField.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool, str);
        return bool.booleanValue();
    }

    public static /* synthetic */ void y() {
    }

    public static /* synthetic */ String z(int i10) {
        return i10 == 1 ? "BASE" : i10 == 2 ? "SENSOR" : i10 == 3 ? "VIEW" : i10 == 4 ? "OUTPUT" : AbstractJsonLexerKt.NULL;
    }
}
