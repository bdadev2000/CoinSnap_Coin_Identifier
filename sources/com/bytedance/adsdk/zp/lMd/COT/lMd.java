package com.bytedance.adsdk.zp.lMd.COT;

import com.bytedance.adsdk.zp.lMd.jU.KS;
import com.bytedance.adsdk.zp.lMd.jU.jU;
import com.bytedance.adsdk.zp.lMd.lMd.zp.Bj;
import com.bytedance.adsdk.zp.lMd.lMd.zp.COT;
import com.bytedance.adsdk.zp.lMd.lMd.zp.HWF;
import com.bytedance.adsdk.zp.lMd.lMd.zp.YW;
import com.bytedance.adsdk.zp.lMd.lMd.zp.ku;
import com.bytedance.adsdk.zp.lMd.lMd.zp.pvr;
import com.bytedance.adsdk.zp.lMd.lMd.zp.rV;
import com.bytedance.adsdk.zp.lMd.lMd.zp.tG;
import com.bytedance.adsdk.zp.lMd.lMd.zp.vDp;
import com.bytedance.adsdk.zp.lMd.lMd.zp.vwr;
import com.bytedance.adsdk.zp.lMd.lMd.zp.woN;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class lMd {

    /* renamed from: com.bytedance.adsdk.zp.lMd.COT.lMd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[KS.values().length];
            zp = iArr;
            try {
                iArr[KS.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[KS.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[KS.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zp[KS.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zp[KS.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zp[KS.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zp[KS.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zp[KS.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zp[KS.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zp[KS.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zp[KS.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zp[KS.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zp[KS.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static void KS(List<com.bytedance.adsdk.zp.lMd.lMd.zp> list, String str, int i9) {
        Iterator<com.bytedance.adsdk.zp.lMd.lMd.zp> it = list.iterator();
        while (it.hasNext()) {
            if (jU.zp(it.next().zp())) {
                throw new IllegalArgumentException(str.substring(0, i9));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> lMd(List<com.bytedance.adsdk.zp.lMd.lMd.zp> list, String str, int i9) {
        LinkedList<com.bytedance.adsdk.zp.lMd.lMd.zp> linkedList = new LinkedList(list);
        int i10 = 5;
        while (i10 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.zp.lMd.lMd.zp zpVar : linkedList) {
                if (!linkedList2.isEmpty() && KS.zp(((com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList2.peekLast()).zp()) && ((KS) ((com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList2.peekLast()).zp()).lMd() == i10) {
                    com.bytedance.adsdk.zp.lMd.lMd.zp zpVar2 = (com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList2.pollLast();
                    com.bytedance.adsdk.zp.lMd.lMd.zp zpVar3 = (com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList2.pollLast();
                    if (!KS.zp(zpVar3.zp()) && !KS.zp(zpVar.zp())) {
                        linkedList2.addLast(zp(zpVar3, zpVar2, zpVar));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i9));
                    }
                } else {
                    linkedList2.addLast(zpVar);
                }
            }
            i10--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.zp.lMd.lMd.zp zp(List<com.bytedance.adsdk.zp.lMd.lMd.zp> list, String str, int i9) {
        KS(list, str, i9);
        Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> zp = zp(lMd(list, str, i9));
        if (zp.size() == 1) {
            return zp.getFirst();
        }
        throw new IllegalStateException();
    }

    private static Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> zp(Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.zp.lMd.lMd.zp zpVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList.peekLast()).zp() == KS.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.zp.lMd.lMd.zp zpVar2 = (com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList.pollLast();
                if (((com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList.pollLast()).zp() == KS.QUESTION) {
                    com.bytedance.adsdk.zp.lMd.lMd.zp zpVar3 = (com.bytedance.adsdk.zp.lMd.lMd.zp) linkedList.pollLast();
                    pvr pvrVar = new pvr();
                    pvrVar.zp(zpVar3);
                    pvrVar.lMd(zpVar2);
                    pvrVar.KS(zpVar);
                    linkedList.addLast(pvrVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(zpVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.zp.lMd.lMd.zp zp(com.bytedance.adsdk.zp.lMd.lMd.zp zpVar, com.bytedance.adsdk.zp.lMd.lMd.zp zpVar2, com.bytedance.adsdk.zp.lMd.lMd.zp zpVar3) {
        woN bj;
        switch (AnonymousClass1.zp[((KS) zpVar2.zp()).ordinal()]) {
            case 1:
                bj = new Bj();
                break;
            case 2:
                bj = new vwr();
                break;
            case 3:
                bj = new com.bytedance.adsdk.zp.lMd.lMd.zp.zp();
                break;
            case 4:
                bj = new tG();
                break;
            case 5:
                bj = new vDp();
                break;
            case 6:
                bj = new com.bytedance.adsdk.zp.lMd.lMd.zp.jU();
                break;
            case 7:
                bj = new rV();
                break;
            case 8:
                bj = new HWF();
                break;
            case 9:
                bj = new YW();
                break;
            case 10:
                bj = new COT();
                break;
            case 11:
                bj = new ku();
                break;
            case 12:
                bj = new com.bytedance.adsdk.zp.lMd.lMd.zp.lMd();
                break;
            case 13:
                bj = new com.bytedance.adsdk.zp.lMd.lMd.zp.KS();
                break;
            default:
                throw new UnsupportedOperationException(zpVar2.zp().toString());
        }
        bj.zp(zpVar);
        bj.lMd(zpVar3);
        return bj;
    }

    public static boolean zp(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
