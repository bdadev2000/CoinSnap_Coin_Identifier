package R;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2611a = new Object();

    public final int a(CharSequence charSequence, int i9) {
        int i10 = 2;
        for (int i11 = 0; i11 < i9 && i10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            B3.e eVar = g.f2612a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i10 = 2;
                            break;
                    }
                }
                i10 = 0;
            }
            i10 = 1;
        }
        return i10;
    }
}
