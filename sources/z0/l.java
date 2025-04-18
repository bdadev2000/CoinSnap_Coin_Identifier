package z0;

import e0.u;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
public final class l extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, Object obj, boolean z2) {
        super(2);
        this.f31480a = i2;
        this.f31482c = obj;
        this.f31481b = z2;
    }

    public final d0.k b(int i2, CharSequence charSequence) {
        Object obj;
        d0.k kVar;
        Object obj2;
        Object obj3;
        int i3 = this.f31480a;
        Object obj4 = this.f31482c;
        switch (i3) {
            case 0:
                p0.a.s(charSequence, "$this$$receiver");
                int Y0 = m.Y0(i2, charSequence, this.f31481b, (char[]) obj4);
                if (Y0 < 0) {
                    return null;
                }
                return new d0.k(Integer.valueOf(Y0), 1);
            default:
                p0.a.s(charSequence, "$this$$receiver");
                List list = (List) obj4;
                boolean z2 = this.f31481b;
                if (z2 || list.size() != 1) {
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    w0.e eVar = new w0.e(i2, charSequence.length(), 1);
                    boolean z3 = charSequence instanceof String;
                    int i4 = eVar.f31408c;
                    int i5 = eVar.f31407b;
                    if (z3) {
                        if ((i4 > 0 && i2 <= i5) || (i4 < 0 && i5 <= i2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        String str = (String) obj2;
                                        if (m.e1(0, i2, str.length(), str, (String) charSequence, z2)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                String str2 = (String) obj2;
                                if (str2 != null) {
                                    kVar = new d0.k(Integer.valueOf(i2), str2);
                                } else if (i2 != i5) {
                                    i2 += i4;
                                }
                            }
                        }
                        kVar = null;
                    } else {
                        if ((i4 > 0 && i2 <= i5) || (i4 < 0 && i5 <= i2)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        String str3 = (String) obj;
                                        if (m.f1(str3, 0, charSequence, i2, str3.length(), z2)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                String str4 = (String) obj;
                                if (str4 != null) {
                                    kVar = new d0.k(Integer.valueOf(i2), str4);
                                } else if (i2 != i5) {
                                    i2 += i4;
                                }
                            }
                        }
                        kVar = null;
                    }
                } else {
                    List list2 = list;
                    if (list2 instanceof List) {
                        obj3 = u.S0(list2);
                    } else {
                        Iterator it3 = list2.iterator();
                        if (!it3.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        Object next = it3.next();
                        if (it3.hasNext()) {
                            throw new IllegalArgumentException("Collection has more than one element.");
                        }
                        obj3 = next;
                    }
                    String str5 = (String) obj3;
                    int X0 = m.X0(charSequence, str5, i2, false, 4);
                    if (X0 >= 0) {
                        kVar = new d0.k(Integer.valueOf(X0), str5);
                    }
                    kVar = null;
                }
                if (kVar == null) {
                    return null;
                }
                return new d0.k(kVar.f30134a, Integer.valueOf(((String) kVar.f30135b).length()));
        }
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31480a) {
            case 0:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((h0.l) obj).u((h0.j) obj2);
        }
    }
}
