package P1;

/* loaded from: classes.dex */
public final class w implements Appendable {
    public final Appendable b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2404c = true;

    public w(Appendable appendable) {
        this.b = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) {
        boolean z8 = this.f2404c;
        Appendable appendable = this.b;
        if (z8) {
            this.f2404c = false;
            appendable.append("  ");
        }
        this.f2404c = c9 == '\n';
        appendable.append(c9);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i9, int i10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z8 = this.f2404c;
        Appendable appendable = this.b;
        boolean z9 = false;
        if (z8) {
            this.f2404c = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
            z9 = true;
        }
        this.f2404c = z9;
        appendable.append(charSequence, i9, i10);
        return this;
    }
}
