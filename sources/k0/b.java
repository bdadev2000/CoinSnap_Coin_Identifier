package k0;

import com.google.common.collect.e0;
import com.google.common.collect.y1;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.k;
import k9.n;
import k9.o;
import kotlin.jvm.internal.Intrinsics;
import m9.t0;
import mb.f0;
import mb.v1;
import s7.r0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20188b;

    public /* synthetic */ b(int i10) {
        this.f20188b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20188b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b3 = bArr[i10];
                    byte b10 = bArr2[i10];
                    if (b3 != b10) {
                        return b3 - b10;
                    }
                }
                return 0;
            case 1:
                j6.c cVar = (j6.c) obj;
                j6.c o22 = (j6.c) obj2;
                AtomicBoolean atomicBoolean = k6.c.a;
                if (m6.a.b(k6.c.class)) {
                    return 0;
                }
                try {
                    Intrinsics.checkNotNullExpressionValue(o22, "o2");
                    return cVar.a(o22);
                } catch (Throwable th2) {
                    m6.a.a(k6.c.class, th2);
                    return 0;
                }
            case 2:
                j6.c o23 = (j6.c) obj2;
                Intrinsics.checkNotNullExpressionValue(o23, "o2");
                return ((j6.c) obj).a(o23);
            case 3:
                n6.a aVar = (n6.a) obj;
                n6.a data = (n6.a) obj2;
                Intrinsics.checkNotNullExpressionValue(data, "o2");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                Long l10 = aVar.f22460c;
                if (l10 == null) {
                    return -1;
                }
                long longValue = l10.longValue();
                Long l11 = data.f22460c;
                if (l11 == null) {
                    return 1;
                }
                return Intrinsics.compare(l11.longValue(), longValue);
            case 4:
            default:
                Charset charset = ob.a.f23284e;
                String name = ((File) obj).getName();
                int i11 = ob.a.f23285f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            case 5:
                z8.b bVar = (z8.b) obj;
                z8.b bVar2 = (z8.b) obj2;
                int compare = Integer.compare(bVar.f28589c, bVar2.f28589c);
                if (compare == 0) {
                    return bVar.f28588b.compareTo(bVar2.f28588b);
                }
                return compare;
            case 6:
                return Integer.compare(((b9.d) obj2).f2366b, ((b9.d) obj).f2366b);
            case 7:
                return Integer.compare(((j9.d) obj).a.f19839b, ((j9.d) obj2).a.f19839b);
            case 8:
                return Long.compare(((j9.c) obj).f19835b, ((j9.c) obj2).f19835b);
            case 9:
                return ((r0) obj2).f24719j - ((r0) obj).f24719j;
            case 10:
                return ((k) ((List) obj).get(0)).compareTo((k) ((List) obj2).get(0));
            case 11:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                y1 y1Var = o.f20461j;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 12:
                y1 y1Var2 = o.f20461j;
                return 0;
            case 13:
                List list = (List) obj;
                List list2 = (List) obj2;
                return e0.f(new b(17).compare((n) Collections.max(list, new b(15)), (n) Collections.max(list2, new b(16)))).a(list.size(), list2.size()).b((n) Collections.max(list, new b(18)), (n) Collections.max(list2, new b(19)), new b(20)).e();
            case 14:
                return ((k9.e) Collections.max((List) obj)).compareTo((k9.e) Collections.max((List) obj2));
            case 15:
                return n.c((n) obj, (n) obj2);
            case 16:
                return n.c((n) obj, (n) obj2);
            case 17:
                return n.c((n) obj, (n) obj2);
            case 18:
                return n.d((n) obj, (n) obj2);
            case 19:
                return n.d((n) obj, (n) obj2);
            case 20:
                return n.d((n) obj, (n) obj2);
            case 21:
                l9.o oVar = (l9.o) obj;
                l9.o oVar2 = (l9.o) obj2;
                int compare2 = Integer.compare(oVar2.f21249b, oVar.f21249b);
                if (compare2 == 0) {
                    int compareTo = oVar.f21250c.compareTo(oVar2.f21250c);
                    if (compareTo == 0) {
                        return oVar.f21251d.compareTo(oVar2.f21251d);
                    }
                    return compareTo;
                }
                return compare2;
            case 22:
                l9.o oVar3 = (l9.o) obj;
                l9.o oVar4 = (l9.o) obj2;
                int compare3 = Integer.compare(oVar4.a, oVar3.a);
                if (compare3 == 0) {
                    int compareTo2 = oVar4.f21250c.compareTo(oVar3.f21250c);
                    if (compareTo2 == 0) {
                        return oVar4.f21251d.compareTo(oVar3.f21251d);
                    }
                    return compareTo2;
                }
                return compare3;
            case 23:
                return ((t0) obj).a - ((t0) obj2).a;
            case 24:
                return Float.compare(((t0) obj).f21757c, ((t0) obj2).f21757c);
            case 25:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 26:
                return ((f0) ((v1) obj)).a.compareTo(((f0) ((v1) obj2)).a);
            case 27:
                Charset charset2 = ob.a.f23284e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
