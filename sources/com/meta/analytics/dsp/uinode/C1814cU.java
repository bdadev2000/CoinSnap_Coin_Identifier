package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1814cU {
    public InterfaceC1815cV A00;
    public C1801cH A01;
    public final InterfaceC1823ce A03;
    public final InterfaceC1816cW A04;
    public final LinkedHashMap<Integer, Runnable> A05 = new LinkedHashMap<>();
    public final InterfaceC1815cV A02 = new HD(this);

    public C1814cU(InterfaceC1823ce interfaceC1823ce, InterfaceC1816cW interfaceC1816cW) {
        this.A03 = interfaceC1823ce;
        this.A04 = interfaceC1816cW;
    }

    public static C1814cU A01() {
        return new C1814cU(new HH(), null);
    }

    private void A03(AbstractC1817cY abstractC1817cY, InterfaceC1821cc interfaceC1821cc, HB hb) {
        C1801cH A00 = C1801cH.A00(abstractC1817cY, interfaceC1821cc, hb);
        this.A01 = A00;
        if (0 != 0) {
            A00.A01(null);
        }
        this.A01.A02(this.A02);
    }

    private final void A04(DspViewableNode dspViewableNode) {
        C1801cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null) {
            localViewpointWatcher.A03(dspViewableNode);
        }
    }

    private final void A05(DspViewableNode dspViewableNode, C1819ca c1819ca) {
        C1801cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null && c1819ca != null) {
            localViewpointWatcher.A04(dspViewableNode, c1819ca);
        }
    }

    public final void A06(View view) {
        A04(view != null ? ViewpointViewNode.A00(view) : null);
    }

    public final void A07(View view, C1819ca c1819ca) {
        A05(view != null ? ViewpointViewNode.A00(view) : null, c1819ca);
    }

    public final void A08(AbstractC1817cY abstractC1817cY, View view) {
        if (abstractC1817cY != null && view != null) {
            final InterfaceC1816cW interfaceC1816cW = null;
            A03(abstractC1817cY, new HE(view, this.A03), new HB(interfaceC1816cW) { // from class: com.facebook.ads.redexgen.X.6w
                public static byte[] A09;
                public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
                public static final String A0B;
                public long A00;
                public cX A01;
                public final InterfaceC1816cW A02;
                public final Map<String, C1806cM> A06 = new HashMap();
                public final C1807cN A04 = new C1807cN();
                public final C1807cN A03 = new C1807cN();
                public final List<Rect> A05 = new ArrayList(1);
                public final boolean A08 = false;
                public final boolean A07 = false;

                public static String A02(int i9, int i10, int i11) {
                    byte[] copyOfRange = Arrays.copyOfRange(A09, i9, i9 + i10);
                    for (int i12 = 0; i12 < copyOfRange.length; i12++) {
                        copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 91);
                    }
                    return new String(copyOfRange);
                }

                public static void A03() {
                    A09 = new byte[]{41, Ascii.NAK, Ascii.DC4, Ascii.SO, 93, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.CR, Ascii.DC2, Ascii.DC4, 19, 9, 93, Ascii.NAK, Ascii.FS, Ascii.SO, 93, 19, Ascii.DC2, 9, 93, Ascii.US, Ascii.CAN, Ascii.CAN, 19, 93, Ascii.DLE, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, Ascii.EM, 93, Ascii.DC2, Ascii.SI, 93, Ascii.DC4, Ascii.SO, 93, Ascii.FS, 93, Ascii.SUB, Ascii.SI, Ascii.DC2, 8, Ascii.CR, 93, 10, Ascii.NAK, Ascii.DC4, Ascii.RS, Ascii.NAK, 93, 10, Ascii.DC4, 17, 17, 93, 19, Ascii.CAN, Ascii.VT, Ascii.CAN, Ascii.SI, 93, Ascii.SI, Ascii.CAN, 9, 8, Ascii.SI, 19, 93, Ascii.FS, 93, Ascii.DLE, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, Ascii.DLE, Ascii.CAN, 19, 9, 93, Ascii.SO, Ascii.DC4, 19, Ascii.RS, Ascii.CAN, 93, Ascii.DC4, 9, 90, Ascii.SO, 93, Ascii.DLE, Ascii.FS, Ascii.EM, Ascii.CAN, 93, 8, Ascii.CR, 93, Ascii.DC2, Ascii.ESC, 93, Ascii.SO, 8, Ascii.US, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.SO, 93, 9, Ascii.NAK, Ascii.FS, 9, 93, Ascii.RS, Ascii.DC2, 8, 17, Ascii.EM, 93, Ascii.US, Ascii.CAN, 93, Ascii.DC2, Ascii.ESC, Ascii.ESC, Ascii.SO, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CAN, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
                }

                static {
                    A03();
                    A0B = C09566w.class.getSimpleName();
                }

                {
                    this.A02 = interfaceC1816cW;
                }

                public static Rect A00(C1806cM c1806cM) {
                    Rect rect;
                    Rect rect2;
                    Rect rect3;
                    Rect rect4;
                    Rect rect5;
                    if (c1806cM != null) {
                        rect = c1806cM.A02;
                        if (rect.top != Integer.MIN_VALUE) {
                            rect2 = c1806cM.A02;
                            if (rect2.left != Integer.MIN_VALUE) {
                                rect3 = c1806cM.A02;
                                String[] strArr = A0A;
                                if (strArr[1].length() == strArr[6].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[1] = TtmlNode.TAG_P;
                                strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                                if (rect3.right != Integer.MIN_VALUE) {
                                    rect4 = c1806cM.A02;
                                    if (rect4.bottom != Integer.MIN_VALUE) {
                                        rect5 = c1806cM.A02;
                                        return rect5;
                                    }
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(A02(0, 143, 38));
                }

                private C1806cM A01(C1819ca c1819ca, Rect rect, Rect rect2) {
                    boolean A06;
                    Rect rect3;
                    List list;
                    C1806cM c1806cM = this.A06.get(c1819ca.A04);
                    A06 = this.A04.A06(c1819ca);
                    if (A06) {
                        if (c1806cM != null) {
                            c1806cM.A01 = EnumC1810cQ.A04;
                        } else {
                            c1806cM = C1806cM.A03(this.A00);
                            this.A06.put(c1819ca.A04, c1806cM);
                        }
                    }
                    rect3 = c1806cM.A02;
                    rect3.set(rect2);
                    list = c1806cM.A03;
                    list.add(new Rect(rect));
                    return c1806cM;
                }

                private void A04(C1807cN c1807cN) {
                    Collection<C1819ca> A01;
                    List list;
                    A01 = c1807cN.A01();
                    for (C1819ca c1819ca : A01) {
                        C1806cM c1806cM = this.A06.get(c1819ca.A04);
                        if (c1806cM == null) {
                            if (0 != 0) {
                                String str = A02(150, 36, 10) + c1819ca.A04;
                                throw new NullPointerException(A02(186, 10, 85));
                            }
                        } else {
                            c1806cM.A01 = EnumC1810cQ.A03;
                            list = c1806cM.A03;
                            list.clear();
                            c1819ca.A03(this);
                            if (this.A08) {
                                Map<String, C1806cM> map = this.A06;
                                String[] strArr = A0A;
                                if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                                strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                                map.remove(c1806cM);
                            } else {
                                continue;
                            }
                        }
                    }
                }

                private void A05(C1807cN c1807cN) {
                    Collection A00;
                    A00 = c1807cN.A00();
                    Iterator it = A00.iterator();
                    while (it.hasNext()) {
                        ((C1819ca) it.next()).A03(this);
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void A3V(C1819ca c1819ca, Rect rect, Rect rect2) {
                    boolean A06;
                    List list;
                    Rect rect3;
                    List list2;
                    A01(c1819ca, rect, rect2);
                    C1819ca c1819ca2 = c1819ca.A01;
                    C1819ca parentViewpointData = C1819ca.A08;
                    if (c1819ca2 == parentViewpointData) {
                        return;
                    }
                    A06 = this.A03.A06(c1819ca2);
                    C1806cM parentViewProperties = this.A06.get(c1819ca2.A04);
                    if (A06) {
                        if (parentViewProperties == null) {
                            parentViewProperties = C1806cM.A03(this.A00);
                            rect3 = parentViewProperties.A02;
                            rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                            this.A06.put(c1819ca2.A04, parentViewProperties);
                        } else {
                            list2 = parentViewProperties.A03;
                            list2.clear();
                            if (!this.A07 || c1819ca2.A04()) {
                                parentViewProperties.A01 = EnumC1810cQ.A04;
                            }
                        }
                    }
                    list = parentViewProperties.A03;
                    list.add(new Rect(rect));
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void A41(long j7, List<Rect> viewportRects) {
                    Collection A01;
                    Collection A012;
                    List list;
                    this.A00 = j7;
                    this.A05.clear();
                    Iterator<Rect> it = viewportRects.iterator();
                    while (it.hasNext()) {
                        this.A05.add(new Rect(it.next()));
                    }
                    A01 = this.A04.A01();
                    Iterator it2 = A01.iterator();
                    while (it2.hasNext()) {
                        this.A06.remove(((C1819ca) it2.next()).A04);
                    }
                    A012 = this.A03.A01();
                    Iterator it3 = A012.iterator();
                    while (it3.hasNext()) {
                        this.A06.remove(((C1819ca) it3.next()).A04);
                    }
                    Iterator<C1806cM> it4 = this.A06.values().iterator();
                    while (it4.hasNext()) {
                        list = it4.next().A03;
                        list.clear();
                    }
                    this.A04.A04();
                    this.A03.A04();
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void A5Z() {
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
                        new C1805cL(obj, this, list, A00, A002);
                        throw new NullPointerException(A02(143, 7, 67));
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1809cP
                public final void A78(C1819ca c1819ca, Rect rect) {
                    List list;
                    rect.setEmpty();
                    list = this.A06.get(c1819ca.A04).A03;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        rect.union((Rect) it.next());
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1809cP
                public final EnumC1810cQ A8J(C1819ca c1819ca) {
                    EnumC1810cQ enumC1810cQ;
                    enumC1810cQ = this.A06.get(c1819ca.A04).A01;
                    return enumC1810cQ;
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1809cP
                public final void A8L(Rect rect) {
                    rect.setEmpty();
                    Iterator<Rect> it = this.A05.iterator();
                    while (it.hasNext()) {
                        rect.union(it.next());
                    }
                }

                @Override // com.meta.analytics.dsp.uinode.InterfaceC1809cP
                public final float A8M(C1819ca c1819ca) {
                    List<Rect> list;
                    C1806cM c1806cM = this.A06.get(c1819ca.A04);
                    if (c1806cM != null) {
                        Rect A00 = A00(c1806cM);
                        int height = A00.height() * A00.width();
                        int totalVisibleArea = 0;
                        list = c1806cM.A03;
                        for (Rect rect : list) {
                            totalVisibleArea += rect.height() * rect.width();
                        }
                        return totalVisibleArea / height;
                    }
                    return 0.0f;
                }

                @Override // com.meta.analytics.dsp.uinode.HB
                public final void AGH(cX cXVar) {
                    this.A01 = cXVar;
                }
            });
        }
    }
}
