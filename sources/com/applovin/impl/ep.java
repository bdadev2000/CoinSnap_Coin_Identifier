package com.applovin.impl;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface ep {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f7471a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7472c;

        public a(String str, int i9, byte[] bArr) {
            this.f7471a = str;
            this.b = i9;
            this.f7472c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7473a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final List f7474c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f7475d;

        public b(int i9, String str, List list, byte[] bArr) {
            List unmodifiableList;
            this.f7473a = i9;
            this.b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f7474c = unmodifiableList;
            this.f7475d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray a();

        ep a(int i9, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f7476a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7477c;

        /* renamed from: d, reason: collision with root package name */
        private int f7478d;

        /* renamed from: e, reason: collision with root package name */
        private String f7479e;

        public d(int i9, int i10) {
            this(Integer.MIN_VALUE, i9, i10);
        }

        private void d() {
            if (this.f7478d != Integer.MIN_VALUE) {
            } else {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i9;
            int i10 = this.f7478d;
            if (i10 == Integer.MIN_VALUE) {
                i9 = this.b;
            } else {
                i9 = i10 + this.f7477c;
            }
            this.f7478d = i9;
            this.f7479e = this.f7476a + this.f7478d;
        }

        public String b() {
            d();
            return this.f7479e;
        }

        public int c() {
            d();
            return this.f7478d;
        }

        public d(int i9, int i10, int i11) {
            String str;
            if (i9 != Integer.MIN_VALUE) {
                str = i9 + "/";
            } else {
                str = "";
            }
            this.f7476a = str;
            this.b = i10;
            this.f7477c = i11;
            this.f7478d = Integer.MIN_VALUE;
            this.f7479e = "";
        }
    }

    void a();

    void a(io ioVar, k8 k8Var, d dVar);

    void a(yg ygVar, int i9);
}
