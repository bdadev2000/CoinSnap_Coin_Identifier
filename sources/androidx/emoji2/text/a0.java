package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a0 extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    public final Class f1491b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1492c;

    public a0(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1492c = new ArrayList();
        if (cls != null) {
            this.f1491b = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1492c;
            if (i10 < arrayList.size()) {
                ((z) arrayList.get(i10)).f1552c.incrementAndGet();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1492c;
            if (i10 < arrayList.size()) {
                ((z) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
                i10++;
            } else {
                return;
            }
        }
    }

    public final z c(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1492c;
            if (i10 < arrayList.size()) {
                z zVar = (z) arrayList.get(i10);
                if (zVar.f1551b == obj) {
                    return zVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        boolean z10;
        if (obj == null) {
            return false;
        }
        if (this.f1491b == obj.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1492c;
            if (i10 < arrayList.size()) {
                ((z) arrayList.get(i10)).f1552c.decrementAndGet();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        z c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        z c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        z c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        boolean z10;
        if (this.f1491b == cls) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z[] zVarArr = (z[]) super.getSpans(i10, i11, z.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, zVarArr.length);
            for (int i12 = 0; i12 < zVarArr.length; i12++) {
                objArr[i12] = zVarArr[i12].f1551b;
            }
            return objArr;
        }
        return super.getSpans(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        if (r0 != false) goto L8;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class r0 = r1.f1491b
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<androidx.emoji2.text.z> r4 = androidx.emoji2.text.z.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.a0.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        z zVar;
        if (d(obj)) {
            zVar = c(obj);
            if (zVar != null) {
                obj = zVar;
            }
        } else {
            zVar = null;
        }
        super.removeSpan(obj);
        if (zVar != null) {
            this.f1492c.remove(zVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence) {
        replace(i10, i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (d(obj)) {
            z zVar = new z(obj);
            this.f1492c.add(zVar);
            obj = zVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new a0(this.f1491b, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        replace(i10, i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public a0(Class cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f1492c = new ArrayList();
        if (cls != null) {
            this.f1491b = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
