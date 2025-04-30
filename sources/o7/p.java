package O7;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import t7.C2720i;

/* loaded from: classes3.dex */
public final class p extends G7.k implements F7.p {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i9, Object obj, boolean z8) {
        super(2);
        this.b = i9;
        this.f2257d = obj;
        this.f2256c = z8;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        int i9;
        int i10;
        boolean z8;
        Object obj3;
        C2720i c2720i;
        Object obj4;
        Object obj5;
        switch (this.b) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                G7.j.e(charSequence, "$this$$receiver");
                int K5 = g.K(charSequence, (char[]) this.f2257d, intValue, this.f2256c);
                if (K5 < 0) {
                    return null;
                }
                return new C2720i(Integer.valueOf(K5), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                G7.j.e(charSequence2, "$this$$receiver");
                List list = (List) this.f2257d;
                boolean z9 = this.f2256c;
                if (!z9 && list.size() == 1) {
                    List list2 = list;
                    if (list2 instanceof List) {
                        List list3 = list2;
                        int size = list3.size();
                        if (size != 0) {
                            if (size == 1) {
                                obj5 = list3.get(0);
                            } else {
                                throw new IllegalArgumentException("List has more than one element.");
                            }
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    } else {
                        Iterator it = list2.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (!it.hasNext()) {
                                obj5 = next;
                            } else {
                                throw new IllegalArgumentException("Collection has more than one element.");
                            }
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    String str = (String) obj5;
                    int J8 = g.J(charSequence2, str, intValue2, false, 4);
                    if (J8 >= 0) {
                        c2720i = new C2720i(Integer.valueOf(J8), str);
                    }
                    c2720i = null;
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    L7.a aVar = new L7.a(intValue2, charSequence2.length(), 1);
                    boolean z10 = charSequence2 instanceof String;
                    int i11 = aVar.f1831d;
                    int i12 = aVar.f1830c;
                    if (z10) {
                        if ((i11 > 0 && intValue2 <= i12) || (i11 < 0 && i12 <= intValue2)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        String str2 = (String) obj4;
                                        if (o.z(str2, 0, (String) charSequence2, intValue2, str2.length(), z9)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    c2720i = new C2720i(Integer.valueOf(intValue2), str3);
                                } else if (intValue2 != i12) {
                                    intValue2 += i11;
                                }
                            }
                        }
                        c2720i = null;
                    } else {
                        if ((i11 > 0 && intValue2 <= i12) || (i11 < 0 && i12 <= intValue2)) {
                            int i13 = intValue2;
                            while (true) {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj3 = it3.next();
                                        String str4 = (String) obj3;
                                        i9 = i12;
                                        i10 = i11;
                                        z8 = z9;
                                        if (!g.Q(str4, 0, charSequence2, i13, str4.length(), z9)) {
                                            z9 = z8;
                                            i12 = i9;
                                            i11 = i10;
                                        }
                                    } else {
                                        i9 = i12;
                                        i10 = i11;
                                        z8 = z9;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    c2720i = new C2720i(Integer.valueOf(i13), str5);
                                } else if (i13 != i9) {
                                    i13 += i10;
                                    z9 = z8;
                                    i12 = i9;
                                    i11 = i10;
                                }
                            }
                        }
                        c2720i = null;
                    }
                }
                if (c2720i == null) {
                    return null;
                }
                return new C2720i(c2720i.b, Integer.valueOf(((String) c2720i.f23021c).length()));
        }
    }
}
