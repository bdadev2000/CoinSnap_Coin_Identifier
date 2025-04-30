package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.g5;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

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
        public final j5 b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8898c;

        public c(j5 j5Var, int i9, int i10) {
            super(a(i9, i10));
            this.b = j5Var;
            this.f8898c = i10;
        }

        private static int a(int i9, int i10) {
            if (i9 == 2000 && i10 == 1) {
                return 2001;
            }
            return i9;
        }

        public static c a(IOException iOException, j5 j5Var, int i9) {
            int i10;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i10 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i10 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
            } else {
                i10 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i10 == 2007) {
                return new a(iOException, j5Var);
            }
            return new c(iOException, j5Var, i10, i9);
        }

        public c(IOException iOException, j5 j5Var, int i9, int i10) {
            super(iOException, a(i9, i10));
            this.b = j5Var;
            this.f8898c = i10;
        }

        public c(String str, j5 j5Var, int i9, int i10) {
            super(str, a(i9, i10));
            this.b = j5Var;
            this.f8898c = i10;
        }

        public c(String str, IOException iOException, j5 j5Var, int i9, int i10) {
            super(str, iOException, a(i9, i10));
            this.b = j5Var;
            this.f8898c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends c {

        /* renamed from: d, reason: collision with root package name */
        public final String f8899d;

        public d(String str, j5 j5Var) {
            super(AbstractC2914a.d("Invalid content type: ", str), j5Var, 2003, 1);
            this.f8899d = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: d, reason: collision with root package name */
        public final int f8900d;

        /* renamed from: f, reason: collision with root package name */
        public final String f8901f;

        /* renamed from: g, reason: collision with root package name */
        public final Map f8902g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f8903h;

        public e(int i9, String str, IOException iOException, Map map, j5 j5Var, byte[] bArr) {
            super(com.mbridge.msdk.foundation.entity.o.h(i9, "Response code: "), iOException, j5Var, 2004, 1);
            this.f8900d = i9;
            this.f8901f = str;
            this.f8902g = map;
            this.f8903h = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map f8904a = new HashMap();
        private Map b;

        public synchronized Map a() {
            try {
                if (this.b == null) {
                    this.b = Collections.unmodifiableMap(new HashMap(this.f8904a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.b;
        }
    }
}
