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
        final /* synthetic */ Comparator a;

        public a(Comparator comparator) {
            this.a = comparator;
        }

        @Override // com.applovin.impl.rf.d
        public Map b() {
            return new TreeMap(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Supplier, Serializable {
        private final int a;

        public b(int i10) {
            this.a = n3.a(i10, "expectedValuesPerKey");
        }

        @Override // com.applovin.exoplayer2.common.base.Supplier
        public List get() {
            return new ArrayList(this.a);
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
            final /* synthetic */ int a;

            public a(int i10) {
                this.a = i10;
            }

            @Override // com.applovin.impl.rf.c
            public ac b() {
                return sf.a(d.this.b(), new b(this.a));
            }
        }

        public c a() {
            return a(2);
        }

        public abstract Map b();

        public c a(int i10) {
            n3.a(i10, "expectedValuesPerKey");
            return new a(i10);
        }
    }

    private rf() {
    }

    public /* synthetic */ rf(qf qfVar) {
        this();
    }

    public static d a(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new a(comparator);
    }

    public static d a() {
        return a(tg.a());
    }
}
