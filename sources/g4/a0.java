package g4;

/* loaded from: classes.dex */
public final class a0 implements Appendable {

    /* renamed from: b, reason: collision with root package name */
    public final Appendable f18032b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18033c = true;

    public a0(Appendable appendable) {
        this.f18032b = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        boolean z10 = this.f18033c;
        Appendable appendable = this.f18032b;
        if (z10) {
            this.f18033c = false;
            appendable.append("  ");
        }
        this.f18033c = c10 == '\n';
        appendable.append(c10);
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
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z10 = this.f18033c;
        Appendable appendable = this.f18032b;
        boolean z11 = false;
        if (z10) {
            this.f18033c = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z11 = true;
        }
        this.f18033c = z11;
        appendable.append(charSequence, i10, i11);
        return this;
    }
}
