package com.bytedance.adsdk.YFl.Sg.wN;

import com.bytedance.adsdk.YFl.Sg.AlY.AlY;
import com.bytedance.adsdk.YFl.Sg.AlY.tN;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.GA;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.NjR;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.Wwa;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.YoT;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.eT;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.lG;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.pDU;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.qO;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.qsH;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.vc;
import com.bytedance.adsdk.YFl.Sg.Sg.YFl.wN;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class Sg {

    /* renamed from: com.bytedance.adsdk.YFl.Sg.wN.Sg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[tN.values().length];
            YFl = iArr;
            try {
                iArr[tN.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[tN.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[tN.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                YFl[tN.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                YFl[tN.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                YFl[tN.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                YFl[tN.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                YFl[tN.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                YFl[tN.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                YFl[tN.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                YFl[tN.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                YFl[tN.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                YFl[tN.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> Sg(List<com.bytedance.adsdk.YFl.Sg.Sg.YFl> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.YFl.Sg.Sg.YFl> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl : linkedList) {
                if (!linkedList2.isEmpty() && tN.YFl(((com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList2.peekLast()).YFl()) && ((tN) ((com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList2.peekLast()).YFl()).Sg() == i11) {
                    com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl2 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList2.pollLast();
                    com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl3 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList2.pollLast();
                    if (!tN.YFl(yFl3.YFl()) && !tN.YFl(yFl.YFl())) {
                        linkedList2.addLast(YFl(yFl3, yFl2, yFl));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                } else {
                    linkedList2.addLast(yFl);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.YFl.Sg.Sg.YFl YFl(List<com.bytedance.adsdk.YFl.Sg.Sg.YFl> list, String str, int i10) {
        tN(list, str, i10);
        Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> YFl = YFl(Sg(list, str, i10));
        if (YFl.size() == 1) {
            return YFl.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void tN(List<com.bytedance.adsdk.YFl.Sg.Sg.YFl> list, String str, int i10) {
        Iterator<com.bytedance.adsdk.YFl.Sg.Sg.YFl> it = list.iterator();
        while (it.hasNext()) {
            if (AlY.YFl(it.next().YFl())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> YFl(Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList.peekLast()).YFl() == tN.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl2 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList.pollLast();
                if (((com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList.pollLast()).YFl() == tN.QUESTION) {
                    com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl3 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl) linkedList.pollLast();
                    qO qOVar = new qO();
                    qOVar.YFl(yFl3);
                    qOVar.Sg(yFl2);
                    qOVar.tN(yFl);
                    linkedList.addLast(qOVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(yFl);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.YFl.Sg.Sg.YFl YFl(com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl, com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl2, com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl3) {
        lG eTVar;
        switch (AnonymousClass1.YFl[((tN) yFl2.YFl()).ordinal()]) {
            case 1:
                eTVar = new eT();
                break;
            case 2:
                eTVar = new Wwa();
                break;
            case 3:
                eTVar = new com.bytedance.adsdk.YFl.Sg.Sg.YFl.YFl();
                break;
            case 4:
                eTVar = new GA();
                break;
            case 5:
                eTVar = new YoT();
                break;
            case 6:
                eTVar = new com.bytedance.adsdk.YFl.Sg.Sg.YFl.AlY();
                break;
            case 7:
                eTVar = new pDU();
                break;
            case 8:
                eTVar = new vc();
                break;
            case 9:
                eTVar = new NjR();
                break;
            case 10:
                eTVar = new wN();
                break;
            case 11:
                eTVar = new qsH();
                break;
            case 12:
                eTVar = new com.bytedance.adsdk.YFl.Sg.Sg.YFl.Sg();
                break;
            case 13:
                eTVar = new com.bytedance.adsdk.YFl.Sg.Sg.YFl.tN();
                break;
            default:
                throw new UnsupportedOperationException(yFl2.YFl().toString());
        }
        eTVar.YFl(yFl);
        eTVar.Sg(yFl3);
        return eTVar;
    }

    public static boolean YFl(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
