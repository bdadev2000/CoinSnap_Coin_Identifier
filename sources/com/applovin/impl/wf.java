package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class wf {

    /* loaded from: classes2.dex */
    public class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f27721a;

        public a(Comparator comparator) {
            this.f27721a = comparator;
        }

        @Override // com.applovin.impl.wf.d
        public Map b() {
            return new TreeMap(this.f27721a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Supplier, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f27722a;

        public b(int i2) {
            this.f27722a = p3.a(i2, "expectedValuesPerKey");
        }

        @Override // com.applovin.exoplayer2.common.base.Supplier
        public List get() {
            return new ArrayList(this.f27722a);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c extends wf {
        public c() {
            super(null);
        }

        public abstract fc b();
    }

    /* loaded from: classes2.dex */
    public static abstract class d {

        /* loaded from: classes2.dex */
        public class a extends c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f27723a;

            public a(int i2) {
                this.f27723a = i2;
            }

            @Override // com.applovin.impl.wf.c
            public fc b() {
                return xf.a(d.this.b(), new b(this.f27723a));
            }
        }

        public c a() {
            return a(2);
        }

        public abstract Map b();

        public c a(int i2) {
            p3.a(i2, "expectedValuesPerKey");
            return new a(i2);
        }
    }

    private wf() {
    }

    public /* synthetic */ wf(vf vfVar) {
        this();
    }

    public static d a(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new a(comparator);
    }

    public static d a() {
        return a(wg.a());
    }
}
