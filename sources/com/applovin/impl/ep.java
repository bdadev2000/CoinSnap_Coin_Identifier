package com.applovin.impl;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface ep {

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4505b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f4506c;

        public a(String str, int i10, byte[] bArr) {
            this.a = str;
            this.f4505b = i10;
            this.f4506c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4507b;

        /* renamed from: c, reason: collision with root package name */
        public final List f4508c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f4509d;

        public b(int i10, String str, List list, byte[] bArr) {
            List unmodifiableList;
            this.a = i10;
            this.f4507b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f4508c = unmodifiableList;
            this.f4509d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray a();

        ep a(int i10, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4510b;

        /* renamed from: c, reason: collision with root package name */
        private final int f4511c;

        /* renamed from: d, reason: collision with root package name */
        private int f4512d;

        /* renamed from: e, reason: collision with root package name */
        private String f4513e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f4512d != Integer.MIN_VALUE) {
            } else {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10;
            int i11 = this.f4512d;
            if (i11 == Integer.MIN_VALUE) {
                i10 = this.f4510b;
            } else {
                i10 = i11 + this.f4511c;
            }
            this.f4512d = i10;
            this.f4513e = this.a + this.f4512d;
        }

        public String b() {
            d();
            return this.f4513e;
        }

        public int c() {
            d();
            return this.f4512d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.a = str;
            this.f4510b = i11;
            this.f4511c = i12;
            this.f4512d = Integer.MIN_VALUE;
            this.f4513e = "";
        }
    }

    void a();

    void a(io ioVar, k8 k8Var, d dVar);

    void a(yg ygVar, int i10);
}
