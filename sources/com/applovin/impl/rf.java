package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class rf {

    /* loaded from: classes.dex */
    public class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f10491a;

        public a(Comparator comparator) {
            this.f10491a = comparator;
        }

        @Override // com.applovin.impl.rf.d
        public Map b() {
            return new TreeMap(this.f10491a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Supplier, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f10492a;

        public b(int i9) {
            this.f10492a = n3.a(i9, "expectedValuesPerKey");
        }

        @Override // com.applovin.exoplayer2.common.base.Supplier
        public List get() {
            return new ArrayList(this.f10492a);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends rf {
        public c() {
            super(null);
        }

        public abstract ac b();
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* loaded from: classes.dex */
        public class a extends c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f10493a;

            public a(int i9) {
                this.f10493a = i9;
            }

            @Override // com.applovin.impl.rf.c
            public ac b() {
                return sf.a(d.this.b(), new b(this.f10493a));
            }
        }

        public c a() {
            return a(2);
        }

        public abstract Map b();

        public c a(int i9) {
            n3.a(i9, "expectedValuesPerKey");
            return new a(i9);
        }
    }

    private rf() {
    }

    public static d a(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new a(comparator);
    }

    public /* synthetic */ rf(qf qfVar) {
        this();
    }

    public static d a() {
        return a(tg.a());
    }
}
