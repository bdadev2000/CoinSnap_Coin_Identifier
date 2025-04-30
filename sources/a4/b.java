package A4;

import x4.C2923a;

/* loaded from: classes2.dex */
public final class b {
    public static final C2923a b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final String f42c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d, reason: collision with root package name */
    public static final String f43d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e, reason: collision with root package name */
    public static final a f44e = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final f f45a;

    public b(f fVar) {
        this.f45a = fVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                sb.append(str.charAt(i9));
                if (str2.length() > i9) {
                    sb.append(str2.charAt(i9));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
