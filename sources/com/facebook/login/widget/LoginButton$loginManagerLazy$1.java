package com.facebook.login.widget;

import com.facebook.login.LoginManager;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class LoginButton$loginManagerLazy$1 extends r implements q0.a {
    public static final LoginButton$loginManagerLazy$1 INSTANCE = new LoginButton$loginManagerLazy$1();

    public LoginButton$loginManagerLazy$1() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final LoginManager invoke() {
        return LoginManager.Companion.getInstance();
    }
}
