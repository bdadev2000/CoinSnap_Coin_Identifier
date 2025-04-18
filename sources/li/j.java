package li;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Map;
import jb.t;
import ki.b0;
import ki.e0;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import wh.c0;

/* loaded from: classes5.dex */
public abstract class j {
    public static final Map a(ArrayList arrayList) {
        String str = b0.f20952c;
        b0 h10 = c0.h("/", false);
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(h10, new g(h10)));
        for (g gVar : CollectionsKt.sortedWith(arrayList, new b0.g(12))) {
            if (((g) mutableMapOf.put(gVar.a, gVar)) == null) {
                while (true) {
                    b0 c10 = gVar.a.c();
                    if (c10 == null) {
                        break;
                    }
                    g gVar2 = (g) mutableMapOf.get(c10);
                    b0 b0Var = gVar.a;
                    if (gVar2 != null) {
                        gVar2.f21395h.add(b0Var);
                        break;
                    }
                    g gVar3 = new g(c10);
                    mutableMapOf.put(c10, gVar3);
                    gVar3.f21395h.add(b0Var);
                    gVar = gVar3;
                }
            }
        }
        return mutableMapOf;
    }

    public static final String b(int i10) {
        StringBuilder sb2 = new StringBuilder("0x");
        String num = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        return sb2.toString();
    }

    public static final g c(e0 e0Var) {
        Long valueOf;
        boolean contains$default;
        int i10;
        long j3;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        int readIntLe = e0Var.readIntLe();
        if (readIntLe == 33639248) {
            e0Var.skip(4L);
            int readShortLe = e0Var.readShortLe() & UShort.MAX_VALUE;
            if ((readShortLe & 1) == 0) {
                int readShortLe2 = e0Var.readShortLe() & UShort.MAX_VALUE;
                int readShortLe3 = e0Var.readShortLe() & UShort.MAX_VALUE;
                int readShortLe4 = e0Var.readShortLe() & UShort.MAX_VALUE;
                if (readShortLe3 == -1) {
                    valueOf = null;
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((readShortLe4 >> 9) & 127) + 1980, ((readShortLe4 >> 5) & 15) - 1, readShortLe4 & 31, (readShortLe3 >> 11) & 31, (readShortLe3 >> 5) & 63, (readShortLe3 & 31) << 1);
                    valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
                Long l10 = valueOf;
                e0Var.readIntLe();
                Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = e0Var.readIntLe() & 4294967295L;
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = e0Var.readIntLe() & 4294967295L;
                int readShortLe5 = e0Var.readShortLe() & UShort.MAX_VALUE;
                int readShortLe6 = e0Var.readShortLe() & UShort.MAX_VALUE;
                int readShortLe7 = e0Var.readShortLe() & UShort.MAX_VALUE;
                e0Var.skip(8L);
                Ref.LongRef longRef3 = new Ref.LongRef();
                longRef3.element = e0Var.readIntLe() & 4294967295L;
                String readUtf8 = e0Var.readUtf8(readShortLe5);
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) readUtf8, (char) 0, false, 2, (Object) null);
                if (!contains$default) {
                    if (longRef2.element == 4294967295L) {
                        j3 = 8 + 0;
                        i10 = readShortLe2;
                    } else {
                        i10 = readShortLe2;
                        j3 = 0;
                    }
                    if (longRef.element == 4294967295L) {
                        j3 += 8;
                    }
                    if (longRef3.element == 4294967295L) {
                        j3 += 8;
                    }
                    long j10 = j3;
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    d(e0Var, readShortLe6, new h(booleanRef, j10, longRef2, e0Var, longRef, longRef3));
                    if (j10 > 0 && !booleanRef.element) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String readUtf82 = e0Var.readUtf8(readShortLe7);
                    String str = b0.f20952c;
                    b0 d10 = c0.h("/", false).d(readUtf8);
                    endsWith$default = StringsKt__StringsJVMKt.endsWith$default(readUtf8, "/", false, 2, null);
                    return new g(d10, endsWith$default, readUtf82, longRef.element, longRef2.element, i10, l10, longRef3.element);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + b(readShortLe));
        }
        throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(readIntLe));
    }

    public static final void d(e0 e0Var, int i10, Function2 function2) {
        long j3 = i10;
        while (j3 != 0) {
            if (j3 >= 4) {
                int readShortLe = e0Var.readShortLe() & UShort.MAX_VALUE;
                long readShortLe2 = e0Var.readShortLe() & 65535;
                long j10 = j3 - 4;
                if (j10 >= readShortLe2) {
                    e0Var.require(readShortLe2);
                    ki.i iVar = e0Var.f20977c;
                    long j11 = iVar.f20994c;
                    function2.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
                    long j12 = (iVar.f20994c + readShortLe2) - j11;
                    if (j12 >= 0) {
                        if (j12 > 0) {
                            iVar.skip(j12);
                        }
                        j3 = j10 - readShortLe2;
                    } else {
                        throw new IOException(eb.j.i("unsupported zip: too many bytes processed for ", readShortLe));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t e(e0 e0Var, t tVar) {
        T t5;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (tVar != null) {
            t5 = (Long) tVar.f19957g;
        } else {
            t5 = 0;
        }
        objectRef.element = t5;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int readIntLe = e0Var.readIntLe();
        if (readIntLe == 67324752) {
            e0Var.skip(2L);
            int readShortLe = e0Var.readShortLe() & UShort.MAX_VALUE;
            if ((readShortLe & 1) == 0) {
                e0Var.skip(18L);
                int readShortLe2 = e0Var.readShortLe() & UShort.MAX_VALUE;
                e0Var.skip(e0Var.readShortLe() & 65535);
                if (tVar == null) {
                    e0Var.skip(readShortLe2);
                    return null;
                }
                d(e0Var, readShortLe2, new i(e0Var, objectRef, objectRef2, objectRef3));
                return new t(tVar.f19952b, tVar.f19953c, null, (Long) tVar.f19955e, (Long) objectRef3.element, (Long) objectRef.element, (Long) objectRef2.element);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + b(readShortLe));
        }
        throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(readIntLe));
    }
}
