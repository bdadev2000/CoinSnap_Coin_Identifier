package H5;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* loaded from: classes3.dex */
public abstract class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1383g = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f1384h = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String B(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c9 = cArr[5];
        switch (c9) {
            case '0':
            case '1':
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                sb.append(cArr, 0, 2);
                sb.append(c9);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c9);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }
}
