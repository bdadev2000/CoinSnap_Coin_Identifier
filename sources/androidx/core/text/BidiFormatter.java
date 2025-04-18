package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class BidiFormatter {
    public static final TextDirectionHeuristicCompat d;
    public static final String e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f18654f;

    /* renamed from: g, reason: collision with root package name */
    public static final BidiFormatter f18655g;

    /* renamed from: h, reason: collision with root package name */
    public static final BidiFormatter f18656h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18657a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18658b;

    /* renamed from: c, reason: collision with root package name */
    public final TextDirectionHeuristicCompat f18659c;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public TextDirectionHeuristicCompat f18660a;
    }

    /* loaded from: classes2.dex */
    public static class DirectionalityEstimator {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f18661f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18662a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18663b = false;

        /* renamed from: c, reason: collision with root package name */
        public final int f18664c;
        public int d;
        public char e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f18661f[i2] = Character.getDirectionality(i2);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence) {
            this.f18662a = charSequence;
            this.f18664c = charSequence.length();
        }

        public final byte a() {
            char charAt;
            char charAt2;
            int i2 = this.d - 1;
            CharSequence charSequence = this.f18662a;
            char charAt3 = charSequence.charAt(i2);
            this.e = charAt3;
            if (Character.isLowSurrogate(charAt3)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            char c2 = this.e;
            byte directionality = c2 < 1792 ? f18661f[c2] : Character.getDirectionality(c2);
            if (!this.f18663b) {
                return directionality;
            }
            char c3 = this.e;
            if (c3 != '>') {
                if (c3 != ';') {
                    return directionality;
                }
                int i3 = this.d;
                do {
                    int i4 = this.d;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    this.d = i5;
                    charAt = charSequence.charAt(i5);
                    this.e = charAt;
                    if (charAt == '&') {
                        return (byte) 12;
                    }
                } while (charAt != ';');
                this.d = i3;
                this.e = ';';
                return (byte) 13;
            }
            int i6 = this.d;
            while (true) {
                int i7 = this.d;
                if (i7 <= 0) {
                    break;
                }
                int i8 = i7 - 1;
                this.d = i8;
                char charAt4 = charSequence.charAt(i8);
                this.e = charAt4;
                if (charAt4 == '<') {
                    break;
                }
                if (charAt4 == '>') {
                    break;
                }
                if (charAt4 == '\"' || charAt4 == '\'') {
                    do {
                        int i9 = this.d;
                        if (i9 > 0) {
                            int i10 = i9 - 1;
                            this.d = i10;
                            charAt2 = charSequence.charAt(i10);
                            this.e = charAt2;
                        }
                    } while (charAt2 != charAt4);
                }
            }
            this.d = i6;
            this.e = '>';
            return (byte) 13;
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f18672c;
        d = textDirectionHeuristicCompat;
        e = Character.toString((char) 8206);
        f18654f = Character.toString((char) 8207);
        f18655g = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        f18656h = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z2, int i2, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f18657a = z2;
        this.f18658b = i2;
        this.f18659c = textDirectionHeuristicCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ea, code lost:
    
        if (r1 != r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0090, code lost:
    
        if (r9 == '&') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0092, code lost:
    
        r4 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0094, code lost:
    
        if (r4 >= r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0096, code lost:
    
        r0.d = r4 + 1;
        r4 = r8.charAt(r4);
        r0.e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a2, code lost:
    
        if (r4 == ';') goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ce, code lost:
    
        if (r1 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d1, code lost:
    
        if (r2 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d7, code lost:
    
        if (r0.d <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00dd, code lost:
    
        switch(r0.a()) {
            case 14: goto L107;
            case 15: goto L107;
            case 16: goto L106;
            case 17: goto L106;
            case 18: goto L105;
            default: goto L111;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e1, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00e4, code lost:
    
        if (r1 != r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e7, code lost:
    
        r3 = r3 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.BidiFormatter.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0021. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r7) {
        /*
            androidx.core.text.BidiFormatter$DirectionalityEstimator r0 = new androidx.core.text.BidiFormatter$DirectionalityEstimator
            r0.<init>(r7)
            int r7 = r0.f18664c
            r0.d = r7
            r7 = 0
            r1 = r7
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.d
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L3b
            r5 = 1
            if (r3 == r5) goto L35
            r6 = 2
            if (r3 == r6) goto L35
            r6 = 9
            if (r3 == r6) goto Lc
            switch(r3) {
                case 14: goto L31;
                case 15: goto L31;
                case 16: goto L2a;
                case 17: goto L2a;
                case 18: goto L27;
                default: goto L24;
            }
        L24:
            if (r2 != 0) goto Lc
            goto L40
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            if (r2 != r1) goto L2e
        L2c:
            r7 = r5
            goto L41
        L2e:
            int r1 = r1 + (-1)
            goto Lc
        L31:
            if (r2 != r1) goto L2e
        L33:
            r7 = r4
            goto L41
        L35:
            if (r1 != 0) goto L38
            goto L2c
        L38:
            if (r2 != 0) goto Lc
            goto L40
        L3b:
            if (r1 != 0) goto L3e
            goto L33
        L3e:
            if (r2 != 0) goto Lc
        L40:
            goto Lb
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.BidiFormatter.b(java.lang.CharSequence):int");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.text.BidiFormatter$Builder, java.lang.Object] */
    public static BidiFormatter c() {
        ?? obj = new Object();
        boolean z2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        obj.f18660a = d;
        return z2 ? f18656h : f18655g;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = textDirectionHeuristicCompat.a(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = this.f18658b & 2;
        String str = "";
        String str2 = f18654f;
        String str3 = e;
        boolean z2 = this.f18657a;
        if (i2 != 0) {
            boolean a3 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (a2 ? TextDirectionHeuristicsCompat.f18671b : TextDirectionHeuristicsCompat.f18670a)).a(charSequence.length(), charSequence);
            spannableStringBuilder.append((CharSequence) ((z2 || !(a3 || a(charSequence) == 1)) ? (!z2 || (a3 && a(charSequence) != -1)) ? "" : str2 : str3));
        }
        if (a2 != z2) {
            spannableStringBuilder.append(a2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean a4 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (a2 ? TextDirectionHeuristicsCompat.f18671b : TextDirectionHeuristicsCompat.f18670a)).a(charSequence.length(), charSequence);
        if (!z2 && (a4 || b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!a4 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
