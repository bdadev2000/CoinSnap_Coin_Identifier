package R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2598e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2599a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public int f2600c;

    /* renamed from: d, reason: collision with root package name */
    public char f2601d;

    static {
        for (int i9 = 0; i9 < 1792; i9++) {
            f2598e[i9] = Character.getDirectionality(i9);
        }
    }

    public a(CharSequence charSequence) {
        this.f2599a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        int i9 = this.f2600c - 1;
        CharSequence charSequence = this.f2599a;
        char charAt = charSequence.charAt(i9);
        this.f2601d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f2600c);
            this.f2600c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f2600c--;
        char c9 = this.f2601d;
        if (c9 < 1792) {
            return f2598e[c9];
        }
        return Character.getDirectionality(c9);
    }
}
