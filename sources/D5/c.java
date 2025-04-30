package D5;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;

/* loaded from: classes3.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    Cp437(new String[0], 0, 2),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_1(new String[]{"ISO-8859-1"}, 1, 3),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_2(4, "ISO-8859-2"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_3(5, "ISO-8859-3"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_4(6, "ISO-8859-4"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_5(7, "ISO-8859-5"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_6(8, "ISO-8859-6"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_7(9, "ISO-8859-7"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_8(10, "ISO-8859-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_9(11, "ISO-8859-9"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_10(12, "ISO-8859-10"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_11(13, "ISO-8859-11"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_13(15, "ISO-8859-13"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_14(16, "ISO-8859-14"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_15(17, "ISO-8859-15"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_16(18, "ISO-8859-16"),
    /* JADX INFO: Fake field, exist only in values array */
    SJIS(20, "Shift_JIS"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1250(21, "windows-1250"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1251(22, "windows-1251"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1252(23, "windows-1252"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1256(24, "windows-1256"),
    /* JADX INFO: Fake field, exist only in values array */
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    /* JADX INFO: Fake field, exist only in values array */
    UTF8(26, "UTF-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ASCII(new String[]{C.ASCII_NAME}, 27, 170),
    /* JADX INFO: Fake field, exist only in values array */
    Big5(new String[0], 28),
    /* JADX INFO: Fake field, exist only in values array */
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EUC_KR(30, "EUC-KR");


    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f749d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f750f = new HashMap();
    public final int[] b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f752c;

    static {
        for (c cVar : values()) {
            for (int i9 : cVar.b) {
                f749d.put(Integer.valueOf(i9), cVar);
            }
            f750f.put(cVar.name(), cVar);
            for (String str : cVar.f752c) {
                f750f.put(str, cVar);
            }
        }
    }

    c(int i9, String... strArr) {
        this.b = new int[]{i9};
        this.f752c = strArr;
    }

    c(String[] strArr, int... iArr) {
        this.b = iArr;
        this.f752c = strArr;
    }
}
