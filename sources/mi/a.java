package mi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.g;
import df.c;
import df.d;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import ka.e;
import ki.l;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a {
    public static final int[][] a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, TTAdConstant.STYLE_SIZE_RADIO_9_16, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, TTAdConstant.IMAGE_LIST_SIZE_CODE}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, PglCryptUtils.ENCRYPT_FAILED, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, PglCryptUtils.INPUT_INVALID, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, TTAdConstant.VIDEO_COVER_URL_CODE, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, PsExtractor.AUDIO_STREAM, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, PsExtractor.VIDEO_STREAM_MASK, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, PsExtractor.AUDIO_STREAM, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, PglCryptUtils.COMPRESS_FAILED, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, PsExtractor.PRIVATE_STREAM_1, 20, 167, 29, 872, 449, 83, 402, 41, 656, PglCryptUtils.ENCRYPT_FAILED, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, PglCryptUtils.BASE64_FAILED, 35, 599, 428, 207, TTAdConstant.IMAGE_LIST_CODE, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, TTAdConstant.STYLE_SIZE_RADIO_2_3, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, TTAdConstant.DOWNLOAD_URL_CODE, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, TTAdConstant.DOWNLOAD_APP_INFO_CODE, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, PsExtractor.AUDIO_STREAM, 516, 258, PsExtractor.VIDEO_STREAM_MASK, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, TTAdConstant.VIDEO_COVER_URL_CODE, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, TTAdConstant.DOWNLOAD_URL_CODE, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, TTAdConstant.IMAGE_LIST_SIZE_CODE, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, TTAdConstant.DOWNLOAD_APP_INFO_CODE, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, TTAdConstant.IMAGE_CODE, 877, 669, 141, 919, 45, 780, TTAdConstant.DOWNLOAD_APP_INFO_CODE, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, g.STALE_CACHED_RESPONSE_VALUE, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, TTAdConstant.IMAGE_LIST_SIZE_CODE, 389, 244, 31, 121, 303, 263}};

    /* renamed from: b, reason: collision with root package name */
    public static final e f22243b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final ac.e f22244c = new ac.e();

    public static final boolean a(byte[] a10, int i10, byte[] b3, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b3[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final void c(long j3, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j3 && j3 - j10 >= j11) {
            return;
        }
        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("size=", j3, " offset=");
        o10.append(j10);
        o10.append(" byteCount=");
        o10.append(j11);
        throw new ArrayIndexOutOfBoundsException(o10.toString());
    }

    public static final String f(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Signature[] signatures = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            int length = signatures.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Signature signature = signatures[i10];
                i10++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                z10 = true;
            }
            if (z10) {
                sb2.setLength(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
            return sb3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static df.a g(c display, int i10, boolean z10) {
        int i11;
        int i12;
        df.a aVar;
        Intrinsics.checkNotNullParameter(display, "display");
        if (i10 >= 3) {
            i11 = d.f17011j | d.f17012k;
        } else {
            i11 = d.f17011j;
        }
        int[] iArr = new int[15];
        iArr[0] = d.f17013l;
        iArr[1] = 8;
        iArr[2] = d.f17014m;
        iArr[3] = 8;
        iArr[4] = d.f17015n;
        iArr[5] = 8;
        iArr[6] = d.f17016o;
        iArr[7] = 8;
        iArr[8] = d.f17017p;
        iArr[9] = d.f17018q | d.f17019r;
        iArr[10] = d.f17020s;
        iArr[11] = i11;
        if (z10) {
            i12 = 12610;
        } else {
            i12 = d.f17006e;
        }
        iArr[12] = i12;
        iArr[13] = z10 ? 1 : 0;
        iArr[14] = d.f17006e;
        df.a[] aVarArr = new df.a[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(display.a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (eglChooseConfig) {
            Iterator<Integer> it = ArraysKt.getIndices(aVarArr).iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                EGLConfig eGLConfig = eGLConfigArr[nextInt];
                if (eGLConfig == null) {
                    aVar = null;
                } else {
                    aVar = new df.a(eGLConfig);
                }
                aVarArr[nextInt] = aVar;
            }
        }
        if (!eglChooseConfig) {
            Log.w("EglConfigChooser", "Unable to find RGB8888 / " + i10 + " EGLConfig");
            return null;
        }
        return aVarArr[0];
    }

    public static void j(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final int o(l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (i10 == -1234567890) {
            return lVar.d();
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q(android.content.Context r19, l.a r20, u1.c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.a.q(android.content.Context, l.a, u1.c, boolean):void");
    }

    public abstract int d(View view, int i10);

    public abstract int e(View view, int i10);

    public int h(View view) {
        return 0;
    }

    public int i() {
        return 0;
    }

    public void k(int i10, View view) {
    }

    public abstract void l(int i10);

    public abstract void m(View view, int i10, int i11);

    public abstract void n(View view, float f10, float f11);

    public abstract boolean p(int i10, View view);
}
