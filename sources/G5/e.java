package G5;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1284a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    public static final int[][] b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, PsExtractor.VIDEO_STREAM_MASK, 92, 254}, new int[]{28, 24, 185, 166, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 248, 116, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, PsExtractor.AUDIO_STREAM, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, PsExtractor.VIDEO_STREAM_MASK, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, PsExtractor.AUDIO_STREAM, 215, 235, 150, 159, 36, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, PsExtractor.PRIVATE_STREAM_1, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, PsExtractor.PRIVATE_STREAM_1, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1285c = new int[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1286d = new int[255];

    static {
        int i9 = 1;
        for (int i10 = 0; i10 < 255; i10++) {
            f1286d[i10] = i9;
            f1285c[i9] = i10;
            i9 <<= 1;
            if (i9 >= 256) {
                i9 ^= 301;
            }
        }
    }

    public static String a(int i9, String str) {
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11;
        int length = str.length();
        int i12 = 0;
        while (true) {
            if (i12 < 16) {
                if (f1284a[i12] == i9) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int[] iArr3 = b[i12];
            char[] cArr = new char[i9];
            for (int i13 = 0; i13 < i9; i13++) {
                cArr[i13] = 0;
            }
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = i9 - 1;
                int charAt = cArr[i15] ^ str.charAt(i14);
                while (true) {
                    iArr = f1285c;
                    iArr2 = f1286d;
                    if (i15 <= 0) {
                        break;
                    }
                    if (charAt != 0 && (i11 = iArr3[i15]) != 0) {
                        cArr[i15] = (char) (iArr2[(iArr[charAt] + iArr[i11]) % 255] ^ cArr[i15 - 1]);
                    } else {
                        cArr[i15] = cArr[i15 - 1];
                    }
                    i15--;
                }
                if (charAt != 0 && (i10 = iArr3[0]) != 0) {
                    cArr[0] = (char) iArr2[(iArr[charAt] + iArr[i10]) % 255];
                } else {
                    cArr[0] = 0;
                }
            }
            char[] cArr2 = new char[i9];
            for (int i16 = 0; i16 < i9; i16++) {
                cArr2[i16] = cArr[(i9 - i16) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i9)));
    }
}
