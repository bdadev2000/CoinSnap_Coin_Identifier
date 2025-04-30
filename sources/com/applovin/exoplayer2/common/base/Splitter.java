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

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharMatcher f6153a;

        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0007a extends d {
            public C0007a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i9) {
                return i9 + 1;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i9) {
                return a.this.f6153a.indexIn(this.f6159c, i9);
            }
        }

        public a(CharMatcher charMatcher) {
            this.f6153a = charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new C0007a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6155a;

        /* loaded from: classes.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i9) {
                return b.this.f6155a.length() + i9;
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
                    java.lang.String r0 = r0.f6155a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f6159c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f6159c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.applovin.exoplayer2.common.base.Splitter$b r4 = com.applovin.exoplayer2.common.base.Splitter.b.this
                    java.lang.String r4 = r4.f6155a
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
            this.f6155a = str;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class c implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6157a;

        /* loaded from: classes.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i9) {
                return i9;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i9) {
                int i10 = i9 + c.this.f6157a;
                if (i10 >= this.f6159c.length()) {
                    return -1;
                }
                return i10;
            }
        }

        public c(int i9) {
            this.f6157a = i9;
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
        final CharSequence f6159c;

        /* renamed from: d, reason: collision with root package name */
        final CharMatcher f6160d;

        /* renamed from: f, reason: collision with root package name */
        final boolean f6161f;

        /* renamed from: g, reason: collision with root package name */
        int f6162g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f6163h;

        public d(Splitter splitter, CharSequence charSequence) {
            this.f6160d = splitter.trimmer;
            this.f6161f = splitter.omitEmptyStrings;
            this.f6163h = splitter.limit;
            this.f6159c = charSequence;
        }

        public abstract int a(int i9);

        public abstract int b(int i9);

        @Override // com.applovin.exoplayer2.common.base.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int b;
            int i9 = this.f6162g;
            while (true) {
                int i10 = this.f6162g;
                if (i10 != -1) {
                    b = b(i10);
                    if (b == -1) {
                        b = this.f6159c.length();
                        this.f6162g = -1;
                    } else {
                        this.f6162g = a(b);
                    }
                    int i11 = this.f6162g;
                    if (i11 == i9) {
                        int i12 = i11 + 1;
                        this.f6162g = i12;
                        if (i12 > this.f6159c.length()) {
                            this.f6162g = -1;
                        }
                    } else {
                        while (i9 < b && this.f6160d.matches(this.f6159c.charAt(i9))) {
                            i9++;
                        }
                        while (b > i9 && this.f6160d.matches(this.f6159c.charAt(b - 1))) {
                            b--;
                        }
                        if (!this.f6161f || i9 != b) {
                            break;
                        }
                        i9 = this.f6162g;
                    }
                } else {
                    return (String) b();
                }
            }
            int i13 = this.f6163h;
            if (i13 == 1) {
                b = this.f6159c.length();
                this.f6162g = -1;
                while (b > i9 && this.f6160d.matches(this.f6159c.charAt(b - 1))) {
                    b--;
                }
            } else {
                this.f6163h = i13 - 1;
            }
            return this.f6159c.subSequence(i9, b).toString();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(e eVar) {
        this(eVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static Splitter fixedLength(int i9) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "The length may not be less than 1");
        return new Splitter(new c(i9));
    }

    public static Splitter on(char c9) {
        return on(CharMatcher.is(c9));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.a(this, charSequence);
    }

    public Splitter limit(int i9) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "must be greater than zero: %s", i9);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i9);
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

    private Splitter(e eVar, boolean z8, CharMatcher charMatcher, int i9) {
        this.strategy = eVar;
        this.omitEmptyStrings = z8;
        this.trimmer = charMatcher;
        this.limit = i9;
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
