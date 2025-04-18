package l0;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final i f21095d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f21096e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f21097f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f21098g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f21099h;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21100b;

    /* renamed from: c, reason: collision with root package name */
    public final h f21101c;

    static {
        i iVar = j.f21109c;
        f21095d = iVar;
        f21096e = Character.toString((char) 8206);
        f21097f = Character.toString((char) 8207);
        f21098g = new b(false, 2, iVar);
        f21099h = new b(true, 2, iVar);
    }

    public b(boolean z10, int i10, h hVar) {
        this.a = z10;
        this.f21100b = i10;
        this.f21101c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:
    
        if (r0.f21093c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0081, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0084, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008c, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0088, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            l0.a r0 = new l0.a
            r0.<init>(r9)
            r9 = 0
            r0.f21093c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f21093c
            int r5 = r0.f21092b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.f21094d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f21093c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f21093c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f21093c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f21093c
            int r4 = r4 + r7
            r0.f21093c = r4
            char r4 = r0.f21094d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = l0.a.f21091e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.f21093c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = r7
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = r6
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0020. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            l0.a r0 = new l0.a
            r0.<init>(r6)
            int r6 = r0.f21092b
            r0.f21093c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f21093c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            if (r3 == 0) goto L39
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.b.b(java.lang.CharSequence):int");
    }

    public static b c() {
        androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a();
        int i10 = aVar.f799b;
        if (i10 == 2 && ((h) aVar.f800c) == f21095d) {
            if (aVar.a) {
                return f21099h;
            }
            return f21098g;
        }
        return new b(aVar.a, i10, (h) aVar.f800c);
    }

    public final SpannableStringBuilder d(CharSequence charSequence, h hVar) {
        boolean z10;
        i iVar;
        char c10;
        i iVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean i10 = hVar.i(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f21100b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = f21097f;
        String str3 = f21096e;
        boolean z11 = this.a;
        if (z10) {
            if (i10) {
                iVar2 = j.f21108b;
            } else {
                iVar2 = j.a;
            }
            boolean i11 = iVar2.i(charSequence, charSequence.length());
            if (!z11 && (i11 || a(charSequence) == 1)) {
                str = str3;
            } else if (!z11 || (i11 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (i10 != z11) {
            if (i10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (i10) {
            iVar = j.f21108b;
        } else {
            iVar = j.a;
        }
        boolean i12 = iVar.i(charSequence, charSequence.length());
        if (!z11 && (i12 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z11 || (i12 && b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
