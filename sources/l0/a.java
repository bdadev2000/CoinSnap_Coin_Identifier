package l0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f21091e = new byte[1792];
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21092b;

    /* renamed from: c, reason: collision with root package name */
    public int f21093c;

    /* renamed from: d, reason: collision with root package name */
    public char f21094d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f21091e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.a = charSequence;
        this.f21092b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f21093c - 1;
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(i10);
        this.f21094d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f21093c);
            this.f21093c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f21093c--;
        char c10 = this.f21094d;
        if (c10 < 1792) {
            return f21091e[c10];
        }
        return Character.getDirectionality(c10);
    }
}
