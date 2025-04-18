package com.applovin.exoplayer2.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final e strategy;
    private final CharMatcher trimmer;

    /* loaded from: classes.dex */
    public class a implements e {
        final /* synthetic */ CharMatcher a;

        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0007a extends d {
            public C0007a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i10) {
                return i10 + 1;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i10) {
                return a.this.a.indexIn(this.f3415c, i10);
            }
        }

        public a(CharMatcher charMatcher) {
            this.a = charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new C0007a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class b implements e {
        final /* synthetic */ String a;

        /* loaded from: classes.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i10) {
                return b.this.a.length() + i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int b(int r6) {
                /*
                    r5 = this;
                    com.applovin.exoplayer2.common.base.Splitter$b r0 = com.applovin.exoplayer2.common.base.Splitter.b.this
                    java.lang.String r0 = r0.a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f3415c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f3415c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.applovin.exoplayer2.common.base.Splitter$b r4 = com.applovin.exoplayer2.common.base.Splitter.b.this
                    java.lang.String r4 = r4.a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Splitter.b.a.b(int):int");
            }
        }

        public b(String str) {
            this.a = str;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class c implements e {
        final /* synthetic */ int a;

        /* loaded from: classes.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i10) {
                return i10;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i10) {
                int i11 = i10 + c.this.a;
                if (i11 >= this.f3415c.length()) {
                    return -1;
                }
                return i11;
            }
        }

        public c(int i10) {
            this.a = i10;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends com.applovin.exoplayer2.common.base.b {

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f3415c;

        /* renamed from: d, reason: collision with root package name */
        final CharMatcher f3416d;

        /* renamed from: f, reason: collision with root package name */
        final boolean f3417f;

        /* renamed from: g, reason: collision with root package name */
        int f3418g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f3419h;

        public d(Splitter splitter, CharSequence charSequence) {
            this.f3416d = splitter.trimmer;
            this.f3417f = splitter.omitEmptyStrings;
            this.f3419h = splitter.limit;
            this.f3415c = charSequence;
        }

        public abstract int a(int i10);

        public abstract int b(int i10);

        @Override // com.applovin.exoplayer2.common.base.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int b3;
            int i10 = this.f3418g;
            while (true) {
                int i11 = this.f3418g;
                if (i11 != -1) {
                    b3 = b(i11);
                    if (b3 == -1) {
                        b3 = this.f3415c.length();
                        this.f3418g = -1;
                    } else {
                        this.f3418g = a(b3);
                    }
                    int i12 = this.f3418g;
                    if (i12 == i10) {
                        int i13 = i12 + 1;
                        this.f3418g = i13;
                        if (i13 > this.f3415c.length()) {
                            this.f3418g = -1;
                        }
                    } else {
                        while (i10 < b3 && this.f3416d.matches(this.f3415c.charAt(i10))) {
                            i10++;
                        }
                        while (b3 > i10 && this.f3416d.matches(this.f3415c.charAt(b3 - 1))) {
                            b3--;
                        }
                        if (!this.f3417f || i10 != b3) {
                            break;
                        }
                        i10 = this.f3418g;
                    }
                } else {
                    return (String) b();
                }
            }
            int i14 = this.f3419h;
            if (i14 == 1) {
                b3 = this.f3415c.length();
                this.f3418g = -1;
                while (b3 > i10 && this.f3416d.matches(this.f3415c.charAt(b3 - 1))) {
                    b3--;
                }
            } else {
                this.f3419h = i14 - 1;
            }
            return this.f3415c.subSequence(i10, b3).toString();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(e eVar) {
        this(eVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static Splitter fixedLength(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "The length may not be less than 1");
        return new Splitter(new c(i10));
    }

    public static Splitter on(char c10) {
        return on(CharMatcher.is(c10));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.a(this, charSequence);
    }

    public Splitter limit(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "must be greater than zero: %s", i10);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i10);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    private Splitter(e eVar, boolean z10, CharMatcher charMatcher, int i10) {
        this.strategy = eVar;
        this.omitEmptyStrings = z10;
        this.trimmer = charMatcher;
        this.limit = i10;
    }

    public static Splitter on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new a(charMatcher));
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public static Splitter on(String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new b(str));
    }
}
