package com.applovin.exoplayer2.common.base;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final e strategy;
    private final CharMatcher trimmer;

    /* loaded from: classes2.dex */
    public class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharMatcher f22497a;

        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0068a extends d {
            public C0068a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i2) {
                return i2 + 1;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i2) {
                return a.this.f22497a.indexIn(this.f22503c, i2);
            }
        }

        public a(CharMatcher charMatcher) {
            this.f22497a = charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new C0068a(splitter, charSequence);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22499a;

        /* loaded from: classes2.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i2) {
                return b.this.f22499a.length() + i2;
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
                    java.lang.String r0 = r0.f22499a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f22503c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f22503c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.applovin.exoplayer2.common.base.Splitter$b r4 = com.applovin.exoplayer2.common.base.Splitter.b.this
                    java.lang.String r4 = r4.f22499a
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
            this.f22499a = str;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22501a;

        /* loaded from: classes2.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i2) {
                return i2;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i2) {
                int i3 = i2 + c.this.f22501a;
                if (i3 < this.f22503c.length()) {
                    return i3;
                }
                return -1;
            }
        }

        public c(int i2) {
            this.f22501a = i2;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class d extends com.applovin.exoplayer2.common.base.b {

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f22503c;
        final CharMatcher d;

        /* renamed from: f, reason: collision with root package name */
        final boolean f22504f;

        /* renamed from: g, reason: collision with root package name */
        int f22505g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f22506h;

        public d(Splitter splitter, CharSequence charSequence) {
            this.d = splitter.trimmer;
            this.f22504f = splitter.omitEmptyStrings;
            this.f22506h = splitter.limit;
            this.f22503c = charSequence;
        }

        public abstract int a(int i2);

        public abstract int b(int i2);

        @Override // com.applovin.exoplayer2.common.base.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int b2;
            int i2 = this.f22505g;
            while (true) {
                int i3 = this.f22505g;
                if (i3 == -1) {
                    return (String) b();
                }
                b2 = b(i3);
                if (b2 == -1) {
                    b2 = this.f22503c.length();
                    this.f22505g = -1;
                } else {
                    this.f22505g = a(b2);
                }
                int i4 = this.f22505g;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f22505g = i5;
                    if (i5 > this.f22503c.length()) {
                        this.f22505g = -1;
                    }
                } else {
                    while (i2 < b2 && this.d.matches(this.f22503c.charAt(i2))) {
                        i2++;
                    }
                    while (b2 > i2 && this.d.matches(this.f22503c.charAt(b2 - 1))) {
                        b2--;
                    }
                    if (!this.f22504f || i2 != b2) {
                        break;
                    }
                    i2 = this.f22505g;
                }
            }
            int i6 = this.f22506h;
            if (i6 == 1) {
                b2 = this.f22503c.length();
                this.f22505g = -1;
                while (b2 > i2 && this.d.matches(this.f22503c.charAt(b2 - 1))) {
                    b2--;
                }
            } else {
                this.f22506h = i6 - 1;
            }
            return this.f22503c.subSequence(i2, b2).toString();
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(e eVar) {
        this(eVar, false, CharMatcher.none(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static Splitter fixedLength(int i2) {
        Preconditions.checkArgument(i2 > 0, "The length may not be less than 1");
        return new Splitter(new c(i2));
    }

    public static Splitter on(char c2) {
        return on(CharMatcher.is(c2));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.a(this, charSequence);
    }

    public Splitter limit(int i2) {
        Preconditions.checkArgument(i2 > 0, "must be greater than zero: %s", i2);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i2);
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

    private Splitter(e eVar, boolean z2, CharMatcher charMatcher, int i2) {
        this.strategy = eVar;
        this.omitEmptyStrings = z2;
        this.trimmer = charMatcher;
        this.limit = i2;
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
