package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03376z implements IA {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC1270dl A01;
    public final InterfaceC1269dk A02;
    public final C1261db A03;
    public final C1261db A04;
    public final List<Rect> A05;
    public final Map<String, C1260da> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 73);
            i5++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, 16, 27, 9, 45, 29, 31, 16, 61, 38, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, 30, 2, 11, 25, Utf8.REPLACEMENT_BYTE, 8, 29, 2, 31, 25};
    }

    static {
        A03();
        A0B = C03376z.class.getSimpleName();
    }

    public C03376z(InterfaceC1269dk interfaceC1269dk) {
        this(interfaceC1269dk, false, false);
    }

    public C03376z(InterfaceC1269dk interfaceC1269dk, boolean z2, boolean z3) {
        this.A06 = new HashMap();
        this.A04 = new C1261db();
        this.A03 = new C1261db();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC1269dk;
        this.A08 = z2;
        this.A07 = z3;
    }

    public static Rect A00(C1260da c1260da) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        if (c1260da != null) {
            rect = c1260da.A02;
            if (rect.top != Integer.MIN_VALUE) {
                rect2 = c1260da.A02;
                if (rect2.left != Integer.MIN_VALUE) {
                    rect3 = c1260da.A02;
                    if (rect3.right != Integer.MIN_VALUE) {
                        rect4 = c1260da.A02;
                        if (rect4.bottom != Integer.MIN_VALUE) {
                            rect5 = c1260da.A02;
                            return rect5;
                        }
                    }
                }
            }
        }
        throw new IllegalStateException(A02(0, Opcodes.D2L, 9));
    }

    private C1260da A01(Cdo cdo, Rect rect, Rect rect2) {
        boolean A06;
        Rect rect3;
        List list;
        C1260da c1260da = this.A06.get(cdo.A00);
        A06 = this.A04.A06(cdo);
        if (A06) {
            if (c1260da != null) {
                c1260da.A01 = EnumC1264de.A04;
            } else {
                c1260da = C1260da.A03(this.A00);
                this.A06.put(cdo.A00, c1260da);
            }
        }
        rect3 = c1260da.A02;
        rect3.set(rect2);
        list = c1260da.A03;
        list.add(new Rect(rect));
        return c1260da;
    }

    private void A04(C1261db c1261db) {
        Collection<Cdo> A01;
        List list;
        A01 = c1261db.A01();
        for (Cdo cdo : A01) {
            C1260da c1260da = this.A06.get(cdo.A00);
            if (c1260da == null) {
                if (0 != 0) {
                    String str = A02(Opcodes.FCMPG, 36, 26) + cdo.A00;
                    throw new NullPointerException(A02(Opcodes.INVOKEDYNAMIC, 10, 36));
                }
            } else {
                c1260da.A01 = EnumC1264de.A03;
                list = c1260da.A03;
                list.clear();
                cdo.A03(this);
                if (this.A08) {
                    this.A06.remove(c1260da);
                }
            }
        }
    }

    private void A05(C1261db c1261db) {
        Collection A00;
        A00 = c1261db.A00();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            ((Cdo) it.next()).A03(this);
        }
    }

    @Override // com.instagram.common.viewpoint.core.IA
    public final void A3r(Cdo cdo, Rect rect, Rect rect2) {
        boolean A06;
        List list;
        Rect rect3;
        List list2;
        A01(cdo, rect, rect2);
        Cdo cdo2 = cdo.A02;
        Cdo parentViewpointData = Cdo.A08;
        if (cdo2 == parentViewpointData) {
            return;
        }
        A06 = this.A03.A06(cdo2);
        C1260da parentViewProperties = this.A06.get(cdo2.A00);
        if (A06) {
            if (parentViewProperties == null) {
                parentViewProperties = C1260da.A03(this.A00);
                rect3 = parentViewProperties.A02;
                rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(cdo2.A00, parentViewProperties);
            } else {
                list2 = parentViewProperties.A03;
                list2.clear();
                if (!this.A07 || cdo2.A04()) {
                    parentViewProperties.A01 = EnumC1264de.A04;
                }
            }
        }
        list = parentViewProperties.A03;
        list.add(new Rect(rect));
    }

    @Override // com.instagram.common.viewpoint.core.IA
    public final void A4N(long j2, List<Rect> list) {
        Collection A01;
        Collection<Cdo> A012;
        List list2;
        this.A00 = j2;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (hasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                A01 = this.A04.A01();
                Iterator it2 = A01.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((Cdo) it2.next()).A00);
                    } else {
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((Cdo) it2.next()).A00);
                    }
                }
                A012 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (Cdo viewpointData : A012) {
                    this.A06.remove(viewpointData.A00);
                }
                Iterator<C1260da> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    list2 = it3.next().A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.IA
    public final void A5v() {
        Collection A00;
        Collection A002;
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            String obj = toString();
            List<Rect> list = this.A05;
            A00 = this.A04.A00();
            A002 = this.A03.A00();
            new C1259dZ(obj, this, list, A00, A002);
            throw new NullPointerException(A02(Opcodes.D2L, 7, 55));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1263dd
    public final void A7W(Cdo cdo, Rect rect) {
        List list;
        rect.setEmpty();
        list = this.A06.get(cdo.A00).A03;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rect.union((Rect) it.next());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1263dd
    public final EnumC1264de A8h(Cdo cdo) {
        EnumC1264de enumC1264de;
        enumC1264de = this.A06.get(cdo.A00).A01;
        return enumC1264de;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1263dd
    public final void A8j(Rect rect) {
        rect.setEmpty();
        Iterator<Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1263dd
    public final float A8k(Cdo cdo) {
        List<Rect> list;
        C1260da c1260da = this.A06.get(cdo.A00);
        if (c1260da != null) {
            Rect A00 = A00(c1260da);
            int height = A00.height() * A00.width();
            int totalVisibleArea = 0;
            list = c1260da.A03;
            for (Rect rect : list) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / height;
        }
        return 0.0f;
    }

    @Override // com.instagram.common.viewpoint.core.IA
    public final void AGh(InterfaceC1270dl interfaceC1270dl) {
        this.A01 = interfaceC1270dl;
    }
}
