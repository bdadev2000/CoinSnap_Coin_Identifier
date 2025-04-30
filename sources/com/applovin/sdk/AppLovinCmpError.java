package com.applovin.sdk;

/* loaded from: classes.dex */
public interface AppLovinCmpError {

    /* loaded from: classes.dex */
    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f12766a;

        Code(int i9) {
            this.f12766a = i9;
        }

        public int getValue() {
            return this.f12766a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
