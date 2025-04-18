package com.applovin.exoplayer2.common.base;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* loaded from: classes.dex */
    public static final class a extends CharMatcher {
        final CharMatcher a;

        /* renamed from: b, reason: collision with root package name */
        final CharMatcher f3383b;

        public a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f3383b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.a.matches(c10) && this.f3383b.matches(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f3383b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.a + ", " + this.f3383b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends t {

        /* renamed from: b, reason: collision with root package name */
        static final int f3384b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        static final a0 f3385c = new a0();

        public a0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f3384b) == c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i10));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends t {

        /* renamed from: b, reason: collision with root package name */
        static final b f3386b = new b();

        private b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.length() == 0 ? "" : String.valueOf(c10);
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
        public boolean matches(char c10) {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
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
        public String replaceFrom(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends CharMatcher {
        private final char[] a;

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Arrays.binarySearch(this.a, c10) >= 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (char c10 : this.a) {
                bitSet.set(c10);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.a) {
                sb2.append(CharMatcher.showCharacter(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends t {

        /* renamed from: b, reason: collision with root package name */
        static final d f3387b = new d();

        public d() {
            super("CharMatcher.ascii()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 <= 127;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends CharMatcher {
        static final CharMatcher a = new e();

        private e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 == 8199) {
                    return false;
                }
                if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                    switch (c10) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c10 >= 8192 && c10 <= 8202;
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
        static final f f3388d = new f();

        private f() {
            super("CharMatcher.digit()", b(), a());
        }

        private static char[] a() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i10) + '\t');
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
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return new v(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends CharMatcher {
        private final Predicate a;

        public h(Predicate predicate) {
            this.a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.a.apply(Character.valueOf(c10));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.a + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Character ch2) {
            return this.a.apply(Preconditions.checkNotNull(ch2));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends g {
        private final char a;

        /* renamed from: b, reason: collision with root package name */
        private final char f3389b;

        public i(char c10, char c11) {
            boolean z10;
            if (c11 >= c10) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10);
            this.a = c10;
            this.f3389b = c11;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.a <= c10 && c10 <= this.f3389b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.a, this.f3389b + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.a) + "', '" + CharMatcher.showCharacter(this.f3389b) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends y {

        /* renamed from: d, reason: collision with root package name */
        static final j f3390d = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends g {
        private final char a;

        public k(char c10) {
            this.a = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.a) ? this : CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 == this.a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.a) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.a, c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.a) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends g {
        private final char a;

        /* renamed from: b, reason: collision with root package name */
        private final char f3391b;

        public l(char c10, char c11) {
            this.a = c10;
            this.f3391b = c11;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 == this.a || c10 == this.f3391b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.a);
            bitSet.set(this.f3391b);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.a) + CharMatcher.showCharacter(this.f3391b) + "\")";
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends g {
        private final char a;

        public m(char c10) {
            this.a = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.a) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 != this.a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.is(this.a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.a) ? CharMatcher.any() : this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.a);
            bitSet.set(this.a + 1, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.a) + "')";
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends CharMatcher {
        static final n a = new n();

        private n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isDigit(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends t {

        /* renamed from: b, reason: collision with root package name */
        static final o f3392b = new o();

        private o() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 <= 31 || (c10 >= 127 && c10 <= 159);
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends CharMatcher {
        static final p a = new p();

        private p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetter(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends CharMatcher {
        static final q a = new q();

        private q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends CharMatcher {
        static final r a = new r();

        private r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends CharMatcher {
        static final s a = new s();

        private s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* loaded from: classes.dex */
    public static abstract class t extends g {
        private final String a;

        public t(String str) {
            this.a = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final String toString() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class u extends CharMatcher {
        final CharMatcher a;

        public u(CharMatcher charMatcher) {
            this.a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.a.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return !this.a.matches(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.a.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.a.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return this.a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.a.setBits(bitSet2);
            bitSet2.flip(0, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.a + ".negate()";
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

        /* renamed from: b, reason: collision with root package name */
        static final w f3393b = new w();

        private w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
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
        public boolean matches(char c10) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
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
        public String replaceFrom(CharSequence charSequence, char c10) {
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
        public int indexIn(CharSequence charSequence, int i10) {
            Preconditions.checkPositionIndex(i10, charSequence.length());
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
        final CharMatcher a;

        /* renamed from: b, reason: collision with root package name */
        final CharMatcher f3394b;

        public x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f3394b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.a.matches(c10) || this.f3394b.matches(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            this.a.setBits(bitSet);
            this.f3394b.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.a + ", " + this.f3394b + ")";
        }
    }

    /* loaded from: classes.dex */
    public static class y extends CharMatcher {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f3395b;

        /* renamed from: c, reason: collision with root package name */
        private final char[] f3396c;

        public y(String str, char[] cArr, char[] cArr2) {
            boolean z10;
            boolean z11;
            boolean z12;
            this.a = str;
            this.f3395b = cArr;
            this.f3396c = cArr2;
            if (cArr.length == cArr2.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10);
            int i10 = 0;
            while (i10 < cArr.length) {
                if (cArr[i10] <= cArr2[i10]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Preconditions.checkArgument(z11);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    if (cArr2[i10] < cArr[i11]) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Preconditions.checkArgument(z12);
                }
                i10 = i11;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            int binarySearch = Arrays.binarySearch(this.f3395b, c10);
            if (binarySearch >= 0) {
                return true;
            }
            int i10 = (~binarySearch) - 1;
            if (i10 >= 0 && c10 <= this.f3396c[i10]) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends y {

        /* renamed from: d, reason: collision with root package name */
        static final z f3397d = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    public static CharMatcher any() {
        return b.f3386b;
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
        return d.f3387b;
    }

    public static CharMatcher breakingWhitespace() {
        return e.a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.f3388d;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (matches(charAt)) {
                if (!z10) {
                    sb2.append(c10);
                    z10 = true;
                }
            } else {
                sb2.append(charAt);
                z10 = false;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new h(predicate);
    }

    public static CharMatcher inRange(char c10, char c11) {
        return new i(c10, c11);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.f3390d;
    }

    public static CharMatcher is(char c10) {
        return new k(c10);
    }

    private static l isEither(char c10, char c11) {
        return new l(c10, c11);
    }

    public static CharMatcher isNot(char c10) {
        return new m(c10);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.a;
    }

    public static CharMatcher javaIsoControl() {
        return o.f3392b;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.a;
    }

    public static CharMatcher none() {
        return w.f3393b;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c10) {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.f3397d;
    }

    public static CharMatcher whitespace() {
        return a0.f3385c;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (matches(charAt)) {
                if (charAt == c10 && (i10 == length - 1 || !matches(charSequence.charAt(i10 + 1)))) {
                    i10++;
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return finishCollapseFrom(charSequence, i10 + 1, length, c10, sb2, true);
                }
            }
            i10++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (matches(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
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

    public abstract boolean matches(char c10);

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
        return indexIn(charSequence) == -1;
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
        int i10 = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    break;
                }
                charArray[indexIn - i10] = charArray[indexIn];
                indexIn++;
            }
            return new String(charArray, 0, indexIn - i10);
            i10++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c10) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c10;
        while (true) {
            indexIn++;
            if (indexIn < charArray.length) {
                if (matches(charArray[indexIn])) {
                    charArray[indexIn] = c10;
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
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (matches((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return collapseFrom(charSequence, c10);
        }
        int i13 = i12 + 1;
        return finishCollapseFrom(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!matches(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
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
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i10, length);
        while (i10 < length) {
            if (matches(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb2 = new StringBuilder(a4.j.z(length2, 3, 2, 16));
        do {
            sb2.append((CharSequence) charSequence3, i10, indexIn);
            sb2.append(charSequence2);
            i10 = indexIn + 1;
            indexIn = indexIn(charSequence3, i10);
        } while (indexIn != -1);
        sb2.append((CharSequence) charSequence3, i10, length2);
        return sb2.toString();
    }
}
