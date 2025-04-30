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
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return AbstractC0744r2.a(yp.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i9) {
        int i10 = yp.f12451a;
        if (i10 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i10 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i10 >= 18 && a.b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i10 >= 18 && a.a(exc)) {
            return 6007;
        }
        if (exc instanceof tp) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof w5.e) {
            return 6003;
        }
        if (exc instanceof ub) {
            return 6008;
        }
        if (i9 == 1) {
            return 6006;
        }
        if (i9 == 2) {
            return 6004;
        }
        if (i9 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
