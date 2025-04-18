package com.applovin.impl;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.applovin.impl.w5;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public abstract class b7 {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th2) {
            return th2 instanceof NotProvisionedException;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th2) {
            return r2.a(yp.a(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i10) {
        int i11 = yp.a;
        if (i11 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i11 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i11 >= 18 && a.a(exc)) {
            return 6007;
        }
        if (exc instanceof tp) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof w5.e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof ub) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
