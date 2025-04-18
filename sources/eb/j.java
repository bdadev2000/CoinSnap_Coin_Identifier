package eb;

import android.util.Log;
import androidx.recyclerview.widget.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import l9.n;
import n9.o;
import yg.a0;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ String A(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "TRANSIENT_ERROR" : i10 == 3 ? "FATAL_ERROR" : i10 == 4 ? "INVALID_PAYLOAD" : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("AUTO")) {
            return 1;
        }
        if (str.equals("TEXT")) {
            return 2;
        }
        if (str.equals("BYTE")) {
            return 3;
        }
        if (str.equals("NUMERIC")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(str));
    }

    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "ctv";
        }
        if (i10 == 2) {
            return "mobile";
        }
        if (i10 == 3) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i10 == 4) {
            return 4;
        }
        throw null;
    }

    public static int c(UInt uInt, int i10) {
        return UInt.m240constructorimpl(uInt.getData() + i10);
    }

    public static int d(IntRange intRange, int i10) {
        return intRange.getEndInclusive().intValue() + i10;
    }

    public static Object e(byte[] bArr, int i10, Function1 function1) {
        return function1.invoke(UByte.m157boximpl(UByteArray.m221getw2LRezQ(bArr, i10)));
    }

    public static Object f(int[] iArr, int i10, Function1 function1) {
        return function1.invoke(UInt.m234boximpl(UIntArray.m300getpVg5ArA(iArr, i10)));
    }

    public static Object g(long[] jArr, int i10, Function1 function1) {
        return function1.invoke(ULong.m313boximpl(ULongArray.m379getsVKNKU(jArr, i10)));
    }

    public static Object h(short[] sArr, int i10, Function1 function1) {
        return function1.invoke(UShort.m420boximpl(UShortArray.m484getMh2AYeg(sArr, i10)));
    }

    public static String i(String str, int i10) {
        return str + i10;
    }

    public static String j(String str, Object obj) {
        return str + obj;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder m(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder n(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static ArrayList o(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList p(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static Iterator q(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static IntIterator r(int i10, int i11) {
        return new IntRange(i10, i11).iterator();
    }

    public static FqName s(String str, FqName fqName, String str2) {
        FqName child = fqName.child(Name.identifier(str));
        Intrinsics.checkNotNullExpressionValue(child, str2);
        return child;
    }

    public static vb.c t(s0 s0Var, n nVar) {
        nVar.b(s0Var.f());
        return nVar.a();
    }

    public static yg.l u(a0 a0Var, Class cls, String str, String str2) {
        yg.l a = a0Var.a(cls, SetsKt.emptySet(), str);
        Intrinsics.checkNotNullExpressionValue(a, str2);
        return a;
    }

    public static void v(String str, int i10, String str2) {
        Log.w(str2, str + i10);
    }

    public static void w(String str, String str2, String str3) {
        o.f(str3, str + str2);
    }

    public static /* synthetic */ String x(int i10) {
        return i10 == 1 ? "IDLE" : i10 == 2 ? "QUEUING" : i10 == 3 ? "QUEUED" : i10 == 4 ? DebugCoroutineInfoImplKt.RUNNING : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ String y(int i10) {
        return i10 == 1 ? "INITIALIZE" : i10 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i10 == 3 ? "DECODE_DATA" : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ String z(int i10) {
        return i10 == 1 ? "INITIALIZE" : i10 == 2 ? "RESOURCE_CACHE" : i10 == 3 ? "DATA_CACHE" : i10 == 4 ? "SOURCE" : i10 == 5 ? "ENCODE" : i10 == 6 ? "FINISHED" : AbstractJsonLexerKt.NULL;
    }
}
