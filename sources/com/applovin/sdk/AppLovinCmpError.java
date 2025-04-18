package com.applovin.sdk;

/* loaded from: classes2.dex */
public interface AppLovinCmpError {

    /* loaded from: classes2.dex */
    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f28483a;

        Code(int i2) {
            this.f28483a = i2;
        }

        public int getValue() {
            return this.f28483a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
