package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class FormError {

    /* renamed from: a, reason: collision with root package name */
    public final int f14245a;
    public final String b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i9, @RecentlyNonNull String str) {
        this.f14245a = i9;
        this.b = str;
    }

    public int getErrorCode() {
        return this.f14245a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.b;
    }
}
