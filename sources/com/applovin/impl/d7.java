package com.applovin.impl;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.applovin.impl.y5;
import com.facebook.ads.AdError;

/* loaded from: classes3.dex */
public abstract class d7 {

    /* loaded from: classes3.dex */
    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return t2.a(xp.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i2) {
        int i3 = xp.f27962a;
        if (i3 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i3 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i3 >= 18 && a.b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i3 >= 18 && a.a(exc)) {
            return 6007;
        }
        if (exc instanceof sp) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof y5.e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof zb) {
            return 6008;
        }
        if (i2 == 1) {
            return 6006;
        }
        if (i2 == 2) {
            return 6004;
        }
        if (i2 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
