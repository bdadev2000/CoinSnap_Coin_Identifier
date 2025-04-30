package com.applovin.exoplayer2.common.base;

import Q7.n0;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* loaded from: classes.dex */
    public static final class a extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        final CharMatcher f6105a;
        final CharMatcher b;

        public a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f6105a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (this.f6105a.matches(c9) && this.b.matches(c9)) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f6105a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.f6105a + ", " + this.b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends t {
        static final int b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        static final a0 f6106c = new a0();

        public a0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c9) >>> b) == c9) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (int i9 = 0; i9 < 32; i9++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i9));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends t {
        static final b b = new b();

        private b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c9) {
            if (charSequence.length() == 0) {
                return "";
            }
            return String.valueOf(c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c9) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c9);
            return new String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i9) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i9, length);
            if (i9 == length) {
                return -1;
            }
            return i9;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i9 = 0; i9 < charSequence.length(); i9++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        private final char[] f6107a;

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f6107a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (Arrays.binarySearch(this.f6107a, c9) >= 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (char c9 : this.f6107a) {
                bitSet.set(c9);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c9 : this.f6107a) {
                sb.append(CharMatcher.showCharacter(c9));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends t {
        static final d b = new d();

        public d() {
            super("CharMatcher.ascii()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return c9 <= 127;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final CharMatcher f6108a = new e();

        private e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (c9 != ' ' && c9 != 133 && c9 != 5760) {
                if (c9 == 8199) {
                    return false;
                }
                if (c9 != 8287 && c9 != 12288 && c9 != 8232 && c9 != 8233) {
                    switch (c9) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c9 >= 8192 && c9 <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends y {

        /* renamed from: d, reason: collision with root package name */
        static final f f6109d = new f();

        private f() {
            super("CharMatcher.digit()", b(), a());
        }

        private static char[] a() {
            char[] cArr = new char[37];
            for (int i9 = 0; i9 < 37; i9++) {
                cArr[i9] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i9) + '\t');
            }
            return cArr;
        }

        private static char[] b() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g extends CharMatcher {
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return new v(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        private final Predicate f6110a;

        public h(Predicate predicate) {
            this.f6110a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return this.f6110a.apply(Character.valueOf(c9));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f6110a + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Character ch) {
            return this.f6110a.apply(Preconditions.checkNotNull(ch));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f6111a;
        private final char b;

        public i(char c9, char c10) {
            boolean z8;
            if (c10 >= c9) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkArgument(z8);
            this.f6111a = c9;
            this.b = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (this.f6111a <= c9 && c9 <= this.b) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f6111a, this.b + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.f6111a) + "', '" + CharMatcher.showCharacter(this.b) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends y {

        /* renamed from: d, reason: collision with root package name */
        static final j f6112d = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f6113a;

        public k(char c9) {
            this.f6113a = c9;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f6113a)) {
                return this;
            }
            return CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (c9 == this.f6113a) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.f6113a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            if (!charMatcher.matches(this.f6113a)) {
                return super.or(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c9) {
            return charSequence.toString().replace(this.f6113a, c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f6113a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.f6113a) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f6114a;
        private final char b;

        public l(char c9, char c10) {
            this.f6114a = c9;
            this.b = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (c9 != this.f6114a && c9 != this.b) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f6114a);
            bitSet.set(this.b);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.f6114a) + CharMatcher.showCharacter(this.b) + "\")";
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends g {

        /* renamed from: a, reason: collision with root package name */
        private final char f6115a;

        public m(char c9) {
            this.f6115a = c9;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f6115a)) {
                return super.and(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (c9 != this.f6115a) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.is(this.f6115a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f6115a)) {
                return CharMatcher.any();
            }
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.f6115a);
            bitSet.set(this.f6115a + 1, 65536);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.f6115a) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final n f6116a = new n();

        private n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return Character.isDigit(c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends t {
        static final o b = new o();

        private o() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return c9 <= 31 || (c9 >= 127 && c9 <= 159);
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final p f6117a = new p();

        private p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return Character.isLetter(c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final q f6118a = new q();

        private q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return Character.isLetterOrDigit(c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final r f6119a = new r();

        private r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return Character.isLowerCase(c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        static final s f6120a = new s();

        private s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return Character.isUpperCase(c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* loaded from: classes.dex */
    public static abstract class t extends g {

        /* renamed from: a, reason: collision with root package name */
        private final String f6121a;

        public t(String str) {
            this.f6121a = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final String toString() {
            return this.f6121a;
        }
    }

    /* loaded from: classes.dex */
    public static class u extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        final CharMatcher f6122a;

        public u(CharMatcher charMatcher) {
            this.f6122a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f6122a.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return !this.f6122a.matches(c9);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f6122a.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f6122a.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f6122a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f6122a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f6122a + ".negate()";
        }
    }

    /* loaded from: classes.dex */
    public static class v extends u {
        public v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends t {
        static final w b = new w();

        private w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c9) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c9) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i9) {
            Preconditions.checkPositionIndex(i9, charSequence.length());
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        final CharMatcher f6123a;
        final CharMatcher b;

        public x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f6123a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            if (!this.f6123a.matches(c9) && !this.b.matches(c9)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            this.f6123a.setBits(bitSet);
            this.b.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.f6123a + ", " + this.b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static class y extends CharMatcher {

        /* renamed from: a, reason: collision with root package name */
        private final String f6124a;
        private final char[] b;

        /* renamed from: c, reason: collision with root package name */
        private final char[] f6125c;

        public y(String str, char[] cArr, char[] cArr2) {
            boolean z8;
            boolean z9;
            boolean z10;
            this.f6124a = str;
            this.b = cArr;
            this.f6125c = cArr2;
            if (cArr.length == cArr2.length) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkArgument(z8);
            int i9 = 0;
            while (i9 < cArr.length) {
                if (cArr[i9] <= cArr2[i9]) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Preconditions.checkArgument(z9);
                int i10 = i9 + 1;
                if (i10 < cArr.length) {
                    if (cArr2[i9] < cArr[i10]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Preconditions.checkArgument(z10);
                }
                i9 = i10;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c9) {
            int binarySearch = Arrays.binarySearch(this.b, c9);
            if (binarySearch >= 0) {
                return true;
            }
            int i9 = (~binarySearch) - 1;
            if (i9 >= 0 && c9 <= this.f6125c[i9]) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f6124a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends y {

        /* renamed from: d, reason: collision with root package name */
        static final z f6126d = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    public static CharMatcher any() {
        return b.b;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new c(charSequence);
                }
                return isEither(charSequence.charAt(0), charSequence.charAt(1));
            }
            return is(charSequence.charAt(0));
        }
        return none();
    }

    public static CharMatcher ascii() {
        return d.b;
    }

    public static CharMatcher breakingWhitespace() {
        return e.f6108a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.f6109d;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i9, int i10, char c9, StringBuilder sb, boolean z8) {
        while (i9 < i10) {
            char charAt = charSequence.charAt(i9);
            if (matches(charAt)) {
                if (!z8) {
                    sb.append(c9);
                    z8 = true;
                }
            } else {
                sb.append(charAt);
                z8 = false;
            }
            i9++;
        }
        return sb.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        if (predicate instanceof CharMatcher) {
            return (CharMatcher) predicate;
        }
        return new h(predicate);
    }

    public static CharMatcher inRange(char c9, char c10) {
        return new i(c9, c10);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.f6112d;
    }

    public static CharMatcher is(char c9) {
        return new k(c9);
    }

    private static l isEither(char c9, char c10) {
        return new l(c9, c10);
    }

    public static CharMatcher isNot(char c9) {
        return new m(c9);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.f6116a;
    }

    public static CharMatcher javaIsoControl() {
        return o.b;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.f6117a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.f6118a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.f6119a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.f6120a;
    }

    public static CharMatcher none() {
        return w.b;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c9) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(c9 & 15);
            c9 = (char) (c9 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.f6126d;
    }

    public static CharMatcher whitespace() {
        return a0.f6106c;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c9) {
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = charSequence.charAt(i9);
            if (matches(charAt)) {
                if (charAt == c9 && (i9 == length - 1 || !matches(charSequence.charAt(i9 + 1)))) {
                    i9++;
                } else {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i9);
                    sb.append(c9);
                    return finishCollapseFrom(charSequence, i9 + 1, length, c9, sb, true);
                }
            }
            i9++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i9 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (matches(charSequence.charAt(i10))) {
                i9++;
            }
        }
        return i9;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c9);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        if (indexIn(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public CharMatcher negate() {
        return new u(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new x(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i9 = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    break;
                }
                charArray[indexIn - i9] = charArray[indexIn];
                indexIn++;
            }
            return new String(charArray, 0, indexIn - i9);
            i9++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c9) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c9;
        while (true) {
            indexIn++;
            if (indexIn < charArray.length) {
                if (matches(charArray[indexIn])) {
                    charArray[indexIn] = c9;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public void setBits(BitSet bitSet) {
        for (int i9 = 65535; i9 >= 0; i9--) {
            if (matches((char) i9)) {
                bitSet.set(i9);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c9) {
        int length = charSequence.length();
        int i9 = length - 1;
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = i9;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        if (i10 == 0 && i11 == i9) {
            return collapseFrom(charSequence, c9);
        }
        int i12 = i11 + 1;
        return finishCollapseFrom(charSequence, i10, i12, c9, new StringBuilder(i12 - i10), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length && matches(charSequence.charAt(i9))) {
            i9++;
        }
        int i10 = length - 1;
        while (i10 > i9 && matches(charSequence.charAt(i10))) {
            i10--;
        }
        return charSequence.subSequence(i9, i10 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (!matches(charSequence.charAt(i9))) {
                return charSequence.subSequence(i9, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i9, length);
        while (i9 < length) {
            if (matches(charSequence.charAt(i9))) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i9 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(n0.v(length2, 3, 2, 16));
        do {
            sb.append((CharSequence) charSequence3, i9, indexIn);
            sb.append(charSequence2);
            i9 = indexIn + 1;
            indexIn = indexIn(charSequence3, i9);
        } while (indexIn != -1);
        sb.append((CharSequence) charSequence3, i9, length2);
        return sb.toString();
    }
}
