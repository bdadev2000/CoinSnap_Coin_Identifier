package M2;

import G7.j;
import java.io.File;
import java.util.Comparator;
import w4.G;
import w4.s0;
import z4.C2972a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i9) {
        this.b = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int g9;
        switch (this.b) {
            case 0:
                L2.d dVar = (L2.d) obj;
                L2.d dVar2 = (L2.d) obj2;
                if (O2.a.b(d.class)) {
                    return 0;
                }
                try {
                    j.d(dVar2, "o2");
                    dVar.getClass();
                    Long l = dVar.f1722g;
                    if (l == null) {
                        g9 = -1;
                    } else {
                        long longValue = l.longValue();
                        Long l2 = dVar2.f1722g;
                        if (l2 == null) {
                            g9 = 1;
                        } else {
                            g9 = j.g(l2.longValue(), longValue);
                        }
                    }
                    return g9;
                } catch (Throwable th) {
                    O2.a.a(d.class, th);
                    return 0;
                }
            case 1:
                L2.d dVar3 = (L2.d) obj;
                L2.d dVar4 = (L2.d) obj2;
                j.d(dVar4, "o2");
                dVar3.getClass();
                Long l6 = dVar3.f1722g;
                if (l6 == null) {
                    return -1;
                }
                long longValue2 = l6.longValue();
                Long l7 = dVar4.f1722g;
                if (l7 == null) {
                    return 1;
                }
                return j.g(l7.longValue(), longValue2);
            case 2:
                P2.a aVar = (P2.a) obj;
                P2.a aVar2 = (P2.a) obj2;
                j.d(aVar2, "o2");
                aVar.getClass();
                Long l9 = aVar.f2413c;
                if (l9 == null) {
                    return -1;
                }
                long longValue3 = l9.longValue();
                Long l10 = aVar2.f2413c;
                if (l10 == null) {
                    return 1;
                }
                return j.g(l10.longValue(), longValue3);
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i9 = 0; i9 < bArr.length; i9++) {
                    byte b = bArr[i9];
                    byte b8 = bArr2[i9];
                    if (b != b8) {
                        return b - b8;
                    }
                }
                return 0;
            case 4:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 5:
                return ((G) ((s0) obj)).f23724a.compareTo(((G) ((s0) obj2)).f23724a);
            case 6:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i10 = C2972a.f24537f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
        }
    }
}
