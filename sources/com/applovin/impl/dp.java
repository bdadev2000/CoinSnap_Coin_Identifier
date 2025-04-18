package com.applovin.impl;

import android.util.SparseArray;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface dp {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f23520a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23521b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f23522c;

        public a(String str, int i2, byte[] bArr) {
            this.f23520a = str;
            this.f23521b = i2;
            this.f23522c = bArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f23523a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23524b;

        /* renamed from: c, reason: collision with root package name */
        public final List f23525c;
        public final byte[] d;

        public b(int i2, String str, List list, byte[] bArr) {
            this.f23523a = i2;
            this.f23524b = str;
            this.f23525c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.d = bArr;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        SparseArray a();

        dp a(int i2, b bVar);
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f23526a;

        /* renamed from: b, reason: collision with root package name */
        private final int f23527b;

        /* renamed from: c, reason: collision with root package name */
        private final int f23528c;
        private int d;
        private String e;

        public d(int i2, int i3) {
            this(Integer.MIN_VALUE, i2, i3);
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i2 = this.d;
            this.d = i2 == Integer.MIN_VALUE ? this.f23527b : i2 + this.f23528c;
            this.e = this.f23526a + this.d;
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }

        public d(int i2, int i3, int i4) {
            String str;
            if (i2 != Integer.MIN_VALUE) {
                str = i2 + RemoteSettings.FORWARD_SLASH_STRING;
            } else {
                str = "";
            }
            this.f23526a = str;
            this.f23527b = i3;
            this.f23528c = i4;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }

    void a();

    void a(bh bhVar, int i2);

    void a(ho hoVar, m8 m8Var, d dVar);
}
