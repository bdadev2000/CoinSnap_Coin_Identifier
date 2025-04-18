package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.i5;
import com.facebook.ads.AdError;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public interface qa extends i5 {

    /* loaded from: classes2.dex */
    public static final class a extends c {
        public a(IOException iOException, l5 l5Var) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, l5Var, 2007, 1);
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends i5.a {
        @Override // com.applovin.impl.i5.a
        qa a();
    }

    /* loaded from: classes2.dex */
    public static class c extends j5 {

        /* renamed from: b, reason: collision with root package name */
        public final l5 f26161b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26162c;

        public c(l5 l5Var, int i2, int i3) {
            super(a(i2, i3));
            this.f26161b = l5Var;
            this.f26162c = i3;
        }

        private static int a(int i2, int i3) {
            return (i2 == 2000 && i3 == 1) ? AdError.INTERNAL_ERROR_CODE : i2;
        }

        public c(IOException iOException, l5 l5Var, int i2, int i3) {
            super(iOException, a(i2, i3));
            this.f26161b = l5Var;
            this.f26162c = i3;
        }

        public static c a(IOException iOException, l5 l5Var, int i2) {
            int i3;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i3 = AdError.CACHE_ERROR_CODE;
            } else if (iOException instanceof InterruptedIOException) {
                i3 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
            } else {
                i3 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
            }
            if (i3 == 2007) {
                return new a(iOException, l5Var);
            }
            return new c(iOException, l5Var, i3, i2);
        }

        public c(String str, l5 l5Var, int i2, int i3) {
            super(str, a(i2, i3));
            this.f26161b = l5Var;
            this.f26162c = i3;
        }

        public c(String str, IOException iOException, l5 l5Var, int i2, int i3) {
            super(str, iOException, a(i2, i3));
            this.f26161b = l5Var;
            this.f26162c = i3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends c {
        public final String d;

        public d(String str, l5 l5Var) {
            super(androidx.compose.ui.platform.j.b("Invalid content type: ", str), l5Var, AdError.INTERNAL_ERROR_2003, 1);
            this.d = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends c {
        public final int d;

        /* renamed from: f, reason: collision with root package name */
        public final String f26163f;

        /* renamed from: g, reason: collision with root package name */
        public final Map f26164g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f26165h;

        public e(int i2, String str, IOException iOException, Map map, l5 l5Var, byte[] bArr) {
            super(android.support.v4.media.d.i("Response code: ", i2), iOException, l5Var, AdError.INTERNAL_ERROR_2004, 1);
            this.d = i2;
            this.f26163f = str;
            this.f26164g = map;
            this.f26165h = bArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map f26166a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private Map f26167b;

        public synchronized Map a() {
            try {
                if (this.f26167b == null) {
                    this.f26167b = Collections.unmodifiableMap(new HashMap(this.f26166a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f26167b;
        }
    }
}
