package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.g5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface ma extends g5 {

    /* loaded from: classes.dex */
    public static final class a extends c {
        public a(IOException iOException, j5 j5Var) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, j5Var, 2007, 1);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends g5.a {
        @Override // com.applovin.impl.g5.a
        ma a();
    }

    /* loaded from: classes.dex */
    public static class c extends h5 {

        /* renamed from: b, reason: collision with root package name */
        public final j5 f5947b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5948c;

        public c(j5 j5Var, int i10, int i11) {
            super(a(i10, i11));
            this.f5947b = j5Var;
            this.f5948c = i11;
        }

        private static int a(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static c a(IOException iOException, j5 j5Var, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i11 == 2007) {
                return new a(iOException, j5Var);
            }
            return new c(iOException, j5Var, i11, i10);
        }

        public c(IOException iOException, j5 j5Var, int i10, int i11) {
            super(iOException, a(i10, i11));
            this.f5947b = j5Var;
            this.f5948c = i11;
        }

        public c(String str, j5 j5Var, int i10, int i11) {
            super(str, a(i10, i11));
            this.f5947b = j5Var;
            this.f5948c = i11;
        }

        public c(String str, IOException iOException, j5 j5Var, int i10, int i11) {
            super(str, iOException, a(i10, i11));
            this.f5947b = j5Var;
            this.f5948c = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends c {

        /* renamed from: d, reason: collision with root package name */
        public final String f5949d;

        public d(String str, j5 j5Var) {
            super(vd.e.e("Invalid content type: ", str), j5Var, 2003, 1);
            this.f5949d = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: d, reason: collision with root package name */
        public final int f5950d;

        /* renamed from: f, reason: collision with root package name */
        public final String f5951f;

        /* renamed from: g, reason: collision with root package name */
        public final Map f5952g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f5953h;

        public e(int i10, String str, IOException iOException, Map map, j5 j5Var, byte[] bArr) {
            super(eb.j.i("Response code: ", i10), iOException, j5Var, 2004, 1);
            this.f5950d = i10;
            this.f5951f = str;
            this.f5952g = map;
            this.f5953h = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        private final Map a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private Map f5954b;

        public synchronized Map a() {
            if (this.f5954b == null) {
                this.f5954b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.f5954b;
        }
    }
}
