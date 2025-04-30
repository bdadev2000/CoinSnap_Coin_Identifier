package C5;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class d {
    public static final String[] b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f561c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f562d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f563e;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f564a;

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, NotificationCompat.FLAG_LOCAL_ONLY);
        f562d = iArr;
        iArr[0][32] = 1;
        for (int i9 = 65; i9 <= 90; i9++) {
            f562d[0][i9] = i9 - 63;
        }
        f562d[1][32] = 1;
        for (int i10 = 97; i10 <= 122; i10++) {
            f562d[1][i10] = i10 - 95;
        }
        f562d[2][32] = 1;
        for (int i11 = 48; i11 <= 57; i11++) {
            f562d[2][i11] = i11 - 46;
        }
        int[] iArr2 = f562d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i12 = 0; i12 < 28; i12++) {
            f562d[3][iArr3[i12]] = i12;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i13 = 0; i13 < 31; i13++) {
            int i14 = iArr4[i13];
            if (i14 > 0) {
                f562d[4][i14] = i13;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f563e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f563e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr) {
        this.f564a = bArr;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    f fVar2 = (f) it2.next();
                    if (fVar2.c(fVar)) {
                        break;
                    }
                    if (fVar.c(fVar2)) {
                        it2.remove();
                    }
                } else {
                    linkedList2.add(fVar);
                    break;
                }
            }
        }
        return linkedList2;
    }
}
